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
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1024:1\n155#2:1025\n155#2:1026\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeModifier\n*L\n714#1:1025\n719#1:1026\n*E\n"})
public final class SizeModifier extends C15988w0 implements C15603u {

    /* renamed from: d */
    public final float f6160d;

    /* renamed from: e */
    public final float f6161e;

    /* renamed from: f */
    public final float f6162f;

    /* renamed from: g */
    public final float f6163g;

    /* renamed from: v */
    public final boolean f6164v;

    public /* synthetic */ SizeModifier(float f, float f2, float f3, float f4, boolean z, C11300l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, lVar);
    }

    /* renamed from: c */
    public int mo7060c(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        long r = mo7876r(mVar);
        if (C16476b.m74358l(r)) {
            return C16476b.m74361o(r);
        }
        return C16478c.m74381f(r, lVar.mo44320d(i));
    }

    /* renamed from: d */
    public int mo7061d(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        long r = mo7876r(mVar);
        if (C16476b.m74358l(r)) {
            return C16476b.m74361o(r);
        }
        return C16478c.m74381f(r, lVar.mo44317a0(i));
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof SizeModifier)) {
            return false;
        }
        SizeModifier sizeModifier = (SizeModifier) obj;
        if (!C16483g.m74440e0(this.f6160d, sizeModifier.f6160d) || !C16483g.m74440e0(this.f6161e, sizeModifier.f6161e) || !C16483g.m74440e0(this.f6162f, sizeModifier.f6162f) || !C16483g.m74440e0(this.f6163g, sizeModifier.f6163g) || this.f6164v != sizeModifier.f6164v) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo7062f(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        long r = mo7876r(mVar);
        if (C16476b.m74360n(r)) {
            return C16476b.m74362p(r);
        }
        return C16478c.m74382g(r, lVar.mo44322o0(i));
    }

    /* renamed from: h */
    public int mo7063h(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        long r = mo7876r(mVar);
        if (C16476b.m74360n(r)) {
            return C16476b.m74362p(r);
        }
        return C16478c.m74382g(r, lVar.mo44323p0(i));
    }

    public int hashCode() {
        return ((((((C16483g.m74442h0(this.f6160d) * 31) + C16483g.m74442h0(this.f6161e)) * 31) + C16483g.m74442h0(this.f6162f)) * 31) + C16483g.m74442h0(this.f6163g)) * 31;
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        long r = mo7876r(h0Var);
        if (this.f6164v) {
            j2 = C16478c.m74380e(j, r);
        } else {
            float f = this.f6160d;
            C16483g.C16484a aVar = C16483g.f40871b;
            if (!C16483g.m74440e0(f, aVar.mo47828e())) {
                i = C16476b.m74364r(r);
            } else {
                i = C11479u.m44313B(C16476b.m74364r(j), C16476b.m74362p(r));
            }
            if (!C16483g.m74440e0(this.f6162f, aVar.mo47828e())) {
                i2 = C16476b.m74362p(r);
            } else {
                i2 = C11479u.m44447u(C16476b.m74362p(j), C16476b.m74364r(r));
            }
            if (!C16483g.m74440e0(this.f6161e, aVar.mo47828e())) {
                i3 = C16476b.m74363q(r);
            } else {
                i3 = C11479u.m44313B(C16476b.m74363q(j), C16476b.m74361o(r));
            }
            if (!C16483g.m74440e0(this.f6163g, aVar.mo47828e())) {
                i4 = C16476b.m74361o(r);
            } else {
                i4 = C11479u.m44447u(C16476b.m74361o(j), C16476b.m74363q(r));
            }
            j2 = C16478c.m74376a(i, i2, i3, i4);
        }
        C15611w0 t0 = e0Var.mo44324t0(j2);
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new SizeModifier$measure$1(t0), 4, (Object) null);
    }

    /* renamed from: r */
    public final long mo7876r(C16479d dVar) {
        int i;
        int i2;
        int i3;
        int u;
        float f = this.f6162f;
        C16483g.C16484a aVar = C16483g.f40871b;
        int i4 = 0;
        if (!C16483g.m74440e0(f, aVar.mo47828e())) {
            i = dVar.mo7429n2(((C16483g) C11479u.m44453w(C16483g.m74451w(this.f6162f), C16483g.m74451w(C16483g.m74435M((float) 0)))).mo47823t0());
        } else {
            i = Integer.MAX_VALUE;
        }
        if (!C16483g.m74440e0(this.f6163g, aVar.mo47828e())) {
            i2 = dVar.mo7429n2(((C16483g) C11479u.m44453w(C16483g.m74451w(this.f6163g), C16483g.m74451w(C16483g.m74435M((float) 0)))).mo47823t0());
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (C16483g.m74440e0(this.f6160d, aVar.mo47828e()) || (i3 = C11479u.m44447u(C11479u.m44313B(dVar.mo7429n2(this.f6160d), i), 0)) == Integer.MAX_VALUE) {
            i3 = 0;
        }
        if (!C16483g.m74440e0(this.f6161e, aVar.mo47828e()) && (u = C11479u.m44447u(C11479u.m44313B(dVar.mo7429n2(this.f6161e), i2), 0)) != Integer.MAX_VALUE) {
            i4 = u;
        }
        return C16478c.m74376a(i3, i, i4, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SizeModifier(float f, float f2, float f3, float f4, boolean z, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C16483g.f40871b.mo47828e() : f, (i & 2) != 0 ? C16483g.f40871b.mo47828e() : f2, (i & 4) != 0 ? C16483g.f40871b.mo47828e() : f3, (i & 8) != 0 ? C16483g.f40871b.mo47828e() : f4, z, lVar, (DefaultConstructorMarker) null);
    }

    public SizeModifier(float f, float f2, float f3, float f4, boolean z, C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        this.f6160d = f;
        this.f6161e = f2;
        this.f6162f = f3;
        this.f6163g = f4;
        this.f6164v = z;
    }
}
