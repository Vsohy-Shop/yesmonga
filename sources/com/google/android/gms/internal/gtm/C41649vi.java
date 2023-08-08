package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.vi */
public final class C41649vi {

    /* renamed from: a */
    public final Object f105167a;

    /* renamed from: b */
    public final int f105168b;

    public C41649vi(Object obj, int i) {
        this.f105167a = obj;
        this.f105168b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C41649vi)) {
            return false;
        }
        C41649vi viVar = (C41649vi) obj;
        if (this.f105167a == viVar.f105167a && this.f105168b == viVar.f105168b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f105167a) * 65535) + this.f105168b;
    }
}
