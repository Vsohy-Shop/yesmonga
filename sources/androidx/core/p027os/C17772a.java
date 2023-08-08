package androidx.core.p027os;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.C0352k;
import androidx.annotation.C0359n0;
import androidx.annotation.RequiresOptIn;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.C19135a;
import java.util.Locale;

/* renamed from: androidx.core.os.a */
public class C17772a {

    @RequiresOptIn
    /* renamed from: androidx.core.os.a$a */
    public @interface C17773a {
    }

    @C0352k(api = 24)
    @Deprecated
    /* renamed from: a */
    public static boolean m81145a() {
        return true;
    }

    @C0352k(api = 25)
    @Deprecated
    /* renamed from: b */
    public static boolean m81146b() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @C0352k(api = 26)
    @Deprecated
    /* renamed from: c */
    public static boolean m81147c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @C0352k(api = 27)
    @Deprecated
    /* renamed from: d */
    public static boolean m81148d() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @C0352k(api = 28)
    @Deprecated
    /* renamed from: e */
    public static boolean m81149e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: f */
    public static boolean m81150f(@C0359n0 String str, @C0359n0 String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0) {
            return true;
        }
        return false;
    }

    @C0352k(api = 29)
    @Deprecated
    /* renamed from: g */
    public static boolean m81151g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @C0352k(api = 30)
    @Deprecated
    /* renamed from: h */
    public static boolean m81152h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @C0352k(api = 31, codename = "S")
    @SuppressLint({"RestrictedApi"})
    @Deprecated
    /* renamed from: i */
    public static boolean m81153i() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || (i >= 30 && m81150f(C19135a.f48823R4, Build.VERSION.CODENAME))) {
            return true;
        }
        return false;
    }

    @C0352k(api = 32, codename = "Sv2")
    @Deprecated
    @C17773a
    /* renamed from: j */
    public static boolean m81154j() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 32 || (i >= 31 && m81150f("Sv2", Build.VERSION.CODENAME))) {
            return true;
        }
        return false;
    }

    @C0352k(api = 33, codename = "Tiramisu")
    @C17773a
    /* renamed from: k */
    public static boolean m81155k() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 32 && m81150f("Tiramisu", Build.VERSION.CODENAME))) {
            return true;
        }
        return false;
    }

    @C0352k(codename = "UpsideDownCake")
    @C17773a
    /* renamed from: l */
    public static boolean m81156l() {
        if (Build.VERSION.SDK_INT < 33 || !m81150f("UpsideDownCake", Build.VERSION.CODENAME)) {
            return false;
        }
        return true;
    }
}
