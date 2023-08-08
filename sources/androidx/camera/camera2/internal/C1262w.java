package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.C1254v;

/* renamed from: androidx.camera.camera2.internal.w */
public final /* synthetic */ class C1262w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1254v.C1256b f3617a;

    /* renamed from: b */
    public final /* synthetic */ TotalCaptureResult f3618b;

    public /* synthetic */ C1262w(C1254v.C1256b bVar, TotalCaptureResult totalCaptureResult) {
        this.f3617a = bVar;
        this.f3618b = totalCaptureResult;
    }

    public final void run() {
        this.f3617a.m5231c(this.f3618b);
    }
}
