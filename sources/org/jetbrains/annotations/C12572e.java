package org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
/* renamed from: org.jetbrains.annotations.e */
public @interface C12572e {
    @C12578j
    String mutates() default "";

    boolean pure() default false;

    @C12578j
    String value() default "";
}
