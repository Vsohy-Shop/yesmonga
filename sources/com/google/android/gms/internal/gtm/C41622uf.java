package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.uf */
public final class C41622uf {

    /* renamed from: a */
    public final Map<String, C41214dg> f105069a;

    /* renamed from: b */
    public final C41214dg f105070b;

    public /* synthetic */ C41622uf(Map map, C41214dg dgVar, C41598tf tfVar) {
        this.f105069a = Collections.unmodifiableMap(map);
        this.f105070b = dgVar;
    }

    /* renamed from: a */
    public final Map<String, C41214dg> mo135913a() {
        return this.f105069a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105069a);
        String valueOf2 = String.valueOf(this.f105070b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 32 + valueOf2.length());
        sb.append("Properties: ");
        sb.append(valueOf);
        sb.append(" pushAfterEvaluate: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
