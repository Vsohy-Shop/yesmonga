package com.google.android.datatransport.runtime.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.android.datatransport.runtime.dagger.d */
public @interface C40126d {

    @Documented
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.google.android.datatransport.runtime.dagger.d$a */
    public @interface C40127a {
    }

    @Documented
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.google.android.datatransport.runtime.dagger.d$b */
    public @interface C40128b {
    }

    Class<?>[] dependencies() default {};

    Class<?>[] modules() default {};
}
