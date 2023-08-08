package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.graphics.colorspace.C15135b;
import androidx.compose.p004ui.graphics.colorspace.C15138c;
import androidx.compose.p004ui.graphics.colorspace.C15144g;
import androidx.compose.p004ui.graphics.colorspace.C15149i;
import androidx.compose.p004ui.graphics.colorspace.Rgb;
import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8547h2;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11588t1;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,659:1\n587#1:660\n587#1:661\n587#1:662\n646#1:663\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n567#1:660\n568#1:661\n569#1:662\n658#1:663\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.l2 */
public final class C15258l2 {
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0148  */
    @androidx.compose.runtime.C8547h2
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m66176a(float r9, float r10, float r11, float r12, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.colorspace.C15138c r13) {
        /*
            java.lang.String r0 = "colorSpace"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 0
            float r1 = r13.mo42514f(r0)
            float r2 = r13.mo42511e(r0)
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r3 = 1
            if (r2 > 0) goto L_0x0019
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x0019
            r1 = r3
            goto L_0x001a
        L_0x0019:
            r1 = r0
        L_0x001a:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r1 == 0) goto L_0x0059
            float r1 = r13.mo42514f(r3)
            float r5 = r13.mo42511e(r3)
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0031
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0031
            r1 = r3
            goto L_0x0032
        L_0x0031:
            r1 = r0
        L_0x0032:
            if (r1 == 0) goto L_0x0059
            r1 = 2
            float r5 = r13.mo42514f(r1)
            float r1 = r13.mo42511e(r1)
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            r1 = r3
            goto L_0x0048
        L_0x0047:
            r1 = r0
        L_0x0048:
            if (r1 == 0) goto L_0x0059
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            r1 = r3
            goto L_0x0055
        L_0x0054:
            r1 = r0
        L_0x0055:
            if (r1 == 0) goto L_0x0059
            r1 = r3
            goto L_0x005a
        L_0x0059:
            r1 = r0
        L_0x005a:
            if (r1 == 0) goto L_0x0148
            boolean r1 = r13.mo42519i()
            r5 = 32
            r6 = 16
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x0097
            r13 = 1132396544(0x437f0000, float:255.0)
            float r12 = r12 * r13
            float r12 = r12 + r7
            int r12 = (int) r12
            int r12 = r12 << 24
            float r9 = r9 * r13
            float r9 = r9 + r7
            int r9 = (int) r9
            int r9 = r9 << r6
            r9 = r9 | r12
            float r10 = r10 * r13
            float r10 = r10 + r7
            int r10 = (int) r10
            int r10 = r10 << 8
            r9 = r9 | r10
            float r11 = r11 * r13
            float r11 = r11 + r7
            int r10 = (int) r11
            r9 = r9 | r10
            long r9 = (long) r9
            long r9 = kotlin.C11588t1.m44970M(r9)
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            long r9 = kotlin.C11588t1.m44970M(r9)
            long r9 = r9 << r5
            long r9 = kotlin.C11588t1.m44970M(r9)
            long r9 = androidx.compose.p004ui.graphics.C15240j2.m66077t(r9)
            return r9
        L_0x0097:
            int r1 = r13.mo42583c()
            r8 = 3
            if (r1 != r8) goto L_0x00a0
            r1 = r3
            goto L_0x00a1
        L_0x00a0:
            r1 = r0
        L_0x00a1:
            if (r1 == 0) goto L_0x013c
            int r13 = r13.mo42584d()
            r1 = -1
            if (r13 == r1) goto L_0x00ab
            r0 = r3
        L_0x00ab:
            if (r0 == 0) goto L_0x0130
            short r9 = androidx.compose.p004ui.graphics.C15307r2.m66500j0(r9)
            short r10 = androidx.compose.p004ui.graphics.C15307r2.m66500j0(r10)
            short r11 = androidx.compose.p004ui.graphics.C15307r2.m66500j0(r11)
            float r12 = java.lang.Math.min(r12, r2)
            float r12 = java.lang.Math.max(r4, r12)
            r0 = 1149222912(0x447fc000, float:1023.0)
            float r12 = r12 * r0
            float r12 = r12 + r7
            int r12 = (int) r12
            long r0 = (long) r9
            long r0 = kotlin.C11588t1.m44970M(r0)
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = kotlin.C11588t1.m44970M(r0)
            r9 = 48
            long r0 = r0 << r9
            long r0 = kotlin.C11588t1.m44970M(r0)
            long r9 = (long) r10
            long r9 = kotlin.C11588t1.m44970M(r9)
            long r9 = r9 & r2
            long r9 = kotlin.C11588t1.m44970M(r9)
            long r9 = r9 << r5
            long r9 = kotlin.C11588t1.m44970M(r9)
            long r9 = r9 | r0
            long r9 = kotlin.C11588t1.m44970M(r9)
            long r0 = (long) r11
            long r0 = kotlin.C11588t1.m44970M(r0)
            long r0 = r0 & r2
            long r0 = kotlin.C11588t1.m44970M(r0)
            long r0 = r0 << r6
            long r0 = kotlin.C11588t1.m44970M(r0)
            long r9 = r9 | r0
            long r9 = kotlin.C11588t1.m44970M(r9)
            long r11 = (long) r12
            long r11 = kotlin.C11588t1.m44970M(r11)
            r0 = 1023(0x3ff, double:5.054E-321)
            long r11 = r11 & r0
            long r11 = kotlin.C11588t1.m44970M(r11)
            r0 = 6
            long r11 = r11 << r0
            long r11 = kotlin.C11588t1.m44970M(r11)
            long r9 = r9 | r11
            long r9 = kotlin.C11588t1.m44970M(r9)
            long r11 = (long) r13
            long r11 = kotlin.C11588t1.m44970M(r11)
            r0 = 63
            long r11 = r11 & r0
            long r11 = kotlin.C11588t1.m44970M(r11)
            long r9 = r9 | r11
            long r9 = kotlin.C11588t1.m44970M(r9)
            long r9 = androidx.compose.p004ui.graphics.C15240j2.m66077t(r9)
            return r9
        L_0x0130:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unknown color space, please use a color space in ColorSpaces"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x013c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Color only works with ColorSpaces with 3 components"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0148:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "red = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = ", green = "
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = ", blue = "
            r0.append(r9)
            r0.append(r11)
            java.lang.String r9 = ", alpha = "
            r0.append(r9)
            r0.append(r12)
            java.lang.String r9 = " outside the range for "
            r0.append(r9)
            r0.append(r13)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.C15258l2.m66176a(float, float, float, float, androidx.compose.ui.graphics.colorspace.c):long");
    }

    @C8547h2
    /* renamed from: b */
    public static final long m66177b(int i) {
        return C15240j2.m66077t(C11588t1.m44970M(C11588t1.m44970M((long) i) << 32));
    }

    @C8547h2
    /* renamed from: c */
    public static final long m66178c(int i, int i2, int i3, int i4) {
        return m66177b(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    @C8547h2
    /* renamed from: d */
    public static final long m66179d(long j) {
        return C15240j2.m66077t(C11588t1.m44970M(C11588t1.m44970M(C11588t1.m44970M(j) & 4294967295L) << 32));
    }

    /* renamed from: e */
    public static /* synthetic */ long m66180e(float f, float f2, float f3, float f4, C15138c cVar, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            cVar = C15144g.f37408a.mo42612x();
        }
        return m66176a(f, f2, f3, f4, cVar);
    }

    /* renamed from: f */
    public static /* synthetic */ long m66181f(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return m66178c(i, i2, i3, i4);
    }

    /* renamed from: g */
    public static final float m66182g(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return ((f * f3) + ((f2 * f4) * (1.0f - f3))) / f5;
    }

    @C8547h2
    /* renamed from: h */
    public static final long m66183h(long j, long j2) {
        boolean z;
        float f;
        boolean z2;
        float f2;
        long u = C15240j2.m66078u(j, C15240j2.m66051E(j2));
        float A = C15240j2.m66047A(j2);
        float A2 = C15240j2.m66047A(u);
        float f3 = 1.0f - A2;
        float f4 = (A * f3) + A2;
        float I = C15240j2.m66055I(u);
        float I2 = C15240j2.m66055I(j2);
        float f5 = 0.0f;
        int i = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
        boolean z3 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = ((I * A2) + ((I2 * A) * f3)) / f4;
        }
        float G = C15240j2.m66053G(u);
        float G2 = C15240j2.m66053G(j2);
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f2 = 0.0f;
        } else {
            f2 = ((G * A2) + ((G2 * A) * f3)) / f4;
        }
        float C = C15240j2.m66049C(u);
        float C2 = C15240j2.m66049C(j2);
        if (i != 0) {
            z3 = false;
        }
        if (!z3) {
            f5 = ((C * A2) + ((C2 * A) * f3)) / f4;
        }
        return m66176a(f, f2, f5, f4, C15240j2.m66051E(j2));
    }

    /* renamed from: i */
    public static final float[] m66184i(long j) {
        return new float[]{C15240j2.m66055I(j), C15240j2.m66053G(j), C15240j2.m66049C(j), C15240j2.m66047A(j)};
    }

    /* renamed from: j */
    public static final boolean m66185j(long j) {
        return j != C15240j2.f37547b.mo42851u();
    }

    @C8547h2
    /* renamed from: k */
    public static /* synthetic */ void m66186k(long j) {
    }

    /* renamed from: l */
    public static final boolean m66187l(long j) {
        return j == C15240j2.f37547b.mo42851u();
    }

    @C8547h2
    /* renamed from: m */
    public static /* synthetic */ void m66188m(long j) {
    }

    @C8547h2
    /* renamed from: n */
    public static final long m66189n(long j, long j2, float f) {
        C15138c u = C15144g.f37408a.mo42609u();
        long u2 = C15240j2.m66078u(j, u);
        long u3 = C15240j2.m66078u(j2, u);
        float A = C15240j2.m66047A(u2);
        float I = C15240j2.m66055I(u2);
        float G = C15240j2.m66053G(u2);
        float C = C15240j2.m66049C(u2);
        float A2 = C15240j2.m66047A(u3);
        float I2 = C15240j2.m66055I(u3);
        float G2 = C15240j2.m66053G(u3);
        float C2 = C15240j2.m66049C(u3);
        return C15240j2.m66078u(m66176a(C16515d.m74781a(I, I2, f), C16515d.m74781a(G, G2, f), C16515d.m74781a(C, C2, f), C16515d.m74781a(A, A2, f), u), C15240j2.m66051E(j2));
    }

    @C8547h2
    /* renamed from: o */
    public static final float m66190o(long j) {
        C15138c E = C15240j2.m66051E(j);
        if (C15135b.m65390h(E.mo42585g(), C15135b.f37394b.mo42571c())) {
            Intrinsics.checkNotNull(E, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            C15149i T = ((Rgb) E).mo42499T();
            return m66191p((float) ((T.mo42590a((double) C15240j2.m66055I(j)) * 0.2126d) + (T.mo42590a((double) C15240j2.m66053G(j)) * 0.7152d) + (T.mo42590a((double) C15240j2.m66049C(j)) * 0.0722d)));
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + C15135b.m65394l(E.mo42585g())).toString());
    }

    /* renamed from: p */
    public static final float m66191p(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            f2 = 1.0f;
            if (f < 1.0f) {
                return f;
            }
        }
        return f2;
    }

    /* renamed from: q */
    public static final long m66192q(long j, @C12579k C11289a<C15240j2> aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (j != C15240j2.f37547b.mo42851u()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        return aVar.invoke().mo42833M();
    }

    @C8547h2
    /* renamed from: r */
    public static final int m66193r(long j) {
        return (int) C11588t1.m44970M(C15240j2.m66078u(j, C15144g.f37408a.mo42612x()) >>> 32);
    }
}
