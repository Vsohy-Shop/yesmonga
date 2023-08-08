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
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class WrapContentModifier extends C15988w0 implements C15603u {
    @C12579k

    /* renamed from: d */
    public final Direction f6228d;

    /* renamed from: e */
    public final boolean f6229e;
    @C12579k

    /* renamed from: f */
    public final C11304p<C16500q, LayoutDirection, C16494m> f6230f;
    @C12579k

    /* renamed from: g */
    public final Object f6231g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapContentModifier(@C12579k Direction direction, boolean z, @C12579k C11304p<? super C16500q, ? super LayoutDirection, C16494m> pVar, @C12579k Object obj, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(pVar, "alignmentCallback");
        Intrinsics.checkNotNullParameter(obj, "align");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f6228d = direction;
        this.f6229e = z;
        this.f6230f = pVar;
        this.f6231g = obj;
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof WrapContentModifier)) {
            return false;
        }
        WrapContentModifier wrapContentModifier = (WrapContentModifier) obj;
        if (this.f6228d == wrapContentModifier.f6228d && this.f6229e == wrapContentModifier.f6229e && Intrinsics.areEqual(this.f6231g, wrapContentModifier.f6231g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f6228d.hashCode() * 31) + Boolean.hashCode(this.f6229e)) * 31) + this.f6231g.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        int i;
        int i2;
        C15557e0 e0Var2 = e0Var;
        C15568h0 h0Var2 = h0Var;
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var2, "measurable");
        Direction direction = this.f6228d;
        Direction direction2 = Direction.Vertical;
        int i3 = 0;
        if (direction != direction2) {
            i = 0;
        } else {
            i = C16476b.m74364r(j);
        }
        Direction direction3 = this.f6228d;
        Direction direction4 = Direction.Horizontal;
        if (direction3 == direction4) {
            i3 = C16476b.m74363q(j);
        }
        int i4 = Integer.MAX_VALUE;
        if (this.f6228d == direction2 || !this.f6229e) {
            i2 = C16476b.m74362p(j);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (this.f6228d == direction4 || !this.f6229e) {
            i4 = C16476b.m74361o(j);
        }
        C15611w0 t0 = e0Var2.mo44324t0(C16478c.m74376a(i, i2, i3, i4));
        int I = C11479u.m44334I(t0.mo44471K0(), C16476b.m74364r(j), C16476b.m74362p(j));
        int I2 = C11479u.m44334I(t0.mo44468G0(), C16476b.m74363q(j), C16476b.m74361o(j));
        return C15568h0.m69206r2(h0Var, I, I2, (Map) null, new WrapContentModifier$measure$1(this, I, t0, I2, h0Var), 4, (Object) null);
    }
}
