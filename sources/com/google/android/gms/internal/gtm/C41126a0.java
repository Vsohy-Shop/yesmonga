package com.google.android.gms.internal.gtm;

import com.carrefour.fid.android.shared.constant.C28592s1;
import com.google.android.gms.analytics.C40407s;
import com.google.android.gms.analytics.ecommerce.C40381a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.gms.common.internal.C40858y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@C40858y
/* renamed from: com.google.android.gms.internal.gtm.a0 */
public final class C41126a0 extends C40407s<C41126a0> {

    /* renamed from: a */
    public final List<C40381a> f104416a = new ArrayList();

    /* renamed from: b */
    public final List<C40383c> f104417b = new ArrayList();

    /* renamed from: c */
    public final Map<String, List<C40381a>> f104418c = new HashMap();

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo133444c(C40407s sVar) {
        String str;
        C41126a0 a0Var = (C41126a0) sVar;
        a0Var.f104416a.addAll(this.f104416a);
        a0Var.f104417b.addAll(this.f104417b);
        for (Map.Entry next : this.f104418c.entrySet()) {
            String str2 = (String) next.getKey();
            for (C40381a aVar : (List) next.getValue()) {
                if (aVar != null) {
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    if (!a0Var.f104418c.containsKey(str)) {
                        a0Var.f104418c.put(str, new ArrayList());
                    }
                    a0Var.f104418c.get(str).add(aVar);
                }
            }
        }
    }

    /* renamed from: e */
    public final List<C40381a> mo134989e() {
        return Collections.unmodifiableList(this.f104416a);
    }

    /* renamed from: f */
    public final List<C40383c> mo134990f() {
        return Collections.unmodifiableList(this.f104417b);
    }

    /* renamed from: g */
    public final Map<String, List<C40381a>> mo134991g() {
        return this.f104418c;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.f104416a.isEmpty()) {
            hashMap.put("products", this.f104416a);
        }
        if (!this.f104417b.isEmpty()) {
            hashMap.put(C28592s1.f69855o, this.f104417b);
        }
        if (!this.f104418c.isEmpty()) {
            hashMap.put("impressions", this.f104418c);
        }
        hashMap.put("productAction", (Object) null);
        return C40407s.m164503a(hashMap);
    }
}
