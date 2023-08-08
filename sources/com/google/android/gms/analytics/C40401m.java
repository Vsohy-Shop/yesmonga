package com.google.android.gms.analytics;

import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.gtm.C41178c4;

@C40974d0
/* renamed from: com.google.android.gms.analytics.m */
public final class C40401m {
    /* renamed from: a */
    public static String m164474a(int i) {
        return m164487n("&cd", i);
    }

    /* renamed from: b */
    public static String m164475b(int i) {
        return m164487n("cd", i);
    }

    /* renamed from: c */
    public static String m164476c(int i) {
        return m164487n("cd", i);
    }

    /* renamed from: d */
    public static String m164477d(int i) {
        return m164487n("&cm", i);
    }

    /* renamed from: e */
    public static String m164478e(int i) {
        return m164487n("cm", i);
    }

    /* renamed from: f */
    public static String m164479f(int i) {
        return m164487n("cm", i);
    }

    /* renamed from: g */
    public static String m164480g(int i) {
        return m164487n("&il", i);
    }

    /* renamed from: h */
    public static String m164481h(int i) {
        return m164487n("il", i);
    }

    /* renamed from: i */
    public static String m164482i(int i) {
        return m164487n("pi", i);
    }

    /* renamed from: j */
    public static String m164483j(int i) {
        return m164487n("&pr", i);
    }

    /* renamed from: k */
    public static String m164484k(int i) {
        return m164487n("pr", i);
    }

    /* renamed from: l */
    public static String m164485l(int i) {
        return m164487n("&promo", i);
    }

    /* renamed from: m */
    public static String m164486m(int i) {
        return m164487n("promo", i);
    }

    /* renamed from: n */
    public static String m164487n(String str, int i) {
        if (i <= 0) {
            C41178c4.m167248b("index out of range for prefix", str);
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }
}
