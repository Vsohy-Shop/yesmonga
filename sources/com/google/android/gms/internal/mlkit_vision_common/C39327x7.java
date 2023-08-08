package com.google.android.gms.internal.mlkit_vision_common;

import java.lang.annotation.Annotation;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.x7 */
public final class C39327x7 implements C39127b8 {

    /* renamed from: c4 */
    public final int f100410c4;

    /* renamed from: d4 */
    public final zzw f100411d4;

    public C39327x7(int i, zzw zzw) {
        this.f100410c4 = i;
        this.f100411d4 = zzw;
    }

    public final Class<? extends Annotation> annotationType() {
        return C39127b8.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39127b8)) {
            return false;
        }
        C39127b8 b8Var = (C39127b8) obj;
        if (this.f100410c4 != b8Var.zza() || !this.f100411d4.equals(b8Var.zzb())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f100410c4 ^ 14552422) + (this.f100411d4.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f100410c4 + "intEncoding=" + this.f100411d4 + ')';
    }

    public final int zza() {
        return this.f100410c4;
    }

    public final zzw zzb() {
        return this.f100411d4;
    }
}
