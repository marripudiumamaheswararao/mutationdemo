package com.vmca.mutationdemo;

import org.pitest.mutationtest.build.InterceptorParameters;
import org.pitest.mutationtest.build.MutationInterceptor;
import org.pitest.mutationtest.build.MutationInterceptorFactory;
import org.pitest.plugin.Feature;
import org.springframework.stereotype.Component;

@Component
public class LoggingMutationIntercepter implements MutationInterceptorFactory {
    @Override
    public MutationInterceptor createInterceptor(InterceptorParameters params) {
        return null;
    }

    @Override
    public Feature provides() {
        return Feature.named("FLOGCALL")
                .withOnByDefault(true)  
                .withDescription("Filters mutations in code that makes calls to logging frameworks");
    }

    @Override
    public String description() {
        return null;
    }
}
