package androidx.camera.core.impl;

import com.google.common.util.concurrent.C32487a;

/* renamed from: androidx.camera.core.impl.g0 */
public final /* synthetic */ class C1454g0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32487a f4209a;

    public /* synthetic */ C1454g0(C32487a aVar) {
        this.f4209a = aVar;
    }

    public final void run() {
        this.f4209a.cancel(true);
    }
}
