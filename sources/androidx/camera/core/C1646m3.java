package androidx.camera.core;

import androidx.camera.core.SurfaceRequest;

/* renamed from: androidx.camera.core.m3 */
public final /* synthetic */ class C1646m3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SurfaceRequest.C1343g f4600a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceRequest.C1342f f4601b;

    public /* synthetic */ C1646m3(SurfaceRequest.C1343g gVar, SurfaceRequest.C1342f fVar) {
        this.f4600a = gVar;
        this.f4601b = fVar;
    }

    public final void run() {
        this.f4600a.mo4943a(this.f4601b);
    }
}
