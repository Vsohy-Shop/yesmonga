package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class FillModifier extends C15988w0 implements C15603u {
    @C12579k

    /* renamed from: d */
    public final Direction f6062d;

    /* renamed from: e */
    public final float f6063e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FillModifier(@C12579k Direction direction, float f, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f6062d = direction;
        this.f6063e = f;
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof FillModifier)) {
            return false;
        }
        FillModifier fillModifier = (FillModifier) obj;
        if (this.f6062d != fillModifier.f6062d) {
            return false;
        }
        return (this.f6063e > fillModifier.f6063e ? 1 : (this.f6063e == fillModifier.f6063e ? 0 : -1)) == 0;
    }

    public int hashCode() {
        return (this.f6062d.hashCode() * 31) + Float.hashCode(this.f6063e);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        if (!C16476b.m74356j(j) || this.f6062d == Direction.Vertical) {
            i2 = C16476b.m74364r(j);
            i = C16476b.m74362p(j);
        } else {
            i2 = C11479u.m44334I(C11409d.m43851L0(((float) C16476b.m74362p(j)) * this.f6063e), C16476b.m74364r(j), C16476b.m74362p(j));
            i = i2;
        }
        if (!C16476b.m74355i(j) || this.f6062d == Direction.Horizontal) {
            int q = C16476b.m74363q(j);
            i3 = C16476b.m74361o(j);
            i4 = q;
        } else {
            i4 = C11479u.m44334I(C11409d.m43851L0(((float) C16476b.m74361o(j)) * this.f6063e), C16476b.m74363q(j), C16476b.m74361o(j));
            i3 = i4;
        }
        C15611w0 t0 = e0Var.mo44324t0(C16478c.m74376a(i2, i, i4, i3));
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new FillModifier$measure$1(t0), 4, (Object) null);
    }
}
