package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * A single encoding definition applied to a single schema property.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecEncoding extends SpecExtensions {
    /**
     * The Content-Type for encoding a specific property. The value can be a specific media type
     *  (e.g. {@code application/json}), a wildcard media type (e.g. {@code image/*}),
     *  or a comma-separated list of the two types.
     *  Default value depends on the property type:
     * <li> for {@code object}, default value is {@code application/json}
     * <li> for {@code array}, the default is defined based on the inner type
     * <li> for all other cases the default is {@code application/octet-stream}.
     */
    private String contentType;
    /**
     * A map allowing additional information to be provided as headers, for example {@code Content-Disposition}.
     *  {@code Content-Type} is described separately and SHALL be ignored in this section.
     *  This property SHALL be ignored if the request body media type is not a {@code multipart}
     */
    private Map<String, SpecRefOrVal<SpecHeader>> headers = new HashMap<>();
    /**
     * Describes how a specific property value will be serialized depending on its type.
     *  See {@link SpecParameter} object for details on this property.
     *  The behavior follows the same values as query parameters, including default values.
     *  This property SHALL be ignored if the request body media type is not
     *  {@code application/x-www-form-urlencoded} or {@code multipart/form-data}.
     *  If a value is explicitly defined, then the value of {@link SpecEncoding#contentType}
     *  (implicit or explicit) SHALL be ignored.
     */
    private String style;
    /**
     * When this is true, property values of type {@code array} or {@code object} generate separate parameters for each
     *  value of the array, or key-value-pair of the map. For other types of properties this property has no effect.
     *  When {@link SpecEncoding#style} is {@code form}, the default value is {@code true}.
     *  For all other styles, the default value is {@code false}.
     *  This property SHALL be ignored if the request body media type is not
     *  {@code application/x-www-form-urlencoded} or {@code multipart/form-data}.
     *  If a value is explicitly defined, then the value of {@link SpecEncoding#contentType}
     *  (implicit or explicit) SHALL be ignored.
     */
    private Boolean explode;
    /**
     * Determines whether the parameter value SHOULD allow reserved characters,
     *  as defined by <a href="https://tools.ietf.org/html/rfc3986#section-2.2">RFC3986</a>
     *  {@code :/?#[]@!$&'()*+,;=} to be included without percent-encoding.
     *  This property only applies to parameters with an in value of query. The default value is false.
     *  This property SHALL be ignored if the request body media type is not
     *  {@code application/x-www-form-urlencoded} or {@code multipart/form-data}.
     *  If a value is explicitly defined, then the value of {@link SpecEncoding#contentType}
     *  (implicit or explicit) SHALL be ignored.
     */
    private Boolean allowReserved;
}
