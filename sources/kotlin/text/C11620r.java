package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n1#1,283:1\n274#1,7:284\n274#1,7:291\n274#1,7:298\n274#1,7:305\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n151#1:284,7\n158#1:291,7\n238#1:298,7\n249#1:305,7\n*E\n"})
/* renamed from: kotlin.text.r */
public class C11620r extends C11619q {
    /* renamed from: c0 */
    public static final <T> T m45303c0(String str, C11300l<? super String, ? extends T> lVar) {
        try {
            if (C11614l.f28891b.mo23334k(str)) {
                return lVar.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: d0 */
    public static final BigDecimal m45304d0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigDecimal(str);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: e0 */
    public static final BigDecimal m45305e0(String str, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: f0 */
    public static final BigInteger m45306f0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigInteger(str);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: g0 */
    public static final BigInteger m45307g0(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigInteger(str, C11600b.m45172a(i));
    }

    @C11110f
    @C11314h(name = "toBooleanNullable")
    @C11665v0(version = "1.4")
    /* renamed from: i0 */
    public static final boolean m45309i0(String str) {
        return Boolean.parseBoolean(str);
    }

    @C11110f
    /* renamed from: j0 */
    public static final byte m45310j0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: k0 */
    public static final byte m45311k0(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str, C11600b.m45172a(i));
    }

    @C11110f
    /* renamed from: l0 */
    public static final double m45312l0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Double.parseDouble(str);
    }

    @C11110f
    /* renamed from: m0 */
    public static final float m45313m0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Float.parseFloat(str);
    }

    @C11110f
    /* renamed from: n0 */
    public static final int m45314n0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: o0 */
    public static final int m45315o0(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str, C11600b.m45172a(i));
    }

    @C11110f
    /* renamed from: p0 */
    public static final long m45316p0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: q0 */
    public static final long m45317q0(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str, C11600b.m45172a(i));
    }

    @C11110f
    /* renamed from: r0 */
    public static final short m45318r0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: s0 */
    public static final short m45319s0(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str, C11600b.m45172a(i));
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: t0 */
    public static final String m45320t0(byte b, int i) {
        String num = Integer.toString(b, C11600b.m45172a(C11600b.m45172a(i)));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @C12580l
    @C11665v0(version = "1.2")
    public static final BigDecimal toBigDecimalOrNull(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (C11614l.f28891b.mo23334k(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @C12580l
    @C11665v0(version = "1.2")
    public static final BigInteger toBigIntegerOrNull(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toBigIntegerOrNull(str, 10);
    }

    @C12580l
    @C11665v0(version = "1.1")
    public static final Double toDoubleOrNull(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (C11614l.f28891b.mo23334k(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @C12580l
    @C11665v0(version = "1.1")
    public static final Float toFloatOrNull(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (C11614l.f28891b.mo23334k(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: u0 */
    public static final String m45321u0(int i, int i2) {
        String num = Integer.toString(i, C11600b.m45172a(i2));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: v0 */
    public static final String m45322v0(long j, int i) {
        String l = Long.toString(j, C11600b.m45172a(i));
        Intrinsics.checkNotNullExpressionValue(l, "toString(this, checkRadix(radix))");
        return l;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: w0 */
    public static final String m45323w0(short s, int i) {
        String num = Integer.toString(s, C11600b.m45172a(C11600b.m45172a(i)));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @C12580l
    @C11665v0(version = "1.2")
    public static final BigInteger toBigIntegerOrNull(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C11600b.m45172a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        if (length != 1) {
            if (str.charAt(0) == '-') {
                i2 = 1;
            }
            while (i2 < length) {
                if (C11600b.m45173b(str.charAt(i2), i) < 0) {
                    return null;
                }
                i2++;
            }
        } else if (C11600b.m45173b(str.charAt(0), i) < 0) {
            return null;
        }
        return new BigInteger(str, C11600b.m45172a(i));
    }

    @C12580l
    @C11665v0(version = "1.2")
    public static final BigDecimal toBigDecimalOrNull(@C12579k String str, @C12579k MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        try {
            if (C11614l.f28891b.mo23334k(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
