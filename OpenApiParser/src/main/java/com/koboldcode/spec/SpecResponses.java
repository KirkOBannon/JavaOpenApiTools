package com.koboldcode.spec;

import java.util.HashMap;
import java.util.Map;

/**
 * A container for the expected responses of an operation. The container maps a HTTP response code to the expected response.
 * <p>
 * The documentation is not necessarily expected to cover all possible HTTP response codes because they may not be known in advance. However, documentation is expected to cover a successful operation response and any known errors.
 * <p>
 * The <code>default</code> MAY be used as a default response object for all HTTP codes that are not covered individually by the Responses Object.
 * <p>
 * The Responses Object MUST contain at least one response code, and if only one response code is provided it SHOULD be the response for a successful operation call.
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class SpecResponses {
    /**
     * The documentation of responses other than the ones declared for specific HTTP response codes.
     * Use this field to cover undeclared responses.
     */
    // TODO: Json Parse
    public SpecResponse _default;
    /**
     * Patterned Fields
     * Any HTTP status code can be used as the property name, but only one property per code, to describe the expected response for that HTTP status code.
     * This field MUST be enclosed in quotation marks (for example, "200") for compatibility between JSON and YAML.
     * To define a range of response codes, this field MAY contain the uppercase wildcard character <code>X</code>.
     * <p>
     * For example, <code>2XX</code> represents all response codes between <code>[200-299]</code>.
     * Only the following range definitions are allowed: <code>1XX</code>, <code>2XX</code>, <code>3XX</code>, <code>4XX</code>, and <code>5XX</code>.
     * <p>
     * If a response is defined using an explicit code, the explicit code definition takes precedence over the range definition for that code.
     */
    public Map<String, SpecResponse> responseCodeMap = new HashMap<>();
}
