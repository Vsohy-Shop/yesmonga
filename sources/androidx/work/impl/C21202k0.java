package androidx.work.impl;

import androidx.work.C21414w;
import androidx.work.impl.utils.futures.C21317a;

/* renamed from: androidx.work.impl.k0 */
public final /* synthetic */ class C21202k0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21317a f54720a;

    /* renamed from: b */
    public final /* synthetic */ C21191g0 f54721b;

    /* renamed from: c */
    public final /* synthetic */ C21414w f54722c;

    public /* synthetic */ C21202k0(C21317a aVar, C21191g0 g0Var, C21414w wVar) {
        this.f54720a = aVar;
        this.f54721b = g0Var;
        this.f54722c = wVar;
    }

    public final void run() {
        WorkerUpdater.m97687j(this.f54720a, this.f54721b, this.f54722c);
    }
}
