package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.material.color.C31234i;
import okio.C12520s0;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.r5 */
public final class C39033r5 {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m160806a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m160810e(b2) || (((b << C31234i.C31240f.f75184f) + (b2 + 112)) >> 30) != 0 || m160810e(b3) || m160810e(b4)) {
            throw zzep.m161102c();
        }
        byte b5 = ((b & 7) << DateTimeFieldType.f30605G0) | ((b2 & C12520s0.f30502a) << 12) | ((b3 & C12520s0.f30502a) << 6) | (b4 & C12520s0.f30502a);
        cArr[i] = (char) ((b5 >>> 10) + C12520s0.f30505d);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m160807b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m160810e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m160810e(b3)) {
                cArr[i] = (char) (((b & DateTimeFieldType.f30626Z) << 12) | ((b2 & C12520s0.f30502a) << 6) | (b3 & C12520s0.f30502a));
                return;
            }
        }
        throw zzep.m161102c();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m160808c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m160810e(b2)) {
            throw zzep.m161102c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & C12520s0.f30502a));
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m160809d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    public static boolean m160810e(byte b) {
        return b > -65;
    }
}
