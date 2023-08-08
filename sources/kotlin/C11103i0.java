package kotlin;

import kotlin.internal.C11110f;
import kotlin.jvm.internal.C11369u;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.i0 */
public class C11103i0 extends C11099h0 {
    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: A0 */
    public static final float m42789A0(C11377x xVar, int i) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return Float.intBitsToFloat(i);
    }

    @C11110f
    /* renamed from: B0 */
    public static final boolean m42790B0(double d) {
        return !Double.isInfinite(d) && !Double.isNaN(d);
    }

    @C11110f
    /* renamed from: C0 */
    public static final boolean m42791C0(float f) {
        return !Float.isInfinite(f) && !Float.isNaN(f);
    }

    @C11110f
    /* renamed from: D0 */
    public static final boolean m42792D0(double d) {
        return Double.isInfinite(d);
    }

    @C11110f
    /* renamed from: E0 */
    public static final boolean m42793E0(float f) {
        return Float.isInfinite(f);
    }

    @C11110f
    /* renamed from: F0 */
    public static final boolean m42794F0(double d) {
        return Double.isNaN(d);
    }

    @C11110f
    /* renamed from: G0 */
    public static final boolean m42795G0(float f) {
        return Float.isNaN(f);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: H0 */
    public static final int m42796H0(int i, int i2) {
        return Integer.rotateLeft(i, i2);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: I0 */
    public static final long m42797I0(long j, int i) {
        return Long.rotateLeft(j, i);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: J0 */
    public static final int m42798J0(int i, int i2) {
        return Integer.rotateRight(i, i2);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.6")
    /* renamed from: K0 */
    public static final long m42799K0(long j, int i) {
        return Long.rotateRight(j, i);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: L0 */
    public static final int m42800L0(int i) {
        return Integer.highestOneBit(i);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: M0 */
    public static final long m42801M0(long j) {
        return Long.highestOneBit(j);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: N0 */
    public static final int m42802N0(int i) {
        return Integer.lowestOneBit(i);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: O0 */
    public static final long m42803O0(long j) {
        return Long.lowestOneBit(j);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: P0 */
    public static final int m42804P0(float f) {
        return Float.floatToIntBits(f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: Q0 */
    public static final long m42805Q0(double d) {
        return Double.doubleToLongBits(d);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: R0 */
    public static final int m42806R0(float f) {
        return Float.floatToRawIntBits(f);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: S0 */
    public static final long m42807S0(double d) {
        return Double.doubleToRawLongBits(d);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: t0 */
    public static final int m42808t0(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: u0 */
    public static final int m42809u0(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: v0 */
    public static final int m42810v0(int i) {
        return Integer.bitCount(i);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: w0 */
    public static final int m42811w0(long j) {
        return Long.bitCount(j);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: x0 */
    public static final int m42812x0(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: y0 */
    public static final int m42813y0(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @C11110f
    @C11665v0(version = "1.2")
    /* renamed from: z0 */
    public static final double m42814z0(C11369u uVar, long j) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return Double.longBitsToDouble(j);
    }
}
