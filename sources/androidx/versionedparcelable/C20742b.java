package androidx.versionedparcelable;

import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: androidx.versionedparcelable.b */
public @interface C20742b {
    String defaultValue() default "";

    int value();
}
