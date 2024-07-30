package com.koboldcode.spec;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class InfoContact {
    private String name;
    private String url;
    private String email;
}
