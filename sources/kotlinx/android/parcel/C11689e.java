package kotlinx.android.parcel;

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
import kotlinx.android.parcel.C11685b;

@C10862d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY})
@C10860b
@C10861c(AnnotationRetention.SOURCE)
@Repeatable(C11690a.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: kotlinx.android.parcel.e */
public @interface C11689e<T, P extends C11685b<? super T>> {

    @C10862d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY})
    @C10861c(AnnotationRetention.SOURCE)
    @C11355n0
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: kotlinx.android.parcel.e$a */
    public @interface C11690a {
        C11689e[] value();
    }
}
