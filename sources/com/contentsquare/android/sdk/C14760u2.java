package com.contentsquare.android.sdk;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.contentsquare.android.sdk.u2 */
public class C14760u2 {

    /* renamed from: c */
    public static volatile C14760u2 f36533c;

    /* renamed from: a */
    public final Queue<C14915z1> f36534a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public C14761a f36535b;

    /* renamed from: com.contentsquare.android.sdk.u2$a */
    public interface C14761a {
        /* renamed from: b */
        void mo35950b(Queue<C14915z1> queue);
    }

    /* renamed from: e */
    public static C14760u2 m63605e() {
        if (f36533c == null) {
            synchronized (C14760u2.class) {
                if (f36533c == null) {
                    f36533c = new C14760u2();
                }
            }
        }
        return f36533c;
    }

    /* renamed from: a */
    public void mo36546a() {
        this.f36534a.clear();
    }

    /* renamed from: b */
    public void mo36547b(C14915z1 z1Var) {
        C14549na d = C14549na.m62704d();
        if (d != null && d.mo35986g().mo34676h(C14477k8.TRACKING_ENABLE, false)) {
            this.f36534a.add(z1Var);
            C14761a aVar = this.f36535b;
            if (aVar != null) {
                aVar.mo35950b(this.f36534a);
            }
        }
    }

    /* renamed from: c */
    public void mo36548c(C14761a aVar) {
        this.f36535b = aVar;
    }

    /* renamed from: d */
    public Queue<C14915z1> mo36549d() {
        return this.f36534a;
    }
}
