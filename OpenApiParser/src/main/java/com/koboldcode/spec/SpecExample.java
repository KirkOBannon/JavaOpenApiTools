package com.koboldcode.spec;

/**
 * Example Objects
 * <p>
 * In all cases, the example value is expected to be compatible with the type schema of its associated value.
 * Tooling implementations MAY choose to validate compatibility automatically, and reject the example value(s) if incompatible.
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class SpecExample {
    /**
     * Short description for the example.
     */
    private String summary;
    /**
     * Long description for the example. <i>CommonMark syntax</i> MAY be used for rich text representation.
     * @see <a href="https://spec.commonmark.org/">CommonMark</a>
     */
    private String description;
    /**
     * Embedded literal example. The <code>value</code> field and <code>externalValue</code> field are mutually exclusive.
     * To represent examples of media types that cannot naturally be represented in JSON or YAML,
     * use a string value to contain the example, escaping where necessary.
     */
    private byte[] value;
    /**
     * A URI that points to the literal example.
     * This provides the capability to reference examples that cannot easily be included in JSON or YAML documents.
     * The value field and <code>externalValue</code> field are mutually exclusive.
     * See the rules for resolving <i>Relative References</i>.
     * @see <a href="https://swagger.io/specification/#relative-references-in-uris">Relative References</a>
     */
    private String externalValue;
}
