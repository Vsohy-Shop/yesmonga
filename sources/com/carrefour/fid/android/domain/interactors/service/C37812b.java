package com.carrefour.fid.android.domain.interactors.service;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.service.models.C38166m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.service.b */
public interface C37812b extends C37679f<C37813a, C38166m> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.service.b$a */
    public static final class C37813a {

        /* renamed from: a */
        public final double f94900a;

        /* renamed from: b */
        public final double f94901b;

        /* renamed from: c */
        public final boolean f94902c;

        /* renamed from: d */
        public final int f94903d;

        /* renamed from: e */
        public final int f94904e;

        /* renamed from: f */
        public final int f94905f;

        /* renamed from: g */
        public final boolean f94906g;

        /* renamed from: h */
        public final boolean f94907h;

        public C37813a(double d, double d2, boolean z, int i, int i2, int i3, boolean z2, boolean z3) {
            this.f94900a = d;
            this.f94901b = d2;
            this.f94902c = z;
            this.f94903d = i;
            this.f94904e = i2;
            this.f94905f = i3;
            this.f94906g = z2;
            this.f94907h = z3;
        }

        /* renamed from: j */
        public static /* synthetic */ C37813a m154981j(C37813a aVar, double d, double d2, boolean z, int i, int i2, int i3, boolean z2, boolean z3, int i4, Object obj) {
            C37813a aVar2 = aVar;
            int i5 = i4;
            return aVar.mo115222i((i5 & 1) != 0 ? aVar2.f94900a : d, (i5 & 2) != 0 ? aVar2.f94901b : d2, (i5 & 4) != 0 ? aVar2.f94902c : z, (i5 & 8) != 0 ? aVar2.f94903d : i, (i5 & 16) != 0 ? aVar2.f94904e : i2, (i5 & 32) != 0 ? aVar2.f94905f : i3, (i5 & 64) != 0 ? aVar2.f94906g : z2, (i5 & 128) != 0 ? aVar2.f94907h : z3);
        }

        /* renamed from: a */
        public final double mo115212a() {
            return this.f94900a;
        }

        /* renamed from: b */
        public final double mo115213b() {
            return this.f94901b;
        }

        /* renamed from: c */
        public final boolean mo115214c() {
            return this.f94902c;
        }

        /* renamed from: d */
        public final int mo115215d() {
            return this.f94903d;
        }

        /* renamed from: e */
        public final int mo115216e() {
            return this.f94904e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37813a)) {
                return false;
            }
            C37813a aVar = (C37813a) obj;
            return Double.compare(this.f94900a, aVar.f94900a) == 0 && Double.compare(this.f94901b, aVar.f94901b) == 0 && this.f94902c == aVar.f94902c && this.f94903d == aVar.f94903d && this.f94904e == aVar.f94904e && this.f94905f == aVar.f94905f && this.f94906g == aVar.f94906g && this.f94907h == aVar.f94907h;
        }

        /* renamed from: f */
        public final int mo115218f() {
            return this.f94905f;
        }

        /* renamed from: g */
        public final boolean mo115219g() {
            return this.f94906g;
        }

        /* renamed from: h */
        public final boolean mo115220h() {
            return this.f94907h;
        }

        public int hashCode() {
            int hashCode = ((Double.hashCode(this.f94900a) * 31) + Double.hashCode(this.f94901b)) * 31;
            boolean z = this.f94902c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode2 = (((((((hashCode + (z ? 1 : 0)) * 31) + Integer.hashCode(this.f94903d)) * 31) + Integer.hashCode(this.f94904e)) * 31) + Integer.hashCode(this.f94905f)) * 31;
            boolean z3 = this.f94906g;
            if (z3) {
                z3 = true;
            }
            int i = (hashCode2 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f94907h;
            if (!z4) {
                z2 = z4;
            }
            return i + (z2 ? 1 : 0);
        }

        @C12579k
        /* renamed from: i */
        public final C37813a mo115222i(double d, double d2, boolean z, int i, int i2, int i3, boolean z2, boolean z3) {
            return new C37813a(d, d2, z, i, i2, i3, z2, z3);
        }

        /* renamed from: k */
        public final double mo115223k() {
            return this.f94900a;
        }

        /* renamed from: l */
        public final double mo115224l() {
            return this.f94901b;
        }

        /* renamed from: m */
        public final int mo115225m() {
            return this.f94905f;
        }

        /* renamed from: n */
        public final int mo115226n() {
            return this.f94903d;
        }

        /* renamed from: o */
        public final boolean mo115227o() {
            return this.f94902c;
        }

        /* renamed from: p */
        public final int mo115228p() {
            return this.f94904e;
        }

        /* renamed from: q */
        public final boolean mo115229q() {
            return this.f94907h;
        }

        /* renamed from: r */
        public final boolean mo115230r() {
            return this.f94906g;
        }

        @C12579k
        public String toString() {
            double d = this.f94900a;
            double d2 = this.f94901b;
            boolean z = this.f94902c;
            int i = this.f94903d;
            int i2 = this.f94904e;
            int i3 = this.f94905f;
            boolean z2 = this.f94906g;
            boolean z3 = this.f94907h;
            return "Param(latitude=" + d + ", longitude=" + d2 + ", shouldFilterOutExpressServices=" + z + ", radius=" + i + ", size=" + i2 + ", page=" + i3 + ", withLadServices=" + z2 + ", withH1h3Services=" + z3 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C37813a(double r15, double r17, boolean r19, int r20, int r21, int r22, boolean r23, boolean r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
            /*
                r14 = this;
                r0 = r25
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r8 = r2
                goto L_0x000b
            L_0x0009:
                r8 = r19
            L_0x000b:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0013
                r1 = 1000(0x3e8, float:1.401E-42)
                r9 = r1
                goto L_0x0015
            L_0x0013:
                r9 = r20
            L_0x0015:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x001d
                r1 = 10
                r10 = r1
                goto L_0x001f
            L_0x001d:
                r10 = r21
            L_0x001f:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0025
                r11 = r2
                goto L_0x0027
            L_0x0025:
                r11 = r22
            L_0x0027:
                r1 = r0 & 64
                r2 = 1
                if (r1 == 0) goto L_0x002e
                r12 = r2
                goto L_0x0030
            L_0x002e:
                r12 = r23
            L_0x0030:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0036
                r13 = r2
                goto L_0x0038
            L_0x0036:
                r13 = r24
            L_0x0038:
                r3 = r14
                r4 = r15
                r6 = r17
                r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.service.C37812b.C37813a.<init>(double, double, boolean, int, int, int, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
