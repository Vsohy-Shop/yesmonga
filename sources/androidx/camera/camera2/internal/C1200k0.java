package androidx.camera.camera2.internal;

import androidx.camera.core.UseCase;

/* renamed from: androidx.camera.camera2.internal.k0 */
public final /* synthetic */ class C1200k0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraImpl f3451a;

    /* renamed from: b */
    public final /* synthetic */ UseCase f3452b;

    public /* synthetic */ C1200k0(Camera2CameraImpl camera2CameraImpl, UseCase useCase) {
        this.f3451a = camera2CameraImpl;
        this.f3452b = useCase;
    }

    public final void run() {
        this.f3451a.m4412f0(this.f3452b);
    }
}
