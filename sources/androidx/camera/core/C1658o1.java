package androidx.camera.core;

import androidx.camera.core.ImageCapture;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.o1 */
public final /* synthetic */ class C1658o1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f4629a;

    /* renamed from: b */
    public final /* synthetic */ ImageCapture.C1327u f4630b;

    /* renamed from: c */
    public final /* synthetic */ Executor f4631c;

    /* renamed from: d */
    public final /* synthetic */ ImageCapture.C1326t f4632d;

    public /* synthetic */ C1658o1(ImageCapture imageCapture, ImageCapture.C1327u uVar, Executor executor, ImageCapture.C1326t tVar) {
        this.f4629a = imageCapture;
        this.f4630b = uVar;
        this.f4631c = executor;
        this.f4632d = tVar;
    }

    public final void run() {
        this.f4629a.m5395J0(this.f4630b, this.f4631c, this.f4632d);
    }
}
