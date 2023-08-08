package androidx.camera.camera2.internal;

import androidx.camera.core.C1403f4;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.y2 */
public final /* synthetic */ class C1275y2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1029a3 f3646a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3647b;

    /* renamed from: c */
    public final /* synthetic */ C1403f4 f3648c;

    public /* synthetic */ C1275y2(C1029a3 a3Var, CallbackToFutureAdapter.C16559a aVar, C1403f4 f4Var) {
        this.f3646a = a3Var;
        this.f3647b = aVar;
        this.f3648c = f4Var;
    }

    public final void run() {
        this.f3646a.m4534m(this.f3647b, this.f3648c);
    }
}
