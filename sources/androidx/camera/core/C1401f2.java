package androidx.camera.core;

import androidx.camera.core.ImageSaver;

/* renamed from: androidx.camera.core.f2 */
public final /* synthetic */ class C1401f2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ImageSaver f4057a;

    /* renamed from: b */
    public final /* synthetic */ ImageSaver.SaveError f4058b;

    /* renamed from: c */
    public final /* synthetic */ String f4059c;

    /* renamed from: d */
    public final /* synthetic */ Throwable f4060d;

    public /* synthetic */ C1401f2(ImageSaver imageSaver, ImageSaver.SaveError saveError, String str, Throwable th) {
        this.f4057a = imageSaver;
        this.f4058b = saveError;
        this.f4059c = str;
        this.f4060d = th;
    }

    public final void run() {
        this.f4057a.m5588j(this.f4058b, this.f4059c, this.f4060d);
    }
}
