package kotlin.comparisons;

import kotlin.C10857a2;
import kotlin.C11097g2;
import kotlin.C11404m1;
import kotlin.C11431q1;
import kotlin.C11531s;
import kotlin.C11662u1;
import kotlin.C11665v0;
import kotlin.C11679z1;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.comparisons.n */
public class C11022n {
    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: a */
    public static final short m42490a(short s, short s2) {
        return Intrinsics.compare((int) s & C11679z1.f28988d, (int) 65535 & s2) >= 0 ? s : s2;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: b */
    public static final int m42491b(int i, int i2) {
        return Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) >= 0 ? i : i2;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: c */
    public static final byte m42492c(byte b, byte b2) {
        return Intrinsics.compare((int) b & 255, (int) b2 & 255) >= 0 ? b : b2;
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: d */
    public static final int m42493d(int i, @C12579k int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "other");
        int X = C11431q1.m44045X(iArr);
        for (int i2 = 0; i2 < X; i2++) {
            i = m42491b(i, C11431q1.m44044Q(iArr, i2));
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: e */
    public static final long m42494e(long j, @C12579k long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "other");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            j = m42499j(j, C11662u1.m45750Q(jArr, i));
        }
        return j;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: f */
    public static final short m42495f(short s, short s2, short s3) {
        return m42490a(s, m42490a(s2, s3));
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: g */
    public static final int m42496g(int i, int i2, int i3) {
        return m42491b(i, m42491b(i2, i3));
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: h */
    public static final byte m42497h(byte b, @C12579k byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, "other");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            b = m42492c(b, C11404m1.m43808Q(bArr, i));
        }
        return b;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: i */
    public static final byte m42498i(byte b, byte b2, byte b3) {
        return m42492c(b, m42492c(b2, b3));
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: j */
    public static final long m42499j(long j, long j2) {
        return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) >= 0 ? j : j2;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: k */
    public static final long m42500k(long j, long j2, long j3) {
        return m42499j(j, m42499j(j2, j3));
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: l */
    public static final short m42501l(short s, @C12579k short... sArr) {
        Intrinsics.checkNotNullParameter(sArr, "other");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            s = m42490a(s, C10857a2.m38726Q(sArr, i));
        }
        return s;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: m */
    public static final short m42502m(short s, short s2) {
        return Intrinsics.compare((int) s & C11679z1.f28988d, (int) 65535 & s2) <= 0 ? s : s2;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: n */
    public static final int m42503n(int i, int i2) {
        return Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) <= 0 ? i : i2;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: o */
    public static final byte m42504o(byte b, byte b2) {
        return Intrinsics.compare((int) b & 255, (int) b2 & 255) <= 0 ? b : b2;
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: p */
    public static final int m42505p(int i, @C12579k int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "other");
        int X = C11431q1.m44045X(iArr);
        for (int i2 = 0; i2 < X; i2++) {
            i = m42503n(i, C11431q1.m44044Q(iArr, i2));
        }
        return i;
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: q */
    public static final long m42506q(long j, @C12579k long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "other");
        int X = C11662u1.m45751X(jArr);
        for (int i = 0; i < X; i++) {
            j = m42511v(j, C11662u1.m45750Q(jArr, i));
        }
        return j;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: r */
    public static final short m42507r(short s, short s2, short s3) {
        return m42502m(s, m42502m(s2, s3));
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: s */
    public static final int m42508s(int i, int i2, int i3) {
        return m42503n(i, m42503n(i2, i3));
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: t */
    public static final byte m42509t(byte b, @C12579k byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, "other");
        int X = C11404m1.m43809X(bArr);
        for (int i = 0; i < X; i++) {
            b = m42504o(b, C11404m1.m43808Q(bArr, i));
        }
        return b;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: u */
    public static final byte m42510u(byte b, byte b2, byte b3) {
        return m42504o(b, m42504o(b2, b3));
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: v */
    public static final long m42511v(long j, long j2) {
        return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) <= 0 ? j : j2;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: w */
    public static final long m42512w(long j, long j2, long j3) {
        return m42511v(j, m42511v(j2, j3));
    }

    @C11531s
    @C11665v0(version = "1.4")
    /* renamed from: x */
    public static final short m42513x(short s, @C12579k short... sArr) {
        Intrinsics.checkNotNullParameter(sArr, "other");
        int X = C10857a2.m38727X(sArr);
        for (int i = 0; i < X; i++) {
            s = m42502m(s, C10857a2.m38726Q(sArr, i));
        }
        return s;
    }
}
