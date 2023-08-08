package androidx.compose.p004ui.tooling.preview;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10859a;
import kotlin.annotation.C10860b;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;
import kotlin.jvm.internal.C11355n0;

@C10862d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
@C10860b
@C10861c(AnnotationRetention.BINARY)
@Repeatable(C16465a.class)
@Documented
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@C10859a
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.compose.ui.tooling.preview.c */
public @interface C16464c {

    @C10862d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
    @C10861c(AnnotationRetention.BINARY)
    @C11355n0
    @Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: androidx.compose.ui.tooling.preview.c$a */
    public @interface C16465a {
        C16464c[] value();
    }

    int apiLevel() default -1;

    long backgroundColor() default 0;

    String device() default "";

    float fontScale() default 1.0f;

    String group() default "";

    int heightDp() default -1;

    String locale() default "";

    String name() default "";

    boolean showBackground() default false;

    boolean showSystemUi() default false;

    int uiMode() default 0;

    int wallpaper() default -1;

    int widthDp() default -1;
}
