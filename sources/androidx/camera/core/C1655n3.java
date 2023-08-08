package androidx.camera.core;

import androidx.camera.core.SurfaceRequest;

/* renamed from: androidx.camera.core.n3 */
public final /* synthetic */ class C1655n3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SurfaceRequest.C1343g f4625a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceRequest.C1342f f4626b;

    public /* synthetic */ C1655n3(SurfaceRequest.C1343g gVar, SurfaceRequest.C1342f fVar) {
        this.f4625a = gVar;
        this.f4626b = fVar;
    }

    public final void run() {
        this.f4625a.mo4943a(this.f4626b);
    }
}
