package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.C15740w;
import androidx.compose.p004ui.unit.C16476b;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.layout.v */
public final class C15607v extends C8767m.C8772d implements C15740w {
    @C12579k

    /* renamed from: z */
    public C11305q<? super C15568h0, ? super C15557e0, ? super C16476b, ? extends C15564g0> f38743z;

    public C15607v(@C12579k C11305q<? super C15568h0, ? super C15557e0, ? super C16476b, ? extends C15564g0> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "measureBlock");
        this.f38743z = qVar;
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo17122i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        return (C15564g0) this.f38743z.invoke(h0Var, e0Var, C16476b.m74348b(j));
    }

    @C12579k
    /* renamed from: j0 */
    public final C11305q<C15568h0, C15557e0, C16476b, C15564g0> mo44464j0() {
        return this.f38743z;
    }

    /* renamed from: k0 */
    public final void mo44465k0(@C12579k C11305q<? super C15568h0, ? super C15557e0, ? super C16476b, ? extends C15564g0> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        this.f38743z = qVar;
    }

    @C12579k
    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f38743z + ')';
    }
}
