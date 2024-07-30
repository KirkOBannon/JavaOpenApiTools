package com.koboldcode.spec;

import java.util.HashMap;
import java.util.Map;

/**
 * Describes a single operation parameter.
 * A unique parameter is defined by a combination of a <i>name</i> and <i>location</i> (the <code>in</code> field).
 * <p>
 * There are four possible parameter locations specified by the in field:
 * <li>path - Used together with <i>Path Templating</i>, where the parameter value is actually part of the operation's URL.
 *         This does not include the host or base path of the API. For example, in <code>/items/{itemId}</code>, the path parameter is <code>itemId</code>.
 * <li>query - Parameters that are appended to the URL. For example, in <code>/items?id=###</code>, the query parameter is <code>id</code>.
 * <li>header - Custom headers that are expected as part of the request. Note that <i>RFC7230</i> states header names are case-insensitive.
 * <li>cookie - Used to pass a specific cookie value to the API.
 * @see <a href="https://swagger.io/specification/#path-templating">Path Templating</a>
 * @see <a href="https://tools.ietf.org/html/rfc7230#page-22">RFC7230</a>
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class SpecParameter {
    /**
     * Path-style parameters defined by <i>RFC6570</i>
     * @see <a href="https://tools.ietf.org/html/rfc6570#section-3.2.7">RFC6570</a>
     */
    public static final String STYLE_MATRIX = "matrix";
    /**
     * Label style parameters defined by <i>RFC6570</i>
     * @see <a href="https://tools.ietf.org/html/rfc6570#section-3.2.5">RFC6570</a>
     */
    public static final String STYLE_LABEL  = "label";
    /**
     * Form style parameters defined by <i>RFC6570</i>.
     * This option replaces <code>collectionFormat</code> with a <code>csv</code> (when <code>explode</code> is false)
     * or <code>multi</code> (when <code>explode</code> is true) value from OpenAPI 2.0.
     * @see <a href="https://tools.ietf.org/html/rfc6570#section-3.2.8">RFC6570</a>
     */
    public static final String STYLE_FORM   = "form";
    /**
     * Simple style parameters defined by <i>RFC6570</i>.
     * This option replaces <code>collectionFormat</code> with a <code>csv</code> value from OpenAPI 2.0.
     * @see <a href="https://tools.ietf.org/html/rfc6570#section-3.2.2">RFC6570</a>
     */
    public static final String STYLE_SIMPLE = "simple";
    /**
     * Space separated array or object values.
     * This option replaces <code>collectionFormat</code> equal to <code>ssv</code> from OpenAPI 2.0.
     */
    public static final String STYLE_SPACE_DELIMITED = "spaceDelimited";
    /**
     * Pipe separated array or object values.
     * This option replaces <code>collectionFormat</code> equal to <code>pipes</code> from OpenAPI 2.0.
     */
    public static final String STYLE_PIPE_DELIMITED  = "pipeDelimited";
    /**
     * Provides a simple way of rendering nested objects using form parameters.
     */
    public static final String STYLE_DEEP_OBJECT     = "deepObject";

    /**
     * <b>REQUIRED.</b> The name of the parameter. Parameter names are case-sensitive.
     * <li>If <code>in</code> is "path", the <code>name</code> field MUST correspond to a template expression occurring within the path field in the <i>Paths Object</i>.
     *         See <i>Path Templating</i> for further information.
     * <li>If <code>in</code> is "header" and the <code>name</code> field is "Accept", "Content-Type" or "Authorization", the parameter definition SHALL be ignored.
     * <li>For all other cases, the name corresponds to the parameter <code>name</code> used by the <code>in</code> property.
     * @see com.koboldcode.spec.DocPath
     * @see <a href="https://swagger.io/specification/#path-templating">Path Templating</a>
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private String name;
    /**
     * <b>REQUIRED.</b> The location of the parameter.
     * Possible values are "query", "header", "path" or "cookie".
     * TODO: Do we want to transform this to an enum? Or leave it flexible?
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private String in;
    /**
     * A brief description of the parameter.
     * This could contain examples of use. <i>CommonMark syntax</i> MAY be used for rich text representation.
     * @see <a href="https://spec.commonmark.org/">CommonMark</a>
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private String description;
    /**
     * Determines whether this parameter is mandatory.
     * If the parameter location (<code>in</code> field) is "path", this property is <b>REQUIRED</b> and its value MUST be true.
     * Otherwise, the property MAY be included and its default value is false.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private boolean required = false;
    /**
     * Specifies that a parameter is deprecated and SHOULD be transitioned out of usage. Default value is false.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private boolean deprecated = false;
    /**
     * Sets the ability to pass empty-valued parameters. This is valid only for query parameters and allows sending a parameter with an empty value.
     * Default value is false. If style is used, and if behavior is n/a (cannot be serialized),
     * the value of allowEmptyValue SHALL be ignored. Use of this property is NOT RECOMMENDED, as it is likely to be removed in a later revision.
     */
    private boolean allowEmptyValue = false;
    /**
     * Describes how the parameter value will be serialized depending on the type of the parameter value.
     * Default values are based on the value of the value of <code>in</code>):
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
     * When this is <code>true</code>, parameter values of type <code>array</code> or <code>object</code> generate
     * separate parameters for each value of the array or key-value pair of the map.
     * For other types of parameters this property has no effect.
     * When <code>style</code> is <code>form</code>, the default value is <code>true</code>.
     * For all other styles, the default value is <code>false</code>.
     */
    private boolean explode;
    /**
     * Determines whether the parameter value SHOULD allow reserved characters,
     * as defined by <i>RFC3986</i> <code>:/?#[]@!$&'()*+,;=</code> to be included without percent-encoding.
     * This property only applies to parameters with an in value of query. The default value is false.
     * @see <a href="https://tools.ietf.org/html/rfc3986#section-2.2">RFC3986</a>
     */
    private boolean allowReserved = false;
    /**
     * The schema defining the type used for the parameter.
     */
    private SpecSchema schema;
    /**
     * Example of the parameter's potential value. The example SHOULD match the specified schema and encoding properties if present.
     * The <code>example</code> field is mutually exclusive of the <code>examples</code> field.
     * Furthermore, if referencing a <code>schema</code> that contains an example,
     * the <code>example</code> value SHALL <i>override</i> the example provided by the schema.
     * To represent examples of media types that cannot naturally be represented in JSON or YAML,
     * a string value can contain the example with escaping where necessary.
     */
    private byte[] example;
    /**
     * Examples of the parameter's potential value. Each example SHOULD contain a value in the correct format as specified in the parameter encoding.
     * The <code>examples</code> field is mutually exclusive of the <code>example</code> field.
     * Furthermore, if referencing a <code>schema</code> that contains an example,
     * the <code>example</code> value SHALL <i>override</i> the example provided by the schema.
     */
    private Map<String, byte[]> examples = new HashMap<>();
    /**
     * A map containing the representations for the parameter.
     * The key is the media type and the value describes it. The map MUST only contain one entry.
     */
    //TODO: Media Type Object instead of byte[]?
    private Map<String, byte[]> content = new HashMap<>();
}
