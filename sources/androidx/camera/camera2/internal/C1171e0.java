package androidx.camera.camera2.internal;

import androidx.camera.core.UseCase;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.e0 */
public final /* synthetic */ class C1171e0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraImpl f3379a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3380b;

    /* renamed from: c */
    public final /* synthetic */ UseCase f3381c;

    public /* synthetic */ C1171e0(Camera2CameraImpl camera2CameraImpl, CallbackToFutureAdapter.C16559a aVar, UseCase useCase) {
        this.f3379a = camera2CameraImpl;
        this.f3380b = aVar;
        this.f3381c = useCase;
    }

    public final void run() {
        this.f3379a.m4408b0(this.f3380b, this.f3381c);
    }
}
