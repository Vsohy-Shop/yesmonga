package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34774n;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C34710b;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.oned.r */
public abstract class C34793r implements C34774n {

    /* renamed from: a */
    public static final Pattern f84413a = Pattern.compile("[0-9]+");

    /* renamed from: c */
    public static int m142042c(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* renamed from: d */
    public static void m142043d(String str) {
        if (!f84413a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    /* renamed from: g */
    public static C34710b m142044g(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        C34710b bVar = new C34710b(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                bVar.mo102678x(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return bVar;
    }

    /* renamed from: a */
    public C34710b mo102422a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        } else {
            int f = mo102920f();
            if (map != null) {
                EncodeHintType encodeHintType = EncodeHintType.MARGIN;
                if (map.containsKey(encodeHintType)) {
                    f = Integer.parseInt(map.get(encodeHintType).toString());
                }
            }
            return m142044g(mo102903e(str), i, i2, f);
        }
    }

    /* renamed from: b */
    public final C34710b mo102423b(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return mo102422a(str, barcodeFormat, i, i2, (Map<EncodeHintType, ?>) null);
    }

    /* renamed from: e */
    public abstract boolean[] mo102903e(String str);

    /* renamed from: f */
    public int mo102920f() {
        return 10;
    }
}
