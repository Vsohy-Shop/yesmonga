package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.C40843u;
import com.google.firebase.encoders.json.C33013e;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.mlkit_common.s8 */
public final class C42510s8 implements C42378g8 {

    /* renamed from: a */
    public final C42580z5 f107353a;

    /* renamed from: b */
    public C42498r7 f107354b = new C42498r7();

    public C42510s8(C42580z5 z5Var, int i) {
        this.f107353a = z5Var;
        C42357e9.m171474a();
    }

    /* renamed from: f */
    public static C42378g8 m171651f(C42580z5 z5Var) {
        return new C42510s8(z5Var, 0);
    }

    /* renamed from: g */
    public static C42378g8 m171652g() {
        return new C42510s8(new C42580z5(), 0);
    }

    /* renamed from: a */
    public final C42378g8 mo137694a(C42354e6 e6Var) {
        this.f107353a.mo137846i(e6Var);
        return this;
    }

    /* renamed from: b */
    public final byte[] mo137695b(int i, boolean z) {
        boolean z2;
        C42498r7 r7Var = this.f107354b;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        r7Var.mo137782f(Boolean.valueOf(z2));
        this.f107354b.mo137781e(Boolean.FALSE);
        this.f107353a.mo137847j(this.f107354b.mo137788l());
        try {
            C42357e9.m171474a();
            if (i == 0) {
                return new C33013e().mo95639k(C42462o4.f107256a).mo95640l(true).mo95638j().mo95627b(this.f107353a.mo137848k()).getBytes("utf-8");
            }
            C42321b6 k = this.f107353a.mo137848k();
            C42304a0 a0Var = new C42304a0();
            C42462o4.f107256a.mo85045a(a0Var);
            return a0Var.mo137620c().mo137625a(k);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: c */
    public final C42378g8 mo137696c(C42498r7 r7Var) {
        this.f107354b = r7Var;
        return this;
    }

    /* renamed from: d */
    public final C42378g8 mo137697d(zzgz zzgz) {
        this.f107353a.mo137843f(zzgz);
        return this;
    }

    /* renamed from: e */
    public final String mo137698e() {
        C42520t7 f = this.f107353a.mo137848k().mo137631f();
        if (f == null || C42358f.m171478c(f.mo137811j())) {
            return "NA";
        }
        return (String) C40843u.m166202l(f.mo137811j());
    }
}
