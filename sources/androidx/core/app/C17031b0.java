package androidx.core.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.C0328d;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0368r0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.appcompat.app.C0485j;
import androidx.core.p027os.C17772a;
import androidx.core.p027os.C17812o;
import java.util.Locale;

/* renamed from: androidx.core.app.b0 */
public final class C17031b0 {

    @C0376v0(21)
    /* renamed from: androidx.core.app.b0$a */
    public static class C17032a {
        @C0373u
        /* renamed from: a */
        public static String m78779a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.core.app.b0$b */
    public static class C17033b {
        @C0373u
        /* renamed from: a */
        public static C17812o m78780a(Configuration configuration) {
            return C17812o.m81211c(configuration.getLocales().toLanguageTags());
        }
    }

    @C0376v0(33)
    /* renamed from: androidx.core.app.b0$c */
    public static class C17034c {
        @C0373u
        /* renamed from: a */
        public static LocaleList m78781a(Object obj) {
            return C0485j.m2287a(obj).getSystemLocales();
        }
    }

    @C0344h1
    /* renamed from: a */
    public static C17812o m78776a(Configuration configuration) {
        return C17033b.m78780a(configuration);
    }

    @C0376v0(33)
    /* renamed from: b */
    public static Object m78777b(Context context) {
        return context.getSystemService("locale");
    }

    @C0328d
    @C0359n0
    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: c */
    public static C17812o m78778c(@C0359n0 Context context) {
        C17812o g = C17812o.m81214g();
        if (!C17772a.m81155k()) {
            return m78776a(context.getApplicationContext().getResources().getConfiguration());
        }
        Object b = m78777b(context);
        if (b != null) {
            return C17812o.m81216o(C17034c.m78781a(b));
        }
        return g;
    }
}
