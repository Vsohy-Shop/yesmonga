package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.C0359n0;
import java.util.Arrays;

/* renamed from: com.google.android.material.shape.a */
public final class C31515a implements C31518d {

    /* renamed from: a */
    public final float f76345a;

    public C31515a(float f) {
        this.f76345a = f;
    }

    /* renamed from: a */
    public float mo90693a(@C0359n0 RectF rectF) {
        return this.f76345a;
    }

    /* renamed from: b */
    public float mo90694b() {
        return this.f76345a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31515a)) {
            return false;
        }
        if (this.f76345a == ((C31515a) obj).f76345a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f76345a)});
    }
}
