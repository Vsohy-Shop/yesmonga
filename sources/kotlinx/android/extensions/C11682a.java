package kotlinx.android.extensions;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kotlinx.android.extensions.a */
public @interface C11682a {
    CacheImplementation cache() default CacheImplementation.HASH_MAP;
}
