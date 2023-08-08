package com.google.android.gms.internal.mlkit_vision_barcode;

import java.lang.annotation.Annotation;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.n1 */
public final class C38704n1 implements C38768s1 {

    /* renamed from: c4 */
    public final int f98047c4;

    /* renamed from: d4 */
    public final zzda f98048d4;

    public C38704n1(int i, zzda zzda) {
        this.f98047c4 = i;
        this.f98048d4 = zzda;
    }

    public final Class<? extends Annotation> annotationType() {
        return C38768s1.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38768s1)) {
            return false;
        }
        C38768s1 s1Var = (C38768s1) obj;
        if (this.f98047c4 != s1Var.zza() || !this.f98048d4.equals(s1Var.zzb())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f98047c4 ^ 14552422) + (this.f98048d4.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f98047c4 + "intEncoding=" + this.f98048d4 + ')';
    }

    public final int zza() {
        return this.f98047c4;
    }

    public final zzda zzb() {
        return this.f98048d4;
    }
}
