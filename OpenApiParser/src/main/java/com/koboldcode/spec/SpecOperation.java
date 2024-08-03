package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * Describes a single API operation on a path.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecOperation extends SpecExtensions {
    /**
     * A list of tags for API documentation control.
     * Tags can be used for logical grouping of operations by resources or any other qualifier.
     */
    private List<String> tags;
    /**
     * A short summary of what the operation does.
     */
    private String summary;
    /**
     * A verbose explanation of the operation behavior.
     *  <a href="https://spec.commonmark.org/">CommonMark</a> MAY be used for rich text representation.
     */
    private String description;
    /**
     * Additional external documentation for this operation.
     */
    private SpecExternalDocs externalDocs;
    /**
     * Unique string used to identify the operation. The id MUST be unique among all operations described in the API.
     * The operationId value is <b>case-sensitive.</b>
     * Tools and libraries MAY use the operationId to uniquely identify an operation, therefore,
     * it is RECOMMENDED to follow common programming naming conventions.
     */
    private String operationId;
    /**
     * A list of parameters that are applicable for this operation.
     *  If a parameter is already defined at the {@link SpecPath} Item,
     *  the new definition will override it but can never remove it.
     *  The list MUST NOT include duplicated parameters. A unique parameter is defined by a
     *  combination of a {@link SpecParameter#name} and {@link SpecParameter#location}.
     *  The list can use the {@link SpecReference} Object to link to parameters that are defined at
     *  the OpenAPI Object's <i>components/parameters.</i>
     */
    private List<SpecParameter> parameters;
    /**
     * The request body applicable for this operation.
     *  The requestBody is fully supported in HTTP methods where the HTTP 1.1 specification
     *  <a href="https://tools.ietf.org/html/rfc7231#section-4.3.1">RFC7231</a> has explicitly defined semantics for
     *  request bodies. In other cases where the HTTP spec is vague (such as GET, HEAD and DELETE),
     *  {@code requestBody} is permitted but does not have well-defined semantics and SHOULD be avoided if possible.
     */
    private List<SpecRequestBody> requestBody;
    /**
     * The list of possible responses as they are returned from executing this operation.
     */
    private List<SpecResponses> responses;
    /**
     * A map of possible out-of band callbacks related to the parent operation.
     *  The key is a unique identifier for the Callback Object.
     *  Each value in the map is a {@link SpecCallback} Object that describes a request that may be initiated by the
     *  API provider and the expected responses.
     */
    private Map<String, SpecCallback> callbacks;
    /**
     * Declares this operation to be deprecated. Consumers SHOULD refrain from usage of the declared operation.
     *  Default value is false.
     */
    private boolean deprecated = false;
    /**
     * A declaration of which security mechanisms can be used for this operation.
     *  The list of values includes alternative security requirement objects that can be used.
     *  Only one of the security requirement objects need to be satisfied to authorize a request.
     *  To make security optional, an empty security requirement (<code>{}</code>) can be included in the array.
     *  This definition overrides any declared top-level security.
     *  To remove a top-level <i>security</i> declaration ({@link OpenApiDoc#security}), an empty array can be used.
     */
    private List<SpecSecurityRequirement> security;
    /**
     * An alternative server array to service this operation.
     *  If an alternative server object is specified at {@link SpecPath#servers} or {@link OpenApiDoc#servers},
     *  it will be <i>overridden</i> by this value.
     */
    private List<SpecServer> servers;
}
