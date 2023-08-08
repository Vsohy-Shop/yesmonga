package com.google.android.gms.internal.mlkit_common;

import java.lang.annotation.Annotation;

/* renamed from: com.google.android.gms.internal.mlkit_common.r */
public final class C42490r implements C42544w {

    /* renamed from: c4 */
    public final int f107304c4;

    /* renamed from: d4 */
    public final zzaz f107305d4;

    public C42490r(int i, zzaz zzaz) {
        this.f107304c4 = i;
        this.f107305d4 = zzaz;
    }

    public final Class<? extends Annotation> annotationType() {
        return C42544w.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42544w)) {
            return false;
        }
        C42544w wVar = (C42544w) obj;
        if (this.f107304c4 != wVar.zza() || !this.f107305d4.equals(wVar.zzb())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f107304c4 ^ 14552422) + (this.f107305d4.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f107304c4 + "intEncoding=" + this.f107305d4 + ')';
    }

    public final int zza() {
        return this.f107304c4;
    }

    public final zzaz zzb() {
        return this.f107305d4;
    }
}
