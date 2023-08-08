package com.google.android.gms.common.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.gms.common.annotation.C40473a;

@C40473a
/* renamed from: com.google.android.gms.common.util.o */
public final class C40989o {
    @C0363p0
    @C40473a
    /* renamed from: a */
    public static String m166660a(@C0359n0 byte[] bArr, int i, int i2, boolean z) {
        int length;
        int i3;
        if (bArr == null || (length = bArr.length) == 0 || i < 0 || i2 <= 0 || i + i2 > length) {
            return null;
        }
        if (z) {
            i3 = 75;
        } else {
            i3 = 57;
        }
        StringBuilder sb = new StringBuilder(i3 * ((i2 + 15) / 16));
        int i4 = i2;
        int i5 = 0;
        int i6 = 0;
        while (i4 > 0) {
            if (i5 == 0) {
                if (i2 < 65536) {
                    sb.append(String.format("%04X:", new Object[]{Integer.valueOf(i)}));
                } else {
                    sb.append(String.format("%08X:", new Object[]{Integer.valueOf(i)}));
                }
                i6 = i;
            } else if (i5 == 8) {
                sb.append(" -");
            }
            sb.append(String.format(" %02X", new Object[]{Integer.valueOf(bArr[i] & 255)}));
            i4--;
            i5++;
            if (z && (i5 == 16 || i4 == 0)) {
                int i7 = 16 - i5;
                if (i7 > 0) {
                    for (int i8 = 0; i8 < i7; i8++) {
                        sb.append("   ");
                    }
                }
                if (i7 >= 8) {
                    sb.append(GlideException.C22148a.f56917d);
                }
                sb.append(GlideException.C22148a.f56917d);
                for (int i9 = 0; i9 < i5; i9++) {
                    char c = (char) bArr[i6 + i9];
                    if (c < ' ' || c > '~') {
                        c = '.';
                    }
                    sb.append(c);
                }
            }
            if (i5 == 16 || i4 == 0) {
                sb.append(10);
                i5 = 0;
            }
            i++;
        }
        return sb.toString();
    }
}
