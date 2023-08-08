package androidx.compose.runtime.internal;

import androidx.compose.runtime.C8579l;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10860b;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;
import kotlin.jvm.internal.C11355n0;

@C10862d(allowedTargets = {AnnotationTarget.f28074a})
@C10860b
@C10861c(AnnotationRetention.f28068c)
@Repeatable(C8561a.class)
@C8579l
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: androidx.compose.runtime.internal.i */
public @interface C8560i {

    @C10862d(allowedTargets = {AnnotationTarget.f28074a})
    @C10861c(AnnotationRetention.f28068c)
    @C11355n0
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.compose.runtime.internal.i$a */
    public @interface C8561a {
        C8560i[] value();
    }

    int endOffset();

    int key();

    int startOffset();
}
