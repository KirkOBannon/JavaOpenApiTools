package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Schema Object allows the definition of input and output data types.
 *  These types can be objects, but also primitives and arrays.
 *  This object is a superset of the
 *  <a href="https://tools.ietf.org/html/draft-bhutton-json-schema-00">JSON Schema Specification Draft 2020-12</a>.
 * <p>
 * Unless stated otherwise, the property definitions follow those of JSON Schema and do not add any additional semantics.
 *  Where JSON Schema indicates that behavior is defined by the application (e.g. for annotations),
 *  OAS also defers the definition of semantics to the application consuming the OpenAPI document.
 * <p>
 * -- Properties --
 * <p>
 * The <a href="https://tools.ietf.org/html/draft-bhutton-json-schema-00#section-4.3.3">OpenAPI Schema Dialect</a>
 *  is defined as requiring the <a href="https://swagger.io/specification/#fixed-fields-20">OAS Base Vocabulary</a>,
 *  in addition to the vocabularies as specified in the JSON Schema draft 2020-12
 *  <a href="https://tools.ietf.org/html/draft-bhutton-json-schema-00#section-8">General Purpose Meta-Schema</a>.
 * <p>
 * The OpenAPI Schema Object dialect for this version of the specification is identified by the URI
 * {@code https://spec.openapis.org/oas/3.1/dialect/base} (the "OAS dialect schema id").
 * <p>
 * The following properties are taken from the JSON Schema specification but their definitions have been extended by the OAS:
 * <ul>
 *     <li><b>description</b> - <a href="https://spec.commonmark.org/">CommonMark</a> MAY be used for rich text representation.
 *     <li><b>format</b> - See Data Type Formats for further details. While relying on JSON Schema's defined formats,
 *      the OAS offers a few additional predefined formats.</li>
 * </ul><p>
 * In addition to the JSON Schema properties comprising the OAS dialect,
 * the Schema Object supports keywords from any other vocabularies, or entirely arbitrary properties.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *  though additional properties MAY omit the {@code x-} prefix within this object.
 *
 * @see <a href="https://tools.ietf.org/html/draft-bhutton-json-schema-00">JSON Schema Core</a>
 * @see <a href="https://tools.ietf.org/html/draft-bhutton-json-schema-validation-00">JSON Schema Validation</a>
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecSchema extends SpecExtensions {
    /**
     * Adds support for polymorphism. The discriminator is an object name that is used to differentiate between
     * other schemas which may satisfy the payload description.
     * @see <a href="https://swagger.io/specification/#composition-and-inheritance-polymorphism">Composition and Inheritance</a>
     */
    private SpecDiscriminator discriminator;
    /**
     * This MAY be used only on properties schemas.
     * It has no effect on root schemas. Adds additional metadata to describe the XML representation of this property.
     */
    private SpecXml xml;
    /**
     * Additional external documentation for this schema.
     */
    private SpecExternalDocs externalDocs;
    /**
     * A free-form property to include an example of an instance for this schema.
     * To represent examples that cannot be naturally represented in JSON or YAML,
     * a string value can be used to contain the example with escaping where necessary.
     * <p>
     * <b>Deprecated</b>: This property has been deprecated in favor of the JSON Schema {@code examples} keyword.
     * Use of this field is discouraged, and later versions of this specification may remove it.
     */
    private byte[] example;
}
