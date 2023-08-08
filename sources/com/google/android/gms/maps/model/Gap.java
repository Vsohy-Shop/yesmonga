package com.google.android.gms.maps.model;

import androidx.annotation.C0359n0;

public final class Gap extends PatternItem {

    /* renamed from: d */
    public final float f73014d;

    public Gap(float f) {
        super(2, Float.valueOf(Math.max(f, 0.0f)));
        this.f73014d = Math.max(f, 0.0f);
    }

    @C0359n0
    public String toString() {
        float f = this.f73014d;
        StringBuilder sb = new StringBuilder(29);
        sb.append("[Gap: length=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
