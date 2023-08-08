package androidx.compose.animation.core;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.m */
public final class C1989m extends C1997o {

    /* renamed from: f */
    public static final int f5547f = 8;

    /* renamed from: b */
    public float f5548b;

    /* renamed from: c */
    public float f5549c;

    /* renamed from: d */
    public float f5550d;

    /* renamed from: e */
    public final int f5551e = 3;

    public C1989m(float f, float f2, float f3) {
        super((DefaultConstructorMarker) null);
        this.f5548b = f;
        this.f5549c = f2;
        this.f5550d = f3;
    }

    /* renamed from: a */
    public float mo6866a(int i) {
        if (i == 0) {
            return this.f5548b;
        }
        if (i == 1) {
            return this.f5549c;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f5550d;
    }

    /* renamed from: b */
    public int mo6867b() {
        return this.f5551e;
    }

    /* renamed from: d */
    public void mo6869d() {
        this.f5548b = 0.0f;
        this.f5549c = 0.0f;
        this.f5550d = 0.0f;
    }

    /* renamed from: e */
    public void mo6870e(int i, float f) {
        if (i == 0) {
            this.f5548b = f;
        } else if (i == 1) {
            this.f5549c = f;
        } else if (i == 2) {
            this.f5550d = f;
        }
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof C1989m)) {
            return false;
        }
        C1989m mVar = (C1989m) obj;
        if (!(mVar.f5548b == this.f5548b)) {
            return false;
        }
        if (!(mVar.f5549c == this.f5549c)) {
            return false;
        }
        return (mVar.f5550d > this.f5550d ? 1 : (mVar.f5550d == this.f5550d ? 0 : -1)) == 0;
    }

    /* renamed from: f */
    public final float mo6895f() {
        return this.f5548b;
    }

    /* renamed from: g */
    public final float mo6896g() {
        return this.f5549c;
    }

    /* renamed from: h */
    public final float mo6897h() {
        return this.f5550d;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f5548b) * 31) + Float.hashCode(this.f5549c)) * 31) + Float.hashCode(this.f5550d);
    }

    @C12579k
    /* renamed from: i */
    public C1989m mo6868c() {
        return new C1989m(0.0f, 0.0f, 0.0f);
    }

    /* renamed from: j */
    public final void mo6900j(float f) {
        this.f5548b = f;
    }

    /* renamed from: k */
    public final void mo6901k(float f) {
        this.f5549c = f;
    }

    /* renamed from: l */
    public final void mo6902l(float f) {
        this.f5550d = f;
    }

    @C12579k
    public String toString() {
        return "AnimationVector3D: v1 = " + this.f5548b + ", v2 = " + this.f5549c + ", v3 = " + this.f5550d;
    }
}
