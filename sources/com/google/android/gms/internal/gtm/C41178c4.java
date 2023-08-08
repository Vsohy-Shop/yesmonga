package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import com.google.android.gms.analytics.C40394g;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.installations.C33124s;

@Deprecated
@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.c4 */
public final class C41178c4 {

    /* renamed from: a */
    public static volatile C40394g f104487a = new C41584t1();

    @C40974d0
    /* renamed from: a */
    public static C40394g m167247a() {
        return f104487a;
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: b */
    public static void m167248b(String str, Object obj) {
        C41202d4 X = C41202d4.m167313X();
        if (X != null) {
            X.mo135755r(str, obj);
        } else if (m167252f(3)) {
            if (obj != null) {
                String str2 = (String) obj;
                StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
                sb.append(str);
                sb.append(C33124s.f80355c);
                sb.append(str2);
            }
            String b = C41634v3.f105118d.mo135909b();
        }
        C40394g gVar = f104487a;
        if (gVar != null) {
            gVar.mo133377a(str);
        }
    }

    @C40974d0
    /* renamed from: c */
    public static void m167249c(C40394g gVar) {
        f104487a = gVar;
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: d */
    public static void m167250d(String str) {
        C41202d4 X = C41202d4.m167313X();
        if (X != null) {
            X.mo135759v(str);
        } else if (m167252f(0)) {
            String b = C41634v3.f105118d.mo135909b();
        }
        C40394g gVar = f104487a;
        if (gVar != null) {
            gVar.mo133379c(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: e */
    public static void m167251e(String str) {
        C41202d4 X = C41202d4.m167313X();
        if (X != null) {
            X.mo135762y(str);
        } else if (m167252f(2)) {
            String b = C41634v3.f105118d.mo135909b();
        }
        C40394g gVar = f104487a;
        if (gVar != null) {
            gVar.mo133382f(str);
        }
    }

    /* renamed from: f */
    public static boolean m167252f(int i) {
        if (f104487a == null || f104487a.mo133380d() > i) {
            return false;
        }
        return true;
    }
}
