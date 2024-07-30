package com.koboldcode.spec;

/**
 * Allows configuration of the supported OAuth Flows.
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
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
