package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import androidx.core.util.C17970d;

/* renamed from: androidx.camera.core.h3 */
public final /* synthetic */ class C1413h3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17970d f4074a;

    /* renamed from: b */
    public final /* synthetic */ Surface f4075b;

    public /* synthetic */ C1413h3(C17970d dVar, Surface surface) {
        this.f4074a = dVar;
        this.f4075b = surface;
    }

    public final void run() {
        this.f4074a.accept(SurfaceRequest.C1340e.m5640c(4, this.f4075b));
    }
}
