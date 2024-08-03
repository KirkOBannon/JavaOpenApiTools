package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * Describes a single operation parameter.
 * A unique parameter is defined by a combination of a <i>name</i> and <i>location</i> (the <code>in</code> field).
 * <p>
 * There are four possible parameter locations specified by the in field:
 * <li>path - Used together with <a href="https://swagger.io/specification/#path-templating">Path Templating</a>,
 *  where the parameter value is actually part of the operation's URL.
 *  This does not include the host or base path of the API.
 *  For example, in {@code /items/{itemId}}, the path parameter is {@code itemId}.
 * <li>query - Parameters that are appended to the URL.
 *  For example, in {@code /items?id=###}, the query parameter is {@code id}.
 * <li>header - Custom headers that are expected as part of the request. Note that
 *  <a href="https://tools.ietf.org/html/rfc7230#page-22">RFC7230</a> states header names are case-insensitive.
 * <li>cookie - Used to pass a specific cookie value to the API.
 * <p>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecParameter {
    /**
     * <b>REQUIRED.</b> The name of the parameter. Parameter names are case-sensitive.
     * <li>If {@link SpecParameter#in} is {@code "path"}, the {@link SpecParameter#name} field MUST correspond to a
     *  template expression occurring within the {@link SpecPath} field in the {@link OpenApiDoc#paths} Object.
     *  See <a href="https://swagger.io/specification/#path-templating">Path Templating</a> for further information.
     * <li>If {@link SpecParameter#in} is {@code "header"} and the {@link SpecParameter#name} field is
     *  {@code "Accept"}, {@code "Content-Type"}, or {@code "Authorization"}, the parameter definition SHALL be ignored.
     * <li>For all other cases, the name corresponds to this parameter is used by the {@link SpecParameter#in} property.
     */
    private String name;
    /**
     * <b>REQUIRED.</b> The location of the parameter.
     *  Possible values are {@code "query"}, {@code "header"}, {@code "path"} or {@code "cookie"}.
     */
    private SpecParamIn in;
    /**
     * A brief description of the parameter. This could contain examples of use.
     *  <a href="https://spec.commonmark.org/">CommonMark</a> MAY be used for rich text representation.
     */
    private String description;
    /**
     * Determines whether this parameter is mandatory. If the parameter location ({@link SpecParameter#in} field) is
     * {@code "path"}, this property is <b>REQUIRED</b> and its value MUST be {@code true}.
     *  Otherwise, the property MAY be included and its default value is {@code false}.
     */
    private boolean required = false;
    /**
     * Specifies that a parameter is deprecated and SHOULD be transitioned out of usage. Default value is {@code false}.
     */
    private boolean deprecated = false;
    /**
     * Sets the ability to pass empty-valued parameters. This is valid only for {@code query} parameters and allows
     *  sending a parameter with an empty value. Default value is {@code false}. If {@link SpecParameter#style} is used,
     *  and if behavior is {@code n/a} (cannot be serialized), the value of allowEmptyValue SHALL be ignored.
     *  Use of this property is NOT RECOMMENDED, as it is likely to be removed in a later revision.
     */
    private boolean allowEmptyValue = false;
    /**
     * Describes how the parameter value will be serialized depending on the type of the parameter value.
     *  Default values are based on the value of the value of {@link SpecParameter#in}):
     * <pre>
     * | In Value | Default |
     * |----------|---------|
     * | query    | form    |
     * | path     | simple  |
     * | header   | simple  |
     * | cookie   | form    |
     *</pre>
     */
    private String style;
    /**
     * When this is {@code true}, parameter values of type {@code array} or {@code object} generate
     *  separate parameters for each value of the array or key-value pair of the map.
     *  For other types of parameters this property has no effect.
     *  When {@link SpecParameter#style} is {@code form}, the default value is {@code true}.
     *  For all other styles, the default value is {@code false}.
     */
    private boolean explode;
    /**
     * Determines whether the parameter value SHOULD allow reserved characters,
     *  as defined by <a href="https://tools.ietf.org/html/rfc3986#section-2.2">RFC3986</a>
     *  ({@code :/?#[]@!$&'()*+,;=}) to be included without percent-encoding.
     *  This property only applies to parameters with an {@link SpecParameter#in} value of {@code query}.
     *  The default value is {@code false}.
     */
    private boolean allowReserved = false;
    /**
     * The schema defining the type used for the parameter.
     */
    private SpecSchema schema;
    /**
     * Example of the parameter's potential value. The example SHOULD match the specified schema and encoding
     *  properties if present. The {@code example} field is mutually exclusive of the {@code examples} field.
     *  Furthermore, if referencing a <code>schema</code> that contains an example,
     *  the {@code example} value SHALL <i>override</i> the example provided by the schema.
     *  To represent examples of media types that cannot naturally be represented in JSON or YAML,
     *  a string value can contain the example with escaping where necessary.
     */
    private byte[] example;
    /**
     * Examples of the parameter's potential value. Each example SHOULD contain a value in the correct format as
     *  specified in the parameter encoding. The {@code examples} field is mutually exclusive of the {@code example}
     *  field. Furthermore, if referencing a <code>schema</code> that contains an example, the <code>example</code>
     *  value SHALL <i>override</i> the example provided by the schema.
     */
    private Map<String, byte[]> examples = new HashMap<>();
    /**
     * A map containing the representations for the parameter.
     * The key is the media type and the value describes it. The map MUST only contain one entry.
     */
    private Map<String, byte[]> content = new HashMap<>();

    /**
     * Enum for {@link SpecParameter#in}. Possible values are "query", "header", "path" or "cookie".
     */
    public enum SpecParamIn {
        QUERY("query"),
        HEADER("header"),
        PATH("path"),
        COOKIE("cookie");

        private final String value;
        SpecParamIn(String val) {
            this.value = val;
        }
    }
}
