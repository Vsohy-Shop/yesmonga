package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.C40843u;
import com.google.firebase.encoders.json.C33013e;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.d7 */
public final class C39146d7 {

    /* renamed from: a */
    public final C39324x4 f99917a;

    /* renamed from: b */
    public C39209k6 f99918b = new C39209k6();

    public C39146d7(C39324x4 x4Var, int i) {
        this.f99917a = x4Var;
        C39264q7.m161322a();
    }

    /* renamed from: c */
    public static C39146d7 m161162c(C39324x4 x4Var) {
        return new C39146d7(x4Var, 0);
    }

    /* renamed from: a */
    public final String mo123240a() {
        C39218l6 c = this.f99917a.mo123355f().mo123362c();
        if (c == null || C39144d5.m161161b(c.mo123296j())) {
            return "NA";
        }
        return (String) C40843u.m166202l(c.mo123296j());
    }

    /* renamed from: b */
    public final byte[] mo123241b(int i, boolean z) {
        boolean z2;
        C39209k6 k6Var = this.f99918b;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        k6Var.mo123278f(Boolean.valueOf(z2));
        this.f99918b.mo123277e(Boolean.FALSE);
        this.f99917a.mo123354e(this.f99918b.mo123284l());
        try {
            C39264q7.m161322a();
            if (i == 0) {
                return new C33013e().mo95639k(C39260q3.f100270a).mo95640l(true).mo95638j().mo95627b(this.f99917a.mo123355f()).getBytes("utf-8");
            }
            C39333y4 f = this.f99917a.mo123355f();
            C39128c cVar = new C39128c();
            C39260q3.f100270a.mo85045a(cVar);
            return cVar.mo123234c().mo123239a(f);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: d */
    public final C39146d7 mo123242d(zzfs zzfs) {
        this.f99917a.mo123352c(zzfs);
        return this;
    }

    /* renamed from: e */
    public final C39146d7 mo123243e(C39209k6 k6Var) {
        this.f99918b = k6Var;
        return this;
    }
}
