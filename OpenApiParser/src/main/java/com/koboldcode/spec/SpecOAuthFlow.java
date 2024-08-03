package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * Configuration details for a supported OAuth Flow
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecOAuthFlow extends SpecExtensions {
    /**
     * <b>REQUIRED</b>. The authorization URL to be used for this flow.
     *  This MUST be in the form of a URL. The OAuth2 standard requires the use of TLS.
     * <p>
     * This field ONLY applies to {@link SpecOAuthFlows#implicit} and {@link SpecOAuthFlows#authorizationCode}
     */
    private String authorizationUrl;
    /**
     * <b>REQUIRED</b>. The token URL to be used for this flow.
     *  This MUST be in the form of a URL. The OAuth2 standard requires the use of TLS.
     * <p>
     * This field ONLY applies to {@link SpecOAuthFlows#password}, {@link SpecOAuthFlows#clientCredentials},
     *  and {@link SpecOAuthFlows#authorizationCode}
     */
    private String tokenUrl;
    /**
     * The URL to be used for obtaining refresh tokens.
     *  This MUST be in the form of a URL. The OAuth2 standard requires the use of TLS.
     * <p>
     * This field applies to all flows in {@link SpecOAuthFlows}.
     */
    private String refreshUrl;
    /**
     * <b>REQUIRED</b>. The available scopes for the OAuth2 security scheme.
     * A map between the scope name and a short description for it. The map MAY be empty.
     * <p>
     * This field applies to all flows in {@link SpecOAuthFlows}.
     */
    private Map<String, String> scopes = new HashMap<>();
}
