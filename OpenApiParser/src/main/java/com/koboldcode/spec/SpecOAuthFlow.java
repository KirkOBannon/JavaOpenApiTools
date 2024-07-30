package com.koboldcode.spec;

import java.util.HashMap;
import java.util.Map;

/**
 * Configuration details for a supported OAuth Flow
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class SpecOAuthFlow {
    /**
     * <b>REQUIRED</b>. The authorization URL to be used for this flow.
     * This MUST be in the form of a URL. The OAuth2 standard requires the use of TLS.
     */
    private String authorizationUrl;
    /**
     * <b>REQUIRED</b>. The token URL to be used for this flow.
     * This MUST be in the form of a URL. The OAuth2 standard requires the use of TLS.
     */
    private String tokenUrl;
    /**
     * The URL to be used for obtaining refresh tokens.
     * This MUST be in the form of a URL. The OAuth2 standard requires the use of TLS.
     */
    private String refreshUrl;
    /**
     * <b>REQUIRED</b>. The available scopes for the OAuth2 security scheme.
     * A map between the scope name and a short description for it. The map MAY be empty.
     */
    private Map<String, String> scopes = new HashMap<>();
}
