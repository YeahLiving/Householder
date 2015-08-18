package com.yeahliving.api.services;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by xingfeiy on 8/17/15.
 */
public class ServiceApplication extends ResourceConfig {
    public ServiceApplication() {
        packages("com.yeahliving.api.v1");
        register(GZipInterceptor.class);
    }
}
