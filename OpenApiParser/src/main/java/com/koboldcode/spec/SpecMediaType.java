package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * Each Media Type Object provides schema and examples for the media type identified by its key.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecMediaType extends SpecExtensions {
    /**
     * The schema defining the content of the request, response, or parameter.
     */
    private SpecSchema schema;
    /**
     * Example of the media type. The example object SHOULD be in the correct format as specified by the media type.
     * This field is mutually exclusive of the {@link SpecMediaType#examples} field.
     * Furthermore, if referencing a {@link SpecMediaType#schema} which contains an {@link SpecSchema#example},
     * this value SHALL <i>override</i> the example provided by the referenced schema.
     */
    private byte[] example;
    /**
     * Examples of the media type. Each example object SHOULD match the media type and specified schema if present.
     * This field is mutually exclusive of the {@link SpecMediaType#example} field.
     * Furthermore, if referencing a schema which contains an {@link SpecSchema#example},
     * this value SHALL <i>override</i> the example provided by the referenced schema.
     */
    private Map<String, SpecRefOrVal<byte[]>> examples = new HashMap<>();
    /**
     * A map between a property name and its encoding information.
     * The key, being the property name, MUST exist in the schema as a property.
     * The encoding object SHALL only apply to {@link SpecRequestBody} objects
     * when the media type is {@code multipart} or {@code application/x-www-form-urlencoded}.
     */
    private Map<String, SpecEncoding> encoding = new HashMap<>();
}
