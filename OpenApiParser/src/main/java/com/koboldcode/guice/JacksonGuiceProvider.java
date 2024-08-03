package com.koboldcode.guice;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.google.inject.AbstractModule;

public class JacksonGuiceProvider extends AbstractModule {
    @Override
    protected void configure() {
        bind(JsonMapper.class)
            .toInstance(new JsonMapper());
    }
}
