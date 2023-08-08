package androidx.camera.core;

import androidx.camera.core.ImageCapture;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.n1 */
public final /* synthetic */ class C1653n1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f4621a;

    /* renamed from: b */
    public final /* synthetic */ Executor f4622b;

    /* renamed from: c */
    public final /* synthetic */ ImageCapture.C1325s f4623c;

    public /* synthetic */ C1653n1(ImageCapture imageCapture, Executor executor, ImageCapture.C1325s sVar) {
        this.f4621a = imageCapture;
        this.f4622b = executor;
        this.f4623c = sVar;
    }

    public final void run() {
        this.f4621a.m5393I0(this.f4622b, this.f4623c);
    }
}
