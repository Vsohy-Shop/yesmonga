package com.google.android.gms.internal.gtm;

import androidx.annotation.C0348i1;

/* renamed from: com.google.android.gms.internal.gtm.s5 */
public final class C41564s5 implements Runnable {

    /* renamed from: a */
    public final C41213df f104941a;

    /* renamed from: b */
    public final /* synthetic */ C41588t5 f104942b;

    public C41564s5(C41588t5 t5Var, C41213df dfVar) {
        this.f104942b = t5Var;
        this.f104941a = dfVar;
    }

    @C0348i1
    public final void run() {
        String str;
        String str2;
        C41550rf c = this.f104941a.mo135227b().mo135176c();
        C41142ag c2 = this.f104941a.mo135228c();
        C41205d7 f = this.f104942b.f104990l;
        C41588t5 t5Var = this.f104942b;
        t5Var.f104990l = t5Var.f104983e.mo135362a(c, c2);
        this.f104942b.f104991m = 2;
        String i = this.f104942b.f104980b;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 48);
        sb.append("Container ");
        sb.append(i);
        sb.append(" loaded during runtime initialization.");
        C41493p6.m168152d(sb.toString());
        if (this.f104942b.f104992n != null) {
            for (C41132a6 a6Var : this.f104942b.f104992n) {
                String valueOf = String.valueOf(a6Var.mo134998e());
                if (valueOf.length() != 0) {
                    str2 = "Evaluating tags for pending event ".concat(valueOf);
                } else {
                    str2 = new String("Evaluating tags for pending event ");
                }
                C41493p6.m168152d(str2);
                this.f104942b.f104990l.mo135217f(a6Var);
            }
            this.f104942b.f104992n = null;
        }
        this.f104942b.f104990l.mo135216e();
        String valueOf2 = String.valueOf(this.f104942b.f104980b);
        if (valueOf2.length() != 0) {
            str = "Runtime initialized successfully for container ".concat(valueOf2);
        } else {
            str = new String("Runtime initialized successfully for container ");
        }
        C41493p6.m168152d(str);
        long a = this.f104941a.mo135227b().mo135174a() + this.f104942b.f104989k.mo135966b();
        if (f != null || !this.f104942b.f104994p || this.f104941a.mo135226a() != 1 || a >= this.f104942b.f104988j.mo134768a()) {
            C41588t5 t5Var2 = this.f104942b;
            C41588t5.m168390r(t5Var2, Math.max(900000, a - t5Var2.f104988j.mo134768a()));
            return;
        }
        C41588t5 t5Var3 = this.f104942b;
        C41588t5.m168390r(t5Var3, t5Var3.f104989k.mo135965a());
    }
}
