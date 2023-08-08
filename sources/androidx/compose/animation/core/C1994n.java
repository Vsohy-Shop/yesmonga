package androidx.compose.animation.core;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.n */
public final class C1994n extends C1997o {

    /* renamed from: g */
    public static final int f5563g = 8;

    /* renamed from: b */
    public float f5564b;

    /* renamed from: c */
    public float f5565c;

    /* renamed from: d */
    public float f5566d;

    /* renamed from: e */
    public float f5567e;

    /* renamed from: f */
    public final int f5568f = 4;

    public C1994n(float f, float f2, float f3, float f4) {
        super((DefaultConstructorMarker) null);
        this.f5564b = f;
        this.f5565c = f2;
        this.f5566d = f3;
        this.f5567e = f4;
    }

    /* renamed from: a */
    public float mo6866a(int i) {
        if (i == 0) {
            return this.f5564b;
        }
        if (i == 1) {
            return this.f5565c;
        }
        if (i == 2) {
            return this.f5566d;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f5567e;
    }

    /* renamed from: b */
    public int mo6867b() {
        return this.f5568f;
    }

    /* renamed from: d */
    public void mo6869d() {
        this.f5564b = 0.0f;
        this.f5565c = 0.0f;
        this.f5566d = 0.0f;
        this.f5567e = 0.0f;
    }

    /* renamed from: e */
    public void mo6870e(int i, float f) {
        if (i == 0) {
            this.f5564b = f;
        } else if (i == 1) {
            this.f5565c = f;
        } else if (i == 2) {
            this.f5566d = f;
        } else if (i == 3) {
            this.f5567e = f;
        }
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!(obj instanceof C1994n)) {
            return false;
        }
        C1994n nVar = (C1994n) obj;
        if (nVar.f5564b == this.f5564b) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (nVar.f5565c == this.f5565c) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (nVar.f5566d == this.f5566d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (nVar.f5567e == this.f5567e) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final float mo6925f() {
        return this.f5564b;
    }

    /* renamed from: g */
    public final float mo6926g() {
        return this.f5565c;
    }

    /* renamed from: h */
    public final float mo6927h() {
        return this.f5566d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f5564b) * 31) + Float.hashCode(this.f5565c)) * 31) + Float.hashCode(this.f5566d)) * 31) + Float.hashCode(this.f5567e);
    }

    /* renamed from: i */
    public final float mo6929i() {
        return this.f5567e;
    }

    @C12579k
    /* renamed from: j */
    public C1994n mo6868c() {
        return new C1994n(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: k */
    public final void mo6931k(float f) {
        this.f5564b = f;
    }

    /* renamed from: l */
    public final void mo6932l(float f) {
        this.f5565c = f;
    }

    /* renamed from: m */
    public final void mo6933m(float f) {
        this.f5566d = f;
    }

    /* renamed from: n */
    public final void mo6934n(float f) {
        this.f5567e = f;
    }

    @C12579k
    public String toString() {
        return "AnimationVector4D: v1 = " + this.f5564b + ", v2 = " + this.f5565c + ", v3 = " + this.f5566d + ", v4 = " + this.f5567e;
    }
}
