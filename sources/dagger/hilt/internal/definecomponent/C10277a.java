package dagger.hilt.internal.definecomponent;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: dagger.hilt.internal.definecomponent.a */
public @interface C10277a {
    String builder() default "";

    String component() default "";
}
