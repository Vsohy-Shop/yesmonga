package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ScrollingLayoutModifier implements C15603u {
    @C12579k

    /* renamed from: a */
    public final ScrollState f5792a;

    /* renamed from: b */
    public final boolean f5793b;

    /* renamed from: c */
    public final boolean f5794c;

    public ScrollingLayoutModifier(@C12579k ScrollState scrollState, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollerState");
        this.f5792a = scrollState;
        this.f5793b = z;
        this.f5794c = z2;
    }

    /* renamed from: l */
    public static /* synthetic */ ScrollingLayoutModifier m9090l(ScrollingLayoutModifier scrollingLayoutModifier, ScrollState scrollState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            scrollState = scrollingLayoutModifier.f5792a;
        }
        if ((i & 2) != 0) {
            z = scrollingLayoutModifier.f5793b;
        }
        if ((i & 4) != 0) {
            z2 = scrollingLayoutModifier.f5794c;
        }
        return scrollingLayoutModifier.mo7272g(scrollState, z, z2);
    }

    @C12579k
    /* renamed from: a */
    public final ScrollState mo7268a() {
        return this.f5792a;
    }

    /* renamed from: b */
    public final boolean mo7269b() {
        return this.f5793b;
    }

    /* renamed from: c */
    public int mo7060c(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        if (this.f5794c) {
            return lVar.mo44320d(i);
        }
        return lVar.mo44320d(Integer.MAX_VALUE);
    }

    /* renamed from: d */
    public int mo7061d(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        if (this.f5794c) {
            return lVar.mo44317a0(i);
        }
        return lVar.mo44317a0(Integer.MAX_VALUE);
    }

    /* renamed from: e */
    public final boolean mo7270e() {
        return this.f5794c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollingLayoutModifier)) {
            return false;
        }
        ScrollingLayoutModifier scrollingLayoutModifier = (ScrollingLayoutModifier) obj;
        return Intrinsics.areEqual((Object) this.f5792a, (Object) scrollingLayoutModifier.f5792a) && this.f5793b == scrollingLayoutModifier.f5793b && this.f5794c == scrollingLayoutModifier.f5794c;
    }

    /* renamed from: f */
    public int mo7062f(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        if (this.f5794c) {
            return lVar.mo44322o0(Integer.MAX_VALUE);
        }
        return lVar.mo44322o0(i);
    }

    @C12579k
    /* renamed from: g */
    public final ScrollingLayoutModifier mo7272g(@C12579k ScrollState scrollState, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollerState");
        return new ScrollingLayoutModifier(scrollState, z, z2);
    }

    /* renamed from: h */
    public int mo7063h(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        if (this.f5794c) {
            return lVar.mo44323p0(Integer.MAX_VALUE);
        }
        return lVar.mo44323p0(i);
    }

    public int hashCode() {
        int hashCode = this.f5792a.hashCode() * 31;
        boolean z = this.f5793b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f5794c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Orientation orientation;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        if (this.f5794c) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        C2252k.m9698a(j, orientation);
        int i3 = Integer.MAX_VALUE;
        if (this.f5794c) {
            i = Integer.MAX_VALUE;
        } else {
            i = C16476b.m74361o(j);
        }
        if (this.f5794c) {
            i3 = C16476b.m74362p(j);
        }
        C15611w0 t0 = e0Var.mo44324t0(C16476b.m74351e(j, 0, i3, 0, i, 5, (Object) null));
        int B = C11479u.m44313B(t0.mo44471K0(), C16476b.m74362p(j));
        int B2 = C11479u.m44313B(t0.mo44468G0(), C16476b.m74361o(j));
        int G0 = t0.mo44468G0() - B2;
        int K0 = t0.mo44471K0() - B;
        if (!this.f5794c) {
            G0 = K0;
        }
        this.f5792a.mo7261u(G0);
        ScrollState scrollState = this.f5792a;
        if (this.f5794c) {
            i2 = B2;
        } else {
            i2 = B;
        }
        scrollState.mo7263w(i2);
        return C15568h0.m69206r2(h0Var, B, B2, (Map) null, new ScrollingLayoutModifier$measure$1(this, G0, t0), 4, (Object) null);
    }

    @C12579k
    /* renamed from: m */
    public final ScrollState mo7274m() {
        return this.f5792a;
    }

    /* renamed from: n */
    public final boolean mo7275n() {
        return this.f5793b;
    }

    /* renamed from: o */
    public final boolean mo7276o() {
        return this.f5794c;
    }

    @C12579k
    public String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.f5792a + ", isReversed=" + this.f5793b + ", isVertical=" + this.f5794c + ')';
    }
}
