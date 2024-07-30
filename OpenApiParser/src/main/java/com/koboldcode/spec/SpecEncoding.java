package com.koboldcode.spec;

import java.util.HashMap;
import java.util.Map;

/**
 * A single encoding definition applied to a single schema property.
 * <p>
 * This object MAY be extended with Specification Extensions.
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class SpecEncoding {
    /**
     * The Content-Type for encoding a specific property. The value can be a specific media type
     * (e.g. <code>application/json</code>), a wildcard media type (e.g. <code>image/*</code>),
     * or a comma-separated list of the two types.
     * Default value depends on the property type:
     * <li> for <code>object</code>, default value is <code>application/json</code>
     * <li> for <code>array</code>, the default is defined based on the inner type
     * <li> for all other cases the default is <code>application/octet-stream</code>.
     * <p>
     */
    private String contentType;
    /**
     * A map allowing additional information to be provided as headers, for example <code>Content-Disposition</code>.
     * <code>Content-Type</code> is described separately and SHALL be ignored in this section.
     * This property SHALL be ignored if the request body media type is not a <code>multipart</code>.
     */
    private Map<String, Object> headers = new HashMap<>();
    /**
     * Describes how a specific property value will be serialized depending on its type.
     * See <i>Parameter Object</i> for details on the <i>style</i> property. The behavior follows the same values as query parameters,
     * including default values. This property SHALL be ignored if the request body media type is not
     * <code>application/x-www-form-urlencoded</code> or <code>multipart/form-data</code>.
     * If a value is explicitly defined, then the value of <i>contentType</i> (implicit or explicit) SHALL be ignored.
     */
    private String style;
    /**
     * When this is true, property values of type <code>array</code> or <code>object</code> generate separate parameters for each value of the array,
     * or key-value-pair of the map. For other types of properties this property has no effect.
     * When <i>style</i> is <code>form</code>, the default value is <code>true</code>. For all other styles, the default value is <code>false</code>.
     * This property SHALL be ignored if the request body media type is not <code>application/x-www-form-urlencoded</code> or <code>multipart/form-data</code>.
     * If a value is explicitly defined, then the value of <i>contentType</i> (implicit or explicit) SHALL be ignored.
     */
    private Boolean explode;
    /**
     * Determines whether the parameter value SHOULD allow reserved characters,
     * as defined by <i>RFC3986</i> <code>:/?#[]@!$&'()*+,;=</code> to be included without percent-encoding.
     * This property only applies to parameters with an in value of query. The default value is false.
     * @see <a href="https://tools.ietf.org/html/rfc3986#section-2.2">RFC3986</a>
     */
    private Boolean allowReserved;
}
