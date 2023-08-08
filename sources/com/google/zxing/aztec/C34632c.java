package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34774n;
import com.google.zxing.EncodeHintType;
import com.google.zxing.aztec.encoder.C34636a;
import com.google.zxing.aztec.encoder.C34638c;
import com.google.zxing.common.C34710b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* renamed from: com.google.zxing.aztec.c */
public final class C34632c implements C34774n {
    /* renamed from: c */
    public static C34710b m141241c(String str, BarcodeFormat barcodeFormat, int i, int i2, Charset charset, int i3, int i4) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return m141242d(C34638c.m141293e(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* renamed from: d */
    public static C34710b m141242d(C34636a aVar, int i, int i2) {
        C34710b c = aVar.mo102447c();
        if (c != null) {
            int o = c.mo102674o();
            int k = c.mo102670k();
            int max = Math.max(i, o);
            int max2 = Math.max(i2, k);
            int min = Math.min(max / o, max2 / k);
            int i3 = (max - (o * min)) / 2;
            int i4 = (max2 - (k * min)) / 2;
            C34710b bVar = new C34710b(max, max2);
            int i5 = 0;
            while (i5 < k) {
                int i6 = 0;
                int i7 = i3;
                while (i6 < o) {
                    if (c.mo102666h(i6, i5)) {
                        bVar.mo102678x(i7, i4, min, min);
                    }
                    i6++;
                    i7 += min;
                }
                i5++;
                i4 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C34710b mo102422a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i3 = 33;
        int i4 = 0;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType)) {
                charset = Charset.forName(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(encodeHintType2)) {
                i3 = Integer.parseInt(map.get(encodeHintType2).toString());
            }
            EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
            if (map.containsKey(encodeHintType3)) {
                i4 = Integer.parseInt(map.get(encodeHintType3).toString());
            }
        }
        return m141241c(str, barcodeFormat, i, i2, charset, i3, i4);
    }

    /* renamed from: b */
    public C34710b mo102423b(String str, BarcodeFormat barcodeFormat, int i, int i2) {
        return mo102422a(str, barcodeFormat, i, i2, (Map<EncodeHintType, ?>) null);
    }
}
