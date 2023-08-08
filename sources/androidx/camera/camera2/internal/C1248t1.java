package androidx.camera.camera2.internal;

import android.util.Rational;
import androidx.camera.core.C1650n0;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.camera2.internal.t1 */
public final /* synthetic */ class C1248t1 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ C1036b2 f3567a;

    /* renamed from: b */
    public final /* synthetic */ C1650n0 f3568b;

    /* renamed from: c */
    public final /* synthetic */ Rational f3569c;

    public /* synthetic */ C1248t1(C1036b2 b2Var, C1650n0 n0Var, Rational rational) {
        this.f3567a = b2Var;
        this.f3568b = n0Var;
        this.f3569c = rational;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f3567a.m4565H(this.f3568b, this.f3569c, aVar);
    }
}
