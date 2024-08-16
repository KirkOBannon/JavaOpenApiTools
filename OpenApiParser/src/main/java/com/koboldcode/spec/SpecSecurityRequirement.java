package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * Lists the required security schemes to execute this operation.
 *  The name used for each property MUST correspond to a security scheme declared in the
 *  {@link SpecSecurityScheme} under the {@link OpenApiDoc#components} object.
 * <p>
 * Security Requirement Objects that contain multiple schemes require that all schemes MUST be satisfied
 *  for a request to be authorized. This enables support for scenarios where multiple query parameters or
 *  HTTP headers are required to convey security information.
 * <p>
 * When a list of Security Requirement Objects is defined on the {@link OpenApiDoc} or {@link SpecOperation},
 *  only one of the Security Requirement Objects in the list needs to be satisfied to authorize the request.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecSecurityRequirement extends SpecExtensions {
    /**
     * Each name MUST correspond to a security scheme which is declared in the
     * {@link SpecSecurityScheme} under the {@link OpenApiDoc#components}.
     * <p>
     * If the security scheme is of type
     *  {@code "oauth2"} or {@code "openIdConnect"}, then the value is a list of scope names required for the execution,
     *  and the list MAY be empty if authorization does not require a specified scope.
     * <p>
     * For other security scheme types, the array MAY contain a list of role names which are required for the execution,
     *  but are not otherwise defined or exchanged in-band.
     */
    private Map<String, String[]> patternedFields = new HashMap<>();
}
