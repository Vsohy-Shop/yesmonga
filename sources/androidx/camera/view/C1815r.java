package androidx.camera.view;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewView;

/* renamed from: androidx.camera.view.r */
public final /* synthetic */ class C1815r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PreviewView.C1762a f4992a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceRequest f4993b;

    public /* synthetic */ C1815r(PreviewView.C1762a aVar, SurfaceRequest surfaceRequest) {
        this.f4992a = aVar;
        this.f4993b = surfaceRequest;
    }

    public final void run() {
        this.f4992a.m7041e(this.f4993b);
    }
}
