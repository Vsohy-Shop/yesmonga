package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10859a;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;
import org.jetbrains.annotations.C12579k;

@C10862d(allowedTargets = {AnnotationTarget.f28082w, AnnotationTarget.f28083x, AnnotationTarget.f28084y, AnnotationTarget.f28080g, AnnotationTarget.f28078e, AnnotationTarget.f28079f, AnnotationTarget.f28075b})
@C10861c(AnnotationRetention.f28067b)
@Documented
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@C10859a
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.annotation.r */
public @interface C0366r {
    @C12579k

    /* renamed from: a */
    public static final C0367a f862a = C0367a.f866a;

    /* renamed from: b */
    public static final int f863b = 0;

    /* renamed from: c */
    public static final int f864c = 1;

    /* renamed from: d */
    public static final int f865d = 2;

    /* renamed from: androidx.annotation.r$a */
    public static final class C0367a {

        /* renamed from: a */
        public static final /* synthetic */ C0367a f866a = new C0367a();

        /* renamed from: b */
        public static final int f867b = 0;

        /* renamed from: c */
        public static final int f868c = 1;

        /* renamed from: d */
        public static final int f869d = 2;
    }

    int unit() default 1;
}
