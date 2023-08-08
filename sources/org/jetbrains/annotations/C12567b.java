package org.jetbrains.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: org.jetbrains.annotations.b */
public final class C12567b {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: org.jetbrains.annotations.b$a */
    public @interface C12568a {
    }

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: org.jetbrains.annotations.b$b */
    public @interface C12569b {
    }

    public C12567b() {
        throw new AssertionError("Async should not be instantiated");
    }
}
