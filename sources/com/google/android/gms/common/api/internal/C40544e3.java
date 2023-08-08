package com.google.android.gms.common.api.internal;

import androidx.annotation.C0348i1;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.C40672u;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.common.api.internal.e3 */
public final class C40544e3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40669r f103360a;

    /* renamed from: b */
    public final /* synthetic */ C40562h3 f103361b;

    public C40544e3(C40562h3 h3Var, C40669r rVar) {
        this.f103361b = h3Var;
        this.f103360a = rVar;
    }

    @C0348i1
    public final void run() {
        C40507i iVar;
        try {
            ThreadLocal threadLocal = BasePendingResult.f103274p;
            threadLocal.set(Boolean.TRUE);
            C40663m c = ((C40672u) C40843u.m166202l(this.f103361b.f103385a)).mo134104c(this.f103360a);
            C40562h3 h3Var = this.f103361b;
            h3Var.f103392h.sendMessage(h3Var.f103392h.obtainMessage(0, c));
            threadLocal.set(Boolean.FALSE);
            C40562h3.m165066q(this.f103360a);
            iVar = (C40507i) this.f103361b.f103391g.get();
            if (iVar == null) {
                return;
            }
        } catch (RuntimeException e) {
            C40562h3 h3Var2 = this.f103361b;
            h3Var2.f103392h.sendMessage(h3Var2.f103392h.obtainMessage(1, e));
            BasePendingResult.f103274p.set(Boolean.FALSE);
            C40562h3.m165066q(this.f103360a);
            iVar = (C40507i) this.f103361b.f103391g.get();
            if (iVar == null) {
                return;
            }
        } catch (Throwable th) {
            BasePendingResult.f103274p.set(Boolean.FALSE);
            C40562h3.m165066q(this.f103360a);
            C40507i iVar2 = (C40507i) this.f103361b.f103391g.get();
            if (iVar2 != null) {
                iVar2.mo133744I(this.f103361b);
            }
            throw th;
        }
        iVar.mo133744I(this.f103361b);
    }
}
