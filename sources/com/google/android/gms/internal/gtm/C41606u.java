package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.C40407s;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.util.C40974d0;
import java.util.HashMap;

@C40858y
@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.u */
public final class C41606u extends C40407s<C41606u> {

    /* renamed from: a */
    public String f105024a;

    /* renamed from: b */
    public String f105025b;

    /* renamed from: c */
    public String f105026c;

    /* renamed from: d */
    public String f105027d;

    /* renamed from: e */
    public final String mo135881e() {
        return this.f105026c;
    }

    /* renamed from: f */
    public final String mo135882f() {
        return this.f105027d;
    }

    /* renamed from: g */
    public final String mo135883g() {
        return this.f105024a;
    }

    /* renamed from: h */
    public final String mo135884h() {
        return this.f105025b;
    }

    /* renamed from: i */
    public final void mo133444c(C41606u uVar) {
        if (!TextUtils.isEmpty(this.f105024a)) {
            uVar.f105024a = this.f105024a;
        }
        if (!TextUtils.isEmpty(this.f105025b)) {
            uVar.f105025b = this.f105025b;
        }
        if (!TextUtils.isEmpty(this.f105026c)) {
            uVar.f105026c = this.f105026c;
        }
        if (!TextUtils.isEmpty(this.f105027d)) {
            uVar.f105027d = this.f105027d;
        }
    }

    /* renamed from: j */
    public final void mo135886j(String str) {
        this.f105026c = str;
    }

    /* renamed from: k */
    public final void mo135887k(String str) {
        this.f105027d = str;
    }

    /* renamed from: l */
    public final void mo135888l(String str) {
        this.f105024a = str;
    }

    /* renamed from: m */
    public final void mo135889m(String str) {
        this.f105025b = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f105024a);
        hashMap.put("appVersion", this.f105025b);
        hashMap.put("appId", this.f105026c);
        hashMap.put("appInstallerId", this.f105027d);
        return C40407s.m164503a(hashMap);
    }
}
