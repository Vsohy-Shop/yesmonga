package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r */
public final class C42150r implements C42133q {

    /* renamed from: a */
    public final String f106372a;

    /* renamed from: b */
    public final ArrayList f106373b;

    public C42150r(String str, List list) {
        this.f106372a = str;
        ArrayList arrayList = new ArrayList();
        this.f106373b = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String mo137244a() {
        return this.f106372a;
    }

    /* renamed from: b */
    public final ArrayList mo137245b() {
        return this.f106373b;
    }

    /* renamed from: e */
    public final C42133q mo136734e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42150r)) {
            return false;
        }
        C42150r rVar = (C42150r) obj;
        String str = this.f106372a;
        if (str == null ? rVar.f106372a == null : str.equals(rVar.f106372a)) {
            return this.f106373b.equals(rVar.f106373b);
        }
        return false;
    }

    /* renamed from: h */
    public final Boolean mo136738h() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final int hashCode() {
        int i;
        String str = this.f106372a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + this.f106373b.hashCode();
    }

    /* renamed from: i */
    public final C42133q mo136741i(String str, C41909d5 d5Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    /* renamed from: j */
    public final Double mo136743j() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    /* renamed from: k */
    public final String mo136744k() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    /* renamed from: q */
    public final Iterator mo136745q() {
        return null;
    }
}
