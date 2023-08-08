package androidx.constraintlayout.compose;

import androidx.compose.p004ui.unit.C16483g;
import androidx.constraintlayout.compose.Dimension;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.constraintlayout.compose.s */
public final class C16627s implements Dimension.C16576a, Dimension.C16578c, Dimension.C16577b, Dimension {
    @C12579k

    /* renamed from: b */
    public final C11300l<C16611l0, androidx.constraintlayout.core.state.Dimension> f41312b;
    @C12580l

    /* renamed from: c */
    public C16483g f41313c;
    @C12580l

    /* renamed from: d */
    public Object f41314d;
    @C12580l

    /* renamed from: e */
    public C16483g f41315e;
    @C12580l

    /* renamed from: f */
    public Object f41316f;

    public C16627s(@C12579k C11300l<? super C16611l0, ? extends androidx.constraintlayout.core.state.Dimension> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "baseDimension");
        this.f41312b = lVar;
    }

    @C12580l
    /* renamed from: a */
    public final C16483g mo48579a() {
        return this.f41315e;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo48580b() {
        return this.f41316f;
    }

    @C12580l
    /* renamed from: c */
    public final C16483g mo48581c() {
        return this.f41313c;
    }

    @C12580l
    /* renamed from: d */
    public final Object mo48582d() {
        return this.f41314d;
    }

    /* renamed from: e */
    public final void mo48583e(@C12580l C16483g gVar) {
        this.f41315e = gVar;
    }

    /* renamed from: f */
    public final void mo48584f(@C12580l Object obj) {
        this.f41316f = obj;
    }

    /* renamed from: g */
    public final void mo48585g(@C12580l C16483g gVar) {
        this.f41313c = gVar;
    }

    /* renamed from: h */
    public final void mo48586h(@C12580l Object obj) {
        this.f41314d = obj;
    }

    @C12579k
    /* renamed from: i */
    public final androidx.constraintlayout.core.state.Dimension mo48587i(@C12579k C16611l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        androidx.constraintlayout.core.state.Dimension invoke = this.f41312b.invoke(l0Var);
        if (mo48582d() != null) {
            invoke.mo49296r(mo48582d());
        } else if (mo48581c() != null) {
            C16483g c = mo48581c();
            Intrinsics.checkNotNull(c);
            invoke.mo49295q(l0Var.mo48546f(c));
        }
        if (mo48580b() != null) {
            invoke.mo49294p(mo48580b());
        } else if (mo48579a() != null) {
            C16483g a = mo48579a();
            Intrinsics.checkNotNull(a);
            invoke.mo49293o(l0Var.mo48546f(a));
        }
        return invoke;
    }
}
