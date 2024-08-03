package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A map of possible out-of band callbacks related to the parent operation. Each value in the map is a
 *  {@link SpecPath} that describes a set of requests that may be initiated by the API provider and the
 *  expected responses. The key value used to identify the path item object is an expression, evaluated at runtime,
 *  that identifies a URL to use for the callback operation.
 * <p>
 * To describe incoming requests from the API provider independent of another API call,
 *  use the {@link OpenApiDoc#webhooks} field.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecCallback extends SpecExtensions {
    // TODO
}
