package com.koboldcode.spec;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SpecRefOrVal<T> {
    /**
     * The object being referenced.
     */
    @JsonIgnore
    private T obj;
}
