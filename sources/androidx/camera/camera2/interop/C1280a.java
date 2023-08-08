package androidx.camera.camera2.interop;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.interop.a */
public final /* synthetic */ class C1280a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1288i f3657a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3658b;

    public /* synthetic */ C1280a(C1288i iVar, CallbackToFutureAdapter.C16559a aVar) {
        this.f3657a = iVar;
        this.f3658b = aVar;
    }

    public final void run() {
        this.f3657a.m5280q(this.f3658b);
    }
}
