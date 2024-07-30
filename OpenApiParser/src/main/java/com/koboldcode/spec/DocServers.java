package com.koboldcode.spec;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.Map;

@Data @Builder
public class DocServers {
    @NonNull
    private String url;
    private String description;
    private Map<String, ServerVars> variables;
}
