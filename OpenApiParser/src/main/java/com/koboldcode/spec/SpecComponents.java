package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Holds a set of reusable objects for different aspects of the OAS.
 *  All objects defined within the components object will have no effect on the API unless they are explicitly
 *  referenced from properties outside the components object.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecComponents extends SpecExtensions {
    /**
     * An object to hold reusable {@link SpecSchema} Objects.
     */
    private Map<String, SpecSchema> schemas;
    /**
     * An object to hold reusable {@link SpecResponse} Objects.
     */
    private Map<String, SpecResponse> responses;
    /**
     * An object to hold reusable {@link SpecParameter} Objects.
     */
    private Map<String, SpecParameter> parameters;
    /**
     * An object to hold reusable {@link SpecExample} Objects.
     */
    private Map<String, SpecExample> examples;
    /**
     * An object to hold reusable {@link SpecRequestBody} Objects.
     */
    private Map<String, SpecRequestBody> requestBodies;
    /**
     * An object to hold reusable {@link SpecHeader} Objects.
     */
    private Map<String, SpecHeader> headers;
    /**
     * An object to hold reusable {@link SpecSecurityScheme} Objects.
     */
    private Map<String, SpecSecurityScheme> securitySchemes;
    /**
     * An object to hold reusable {@link SpecLink} Objects.
     */
    private Map<String, SpecLink> links;
    /**
     * An object to hold reusable {@link SpecCallback} Objects.
     */
    private Map<String, SpecCallback> callbacks;
    /**
     * An object to hold reusable {@link SpecPath} Item Object.
     */
    private Map<String, SpecPath> pathItems;
}
