package androidx.compose.p004ui.text;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.h0 */
public final class C16260h0 {

    /* renamed from: g */
    public static final int f40374g = 8;
    @C12579k

    /* renamed from: a */
    public final C16258g0 f40375a;
    @C12579k

    /* renamed from: b */
    public final C16349k f40376b;

    /* renamed from: c */
    public final long f40377c;

    /* renamed from: d */
    public final float f40378d;

    /* renamed from: e */
    public final float f40379e;
    @C12579k

    /* renamed from: f */
    public final List<C15098i> f40380f;

    public /* synthetic */ C16260h0(C16258g0 g0Var, C16349k kVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(g0Var, kVar, j);
    }

    /* renamed from: b */
    public static /* synthetic */ C16260h0 m73232b(C16260h0 h0Var, C16258g0 g0Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            g0Var = h0Var.f40375a;
        }
        if ((i & 2) != 0) {
            j = h0Var.f40377c;
        }
        return h0Var.mo47046a(g0Var, j);
    }

    /* renamed from: p */
    public static /* synthetic */ int m73233p(C16260h0 h0Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return h0Var.mo47061o(i, z);
    }

    @C12579k
    /* renamed from: A */
    public final List<C15098i> mo47042A() {
        return this.f40380f;
    }

    /* renamed from: B */
    public final long mo47043B() {
        return this.f40377c;
    }

    /* renamed from: C */
    public final long mo47044C(int i) {
        return this.f40376b.mo47391F(i);
    }

    /* renamed from: D */
    public final boolean mo47045D(int i) {
        return this.f40376b.mo47392G(i);
    }

    @C12579k
    /* renamed from: a */
    public final C16260h0 mo47046a(@C12579k C16258g0 g0Var, long j) {
        Intrinsics.checkNotNullParameter(g0Var, "layoutInput");
        return new C16260h0(g0Var, this.f40376b, j, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: c */
    public final ResolvedTextDirection mo47047c(int i) {
        return this.f40376b.mo47400b(i);
    }

    @C12579k
    /* renamed from: d */
    public final C15098i mo47048d(int i) {
        return this.f40376b.mo47401c(i);
    }

    @C12579k
    /* renamed from: e */
    public final C15098i mo47049e(int i) {
        return this.f40376b.mo47402d(i);
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16260h0)) {
            return false;
        }
        C16260h0 h0Var = (C16260h0) obj;
        if (!Intrinsics.areEqual((Object) this.f40375a, (Object) h0Var.f40375a) || !Intrinsics.areEqual((Object) this.f40376b, (Object) h0Var.f40376b) || !C16500q.m74657h(this.f40377c, h0Var.f40377c)) {
            return false;
        }
        if (this.f40378d == h0Var.f40378d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f40379e == h0Var.f40379e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && Intrinsics.areEqual((Object) this.f40380f, (Object) h0Var.f40380f)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo47051f() {
        if (this.f40376b.mo47403e() || ((float) C16500q.m74659j(this.f40377c)) < this.f40376b.mo47405g()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo47052g() {
        return ((float) C16500q.m74662m(this.f40377c)) < this.f40376b.mo47390E();
    }

    /* renamed from: h */
    public final float mo47053h() {
        return this.f40378d;
    }

    public int hashCode() {
        return (((((((((this.f40375a.hashCode() * 31) + this.f40376b.hashCode()) * 31) + C16500q.m74663n(this.f40377c)) * 31) + Float.hashCode(this.f40378d)) * 31) + Float.hashCode(this.f40379e)) * 31) + this.f40380f.hashCode();
    }

    /* renamed from: i */
    public final boolean mo47055i() {
        return mo47052g() || mo47051f();
    }

    /* renamed from: j */
    public final float mo47056j(int i, boolean z) {
        return this.f40376b.mo47406h(i, z);
    }

    /* renamed from: k */
    public final float mo47057k() {
        return this.f40379e;
    }

    @C12579k
    /* renamed from: l */
    public final C16258g0 mo47058l() {
        return this.f40375a;
    }

    /* renamed from: m */
    public final float mo47059m(int i) {
        return this.f40376b.mo47409k(i);
    }

    /* renamed from: n */
    public final int mo47060n() {
        return this.f40376b.mo47410l();
    }

    /* renamed from: o */
    public final int mo47061o(int i, boolean z) {
        return this.f40376b.mo47411m(i, z);
    }

    /* renamed from: q */
    public final int mo47062q(int i) {
        return this.f40376b.mo47412o(i);
    }

    /* renamed from: r */
    public final int mo47063r(float f) {
        return this.f40376b.mo47413p(f);
    }

    /* renamed from: s */
    public final float mo47064s(int i) {
        return this.f40376b.mo47415r(i);
    }

    /* renamed from: t */
    public final float mo47065t(int i) {
        return this.f40376b.mo47416s(i);
    }

    @C12579k
    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f40375a + ", multiParagraph=" + this.f40376b + ", size=" + C16500q.m74665p(this.f40377c) + ", firstBaseline=" + this.f40378d + ", lastBaseline=" + this.f40379e + ", placeholderRects=" + this.f40380f + ')';
    }

    /* renamed from: u */
    public final int mo47067u(int i) {
        return this.f40376b.mo47417t(i);
    }

    /* renamed from: v */
    public final float mo47068v(int i) {
        return this.f40376b.mo47418u(i);
    }

    @C12579k
    /* renamed from: w */
    public final C16349k mo47069w() {
        return this.f40376b;
    }

    /* renamed from: x */
    public final int mo47070x(long j) {
        return this.f40376b.mo47423z(j);
    }

    @C12579k
    /* renamed from: y */
    public final ResolvedTextDirection mo47071y(int i) {
        return this.f40376b.mo47386A(i);
    }

    @C12579k
    /* renamed from: z */
    public final C15231i3 mo47072z(int i, int i2) {
        return this.f40376b.mo47388C(i, i2);
    }

    public C16260h0(C16258g0 g0Var, C16349k kVar, long j) {
        this.f40375a = g0Var;
        this.f40376b = kVar;
        this.f40377c = j;
        this.f40378d = kVar.mo47404f();
        this.f40379e = kVar.mo47408j();
        this.f40380f = kVar.mo47389D();
    }
}
