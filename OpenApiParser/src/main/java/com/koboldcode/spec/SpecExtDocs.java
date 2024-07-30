package com.koboldcode.spec;

/**
 * Allows referencing an external resource for extended documentation.
 * This object MAY be extended with <i>Specification Extensions.</i>
 * @see <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions</a>
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class SpecExtDocs {
    /**
     * A description of the target documentation.
     * <i>CommonMark syntax</i> MAY be used for rich text representation.
     * @see <a href="https://spec.commonmark.org/">CommonMark</a>
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private String description;
    /**
     * <b>REQUIRED</b>. The URL for the target documentation. This MUST be in the form of a URL.
     * @author Kirk O'Bannon modified, base description from OpenApi Specification
     */
    private String url;
}
