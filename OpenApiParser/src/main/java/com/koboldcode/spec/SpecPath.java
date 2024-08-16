package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Describes the operations available on a single path.
 *  A Path Item MAY be empty, due to <a href="https://swagger.io/specification/v3/#security-filtering">ACL Constraints</a>
 *  The path itself is still exposed to the documentation viewer,
 *  but they will not know which operations and parameters are available.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecPath extends SpecExtensions {
    /**
     * Allows for an external definition of this path item.
     *  The referenced structure MUST be in the format of a {@link SpecPath} Object (this class).
     *  In case a {@link SpecPath} Item Object field appears both in the defined object and the referenced object,
     *  the behavior is undefined.
     *
     * @see <a href="https://swagger.io/specification/#relative-references-in-uris">Rules for resolving Relative References</a>
     */
    private String ref;
    /**
     * An optional, string summary, intended to apply to all operations in this path.
     */
    private String summary;
    /**
     * An optional, string description, intended to apply to all operations in this path.
     *  <a href="https://spec.commonmark.org/">CommonMark</a> syntax MAY be used for rich text representation.
     */
    private String description;
    /**
     * A definition of a GET HTTP operation on this path.
     */
    private SpecOperation get;
    /**
     * A definition of a PUT HTTP operation on this path.
     */
    private SpecOperation put;
    /**
     * A definition of a POST HTTP operation on this path.
     */
    private SpecOperation post;
    /**
     * A definition of a DELETE HTTP operation on this path.
     */
    private SpecOperation delete;
    /**
     * A definition of a OPTIONS HTTP operation on this path.
     */
    private SpecOperation options;
    /**
     * A definition of a HEAD HTTP operation on this path.
     */
    private SpecOperation head;
    /**
     * A definition of a PATCH HTTP operation on this path.
     */
    private SpecOperation patch;
    /**
     * A definition of a TRACE HTTP operation on this path.
     */
    private SpecOperation trace;
    /**
     * An alternative {@code server} array to service all operations in this path.
     */
    private List<SpecServer> servers;
    /**
     * A list of parameters that are applicable for all the operations described under this path.
     *  These parameters can be overridden at the operation level, but cannot be removed there.
     *  The list MUST NOT include duplicated parameters.
     *  A unique parameter is defined by a combination of a {@link SpecParameter#name} and {@link SpecParameter#location}
     *  The list can use the <a href="https://swagger.io/specification/#reference-object">Reference Object</a>
     *  to link to parameters that are defined at the
     *  <a href="https://swagger.io/specification/#components-parameters">OpenAPI Object's components/parameters</a>.
     */
    private List<SpecRefOrVal<SpecParameter>> parameters;
}
