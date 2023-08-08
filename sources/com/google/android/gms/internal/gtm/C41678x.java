package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.C40407s;
import com.google.android.gms.common.internal.C40858y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@C40858y
/* renamed from: com.google.android.gms.internal.gtm.x */
public final class C41678x extends C40407s<C41678x> {

    /* renamed from: a */
    public final Map<Integer, Double> f105222a = new HashMap(4);

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo133444c(C40407s sVar) {
        ((C41678x) sVar).f105222a.putAll(this.f105222a);
    }

    /* renamed from: e */
    public final Map<Integer, Double> mo136027e() {
        return Collections.unmodifiableMap(this.f105222a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f105222a.entrySet()) {
            String valueOf = String.valueOf(next.getKey());
            StringBuilder sb = new StringBuilder(valueOf.length() + 6);
            sb.append("metric");
            sb.append(valueOf);
            hashMap.put(sb.toString(), next.getValue());
        }
        return C40407s.m164503a(hashMap);
    }
}
