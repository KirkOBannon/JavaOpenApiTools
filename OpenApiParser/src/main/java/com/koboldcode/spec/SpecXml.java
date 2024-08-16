package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A metadata object that allows for more fine-tuned XML model definitions.
 * <p>
 * When using arrays, XML element names are not inferred (for singular/plural forms) and the {@link SpecXml#name}
 *  property SHOULD be used to add that information. See examples for expected behavior.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecXml extends SpecExtensions {
    /**
     * Replaces the name of the element/attribute used for the described schema property.
     * When defined within {@code items}, it will affect the name of the individual XML elements within the list.
     * When defined alongside {@code type} being {@code array} (outside the {@code items}),
     * it will affect the wrapping element and only if {@code wrapped} is {@code true}.
     * If {@code wrapped} is {@code false}, it will be ignored.
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
     * (for example, {@code <books><book/><book/></books>}) or unwrapped ({@code <book/><book/>}).
     * Default value is {@code false}. The definition takes effect only when defined alongside
     * {@code type} being {@code array} (outside the {@code items}).
     */
    private Boolean wrapped;
}
