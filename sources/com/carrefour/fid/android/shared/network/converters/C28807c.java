package com.carrefour.fid.android.shared.network.converters;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER})
@Target({ElementType.METHOD})
@C10861c(AnnotationRetention.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.carrefour.fid.android.shared.network.converters.c */
public @interface C28807c {
    String value() default "";
}
