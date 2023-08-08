package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.C40407s;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.util.C40974d0;
import java.util.HashMap;

@C40858y
@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.z */
public final class C41726z extends C40407s<C41726z> {

    /* renamed from: a */
    public String f105315a;

    /* renamed from: b */
    public int f105316b;

    /* renamed from: c */
    public int f105317c;

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo133444c(C40407s sVar) {
        C41726z zVar = (C41726z) sVar;
        int i = this.f105316b;
        if (i != 0) {
            zVar.f105316b = i;
        }
        int i2 = this.f105317c;
        if (i2 != 0) {
            zVar.f105317c = i2;
        }
        if (!TextUtils.isEmpty(this.f105315a)) {
            zVar.f105315a = this.f105315a;
        }
    }

    /* renamed from: e */
    public final String mo136115e() {
        return this.f105315a;
    }

    /* renamed from: f */
    public final void mo136116f(String str) {
        this.f105315a = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.f105315a);
        hashMap.put("screenColors", 0);
        hashMap.put("screenWidth", Integer.valueOf(this.f105316b));
        hashMap.put("screenHeight", Integer.valueOf(this.f105317c));
        hashMap.put("viewportWidth", 0);
        hashMap.put("viewportHeight", 0);
        return C40407s.m164503a(hashMap);
    }
}
