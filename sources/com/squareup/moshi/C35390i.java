package com.squareup.moshi;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.squareup.moshi.i */
public @interface C35390i {
    boolean generateAdapter();

    String generator() default "";
}
