package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h */
public final class C41975h implements C42133q {

    /* renamed from: a */
    public final C42133q f106160a;

    /* renamed from: b */
    public final String f106161b;

    public C41975h(String str) {
        this.f106160a = C42133q.f106351H;
        this.f106161b = str;
    }

    /* renamed from: a */
    public final C42133q mo136889a() {
        return this.f106160a;
    }

    /* renamed from: b */
    public final String mo136890b() {
        return this.f106161b;
    }

    /* renamed from: e */
    public final C42133q mo136734e() {
        return new C41975h(this.f106161b, this.f106160a.mo136734e());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C41975h)) {
            return false;
        }
        C41975h hVar = (C41975h) obj;
        if (!this.f106161b.equals(hVar.f106161b) || !this.f106160a.equals(hVar.f106160a)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final Boolean mo136738h() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final int hashCode() {
        return (this.f106161b.hashCode() * 31) + this.f106160a.hashCode();
    }

    /* renamed from: i */
    public final C42133q mo136741i(String str, C41909d5 d5Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    /* renamed from: j */
    public final Double mo136743j() {
        throw new IllegalStateException("Control is not a double");
    }

    /* renamed from: k */
    public final String mo136744k() {
        throw new IllegalStateException("Control is not a String");
    }

    /* renamed from: q */
    public final Iterator mo136745q() {
        return null;
    }

    public C41975h(String str, C42133q qVar) {
        this.f106160a = qVar;
        this.f106161b = str;
    }

    public C41975h() {
        throw null;
    }
}
