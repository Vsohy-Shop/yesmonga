package androidx.core.app;

import android.app.Service;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.app.a6 */
public final class C17015a6 {

    /* renamed from: a */
    public static final int f44961a = 1;

    /* renamed from: b */
    public static final int f44962b = 1;

    /* renamed from: c */
    public static final int f44963c = 2;

    @C0376v0(24)
    /* renamed from: androidx.core.app.a6$a */
    public static class C17016a {
        @C0373u
        /* renamed from: a */
        public static void m78733a(Service service, int i) {
            service.stopForeground(i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.a6$b */
    public @interface C17017b {
    }

    /* renamed from: a */
    public static void m78732a(@C0359n0 Service service, int i) {
        C17016a.m78733a(service, i);
    }
}
