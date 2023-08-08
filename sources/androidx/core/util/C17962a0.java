package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.util.a0 */
public final class C17962a0 {

    /* renamed from: a */
    public final float f46448a;

    /* renamed from: b */
    public final float f46449b;

    @C0376v0(21)
    /* renamed from: androidx.core.util.a0$a */
    public static final class C17963a {
        @C0359n0
        @C0373u
        /* renamed from: a */
        public static SizeF m81596a(@C0359n0 C17962a0 a0Var) {
            C18001r.m81775l(a0Var);
            return new SizeF(a0Var.mo52414b(), a0Var.mo52413a());
        }

        @C0359n0
        @C0373u
        /* renamed from: b */
        public static C17962a0 m81597b(@C0359n0 SizeF sizeF) {
            C18001r.m81775l(sizeF);
            return new C17962a0(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public C17962a0(float f, float f2) {
        this.f46448a = C18001r.m81767d(f, "width");
        this.f46449b = C18001r.m81767d(f2, "height");
    }

    @C0359n0
    @C0376v0(21)
    /* renamed from: d */
    public static C17962a0 m81592d(@C0359n0 SizeF sizeF) {
        return C17963a.m81597b(sizeF);
    }

    /* renamed from: a */
    public float mo52413a() {
        return this.f46449b;
    }

    /* renamed from: b */
    public float mo52414b() {
        return this.f46448a;
    }

    @C0359n0
    @C0376v0(21)
    /* renamed from: c */
    public SizeF mo52415c() {
        return C17963a.m81596a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17962a0)) {
            return false;
        }
        C17962a0 a0Var = (C17962a0) obj;
        if (a0Var.f46448a == this.f46448a && a0Var.f46449b == this.f46449b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f46448a) ^ Float.floatToIntBits(this.f46449b);
    }

    @C0359n0
    public String toString() {
        return this.f46448a + "x" + this.f46449b;
    }
}
