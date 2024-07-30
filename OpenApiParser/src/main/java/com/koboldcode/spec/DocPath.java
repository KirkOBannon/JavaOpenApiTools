package com.koboldcode.spec;

import java.util.List;

/**
 * Describes the operations available on a single path.
 * A Path Item MAY be empty, due to <i>ACL constraints</i>.
 * The path itself is still exposed to the documentation viewer but they will not know which operations and parameters are available.
 * @see <a href="https://swagger.io/specification/v3/#security-filtering">ACL Constraints</a>
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class DocPath {
    /**
     * Allows for an external definition of this path item.
     * The referenced structure MUST be in the format of a Path Item Object.
     * In case a {@link DocPath} Item Object field appears both in the defined object and the referenced object, the behavior is undefined.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private String ref;
    /**
     * An optional, string summary, intended to apply to all operations in this path.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private String summary;
    /**
     * An optional, string description, intended to apply to all operations in this path.
     * <i>CommonMark</i> syntax MAY be used for rich text representation.
     * @see <a href="https://spec.commonmark.org/">CommonMark</a>
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private String description;
    /**
     * A definition of a GET HTTP operation on this path.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private SpecOperation get;
    /**
     * A definition of a PUT HTTP operation on this path.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private SpecOperation put;
    /**
     * A definition of a POST HTTP operation on this path.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private SpecOperation post;
    /**
     * A definition of a DELETE HTTP operation on this path.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private SpecOperation delete;
    /**
     * A definition of a OPTIONS HTTP operation on this path.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private SpecOperation options;
    /**
     * A definition of a HEAD HTTP operation on this path.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private SpecOperation head;
    /**
     * A definition of a PATCH HTTP operation on this path.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private SpecOperation patch;
    /**
     * A definition of a TRACE HTTP operation on this path.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private SpecOperation trace;
    /**
     * An alternative server array to service all operations in this path.
     */
    private List<DocServers> servers;
    private List<Object> parameters;
}
