package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The object provides metadata about the API. The metadata MAY be used by the clients if needed,
 * and MAY be presented in editing or documentation generation tools for convenience.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecInfo extends SpecExtensions {
    /**
     * <b>REQUIRED</b>. The title of the API.
     */
    private String title;
    /**
     * A short summary of the API.
     */
    private String summary;
    /**
     * A description of the API.
     *  <a href="https://spec.commonmark.org/">CommonMark</a> MAY be used for rich text representation.
     */
    private String description;
    /**
     * A URL to the Terms of Service for the API. This MUST be in the form of a URL.
     */
    private String termsOfService;
    /**
     * The contact information for the exposed API.
     */
    private SpecInfoContact contact;
    /**
     * The license information for the exposed API.
     */
    private SpecInfoLicense license;
    /**
     * <b>REQUIRED</b>. The version of the OpenAPI document (which is distinct from the
     *  <a href="https://swagger.io/specification/#oas-version">OpenApi Specification Version</a>
     *  or the API implementation version).
     */
    private String version;
}
