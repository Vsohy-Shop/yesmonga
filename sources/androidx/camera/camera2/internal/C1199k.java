package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.k */
public final /* synthetic */ class C1199k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1254v f3449a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3450b;

    public /* synthetic */ C1199k(C1254v vVar, CallbackToFutureAdapter.C16559a aVar) {
        this.f3449a = vVar;
        this.f3450b = aVar;
    }

    public final void run() {
        this.f3449a.m5162f0(this.f3450b);
    }
}
