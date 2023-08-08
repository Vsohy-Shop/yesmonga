package androidx.camera.core;

import android.os.HandlerThread;

/* renamed from: androidx.camera.core.o2 */
public final /* synthetic */ class C1659o2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ HandlerThread f4633a;

    public /* synthetic */ C1659o2(HandlerThread handlerThread) {
        this.f4633a = handlerThread;
    }

    public final void run() {
        this.f4633a.quitSafely();
    }
}
