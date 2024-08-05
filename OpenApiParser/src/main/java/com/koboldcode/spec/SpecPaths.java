package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * Holds the relative paths to the individual endpoints and their operations.
 *  The path is appended to the URL from the {@link SpecServer} object in order to construct the full URL.
 *  The Paths MAY be empty, due to <a href="https://swagger.io/specification/v3/#security-filtering">ACL constraints</a>
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecPaths extends SpecExtensions {
    /**
     * A relative path to an individual endpoint.
     *  The field name MUST begin with a forward slash (/).
     *  The path is appended (no relative URL resolution) to the expanded URL from the {@link SpecServer#url}
     *  in order to construct the full URL.
     *  <a href="https://swagger.io/specification/#path-templating">Path templating</a> is allowed.
     *  When matching URLs, concrete (non-templated) paths would be matched before their templated counterparts.
     *  Templated paths with the same hierarchy but different templated names MUST NOT exist as they are identical.
     *  In case of ambiguous matching, it's up to the tooling to decide which one to use.
     */
    Map<String, SpecPath> paths = new HashMap<>();
}
