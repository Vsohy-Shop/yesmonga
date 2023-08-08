package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.C11076d0;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10859a;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.f28075b, AnnotationTarget.f28074a, AnnotationTarget.f28082w, AnnotationTarget.f28083x, AnnotationTarget.f28084y, AnnotationTarget.f28081v, AnnotationTarget.f28078e, AnnotationTarget.f28072Y})
@C10861c(AnnotationRetention.f28067b)
@Documented
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@C10859a
@Retention(RetentionPolicy.CLASS)
public @interface RestrictTo {

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo22516d2 = {"Landroidx/annotation/RestrictTo$Scope;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "annotation"}, mo22517k = 1, mo22518mv = {1, 7, 1})
    public enum Scope {
        LIBRARY,
        LIBRARY_GROUP,
        LIBRARY_GROUP_PREFIX,
        GROUP_ID,
        TESTS,
        SUBCLASSES
    }

    Scope[] value();
}
