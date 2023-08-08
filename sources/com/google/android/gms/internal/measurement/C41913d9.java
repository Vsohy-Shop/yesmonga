package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d9 */
public final class C41913d9 {

    /* renamed from: a */
    public final Object f106075a;

    /* renamed from: b */
    public final int f106076b;

    public C41913d9(Object obj, int i) {
        this.f106075a = obj;
        this.f106076b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C41913d9)) {
            return false;
        }
        C41913d9 d9Var = (C41913d9) obj;
        if (this.f106075a == d9Var.f106075a && this.f106076b == d9Var.f106076b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f106075a) * 65535) + this.f106076b;
    }
}
