package com.google.android.gms.internal.mlkit_vision_text_common;

import java.lang.annotation.Annotation;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.d1 */
public final class C30023d1 implements C30071h1 {

    /* renamed from: c4 */
    public final int f71780c4;

    /* renamed from: d4 */
    public final zzcq f71781d4;

    public C30023d1(int i, zzcq zzcq) {
        this.f71780c4 = i;
        this.f71781d4 = zzcq;
    }

    public final Class<? extends Annotation> annotationType() {
        return C30071h1.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30071h1)) {
            return false;
        }
        C30071h1 h1Var = (C30071h1) obj;
        if (this.f71780c4 != h1Var.zza() || !this.f71781d4.equals(h1Var.zzb())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f71780c4 ^ 14552422) + (this.f71781d4.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f71780c4 + "intEncoding=" + this.f71781d4 + ')';
    }

    public final int zza() {
        return this.f71780c4;
    }

    public final zzcq zzb() {
        return this.f71781d4;
    }
}
