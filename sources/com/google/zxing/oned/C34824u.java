package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C34709a;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.zxing.oned.u */
public final class C34824u {

    /* renamed from: a */
    public final int[] f84507a = new int[4];

    /* renamed from: b */
    public final StringBuilder f84508b = new StringBuilder();

    /* renamed from: c */
    public static Map<ResultMetadataType, Object> m142180c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* renamed from: a */
    public final int mo103017a(C34709a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f84507a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int o = aVar.mo102649o();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < o; i3++) {
            int j = C34827x.m142191j(aVar, iArr2, i, C34827x.f84521j);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = aVar.mo102648n(aVar.mo102647m(i));
            }
        }
        if (sb.length() != 2) {
            throw NotFoundException.m141229a();
        } else if (Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        } else {
            throw NotFoundException.m141229a();
        }
    }

    /* renamed from: b */
    public C34761k mo103018b(int i, C34709a aVar, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f84508b;
        sb.setLength(0);
        int a = mo103017a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<ResultMetadataType, Object> c = m142180c(sb2);
        float f = (float) i;
        C34761k kVar = new C34761k(sb2, (byte[]) null, new C34762l[]{new C34762l(((float) (iArr[0] + iArr[1])) / 2.0f, f), new C34762l((float) a, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (c != null) {
            kVar.mo102880i(c);
        }
        return kVar;
    }
}
