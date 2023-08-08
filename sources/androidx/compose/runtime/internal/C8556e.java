package androidx.compose.runtime.internal;

import androidx.compose.runtime.C8541g0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10862d;

@C8541g0
@C10862d(allowedTargets = {AnnotationTarget.f28082w, AnnotationTarget.f28081v})
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: androidx.compose.runtime.internal.e */
public @interface C8556e {
    String[] signature();

    String targetName();
}
