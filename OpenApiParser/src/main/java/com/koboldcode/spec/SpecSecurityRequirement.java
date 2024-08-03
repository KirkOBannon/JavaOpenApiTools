package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * Lists the required security schemes to execute this operation. The name used for each property MUST correspond
 * to a security scheme declared in the <i>Security Schemes</i> under the <i>Components Object</i>.
 * <p>
 * Security Requirement Objects that contain multiple schemes require that all schemes MUST be satisfied
 * for a request to be authorized. This enables support for scenarios where multiple query parameters or
 * HTTP headers are required to convey security information.
 * <p>
 * When a list of Security Requirement Objects is defined on the <i>OpenAPI Object</i> or <i>Operation Object</i>,
 * only one of the Security Requirement Objects in the list needs to be satisfied to authorize the request.
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
@Data
@NoArgsConstructor
public class SpecSecurityRequirement {
    /**
     * Each name MUST correspond to a security scheme which is declared in the
     * <i>Security Schemes</i> under the <i>Components Object</i>. If the security scheme is of type
     * <code>"oauth2"</code> or <code>"openIdConnect"</code>, then the value is a list of scope names required for the execution,
     * and the list MAY be empty if authorization does not require a specified scope.
     * For other security scheme types, the array MAY contain a list of role names which are required for the execution,
     * but are not otherwise defined or exchanged in-band.
     */
    private Map<String, String[]> patternedFields = new HashMap<>();
}
