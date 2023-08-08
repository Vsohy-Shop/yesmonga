package com.google.errorprone.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
/* renamed from: com.google.errorprone.annotations.l */
public @interface C32503l {
    String[] imports() default {};

    String replacement();

    String[] staticImports() default {};
}
