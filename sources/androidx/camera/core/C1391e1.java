package androidx.camera.core;

import com.google.common.util.concurrent.C32487a;

/* renamed from: androidx.camera.core.e1 */
public final /* synthetic */ class C1391e1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32487a f4035a;

    public /* synthetic */ C1391e1(C32487a aVar) {
        this.f4035a = aVar;
    }

    public final void run() {
        this.f4035a.cancel(true);
    }
}
