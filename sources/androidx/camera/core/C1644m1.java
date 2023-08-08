package androidx.camera.core;

import androidx.camera.core.ImageCapture;

/* renamed from: androidx.camera.core.m1 */
public final /* synthetic */ class C1644m1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f4594a;

    /* renamed from: b */
    public final /* synthetic */ ImageCapture.C1325s f4595b;

    public /* synthetic */ C1644m1(ImageCapture imageCapture, ImageCapture.C1325s sVar) {
        this.f4594a = imageCapture;
        this.f4595b = sVar;
    }

    public final void run() {
        this.f4594a.m5392H0(this.f4595b);
    }
}
