package kotlin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.g0 */
public class C11095g0 extends C11091f0 {
    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: A */
    public static final BigInteger m42725A(BigInteger bigInteger, int i) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger shiftRight = bigInteger.shiftRight(i);
        Intrinsics.checkNotNullExpressionValue(shiftRight, "this.shiftRight(n)");
        return shiftRight;
    }

    @C11110f
    /* renamed from: B */
    public static final BigInteger m42726B(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(bigInteger2, "other");
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(multiply, "this.multiply(other)");
        return multiply;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: C */
    public static final BigDecimal m42727C(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: D */
    public static final BigDecimal m42728D(BigInteger bigInteger, int i, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i, mathContext);
    }

    /* renamed from: E */
    public static /* synthetic */ BigDecimal m42729E(BigInteger bigInteger, int i, MathContext mathContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            Intrinsics.checkNotNullExpressionValue(mathContext, "UNLIMITED");
        }
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i, mathContext);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: F */
    public static final BigInteger m42730F(int i) {
        BigInteger valueOf = BigInteger.valueOf((long) i);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: G */
    public static final BigInteger m42731G(long j) {
        BigInteger valueOf = BigInteger.valueOf(j);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }

    @C11110f
    /* renamed from: H */
    public static final BigInteger m42732H(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger negate = bigInteger.negate();
        Intrinsics.checkNotNullExpressionValue(negate, "this.negate()");
        return negate;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: I */
    public static final BigInteger m42733I(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(bigInteger2, "other");
        BigInteger xor = bigInteger.xor(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(xor, "this.xor(other)");
        return xor;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: q */
    public static final BigInteger m42734q(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(bigInteger2, "other");
        BigInteger and = bigInteger.and(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(and, "this.and(other)");
        return and;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: r */
    public static final BigInteger m42735r(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        Intrinsics.checkNotNullExpressionValue(subtract, "this.subtract(BigInteger.ONE)");
        return subtract;
    }

    @C11110f
    /* renamed from: s */
    public static final BigInteger m42736s(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(bigInteger2, "other");
        BigInteger divide = bigInteger.divide(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(divide, "this.divide(other)");
        return divide;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: t */
    public static final BigInteger m42737t(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger add = bigInteger.add(BigInteger.ONE);
        Intrinsics.checkNotNullExpressionValue(add, "this.add(BigInteger.ONE)");
        return add;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: u */
    public static final BigInteger m42738u(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger not = bigInteger.not();
        Intrinsics.checkNotNullExpressionValue(not, "this.not()");
        return not;
    }

    @C11110f
    /* renamed from: v */
    public static final BigInteger m42739v(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(bigInteger2, "other");
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(subtract, "this.subtract(other)");
        return subtract;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: w */
    public static final BigInteger m42740w(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(bigInteger2, "other");
        BigInteger or = bigInteger.or(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(or, "this.or(other)");
        return or;
    }

    @C11110f
    /* renamed from: x */
    public static final BigInteger m42741x(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(bigInteger2, "other");
        BigInteger add = bigInteger.add(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(add, "this.add(other)");
        return add;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: y */
    public static final BigInteger m42742y(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(bigInteger2, "other");
        BigInteger remainder = bigInteger.remainder(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(remainder, "this.remainder(other)");
        return remainder;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: z */
    public static final BigInteger m42743z(BigInteger bigInteger, int i) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger shiftLeft = bigInteger.shiftLeft(i);
        Intrinsics.checkNotNullExpressionValue(shiftLeft, "this.shiftLeft(n)");
        return shiftLeft;
    }
}
