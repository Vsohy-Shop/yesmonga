package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.qf */
public final class C41526qf {

    /* renamed from: a */
    public final List<C41694xf> f104907a = new ArrayList();

    /* renamed from: b */
    public final Map<String, C41622uf> f104908b = new HashMap();

    /* renamed from: c */
    public String f104909c = "";

    /* renamed from: a */
    public final C41526qf mo135780a(C41622uf ufVar) {
        this.f104908b.put(ufVar.mo135913a().get("instance_name").toString(), ufVar);
        return this;
    }

    /* renamed from: b */
    public final C41526qf mo135781b(C41694xf xfVar) {
        this.f104907a.add(xfVar);
        return this;
    }

    /* renamed from: c */
    public final C41526qf mo135782c(String str) {
        this.f104909c = str;
        return this;
    }

    /* renamed from: d */
    public final C41550rf mo135783d() {
        return new C41550rf(this.f104907a, this.f104908b, this.f104909c, 0);
    }
}
