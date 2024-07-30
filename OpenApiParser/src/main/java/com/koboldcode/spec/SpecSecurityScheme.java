package com.koboldcode.spec;

/**
 * Defines a security scheme that can be used by the operations.
 * <p>
 * Supported schemes are HTTP authentication, an API key (either as a header, a cookie parameter or as a query parameter),
 * mutual TLS (use of a client certificate), OAuth2's common flows (implicit, password, client credentials and authorization code)
 * as defined in <i>RFC6749</i>, and <i>OpenID Connect Discovery</i>. Please note that as of 2020,
 * the implicit flow is about to be deprecated by <i>OAuth 2.0 Security Best Current Practice</i>.
 * Recommended for most use case is Authorization Code Grant flow with PKCE.
 * @see <a href="https://tools.ietf.org/html/rfc6749">RFC6749</a>
 * @see <a href="https://tools.ietf.org/html/draft-ietf-oauth-discovery-06">OpenID Connect Discovery</a>
 * @see <a href="https://tools.ietf.org/html/draft-ietf-oauth-security-topics">OAuth 2.0 Security Best Current Practice</a>
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class SpecSecurityScheme {
    /**
     * <b>REQUIRED</b>. The type of the security scheme.
     * Valid values are <code>"apiKey"</code>, <code>"http"</code>, <code>"mutualTLS"</code>, <code>"oauth2"</code>, <code>"openIdConnect"</code>.
     */
    private String type;
    /**
     * A description for security scheme. <i>CommonMark syntax</i> MAY be used for rich text representation.
     * @see <a href="https://spec.commonmark.org/">CommonMark</a>
     */
    private String description;
    /**
     * <b>REQUIRED</b>. The name of the header, query or cookie parameter to be used.
     */
    private String name;
    /**
     * <b>REQUIRED</b>. The location of the API key.
     * Valid values are <code>"query"</code>, <code>"header"</code> or <code>"cookie"</code>.
     */
    private String in;
    /**
     * REQUIRED. The name of the HTTP Authorization scheme to be used in the Authorization header as defined in <i>RFC7235</i>.
     * The values used SHOULD be registered in the <i>IANA Authentication Scheme registry.</i>
     * @see <a href="https://tools.ietf.org/html/rfc7235#section-5.1">RFC7235</a>
     * @see <a href="https://www.iana.org/assignments/http-authschemes/http-authschemes.xhtml">IANA Authentication Scheme</a>
     */
    private String scheme;
    /**
     * A hint to the client to identify how the bearer token is formatted.
     * Bearer tokens are usually generated by an authorization server,
     * so this information is primarily for documentation purposes.
     */
    private String bearerFormat;
    /**
     * <b>REQUIRED</b>. An object containing configuration information for the flow types supported.
     */
    private SpecOAuthFlows flows;
    /**
     * <b>REQUIRED</b>. OpenId Connect URL to discover OAuth2 configuration values.
     * This MUST be in the form of a URL. The OpenID Connect standard requires the use of TLS.
     */
    private String openIdConnectUrl;
}
