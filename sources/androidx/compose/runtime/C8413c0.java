package androidx.compose.runtime;

import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.c0 */
public final class C8413c0 implements C8616s1 {
    @C12579k

    /* renamed from: a */
    public final C11300l<C8434e0, C8430d0> f22764a;
    @C12580l

    /* renamed from: b */
    public C8430d0 f22765b;

    public C8413c0(@C12579k C11300l<? super C8434e0, ? extends C8430d0> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "effect");
        this.f22764a = lVar;
    }

    /* renamed from: d */
    public void mo8797d() {
        this.f22765b = this.f22764a.invoke(EffectsKt.f22672a);
    }

    /* renamed from: e */
    public void mo8799e() {
    }

    /* renamed from: g */
    public void mo8800g() {
        C8430d0 d0Var = this.f22765b;
        if (d0Var != null) {
            d0Var.mo791g();
        }
        this.f22765b = null;
    }
}
