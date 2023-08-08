package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.C0359n0;
import androidx.annotation.C0379x;
import java.util.Arrays;

/* renamed from: com.google.android.material.shape.m */
public final class C31532m implements C31518d {

    /* renamed from: a */
    public final float f76416a;

    public C31532m(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f76416a = f;
    }

    /* renamed from: a */
    public float mo90693a(@C0359n0 RectF rectF) {
        return this.f76416a * rectF.height();
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: b */
    public float mo90806b() {
        return this.f76416a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31532m)) {
            return false;
        }
        if (this.f76416a == ((C31532m) obj).f76416a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f76416a)});
    }
}
