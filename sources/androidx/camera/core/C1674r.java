package androidx.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.r */
public final /* synthetic */ class C1674r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CameraX f4654a;

    /* renamed from: b */
    public final /* synthetic */ Executor f4655b;

    /* renamed from: c */
    public final /* synthetic */ long f4656c;

    /* renamed from: d */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f4657d;

    public /* synthetic */ C1674r(CameraX cameraX, Executor executor, long j, CallbackToFutureAdapter.C16559a aVar) {
        this.f4654a = cameraX;
        this.f4655b = executor;
        this.f4656c = j;
        this.f4657d = aVar;
    }

    public final void run() {
        this.f4654a.m5338I(this.f4655b, this.f4656c, this.f4657d);
    }
}
