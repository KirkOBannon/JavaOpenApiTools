package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A metadata object that allows for more fine-tuned XML model definitions.
 * <p>
 * When using arrays, XML element names are not inferred (for singular/plural forms) and the <code>name</code> property
 * SHOULD be used to add that information. See examples for expected behavior.
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
@Data
@NoArgsConstructor
public class SpecXml {
    /**
     * Replaces the name of the element/attribute used for the described schema property.
     * When defined within <code>items</code>, it will affect the name of the individual XML elements within the list.
     * When defined alongside <code>type</code> being <code>array</code> (outside the <code>items</code>),
     * it will affect the wrapping element and only if <code>wrapped</code> is <code>true</code>.
     * If <code>wrapped</code> is <code>false</code>, it will be ignored.
     */
    private String name;
    /**
     * The URI of the namespace definition. This MUST be in the form of an absolute URI.
     */
    private String namespace;
    /**
     * The prefix to be used for the name.
     */
    private String prefix;
    /**
     * Declares whether the property definition translates to an attribute instead of an element. Default value is <code>false</code>.
     */
    private Boolean attribute = false;
    /**
     * MAY be used only for an array definition. Signifies whether the array is wrapped
     * (for example, <code>&lt;books&gt;&lt;book/&gt;&lt;book/&gt;&lt;/books&gt;</code>) or unwrapped (<code>&lt;book/&gt;&lt;book/&gt;</code>).
     * Default value is <code>false</code>. The definition takes effect only when defined alongside
     * <code>type</code> being <code>array</code> (outside the <code>items</code>).
     */
    private Boolean wrapped;
}
