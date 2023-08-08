package com.google.android.gms.internal.measurement;

import com.google.android.material.color.C31234i;
import okio.C12520s0;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.android.gms.internal.measurement.jc */
public final class C42024jc {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m170414a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m170418e(b2) || (((b << C31234i.C31240f.f75184f) + (b2 + 112)) >> 30) != 0 || m170418e(b3) || m170418e(b4)) {
            throw zzll.m171374c();
        }
        byte b5 = b2 & C12520s0.f30502a;
        byte b6 = b3 & C12520s0.f30502a;
        byte b7 = ((b & 7) << DateTimeFieldType.f30605G0) | (b5 << 12) | (b6 << 6) | (b4 & C12520s0.f30502a);
        cArr[i] = (char) ((b7 >>> 10) + C12520s0.f30505d);
        cArr[i + 1] = (char) ((b7 & 1023) + 56320);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m170415b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m170418e(b2)) {
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
            if (!m170418e(b3)) {
                cArr[i] = (char) (((b & DateTimeFieldType.f30626Z) << 12) | ((b2 & C12520s0.f30502a) << 6) | (b3 & C12520s0.f30502a));
                return;
            }
        }
        throw zzll.m171374c();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m170416c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m170418e(b2)) {
            throw zzll.m171374c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & C12520s0.f30502a));
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m170417d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    public static boolean m170418e(byte b) {
        return b > -65;
    }
}
