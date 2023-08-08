package androidx.camera.core;

import android.util.Log;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.camera.core.i2 */
public final class C1417i2 {

    /* renamed from: a */
    public static final int f4081a = 23;

    /* renamed from: b */
    public static final int f4082b = 3;

    /* renamed from: c */
    public static int f4083c = 3;

    /* renamed from: a */
    public static void m5911a(@C0359n0 String str, @C0359n0 String str2) {
        m5912b(str, str2, (Throwable) null);
    }

    /* renamed from: b */
    public static void m5912b(@C0359n0 String str, @C0359n0 String str2, @C0363p0 Throwable th) {
        if (m5917g(str)) {
            m5923m(str);
        }
    }

    /* renamed from: c */
    public static void m5913c(@C0359n0 String str, @C0359n0 String str2) {
        m5914d(str, str2, (Throwable) null);
    }

    /* renamed from: d */
    public static void m5914d(@C0359n0 String str, @C0359n0 String str2, @C0363p0 Throwable th) {
        if (m5918h(str)) {
            m5923m(str);
        }
    }

    /* renamed from: e */
    public static void m5915e(@C0359n0 String str, @C0359n0 String str2) {
        m5916f(str, str2, (Throwable) null);
    }

    /* renamed from: f */
    public static void m5916f(@C0359n0 String str, @C0359n0 String str2, @C0363p0 Throwable th) {
        if (m5919i(str)) {
            m5923m(str);
        }
    }

    /* renamed from: g */
    public static boolean m5917g(@C0359n0 String str) {
        return f4083c <= 3 || Log.isLoggable(m5923m(str), 3);
    }

    /* renamed from: h */
    public static boolean m5918h(@C0359n0 String str) {
        return f4083c <= 6 || Log.isLoggable(m5923m(str), 6);
    }

    /* renamed from: i */
    public static boolean m5919i(@C0359n0 String str) {
        return f4083c <= 4 || Log.isLoggable(m5923m(str), 4);
    }

    /* renamed from: j */
    public static boolean m5920j(@C0359n0 String str) {
        return f4083c <= 5 || Log.isLoggable(m5923m(str), 5);
    }

    /* renamed from: k */
    public static void m5921k() {
        f4083c = 3;
    }

    /* renamed from: l */
    public static void m5922l(@C0337f0(from = 3, mo995to = 6) int i) {
        f4083c = i;
    }

    @C0359n0
    /* renamed from: m */
    public static String m5923m(@C0359n0 String str) {
        str.length();
        return str;
    }

    /* renamed from: n */
    public static void m5924n(@C0359n0 String str, @C0359n0 String str2) {
        m5925o(str, str2, (Throwable) null);
    }

    /* renamed from: o */
    public static void m5925o(@C0359n0 String str, @C0359n0 String str2, @C0363p0 Throwable th) {
        if (m5920j(str)) {
            m5923m(str);
        }
    }
}
