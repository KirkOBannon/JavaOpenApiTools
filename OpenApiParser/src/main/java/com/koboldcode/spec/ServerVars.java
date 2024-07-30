package com.koboldcode.spec;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data @Builder
public class ServerVars {
    @JsonProperty("enum") @NonNull
    private List<String> enumVals; // should NOT be empty
    @JsonProperty("default")
    private String defaultVal;
    private String description;
}
