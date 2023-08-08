package com.google.android.gms.common.api;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

public class ApiException extends Exception {
    @C0359n0
    @Deprecated
    protected final Status mStatus;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ApiException(@androidx.annotation.C0359n0 com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.mo133648W()
            java.lang.String r1 = r4.mo133649X()
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = r4.mo133649X()
            goto L_0x0011
        L_0x000f:
            java.lang.String r1 = ""
        L_0x0011:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.mStatus = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.ApiException.<init>(com.google.android.gms.common.api.Status):void");
    }

    @C0359n0
    /* renamed from: a */
    public Status mo133627a() {
        return this.mStatus;
    }

    /* renamed from: b */
    public int mo133628b() {
        return this.mStatus.mo133648W();
    }

    @C0363p0
    @Deprecated
    /* renamed from: c */
    public String mo133629c() {
        return this.mStatus.mo133649X();
    }
}
