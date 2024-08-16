package com.koboldcode.spec;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * An object representing a Server Variable for server URL template substitution.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecServerVariable extends SpecExtensions {
    /**
     * An enumeration of string values to be used if the substitution options are from a limited set.
     * The array MUST NOT be empty.
     */
    @JsonProperty("enum")
    private List<String> enumVals; // should NOT be empty
    /**
     * <b>REQUIRED</b>. The default value to use for substitution, which SHALL be sent if an alternate value is not
     *  supplied. Note this behavior is different from the {@link SpecSchema} Object's treatment of default values,
     *  because in those cases parameter values are optional.
     *  If the {@link SpecServerVariable#enumVals} is defined, the value MUST exist in its values.
     */
    @JsonProperty("default")
    private String defaultVal;
    /**
     * An optional description for the server variable.
     *  <a href="https://spec.commonmark.org/">CommonMark</a> MAY be used for rich text representation.
     */
    private String description;
}
