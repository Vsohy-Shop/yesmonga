package org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: org.jetbrains.annotations.a */
public final class C12560a {

    @Documented
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: org.jetbrains.annotations.a$a */
    public @interface C12561a {
        String value();
    }

    @Documented
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: org.jetbrains.annotations.a$b */
    public @interface C12562b {
    }

    @Documented
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: org.jetbrains.annotations.a$c */
    public @interface C12563c {
    }

    @Documented
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: org.jetbrains.annotations.a$d */
    public @interface C12564d {
    }

    @Documented
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: org.jetbrains.annotations.a$e */
    public @interface C12565e {
    }

    @Documented
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: org.jetbrains.annotations.a$f */
    public @interface C12566f {
        String inVersion() default "";
    }

    public C12560a() {
        throw new AssertionError("ApiStatus should not be instantiated");
    }
}
