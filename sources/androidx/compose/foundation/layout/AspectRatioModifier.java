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
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n1#2:219\n*E\n"})
public final class AspectRatioModifier extends C15988w0 implements C15603u {

    /* renamed from: d */
    public final float f6037d;

    /* renamed from: e */
    public final boolean f6038e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AspectRatioModifier(float f, boolean z, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        boolean z2;
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f6037d = f;
        this.f6038e = z;
        if (f > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalArgumentException(("aspectRatio " + f + " must be > 0").toString());
        }
    }

    /* renamed from: B */
    public static /* synthetic */ long m9822B(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.mo7694z(j, z);
    }

    /* renamed from: E */
    public static /* synthetic */ long m9823E(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.mo7685D(j, z);
    }

    /* renamed from: v */
    public static /* synthetic */ long m9824v(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.mo7692u(j, z);
    }

    /* renamed from: y */
    public static /* synthetic */ long m9825y(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.mo7693x(j, z);
    }

    /* renamed from: D */
    public final long mo7685D(long j, boolean z) {
        int r = C16476b.m74364r(j);
        int L0 = C11409d.m43851L0(((float) r) / this.f6037d);
        if (L0 > 0) {
            long a = C16502r.m74668a(r, L0);
            if (!z || C16478c.m74383h(j, a)) {
                return a;
            }
        }
        return C16500q.f40900b.mo47897a();
    }

    /* renamed from: c */
    public int mo7060c(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        if (i != Integer.MAX_VALUE) {
            return C11409d.m43851L0(((float) i) / this.f6037d);
        }
        return lVar.mo44320d(i);
    }

    /* renamed from: d */
    public int mo7061d(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        if (i != Integer.MAX_VALUE) {
            return C11409d.m43851L0(((float) i) / this.f6037d);
        }
        return lVar.mo44317a0(i);
    }

    public boolean equals(@C12580l Object obj) {
        AspectRatioModifier aspectRatioModifier;
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatioModifier) {
            aspectRatioModifier = (AspectRatioModifier) obj;
        } else {
            aspectRatioModifier = null;
        }
        if (aspectRatioModifier == null) {
            return false;
        }
        if (this.f6037d == aspectRatioModifier.f6037d) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.f6038e != ((AspectRatioModifier) obj).f6038e) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo7062f(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        if (i != Integer.MAX_VALUE) {
            return C11409d.m43851L0(((float) i) * this.f6037d);
        }
        return lVar.mo44322o0(i);
    }

    /* renamed from: h */
    public int mo7063h(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        if (i != Integer.MAX_VALUE) {
            return C11409d.m43851L0(((float) i) * this.f6037d);
        }
        return lVar.mo44323p0(i);
    }

    public int hashCode() {
        return (Float.hashCode(this.f6037d) * 31) + Boolean.hashCode(this.f6038e);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        long r = mo7688r(j);
        if (!C16500q.m74657h(r, C16500q.f40900b.mo47897a())) {
            j = C16476b.f40850b.mo47810c(C16500q.m74662m(r), C16500q.m74659j(r));
        }
        C15611w0 t0 = e0Var.mo44324t0(j);
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new AspectRatioModifier$measure$1(t0), 4, (Object) null);
    }

    /* renamed from: r */
    public final long mo7688r(long j) {
        if (!this.f6038e) {
            long y = m9825y(this, j, false, 1, (Object) null);
            C16500q.C16501a aVar = C16500q.f40900b;
            if (!C16500q.m74657h(y, aVar.mo47897a())) {
                return y;
            }
            long v = m9824v(this, j, false, 1, (Object) null);
            if (!C16500q.m74657h(v, aVar.mo47897a())) {
                return v;
            }
            long E = m9823E(this, j, false, 1, (Object) null);
            if (!C16500q.m74657h(E, aVar.mo47897a())) {
                return E;
            }
            long B = m9822B(this, j, false, 1, (Object) null);
            if (!C16500q.m74657h(B, aVar.mo47897a())) {
                return B;
            }
            long x = mo7693x(j, false);
            if (!C16500q.m74657h(x, aVar.mo47897a())) {
                return x;
            }
            long u = mo7692u(j, false);
            if (!C16500q.m74657h(u, aVar.mo47897a())) {
                return u;
            }
            long D = mo7685D(j, false);
            if (!C16500q.m74657h(D, aVar.mo47897a())) {
                return D;
            }
            long z = mo7694z(j, false);
            if (!C16500q.m74657h(z, aVar.mo47897a())) {
                return z;
            }
        } else {
            long v2 = m9824v(this, j, false, 1, (Object) null);
            C16500q.C16501a aVar2 = C16500q.f40900b;
            if (!C16500q.m74657h(v2, aVar2.mo47897a())) {
                return v2;
            }
            long y2 = m9825y(this, j, false, 1, (Object) null);
            if (!C16500q.m74657h(y2, aVar2.mo47897a())) {
                return y2;
            }
            long B2 = m9822B(this, j, false, 1, (Object) null);
            if (!C16500q.m74657h(B2, aVar2.mo47897a())) {
                return B2;
            }
            long E2 = m9823E(this, j, false, 1, (Object) null);
            if (!C16500q.m74657h(E2, aVar2.mo47897a())) {
                return E2;
            }
            long u2 = mo7692u(j, false);
            if (!C16500q.m74657h(u2, aVar2.mo47897a())) {
                return u2;
            }
            long x2 = mo7693x(j, false);
            if (!C16500q.m74657h(x2, aVar2.mo47897a())) {
                return x2;
            }
            long z2 = mo7694z(j, false);
            if (!C16500q.m74657h(z2, aVar2.mo47897a())) {
                return z2;
            }
            long D2 = mo7685D(j, false);
            if (!C16500q.m74657h(D2, aVar2.mo47897a())) {
                return D2;
            }
        }
        return C16500q.f40900b.mo47897a();
    }

    /* renamed from: s */
    public final float mo7689s() {
        return this.f6037d;
    }

    /* renamed from: t */
    public final boolean mo7690t() {
        return this.f6038e;
    }

    @C12579k
    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.f6037d + ')';
    }

    /* renamed from: u */
    public final long mo7692u(long j, boolean z) {
        int L0;
        int o = C16476b.m74361o(j);
        if (o != Integer.MAX_VALUE && (L0 = C11409d.m43851L0(((float) o) * this.f6037d)) > 0) {
            long a = C16502r.m74668a(L0, o);
            if (!z || C16478c.m74383h(j, a)) {
                return a;
            }
        }
        return C16500q.f40900b.mo47897a();
    }

    /* renamed from: x */
    public final long mo7693x(long j, boolean z) {
        int L0;
        int p = C16476b.m74362p(j);
        if (p != Integer.MAX_VALUE && (L0 = C11409d.m43851L0(((float) p) / this.f6037d)) > 0) {
            long a = C16502r.m74668a(p, L0);
            if (!z || C16478c.m74383h(j, a)) {
                return a;
            }
        }
        return C16500q.f40900b.mo47897a();
    }

    /* renamed from: z */
    public final long mo7694z(long j, boolean z) {
        int q = C16476b.m74363q(j);
        int L0 = C11409d.m43851L0(((float) q) * this.f6037d);
        if (L0 > 0) {
            long a = C16502r.m74668a(L0, q);
            if (!z || C16478c.m74383h(j, a)) {
                return a;
            }
        }
        return C16500q.f40900b.mo47897a();
    }
}
