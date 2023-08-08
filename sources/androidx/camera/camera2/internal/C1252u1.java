package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.u1 */
public final /* synthetic */ class C1252u1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1036b2 f3574a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3575b;

    public /* synthetic */ C1252u1(C1036b2 b2Var, CallbackToFutureAdapter.C16559a aVar) {
        this.f3574a = b2Var;
        this.f3575b = aVar;
    }

    public final void run() {
        this.f3574a.m4558A(this.f3575b);
    }
}
