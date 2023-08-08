package kotlin.math;

import kotlin.C11097g2;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.internal.C11110f;

/* renamed from: kotlin.math.d */
public class C11409d extends C11408c {
    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: A */
    public static final double m43828A(double d) {
        return Math.cos(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: A0 */
    public static final double m43829A0(double d, double d2) {
        return Math.nextAfter(d, d2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: B */
    public static final float m43830B(float f) {
        return (float) Math.cos((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: B0 */
    public static final float m43831B0(float f, float f2) {
        return Math.nextAfter(f, (double) f2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: C */
    public static final double m43832C(double d) {
        return Math.cosh(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: C0 */
    public static final double m43833C0(double d) {
        return Math.nextUp(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: D */
    public static final float m43834D(float f) {
        return (float) Math.cosh((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: D0 */
    public static final float m43835D0(float f) {
        return Math.nextUp(f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: E */
    public static final double m43836E(double d) {
        return Math.exp(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: E0 */
    public static final double m43837E0(double d, double d2) {
        return Math.pow(d, d2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: F */
    public static final float m43838F(float f) {
        return (float) Math.exp((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: F0 */
    public static final double m43839F0(double d, int i) {
        return Math.pow(d, (double) i);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: G */
    public static final double m43840G(double d) {
        return Math.expm1(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: G0 */
    public static final float m43841G0(float f, float f2) {
        return (float) Math.pow((double) f, (double) f2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: H */
    public static final float m43842H(float f) {
        return (float) Math.expm1((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: H0 */
    public static final float m43843H0(float f, int i) {
        return (float) Math.pow((double) f, (double) i);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: I */
    public static final double m43844I(double d) {
        return Math.floor(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: I0 */
    public static final double m43845I0(double d) {
        return Math.rint(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: J */
    public static final float m43846J(float f) {
        return (float) Math.floor((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: J0 */
    public static final float m43847J0(float f) {
        return (float) Math.rint((double) f);
    }

    /* renamed from: K */
    public static final double m43848K(double d) {
        return Math.abs(d);
    }

    @C11665v0(version = "1.2")
    /* renamed from: K0 */
    public static final int m43849K0(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
    }

    /* renamed from: L */
    public static final float m43850L(float f) {
        return Math.abs(f);
    }

    @C11665v0(version = "1.2")
    /* renamed from: L0 */
    public static final int m43851L0(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: M */
    public static final int m43852M(int i) {
        return Math.abs(i);
    }

    @C11665v0(version = "1.2")
    /* renamed from: M0 */
    public static final long m43853M0(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: N */
    public static final long m43854N(long j) {
        return Math.abs(j);
    }

    @C11665v0(version = "1.2")
    /* renamed from: N0 */
    public static final long m43855N0(float f) {
        return m43853M0((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: O */
    public static /* synthetic */ void m43856O(double d) {
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: O0 */
    public static final double m43857O0(double d) {
        return Math.signum(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: P */
    public static /* synthetic */ void m43858P(float f) {
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: P0 */
    public static final float m43859P0(float f) {
        return Math.signum(f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: Q */
    public static /* synthetic */ void m43860Q(int i) {
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: Q0 */
    public static final double m43861Q0(double d) {
        return Math.sin(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: R */
    public static /* synthetic */ void m43862R(long j) {
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: R0 */
    public static final float m43863R0(float f) {
        return (float) Math.sin((double) f);
    }

    /* renamed from: S */
    public static final double m43864S(double d) {
        return Math.signum(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: S0 */
    public static final double m43865S0(double d) {
        return Math.sinh(d);
    }

    /* renamed from: T */
    public static final float m43866T(float f) {
        return Math.signum(f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: T0 */
    public static final float m43867T0(float f) {
        return (float) Math.sinh((double) f);
    }

    /* renamed from: U */
    public static final int m43868U(int i) {
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: U0 */
    public static final double m43869U0(double d) {
        return Math.sqrt(d);
    }

    /* renamed from: V */
    public static final int m43870V(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: V0 */
    public static final float m43871V0(float f) {
        return (float) Math.sqrt((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: W */
    public static /* synthetic */ void m43872W(double d) {
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: W0 */
    public static final double m43873W0(double d) {
        return Math.tan(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: X */
    public static /* synthetic */ void m43874X(float f) {
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: X0 */
    public static final float m43875X0(float f) {
        return (float) Math.tan((double) f);
    }

    @C11665v0(version = "1.2")
    /* renamed from: Y */
    public static /* synthetic */ void m43876Y(int i) {
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: Y0 */
    public static final double m43877Y0(double d) {
        return Math.tanh(d);
    }

    @C11665v0(version = "1.2")
    /* renamed from: Z */
    public static /* synthetic */ void m43878Z(long j) {
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: Z0 */
    public static final float m43879Z0(float f) {
        return (float) Math.tanh((double) f);
    }

    /* renamed from: a0 */
    public static final double m43880a0(double d) {
        return Math.ulp(d);
    }

    @C11665v0(version = "1.2")
    /* renamed from: a1 */
    public static final double m43881a1(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return d;
        }
        if (d > 0.0d) {
            return Math.floor(d);
        }
        return Math.ceil(d);
    }

    /* renamed from: b0 */
    public static final float m43882b0(float f) {
        return Math.ulp(f);
    }

    @C11665v0(version = "1.2")
    /* renamed from: b1 */
    public static final float m43883b1(float f) {
        double d;
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return f;
        }
        if (f > 0.0f) {
            d = Math.floor((double) f);
        } else {
            d = Math.ceil((double) f);
        }
        return (float) d;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: c */
    public static final double m43884c(double d, double d2) {
        return Math.IEEEremainder(d, d2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: c0 */
    public static /* synthetic */ void m43885c0(double d) {
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: c1 */
    public static final double m43886c1(double d, double d2) {
        return Math.copySign(d, d2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: d */
    public static final float m43887d(float f, float f2) {
        return (float) Math.IEEEremainder((double) f, (double) f2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: d0 */
    public static /* synthetic */ void m43888d0(float f) {
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: d1 */
    public static final double m43889d1(double d, int i) {
        return Math.copySign(d, (double) i);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: e */
    public static final double m43890e(double d) {
        return Math.abs(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: e0 */
    public static final double m43891e0(double d, double d2) {
        return Math.hypot(d, d2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: e1 */
    public static final float m43892e1(float f, float f2) {
        return Math.copySign(f, f2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: f */
    public static final float m43893f(float f) {
        return Math.abs(f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: f0 */
    public static final float m43894f0(float f, float f2) {
        return (float) Math.hypot((double) f, (double) f2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: f1 */
    public static final float m43895f1(float f, int i) {
        return Math.copySign(f, (float) i);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: g */
    public static final int m43896g(int i) {
        return Math.abs(i);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: g0 */
    public static final double m43897g0(double d) {
        return Math.log(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: h */
    public static final long m43898h(long j) {
        return Math.abs(j);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: h0 */
    public static final float m43899h0(float f) {
        return (float) Math.log((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: i */
    public static final double m43900i(double d) {
        return Math.acos(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: i0 */
    public static final double m43901i0(double d) {
        return Math.log1p(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: j */
    public static final float m43902j(float f) {
        return (float) Math.acos((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: j0 */
    public static final float m43903j0(float f) {
        return (float) Math.log1p((double) f);
    }

    @C11665v0(version = "1.2")
    /* renamed from: k */
    public static final double m43904k(double d) {
        if (d < 1.0d) {
            return Double.NaN;
        }
        if (d > C11406a.f28544f) {
            return Math.log(d) + C11406a.f28540b;
        }
        double d2 = (double) 1;
        double d3 = d - d2;
        if (d3 >= C11406a.f28543e) {
            return Math.log(d + Math.sqrt((d * d) - d2));
        }
        double sqrt = Math.sqrt(d3);
        if (sqrt >= C11406a.f28542d) {
            sqrt -= ((sqrt * sqrt) * sqrt) / ((double) 12);
        }
        return sqrt * Math.sqrt(2.0d);
    }

    @C11665v0(version = "1.2")
    /* renamed from: k0 */
    public static final double m43905k0(double d, double d2) {
        if (d2 <= 0.0d) {
            return Double.NaN;
        }
        if (d2 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d) / Math.log(d2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: l */
    public static final float m43906l(float f) {
        return (float) m43904k((double) f);
    }

    @C11665v0(version = "1.2")
    /* renamed from: l0 */
    public static final float m43907l0(float f, float f2) {
        if (f2 <= 0.0f) {
            return Float.NaN;
        }
        if (f2 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log((double) f) / Math.log((double) f2));
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: m */
    public static final double m43908m(double d) {
        return Math.asin(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: m0 */
    public static final double m43909m0(double d) {
        return Math.log10(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: n */
    public static final float m43910n(float f) {
        return (float) Math.asin((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: n0 */
    public static final float m43911n0(float f) {
        return (float) Math.log10((double) f);
    }

    @C11665v0(version = "1.2")
    /* renamed from: o */
    public static final double m43912o(double d) {
        double d2 = C11406a.f28543e;
        if (d >= d2) {
            if (d <= C11406a.f28545g) {
                return Math.log(d + Math.sqrt((d * d) + ((double) 1)));
            }
            if (d > C11406a.f28544f) {
                return Math.log(d) + C11406a.f28540b;
            }
            double d3 = d * ((double) 2);
            return Math.log(d3 + (((double) 1) / d3));
        } else if (d <= (-d2)) {
            return -m43912o(-d);
        } else {
            if (Math.abs(d) >= C11406a.f28542d) {
                return d - (((d * d) * d) / ((double) 6));
            }
            return d;
        }
    }

    @C11665v0(version = "1.2")
    /* renamed from: o0 */
    public static final double m43913o0(double d) {
        return Math.log(d) / C11406a.f28540b;
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: p */
    public static final float m43914p(float f) {
        return (float) m43912o((double) f);
    }

    @C11665v0(version = "1.2")
    /* renamed from: p0 */
    public static final float m43915p0(float f) {
        return (float) (Math.log((double) f) / C11406a.f28540b);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: q */
    public static final double m43916q(double d) {
        return Math.atan(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: q0 */
    public static final double m43917q0(double d, double d2) {
        return Math.max(d, d2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: r */
    public static final float m43918r(float f) {
        return (float) Math.atan((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: r0 */
    public static final float m43919r0(float f, float f2) {
        return Math.max(f, f2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: s */
    public static final double m43920s(double d, double d2) {
        return Math.atan2(d, d2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: s0 */
    public static final int m43921s0(int i, int i2) {
        return Math.max(i, i2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: t */
    public static final float m43922t(float f, float f2) {
        return (float) Math.atan2((double) f, (double) f2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: t0 */
    public static final long m43923t0(long j, long j2) {
        return Math.max(j, j2);
    }

    @C11665v0(version = "1.2")
    /* renamed from: u */
    public static final double m43924u(double d) {
        if (Math.abs(d) >= C11406a.f28543e) {
            double d2 = (double) 1;
            return Math.log((d2 + d) / (d2 - d)) / ((double) 2);
        } else if (Math.abs(d) > C11406a.f28542d) {
            return d + (((d * d) * d) / ((double) 3));
        } else {
            return d;
        }
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: u0 */
    public static final double m43925u0(double d, double d2) {
        return Math.min(d, d2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: v */
    public static final float m43926v(float f) {
        return (float) m43924u((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: v0 */
    public static final float m43927v0(float f, float f2) {
        return Math.min(f, f2);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.8")
    /* renamed from: w */
    public static final double m43928w(double d) {
        return Math.cbrt(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: w0 */
    public static final int m43929w0(int i, int i2) {
        return Math.min(i, i2);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.8")
    /* renamed from: x */
    public static final float m43930x(float f) {
        return (float) Math.cbrt((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: x0 */
    public static final long m43931x0(long j, long j2) {
        return Math.min(j, j2);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: y */
    public static final double m43932y(double d) {
        return Math.ceil(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: y0 */
    public static final double m43933y0(double d) {
        return Math.nextAfter(d, Double.NEGATIVE_INFINITY);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: z */
    public static final float m43934z(float f) {
        return (float) Math.ceil((double) f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: z0 */
    public static final float m43935z0(float f) {
        return Math.nextAfter(f, Double.NEGATIVE_INFINITY);
    }
}
