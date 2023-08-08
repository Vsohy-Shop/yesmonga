package com.google.android.gms.maps.model;

import androidx.annotation.C0359n0;

public final class CustomCap extends Cap {
    @C0359n0

    /* renamed from: e */
    public final C30573a f73011e;

    /* renamed from: f */
    public final float f73012f;

    public CustomCap(@C0359n0 C30573a aVar) {
        this(aVar, 10.0f);
    }

    @C0359n0
    public String toString() {
        String valueOf = String.valueOf(this.f73011e);
        float f = this.f73012f;
        StringBuilder sb = new StringBuilder(valueOf.length() + 55);
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(valueOf);
        sb.append(" refWidth=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CustomCap(@androidx.annotation.C0359n0 com.google.android.gms.maps.model.C30573a r3, float r4) {
        /*
            r2 = this;
            java.lang.String r0 = "bitmapDescriptor must not be null"
            java.lang.Object r0 = com.google.android.gms.common.internal.C40843u.m166203m(r3, r0)
            com.google.android.gms.maps.model.a r0 = (com.google.android.gms.maps.model.C30573a) r0
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0015
            r2.<init>(r0, r4)
            r2.f73011e = r3
            r2.f73012f = r4
            return
        L_0x0015:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "refWidth must be positive"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.CustomCap.<init>(com.google.android.gms.maps.model.a, float):void");
    }
}
