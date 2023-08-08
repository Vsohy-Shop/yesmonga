package androidx.camera.camera2.internal;

import androidx.camera.core.impl.C1448f;
import androidx.camera.core.impl.CameraCaptureFailure;

/* renamed from: androidx.camera.camera2.internal.s */
public final /* synthetic */ class C1241s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1448f f3557a;

    /* renamed from: b */
    public final /* synthetic */ CameraCaptureFailure f3558b;

    public /* synthetic */ C1241s(C1448f fVar, CameraCaptureFailure cameraCaptureFailure) {
        this.f3557a = fVar;
        this.f3558b = cameraCaptureFailure;
    }

    public final void run() {
        this.f3557a.mo4264c(this.f3558b);
    }
}
