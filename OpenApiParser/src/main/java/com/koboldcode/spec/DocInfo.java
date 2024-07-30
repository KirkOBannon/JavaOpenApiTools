package com.koboldcode.spec;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data @Builder
public class DocInfo {
    @NonNull
    private String title;
    private String description;
    private String termsOfService;
    private InfoContact contact;
    private InfoLicense license;
    @NonNull
    private String version;
}
