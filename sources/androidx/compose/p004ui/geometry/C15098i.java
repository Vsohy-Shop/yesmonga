package androidx.compose.p004ui.geometry;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.geometry.i */
public final class C15098i {
    @C12579k

    /* renamed from: e */
    public static final C15099a f37261e = new C15099a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f37262f = 0;
    @C12579k

    /* renamed from: g */
    public static final C15098i f37263g = new C15098i(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a */
    public final float f37264a;

    /* renamed from: b */
    public final float f37265b;

    /* renamed from: c */
    public final float f37266c;

    /* renamed from: d */
    public final float f37267d;

    /* renamed from: androidx.compose.ui.geometry.i$a */
    public static final class C15099a {
        public /* synthetic */ C15099a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m64952b() {
        }

        @C12579k
        /* renamed from: a */
        public final C15098i mo42285a() {
            return C15098i.f37263g;
        }

        public C15099a() {
        }
    }

    public C15098i(float f, float f2, float f3, float f4) {
        this.f37264a = f;
        this.f37265b = f2;
        this.f37266c = f3;
        this.f37267d = f4;
    }

    @C8547h2
    /* renamed from: A */
    public static /* synthetic */ void m64907A() {
    }

    @C8547h2
    /* renamed from: C */
    public static /* synthetic */ void m64908C() {
    }

    @C8547h2
    /* renamed from: H */
    public static /* synthetic */ void m64909H() {
    }

    @C8547h2
    /* renamed from: L */
    public static /* synthetic */ void m64910L() {
    }

    @C8547h2
    /* renamed from: N */
    public static /* synthetic */ void m64911N() {
    }

    @C8547h2
    /* renamed from: P */
    public static /* synthetic */ void m64912P() {
    }

    /* renamed from: h */
    public static /* synthetic */ C15098i m64914h(C15098i iVar, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = iVar.f37264a;
        }
        if ((i & 2) != 0) {
            f2 = iVar.f37265b;
        }
        if ((i & 4) != 0) {
            f3 = iVar.f37266c;
        }
        if ((i & 8) != 0) {
            f4 = iVar.f37267d;
        }
        return iVar.mo42268g(f, f2, f3, f4);
    }

    @C8547h2
    /* renamed from: k */
    public static /* synthetic */ void m64915k() {
    }

    @C8547h2
    /* renamed from: s */
    public static /* synthetic */ void m64916s() {
    }

    @C8547h2
    /* renamed from: u */
    public static /* synthetic */ void m64917u() {
    }

    @C8547h2
    /* renamed from: y */
    public static /* synthetic */ void m64918y() {
    }

    /* renamed from: B */
    public final float mo42249B() {
        return this.f37265b;
    }

    /* renamed from: D */
    public final long mo42250D() {
        return C15096g.m64898a(this.f37264a + (mo42253G() / 2.0f), this.f37265b);
    }

    /* renamed from: E */
    public final long mo42251E() {
        return C15096g.m64898a(this.f37264a, this.f37265b);
    }

    /* renamed from: F */
    public final long mo42252F() {
        return C15096g.m64898a(this.f37266c, this.f37265b);
    }

    /* renamed from: G */
    public final float mo42253G() {
        return this.f37266c - this.f37264a;
    }

    @C8547h2
    @C12579k
    /* renamed from: I */
    public final C15098i mo42254I(float f) {
        return new C15098i(this.f37264a - f, this.f37265b - f, this.f37266c + f, this.f37267d + f);
    }

    @C8547h2
    @C12579k
    /* renamed from: J */
    public final C15098i mo42255J(@C12579k C15098i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "other");
        return new C15098i(Math.max(this.f37264a, iVar.f37264a), Math.max(this.f37265b, iVar.f37265b), Math.min(this.f37266c, iVar.f37266c), Math.min(this.f37267d, iVar.f37267d));
    }

    /* renamed from: K */
    public final boolean mo42256K() {
        return this.f37264a >= this.f37266c || this.f37265b >= this.f37267d;
    }

    /* renamed from: M */
    public final boolean mo42257M() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f = this.f37264a;
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float f2 = this.f37265b;
            if (Float.isInfinite(f2) || Float.isNaN(f2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                float f3 = this.f37266c;
                if (Float.isInfinite(f3) || Float.isNaN(f3)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    float f4 = this.f37267d;
                    if (Float.isInfinite(f4) || Float.isNaN(f4)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: O */
    public final boolean mo42258O() {
        if (this.f37264a >= Float.POSITIVE_INFINITY || this.f37265b >= Float.POSITIVE_INFINITY || this.f37266c >= Float.POSITIVE_INFINITY || this.f37267d >= Float.POSITIVE_INFINITY) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean mo42259Q(@C12579k C15098i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "other");
        if (this.f37266c <= iVar.f37264a || iVar.f37266c <= this.f37264a || this.f37267d <= iVar.f37265b || iVar.f37267d <= this.f37265b) {
            return false;
        }
        return true;
    }

    @C8547h2
    @C12579k
    /* renamed from: R */
    public final C15098i mo42260R(float f, float f2) {
        return new C15098i(this.f37264a + f, this.f37265b + f2, this.f37266c + f, this.f37267d + f2);
    }

    @C8547h2
    @C12579k
    /* renamed from: S */
    public final C15098i mo42261S(long j) {
        return new C15098i(this.f37264a + C15094f.m64880p(j), this.f37265b + C15094f.m64882r(j), this.f37266c + C15094f.m64880p(j), this.f37267d + C15094f.m64882r(j));
    }

    /* renamed from: b */
    public final float mo42262b() {
        return this.f37264a;
    }

    /* renamed from: c */
    public final float mo42263c() {
        return this.f37265b;
    }

    /* renamed from: d */
    public final float mo42264d() {
        return this.f37266c;
    }

    /* renamed from: e */
    public final float mo42265e() {
        return this.f37267d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15098i)) {
            return false;
        }
        C15098i iVar = (C15098i) obj;
        return Float.compare(this.f37264a, iVar.f37264a) == 0 && Float.compare(this.f37265b, iVar.f37265b) == 0 && Float.compare(this.f37266c, iVar.f37266c) == 0 && Float.compare(this.f37267d, iVar.f37267d) == 0;
    }

    /* renamed from: f */
    public final boolean mo42267f(long j) {
        return C15094f.m64880p(j) >= this.f37264a && C15094f.m64880p(j) < this.f37266c && C15094f.m64882r(j) >= this.f37265b && C15094f.m64882r(j) < this.f37267d;
    }

    @C12579k
    /* renamed from: g */
    public final C15098i mo42268g(float f, float f2, float f3, float f4) {
        return new C15098i(f, f2, f3, f4);
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f37264a) * 31) + Float.hashCode(this.f37265b)) * 31) + Float.hashCode(this.f37266c)) * 31) + Float.hashCode(this.f37267d);
    }

    @C8547h2
    @C12579k
    /* renamed from: i */
    public final C15098i mo42270i(float f) {
        return mo42254I(-f);
    }

    /* renamed from: j */
    public final float mo42271j() {
        return this.f37267d;
    }

    /* renamed from: l */
    public final long mo42272l() {
        return C15096g.m64898a(this.f37264a + (mo42253G() / 2.0f), this.f37267d);
    }

    /* renamed from: m */
    public final long mo42273m() {
        return C15096g.m64898a(this.f37264a, this.f37267d);
    }

    /* renamed from: n */
    public final long mo42274n() {
        return C15096g.m64898a(this.f37266c, this.f37267d);
    }

    /* renamed from: o */
    public final long mo42275o() {
        return C15096g.m64898a(this.f37264a + (mo42253G() / 2.0f), this.f37265b + (mo42278r() / 2.0f));
    }

    /* renamed from: p */
    public final long mo42276p() {
        return C15096g.m64898a(this.f37264a, this.f37265b + (mo42278r() / 2.0f));
    }

    /* renamed from: q */
    public final long mo42277q() {
        return C15096g.m64898a(this.f37266c, this.f37265b + (mo42278r() / 2.0f));
    }

    /* renamed from: r */
    public final float mo42278r() {
        return this.f37267d - this.f37265b;
    }

    /* renamed from: t */
    public final float mo42279t() {
        return this.f37264a;
    }

    @C12579k
    public String toString() {
        return "Rect.fromLTRB(" + C15091c.m64848a(this.f37264a, 1) + ", " + C15091c.m64848a(this.f37265b, 1) + ", " + C15091c.m64848a(this.f37266c, 1) + ", " + C15091c.m64848a(this.f37267d, 1) + ')';
    }

    /* renamed from: v */
    public final float mo42281v() {
        return Math.max(Math.abs(mo42253G()), Math.abs(mo42278r()));
    }

    /* renamed from: w */
    public final float mo42282w() {
        return Math.min(Math.abs(mo42253G()), Math.abs(mo42278r()));
    }

    /* renamed from: x */
    public final float mo42283x() {
        return this.f37266c;
    }

    /* renamed from: z */
    public final long mo42284z() {
        return C15106n.m65033a(mo42253G(), mo42278r());
    }
}
