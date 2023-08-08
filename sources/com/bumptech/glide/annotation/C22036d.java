package com.bumptech.glide.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: com.bumptech.glide.annotation.d */
public @interface C22036d {

    /* renamed from: Q */
    public static final int f56517Q = 0;

    /* renamed from: R */
    public static final int f56518R = 1;

    /* renamed from: S */
    public static final int f56519S = 2;

    boolean memoizeStaticMethod() default false;

    int override() default 0;

    boolean skipStaticMethod() default false;

    String staticMethodName() default "";
}
