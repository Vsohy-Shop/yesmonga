package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.ComposerKt;
import kotlin.C11679z1;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11359p0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11600b;
import kotlin.text.Regex;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.graphics.r2 */
public final class C15307r2 implements Comparable<C15307r2> {

    /* renamed from: E0 */
    public static final short f37661E0 = m66500j0(1.0f);

    /* renamed from: F0 */
    public static final short f37662F0 = m66500j0(-1.0f);

    /* renamed from: G0 */
    public static final int f37663G0 = 15;

    /* renamed from: H0 */
    public static final int f37664H0 = 32768;

    /* renamed from: I0 */
    public static final int f37665I0 = 10;

    /* renamed from: J0 */
    public static final int f37666J0 = 31;

    /* renamed from: K0 */
    public static final int f37667K0 = 1023;

    /* renamed from: L0 */
    public static final int f37668L0 = 15;

    /* renamed from: M0 */
    public static final int f37669M0 = 32767;

    /* renamed from: N0 */
    public static final int f37670N0 = 31744;

    /* renamed from: O0 */
    public static final int f37671O0 = 31;

    /* renamed from: P0 */
    public static final int f37672P0 = 23;

    /* renamed from: Q0 */
    public static final int f37673Q0 = 255;

    /* renamed from: R0 */
    public static final int f37674R0 = 8388607;

    /* renamed from: S0 */
    public static final int f37675S0 = 127;

    /* renamed from: T0 */
    public static final int f37676T0 = 4194304;

    /* renamed from: U0 */
    public static final int f37677U0 = 1056964608;

    /* renamed from: V0 */
    public static final float f37678V0 = Float.intBitsToFloat(f37677U0);

    /* renamed from: X */
    public static final short f37679X = m66504m0(C11359p0.f28488b);

    /* renamed from: Y */
    public static final short f37680Y = m66504m0(31744);

    /* renamed from: Z */
    public static final short f37681Z = m66504m0(0);
    @C12579k

    /* renamed from: b */
    public static final C15308a f37682b = new C15308a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37683c = 16;

    /* renamed from: d */
    public static final short f37684d = m66504m0(5120);

    /* renamed from: e */
    public static final int f37685e = 15;

    /* renamed from: f */
    public static final int f37686f = -14;

    /* renamed from: g */
    public static final short f37687g = m66504m0(-1025);

    /* renamed from: v */
    public static final short f37688v = m66504m0(31743);

    /* renamed from: w */
    public static final short f37689w = m66504m0(1024);

    /* renamed from: x */
    public static final short f37690x = m66504m0(1);

    /* renamed from: y */
    public static final short f37691y = m66504m0(32256);

    /* renamed from: z */
    public static final short f37692z = m66504m0(-1024);

    /* renamed from: a */
    public final short f37693a;

    /* renamed from: androidx.compose.ui.graphics.r2$a */
    public static final class C15308a {
        public /* synthetic */ C15308a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final short mo42990c(float f) {
            int i;
            int i2;
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            int i3 = floatToRawIntBits >>> 31;
            int i4 = (floatToRawIntBits >>> 23) & 255;
            int i5 = floatToRawIntBits & C15307r2.f37674R0;
            int i6 = 31;
            int i7 = 0;
            if (i4 == 255) {
                if (i5 != 0) {
                    i2 = 512;
                }
                i = (i3 << 15) | (i6 << 10) | i7;
                return (short) i;
            }
            int i8 = i4 + ComposerKt.f22639i + 15;
            if (i8 >= 31) {
                i6 = 49;
            } else if (i8 > 0) {
                i7 = i5 >> 13;
                if ((i5 & 4096) != 0) {
                    i = (((i8 << 10) | i7) + 1) | (i3 << 15);
                    return (short) i;
                }
                i6 = i8;
            } else if (i8 >= -10) {
                int i9 = (i5 | 8388608) >> (1 - i8);
                if ((i9 & 4096) != 0) {
                    i9 += 8192;
                }
                i2 = i9 >> 13;
                i6 = 0;
            } else {
                i6 = 0;
            }
            i = (i3 << 15) | (i6 << 10) | i7;
            return (short) i;
            i7 = i2;
            i = (i3 << 15) | (i6 << 10) | i7;
            return (short) i;
        }

        /* renamed from: d */
        public final short mo42991d() {
            return C15307r2.f37684d;
        }

        /* renamed from: e */
        public final short mo42992e() {
            return C15307r2.f37687g;
        }

        /* renamed from: f */
        public final short mo42993f() {
            return C15307r2.f37688v;
        }

        /* renamed from: g */
        public final short mo42994g() {
            return C15307r2.f37689w;
        }

        /* renamed from: h */
        public final short mo42995h() {
            return C15307r2.f37690x;
        }

        /* renamed from: i */
        public final short mo42996i() {
            return C15307r2.f37691y;
        }

        /* renamed from: j */
        public final short mo42997j() {
            return C15307r2.f37692z;
        }

        /* renamed from: k */
        public final short mo42998k() {
            return C15307r2.f37679X;
        }

        /* renamed from: l */
        public final short mo42999l() {
            return C15307r2.f37680Y;
        }

        /* renamed from: m */
        public final short mo43000m() {
            return C15307r2.f37681Z;
        }

        /* renamed from: n */
        public final int mo43001n(short s) {
            return (s & C11359p0.f28488b) != 0 ? 32768 - (s & C11679z1.f28988d) : s & C11679z1.f28988d;
        }

        public C15308a() {
        }
    }

    static {
        C11377x xVar = C11377x.f28521a;
    }

    public /* synthetic */ C15307r2(short s) {
        this.f37693a = s;
    }

    /* renamed from: A0 */
    public static final short m66477A0(short s) {
        if (m66484L0(s)) {
            return f37691y;
        }
        if (m66498h0(s, f37679X) < 0) {
            return f37662F0;
        }
        if (m66498h0(s, f37681Z) > 0) {
            return f37661E0;
        }
        return s;
    }

    /* renamed from: A1 */
    public static final short m66478A1(short s) {
        int i;
        short s2 = s & C11679z1.f28988d;
        short s3 = s2 & C11359p0.f28489c;
        if (s3 < 15360) {
            i = 32768;
        } else {
            if (s3 < 25600) {
                i = ~((1 << (25 - (s3 >> 10))) - 1);
            }
            return m66504m0((short) s2);
        }
        s2 &= i;
        return m66504m0((short) s2);
    }

    /* renamed from: C0 */
    public static final int m66479C0(short s) {
        return s & 1023;
    }

    /* renamed from: E1 */
    public static final short m66480E1(short s, short s2) {
        return m66504m0((short) ((s & C11359p0.f28489c) | (s2 & C11359p0.f28488b)));
    }

    /* renamed from: F0 */
    public static int m66481F0(short s) {
        return Short.hashCode(s);
    }

    /* renamed from: H0 */
    public static final boolean m66482H0(short s) {
        return (s & C11359p0.f28489c) != 31744;
    }

    /* renamed from: K0 */
    public static final boolean m66483K0(short s) {
        return (s & C11359p0.f28489c) == 31744;
    }

    /* renamed from: L0 */
    public static final boolean m66484L0(short s) {
        return (s & C11359p0.f28489c) > 31744;
    }

    /* renamed from: N0 */
    public static final boolean m66486N0(short s) {
        short s2 = s & 31744;
        return (s2 == 0 || s2 == 31744) ? false : true;
    }

    /* renamed from: O0 */
    public static final short m66487O0(short s) {
        short s2 = C11679z1.f28988d;
        short s3 = s & C11679z1.f28988d;
        short s4 = s3 & C11359p0.f28489c;
        if (s4 < 15360) {
            short s5 = s3 & C11359p0.f28488b;
            if (s4 < 14336) {
                s2 = 0;
            }
            s3 = s5 | (s2 & 15360);
        } else if (s4 < 25600) {
            int i = 25 - (s4 >> 10);
            s3 = (s3 + (1 << (i - 1))) & (~((1 << i) - 1));
        }
        return m66504m0((short) s3);
    }

    /* renamed from: R0 */
    public static final int m66489R0(short s) {
        if (m66484L0(s)) {
            return f37691y;
        }
        return s & C11679z1.f28988d;
    }

    /* renamed from: U0 */
    public static final byte m66490U0(short s) {
        return (byte) ((int) m66501j1(s));
    }

    /* renamed from: Z */
    public static final /* synthetic */ C15307r2 m66493Z(short s) {
        return new C15307r2(s);
    }

    /* renamed from: b */
    public static final short m66494b(short s) {
        return m66504m0((short) (s & C11359p0.f28489c));
    }

    /* renamed from: c1 */
    public static final double m66495c1(short s) {
        return (double) m66501j1(s);
    }

    /* renamed from: e0 */
    public static final short m66496e0(short s) {
        short s2 = s & C11679z1.f28988d;
        short s3 = s2 & C11359p0.f28489c;
        int i = 1;
        if (s3 < 15360) {
            short s4 = 32768 & s2;
            int i2 = ~(s2 >> 15);
            if (s3 == 0) {
                i = 0;
            }
            s2 = ((-(i2 & i)) & 15360) | s4;
        } else if (s3 < 25600) {
            int i3 = (1 << (25 - (s3 >> 10))) - 1;
            s2 = (s2 + (i3 & ((s2 >> 15) - 1))) & (~i3);
        }
        return m66504m0((short) s2);
    }

    /* renamed from: h0 */
    public static int m66498h0(short s, short s2) {
        if (m66484L0(s)) {
            return m66484L0(s2) ^ true ? 1 : 0;
        }
        if (m66484L0(s2)) {
            return -1;
        }
        C15308a aVar = f37682b;
        return Intrinsics.compare(aVar.mo43001n(s), aVar.mo43001n(s2));
    }

    /* renamed from: i0 */
    public static short m66499i0(double d) {
        return m66500j0((float) d);
    }

    /* renamed from: j0 */
    public static short m66500j0(float f) {
        return m66504m0(f37682b.mo42990c(f));
    }

    /* renamed from: j1 */
    public static final float m66501j1(short s) {
        int i;
        int i2;
        int i3;
        short s2 = s & C11679z1.f28988d;
        short s3 = 32768 & s2;
        int i4 = (s2 >>> 10) & 31;
        short s4 = s2 & 1023;
        if (i4 != 0) {
            int i5 = s4 << 13;
            if (i4 == 31) {
                i3 = 255;
                if (i5 != 0) {
                    i5 |= 4194304;
                }
            } else {
                i3 = (i4 - 15) + 127;
            }
            int i6 = i3;
            i2 = i5;
            i = i6;
        } else if (s4 != 0) {
            C11377x xVar = C11377x.f28521a;
            float intBitsToFloat = Float.intBitsToFloat(s4 + f37677U0) - f37678V0;
            if (s3 == 0) {
                return intBitsToFloat;
            }
            return -intBitsToFloat;
        } else {
            i = 0;
            i2 = 0;
        }
        int i7 = i << 23;
        C11377x xVar2 = C11377x.f28521a;
        return Float.intBitsToFloat(i7 | (s3 << 16) | i2);
    }

    @C12579k
    /* renamed from: k1 */
    public static final String m66502k1(short s) {
        StringBuilder sb = new StringBuilder();
        short s2 = s & C11679z1.f28988d;
        int i = s2 >>> 15;
        int i2 = (s2 >>> 10) & 31;
        short s3 = s2 & 1023;
        if (i2 != 31) {
            if (i == 1) {
                sb.append('-');
            }
            if (i2 != 0) {
                sb.append("0x1.");
                String num = Integer.toString(s3, C11600b.m45172a(16));
                Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").mo23338o(num, ""));
                sb.append('p');
                sb.append(String.valueOf(i2 - 15));
            } else if (s3 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                String num2 = Integer.toString(s3, C11600b.m45172a(16));
                Intrinsics.checkNotNullExpressionValue(num2, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").mo23338o(num2, ""));
                sb.append("p-14");
            }
        } else if (s3 == 0) {
            if (i != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "o.toString()");
        return sb2;
    }

    /* renamed from: l1 */
    public static final int m66503l1(short s) {
        return (int) m66501j1(s);
    }

    /* renamed from: m0 */
    public static short m66504m0(short s) {
        return s;
    }

    /* renamed from: n0 */
    public static boolean m66505n0(short s, Object obj) {
        return (obj instanceof C15307r2) && s == ((C15307r2) obj).mo42983B1();
    }

    /* renamed from: n1 */
    public static final long m66506n1(short s) {
        return (long) m66501j1(s);
    }

    /* renamed from: o0 */
    public static final boolean m66507o0(short s, short s2) {
        return s == s2;
    }

    /* renamed from: p0 */
    public static final short m66508p0(short s) {
        short s2 = C11679z1.f28988d;
        short s3 = s & C11679z1.f28988d;
        short s4 = s3 & C11359p0.f28489c;
        if (s4 < 15360) {
            short s5 = s3 & C11359p0.f28488b;
            if (s3 <= 32768) {
                s2 = 0;
            }
            s3 = (s2 & 15360) | s5;
        } else if (s4 < 25600) {
            int i = (1 << (25 - (s4 >> 10))) - 1;
            s3 = (s3 + ((-(s3 >> 15)) & i)) & (~i);
        }
        return m66504m0((short) s3);
    }

    /* renamed from: q1 */
    public static final int m66510q1(short s) {
        return s & C11679z1.f28988d;
    }

    /* renamed from: t0 */
    public static final int m66512t0(short s) {
        return ((s >>> 10) & 31) - 15;
    }

    /* renamed from: w1 */
    public static final short m66514w1(short s) {
        return (short) ((int) m66501j1(s));
    }

    @C12579k
    /* renamed from: z1 */
    public static String m66517z1(short s) {
        return String.valueOf(m66501j1(s));
    }

    /* renamed from: B1 */
    public final /* synthetic */ short mo42983B1() {
        return this.f37693a;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return mo42986f0(((C15307r2) obj).mo42983B1());
    }

    public boolean equals(Object obj) {
        return m66505n0(this.f37693a, obj);
    }

    /* renamed from: f0 */
    public int mo42986f0(short s) {
        return m66498h0(this.f37693a, s);
    }

    public int hashCode() {
        return m66481F0(this.f37693a);
    }

    @C12579k
    public String toString() {
        return m66517z1(this.f37693a);
    }

    /* renamed from: u0 */
    public final short mo42989u0() {
        return this.f37693a;
    }
}
