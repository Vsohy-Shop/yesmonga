package androidx.compose.p004ui.tooling.preview;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: androidx.compose.ui.tooling.preview.d */
public @interface C16466d {
    int limit() default Integer.MAX_VALUE;

    Class<? extends C16469e<?>> provider();
}
