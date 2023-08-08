package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.o1 */
public final /* synthetic */ class C1220o1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1236r1 f3500a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3501b;

    /* renamed from: c */
    public final /* synthetic */ int f3502c;

    public /* synthetic */ C1220o1(C1236r1 r1Var, CallbackToFutureAdapter.C16559a aVar, int i) {
        this.f3500a = r1Var;
        this.f3501b = aVar;
        this.f3502c = i;
    }

    public final void run() {
        this.f3500a.m5105h(this.f3501b, this.f3502c);
    }
}
