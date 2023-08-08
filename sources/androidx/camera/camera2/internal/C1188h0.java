package androidx.camera.camera2.internal;

import androidx.camera.core.UseCase;

/* renamed from: androidx.camera.camera2.internal.h0 */
public final /* synthetic */ class C1188h0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraImpl f3426a;

    /* renamed from: b */
    public final /* synthetic */ UseCase f3427b;

    public /* synthetic */ C1188h0(Camera2CameraImpl camera2CameraImpl, UseCase useCase) {
        this.f3426a = camera2CameraImpl;
        this.f3427b = useCase;
    }

    public final void run() {
        this.f3426a.m4409c0(this.f3427b);
    }
}
