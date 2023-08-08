package com.google.zxing.maxicode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34644b;
import com.google.zxing.C34760j;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C34710b;
import com.google.zxing.common.C34712d;
import com.google.zxing.maxicode.decoder.C34767c;
import java.util.Map;

/* renamed from: com.google.zxing.maxicode.a */
public final class C34764a implements C34760j {

    /* renamed from: b */
    public static final C34762l[] f84280b = new C34762l[0];

    /* renamed from: c */
    public static final int f84281c = 30;

    /* renamed from: d */
    public static final int f84282d = 33;

    /* renamed from: a */
    public final C34767c f84283a = new C34767c();

    /* renamed from: b */
    public static C34710b m141937b(C34710b bVar) throws NotFoundException {
        int[] j = bVar.mo102669j();
        if (j != null) {
            int i = j[0];
            int i2 = j[1];
            int i3 = j[2];
            int i4 = j[3];
            C34710b bVar2 = new C34710b(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (bVar.mo102666h(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        bVar2.mo102677v(i7, i5);
                    }
                }
            }
            return bVar2;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: a */
    public C34761k mo102419a(C34644b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C34712d c = this.f84283a.mo102892c(m141937b(bVar.mo102478b()), map);
        C34761k kVar = new C34761k(c.mo102692j(), c.mo102689g(), f84280b, BarcodeFormat.MAXICODE);
        String b = c.mo102684b();
        if (b != null) {
            kVar.mo102881j(ResultMetadataType.ERROR_CORRECTION_LEVEL, b);
        }
        return kVar;
    }

    /* renamed from: c */
    public C34761k mo102420c(C34644b bVar) throws NotFoundException, ChecksumException, FormatException {
        return mo102419a(bVar, (Map<DecodeHintType, ?>) null);
    }

    public void reset() {
    }
}
