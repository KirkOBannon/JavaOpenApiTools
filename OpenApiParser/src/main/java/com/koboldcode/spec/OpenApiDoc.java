package com.koboldcode.spec;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

/**
 * This is the root document object of the OpenAPI document.
 * @see <a href="https://swagger.io/specification/v3/#openapi-document">OpenAPI Definitions</a>
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
@Data @Builder
public class OpenApiDoc {
    /**
     * <b>REQUIRED</b>. Describes the version number used to parse the Open Api document. <p>
     * This string MUST be the <i>semantic version number</i> of the <i>OpenAPI Specification version</i> that the OpenAPI document uses.
     * This field SHOULD be used by tooling specifications and clients to interpret the OpenAPI document.
     * This is not related to the API {@code info.version} string.
     * @see <a href="https://semver.org/spec/v2.0.0.html">Semantic Version Number</a>
     * @see <a href="https://swagger.io/specification/v3/#versions">OpenAPI Specification version</a>
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
    **/
    @NonNull
    private String openapi;
    /**
     * <b>REQUIRED</b>. Provides metadata about the API. The metadata MAY be used by tooling as required.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    @NonNull
    private DocInfo info;
    /**
     * Contains details for where this API is hosted. <p>
     * An array of Server Objects, which provide connectivity information to a target server.
     * If this property is not provided, or is an empty array, the default value would be a {@link DocServers} with a {@code url} value of {@code /}.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private List<DocServers> servers;
    /**
     * <b>REQUIRED</b>. The available paths and operations for the API.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    @NonNull
    private DocPaths paths;
    /**
     *
     */
    private DocComponents components;
    private DocSecurity security;
    private DocTags tags;
    private DocExternalDocs externalDocs;

    public static void main(String[]args) {
        var a = new OpenApiDoc.OpenApiDocBuilder().build();
        a.getOpenapi();
    }
}
