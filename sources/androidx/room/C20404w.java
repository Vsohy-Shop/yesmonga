package androidx.room;

import androidx.annotation.C0376v0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;

@C10862d(allowedTargets = {AnnotationTarget.CLASS})
@Target({ElementType.TYPE})
@C10861c(AnnotationRetention.BINARY)
@C0376v0(16)
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.room.w */
public @interface C20404w {
    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
