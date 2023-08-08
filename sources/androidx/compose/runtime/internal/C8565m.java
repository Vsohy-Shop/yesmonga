package androidx.compose.runtime.internal;

import androidx.compose.runtime.C8579l;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.f28082w})
@C8579l
@Target({ElementType.METHOD})
@C10861c(AnnotationRetention.f28068c)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: androidx.compose.runtime.internal.m */
public @interface C8565m {
    String key();

    int offset();
}
