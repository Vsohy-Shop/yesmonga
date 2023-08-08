package androidx.camera.camera2.interop;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.interop.g */
public final /* synthetic */ class C1286g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1288i f3665a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3666b;

    public /* synthetic */ C1286g(C1288i iVar, CallbackToFutureAdapter.C16559a aVar) {
        this.f3665a = iVar;
        this.f3666b = aVar;
    }

    public final void run() {
        this.f3665a.m5282s(this.f3666b);
    }
}
