package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.C40843u;
import com.google.firebase.encoders.json.C33013e;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.ea */
public final class C38596ea {

    /* renamed from: a */
    public final C38786t7 f97822a;

    /* renamed from: b */
    public C38647i9 f97823b = new C38647i9();

    /* renamed from: c */
    public final int f97824c;

    public C38596ea(C38786t7 t7Var, int i) {
        this.f97822a = t7Var;
        C38713na.m160081a();
        this.f97824c = i;
    }

    /* renamed from: d */
    public static C38596ea m159934d(C38786t7 t7Var) {
        return new C38596ea(t7Var, 0);
    }

    /* renamed from: e */
    public static C38596ea m159935e(C38786t7 t7Var, int i) {
        return new C38596ea(t7Var, 1);
    }

    /* renamed from: a */
    public final int mo122312a() {
        return this.f97824c;
    }

    /* renamed from: b */
    public final String mo122313b() {
        C38673k9 f = this.f97822a.mo122520j().mo122556f();
        if (f == null || C38741q.m160105b(f.mo122410j())) {
            return "NA";
        }
        return (String) C40843u.m166202l(f.mo122410j());
    }

    /* renamed from: c */
    public final byte[] mo122314c(int i, boolean z) {
        boolean z2;
        C38647i9 i9Var = this.f97823b;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        i9Var.mo122372f(Boolean.valueOf(z2));
        this.f97823b.mo122371e(Boolean.FALSE);
        this.f97822a.mo122519i(this.f97823b.mo122378l());
        try {
            C38713na.m160081a();
            if (i == 0) {
                return new C33013e().mo95639k(C38670k6.f97995a).mo95640l(true).mo95638j().mo95627b(this.f97822a.mo122520j()).getBytes("utf-8");
            }
            C38810v7 j = this.f97822a.mo122520j();
            C38816w1 w1Var = new C38816w1();
            C38670k6.f97995a.mo85045a(w1Var);
            return w1Var.mo122563c().mo122567a(j);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: f */
    public final C38596ea mo122315f(zzjf zzjf) {
        this.f97822a.mo122516f(zzjf);
        return this;
    }

    /* renamed from: g */
    public final C38596ea mo122316g(C38647i9 i9Var) {
        this.f97823b = i9Var;
        return this;
    }
}
