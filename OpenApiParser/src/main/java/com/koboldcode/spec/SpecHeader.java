package com.koboldcode.spec;

/**
 * The Header Object follows the structure of the Parameter Object with the following changes:
 * <ol>
 * <li> <code>name</code> MUST NOT be specified, it is given in the corresponding <code>headers</code> map.
 * <li> <code>in</code> MUST NOT be specified, it is implicitly in <code>header</code>.
 * <li> All traits that are affected by the location MUST be applicable to a location of <code>header</code> (for example, style).
 * @author Kirk O'Bannon modified, base description from OpenApi Specification
 */
public class SpecHeader extends SpecParameter {
}
