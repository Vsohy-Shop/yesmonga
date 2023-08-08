package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16483g;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n*L\n405#1:437\n406#1:438\n407#1:439\n408#1:440\n*E\n"})
public final class PaddingValuesModifier extends C15988w0 implements C15603u {
    @C12579k

    /* renamed from: d */
    public final C2366i0 f6139d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier(@C12579k C2366i0 i0Var, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f6139d = i0Var;
    }

    public boolean equals(@C12580l Object obj) {
        PaddingValuesModifier paddingValuesModifier;
        if (obj instanceof PaddingValuesModifier) {
            paddingValuesModifier = (PaddingValuesModifier) obj;
        } else {
            paddingValuesModifier = null;
        }
        if (paddingValuesModifier == null) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.f6139d, (Object) paddingValuesModifier.f6139d);
    }

    public int hashCode() {
        return this.f6139d.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        boolean z = false;
        float f = (float) 0;
        if (C16483g.m74452z(this.f6139d.mo8091b(h0Var.getLayoutDirection()), C16483g.m74435M(f)) >= 0 && C16483g.m74452z(this.f6139d.mo8093d(), C16483g.m74435M(f)) >= 0 && C16483g.m74452z(this.f6139d.mo8092c(h0Var.getLayoutDirection()), C16483g.m74435M(f)) >= 0 && C16483g.m74452z(this.f6139d.mo8090a(), C16483g.m74435M(f)) >= 0) {
            z = true;
        }
        if (z) {
            int n2 = h0Var.mo7429n2(this.f6139d.mo8091b(h0Var.getLayoutDirection())) + h0Var.mo7429n2(this.f6139d.mo8092c(h0Var.getLayoutDirection()));
            int n22 = h0Var.mo7429n2(this.f6139d.mo8093d()) + h0Var.mo7429n2(this.f6139d.mo8090a());
            C15611w0 t0 = e0Var.mo44324t0(C16478c.m74384i(j, -n2, -n22));
            return C15568h0.m69206r2(h0Var, C16478c.m74382g(j, t0.mo44471K0() + n2), C16478c.m74381f(j, t0.mo44468G0() + n22), (Map) null, new PaddingValuesModifier$measure$2(t0, h0Var, this), 4, (Object) null);
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    @C12579k
    /* renamed from: r */
    public final C2366i0 mo7836r() {
        return this.f6139d;
    }
}
