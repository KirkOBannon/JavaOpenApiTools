package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Allows referencing an external resource for extended documentation.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecExternalDocs extends SpecExtensions {
    /**
     * A description of the target documentation.
     *  <a href="https://spec.commonmark.org/">CommonMark</a> MAY be used for rich text representation.
     */
    private String description;
    /**
     * <b>REQUIRED</b>. The URL for the target documentation. This MUST be in the form of a URL.
     */
    private String url;
}
