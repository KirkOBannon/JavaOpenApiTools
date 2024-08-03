package com.koboldcode.spec;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * An object representing a Server Variable for server URL template substitution.
 * @author Kirk O'Bannon modified, base description from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecServerVars {
    /**
     * An enumeration of string values to be used if the substitution options are from a limited set.
     * The array MUST NOT be empty.
     */
    @JsonProperty("enum")
    private List<String> enumVals; // should NOT be empty
    /**
     * <b>REQUIRED</b>. The default value to use for substitution, which SHALL be sent if an alternate value is not supplied.
     * Note this behavior is different from the <i>Schema Object's</i> treatment of default values,
     * because in those cases parameter values are optional.
     * If the <i>enum</i> is defined, the value MUST exist in the enum's values.
     */
    @JsonProperty("default")
    private String defaultVal;
    /**
     * An optional description for the server variable. <i>CommonMark syntax</i> MAY be used for rich text representation.
     * @see <a href="https://spec.commonmark.org/">CommonMark</a>
     */
    private String description;
}
