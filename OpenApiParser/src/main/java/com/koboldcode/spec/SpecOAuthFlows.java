package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Allows configuration of the supported OAuth Flows.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecOAuthFlows {
    /**
     * Configuration for the OAuth Implicit flow
     */
    private SpecOAuthFlow implicit;
    /**
     * Configuration for the OAuth Resource Owner Password flow
     */
    private SpecOAuthFlow password;
    /**
     * Configuration for the OAuth Client Credentials flow. Previously called <code>application</code> in OpenAPI 2.0.
     */
    private SpecOAuthFlow clientCredentials;
    /**
     * Configuration for the OAuth Authorization Code flow. Previously called <code>accessCode</code> in OpenAPI 2.0.
     */
    private SpecOAuthFlow authorizationCode;
}
