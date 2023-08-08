package androidx.compose.p004ui.graphics.colorspace;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.colorspace.a0 */
public final class C15134a0 {

    /* renamed from: a */
    public final double f37387a;

    /* renamed from: b */
    public final double f37388b;

    /* renamed from: c */
    public final double f37389c;

    /* renamed from: d */
    public final double f37390d;

    /* renamed from: e */
    public final double f37391e;

    /* renamed from: f */
    public final double f37392f;

    /* renamed from: g */
    public final double f37393g;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        if ((r2 == 0.0d) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0093, code lost:
        if ((r2 == 0.0d) != false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15134a0(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
        /*
            r1 = this;
            r1.<init>()
            r1.f37387a = r2
            r1.f37388b = r4
            r1.f37389c = r6
            r1.f37390d = r8
            r1.f37391e = r10
            r1.f37392f = r12
            r1.f37393g = r14
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r6)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r8)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r10)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r12)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r14)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r2)
            if (r6 != 0) goto L_0x00d9
            r6 = 0
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 < 0) goto L_0x00c2
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x00c2
            int r14 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            r15 = 1
            r0 = 0
            if (r14 != 0) goto L_0x004f
            r14 = r15
            goto L_0x0050
        L_0x004f:
            r14 = r0
        L_0x0050:
            if (r14 == 0) goto L_0x006d
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x0058
            r14 = r15
            goto L_0x0059
        L_0x0058:
            r14 = r0
        L_0x0059:
            if (r14 != 0) goto L_0x0065
            int r14 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x0061
            r14 = r15
            goto L_0x0062
        L_0x0061:
            r14 = r0
        L_0x0062:
            if (r14 != 0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parameter a or g is zero, the transfer function is constant"
            r2.<init>(r3)
            throw r2
        L_0x006d:
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x0083
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0077
            r10 = r15
            goto L_0x0078
        L_0x0077:
            r10 = r0
        L_0x0078:
            if (r10 != 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parameter c is zero, the transfer function is constant"
            r2.<init>(r3)
            throw r2
        L_0x0083:
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0089
            r10 = r15
            goto L_0x008a
        L_0x0089:
            r10 = r0
        L_0x008a:
            if (r10 != 0) goto L_0x0095
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0092
            r10 = r15
            goto L_0x0093
        L_0x0092:
            r10 = r0
        L_0x0093:
            if (r10 == 0) goto L_0x009d
        L_0x0095:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r15 = r0
        L_0x009b:
            if (r15 != 0) goto L_0x00ba
        L_0x009d:
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x00b2
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x00aa
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x00aa
            return
        L_0x00aa:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The transfer function must be positive or increasing"
            r2.<init>(r3)
            throw r2
        L_0x00b2:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The transfer function must be increasing"
            r2.<init>(r3)
            throw r2
        L_0x00ba:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parameter a or g is zero, and c is zero, the transfer function is constant"
            r2.<init>(r3)
            throw r2
        L_0x00c2:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Parameter d must be in the range [0..1], was "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x00d9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parameters cannot be NaN"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.colorspace.C15134a0.<init>(double, double, double, double, double, double, double):void");
    }

    /* renamed from: i */
    public static /* synthetic */ C15134a0 m65367i(C15134a0 a0Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, Object obj) {
        C15134a0 a0Var2 = a0Var;
        return a0Var.mo42555h((i & 1) != 0 ? a0Var2.f37387a : d, (i & 2) != 0 ? a0Var2.f37388b : d2, (i & 4) != 0 ? a0Var2.f37389c : d3, (i & 8) != 0 ? a0Var2.f37390d : d4, (i & 16) != 0 ? a0Var2.f37391e : d5, (i & 32) != 0 ? a0Var2.f37392f : d6, (i & 64) != 0 ? a0Var2.f37393g : d7);
    }

    /* renamed from: a */
    public final double mo42547a() {
        return this.f37387a;
    }

    /* renamed from: b */
    public final double mo42548b() {
        return this.f37388b;
    }

    /* renamed from: c */
    public final double mo42549c() {
        return this.f37389c;
    }

    /* renamed from: d */
    public final double mo42550d() {
        return this.f37390d;
    }

    /* renamed from: e */
    public final double mo42551e() {
        return this.f37391e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15134a0)) {
            return false;
        }
        C15134a0 a0Var = (C15134a0) obj;
        return Double.compare(this.f37387a, a0Var.f37387a) == 0 && Double.compare(this.f37388b, a0Var.f37388b) == 0 && Double.compare(this.f37389c, a0Var.f37389c) == 0 && Double.compare(this.f37390d, a0Var.f37390d) == 0 && Double.compare(this.f37391e, a0Var.f37391e) == 0 && Double.compare(this.f37392f, a0Var.f37392f) == 0 && Double.compare(this.f37393g, a0Var.f37393g) == 0;
    }

    /* renamed from: f */
    public final double mo42553f() {
        return this.f37392f;
    }

    /* renamed from: g */
    public final double mo42554g() {
        return this.f37393g;
    }

    @C12579k
    /* renamed from: h */
    public final C15134a0 mo42555h(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        return new C15134a0(d, d2, d3, d4, d5, d6, d7);
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f37387a) * 31) + Double.hashCode(this.f37388b)) * 31) + Double.hashCode(this.f37389c)) * 31) + Double.hashCode(this.f37390d)) * 31) + Double.hashCode(this.f37391e)) * 31) + Double.hashCode(this.f37392f)) * 31) + Double.hashCode(this.f37393g);
    }

    /* renamed from: j */
    public final double mo42557j() {
        return this.f37388b;
    }

    /* renamed from: k */
    public final double mo42558k() {
        return this.f37389c;
    }

    /* renamed from: l */
    public final double mo42559l() {
        return this.f37390d;
    }

    /* renamed from: m */
    public final double mo42560m() {
        return this.f37391e;
    }

    /* renamed from: n */
    public final double mo42561n() {
        return this.f37392f;
    }

    /* renamed from: o */
    public final double mo42562o() {
        return this.f37393g;
    }

    /* renamed from: p */
    public final double mo42563p() {
        return this.f37387a;
    }

    @C12579k
    public String toString() {
        return "TransferParameters(gamma=" + this.f37387a + ", a=" + this.f37388b + ", b=" + this.f37389c + ", c=" + this.f37390d + ", d=" + this.f37391e + ", e=" + this.f37392f + ", f=" + this.f37393g + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15134a0(double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, d4, d5, (i & 32) != 0 ? 0.0d : d6, (i & 64) != 0 ? 0.0d : d7);
    }
}
