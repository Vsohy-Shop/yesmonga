package androidx.compose.animation.core;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.k */
public final class C1983k extends C1997o {

    /* renamed from: d */
    public static final int f5524d = 8;

    /* renamed from: b */
    public float f5525b;

    /* renamed from: c */
    public final int f5526c = 1;

    public C1983k(float f) {
        super((DefaultConstructorMarker) null);
        this.f5525b = f;
    }

    /* renamed from: a */
    public float mo6866a(int i) {
        if (i == 0) {
            return this.f5525b;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public int mo6867b() {
        return this.f5526c;
    }

    /* renamed from: d */
    public void mo6869d() {
        this.f5525b = 0.0f;
    }

    /* renamed from: e */
    public void mo6870e(int i, float f) {
        if (i == 0) {
            this.f5525b = f;
        }
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof C1983k)) {
            return false;
        }
        return (((C1983k) obj).f5525b > this.f5525b ? 1 : (((C1983k) obj).f5525b == this.f5525b ? 0 : -1)) == 0;
    }

    /* renamed from: f */
    public final float mo6872f() {
        return this.f5525b;
    }

    @C12579k
    /* renamed from: g */
    public C1983k mo6868c() {
        return new C1983k(0.0f);
    }

    /* renamed from: h */
    public final void mo6874h(float f) {
        this.f5525b = f;
    }

    public int hashCode() {
        return Float.hashCode(this.f5525b);
    }

    @C12579k
    public String toString() {
        return "AnimationVector1D: value = " + this.f5525b;
    }
}
