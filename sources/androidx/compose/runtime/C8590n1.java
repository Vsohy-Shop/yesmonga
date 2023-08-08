package androidx.compose.runtime;

import kotlin.C11532s0;

/* renamed from: androidx.compose.runtime.n1 */
public final class C8590n1 {

    /* renamed from: a */
    public static final int f23022a = 306783378;

    /* renamed from: b */
    public static final int f23023b = 613566756;

    /* renamed from: c */
    public static final int f23024c = -920350135;

    /* renamed from: d */
    public static final int f23025d = 1;

    /* renamed from: e */
    public static final int f23026e = 2;

    /* renamed from: f */
    public static final int f23027f = 4;

    /* renamed from: g */
    public static final int f23028g = 8;

    /* renamed from: h */
    public static final int f23029h = 16;

    /* renamed from: i */
    public static final int f23030i = 32;

    @C11532s0
    /* renamed from: a */
    public static final int m31123a(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & f23024c) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }
}
