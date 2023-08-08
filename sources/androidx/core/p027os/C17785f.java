package androidx.core.p027os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.os.f */
public final class C17785f {

    @C0376v0(24)
    /* renamed from: androidx.core.os.f$a */
    public static class C17786a {
        @C0373u
        /* renamed from: a */
        public static LocaleList m81176a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C17812o m81175a(@C0359n0 Configuration configuration) {
        return C17812o.m81216o(C17786a.m81176a(configuration));
    }
}
