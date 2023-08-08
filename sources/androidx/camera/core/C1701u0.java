package androidx.camera.core;

import androidx.camera.core.C1689t0;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.u0 */
public final /* synthetic */ class C1701u0 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ C1711w0 f4737a;

    /* renamed from: b */
    public final /* synthetic */ Executor f4738b;

    /* renamed from: c */
    public final /* synthetic */ C1353a2 f4739c;

    /* renamed from: d */
    public final /* synthetic */ C1689t0.C1690a f4740d;

    public /* synthetic */ C1701u0(C1711w0 w0Var, Executor executor, C1353a2 a2Var, C1689t0.C1690a aVar) {
        this.f4737a = w0Var;
        this.f4738b = executor;
        this.f4739c = a2Var;
        this.f4740d = aVar;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f4737a.m6932j(this.f4738b, this.f4739c, this.f4740d, aVar);
    }
}
