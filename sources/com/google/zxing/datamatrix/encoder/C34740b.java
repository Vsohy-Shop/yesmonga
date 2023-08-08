package com.google.zxing.datamatrix.encoder;

import com.bumptech.glide.gifdecoder.C22073d;

/* renamed from: com.google.zxing.datamatrix.encoder.b */
public final class C34740b implements C34745g {
    /* renamed from: c */
    public static char m141762c(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    /* renamed from: a */
    public void mo102782a(C34746h hVar) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!hVar.mo102811j()) {
                break;
            }
            sb.append(hVar.mo102805d());
            hVar.f84183f++;
            if (C34748j.m141831o(hVar.mo102806e(), hVar.f84183f, mo102783b()) != mo102783b()) {
                hVar.mo102817p(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a = hVar.mo102802a() + length + 1;
        hVar.mo102819r(a);
        if (hVar.mo102809h().mo102823b() - a > 0) {
            z = true;
        } else {
            z = false;
        }
        if (hVar.mo102811j() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + C22073d.f56676j));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            hVar.mo102820s(m141762c(sb.charAt(i), hVar.mo102802a() + 1));
        }
    }

    /* renamed from: b */
    public int mo102783b() {
        return 5;
    }
}
