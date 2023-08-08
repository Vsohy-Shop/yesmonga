package androidx.camera.camera2.internal;

import androidx.camera.core.UseCase;

/* renamed from: androidx.camera.camera2.internal.d0 */
public final /* synthetic */ class C1167d0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraImpl f3377a;

    /* renamed from: b */
    public final /* synthetic */ UseCase f3378b;

    public /* synthetic */ C1167d0(Camera2CameraImpl camera2CameraImpl, UseCase useCase) {
        this.f3377a = camera2CameraImpl;
        this.f3378b = useCase;
    }

    public final void run() {
        this.f3377a.m4411e0(this.f3378b);
    }
}
