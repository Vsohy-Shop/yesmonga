package androidx.resourceinspection.annotation;

import androidx.annotation.C0359n0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* renamed from: androidx.resourceinspection.annotation.b */
public @interface C20230b {

    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.resourceinspection.annotation.b$a */
    public @interface C20231a {
        int mask() default 0;

        @C0359n0
        String name();

        int value();
    }

    @C0359n0
    C20231a[] intMapping() default {};

    @C0359n0
    String value();
}
