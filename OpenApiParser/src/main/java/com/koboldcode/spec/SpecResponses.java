package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * A container for the expected responses of an operation.
 *  The container maps an HTTP response code to the expected response.
 * <p>
 * The documentation is not necessarily expected to cover all possible HTTP response codes because they may not be known
 *  in advance. However, documentation is expected to cover a successful operation response and any known errors.
 * <p>
 * The {@link SpecResponses#_default} MAY be used as a default response object for all HTTP codes that are not covered
 *  individually by the Responses Object.
 * <p>
 * The {@link SpecResponses#responseCodeMap} Object MUST contain at least one response code,
 *  and if only one response code is provided it SHOULD be the response for a successful operation call.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecResponses extends SpecExtensions {
    /**
     * The documentation of responses other than the ones declared for specific HTTP response codes.
     * Use this field to cover undeclared responses.
     */
    public SpecResponse _default;
    /**
     * This map contains Patterned Fields.
     * <p>
     * Any HTTP status code can be used as the property name, but only one property per code,
     *  to describe the expected response for that HTTP status code.
     * <p>
     * This field MUST be enclosed in quotation marks (for example, "200") for compatibility between JSON and YAML.
     * To define a range of response codes, this field MAY contain the uppercase wildcard character {@code X}.
     * <p>
     * For example, {@code 2XX} represents all response codes between {@code [200-299]}.
     *  Only the following range definitions are allowed:
     *  {@code 1XX}, {@code 2XX}, {@code 3XX}, {@code 4XX}, and {@code 5XX}.
     * <p>
     * If a response is defined using an explicit code,
     *  the explicit code definition takes precedence over the range definition for that code.
     */
    public Map<String, SpecResponse> responseCodeMap = new HashMap<>();
}
