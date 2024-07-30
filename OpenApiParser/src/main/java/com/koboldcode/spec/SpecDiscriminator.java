package com.koboldcode.spec;

import java.util.HashMap;
import java.util.Map;

/**
 * When request bodies or response payloads may be one of a number of different schemas,
 * a discriminator object can be used to aid in serialization, deserialization, and validation.
 * The discriminator is a specific object in a schema which is used to inform the consumer of the document
 * of an alternative schema based on the value associated with it.
 * <p>
 * When using the discriminator, inline schemas will not be considered.
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class SpecDiscriminator {
    /**
     * <b>REQUIRED</b>. The name of the property in the payload that will hold the discriminator value.
     */
    private String propertyName;
    /**
     *  An object to hold mappings between payload values and schema names or references.
     */
    private Map<String, String> mapping = new HashMap<>();
}
