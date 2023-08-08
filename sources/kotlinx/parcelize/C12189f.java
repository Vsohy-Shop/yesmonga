package kotlinx.parcelize;

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
import kotlinx.parcelize.C12185c;

@C10862d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY})
@C10860b
@C10861c(AnnotationRetention.SOURCE)
@Repeatable(C12190a.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: kotlinx.parcelize.f */
public @interface C12189f<T, P extends C12185c<? super T>> {

    @C10862d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY})
    @C10861c(AnnotationRetention.SOURCE)
    @C11355n0
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: kotlinx.parcelize.f$a */
    public @interface C12190a {
        C12189f[] value();
    }
}
