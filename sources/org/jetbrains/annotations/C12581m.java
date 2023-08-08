package org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.TYPE_USE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: org.jetbrains.annotations.m */
public @interface C12581m {
    @C12578j
    String resourceBundle();
}
