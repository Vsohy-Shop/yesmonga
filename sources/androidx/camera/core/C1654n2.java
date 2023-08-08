package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.camera.core.n2 */
public abstract class C1654n2 {
    @C0363p0

    /* renamed from: a */
    public Rational f4624a;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C1654n2() {
        this((Rational) null);
    }

    /* renamed from: d */
    public static float m6748d() {
        return 0.15f;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public abstract PointF mo5078a(float f, float f2);

    @C0359n0
    /* renamed from: b */
    public final C1645m2 mo5650b(float f, float f2) {
        return mo5651c(f, f2, m6748d());
    }

    @C0359n0
    /* renamed from: c */
    public final C1645m2 mo5651c(float f, float f2, float f3) {
        PointF a = mo5078a(f, f2);
        return new C1645m2(a.x, a.y, f3, this.f4624a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C1654n2(@C0363p0 Rational rational) {
        this.f4624a = rational;
    }
}
