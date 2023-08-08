package androidx.camera.core;

import androidx.camera.core.C1689t0;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.v0 */
public final /* synthetic */ class C1706v0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1711w0 f4746a;

    /* renamed from: b */
    public final /* synthetic */ C1353a2 f4747b;

    /* renamed from: c */
    public final /* synthetic */ C1689t0.C1690a f4748c;

    /* renamed from: d */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f4749d;

    public /* synthetic */ C1706v0(C1711w0 w0Var, C1353a2 a2Var, C1689t0.C1690a aVar, CallbackToFutureAdapter.C16559a aVar2) {
        this.f4746a = w0Var;
        this.f4747b = a2Var;
        this.f4748c = aVar;
        this.f4749d = aVar2;
    }

    public final void run() {
        this.f4746a.m6931i(this.f4747b, this.f4748c, this.f4749d);
    }
}
