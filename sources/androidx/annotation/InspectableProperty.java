package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.f28082w, AnnotationTarget.f28083x, AnnotationTarget.f28084y})
@C10861c(AnnotationRetention.f28066a)
@C11395k(message = "Replaced by the {@code androidx.resourceinpsection} package.")
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface InspectableProperty {

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, mo22516d2 = {"Landroidx/annotation/InspectableProperty$ValueType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "annotation"}, mo22517k = 1, mo22518mv = {1, 7, 1})
    public enum ValueType {
        NONE,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        COLOR,
        GRAVITY,
        RESOURCE_ID
    }

    @C10862d(allowedTargets = {AnnotationTarget.f28075b, AnnotationTarget.f28074a})
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @C10861c(AnnotationRetention.f28066a)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.annotation.InspectableProperty$a */
    public @interface C0317a {
        String name();

        int value();
    }

    @C10862d(allowedTargets = {AnnotationTarget.f28075b, AnnotationTarget.f28074a})
    @C10861c(AnnotationRetention.f28066a)
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.annotation.InspectableProperty$b */
    public @interface C0318b {
        int mask() default 0;

        String name();

        int target();
    }

    int attributeId() default 0;

    C0317a[] enumMapping() default {};

    C0318b[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    ValueType valueType() default ValueType.INFERRED;
}
