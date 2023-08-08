package com.google.zxing.client.result;

import com.google.zxing.C34761k;

/* renamed from: com.google.zxing.client.result.f */
public final class C34683f extends C34673a {
    /* renamed from: s */
    public C34676b0 mo102518k(C34761k kVar) {
        String g = kVar.mo102878g();
        if (!g.startsWith("MEBKM:")) {
            return null;
        }
        String r = C34673a.m141367r("TITLE:", g, true);
        String[] q = C34673a.m141366q("URL:", g, true);
        if (q == null) {
            return null;
        }
        String str = q[0];
        if (C34678c0.m141383q(str)) {
            return new C34676b0(str, r);
        }
        return null;
    }
}
