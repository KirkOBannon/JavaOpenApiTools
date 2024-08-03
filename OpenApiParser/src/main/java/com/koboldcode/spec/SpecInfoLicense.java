package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * License information for the exposed API.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecInfoLicense extends SpecExtensions {
    /**
     * <b>REQUIRED</b>. The license name used for the API.
     */
    private String name;
    /**
     * An <a href="https://spdx.org/licenses/">SPDX License</a> expression for the API.
     * The {@code identifier} field is mutually exclusive of the {@code url} field.
     */
    private String identifier;
    /**
     * A URL to the license used for the API. This MUST be in the form of a URL.
     * The url field is mutually exclusive of the {@code identifier} field.
     */
    private String url;
}
