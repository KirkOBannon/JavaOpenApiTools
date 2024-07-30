package com.koboldcode.spec;

import java.util.List;
import java.util.Map;

/**
 * Describes a single API operation on a path.
 * This object MAY be extended with <i>Specification Extensions.</i>
 * @see <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions</a>
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class SpecOperation {
    /**
     * A list of tags for API documentation control.
     * Tags can be used for logical grouping of operations by resources or any other qualifier.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private List<String> tags;
    /**
     * A short summary of what the operation does.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private String summary;
    /**
     * A verbose explanation of the operation behavior.
     * <i>CommonMark</i> syntax MAY be used for rich text representation.
     * @see <a href="https://spec.commonmark.org/">CommonMark</a>
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private String description;
    /**
     * Additional external documentation for this operation.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private SpecExtDocs externalDocs;
    /**
     * Unique string used to identify the operation. The id MUST be unique among all operations described in the API.
     * The operationId value is <b>case-sensitive.</b>
     * Tools and libraries MAY use the operationId to uniquely identify an operation, therefore,
     * it is RECOMMENDED to follow common programming naming conventions.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private String operationId;
    /**
     * A list of parameters that are applicable for this operation.
     * If a parameter is already defined at the <i>Path Item</i>, the new definition will override it but can never remove it.
     * The list MUST NOT include duplicated parameters. A unique parameter is defined by a combination of a name and location.
     * The list can use the <i>Reference Object</i> to link to parameters that are defined at the OpenAPI Object's <i>components/parameters.</i>
     * @see com.koboldcode.spec.DocPath
     * @see TODO Reference object
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private List<SpecParameter> parameters; // TODO: can be $ref
    /**
     * The request body applicable for this operation.
     * The requestBody is fully supported in HTTP methods where the HTTP 1.1 specification <i>RFC7231</i> has explicitly defined semantics for request bodies.
     * In other cases where the HTTP spec is vague (such as GET, HEAD and DELETE),
     * requestBody is permitted but does not have well-defined semantics and SHOULD be avoided if possible.
     * @see <a href="https://tools.ietf.org/html/rfc7231#section-4.3.1">RFC7231</a>
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private List<SpecRequestBody> requestBody; // TODO: can be $ref
    /**
     * The list of possible responses as they are returned from executing this operation.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private List<SpecResponses> responses;
    /**
     * A map of possible out-of band callbacks related to the parent operation.
     * The key is a unique identifier for the Callback Object.
     * Each value in the map is a <i>Callback Object</i> that describes a request that may be initiated by the API provider and the expected responses.
     * @see com.koboldcode.spec.SpecCallback
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private Map<String, SpecCallback> callbacks; // TODO: can be $ref
    /**
     * Declares this operation to be deprecated. Consumers SHOULD refrain from usage of the declared operation.
     * Default value is false.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private boolean deprecated = false;
    /**
     * A declaration of which security mechanisms can be used for this operation.
     * The list of values includes alternative security requirement objects that can be used.
     * Only one of the security requirement objects need to be satisfied to authorize a request.
     * To make security optional, an empty security requirement (<code>{}</code>) can be included in the array.
     * This definition overrides any declared top-level security.
     * To remove a top-level <i>security</i> declaration, an empty array can be used.
     * @see com.koboldcode.spec.DocSecurity
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private List<SpecSecurityRequirement> security;
    /**
     * An alternative server array to service this operation.
     * If an alternative <i>server</i> object is specified at the Path Item Object or Root level, it will be overridden by this value.
     * @see com.koboldcode.spec.DocServers
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private List<SpecServer> servers;
}
