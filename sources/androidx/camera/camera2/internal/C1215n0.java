package androidx.camera.camera2.internal;

import java.util.Collection;

/* renamed from: androidx.camera.camera2.internal.n0 */
public final /* synthetic */ class C1215n0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraImpl f3489a;

    /* renamed from: b */
    public final /* synthetic */ Collection f3490b;

    public /* synthetic */ C1215n0(Camera2CameraImpl camera2CameraImpl, Collection collection) {
        this.f3489a = camera2CameraImpl;
        this.f3490b = collection;
    }

    public final void run() {
        this.f3489a.m4405Y(this.f3490b);
    }
}
