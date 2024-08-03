package com.koboldcode.spec;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Header Object follows the structure of the {@link SpecParameter} Object with the following changes:
 * <ol>
 * <li> {@code name} MUST NOT be specified, it is given in the corresponding {@link headers} map.
 * <li> {@code in} MUST NOT be specified, it is implicitly in {@link header}.
 * <li> All traits that are affected by the location MUST be applicable to a location of <code>header</code> (for example, style).
 * </ol>
 * This object MAY be extended with
 *  <a href="https://swagger.io/specification/#specification-extensions">Specification Extensions.</a>
 *
 * @author Kirk O'Bannon, with original documentation from
 *  <a href="https://swagger.io/specification/#openapi-document">OpenApi Specification</a>
 */
@Data @NoArgsConstructor
public class SpecHeader extends SpecExtensions {
    // TODO: How should we handle these requirements? I think just duplicating the SpecParameter would make the most sense.
}
