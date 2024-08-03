package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * While the OpenAPI Specification tries to accommodate most use cases, additional data can be added to extend the specification at certain points.
 * <p>
 * The extensions properties are implemented as patterned fields that are always prefixed by {@code "x-"}.
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecExtensions {
    /**
     * Allows extensions to the OpenAPI Schema. The field name MUST begin with {@code x-},
     *  for example, {@code x-internal-id}.
     *  Field names beginning {@code x-oai-} and {@code x-oas-} are reserved for uses defined by the OpenAPI Initiative.
     *  The value can be {@code null}, a primitive, an array or an object.
     */
    private Map<String,byte[]> extensionFields = new HashMap<>();
}
