package androidx.camera.camera2.internal;

import java.util.Collection;

/* renamed from: androidx.camera.camera2.internal.a0 */
public final /* synthetic */ class C1024a0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Camera2CameraImpl f3164a;

    /* renamed from: b */
    public final /* synthetic */ Collection f3165b;

    public /* synthetic */ C1024a0(Camera2CameraImpl camera2CameraImpl, Collection collection) {
        this.f3164a = camera2CameraImpl;
        this.f3165b = collection;
    }

    public final void run() {
        this.f3164a.m4402V(this.f3165b);
    }
}
