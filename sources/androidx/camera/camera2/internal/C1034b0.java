package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: androidx.camera.camera2.internal.b0 */
public final /* synthetic */ class C1034b0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Surface f3179a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceTexture f3180b;

    public /* synthetic */ C1034b0(Surface surface, SurfaceTexture surfaceTexture) {
        this.f3179a = surface;
        this.f3180b = surfaceTexture;
    }

    public final void run() {
        Camera2CameraImpl.m4403W(this.f3179a, this.f3180b);
    }
}
