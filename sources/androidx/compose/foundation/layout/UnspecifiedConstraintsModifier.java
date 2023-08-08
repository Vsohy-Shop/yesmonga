package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16483g;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class UnspecifiedConstraintsModifier extends C15988w0 implements C15603u {

    /* renamed from: d */
    public final float f6167d;

    /* renamed from: e */
    public final float f6168e;

    public /* synthetic */ UnspecifiedConstraintsModifier(float f, float f2, C11300l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, lVar);
    }

    /* renamed from: c */
    public int mo7060c(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        int d = lVar.mo44320d(i);
        if (!C16483g.m74440e0(this.f6168e, C16483g.f40871b.mo47828e())) {
            i2 = mVar.mo7429n2(this.f6168e);
        } else {
            i2 = 0;
        }
        return C11479u.m44447u(d, i2);
    }

    /* renamed from: d */
    public int mo7061d(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        int a0 = lVar.mo44317a0(i);
        if (!C16483g.m74440e0(this.f6168e, C16483g.f40871b.mo47828e())) {
            i2 = mVar.mo7429n2(this.f6168e);
        } else {
            i2 = 0;
        }
        return C11479u.m44447u(a0, i2);
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsModifier)) {
            return false;
        }
        UnspecifiedConstraintsModifier unspecifiedConstraintsModifier = (UnspecifiedConstraintsModifier) obj;
        if (!C16483g.m74440e0(this.f6167d, unspecifiedConstraintsModifier.f6167d) || !C16483g.m74440e0(this.f6168e, unspecifiedConstraintsModifier.f6168e)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo7062f(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        int o0 = lVar.mo44322o0(i);
        if (!C16483g.m74440e0(this.f6167d, C16483g.f40871b.mo47828e())) {
            i2 = mVar.mo7429n2(this.f6167d);
        } else {
            i2 = 0;
        }
        return C11479u.m44447u(o0, i2);
    }

    /* renamed from: h */
    public int mo7063h(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        int p0 = lVar.mo44323p0(i);
        if (!C16483g.m74440e0(this.f6167d, C16483g.f40871b.mo47828e())) {
            i2 = mVar.mo7429n2(this.f6167d);
        } else {
            i2 = 0;
        }
        return C11479u.m44447u(p0, i2);
    }

    public int hashCode() {
        return (C16483g.m74442h0(this.f6167d) * 31) + C16483g.m74442h0(this.f6168e);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        float f = this.f6167d;
        C16483g.C16484a aVar = C16483g.f40871b;
        if (C16483g.m74440e0(f, aVar.mo47828e()) || C16476b.m74364r(j) != 0) {
            i = C16476b.m74364r(j);
        } else {
            i = C11479u.m44447u(C11479u.m44313B(h0Var.mo7429n2(this.f6167d), C16476b.m74362p(j)), 0);
        }
        int p = C16476b.m74362p(j);
        if (C16483g.m74440e0(this.f6168e, aVar.mo47828e()) || C16476b.m74363q(j) != 0) {
            i2 = C16476b.m74363q(j);
        } else {
            i2 = C11479u.m44447u(C11479u.m44313B(h0Var.mo7429n2(this.f6168e), C16476b.m74361o(j)), 0);
        }
        C15611w0 t0 = e0Var.mo44324t0(C16478c.m74376a(i, p, i2, C16476b.m74361o(j)));
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new UnspecifiedConstraintsModifier$measure$1(t0), 4, (Object) null);
    }

    /* renamed from: r */
    public final float mo7881r() {
        return this.f6168e;
    }

    /* renamed from: s */
    public final float mo7882s() {
        return this.f6167d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UnspecifiedConstraintsModifier(float f, float f2, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C16483g.f40871b.mo47828e() : f, (i & 2) != 0 ? C16483g.f40871b.mo47828e() : f2, lVar, (DefaultConstructorMarker) null);
    }

    public UnspecifiedConstraintsModifier(float f, float f2, C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        this.f6167d = f;
        this.f6168e = f2;
    }
}
