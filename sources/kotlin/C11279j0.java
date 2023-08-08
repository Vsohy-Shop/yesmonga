package kotlin;

import kotlin.internal.C11110f;

/* renamed from: kotlin.j0 */
public class C11279j0 extends C11103i0 {
    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: T0 */
    public static final int m43388T0(byte b) {
        return Integer.numberOfLeadingZeros(b & 255) - 24;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: U0 */
    public static final int m43389U0(short s) {
        return Integer.numberOfLeadingZeros(s & C11679z1.f28988d) - 16;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: V0 */
    public static final int m43390V0(byte b) {
        return Integer.bitCount(b & 255);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: W0 */
    public static final int m43391W0(short s) {
        return Integer.bitCount(s & C11679z1.f28988d);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: X0 */
    public static final int m43392X0(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: Y0 */
    public static final int m43393Y0(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.6")
    /* renamed from: Z0 */
    public static final byte m43394Z0(byte b, int i) {
        byte b2 = i & 7;
        return (byte) (((b & 255) >>> (8 - b2)) | (b << b2));
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.6")
    /* renamed from: a1 */
    public static final short m43395a1(short s, int i) {
        short s2 = i & 15;
        return (short) (((s & C11679z1.f28988d) >>> (16 - s2)) | (s << s2));
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.6")
    /* renamed from: b1 */
    public static final byte m43396b1(byte b, int i) {
        byte b2 = i & 7;
        return (byte) (((b & 255) >>> b2) | (b << (8 - b2)));
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.6")
    /* renamed from: c1 */
    public static final short m43397c1(short s, int i) {
        short s2 = i & 15;
        return (short) (((s & C11679z1.f28988d) >>> s2) | (s << (16 - s2)));
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: d1 */
    public static final byte m43398d1(byte b) {
        return (byte) Integer.highestOneBit(b & 255);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: e1 */
    public static final short m43399e1(short s) {
        return (short) Integer.highestOneBit(s & C11679z1.f28988d);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: f1 */
    public static final byte m43400f1(byte b) {
        return (byte) Integer.lowestOneBit(b);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: g1 */
    public static final short m43401g1(short s) {
        return (short) Integer.lowestOneBit(s);
    }
}
