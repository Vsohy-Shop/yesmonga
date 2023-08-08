package androidx.camera.camera2.internal;

import androidx.camera.core.UseCase;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.l0 */
public final /* synthetic */ class C1204l0 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraImpl f3457a;

    /* renamed from: b */
    public final /* synthetic */ UseCase f3458b;

    public /* synthetic */ C1204l0(Camera2CameraImpl camera2CameraImpl, UseCase useCase) {
        this.f3457a = camera2CameraImpl;
        this.f3458b = useCase;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f3457a.m4407a0(this.f3458b, aVar);
    }
}
