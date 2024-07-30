package com.koboldcode.spec;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data @Builder
public class InfoLicense {
    @NonNull
    private String name; // Required
    private String url;
}
