package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * Describes a single request body.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecRequestBody extends SpecExtensions {
    /**
     * A brief description of the request body. This could contain examples of use.
     *  <a href="https://spec.commonmark.org/">CommonMark</a> MAY be used for rich text representation.
     */
    private String description;
    /**
     * <b>REQUIRED.</b> The content of the request body. The key is a media type or
     *  <a href="https://tools.ietf.org/html/rfc7231#appendix--d">Media Type Ranges</a>
     *  and the value describes it. For requests that match multiple keys, only the most specific key is applicable.
     *  e.g. {@code text/plain} overrides {@code text/*}
     */
    private Map<String, SpecMediaType> content = new HashMap<>();
    /**
     * Determines if the request body is required in the request. Defaults to {@code false}.
     */
    private Boolean required = false;
}
