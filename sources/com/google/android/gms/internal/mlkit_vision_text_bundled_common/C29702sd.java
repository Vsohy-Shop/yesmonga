package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.sd */
public final class C29702sd {

    /* renamed from: a */
    public final int f71450a;

    /* renamed from: b */
    public final int f71451b;

    public C29702sd(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 32767 || i < 0) {
            z = false;
        } else {
            z = true;
        }
        C29679rr.m120995c(z);
        C29679rr.m120995c((i2 >= 32767 || i2 < 0) ? false : z2);
        this.f71450a = i;
        this.f71451b = i2;
    }

    /* renamed from: a */
    public final int mo84825a() {
        return this.f71451b;
    }

    /* renamed from: b */
    public final int mo84826b() {
        return this.f71450a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C29702sd) {
            C29702sd sdVar = (C29702sd) obj;
            if (this.f71450a == sdVar.f71450a && this.f71451b == sdVar.f71451b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f71451b | (this.f71450a << 16);
    }

    public final String toString() {
        int i = this.f71450a;
        int i2 = this.f71451b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
