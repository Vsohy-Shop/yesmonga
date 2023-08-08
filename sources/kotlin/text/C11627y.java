package kotlin.text;

import kotlin.C11093f2;
import kotlin.C11096g1;
import kotlin.C11097g2;
import kotlin.C11397k1;
import kotlin.C11400l1;
import kotlin.C11419p1;
import kotlin.C11531s;
import kotlin.C11588t1;
import kotlin.C11665v0;
import kotlin.C11679z1;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "UStringsKt")
/* renamed from: kotlin.text.y */
public final class C11627y {
    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: a */
    public static final String m45374a(long j, int i) {
        return C11093f2.m42723l(j, C11600b.m45172a(i));
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: b */
    public static final String m45375b(byte b, int i) {
        String num = Integer.toString(b & 255, C11600b.m45172a(i));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: c */
    public static final String m45376c(int i, int i2) {
        String l = Long.toString(((long) i) & 4294967295L, C11600b.m45172a(i2));
        Intrinsics.checkNotNullExpressionValue(l, "toString(this, checkRadix(radix))");
        return l;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: d */
    public static final String m45377d(short s, int i) {
        String num = Integer.toString(s & C11679z1.f28988d, C11600b.m45172a(i));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: e */
    public static final byte m45378e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11400l1 g = m45380g(str);
        if (g != null) {
            return g.mo22897e2();
        }
        C11621s.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: f */
    public static final byte m45379f(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11400l1 h = m45381h(str, i);
        if (h != null) {
            return h.mo22897e2();
        }
        C11621s.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @C11097g2(markerClass = {C11531s.class})
    @C12580l
    @C11665v0(version = "1.5")
    /* renamed from: g */
    public static final C11400l1 m45380g(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m45381h(str, 10);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C12580l
    @C11665v0(version = "1.5")
    /* renamed from: h */
    public static final C11400l1 m45381h(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11419p1 l = m45385l(str, i);
        if (l == null) {
            return null;
        }
        int j2 = l.mo22930j2();
        if (Integer.compare(j2 ^ Integer.MIN_VALUE, C11419p1.m43971M(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return C11400l1.m43782g(C11400l1.m43761M((byte) j2));
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: i */
    public static final int m45382i(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11419p1 k = m45384k(str);
        if (k != null) {
            return k.mo22930j2();
        }
        C11621s.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: j */
    public static final int m45383j(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11419p1 l = m45385l(str, i);
        if (l != null) {
            return l.mo22930j2();
        }
        C11621s.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @C11097g2(markerClass = {C11531s.class})
    @C12580l
    @C11665v0(version = "1.5")
    /* renamed from: k */
    public static final C11419p1 m45384k(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m45385l(str, 10);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C12580l
    @C11665v0(version = "1.5")
    /* renamed from: l */
    public static final C11419p1 m45385l(@C12579k String str, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11600b.m45172a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int M = C11419p1.m43971M(i);
        int i4 = 119304647;
        while (i2 < length) {
            int b = C11600b.m45173b(str.charAt(i2), i);
            if (b < 0) {
                return null;
            }
            if (Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE) > 0) {
                if (i4 == 119304647) {
                    i4 = C11096g1.m42744a(-1, M);
                    if (Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int M2 = C11419p1.m43971M(i3 * M);
            int M3 = C11419p1.m43971M(C11419p1.m43971M(b) + M2);
            if (Integer.compare(M3 ^ Integer.MIN_VALUE, M2 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            i3 = M3;
        }
        return C11419p1.m43993g(i3);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: m */
    public static final long m45386m(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11588t1 o = m45388o(str);
        if (o != null) {
            return o.mo23301j2();
        }
        C11621s.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: n */
    public static final long m45387n(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11588t1 p = m45389p(str, i);
        if (p != null) {
            return p.mo23301j2();
        }
        C11621s.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @C11097g2(markerClass = {C11531s.class})
    @C12580l
    @C11665v0(version = "1.5")
    /* renamed from: o */
    public static final C11588t1 m45388o(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m45389p(str, 10);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C12580l
    @C11665v0(version = "1.5")
    /* renamed from: p */
    public static final C11588t1 m45389p(@C12579k String str, int i) {
        String str2 = str;
        int i2 = i;
        Intrinsics.checkNotNullParameter(str2, "<this>");
        C11600b.m45172a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str2.charAt(0);
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i3 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long M = C11588t1.m44970M((long) i2);
        long j = 0;
        long j2 = 512409557603043100L;
        while (i3 < length) {
            int b = C11600b.m45173b(str2.charAt(i3), i2);
            if (b < 0) {
                return null;
            }
            if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0) {
                if (j2 == 512409557603043100L) {
                    j2 = C11397k1.m43746a(-1, M);
                    if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long M2 = C11588t1.m44970M(j * M);
            long M3 = C11588t1.m44970M(C11588t1.m44970M(((long) C11419p1.m43971M(b)) & 4294967295L) + M2);
            if (Long.compare(M3 ^ Long.MIN_VALUE, M2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i3++;
            j = M3;
        }
        return C11588t1.m44992g(j);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: q */
    public static final short m45390q(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11679z1 s = m45392s(str);
        if (s != null) {
            return s.mo23548e2();
        }
        C11621s.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @C11097g2(markerClass = {C11531s.class})
    @C11665v0(version = "1.5")
    /* renamed from: r */
    public static final short m45391r(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11679z1 t = m45393t(str, i);
        if (t != null) {
            return t.mo23548e2();
        }
        C11621s.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @C11097g2(markerClass = {C11531s.class})
    @C12580l
    @C11665v0(version = "1.5")
    /* renamed from: s */
    public static final C11679z1 m45392s(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m45393t(str, 10);
    }

    @C11097g2(markerClass = {C11531s.class})
    @C12580l
    @C11665v0(version = "1.5")
    /* renamed from: t */
    public static final C11679z1 m45393t(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11419p1 l = m45385l(str, i);
        if (l == null) {
            return null;
        }
        int j2 = l.mo22930j2();
        if (Integer.compare(j2 ^ Integer.MIN_VALUE, C11419p1.m43971M(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return C11679z1.m45862g(C11679z1.m45841M((short) j2));
    }
}
