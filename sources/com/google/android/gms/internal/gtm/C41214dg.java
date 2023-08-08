package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.dg */
public final class C41214dg {

    /* renamed from: d */
    public static final String f104536d = new String("");

    /* renamed from: e */
    public static final Integer f104537e = 0;

    /* renamed from: a */
    public final int f104538a;

    /* renamed from: b */
    public final Object f104539b;

    /* renamed from: c */
    public final List<Integer> f104540c;

    public /* synthetic */ C41214dg(Integer num, Object obj, List list, boolean z, C41190cg cgVar) {
        this.f104538a = num.intValue();
        this.f104539b = obj;
        this.f104540c = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public final int mo135230a() {
        return this.f104538a;
    }

    /* renamed from: b */
    public final Object mo135231b() {
        return this.f104539b;
    }

    /* renamed from: c */
    public final List<Integer> mo135232c() {
        return this.f104540c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C41214dg) && ((C41214dg) obj).f104539b.equals(this.f104539b);
    }

    public final int hashCode() {
        return this.f104539b.hashCode();
    }

    public final String toString() {
        Object obj = this.f104539b;
        if (obj != null) {
            return obj.toString();
        }
        C41493p6.m168149a("Fail to convert a null object to string");
        return f104536d;
    }
}
