package com.google.gson.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.gson.annotations.a */
public @interface C33606a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
