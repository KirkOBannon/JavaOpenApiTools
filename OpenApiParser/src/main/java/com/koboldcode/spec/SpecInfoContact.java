package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Contact information for the exposed API.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecInfoContact extends SpecExtensions {
    /**
     * The identifying name of the contact person/organization.
     */
    private String name;
    /**
     * The URL pointing to the contact information. This MUST be in the form of a URL.
     */
    private String url;
    /**
     * The email address of the contact person/organization. This MUST be in the form of an email address.
     */
    private String email;
}
