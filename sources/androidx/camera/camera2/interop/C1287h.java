package androidx.camera.camera2.interop;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.interop.h */
public final /* synthetic */ class C1287h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1288i f3667a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3668b;

    public /* synthetic */ C1287h(C1288i iVar, CallbackToFutureAdapter.C16559a aVar) {
        this.f3667a = iVar;
        this.f3668b = aVar;
    }

    public final void run() {
        this.f3667a.m5286w(this.f3668b);
    }
}
