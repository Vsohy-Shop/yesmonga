package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.C40407s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.util.C40974d0;
import java.util.HashMap;
import java.util.UUID;

@C40858y
@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.e0 */
public final class C41222e0 extends C40407s<C41222e0> {

    /* renamed from: a */
    public int f104552a;

    public C41222e0() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            leastSignificantBits = Integer.MAX_VALUE;
        }
        C40843u.m166204n(leastSignificantBits);
        this.f104552a = leastSignificantBits;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo133444c(C40407s sVar) {
        C41222e0 e0Var = (C41222e0) sVar;
        TextUtils.isEmpty((CharSequence) null);
        int i = this.f104552a;
        if (i != 0) {
            e0Var.f104552a = i;
        }
        TextUtils.isEmpty((CharSequence) null);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            TextUtils.isEmpty((CharSequence) null);
        }
    }

    /* renamed from: e */
    public final int mo135311e() {
        return this.f104552a;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", (Object) null);
        Boolean bool = Boolean.FALSE;
        hashMap.put("interstitial", bool);
        hashMap.put("automatic", bool);
        hashMap.put("screenId", Integer.valueOf(this.f104552a));
        hashMap.put("referrerScreenId", 0);
        hashMap.put("referrerScreenName", (Object) null);
        hashMap.put("referrerUri", (Object) null);
        return C40407s.m164503a(hashMap);
    }
}
