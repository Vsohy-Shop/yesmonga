package com.google.android.gms.internal.gtm;

import com.google.android.material.color.C31234i;
import okio.C12520s0;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.android.gms.internal.gtm.jm */
public final class C41364jm {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m167852a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m167856e(b2) || (((b << C31234i.C31240f.f75184f) + (b2 + 112)) >> 30) != 0 || m167856e(b3) || m167856e(b4)) {
            throw zzvk.m168997d();
        }
        byte b5 = ((b & 7) << DateTimeFieldType.f30605G0) | ((b2 & C12520s0.f30502a) << 12) | ((b3 & C12520s0.f30502a) << 6) | (b4 & C12520s0.f30502a);
        cArr[i] = (char) ((b5 >>> 10) + C12520s0.f30505d);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m167853b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m167856e(b2)) {
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
            if (!m167856e(b3)) {
                cArr[i] = (char) (((b & DateTimeFieldType.f30626Z) << 12) | ((b2 & C12520s0.f30502a) << 6) | (b3 & C12520s0.f30502a));
                return;
            }
        }
        throw zzvk.m168997d();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m167854c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m167856e(b2)) {
            throw zzvk.m168997d();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & C12520s0.f30502a));
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m167855d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    public static boolean m167856e(byte b) {
        return b > -65;
    }
}
