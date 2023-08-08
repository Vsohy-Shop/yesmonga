package dagger.hilt.migration;

import dagger.hilt.C10266d;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@C10266d
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: dagger.hilt.migration.a */
public @interface C10287a {
    Class<? extends Annotation>[] value();
}
