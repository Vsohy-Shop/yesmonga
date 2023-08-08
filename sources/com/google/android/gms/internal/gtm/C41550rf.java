package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.rf */
public final class C41550rf {

    /* renamed from: a */
    public final List<C41694xf> f104923a;

    /* renamed from: b */
    public final Map<String, C41622uf> f104924b;

    /* renamed from: c */
    public final String f104925c;

    public C41550rf(List<C41694xf> list, Map<String, C41622uf> map, String str, int i) {
        this.f104923a = Collections.unmodifiableList(list);
        this.f104924b = Collections.unmodifiableMap(map);
        this.f104925c = str;
    }

    /* renamed from: a */
    public final C41622uf mo135803a(String str) {
        return this.f104924b.get(str);
    }

    /* renamed from: b */
    public final String mo135804b() {
        return this.f104925c;
    }

    /* renamed from: c */
    public final List<C41694xf> mo135805c() {
        return this.f104923a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104923a);
        String valueOf2 = String.valueOf(this.f104924b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 18 + valueOf2.length());
        sb.append("Rules: ");
        sb.append(valueOf);
        sb.append("\n  Macros: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
