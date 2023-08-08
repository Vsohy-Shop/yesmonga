package com.google.android.gms.internal.gtm;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.google.android.gms.analytics.C40407s;
import com.google.android.gms.common.internal.C40858y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@C40858y
/* renamed from: com.google.android.gms.internal.gtm.w */
public final class C41654w extends C40407s<C41654w> {

    /* renamed from: a */
    public final Map<Integer, String> f105180a = new HashMap(4);

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo133444c(C40407s sVar) {
        ((C41654w) sVar).f105180a.putAll(this.f105180a);
    }

    /* renamed from: e */
    public final Map<Integer, String> mo136006e() {
        return Collections.unmodifiableMap(this.f105180a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f105180a.entrySet()) {
            String valueOf = String.valueOf(next.getKey());
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append(C16717v.C16719b.f42184g);
            sb.append(valueOf);
            hashMap.put(sb.toString(), next.getValue());
        }
        return C40407s.m164503a(hashMap);
    }
}
