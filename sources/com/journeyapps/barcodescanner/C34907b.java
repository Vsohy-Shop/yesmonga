package com.journeyapps.barcodescanner;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34754g;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C34710b;
import java.util.Map;

/* renamed from: com.journeyapps.barcodescanner.b */
public class C34907b {

    /* renamed from: a */
    public static final int f84884a = -1;

    /* renamed from: b */
    public static final int f84885b = -16777216;

    /* renamed from: a */
    public Bitmap mo103370a(C34710b bVar) {
        int i;
        int o = bVar.mo102674o();
        int k = bVar.mo102670k();
        int[] iArr = new int[(o * k)];
        for (int i2 = 0; i2 < k; i2++) {
            int i3 = i2 * o;
            for (int i4 = 0; i4 < o; i4++) {
                int i5 = i3 + i4;
                if (bVar.mo102666h(i4, i2)) {
                    i = -16777216;
                } else {
                    i = -1;
                }
                iArr[i5] = i;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(o, k, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, o, 0, 0, o, k);
        return createBitmap;
    }

    /* renamed from: b */
    public C34710b mo103371b(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        try {
            return new C34754g().mo102423b(str, barcodeFormat, i, i2);
        } catch (WriterException e) {
            throw e;
        } catch (Exception e2) {
            throw new WriterException((Throwable) e2);
        }
    }

    /* renamed from: c */
    public C34710b mo103372c(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        try {
            return new C34754g().mo102422a(str, barcodeFormat, i, i2, map);
        } catch (WriterException e) {
            throw e;
        } catch (Exception e2) {
            throw new WriterException((Throwable) e2);
        }
    }

    /* renamed from: d */
    public Bitmap mo103373d(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return mo103370a(mo103371b(str, barcodeFormat, i, i2));
    }

    /* renamed from: e */
    public Bitmap mo103374e(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        return mo103370a(mo103372c(str, barcodeFormat, i, i2, map));
    }
}
