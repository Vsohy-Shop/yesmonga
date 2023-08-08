package androidx.compose.p004ui.geometry;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.geometry.k */
public final class C15101k {
    @C12579k

    /* renamed from: j */
    public static final C15102a f37268j = new C15102a((DefaultConstructorMarker) null);

    /* renamed from: k */
    public static final int f37269k = 0;
    @C12579k

    /* renamed from: l */
    public static final C15101k f37270l = C15103l.m64989e(0.0f, 0.0f, 0.0f, 0.0f, C15088a.f37248b.mo42225a());

    /* renamed from: a */
    public final float f37271a;

    /* renamed from: b */
    public final float f37272b;

    /* renamed from: c */
    public final float f37273c;

    /* renamed from: d */
    public final float f37274d;

    /* renamed from: e */
    public final long f37275e;

    /* renamed from: f */
    public final long f37276f;

    /* renamed from: g */
    public final long f37277g;

    /* renamed from: h */
    public final long f37278h;
    @C12580l

    /* renamed from: i */
    public C15101k f37279i;

    /* renamed from: androidx.compose.ui.geometry.k$a */
    public static final class C15102a {
        public /* synthetic */ C15102a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11384m
        /* renamed from: b */
        public static /* synthetic */ void m64983b() {
        }

        @C12579k
        /* renamed from: a */
        public final C15101k mo42311a() {
            return C15101k.f37270l;
        }

        public C15102a() {
        }
    }

    public /* synthetic */ C15101k(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }

    /* renamed from: l */
    public static /* synthetic */ C15101k m64959l(C15101k kVar, float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, Object obj) {
        C15101k kVar2 = kVar;
        int i2 = i;
        return kVar.mo42297k((i2 & 1) != 0 ? kVar2.f37271a : f, (i2 & 2) != 0 ? kVar2.f37272b : f2, (i2 & 4) != 0 ? kVar2.f37273c : f3, (i2 & 8) != 0 ? kVar2.f37274d : f4, (i2 & 16) != 0 ? kVar2.f37275e : j, (i2 & 32) != 0 ? kVar2.f37276f : j2, (i2 & 64) != 0 ? kVar2.f37277g : j3, (i2 & 128) != 0 ? kVar2.f37278h : j4);
    }

    @C12579k
    /* renamed from: w */
    public static final C15101k m64960w() {
        return f37268j.mo42311a();
    }

    /* renamed from: b */
    public final float mo42286b() {
        return this.f37271a;
    }

    /* renamed from: c */
    public final float mo42287c() {
        return this.f37272b;
    }

    /* renamed from: d */
    public final float mo42288d() {
        return this.f37273c;
    }

    /* renamed from: e */
    public final float mo42289e() {
        return this.f37274d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15101k)) {
            return false;
        }
        C15101k kVar = (C15101k) obj;
        return Float.compare(this.f37271a, kVar.f37271a) == 0 && Float.compare(this.f37272b, kVar.f37272b) == 0 && Float.compare(this.f37273c, kVar.f37273c) == 0 && Float.compare(this.f37274d, kVar.f37274d) == 0 && C15088a.m64830j(this.f37275e, kVar.f37275e) && C15088a.m64830j(this.f37276f, kVar.f37276f) && C15088a.m64830j(this.f37277g, kVar.f37277g) && C15088a.m64830j(this.f37278h, kVar.f37278h);
    }

    /* renamed from: f */
    public final long mo42291f() {
        return this.f37275e;
    }

    /* renamed from: g */
    public final long mo42292g() {
        return this.f37276f;
    }

    /* renamed from: h */
    public final long mo42293h() {
        return this.f37277g;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f37271a) * 31) + Float.hashCode(this.f37272b)) * 31) + Float.hashCode(this.f37273c)) * 31) + Float.hashCode(this.f37274d)) * 31) + C15088a.m64836p(this.f37275e)) * 31) + C15088a.m64836p(this.f37276f)) * 31) + C15088a.m64836p(this.f37277g)) * 31) + C15088a.m64836p(this.f37278h);
    }

    /* renamed from: i */
    public final long mo42295i() {
        return this.f37278h;
    }

    /* renamed from: j */
    public final boolean mo42296j(long j) {
        float f;
        float f2;
        float f3;
        float f4;
        if (C15094f.m64880p(j) < this.f37271a || C15094f.m64880p(j) >= this.f37273c || C15094f.m64882r(j) < this.f37272b || C15094f.m64882r(j) >= this.f37274d) {
            return false;
        }
        C15101k y = mo42310y();
        if (C15094f.m64880p(j) < this.f37271a + C15088a.m64833m(y.f37275e) && C15094f.m64882r(j) < this.f37272b + C15088a.m64835o(y.f37275e)) {
            f3 = (C15094f.m64880p(j) - this.f37271a) - C15088a.m64833m(y.f37275e);
            f2 = (C15094f.m64882r(j) - this.f37272b) - C15088a.m64835o(y.f37275e);
            f = C15088a.m64833m(y.f37275e);
            f4 = C15088a.m64835o(y.f37275e);
        } else if (C15094f.m64880p(j) > this.f37273c - C15088a.m64833m(y.f37276f) && C15094f.m64882r(j) < this.f37272b + C15088a.m64835o(y.f37276f)) {
            f3 = (C15094f.m64880p(j) - this.f37273c) + C15088a.m64833m(y.f37276f);
            f2 = (C15094f.m64882r(j) - this.f37272b) - C15088a.m64835o(y.f37276f);
            f = C15088a.m64833m(y.f37276f);
            f4 = C15088a.m64835o(y.f37276f);
        } else if (C15094f.m64880p(j) > this.f37273c - C15088a.m64833m(y.f37277g) && C15094f.m64882r(j) > this.f37274d - C15088a.m64835o(y.f37277g)) {
            f3 = (C15094f.m64880p(j) - this.f37273c) + C15088a.m64833m(y.f37277g);
            f2 = (C15094f.m64882r(j) - this.f37274d) + C15088a.m64835o(y.f37277g);
            f = C15088a.m64833m(y.f37277g);
            f4 = C15088a.m64835o(y.f37277g);
        } else if (C15094f.m64880p(j) >= this.f37271a + C15088a.m64833m(y.f37278h) || C15094f.m64882r(j) <= this.f37274d - C15088a.m64835o(y.f37278h)) {
            return true;
        } else {
            f3 = (C15094f.m64880p(j) - this.f37271a) - C15088a.m64833m(y.f37278h);
            f2 = (C15094f.m64882r(j) - this.f37274d) + C15088a.m64835o(y.f37278h);
            f = C15088a.m64833m(y.f37278h);
            f4 = C15088a.m64835o(y.f37278h);
        }
        float f5 = f3 / f;
        float f6 = f2 / f4;
        if ((f5 * f5) + (f6 * f6) <= 1.0f) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: k */
    public final C15101k mo42297k(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        return new C15101k(f, f2, f3, f4, j, j2, j3, j4, (DefaultConstructorMarker) null);
    }

    /* renamed from: m */
    public final float mo42298m() {
        return this.f37274d;
    }

    /* renamed from: n */
    public final long mo42299n() {
        return this.f37278h;
    }

    /* renamed from: o */
    public final long mo42300o() {
        return this.f37277g;
    }

    /* renamed from: p */
    public final float mo42301p() {
        return this.f37274d - this.f37272b;
    }

    /* renamed from: q */
    public final float mo42302q() {
        return this.f37271a;
    }

    /* renamed from: r */
    public final float mo42303r() {
        return this.f37273c;
    }

    /* renamed from: s */
    public final float mo42304s() {
        return this.f37272b;
    }

    /* renamed from: t */
    public final long mo42305t() {
        return this.f37275e;
    }

    @C12579k
    public String toString() {
        boolean z;
        long j = this.f37275e;
        long j2 = this.f37276f;
        long j3 = this.f37277g;
        long j4 = this.f37278h;
        String str = C15091c.m64848a(this.f37271a, 1) + ", " + C15091c.m64848a(this.f37272b, 1) + ", " + C15091c.m64848a(this.f37273c, 1) + ", " + C15091c.m64848a(this.f37274d, 1);
        if (!C15088a.m64830j(j, j2) || !C15088a.m64830j(j2, j3) || !C15088a.m64830j(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + C15088a.m64840t(j) + ", topRight=" + C15088a.m64840t(j2) + ", bottomRight=" + C15088a.m64840t(j3) + ", bottomLeft=" + C15088a.m64840t(j4) + ')';
        }
        if (C15088a.m64833m(j) == C15088a.m64835o(j)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "RoundRect(rect=" + str + ", radius=" + C15091c.m64848a(C15088a.m64833m(j), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + C15091c.m64848a(C15088a.m64833m(j), 1) + ", y=" + C15091c.m64848a(C15088a.m64835o(j), 1) + ')';
    }

    /* renamed from: u */
    public final long mo42307u() {
        return this.f37276f;
    }

    /* renamed from: v */
    public final float mo42308v() {
        return this.f37273c - this.f37271a;
    }

    /* renamed from: x */
    public final float mo42309x(float f, float f2, float f3, float f4) {
        float f5 = f2 + f3;
        if (f5 <= f4) {
            return f;
        }
        return !((f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1)) == 0) ? Math.min(f, f4 / f5) : f;
    }

    /* renamed from: y */
    public final C15101k mo42310y() {
        C15101k kVar = this.f37279i;
        if (kVar != null) {
            return kVar;
        }
        float x = mo42309x(mo42309x(mo42309x(mo42309x(1.0f, C15088a.m64835o(this.f37278h), C15088a.m64835o(this.f37275e), mo42301p()), C15088a.m64833m(this.f37275e), C15088a.m64833m(this.f37276f), mo42308v()), C15088a.m64835o(this.f37276f), C15088a.m64835o(this.f37277g), mo42301p()), C15088a.m64833m(this.f37277g), C15088a.m64833m(this.f37278h), mo42308v());
        C15101k kVar2 = r2;
        C15101k kVar3 = new C15101k(this.f37271a * x, this.f37272b * x, this.f37273c * x, this.f37274d * x, C15090b.m64845a(C15088a.m64833m(this.f37275e) * x, C15088a.m64835o(this.f37275e) * x), C15090b.m64845a(C15088a.m64833m(this.f37276f) * x, C15088a.m64835o(this.f37276f) * x), C15090b.m64845a(C15088a.m64833m(this.f37277g) * x, C15088a.m64835o(this.f37277g) * x), C15090b.m64845a(C15088a.m64833m(this.f37278h) * x, C15088a.m64835o(this.f37278h) * x), (DefaultConstructorMarker) null);
        C15101k kVar4 = kVar2;
        this.f37279i = kVar4;
        return kVar4;
    }

    public C15101k(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f37271a = f;
        this.f37272b = f2;
        this.f37273c = f3;
        this.f37274d = f4;
        this.f37275e = j;
        this.f37276f = j2;
        this.f37277g = j3;
        this.f37278h = j4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C15101k(float r18, float r19, float r20, float r21, long r22, long r24, long r26, long r28, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r17 = this;
            r0 = r30
            r1 = r0 & 16
            if (r1 == 0) goto L_0x000e
            androidx.compose.ui.geometry.a$a r1 = androidx.compose.p004ui.geometry.C15088a.f37248b
            long r1 = r1.mo42225a()
            r8 = r1
            goto L_0x0010
        L_0x000e:
            r8 = r22
        L_0x0010:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001c
            androidx.compose.ui.geometry.a$a r1 = androidx.compose.p004ui.geometry.C15088a.f37248b
            long r1 = r1.mo42225a()
            r10 = r1
            goto L_0x001e
        L_0x001c:
            r10 = r24
        L_0x001e:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002a
            androidx.compose.ui.geometry.a$a r1 = androidx.compose.p004ui.geometry.C15088a.f37248b
            long r1 = r1.mo42225a()
            r12 = r1
            goto L_0x002c
        L_0x002a:
            r12 = r26
        L_0x002c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0038
            androidx.compose.ui.geometry.a$a r0 = androidx.compose.p004ui.geometry.C15088a.f37248b
            long r0 = r0.mo42225a()
            r14 = r0
            goto L_0x003a
        L_0x0038:
            r14 = r28
        L_0x003a:
            r16 = 0
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r14, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.geometry.C15101k.<init>(float, float, float, float, long, long, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
