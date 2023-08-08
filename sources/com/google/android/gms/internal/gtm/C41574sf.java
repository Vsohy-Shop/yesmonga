package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.sf */
public final class C41574sf {

    /* renamed from: a */
    public final Map<String, C41214dg> f104959a = new HashMap();

    /* renamed from: b */
    public C41214dg f104960b;

    /* renamed from: a */
    public final C41574sf mo135828a(String str, C41214dg dgVar) {
        this.f104959a.put(str, dgVar);
        return this;
    }

    /* renamed from: b */
    public final C41574sf mo135829b(C41214dg dgVar) {
        this.f104960b = dgVar;
        return this;
    }

    /* renamed from: c */
    public final C41622uf mo135830c() {
        return new C41622uf(this.f104959a, this.f104960b, (C41598tf) null);
    }
}
