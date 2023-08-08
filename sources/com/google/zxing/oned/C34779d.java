package com.google.zxing.oned;

import androidx.core.location.C17699g;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus.LoyaltyBonusListFragment;
import com.contentsquare.android.api.C14092c;
import com.google.firebase.perf.metrics.C33381i;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;
import com.google.zxing.maxicode.decoder.C34766b;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.json.internal.C12361b;
import org.joda.time.C12590b;

/* renamed from: com.google.zxing.oned.d */
public final class C34779d extends C34792q {

    /* renamed from: e */
    public static final String f84374e = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";

    /* renamed from: f */
    public static final int[] f84375f = {52, 289, 97, C14092c.f34663v0, 49, 304, 112, 37, C14092c.f34627m0, 100, 265, 73, C14092c.f34643q0, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, DefaultImageHeaderParser.f57426n, 82, 7, C14092c.f34575Z, 70, 22, 385, C17699g.f46051u, 448, 145, 400, C14092c.f34572Y, 133, C14092c.f34503B0, LoyaltyBonusListFragment.f60703y, C12590b.f30836K, 162, 138, 42};

    /* renamed from: g */
    public static final int f84376g = 148;

    /* renamed from: a */
    public final boolean f84377a;

    /* renamed from: b */
    public final boolean f84378b;

    /* renamed from: c */
    public final StringBuilder f84379c;

    /* renamed from: d */
    public final int[] f84380d;

    public C34779d() {
        this(false);
    }

    /* renamed from: h */
    public static String m141989h(CharSequence charSequence) throws FormatException {
        char c;
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    c = C12361b.f30257h;
                                    sb.append(c);
                                } else {
                                    throw FormatException.m141227a();
                                }
                            }
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw FormatException.m141227a();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i = charAt2 + C34766b.f84291f;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i = charAt2 + 16;
                    } else if (charAt2 >= 'P' && charAt2 <= 'T') {
                        i = charAt2 + '+';
                    } else if (charAt2 != 'U') {
                        if (charAt2 == 'V') {
                            c = '@';
                        } else if (charAt2 == 'W') {
                            c = '`';
                        } else if (charAt2 == 'X' || charAt2 == 'Y' || charAt2 == 'Z') {
                            c = C33381i.f81116y;
                        } else {
                            throw FormatException.m141227a();
                        }
                        sb.append(c);
                    }
                    c = 0;
                    sb.append(c);
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw FormatException.m141227a();
                } else {
                    i = charAt2 - '@';
                }
                c = (char) i;
                sb.append(c);
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: i */
    public static int[] m141990i(C34709a aVar, int[] iArr) throws NotFoundException {
        int o = aVar.mo102649o();
        int m = aVar.mo102647m(0);
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = m;
        while (m < o) {
            if (aVar.mo102645k(m) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i != length - 1) {
                    i++;
                } else if (m141992k(iArr) != 148 || !aVar.mo102651t(Math.max(0, i2 - ((m - i2) / 2)), i2, false)) {
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                } else {
                    return new int[]{i2, m};
                }
                iArr[i] = 1;
                z = !z;
            }
            m++;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: j */
    public static char m141991j(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f84375f;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return f84374e.charAt(i2);
                }
                i2++;
            } else if (i == 148) {
                return '*';
            } else {
                throw NotFoundException.m141229a();
            }
        }
    }

    /* renamed from: k */
    public static int m141992k(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: b */
    public C34761k mo102904b(int i, C34709a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        String str;
        int[] iArr = this.f84380d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f84379c;
        sb.setLength(0);
        int[] i2 = m141990i(aVar, iArr);
        int m = aVar.mo102647m(i2[1]);
        int o = aVar.mo102649o();
        while (true) {
            C34792q.m142036f(aVar, m, iArr);
            int k = m141992k(iArr);
            if (k >= 0) {
                char j = m141991j(k);
                sb.append(j);
                int i3 = m;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int m2 = aVar.mo102647m(i3);
                if (j == '*') {
                    sb.setLength(sb.length() - 1);
                    int i5 = 0;
                    for (int i6 : iArr) {
                        i5 += i6;
                    }
                    int i7 = (m2 - m) - i5;
                    if (m2 == o || (i7 << 1) >= i5) {
                        if (this.f84377a) {
                            int length = sb.length() - 1;
                            int i8 = 0;
                            for (int i9 = 0; i9 < length; i9++) {
                                i8 += f84374e.indexOf(this.f84379c.charAt(i9));
                            }
                            if (sb.charAt(length) == f84374e.charAt(i8 % 43)) {
                                sb.setLength(length);
                            } else {
                                throw ChecksumException.m141224a();
                            }
                        }
                        if (sb.length() != 0) {
                            if (this.f84378b) {
                                str = m141989h(sb);
                            } else {
                                str = sb.toString();
                            }
                            float f = (float) i;
                            return new C34761k(str, (byte[]) null, new C34762l[]{new C34762l(((float) (i2[1] + i2[0])) / 2.0f, f), new C34762l(((float) m) + (((float) i5) / 2.0f), f)}, BarcodeFormat.CODE_39);
                        }
                        throw NotFoundException.m141229a();
                    }
                    throw NotFoundException.m141229a();
                }
                m = m2;
            } else {
                throw NotFoundException.m141229a();
            }
        }
    }

    public C34779d(boolean z) {
        this(z, false);
    }

    public C34779d(boolean z, boolean z2) {
        this.f84377a = z;
        this.f84378b = z2;
        this.f84379c = new StringBuilder(20);
        this.f84380d = new int[9];
    }
}
