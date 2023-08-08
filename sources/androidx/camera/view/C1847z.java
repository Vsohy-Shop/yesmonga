package androidx.camera.view;

import androidx.camera.core.SurfaceRequest;

/* renamed from: androidx.camera.view.z */
public final /* synthetic */ class C1847z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1768b0 f5042a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceRequest f5043b;

    public /* synthetic */ C1847z(C1768b0 b0Var, SurfaceRequest surfaceRequest) {
        this.f5042a = b0Var;
        this.f5043b = surfaceRequest;
    }

    public final void run() {
        this.f5042a.m7048n(this.f5043b);
    }
}
