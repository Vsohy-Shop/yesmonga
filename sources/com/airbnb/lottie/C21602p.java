package com.airbnb.lottie;

import androidx.annotation.C0363p0;
import java.util.Arrays;

/* renamed from: com.airbnb.lottie.p */
public final class C21602p<V> {
    @C0363p0

    /* renamed from: a */
    public final V f55906a;
    @C0363p0

    /* renamed from: b */
    public final Throwable f55907b;

    public C21602p(V v) {
        this.f55906a = v;
        this.f55907b = null;
    }

    @C0363p0
    /* renamed from: a */
    public Throwable mo64538a() {
        return this.f55907b;
    }

    @C0363p0
    /* renamed from: b */
    public V mo64539b() {
        return this.f55906a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21602p)) {
            return false;
        }
        C21602p pVar = (C21602p) obj;
        if (mo64539b() != null && mo64539b().equals(pVar.mo64539b())) {
            return true;
        }
        if (mo64538a() == null || pVar.mo64538a() == null) {
            return false;
        }
        return mo64538a().toString().equals(mo64538a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{mo64539b(), mo64538a()});
    }

    public C21602p(Throwable th) {
        this.f55907b = th;
        this.f55906a = null;
    }
}
