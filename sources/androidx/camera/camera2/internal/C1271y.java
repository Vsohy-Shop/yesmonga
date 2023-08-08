package androidx.camera.camera2.internal;

import androidx.camera.core.UseCase;

/* renamed from: androidx.camera.camera2.internal.y */
public final /* synthetic */ class C1271y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraImpl f3640a;

    /* renamed from: b */
    public final /* synthetic */ UseCase f3641b;

    public /* synthetic */ C1271y(Camera2CameraImpl camera2CameraImpl, UseCase useCase) {
        this.f3640a = camera2CameraImpl;
        this.f3641b = useCase;
    }

    public final void run() {
        this.f3640a.m4410d0(this.f3641b);
    }
}
