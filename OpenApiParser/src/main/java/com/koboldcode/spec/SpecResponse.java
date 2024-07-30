package com.koboldcode.spec;

import java.util.HashMap;
import java.util.Map;

/**
 * Describes a single response from an API Operation, including design-time, static <code>links</code> to operations based on the response.
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class SpecResponse {
    /**
     * <b>REQUIRED</b>. A description of the response. <i>CommonMark syntax</i> MAY be used for rich text representation.
     * @see <a href="https://spec.commonmark.org/">CommonMark</a>
     */
    private String description;
    /**
     * Maps a header name to its definition. <i>RFC7230</i> states header names are case-insensitive.
     * If a response header is defined with the name <code>"Content-Type"</code>, it SHALL be ignored.
     * @see <a href="https://tools.ietf.org/html/rfc7230#page-22">RFC7230</a>
     */
    private Map<String, SpecHeader> headers = new HashMap<>();
    /**
     * A map containing descriptions of potential response payloads.
     * The key is a media type or <i>media type range</i> and the value describes it.
     * For responses that match multiple keys, only the most specific key is applicable.
     * e.g. text/plain overrides text/*
     * @see <a href="https://tools.ietf.org/html/rfc7231#appendix--d">Media Type Range</a>
     */
    private Map<String, SpecMediaType> content = new HashMap<>();
    /**
     * A map of operations links that can be followed from the response.
     * The key of the map is a short name for the link,
     * following the naming constraints of the names for <i>Component Objects</i>.
     * @see <a href="https://swagger.io/specification/#components-object">Component Objects</a>
     */
    private Map<String, SpecLink> links = new HashMap<>();
}
