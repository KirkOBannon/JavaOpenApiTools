package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * Describes a single response from an API Operation,
 *  including design-time, static {@code links} to operations based on the response.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecResponse extends SpecExtensions {
    /**
     * <b>REQUIRED</b>. A description of the response.
     *  <a href="https://spec.commonmark.org/">CommonMark</a> MAY be used for rich text representation.
     */
    private String description;
    /**
     * Maps a header name to its definition. <a href="https://tools.ietf.org/html/rfc7230#page-22">RFC7230</a>
     *  states header names are case-insensitive. If a response header is defined with the name
     *  {@code "Content-Type"}, it SHALL be ignored.
     */
    private Map<String, SpecHeader> headers = new HashMap<>();
    /**
     * A map containing descriptions of potential response payloads.
     *  The key is a media type or <a href="https://tools.ietf.org/html/rfc7231#appendix--d">Media Type Range</a>
     *  and the value describes it. For responses that match multiple keys, only the most specific key is applicable.
     *  e.g. {@code text/plain} overrides {@code text/*}
     *  @see
     */
    private Map<String, SpecMediaType> content = new HashMap<>();
    /**
     * A map of operations links that can be followed from the response.
     *  The key of the map is a short name for the link,
     *  following the naming constraints of the names for {@link SpecComponents}.
     */
    private Map<String, SpecLink> links = new HashMap<>();
}
