package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g */
public final class C41957g implements C42133q {

    /* renamed from: a */
    public final boolean f106139a;

    public C41957g(Boolean bool) {
        this.f106139a = bool == null ? false : bool.booleanValue();
    }

    /* renamed from: e */
    public final C42133q mo136734e() {
        return new C41957g(Boolean.valueOf(this.f106139a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C41957g) && this.f106139a == ((C41957g) obj).f106139a) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final Boolean mo136738h() {
        return Boolean.valueOf(this.f106139a);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f106139a).hashCode();
    }

    /* renamed from: i */
    public final C42133q mo136741i(String str, C41909d5 d5Var, List list) {
        if ("toString".equals(str)) {
            return new C42201u(Boolean.toString(this.f106139a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f106139a), str}));
    }

    /* renamed from: j */
    public final Double mo136743j() {
        return Double.valueOf(true != this.f106139a ? 0.0d : 1.0d);
    }

    /* renamed from: k */
    public final String mo136744k() {
        return Boolean.toString(this.f106139a);
    }

    /* renamed from: q */
    public final Iterator mo136745q() {
        return null;
    }

    public final String toString() {
        return String.valueOf(this.f106139a);
    }
}
