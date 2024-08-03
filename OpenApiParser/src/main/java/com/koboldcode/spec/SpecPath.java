package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Describes the operations available on a single path.
 * A Path Item MAY be empty, due to <i>ACL constraints</i>.
 * The path itself is still exposed to the documentation viewer but they will not know which operations and parameters are available.
 * @see <a href="https://swagger.io/specification/v3/#security-filtering">ACL Constraints</a>
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
@Data
@NoArgsConstructor
public class SpecPath {
    /**
     * Allows for an external definition of this path item.
     * The referenced structure MUST be in the format of a Path Item Object.
     * In case a {@link SpecPath} Item Object field appears both in the defined object and the referenced object, the behavior is undefined.
     */
    private String ref;
    /**
     * An optional, string summary, intended to apply to all operations in this path.
     */
    private String summary;
    /**
     * An optional, string description, intended to apply to all operations in this path.
     * <i>CommonMark</i> syntax MAY be used for rich text representation.
     * @see <a href="https://spec.commonmark.org/">CommonMark</a>
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
     * An alternative server array to service all operations in this path.
     */
    private List<SpecServer> servers;
    /**
     * A list of parameters that are applicable for all the operations described under this path.
     * These parameters can be overridden at the operation level, but cannot be removed there.
     * The list MUST NOT include duplicated parameters.
     * A unique parameter is defined by a combination of a <i>name</i> and <i>location</i>.
     * The list can use the <i>Reference Object</i> to link to parameters that are defined at the
     * <i>OpenAPI Object's components/parameters</i>.
     */
    private List<SpecParameter> parameters;
}
