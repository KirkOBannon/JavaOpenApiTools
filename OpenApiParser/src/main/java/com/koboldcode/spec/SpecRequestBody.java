package com.koboldcode.spec;

import java.util.HashMap;
import java.util.Map;

/**
 * Describes a single request body.
 * <p>
 * This object MAY be extended with <i>Specification Extensions.</i>
 * @see <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions</a>
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class SpecRequestBody {
    /**
     * A brief description of the request body. This could contain examples of use.
     * <i>CommonMark syntax</i> MAY be used for rich text representation.
     * @see <a href="https://spec.commonmark.org/">CommonMark syntax</a>
     */
    private String description;
    /**
     * <b>REQUIRED.</b> The content of the request body. The key is a media type or <i>media type range</i> and the value describes it.
     * For requests that match multiple keys, only the most specific key is applicable.
     * e.g. text/plain overrides text/*
     * @see <a href="https://tools.ietf.org/html/rfc7231#appendix--d">Media Type Ranges</a>
     */
    private Map<String, SpecMediaType> content = new HashMap<>();
    /**
     * Determines if the request body is required in the request. Defaults to <code>false</code>.
     */
    private Boolean required;
}
