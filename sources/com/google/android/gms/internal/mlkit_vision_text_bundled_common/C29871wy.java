package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.wy */
public final class C29871wy {

    /* renamed from: a */
    public final Object f71524a;

    /* renamed from: b */
    public final int f71525b;

    public C29871wy(Object obj, int i) {
        this.f71524a = obj;
        this.f71525b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29871wy)) {
            return false;
        }
        C29871wy wyVar = (C29871wy) obj;
        if (this.f71524a == wyVar.f71524a && this.f71525b == wyVar.f71525b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f71524a) * 65535) + this.f71525b;
    }
}
