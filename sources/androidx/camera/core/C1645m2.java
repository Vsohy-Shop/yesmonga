package androidx.camera.core;

import android.util.Rational;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.camera.core.m2 */
public class C1645m2 {

    /* renamed from: a */
    public float f4596a;

    /* renamed from: b */
    public float f4597b;

    /* renamed from: c */
    public float f4598c;
    @C0363p0

    /* renamed from: d */
    public Rational f4599d;

    public C1645m2(float f, float f2, float f3, @C0363p0 Rational rational) {
        this.f4596a = f;
        this.f4597b = f2;
        this.f4598c = f3;
        this.f4599d = rational;
    }

    /* renamed from: a */
    public float mo5626a() {
        return this.f4598c;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public Rational mo5627b() {
        return this.f4599d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public float mo5628c() {
        return this.f4596a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public float mo5629d() {
        return this.f4597b;
    }
}
