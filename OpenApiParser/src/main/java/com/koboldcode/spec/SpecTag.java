package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Adds metadata to a single tag that is used by the Operation Object.
 * It is not mandatory to have a Tag Object per tag defined in the Operation Object instances.
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
@Data
@NoArgsConstructor
public class SpecTag {
    /**
     * <b>REQUIRED</b>. The name of the tag.
     */
    private String name;
    /**
     * A description for the tag. <i>CommonMark syntax</i> MAY be used for rich text representation.
     * @see <a href="https://spec.commonmark.org/">CommonMark</a>
     */
    private String description;
    /**
     * Additional external documentation for this tag.
     */
    private SpecExternalDocs externalDocs;
}
