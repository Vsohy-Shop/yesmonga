package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.node.C15740w;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.BlockGraphicsLayerModifier */
public final class BlockGraphicsLayerModifier extends C8767m.C8772d implements C15740w {
    @C12579k

    /* renamed from: z */
    public C11300l<? super C15327u2, C11079d2> f37285z;

    public BlockGraphicsLayerModifier(@C12579k C11300l<? super C15327u2, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "layerBlock");
        this.f37285z = lVar;
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo17122i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15611w0 t0 = e0Var.mo44324t0(j);
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new BlockGraphicsLayerModifier$measure$1(t0, this), 4, (Object) null);
    }

    @C12579k
    /* renamed from: j0 */
    public final C11300l<C15327u2, C11079d2> mo42324j0() {
        return this.f37285z;
    }

    /* renamed from: k0 */
    public final void mo42325k0(@C12579k C11300l<? super C15327u2, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f37285z = lVar;
    }

    @C12579k
    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f37285z + ')';
    }
}
