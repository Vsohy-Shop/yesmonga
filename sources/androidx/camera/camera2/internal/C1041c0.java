package androidx.camera.camera2.internal;

import androidx.camera.core.impl.DeferrableSurface;

/* renamed from: androidx.camera.camera2.internal.c0 */
public final /* synthetic */ class C1041c0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraImpl f3216a;

    /* renamed from: b */
    public final /* synthetic */ CaptureSession f3217b;

    /* renamed from: c */
    public final /* synthetic */ DeferrableSurface f3218c;

    /* renamed from: d */
    public final /* synthetic */ Runnable f3219d;

    public /* synthetic */ C1041c0(Camera2CameraImpl camera2CameraImpl, CaptureSession captureSession, DeferrableSurface deferrableSurface, Runnable runnable) {
        this.f3216a = camera2CameraImpl;
        this.f3217b = captureSession;
        this.f3218c = deferrableSurface;
        this.f3219d = runnable;
    }

    public final void run() {
        this.f3216a.m4404X(this.f3217b, this.f3218c, this.f3219d);
    }
}
