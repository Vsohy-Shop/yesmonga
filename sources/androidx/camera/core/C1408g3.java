package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import androidx.core.util.C17970d;

/* renamed from: androidx.camera.core.g3 */
public final /* synthetic */ class C1408g3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17970d f4070a;

    /* renamed from: b */
    public final /* synthetic */ Surface f4071b;

    public /* synthetic */ C1408g3(C17970d dVar, Surface surface) {
        this.f4070a = dVar;
        this.f4071b = surface;
    }

    public final void run() {
        this.f4070a.accept(SurfaceRequest.C1340e.m5640c(3, this.f4071b));
    }
}
