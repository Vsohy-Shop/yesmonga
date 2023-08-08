package androidx.camera.core;

import java.io.File;

/* renamed from: androidx.camera.core.g2 */
public final /* synthetic */ class C1407g2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ImageSaver f4068a;

    /* renamed from: b */
    public final /* synthetic */ File f4069b;

    public /* synthetic */ C1407g2(ImageSaver imageSaver, File file) {
        this.f4068a = imageSaver;
        this.f4069b = file;
    }

    public final void run() {
        this.f4068a.m5590l(this.f4069b);
    }
}
