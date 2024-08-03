package com.koboldcode.spec;

import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * This is the root document object of the OpenAPI document.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class OpenApiDoc extends SpecExtensions {
    /**
     * <b>REQUIRED</b>. Describes the version number used to parse the Open Api document.
     * <p>
     * This string MUST be the <a href="https://semver.org/spec/v2.0.0.html">Semantic Version Number</a>
     *  of the <a href="https://swagger.io/specification/v3/#versions">OpenAPI Specification version</a>
     *  that the OpenAPI document uses.
     *  This field SHOULD be used by tooling specifications and clients to interpret the OpenAPI document.
     *  This is not related to the API {@link SpecInfo#version} string.
    **/
    private String openapi;
    /**
     * <b>REQUIRED</b>. Provides metadata about the API. The metadata MAY be used by tooling as required.
     */
    private SpecInfo info;
    /**
     * The default value for the {@code $schema} keyword within {@link SpecSchema} objects
     *  contained within this OAS document. This MUST be in the form of a URI.
     */
    private String jsonSchemaDialect;
    /**
     * Contains details for where this API is hosted.
     * <p>
     * An array of Server Objects, which provide connectivity information to a target server.
     *  If this property is not provided, or is an empty array,
     *  the default value would be a {@link SpecServer} with a value of '{@code /}'.
     */
    private List<SpecServer> servers;
    /**
     * The available paths and operations for the API.
     */
    private SpecPaths paths;
    /**
     * The incoming webhooks that MAY be received as part of this API and that the API consumer MAY choose to implement.
     *  Closely related to the {@link SpecCallback} feature, this section describes requests initiated other than by
     *  an API call, for example by an out-of-band registration. The key name is a unique string to refer to each
     *  webhook, while the (optionally referenced) {@link SpecPath} Item Object describes a request that may be
     *  initiated by the API provider and the expected responses.
     */
    private Map<String, SpecPath> webhooks;
    /**
     * An element to hold various schemas for the document.
     */
    private SpecComponents components;
    /**
     * A declaration of which security mechanisms can be used across the API.
     * The list of values includes alternative security requirement objects that can be used.
     * Only one of the security requirement objects need to be satisfied to authorize a request.
     * Individual operations can override this definition. To make security optional,
     * an empty security requirement (<code>{}</code>) can be included in the array.
     */
    private List<SpecSecurityRequirement> security;
    /**
     * A list of tags used by the document with additional metadata.
     * The order of the tags can be used to reflect on their order by the parsing tools.
     * Not all tags that are used by the {@link SpecOperation} must be declared.
     * The tags that are not declared MAY be organized randomly or based on the tools' logic.
     * Each tag name in the list MUST be unique.
     */
    private List<SpecTag> tags;
    /**
     * Additional external documentation.
     */
    private SpecExternalDocs externalDocs;
}
