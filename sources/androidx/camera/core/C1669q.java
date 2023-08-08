package androidx.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.q */
public final /* synthetic */ class C1669q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CameraX f4647a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f4648b;

    public /* synthetic */ C1669q(CameraX cameraX, CallbackToFutureAdapter.C16559a aVar) {
        this.f4647a = cameraX;
        this.f4648b = aVar;
    }

    public final void run() {
        this.f4647a.m5344O(this.f4648b);
    }
}
