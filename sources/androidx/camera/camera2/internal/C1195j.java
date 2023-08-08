package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.j */
public final /* synthetic */ class C1195j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1254v f3440a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3441b;

    public /* synthetic */ C1195j(C1254v vVar, CallbackToFutureAdapter.C16559a aVar) {
        this.f3440a = vVar;
        this.f3441b = aVar;
    }

    public final void run() {
        this.f3440a.m5160d0(this.f3441b);
    }
}
