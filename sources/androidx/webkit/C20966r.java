package androidx.webkit;

import android.webkit.WebSettings;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.C20851a;
import androidx.webkit.internal.C20866c;
import androidx.webkit.internal.C20873d;
import androidx.webkit.internal.C20891j;
import androidx.webkit.internal.C20901m0;
import androidx.webkit.internal.C20905n1;
import androidx.webkit.internal.C20908o1;
import androidx.webkit.internal.C20912p1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

/* renamed from: androidx.webkit.r */
public class C20966r {
    @Deprecated

    /* renamed from: a */
    public static final int f54062a = 0;
    @Deprecated

    /* renamed from: b */
    public static final int f54063b = 1;
    @Deprecated

    /* renamed from: c */
    public static final int f54064c = 2;
    @Deprecated

    /* renamed from: d */
    public static final int f54065d = 0;
    @Deprecated

    /* renamed from: e */
    public static final int f54066e = 1;
    @Deprecated

    /* renamed from: f */
    public static final int f54067f = 2;

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.webkit.r$a */
    public @interface C20967a {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.webkit.r$b */
    public @interface C20968b {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.webkit.r$c */
    public @interface C20969c {
    }

    /* renamed from: a */
    public static C20905n1 m97062a(WebSettings webSettings) {
        return C20912p1.m96945c().mo62711f(webSettings);
    }

    /* renamed from: b */
    public static int m97063b(@C0359n0 WebSettings webSettings) {
        C20851a.C20854c cVar = C20908o1.f53978d;
        if (cVar.mo62607c()) {
            return C20873d.m96840f(webSettings);
        }
        if (cVar.mo62608d()) {
            return m97062a(webSettings).mo62651a();
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: c */
    public static boolean m97064c(@C0359n0 WebSettings webSettings) {
        if (C20908o1.f53972Y.mo62608d()) {
            return m97062a(webSettings).mo62652b();
        }
        throw C20908o1.m96934a();
    }

    @Deprecated
    /* renamed from: d */
    public static int m97065d(@C0359n0 WebSettings webSettings) {
        C20851a.C20859h hVar = C20908o1.f53966S;
        if (hVar.mo62607c()) {
            return C20901m0.m96904a(webSettings);
        }
        if (hVar.mo62608d()) {
            return m97062a(webSettings).mo62653c();
        }
        throw C20908o1.m96934a();
    }

    @Deprecated
    /* renamed from: e */
    public static int m97066e(@C0359n0 WebSettings webSettings) {
        if (C20908o1.f53967T.mo62608d()) {
            return m97062a(webSettings).mo62653c();
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: f */
    public static boolean m97067f(@C0359n0 WebSettings webSettings) {
        C20851a.C20853b bVar = C20908o1.f53976b;
        if (bVar.mo62607c()) {
            return C20866c.m96819g(webSettings);
        }
        if (bVar.mo62608d()) {
            return m97062a(webSettings).mo62655e();
        }
        throw C20908o1.m96934a();
    }

    @C0359n0
    /* renamed from: g */
    public static Set<String> m97068g(@C0359n0 WebSettings webSettings) {
        if (C20908o1.f53975a0.mo62608d()) {
            return m97062a(webSettings).mo62656f();
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: h */
    public static boolean m97069h(@C0359n0 WebSettings webSettings) {
        C20851a.C20856e eVar = C20908o1.f53977c;
        if (eVar.mo62607c()) {
            return C20891j.m96878b(webSettings);
        }
        if (eVar.mo62608d()) {
            return m97062a(webSettings).mo62657g();
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: i */
    public static boolean m97070i(@C0359n0 WebSettings webSettings) {
        if (C20908o1.f53962O.mo62608d()) {
            return m97062a(webSettings).mo62658h();
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: j */
    public static void m97071j(@C0359n0 WebSettings webSettings, boolean z) {
        if (C20908o1.f53962O.mo62608d()) {
            m97062a(webSettings).mo62659i(z);
            return;
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: k */
    public static void m97072k(@C0359n0 WebSettings webSettings, int i) {
        C20851a.C20854c cVar = C20908o1.f53978d;
        if (cVar.mo62607c()) {
            C20873d.m96849o(webSettings, i);
        } else if (cVar.mo62608d()) {
            m97062a(webSettings).mo62660j(i);
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: l */
    public static void m97073l(@C0359n0 WebSettings webSettings, boolean z) {
        if (C20908o1.f53972Y.mo62608d()) {
            m97062a(webSettings).mo62661k(z);
            return;
        }
        throw C20908o1.m96934a();
    }

    @Deprecated
    /* renamed from: m */
    public static void m97074m(@C0359n0 WebSettings webSettings, int i) {
        C20851a.C20859h hVar = C20908o1.f53966S;
        if (hVar.mo62607c()) {
            C20901m0.m96907d(webSettings, i);
        } else if (hVar.mo62608d()) {
            m97062a(webSettings).mo62662l(i);
        } else {
            throw C20908o1.m96934a();
        }
    }

    @Deprecated
    /* renamed from: n */
    public static void m97075n(@C0359n0 WebSettings webSettings, int i) {
        if (C20908o1.f53967T.mo62608d()) {
            m97062a(webSettings).mo62663m(i);
            return;
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: o */
    public static void m97076o(@C0359n0 WebSettings webSettings, boolean z) {
        C20851a.C20853b bVar = C20908o1.f53976b;
        if (bVar.mo62607c()) {
            C20866c.m96823k(webSettings, z);
        } else if (bVar.mo62608d()) {
            m97062a(webSettings).mo62664n(z);
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: p */
    public static void m97077p(@C0359n0 WebSettings webSettings, @C0359n0 Set<String> set) {
        if (C20908o1.f53975a0.mo62608d()) {
            m97062a(webSettings).mo62665o(set);
            return;
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: q */
    public static void m97078q(@C0359n0 WebSettings webSettings, boolean z) {
        C20851a.C20856e eVar = C20908o1.f53977c;
        if (eVar.mo62607c()) {
            C20891j.m96881e(webSettings, z);
        } else if (eVar.mo62608d()) {
            m97062a(webSettings).mo62666p(z);
        } else {
            throw C20908o1.m96934a();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: r */
    public static void m97079r(@C0359n0 WebSettings webSettings, boolean z) {
        if (C20908o1.f53964Q.mo62608d()) {
            m97062a(webSettings).mo62667q(z);
            return;
        }
        throw C20908o1.m96934a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: s */
    public static boolean m97080s(@C0359n0 WebSettings webSettings) {
        if (C20908o1.f53964Q.mo62608d()) {
            return m97062a(webSettings).mo62668r();
        }
        throw C20908o1.m96934a();
    }
}
