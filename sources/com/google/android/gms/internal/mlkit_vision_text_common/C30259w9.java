package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.C40843u;
import com.google.firebase.encoders.json.C33013e;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.w9 */
public final class C30259w9 {

    /* renamed from: a */
    public final C30137m7 f72312a;

    /* renamed from: b */
    public C30031d9 f72313b = new C30031d9();

    /* renamed from: c */
    public final int f72314c;

    public C30259w9(C30137m7 m7Var, int i) {
        this.f72312a = m7Var;
        C30056fa.m121679a();
        this.f72314c = i;
    }

    /* renamed from: d */
    public static C30259w9 m121910d(C30137m7 m7Var) {
        return new C30259w9(m7Var, 0);
    }

    /* renamed from: e */
    public static C30259w9 m121911e(C30137m7 m7Var, int i) {
        return new C30259w9(m7Var, 1);
    }

    /* renamed from: a */
    public final int mo85376a() {
        return this.f72314c;
    }

    /* renamed from: b */
    public final String mo85377b() {
        C30055f9 e = this.f72312a.mo85233i().mo85275e();
        if (e == null || C30009c.m121601b(e.mo85113j())) {
            return "NA";
        }
        return (String) C40843u.m166202l(e.mo85113j());
    }

    /* renamed from: c */
    public final byte[] mo85378c(int i, boolean z) {
        boolean z2;
        C30031d9 d9Var = this.f72313b;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        d9Var.mo85069f(Boolean.valueOf(z2));
        this.f72313b.mo85068e(Boolean.FALSE);
        this.f72312a.mo85232h(this.f72313b.mo85075l());
        try {
            C30056fa.m121679a();
            if (i == 0) {
                return new C33013e().mo95639k(C30016c6.f71773a).mo95640l(true).mo95638j().mo95627b(this.f72312a.mo85233i()).getBytes("utf-8");
            }
            C30161o7 i2 = this.f72312a.mo85233i();
            C30119l1 l1Var = new C30119l1();
            C30016c6.f71773a.mo85045a(l1Var);
            return l1Var.mo85214c().mo85227a(i2);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: f */
    public final C30259w9 mo85379f(zziv zziv) {
        this.f72312a.mo85230f(zziv);
        return this;
    }

    /* renamed from: g */
    public final C30259w9 mo85380g(C30031d9 d9Var) {
        this.f72313b = d9Var;
        return this;
    }
}
