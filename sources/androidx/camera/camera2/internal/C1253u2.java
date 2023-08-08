package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.u2 */
public final /* synthetic */ class C1253u2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1260v2 f3576a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3577b;

    /* renamed from: c */
    public final /* synthetic */ boolean f3578c;

    public /* synthetic */ C1253u2(C1260v2 v2Var, CallbackToFutureAdapter.C16559a aVar, boolean z) {
        this.f3576a = v2Var;
        this.f3577b = aVar;
        this.f3578c = z;
    }

    public final void run() {
        this.f3576a.m5242f(this.f3577b, this.f3578c);
    }
}
