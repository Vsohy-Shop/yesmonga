package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.xf */
public final class C41694xf {

    /* renamed from: a */
    public final List<C41622uf> f105240a;

    /* renamed from: b */
    public final List<C41622uf> f105241b;

    /* renamed from: c */
    public final List<C41622uf> f105242c;

    /* renamed from: d */
    public final List<C41622uf> f105243d;

    public /* synthetic */ C41694xf(List list, List list2, List list3, List list4, C41670wf wfVar) {
        this.f105240a = Collections.unmodifiableList(list);
        this.f105241b = Collections.unmodifiableList(list2);
        this.f105242c = Collections.unmodifiableList(list3);
        this.f105243d = Collections.unmodifiableList(list4);
    }

    /* renamed from: a */
    public final List<C41622uf> mo136036a() {
        return this.f105242c;
    }

    /* renamed from: b */
    public final List<C41622uf> mo136037b() {
        return this.f105241b;
    }

    /* renamed from: c */
    public final List<C41622uf> mo136038c() {
        return this.f105240a;
    }

    /* renamed from: d */
    public final List<C41622uf> mo136039d() {
        return this.f105243d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105240a);
        String valueOf2 = String.valueOf(this.f105241b);
        String valueOf3 = String.valueOf(this.f105242c);
        String valueOf4 = String.valueOf(this.f105243d);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + valueOf3.length() + valueOf4.length());
        sb.append("Positive predicates: ");
        sb.append(valueOf);
        sb.append("  Negative predicates: ");
        sb.append(valueOf2);
        sb.append("  Add tags: ");
        sb.append(valueOf3);
        sb.append("  Remove tags: ");
        sb.append(valueOf4);
        return sb.toString();
    }
}
