package androidx.camera.view;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.PreviewView;

/* renamed from: androidx.camera.view.s */
public final /* synthetic */ class C1816s implements SurfaceRequest.C1343g {

    /* renamed from: a */
    public final /* synthetic */ PreviewView.C1762a f4994a;

    /* renamed from: b */
    public final /* synthetic */ CameraInternal f4995b;

    /* renamed from: c */
    public final /* synthetic */ SurfaceRequest f4996c;

    public /* synthetic */ C1816s(PreviewView.C1762a aVar, CameraInternal cameraInternal, SurfaceRequest surfaceRequest) {
        this.f4994a = aVar;
        this.f4995b = cameraInternal;
        this.f4996c = surfaceRequest;
    }

    /* renamed from: a */
    public final void mo4943a(SurfaceRequest.C1342f fVar) {
        this.f4994a.m7042f(this.f4995b, this.f4996c, fVar);
    }
}
