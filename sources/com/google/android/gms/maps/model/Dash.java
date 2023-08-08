package com.google.android.gms.maps.model;

import androidx.annotation.C0359n0;

public final class Dash extends PatternItem {

    /* renamed from: d */
    public final float f73013d;

    public Dash(float f) {
        super(0, Float.valueOf(Math.max(f, 0.0f)));
        this.f73013d = Math.max(f, 0.0f);
    }

    @C0359n0
    public String toString() {
        float f = this.f73013d;
        StringBuilder sb = new StringBuilder(30);
        sb.append("[Dash: length=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
