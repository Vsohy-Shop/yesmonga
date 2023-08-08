package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.pg */
public final class C41503pg extends C41310hg<List<C41310hg<?>>> {

    /* renamed from: c */
    public static final Map<String, C41735z8> f104885c;

    /* renamed from: b */
    public final ArrayList<C41310hg<?>> f104886b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("concat", new C41183c9());
        hashMap.put("every", new C41207d9());
        hashMap.put("filter", new C41231e9());
        hashMap.put("forEach", new C41255f9());
        hashMap.put("indexOf", new C41303h9());
        hashMap.put("hasOwnProperty", C41185cb.f104495a);
        hashMap.put("join", new C41327i9());
        hashMap.put("lastIndexOf", new C41351j9());
        hashMap.put("map", new C41376k9());
        hashMap.put("pop", new C41400l9());
        hashMap.put("push", new C41424m9());
        hashMap.put("reduce", new C41448n9());
        hashMap.put("reduceRight", new C41472o9());
        hashMap.put("reverse", new C41496p9());
        hashMap.put("shift", new C41520q9());
        hashMap.put("slice", new C41544r9());
        hashMap.put("some", new C41568s9());
        hashMap.put("sort", new C41664w9());
        hashMap.put("splice", new C41688x9());
        hashMap.put("toString", new C41258fc());
        hashMap.put("unshift", new C41712y9());
        f104885c = Collections.unmodifiableMap(hashMap);
    }

    public C41503pg(List<C41310hg<?>> list) {
        C40843u.m166202l(list);
        this.f104886b = new ArrayList<>(list);
    }

    /* renamed from: a */
    public final C41735z8 mo135434a(String str) {
        if (mo135440g(str)) {
            return f104885c.get(str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Native Method ");
        sb.append(str);
        sb.append(" is not defined for type ListWrapper.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo135436c() {
        return this.f104886b;
    }

    /* renamed from: e */
    public final Iterator<C41310hg<?>> mo135438e() {
        return new C41479og(this, new C41455ng(this), super.mo135437d());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C41503pg) {
            ArrayList<C41310hg<?>> arrayList = ((C41503pg) obj).f104886b;
            if (this.f104886b.size() == arrayList.size()) {
                boolean z = true;
                for (int i = 0; i < this.f104886b.size(); i++) {
                    if (this.f104886b.get(i) != null) {
                        z = this.f104886b.get(i).equals(arrayList.get(i));
                    } else if (arrayList.get(i) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        break;
                    }
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo135440g(String str) {
        return f104885c.containsKey(str);
    }

    /* renamed from: i */
    public final C41310hg<?> mo135718i(int i) {
        if (i < 0 || i >= this.f104886b.size()) {
            return C41431mg.f104800h;
        }
        C41310hg<?> hgVar = this.f104886b.get(i);
        if (hgVar == null) {
            return C41431mg.f104800h;
        }
        return hgVar;
    }

    /* renamed from: k */
    public final List<C41310hg<?>> mo135719k() {
        return this.f104886b;
    }

    /* renamed from: l */
    public final void mo135720l(int i, C41310hg<?> hgVar) {
        if (i >= 0) {
            if (i >= this.f104886b.size()) {
                mo135721m(i + 1);
            }
            this.f104886b.set(i, hgVar);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: m */
    public final void mo135721m(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166192b(z, "Invalid array length");
        if (this.f104886b.size() != i) {
            if (this.f104886b.size() < i) {
                this.f104886b.ensureCapacity(i);
                for (int size = this.f104886b.size(); size < i; size++) {
                    this.f104886b.add((Object) null);
                }
                return;
            }
            ArrayList<C41310hg<?>> arrayList = this.f104886b;
            arrayList.subList(i, arrayList.size()).clear();
        }
    }

    /* renamed from: n */
    public final boolean mo135722n(int i) {
        if (i < 0 || i >= this.f104886b.size() || this.f104886b.get(i) == null) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f104886b.toString();
    }
}
