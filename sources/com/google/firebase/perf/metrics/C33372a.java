package com.google.firebase.perf.metrics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
/* renamed from: com.google.firebase.perf.metrics.a */
public @interface C33372a {
    boolean enabled() default true;

    String name();
}
