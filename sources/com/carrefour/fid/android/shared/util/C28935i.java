package com.carrefour.fid.android.shared.util;

import android.util.Log;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.app.C17075f2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.util.i */
public final class C28935i {
    @C12579k

    /* renamed from: a */
    public static final C28935i f70940a = new C28935i();

    /* renamed from: b */
    public static final int f70941b = 6;
    @C12579k

    /* renamed from: c */
    public static final HashMap<String, Long> f70942c = new HashMap<>();

    /* renamed from: d */
    public static final int f70943d = 8;

    /* renamed from: b */
    public static /* synthetic */ void m119704b(C28935i iVar, String str, Throwable th, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        if ((i2 & 4) != 0) {
            i = 6;
        }
        iVar.mo84256a(str, th, i);
    }

    /* renamed from: e */
    public static /* synthetic */ void m119705e(C28935i iVar, String str, Throwable th, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        if ((i2 & 4) != 0) {
            i = 6;
        }
        iVar.mo84258d(str, th, i);
    }

    /* renamed from: i */
    public static /* synthetic */ void m119706i(C28935i iVar, String str, Throwable th, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        if ((i2 & 4) != 0) {
            i = 6;
        }
        iVar.mo84261h(str, th, i);
    }

    /* renamed from: k */
    public static /* synthetic */ void m119707k(C28935i iVar, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            i = 6;
        }
        iVar.mo84262j(str, str2, i);
    }

    /* renamed from: n */
    public static /* synthetic */ void m119708n(C28935i iVar, int i, String str, Throwable th, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = "";
        }
        if ((i3 & 4) != 0) {
            th = null;
        }
        if ((i3 & 8) != 0) {
            i2 = 6;
        }
        iVar.mo84264m(i, str, th, i2);
    }

    /* renamed from: p */
    public static /* synthetic */ void m119709p(C28935i iVar, String str, Throwable th, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        if ((i2 & 4) != 0) {
            i = 6;
        }
        iVar.mo84265o(str, th, i);
    }

    /* renamed from: r */
    public static /* synthetic */ void m119710r(C28935i iVar, String str, Throwable th, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        if ((i2 & 4) != 0) {
            i = 6;
        }
        iVar.mo84266q(str, th, i);
    }

    /* renamed from: t */
    public static /* synthetic */ void m119711t(C28935i iVar, String str, Throwable th, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        if ((i2 & 4) != 0) {
            i = 6;
        }
        iVar.mo84267s(str, th, i);
    }

    /* renamed from: a */
    public final void mo84256a(@C12579k String str, @C12580l Throwable th, int i) {
        Intrinsics.checkNotNullParameter(str, C17075f2.f45108s0);
        mo84264m(3, str, th, i);
    }

    /* renamed from: c */
    public final int mo84257c(int i, String str, String str2) {
        switch (i) {
            case 2:
                return Log.v(str, str2);
            case 3:
                return Log.d(str, str2);
            case 4:
                return Log.i(str, str2);
            case 5:
                return Log.w(str, str2);
            case 6:
                return Log.e(str, str2);
            case 7:
                return Log.wtf(str, str2);
            default:
                return Log.v(str, str2);
        }
    }

    /* renamed from: d */
    public final void mo84258d(@C12579k String str, @C12580l Throwable th, int i) {
        Intrinsics.checkNotNullParameter(str, C17075f2.f45108s0);
        mo84264m(6, str, th, i);
    }

    /* renamed from: f */
    public final String mo84259f(int i) {
        switch (i) {
            case 2:
                return "VERBOSE";
            case 3:
                return "DEBUG";
            case 4:
                return "INFO";
            case 5:
                return "WARN";
            case 6:
                return "ERROR";
            case 7:
                return "ASSERT";
            default:
                return "NONE";
        }
    }

    /* renamed from: g */
    public final String mo84260g(int i) {
        try {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[i];
            C11368t0 t0Var = C11368t0.f28504a;
            String format = String.format(Locale.ENGLISH, "(%s:%d)", Arrays.copyOf(new Object[]{stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber())}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
            return format;
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    /* renamed from: h */
    public final void mo84261h(@C12579k String str, @C12580l Throwable th, int i) {
        Intrinsics.checkNotNullParameter(str, C17075f2.f45108s0);
        mo84264m(4, str, th, i);
    }

    /* renamed from: j */
    public final void mo84262j(@C12579k String str, @C12580l String str2, int i) {
        String str3;
        String str4 = str;
        Intrinsics.checkNotNullParameter(str, "tag");
        Long l = f70942c.get(str);
        if (l == null) {
            l = 0L;
        }
        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
        if (currentTimeMillis > 1000) {
            C11368t0 t0Var = C11368t0.f28504a;
            str3 = String.format(Locale.ENGLISH, "%.2f s", Arrays.copyOf(new Object[]{Float.valueOf(((float) currentTimeMillis) / ((float) 1000))}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
        } else {
            str3 = currentTimeMillis + " ms";
        }
        C11368t0 t0Var2 = C11368t0.f28504a;
        Locale locale = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(locale, "ENGLISH");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        String format = String.format(locale, "#%s#: %s after %s", Arrays.copyOf(new Object[]{upperCase, str2, str3}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        m119708n(this, 4, format, (Throwable) null, i + 1, 4, (Object) null);
    }

    /* renamed from: l */
    public final void mo84263l(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        f70942c.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: m */
    public final void mo84264m(int i, String str, Throwable th, int i2) {
    }

    /* renamed from: o */
    public final void mo84265o(@C12579k String str, @C12580l Throwable th, int i) {
        Intrinsics.checkNotNullParameter(str, C17075f2.f45108s0);
        mo84264m(2, str, th, i);
    }

    /* renamed from: q */
    public final void mo84266q(@C12579k String str, @C12580l Throwable th, int i) {
        Intrinsics.checkNotNullParameter(str, C17075f2.f45108s0);
        mo84264m(5, str, th, i);
    }

    /* renamed from: s */
    public final void mo84267s(@C12579k String str, @C12580l Throwable th, int i) {
        Intrinsics.checkNotNullParameter(str, C17075f2.f45108s0);
        mo84264m(7, "WTF: " + str, th, i);
    }
}
