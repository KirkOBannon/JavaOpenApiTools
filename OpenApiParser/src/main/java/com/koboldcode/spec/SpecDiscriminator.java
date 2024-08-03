package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * When request bodies or response payloads may be one of a number of different schemas,
 *  a {@code discriminator} object can be used to aid in serialization, deserialization, and validation.
 *  The discriminator is a specific object in a schema which is used to inform the consumer of the document
 *  of an alternative schema based on the value associated with it.
 * <p>
 * When using the discriminator, <i>inline</i> schemas will not be considered.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecDiscriminator extends SpecExtensions {
    /**
     * <b>REQUIRED</b>. The name of the property in the payload that will hold the discriminator value.
     */
    private String propertyName;
    /**
     *  An object to hold mappings between payload values and schema names or references.
     */
    private Map<String, String> mapping = new HashMap<>();
}
