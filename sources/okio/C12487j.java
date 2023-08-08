package okio;

import androidx.compose.p004ui.unit.C16506u;
import kotlin.C11679z1;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.C12482b;
import org.jetbrains.annotations.C12579k;
import org.joda.time.DateTimeFieldType;

@C11314h(name = "-Util")
/* renamed from: okio.j */
public final class C12487j {
    /* renamed from: a */
    public static final int m50744a(byte b, int i) {
        return b & i;
    }

    /* renamed from: b */
    public static final long m50745b(byte b, long j) {
        return ((long) b) & j;
    }

    /* renamed from: c */
    public static final long m50746c(int i, long j) {
        return ((long) i) & j;
    }

    /* renamed from: d */
    public static final boolean m50747d(@C12579k byte[] bArr, int i, @C12579k byte[] bArr2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "a");
        Intrinsics.checkNotNullParameter(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static final void m50748e(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: f */
    public static final int m50749f(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: g */
    public static final long m50750g(int i, long j) {
        return Math.min((long) i, j);
    }

    /* renamed from: h */
    public static final long m50751h(long j, int i) {
        return Math.min(j, (long) i);
    }

    /* renamed from: i */
    public static final int m50752i(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: j */
    public static final long m50753j(long j) {
        return ((j & 255) << 56) | ((-72057594037927936L & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((C16506u.f40907a & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    /* renamed from: k */
    public static final short m50754k(short s) {
        short s2 = s & C11679z1.f28988d;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: l */
    public static final long m50755l(long j, int i) {
        return (j << (64 - i)) | (j >>> i);
    }

    /* renamed from: m */
    public static final int m50756m(byte b, int i) {
        return b << i;
    }

    /* renamed from: n */
    public static final int m50757n(byte b, int i) {
        return b >> i;
    }

    @C12579k
    /* renamed from: o */
    public static final String m50758o(byte b) {
        return new String(new char[]{C12482b.m50639I()[(b >> 4) & 15], C12482b.m50639I()[b & DateTimeFieldType.f30626Z]});
    }

    @C12579k
    /* renamed from: p */
    public static final String m50759p(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {C12482b.m50639I()[(i >> 28) & 15], C12482b.m50639I()[(i >> 24) & 15], C12482b.m50639I()[(i >> 20) & 15], C12482b.m50639I()[(i >> 16) & 15], C12482b.m50639I()[(i >> 12) & 15], C12482b.m50639I()[(i >> 8) & 15], C12482b.m50639I()[(i >> 4) & 15], C12482b.m50639I()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return new String(cArr, i2, 8 - i2);
    }

    @C12579k
    /* renamed from: q */
    public static final String m50760q(long j) {
        if (j == 0) {
            return "0";
        }
        int i = 0;
        char[] cArr = {C12482b.m50639I()[(int) ((j >> 60) & 15)], C12482b.m50639I()[(int) ((j >> 56) & 15)], C12482b.m50639I()[(int) ((j >> 52) & 15)], C12482b.m50639I()[(int) ((j >> 48) & 15)], C12482b.m50639I()[(int) ((j >> 44) & 15)], C12482b.m50639I()[(int) ((j >> 40) & 15)], C12482b.m50639I()[(int) ((j >> 36) & 15)], C12482b.m50639I()[(int) ((j >> 32) & 15)], C12482b.m50639I()[(int) ((j >> 28) & 15)], C12482b.m50639I()[(int) ((j >> 24) & 15)], C12482b.m50639I()[(int) ((j >> 20) & 15)], C12482b.m50639I()[(int) ((j >> 16) & 15)], C12482b.m50639I()[(int) ((j >> 12) & 15)], C12482b.m50639I()[(int) ((j >> 8) & 15)], C12482b.m50639I()[(int) ((j >> 4) & 15)], C12482b.m50639I()[(int) (j & 15)]};
        while (i < 16 && cArr[i] == '0') {
            i++;
        }
        return new String(cArr, i, 16 - i);
    }

    /* renamed from: r */
    public static final byte m50761r(byte b, byte b2) {
        return (byte) (b ^ b2);
    }
}
