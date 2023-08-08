package androidx.camera.camera2.internal;

import android.util.Rational;
import androidx.camera.core.C1650n0;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.w1 */
public final /* synthetic */ class C1264w1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1036b2 f3620a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f3621b;

    /* renamed from: c */
    public final /* synthetic */ C1650n0 f3622c;

    /* renamed from: d */
    public final /* synthetic */ Rational f3623d;

    public /* synthetic */ C1264w1(C1036b2 b2Var, CallbackToFutureAdapter.C16559a aVar, C1650n0 n0Var, Rational rational) {
        this.f3620a = b2Var;
        this.f3621b = aVar;
        this.f3622c = n0Var;
        this.f3623d = rational;
    }

    public final void run() {
        this.f3620a.m4564G(this.f3621b, this.f3622c, this.f3623d);
    }
}
