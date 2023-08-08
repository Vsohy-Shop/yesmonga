package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14198b2;
import com.contentsquare.android.sdk.C14213b7;

/* renamed from: com.contentsquare.android.sdk.ag */
public class C14191ag implements C14213b7.C14214a {

    /* renamed from: a */
    public final C14213b7 f35072a;

    /* renamed from: b */
    public final C14192a f35073b;

    /* renamed from: com.contentsquare.android.sdk.ag$a */
    public static class C14192a {
        /* renamed from: a */
        public void mo34551a(C14198b2.C14202d dVar) {
            C14453jf.m62244b(dVar);
        }
    }

    public C14191ag(C14192a aVar, C14213b7 b7Var) {
        this.f35072a = b7Var;
        b7Var.mo34675g(this);
        this.f35073b = aVar;
        mo34550a();
    }

    /* renamed from: a */
    public final void mo34550a() {
        C14198b2.C14202d dVar = C14198b2.C14202d.f35091a;
        if (this.f35072a.mo34676h(C14477k8.CLIENT_MODE_ACTIVATION_STATE, false)) {
            dVar = C14198b2.C14202d.INFO;
        }
        if (this.f35072a.mo34676h(C14477k8.VERBOSE_LOG, false)) {
            dVar = C14198b2.C14202d.VERBOSE;
        }
        this.f35073b.mo34551a(dVar);
    }

    /* renamed from: d */
    public void mo34382d(String str) {
        if (C14477k8.VERBOSE_LOG.mo35776b(str) || C14477k8.CLIENT_MODE_ACTIVATION_STATE.mo35776b(str)) {
            mo34550a();
        }
    }
}
