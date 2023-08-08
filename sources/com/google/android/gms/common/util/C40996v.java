package com.google.android.gms.common.util;

import android.os.Build;
import androidx.annotation.C0352k;
import androidx.core.p027os.C17772a;
import com.google.android.gms.common.annotation.C40473a;

@C40473a
@C40974d0
/* renamed from: com.google.android.gms.common.util.v */
public final class C40996v {
    @C40473a
    @C0352k(api = 11)
    /* renamed from: a */
    public static boolean m166676a() {
        return true;
    }

    @C40473a
    @C0352k(api = 12)
    /* renamed from: b */
    public static boolean m166677b() {
        return true;
    }

    @C40473a
    @C0352k(api = 14)
    /* renamed from: c */
    public static boolean m166678c() {
        return true;
    }

    @C40473a
    @C0352k(api = 15)
    /* renamed from: d */
    public static boolean m166679d() {
        return true;
    }

    @C40473a
    @C0352k(api = 16)
    /* renamed from: e */
    public static boolean m166680e() {
        return true;
    }

    @C40473a
    @C0352k(api = 17)
    /* renamed from: f */
    public static boolean m166681f() {
        return true;
    }

    @C40473a
    @C0352k(api = 18)
    /* renamed from: g */
    public static boolean m166682g() {
        return true;
    }

    @C40473a
    @C0352k(api = 19)
    /* renamed from: h */
    public static boolean m166683h() {
        return true;
    }

    @C40473a
    @C0352k(api = 20)
    /* renamed from: i */
    public static boolean m166684i() {
        return true;
    }

    @C40473a
    @C0352k(api = 21)
    /* renamed from: j */
    public static boolean m166685j() {
        return true;
    }

    @C40473a
    @C0352k(api = 22)
    /* renamed from: k */
    public static boolean m166686k() {
        return true;
    }

    @C40473a
    @C0352k(api = 23)
    /* renamed from: l */
    public static boolean m166687l() {
        return true;
    }

    @C40473a
    @C0352k(api = 24)
    /* renamed from: m */
    public static boolean m166688m() {
        return true;
    }

    @C40473a
    @C0352k(api = 26)
    /* renamed from: n */
    public static boolean m166689n() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @C40473a
    @C0352k(api = 28)
    /* renamed from: o */
    public static boolean m166690o() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @C40473a
    @C0352k(api = 29)
    /* renamed from: p */
    public static boolean m166691p() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @C40473a
    @C0352k(api = 30)
    /* renamed from: q */
    public static boolean m166692q() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @C40473a
    @C0352k(api = 31)
    /* renamed from: r */
    public static boolean m166693r() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @C40473a
    @C0352k(api = 32)
    /* renamed from: s */
    public static boolean m166694s() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @C40473a
    @C0352k(api = 33)
    /* renamed from: t */
    public static boolean m166695t() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }

    @C40473a
    @C0352k(api = 33, codename = "UpsideDownCake")
    /* renamed from: u */
    public static boolean m166696u() {
        if (!m166695t()) {
            return false;
        }
        return C17772a.m81156l();
    }
}
