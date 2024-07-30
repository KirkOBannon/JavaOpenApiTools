package com.koboldcode.spec;

import java.util.HashMap;
import java.util.Map;

/**
 * Each Media Type Object provides schema and examples for the media type identified by its key.
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
// TODO: Include the considerations for multipart, file uploads, etc.
public class SpecMediaType {
    /**
     * The schema defining the content of the request, response, or parameter.
     */
    private SpecSchema schema;
    /**
     * Example of the media type. The example object SHOULD be in the correct format as specified by the media type.
     * The <code>example</code> field is mutually exclusive of the <code>examples</code> field.
     * Furthermore, if referencing a schema which contains an <code>example</code>,
     * the example value SHALL <i>override</i> the example provided by the schema.
     */
    private byte[] example;
    /**
     * Examples of the media type. Each example object SHOULD match the media type and specified schema if present.
     * The <code>examples</code> field is mutually exclusive of the <code>example</code> field.
     * Furthermore, if referencing a schema which contains an <code>example</code>,
     * the <code>examples</code> value SHALL <i>override</i> the example provided by the schema.
     */
    // TODO:
    private Map<String, byte[]> examples = new HashMap<>();
    /**
     * A map between a property name and its encoding information.
     * The key, being the property name, MUST exist in the schema as a property.
     * The encoding object SHALL only apply to <code>requestBody</code> objects
     * when the media type is <code>multipart</code> or <code>application/x-www-form-urlencoded</code>.
     */
    // TODO :
    private Map<String, byte[]> encoding = new HashMap<>();
}
