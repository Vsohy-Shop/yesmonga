package androidx.camera.core.impl.annotation;

import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: androidx.camera.core.impl.annotation.a */
public @interface C1434a {
    String value();
}
