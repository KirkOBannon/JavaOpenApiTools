package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Adds metadata to a single tag that is used by the {@link SpecOperation} Object.
 * It is not mandatory to have a Tag Object per tag defined in the Operation Object instances.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecTag extends SpecExtensions {
    /**
     * <b>REQUIRED</b>. The name of the tag.
     */
    private String name;
    /**
     * A description for the tag.
     * <a href="https://spec.commonmark.org/">CommonMark</a> MAY be used for rich text representation.
     */
    private String description;
    /**
     * Additional external documentation for this tag.
     */
    private SpecExternalDocs externalDocs;
}
