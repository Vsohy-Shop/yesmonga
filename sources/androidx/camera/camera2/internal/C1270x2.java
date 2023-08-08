package androidx.camera.camera2.internal;

import androidx.camera.core.C1403f4;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.x2 */
public final /* synthetic */ class C1270x2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1029a3 f3637a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3638b;

    /* renamed from: c */
    public final /* synthetic */ C1403f4 f3639c;

    public /* synthetic */ C1270x2(C1029a3 a3Var, CallbackToFutureAdapter.C16559a aVar, C1403f4 f4Var) {
        this.f3637a = a3Var;
        this.f3638b = aVar;
        this.f3639c = f4Var;
    }

    public final void run() {
        this.f3637a.m4532k(this.f3638b, this.f3639c);
    }
}
