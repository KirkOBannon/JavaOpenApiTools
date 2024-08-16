package com.koboldcode.spec;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URI;

/**
 * A simple object to allow referencing other components in the OpenAPI document, internally and externally.
 * <p>
 * The {@link SpecReference#ref} string value contains a URI <a href="https://tools.ietf.org/html/rfc3986">RFC3986</a>,
 *  which identifies the location of the value being referenced.
 * <p>
 * This object <b>cannot</b> be extended with additional properties and any properties added SHALL be ignored.
 * <p>
 * Note that this restriction on additional properties is a difference between Reference Objects and
 *  {@link SpecSchema} Objects that contain a $ref keyword.
 * @see <a href="https://swagger.io/specification/#relative-references-in-uris">Rules for resolving Relative References</a>
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecReference<T> extends SpecRefOrVal<T> {
    /**
     * <b>REQUIRED</b>. The reference identifier. This MUST be in the form of a URI.
     */
    @JsonProperty("$ref")
    private URI ref;
    /**
     * A short summary which by default SHOULD override that of the referenced component.
     * If the referenced object-type does not allow a {@code summary} field, then this field has no effect.
     */
    private String summary;
    /**
     * A description which by default SHOULD override that of the referenced component.
     *  <a href="https://spec.commonmark.org/">CommonMark</a> MAY be used for rich text representation.
     *  If the referenced object-type does not allow a {@code description} field, then this field has no effect.
     */
    private String description;
}
