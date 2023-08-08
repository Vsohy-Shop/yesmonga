package com.contentsquare.android.sdk;

import android.app.Activity;
import com.contentsquare.android.sdk.C14313eg;
import com.contentsquare.android.sdk.C14439j3;
import com.contentsquare.android.sdk.C14760u2;
import java.util.Queue;

/* renamed from: com.contentsquare.android.sdk.n */
public class C14536n implements C14760u2.C14761a {

    /* renamed from: a */
    public final C14453jf f35973a;

    /* renamed from: b */
    public final C14234c0 f35974b;

    /* renamed from: c */
    public final C14265d3<C14439j3.C14440a> f35975c;

    /* renamed from: d */
    public final C14709se f35976d;

    /* renamed from: e */
    public C14313eg.C14314a f35977e = null;

    /* renamed from: com.contentsquare.android.sdk.n$a */
    public class C14537a extends C14234c0 {

        /* renamed from: f */
        public final /* synthetic */ C14870xf f35978f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14537a(C14454k kVar, C14837wc wcVar, C14453jf jfVar, C14803vc vcVar, C14870xf xfVar) {
            super(kVar, wcVar, jfVar, vcVar);
            this.f35978f = xfVar;
        }

        /* renamed from: f */
        public void mo34766f(Activity activity, int i, String str) {
            C14313eg.C14314a aVar = (C14313eg.C14314a) this.f35978f.mo36863b(4);
            aVar.mo35097w(i).mo35096v(str);
            C14536n nVar = C14536n.this;
            nVar.f35977e = aVar;
            nVar.mo35951c(aVar);
        }
    }

    public C14536n(C14454k kVar, C14837wc wcVar, C14265d3<C14439j3.C14440a> d3Var, C14760u2 u2Var, C14870xf xfVar, C14803vc vcVar, C14709se seVar) {
        C14453jf jfVar = new C14453jf("ScreenView");
        this.f35973a = jfVar;
        this.f35975c = d3Var;
        this.f35976d = seVar;
        u2Var.mo36548c(this);
        this.f35974b = new C14537a(kVar, wcVar, jfVar, vcVar, xfVar);
    }

    /* renamed from: a */
    public C14234c0 mo35949a() {
        return this.f35974b;
    }

    /* renamed from: b */
    public void mo35950b(Queue queue) {
        if (this.f35976d.mo36415a() != null) {
            mo35953e(queue);
        }
    }

    /* renamed from: c */
    public final void mo35951c(C14439j3.C14440a aVar) {
        this.f35975c.mo34827b(aVar);
    }

    /* renamed from: d */
    public void mo35952d() {
        C14313eg.C14314a aVar = this.f35977e;
        if (aVar != null) {
            mo35951c(aVar);
        }
    }

    /* renamed from: e */
    public void mo35953e(Queue<C14915z1> queue) {
        Activity a = this.f35976d.mo36415a();
        if (a != null) {
            while (true) {
                C14915z1 poll = queue.poll();
                if (poll != null) {
                    this.f35974b.mo34769i(a, poll.mo36942a(), 1);
                } else {
                    return;
                }
            }
        }
    }
}
