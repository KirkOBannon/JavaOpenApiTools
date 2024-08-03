package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A simple object to allow referencing other components in the OpenAPI document, internally and externally.
 * <p>
 * The <code>$ref</code> string value contains a URI <i>RFC3986</i>, which identifies the location of the value being referenced.
 * @see <a href="https://tools.ietf.org/html/rfc3986">RFC3986</a>
 * @see <a href="https://swagger.io/specification/#relative-references-in-uris">Relative References</a>
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
@Data
@NoArgsConstructor
public class SpecReference {
    /**
     * <b>REQUIRED</b>. The reference identifier. This MUST be in the form of a URI.
     */
    private String ref;
    /**
     * A short summary which by default SHOULD override that of the referenced component.
     * If the referenced object-type does not allow a <code>summary</code> field, then this field has no effect.
     */
    private String summary;
    /**
     * A description which by default SHOULD override that of the referenced component.
     * <i>CommonMark syntax</i> MAY be used for rich text representation.
     * If the referenced object-type does not allow a <code>description</code> field, then this field has no effect.
     * @see <a href="https://spec.commonmark.org/">CommonMark</a>
     */
    private String description;
}
