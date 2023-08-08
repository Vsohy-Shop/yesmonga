package androidx.compose.animation.core;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.l */
public final class C1986l extends C1997o {

    /* renamed from: e */
    public static final int f5537e = 8;

    /* renamed from: b */
    public float f5538b;

    /* renamed from: c */
    public float f5539c;

    /* renamed from: d */
    public final int f5540d = 2;

    public C1986l(float f, float f2) {
        super((DefaultConstructorMarker) null);
        this.f5538b = f;
        this.f5539c = f2;
    }

    /* renamed from: a */
    public float mo6866a(int i) {
        if (i == 0) {
            return this.f5538b;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f5539c;
    }

    /* renamed from: b */
    public int mo6867b() {
        return this.f5540d;
    }

    /* renamed from: d */
    public void mo6869d() {
        this.f5538b = 0.0f;
        this.f5539c = 0.0f;
    }

    /* renamed from: e */
    public void mo6870e(int i, float f) {
        if (i == 0) {
            this.f5538b = f;
        } else if (i == 1) {
            this.f5539c = f;
        }
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof C1986l)) {
            return false;
        }
        C1986l lVar = (C1986l) obj;
        if (!(lVar.f5538b == this.f5538b)) {
            return false;
        }
        return (lVar.f5539c > this.f5539c ? 1 : (lVar.f5539c == this.f5539c ? 0 : -1)) == 0;
    }

    /* renamed from: f */
    public final float mo6884f() {
        return this.f5538b;
    }

    /* renamed from: g */
    public final float mo6885g() {
        return this.f5539c;
    }

    @C12579k
    /* renamed from: h */
    public C1986l mo6868c() {
        return new C1986l(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f5538b) * 31) + Float.hashCode(this.f5539c);
    }

    /* renamed from: i */
    public final void mo6888i(float f) {
        this.f5538b = f;
    }

    /* renamed from: j */
    public final void mo6889j(float f) {
        this.f5539c = f;
    }

    @C12579k
    public String toString() {
        return "AnimationVector2D: v1 = " + this.f5538b + ", v2 = " + this.f5539c;
    }
}
