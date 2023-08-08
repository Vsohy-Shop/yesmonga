package org.jetbrains.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.intellij.lang.annotations.C12553d;

/* renamed from: org.jetbrains.annotations.f */
public final class C12573f {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: org.jetbrains.annotations.f$a */
    public @interface C12574a {
        @C12553d(prefix = "class Renderer{Object[] $childrenArray(){return ", suffix = ";}}", value = "JAVA")
        @C12578j
        String childrenArray() default "";

        @C12553d(prefix = "class Renderer{boolean $hasChildren(){return ", suffix = ";}}", value = "JAVA")
        @C12578j
        String hasChildren() default "";

        @C12553d(prefix = "class Renderer{String $text(){return ", suffix = ";}}", value = "JAVA")
        @C12578j
        String text() default "";
    }

    public C12573f() {
        throw new AssertionError("Debug should not be instantiated");
    }
}
