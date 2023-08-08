package androidx.core.p027os;

import android.os.LocaleList;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0368r0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0386z0;
import androidx.core.p027os.C17772a;
import androidx.core.text.C17912e;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import java.util.Locale;

/* renamed from: androidx.core.os.o */
public final class C17812o {

    /* renamed from: b */
    public static final C17812o f46190b = m81209a(new Locale[0]);

    /* renamed from: a */
    public final C17824q f46191a;

    @C0376v0(21)
    /* renamed from: androidx.core.os.o$a */
    public static class C17813a {

        /* renamed from: a */
        public static final Locale[] f46192a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        @C0373u
        /* renamed from: a */
        public static Locale m81225a(String str) {
            return Locale.forLanguageTag(str);
        }

        /* renamed from: b */
        public static boolean m81226b(Locale locale) {
            for (Locale equals : f46192a) {
                if (equals.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        @C0373u
        /* renamed from: c */
        public static boolean m81227c(@C0359n0 Locale locale, @C0359n0 Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || m81226b(locale) || m81226b(locale2)) {
                return false;
            }
            String c = C17912e.m81501c(locale);
            if (!c.isEmpty()) {
                return c.equals(C17912e.m81501c(locale2));
            }
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return true;
            }
            return false;
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.core.os.o$b */
    public static class C17814b {
        @C0373u
        /* renamed from: a */
        public static LocaleList m81228a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @C0373u
        /* renamed from: b */
        public static LocaleList m81229b() {
            return LocaleList.getAdjustedDefault();
        }

        @C0373u
        /* renamed from: c */
        public static LocaleList m81230c() {
            return LocaleList.getDefault();
        }
    }

    public C17812o(C17824q qVar) {
        this.f46191a = qVar;
    }

    @C0359n0
    /* renamed from: a */
    public static C17812o m81209a(@C0359n0 Locale... localeArr) {
        return m81216o(C17814b.m81228a(localeArr));
    }

    /* renamed from: b */
    public static Locale m81210b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains(C32920e.f79928l)) {
            return new Locale(str);
        } else {
            String[] split2 = str.split(C32920e.f79928l, -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @C0359n0
    /* renamed from: c */
    public static C17812o m81211c(@C0363p0 String str) {
        if (str == null || str.isEmpty()) {
            return m81214g();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C17813a.m81225a(split[i]);
        }
        return m81209a(localeArr);
    }

    @C0359n0
    @C0386z0(min = 1)
    /* renamed from: e */
    public static C17812o m81212e() {
        return m81216o(C17814b.m81229b());
    }

    @C0359n0
    @C0386z0(min = 1)
    /* renamed from: f */
    public static C17812o m81213f() {
        return m81216o(C17814b.m81230c());
    }

    @C0359n0
    /* renamed from: g */
    public static C17812o m81214g() {
        return f46190b;
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    @C0376v0(21)
    /* renamed from: k */
    public static boolean m81215k(@C0359n0 Locale locale, @C0359n0 Locale locale2) {
        if (C17772a.m81155k()) {
            return LocaleList.matchesLanguageAndScript(locale, locale2);
        }
        return C17813a.m81227c(locale, locale2);
    }

    @C0359n0
    @C0376v0(24)
    /* renamed from: o */
    public static C17812o m81216o(@C0359n0 LocaleList localeList) {
        return new C17812o(new C17826r(localeList));
    }

    @C0376v0(24)
    @Deprecated
    /* renamed from: p */
    public static C17812o m81217p(Object obj) {
        return m81216o((LocaleList) obj);
    }

    @C0363p0
    /* renamed from: d */
    public Locale mo52233d(int i) {
        return this.f46191a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C17812o) && this.f46191a.equals(((C17812o) obj).f46191a);
    }

    @C0363p0
    /* renamed from: h */
    public Locale mo52235h(@C0359n0 String[] strArr) {
        return this.f46191a.mo52246d(strArr);
    }

    public int hashCode() {
        return this.f46191a.hashCode();
    }

    @C0337f0(from = -1)
    /* renamed from: i */
    public int mo52237i(@C0363p0 Locale locale) {
        return this.f46191a.mo52243a(locale);
    }

    /* renamed from: j */
    public boolean mo52238j() {
        return this.f46191a.isEmpty();
    }

    @C0337f0(from = 0)
    /* renamed from: l */
    public int mo52239l() {
        return this.f46191a.size();
    }

    @C0359n0
    /* renamed from: m */
    public String mo52240m() {
        return this.f46191a.mo52244b();
    }

    @C0363p0
    /* renamed from: n */
    public Object mo52241n() {
        return this.f46191a.mo52245c();
    }

    @C0359n0
    public String toString() {
        return this.f46191a.toString();
    }
}
