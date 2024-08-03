package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Example Objects
 * <p>
 * In all cases, the example value is expected to be compatible with the type schema of its associated value.
 * Tooling implementations MAY choose to validate compatibility automatically, and reject the example value(s) if incompatible.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecExample extends SpecExtensions {
    /**
     * Short description for the example.
     */
    private String summary;
    /**
     * Long description for the example.
     *  <a href="https://spec.commonmark.org/">CommonMark</a> MAY be used for rich text representation.
     */
    private String description;
    /**
     * Embedded literal example. This field and {@link SpecExample#externalValue} field are mutually exclusive.
     *  To represent examples of media types that cannot naturally be represented in JSON or YAML,
     *  use a string value to contain the example, escaping where necessary.
     */
    private byte[] value;
    /**
     * A URI that points to the literal example.
     *  This provides the capability to reference examples that cannot easily be included in JSON or YAML documents.
     *  The {@link SpecExample#value} field and this field are mutually exclusive.
     *  See the rules for resolving <a href="https://swagger.io/specification/#relative-references-in-uris">Relative References</a>
     */
    private String externalValue;
}
