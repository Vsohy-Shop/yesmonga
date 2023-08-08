package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: androidx.core.text.e */
public final class C17912e {

    /* renamed from: a */
    public static final String f46375a = "ICUCompat";

    /* renamed from: b */
    public static Method f46376b;

    /* renamed from: c */
    public static Method f46377c;

    @C0376v0(21)
    /* renamed from: androidx.core.text.e$a */
    public static class C17913a {
        @C0373u
        /* renamed from: a */
        public static String m81502a(Locale locale) {
            return locale.getScript();
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.core.text.e$b */
    public static class C17914b {
        @C0373u
        /* renamed from: a */
        public static ULocale m81503a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @C0373u
        /* renamed from: b */
        public static ULocale m81504b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @C0373u
        /* renamed from: c */
        public static String m81505c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: a */
    public static String m81499a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f46377c;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: b */
    public static String m81500b(String str) {
        try {
            Method method = f46376b;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    @C0363p0
    /* renamed from: c */
    public static String m81501c(@C0359n0 Locale locale) {
        return C17914b.m81505c(C17914b.m81503a(C17914b.m81504b(locale)));
    }
}
