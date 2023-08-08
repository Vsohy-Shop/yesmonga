package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.shape.b */
public final class C31516b implements C31518d {

    /* renamed from: a */
    public final C31518d f76346a;

    /* renamed from: b */
    public final float f76347b;

    public C31516b(float f, @C0359n0 C31518d dVar) {
        while (dVar instanceof C31516b) {
            dVar = ((C31516b) dVar).f76346a;
            f += ((C31516b) dVar).f76347b;
        }
        this.f76346a = dVar;
        this.f76347b = f;
    }

    /* renamed from: a */
    public float mo90693a(@C0359n0 RectF rectF) {
        return Math.max(0.0f, this.f76346a.mo90693a(rectF) + this.f76347b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31516b)) {
            return false;
        }
        C31516b bVar = (C31516b) obj;
        if (!this.f76346a.equals(bVar.f76346a) || this.f76347b != bVar.f76347b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76346a, Float.valueOf(this.f76347b)});
    }
}
