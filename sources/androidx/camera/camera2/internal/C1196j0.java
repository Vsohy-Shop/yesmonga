package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.j0 */
public final /* synthetic */ class C1196j0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraImpl f3442a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3443b;

    public /* synthetic */ C1196j0(Camera2CameraImpl camera2CameraImpl, CallbackToFutureAdapter.C16559a aVar) {
        this.f3442a = camera2CameraImpl;
        this.f3443b = aVar;
    }

    public final void run() {
        this.f3442a.m4414h0(this.f3443b);
    }
}
