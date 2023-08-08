package androidx.camera.core;

import android.view.Surface;

/* renamed from: androidx.camera.core.s3 */
public final /* synthetic */ class C1687s3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Surface f4683a;

    public /* synthetic */ C1687s3(Surface surface) {
        this.f4683a = surface;
    }

    public final void run() {
        this.f4683a.release();
    }
}
