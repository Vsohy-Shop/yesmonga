package com.google.zxing.qrcode.decoder;

/* renamed from: com.google.zxing.qrcode.decoder.e */
public final class C34871e {

    /* renamed from: c */
    public static final int f84737c = 21522;

    /* renamed from: d */
    public static final int[][] f84738d = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    public final ErrorCorrectionLevel f84739a;

    /* renamed from: b */
    public final byte f84740b;

    public C34871e(int i) {
        this.f84739a = ErrorCorrectionLevel.m142435b((i >> 3) & 3);
        this.f84740b = (byte) (i & 7);
    }

    /* renamed from: a */
    public static C34871e m142464a(int i, int i2) {
        C34871e b = m142465b(i, i2);
        if (b != null) {
            return b;
        }
        return m142465b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    public static C34871e m142465b(int i, int i2) {
        int e;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr : f84738d) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new C34871e(iArr[1]);
            }
            int e2 = m142466e(i, i5);
            if (e2 < i3) {
                i4 = iArr[1];
                i3 = e2;
            }
            if (i != i2 && (e = m142466e(i2, i5)) < i3) {
                i4 = iArr[1];
                i3 = e;
            }
        }
        if (i3 <= 3) {
            return new C34871e(i4);
        }
        return null;
    }

    /* renamed from: e */
    public static int m142466e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* renamed from: c */
    public byte mo103174c() {
        return this.f84740b;
    }

    /* renamed from: d */
    public ErrorCorrectionLevel mo103175d() {
        return this.f84739a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C34871e)) {
            return false;
        }
        C34871e eVar = (C34871e) obj;
        if (this.f84739a == eVar.f84739a && this.f84740b == eVar.f84740b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f84739a.ordinal() << 3) | this.f84740b;
    }
}
