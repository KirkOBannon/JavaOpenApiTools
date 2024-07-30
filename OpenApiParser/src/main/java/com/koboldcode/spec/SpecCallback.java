package com.koboldcode.spec;

/**
 * A map of possible out-of band callbacks related to the parent operation. Each value in the map is a
 * <i>Path Item Object</i> that describes a set of requests that may be initiated by the API provider and the expected responses.
 * The key value used to identify the path item object is an expression, evaluated at runtime,
 * that identifies a URL to use for the callback operation.
 * <p>
 * To describe incoming requests from the API provider independent of another API call, use the <i>webhooks</i> field.
 * @see <a href="https://swagger.io/specification/#path-item-object">Path Item Object</a>
 * @see <a href="https://swagger.io/specification/#oas-webhooks">Webhooks</a>
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class SpecCallback {
    // TODO
}
