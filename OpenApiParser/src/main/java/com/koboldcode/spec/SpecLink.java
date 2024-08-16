package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * The <code>Link object</code> represents a possible design-time link for a response.
 * The presence of a link does not guarantee the caller's ability to successfully invoke it,
 * rather it provides a known relationship and traversal mechanism between responses and other operations.
 * <p>
 * Unlike <b>dynamic</b> links (i.e. links provided <b>in</b> the response payload),
 * the OAS linking mechanism does not require link information in the runtime response.
 * <p>
 * For computing links, and providing instructions to execute them, a <i>runtime expression</i> is used for
 * accessing values in an operation and using them as parameters while invoking the linked operation.
 * @see <a href="https://swagger.io/specification/#runtime-expressions">Runtime Expressions</a>
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
// TODO: This is complicated. Circle back.
//A linked operation MUST be identified using either an operationRef or operationId.
// In the case of an operationId, it MUST be unique and resolved in the scope of the OAS document.
// Because of the potential for name clashes, the operationRef syntax is preferred for OpenAPI documents with external references.
@Data @NoArgsConstructor
public class SpecLink extends SpecExtensions {
    /**
     * A relative or absolute URI reference to an OAS operation.
     * This field is mutually exclusive of the <code>operationId</code> field, and MUST point to an <i>Operation Object</i>.
     * Relative <code>operationRef</code> values MAY be used to locate an existing <i>Operation Object</i> in the OpenAPI definition.
     * See the rules for resolving <i>Relative References</i>.
     * @see <a href="https://swagger.io/specification/#operation-object">Operation Object</a>
     * @see <a href="https://swagger.io/specification/#relative-references-in-uris">Relative References</a>
     */
    private String operationRef;
    /**
     * The name of an existing, resolvable OAS operation, as defined with a unique <code>operationId</code>.
     * This field is mutually exclusive of the <code>operationRef</code> field.
     */
    private String operationId;
    /**
     * A map representing parameters to pass to an operation as specified with <code>operationId</code> or
     * identified via <code>operationRef</code>. The key is the parameter name to be used,
     * whereas the value can be a constant or an expression to be evaluated and passed to the linked operation.
     * The parameter name can be qualified using the <i>parameter location</i> <code>[{in}.]{name}</code>
     * for operations that use the same parameter name in different locations (e.g. path.id).
     * @see <a href="https://swagger.io/specification/#parameter-in">Parameter Location</a>
     */
    // TODO: {expression} support for these objects?
    private Map<String, byte[]> parameters = new HashMap<>();
    /**
     * A literal value or <i>{expression}</i> to use as a request body when calling the target operation.
     * @see <a href="https://swagger.io/specification/#runtime-expressions">Runtime Expression</a>
     */
    // TODO: {expression} support for these objects?
    private byte[] requestBody;
    /**
     * A description of the link. <i>CommonMark syntax</i> MAY be used for rich text representation.
     * @see <a href="https://spec.commonmark.org/">CommonMark</a>
     */
    private String description;
    /**
     * A server object to be used by the target operation.
     */
    private SpecServer server;
}
