package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * An object representing a Server.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecServer extends SpecExtensions {
    /**
     * <b>REQUIRED</b>. A URL to the target host. This URL supports Server Variables and MAY be relative,
     *  to indicate that the host location is relative to the location where the OpenAPI document is being served.
     *  Variable substitutions will be made when a variable is named in <code>{}</code> brackets.
     */
    private String url;
    /**
     * An optional string describing the host designated by the URL.
     *  <a href="https://spec.commonmark.org/">CommonMark</a> MAY be used for rich text representation.
     */
    private String description;
    /**
     * A map between a variable name and its value. The value is used for substitution in the server's URL template.
     */
    private Map<String, SpecServerVariable> variables;
}
