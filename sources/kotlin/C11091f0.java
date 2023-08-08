package kotlin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.f0 */
public class C11091f0 {
    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: a */
    public static final BigDecimal m42695a(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        Intrinsics.checkNotNullExpressionValue(subtract, "this.subtract(BigDecimal.ONE)");
        return subtract;
    }

    @C11110f
    /* renamed from: b */
    public static final BigDecimal m42696b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(bigDecimal2, "other");
        BigDecimal divide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return divide;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: c */
    public static final BigDecimal m42697c(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        Intrinsics.checkNotNullExpressionValue(add, "this.add(BigDecimal.ONE)");
        return add;
    }

    @C11110f
    /* renamed from: d */
    public static final BigDecimal m42698d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(bigDecimal2, "other");
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(subtract, "this.subtract(other)");
        return subtract;
    }

    @C11110f
    /* renamed from: e */
    public static final BigDecimal m42699e(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(bigDecimal2, "other");
        BigDecimal add = bigDecimal.add(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(add, "this.add(other)");
        return add;
    }

    @C11110f
    /* renamed from: f */
    public static final BigDecimal m42700f(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(bigDecimal2, "other");
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(remainder, "this.remainder(other)");
        return remainder;
    }

    @C11110f
    /* renamed from: g */
    public static final BigDecimal m42701g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(bigDecimal2, "other");
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(multiply, "this.multiply(other)");
        return multiply;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: h */
    public static final BigDecimal m42702h(double d) {
        return new BigDecimal(String.valueOf(d));
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: i */
    public static final BigDecimal m42703i(double d, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d), mathContext);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: j */
    public static final BigDecimal m42704j(float f) {
        return new BigDecimal(String.valueOf(f));
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: k */
    public static final BigDecimal m42705k(float f, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f), mathContext);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: l */
    public static final BigDecimal m42706l(int i) {
        BigDecimal valueOf = BigDecimal.valueOf((long) i);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: m */
    public static final BigDecimal m42707m(int i, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(i, mathContext);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: n */
    public static final BigDecimal m42708n(long j) {
        BigDecimal valueOf = BigDecimal.valueOf(j);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: o */
    public static final BigDecimal m42709o(long j, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(j, mathContext);
    }

    @C11110f
    /* renamed from: p */
    public static final BigDecimal m42710p(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal negate = bigDecimal.negate();
        Intrinsics.checkNotNullExpressionValue(negate, "this.negate()");
        return negate;
    }
}
