package androidx.camera.core;

import android.net.Uri;

/* renamed from: androidx.camera.core.e2 */
public final /* synthetic */ class C1392e2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ImageSaver f4036a;

    /* renamed from: b */
    public final /* synthetic */ Uri f4037b;

    public /* synthetic */ C1392e2(ImageSaver imageSaver, Uri uri) {
        this.f4036a = imageSaver;
        this.f4037b = uri;
    }

    public final void run() {
        this.f4036a.m5589k(this.f4037b);
    }
}
