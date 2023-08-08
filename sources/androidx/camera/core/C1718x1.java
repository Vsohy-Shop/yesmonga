package androidx.camera.core;

import androidx.camera.core.ImageCapture;

/* renamed from: androidx.camera.core.x1 */
public final /* synthetic */ class C1718x1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture.C1320p f4772a;

    /* renamed from: b */
    public final /* synthetic */ int f4773b;

    /* renamed from: c */
    public final /* synthetic */ String f4774c;

    /* renamed from: d */
    public final /* synthetic */ Throwable f4775d;

    public /* synthetic */ C1718x1(ImageCapture.C1320p pVar, int i, String str, Throwable th) {
        this.f4772a = pVar;
        this.f4773b = i;
        this.f4774c = str;
        this.f4775d = th;
    }

    public final void run() {
        this.f4772a.m5545f(this.f4773b, this.f4774c, this.f4775d);
    }
}
