package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.C34763m;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C34709a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.oned.x */
public abstract class C34827x extends C34792q {

    /* renamed from: d */
    public static final float f84515d = 0.48f;

    /* renamed from: e */
    public static final float f84516e = 0.7f;

    /* renamed from: f */
    public static final int[] f84517f = {1, 1, 1};

    /* renamed from: g */
    public static final int[] f84518g = {1, 1, 1, 1, 1};

    /* renamed from: h */
    public static final int[] f84519h = {1, 1, 1, 1, 1, 1};

    /* renamed from: i */
    public static final int[][] f84520i;

    /* renamed from: j */
    public static final int[][] f84521j;

    /* renamed from: a */
    public final StringBuilder f84522a = new StringBuilder(20);

    /* renamed from: b */
    public final C34826w f84523b = new C34826w();

    /* renamed from: c */
    public final C34787l f84524c = new C34787l();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f84520i = iArr;
        int[][] iArr2 = new int[20][];
        f84521j = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f84520i[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f84521j[i] = iArr4;
        }
    }

    /* renamed from: i */
    public static boolean m142190i(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        if (m142195r(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static int m142191j(C34709a aVar, int[] iArr, int i, int[][] iArr2) throws NotFoundException {
        C34792q.m142036f(aVar, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float e = C34792q.m142035e(iArr, iArr2[i3], 0.7f);
            if (e < f) {
                i2 = i3;
                f = e;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: n */
    public static int[] m142192n(C34709a aVar, int i, boolean z, int[] iArr) throws NotFoundException {
        return m142193o(aVar, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: o */
    public static int[] m142193o(C34709a aVar, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int i2;
        int o = aVar.mo102649o();
        if (z) {
            i2 = aVar.mo102648n(i);
        } else {
            i2 = aVar.mo102647m(i);
        }
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = i2;
        while (i2 < o) {
            if (aVar.mo102645k(i2) != z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (C34792q.m142035e(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i4, i2};
                } else {
                    i4 += iArr2[0] + iArr2[1];
                    int i5 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            i2++;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: p */
    public static int[] m142194p(C34709a aVar) throws NotFoundException {
        int[] iArr = new int[f84517f.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f84517f;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m142193o(aVar, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.mo102651t(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: r */
    public static int m142195r(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.m141227a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.m141227a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }

    /* renamed from: b */
    public C34761k mo102904b(int i, C34709a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return mo103016m(i, aVar, m142194p(aVar), map);
    }

    /* renamed from: h */
    public boolean mo103022h(String str) throws FormatException {
        return m142190i(str);
    }

    /* renamed from: k */
    public int[] mo103023k(C34709a aVar, int i) throws NotFoundException {
        return m142192n(aVar, i, false, f84517f);
    }

    /* renamed from: l */
    public abstract int mo102911l(C34709a aVar, int[] iArr, StringBuilder sb) throws NotFoundException;

    /* renamed from: m */
    public C34761k mo103016m(int i, C34709a aVar, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C34763m mVar;
        int i2;
        String c;
        int[] iArr2 = null;
        if (map == null) {
            mVar = null;
        } else {
            mVar = (C34763m) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        }
        boolean z = true;
        if (mVar != null) {
            mVar.mo102888a(new C34762l(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.f84522a;
        sb.setLength(0);
        int l = mo102911l(aVar, iArr, sb);
        if (mVar != null) {
            mVar.mo102888a(new C34762l((float) l, (float) i));
        }
        int[] k = mo103023k(aVar, l);
        if (mVar != null) {
            mVar.mo102888a(new C34762l(((float) (k[0] + k[1])) / 2.0f, (float) i));
        }
        int i3 = k[1];
        int i4 = (i3 - k[0]) + i3;
        if (i4 >= aVar.mo102649o() || !aVar.mo102651t(i3, i4, false)) {
            throw NotFoundException.m141229a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw FormatException.m141227a();
        } else if (mo103022h(sb2)) {
            BarcodeFormat q = mo102912q();
            float f = (float) i;
            C34761k kVar = new C34761k(sb2, (byte[]) null, new C34762l[]{new C34762l(((float) (iArr[1] + iArr[0])) / 2.0f, f), new C34762l(((float) (k[1] + k[0])) / 2.0f, f)}, q);
            try {
                C34761k a = this.f84523b.mo103021a(i, aVar, k[1]);
                kVar.mo102881j(ResultMetadataType.UPC_EAN_EXTENSION, a.mo102878g());
                kVar.mo102880i(a.mo102876e());
                kVar.mo102872a(a.mo102877f());
                i2 = a.mo102878g().length();
            } catch (ReaderException unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw NotFoundException.m141229a();
                }
            }
            if ((q == BarcodeFormat.EAN_13 || q == BarcodeFormat.UPC_A) && (c = this.f84524c.mo102915c(sb2)) != null) {
                kVar.mo102881j(ResultMetadataType.POSSIBLE_COUNTRY, c);
            }
            return kVar;
        } else {
            throw ChecksumException.m141224a();
        }
    }

    /* renamed from: q */
    public abstract BarcodeFormat mo102912q();
}
