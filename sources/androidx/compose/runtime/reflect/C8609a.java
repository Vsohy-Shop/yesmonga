package androidx.compose.runtime.reflect;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.reflect.a */
public final class C8609a {

    /* renamed from: a */
    public final boolean f23045a;

    /* renamed from: b */
    public final int f23046b;

    /* renamed from: c */
    public final int f23047c;

    /* renamed from: d */
    public final int f23048d;

    public C8609a(boolean z, int i, int i2, int i3) {
        this.f23045a = z;
        this.f23046b = i;
        this.f23047c = i2;
        this.f23048d = i3;
    }

    /* renamed from: f */
    public static /* synthetic */ C8609a m31244f(C8609a aVar, boolean z, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = aVar.f23045a;
        }
        if ((i4 & 2) != 0) {
            i = aVar.f23046b;
        }
        if ((i4 & 4) != 0) {
            i2 = aVar.f23047c;
        }
        if ((i4 & 8) != 0) {
            i3 = aVar.f23048d;
        }
        return aVar.mo16314e(z, i, i2, i3);
    }

    /* renamed from: a */
    public final boolean mo16310a() {
        return this.f23045a;
    }

    /* renamed from: b */
    public final int mo16311b() {
        return this.f23046b;
    }

    /* renamed from: c */
    public final int mo16312c() {
        return this.f23047c;
    }

    /* renamed from: d */
    public final int mo16313d() {
        return this.f23048d;
    }

    @C12579k
    /* renamed from: e */
    public final C8609a mo16314e(boolean z, int i, int i2, int i3) {
        return new C8609a(z, i, i2, i3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8609a)) {
            return false;
        }
        C8609a aVar = (C8609a) obj;
        return this.f23045a == aVar.f23045a && this.f23046b == aVar.f23046b && this.f23047c == aVar.f23047c && this.f23048d == aVar.f23048d;
    }

    /* renamed from: g */
    public final int mo16316g() {
        return this.f23047c;
    }

    /* renamed from: h */
    public final int mo16317h() {
        return this.f23048d;
    }

    public int hashCode() {
        boolean z = this.f23045a;
        if (z) {
            z = true;
        }
        return ((((((z ? 1 : 0) * true) + Integer.hashCode(this.f23046b)) * 31) + Integer.hashCode(this.f23047c)) * 31) + Integer.hashCode(this.f23048d);
    }

    /* renamed from: i */
    public final int mo16319i() {
        return this.f23046b;
    }

    /* renamed from: j */
    public final boolean mo16320j() {
        return this.f23045a;
    }

    @C12579k
    public String toString() {
        return "ComposableInfo(isComposable=" + this.f23045a + ", realParamsCount=" + this.f23046b + ", changedParams=" + this.f23047c + ", defaultParams=" + this.f23048d + ')';
    }
}
