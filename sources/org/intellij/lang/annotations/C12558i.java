package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.C12578j;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
@C12553d("RegExp")
/* renamed from: org.intellij.lang.annotations.i */
public @interface C12558i {
    @C12578j
    String prefix() default "";

    @C12578j
    String suffix() default "";
}
