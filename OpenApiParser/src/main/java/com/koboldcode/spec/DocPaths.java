package com.koboldcode.spec;

import java.util.HashMap;

/**
 * Holds the relative paths to the individual endpoints and their operations.
 * The path is appended to the URL from the {@link DocServers} object in order to construct the full URL.
 * The Paths MAY be empty, due to <i>ACL constraints</i>.
 * @see <a href="https://swagger.io/specification/v3/#security-filtering">ACL constraints</a>
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class DocPaths extends HashMap<String, DocPath> {
    // TODO: Javadoc and update regarding the put and get functions
    // A relative path to an individual endpoint.
    // The field name MUST begin with a forward slash (/).
    // The path is appended (no relative URL resolution) to the expanded URL from the Server Object's url field in order to construct the full URL.
    // Path templating is allowed.
    // When matching URLs, concrete (non-templated) paths would be matched before their templated counterparts.
    // Templated paths with the same hierarchy but different templated names MUST NOT exist as they are identical.
    // In case of ambiguous matching, it's up to the tooling to decide which one to use.
}
