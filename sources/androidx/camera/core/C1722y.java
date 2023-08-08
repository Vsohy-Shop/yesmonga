package androidx.camera.core;

import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.y */
public final /* synthetic */ class C1722y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CameraX f4796a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f4797b;

    public /* synthetic */ C1722y(CameraX cameraX, CallbackToFutureAdapter.C16559a aVar) {
        this.f4796a = cameraX;
        this.f4797b = aVar;
    }

    public final void run() {
        C1548f.m6482k(this.f4796a.mo4774U(), this.f4797b);
    }
}
