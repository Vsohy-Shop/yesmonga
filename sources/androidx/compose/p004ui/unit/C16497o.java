package androidx.compose.p004ui.unit;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.unit.o */
public final class C16497o {
    @C12579k

    /* renamed from: e */
    public static final C16498a f40893e = new C16498a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f40894f = 0;
    @C12579k

    /* renamed from: g */
    public static final C16497o f40895g = new C16497o(0, 0, 0, 0);

    /* renamed from: a */
    public final int f40896a;

    /* renamed from: b */
    public final int f40897b;

    /* renamed from: c */
    public final int f40898c;

    /* renamed from: d */
    public final int f40899d;

    /* renamed from: androidx.compose.ui.unit.o$a */
    public static final class C16498a {
        public /* synthetic */ C16498a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m74642b() {
        }

        @C12579k
        /* renamed from: a */
        public final C16497o mo47892a() {
            return C16497o.f40895g;
        }

        public C16498a() {
        }
    }

    public C16497o(int i, int i2, int i3, int i4) {
        this.f40896a = i;
        this.f40897b = i2;
        this.f40898c = i3;
        this.f40899d = i4;
    }

    @C8547h2
    /* renamed from: A */
    public static /* synthetic */ void m74601A() {
    }

    @C8547h2
    /* renamed from: C */
    public static /* synthetic */ void m74602C() {
    }

    @C8547h2
    /* renamed from: H */
    public static /* synthetic */ void m74603H() {
    }

    @C8547h2
    /* renamed from: L */
    public static /* synthetic */ void m74604L() {
    }

    /* renamed from: h */
    public static /* synthetic */ C16497o m74606h(C16497o oVar, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = oVar.f40896a;
        }
        if ((i5 & 2) != 0) {
            i2 = oVar.f40897b;
        }
        if ((i5 & 4) != 0) {
            i3 = oVar.f40898c;
        }
        if ((i5 & 8) != 0) {
            i4 = oVar.f40899d;
        }
        return oVar.mo47875g(i, i2, i3, i4);
    }

    @C8547h2
    /* renamed from: k */
    public static /* synthetic */ void m74607k() {
    }

    @C8547h2
    /* renamed from: s */
    public static /* synthetic */ void m74608s() {
    }

    @C8547h2
    /* renamed from: u */
    public static /* synthetic */ void m74609u() {
    }

    @C8547h2
    /* renamed from: y */
    public static /* synthetic */ void m74610y() {
    }

    /* renamed from: B */
    public final int mo47858B() {
        return this.f40897b;
    }

    /* renamed from: D */
    public final long mo47859D() {
        return C16496n.m74593a(this.f40896a + (mo47862G() / 2), this.f40897b);
    }

    /* renamed from: E */
    public final long mo47860E() {
        return C16496n.m74593a(this.f40896a, this.f40897b);
    }

    /* renamed from: F */
    public final long mo47861F() {
        return C16496n.m74593a(this.f40898c, this.f40897b);
    }

    /* renamed from: G */
    public final int mo47862G() {
        return this.f40898c - this.f40896a;
    }

    @C8547h2
    @C12579k
    /* renamed from: I */
    public final C16497o mo47863I(int i) {
        return new C16497o(this.f40896a - i, this.f40897b - i, this.f40898c + i, this.f40899d + i);
    }

    @C8547h2
    @C12579k
    /* renamed from: J */
    public final C16497o mo47864J(@C12579k C16497o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "other");
        return new C16497o(Math.max(this.f40896a, oVar.f40896a), Math.max(this.f40897b, oVar.f40897b), Math.min(this.f40898c, oVar.f40898c), Math.min(this.f40899d, oVar.f40899d));
    }

    /* renamed from: K */
    public final boolean mo47865K() {
        return this.f40896a >= this.f40898c || this.f40897b >= this.f40899d;
    }

    /* renamed from: M */
    public final boolean mo47866M(@C12579k C16497o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "other");
        if (this.f40898c <= oVar.f40896a || oVar.f40898c <= this.f40896a || this.f40899d <= oVar.f40897b || oVar.f40899d <= this.f40897b) {
            return false;
        }
        return true;
    }

    @C8547h2
    @C12579k
    /* renamed from: N */
    public final C16497o mo47867N(int i, int i2) {
        return new C16497o(this.f40896a + i, this.f40897b + i2, this.f40898c + i, this.f40899d + i2);
    }

    @C8547h2
    @C12579k
    /* renamed from: O */
    public final C16497o mo47868O(long j) {
        return new C16497o(this.f40896a + C16494m.m74581m(j), this.f40897b + C16494m.m74583o(j), this.f40898c + C16494m.m74581m(j), this.f40899d + C16494m.m74583o(j));
    }

    /* renamed from: b */
    public final int mo47869b() {
        return this.f40896a;
    }

    /* renamed from: c */
    public final int mo47870c() {
        return this.f40897b;
    }

    /* renamed from: d */
    public final int mo47871d() {
        return this.f40898c;
    }

    /* renamed from: e */
    public final int mo47872e() {
        return this.f40899d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16497o)) {
            return false;
        }
        C16497o oVar = (C16497o) obj;
        return this.f40896a == oVar.f40896a && this.f40897b == oVar.f40897b && this.f40898c == oVar.f40898c && this.f40899d == oVar.f40899d;
    }

    /* renamed from: f */
    public final boolean mo47874f(long j) {
        return C16494m.m74581m(j) >= this.f40896a && C16494m.m74581m(j) < this.f40898c && C16494m.m74583o(j) >= this.f40897b && C16494m.m74583o(j) < this.f40899d;
    }

    @C12579k
    /* renamed from: g */
    public final C16497o mo47875g(int i, int i2, int i3, int i4) {
        return new C16497o(i, i2, i3, i4);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f40896a) * 31) + Integer.hashCode(this.f40897b)) * 31) + Integer.hashCode(this.f40898c)) * 31) + Integer.hashCode(this.f40899d);
    }

    @C8547h2
    @C12579k
    /* renamed from: i */
    public final C16497o mo47877i(int i) {
        return mo47863I(-i);
    }

    /* renamed from: j */
    public final int mo47878j() {
        return this.f40899d;
    }

    /* renamed from: l */
    public final long mo47879l() {
        return C16496n.m74593a(this.f40896a + (mo47862G() / 2), this.f40899d);
    }

    /* renamed from: m */
    public final long mo47880m() {
        return C16496n.m74593a(this.f40896a, this.f40899d);
    }

    /* renamed from: n */
    public final long mo47881n() {
        return C16496n.m74593a(this.f40898c, this.f40899d);
    }

    /* renamed from: o */
    public final long mo47882o() {
        return C16496n.m74593a(this.f40896a + (mo47862G() / 2), this.f40897b + (mo47885r() / 2));
    }

    /* renamed from: p */
    public final long mo47883p() {
        return C16496n.m74593a(this.f40896a, this.f40897b + (mo47885r() / 2));
    }

    /* renamed from: q */
    public final long mo47884q() {
        return C16496n.m74593a(this.f40898c, this.f40897b + (mo47885r() / 2));
    }

    /* renamed from: r */
    public final int mo47885r() {
        return this.f40899d - this.f40897b;
    }

    /* renamed from: t */
    public final int mo47886t() {
        return this.f40896a;
    }

    @C12579k
    public String toString() {
        return "IntRect.fromLTRB(" + this.f40896a + ", " + this.f40897b + ", " + this.f40898c + ", " + this.f40899d + ')';
    }

    /* renamed from: v */
    public final int mo47888v() {
        return Math.max(Math.abs(mo47862G()), Math.abs(mo47885r()));
    }

    /* renamed from: w */
    public final int mo47889w() {
        return Math.min(Math.abs(mo47862G()), Math.abs(mo47885r()));
    }

    /* renamed from: x */
    public final int mo47890x() {
        return this.f40898c;
    }

    /* renamed from: z */
    public final long mo47891z() {
        return C16502r.m74668a(mo47862G(), mo47885r());
    }
}
