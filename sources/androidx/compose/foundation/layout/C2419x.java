package androidx.compose.foundation.layout;

import androidx.compose.runtime.C8585m0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.foundation.layout.x */
public final class C2419x {

    /* renamed from: a */
    public final int f6366a;

    /* renamed from: b */
    public final int f6367b;

    /* renamed from: c */
    public final int f6368c;

    /* renamed from: d */
    public final int f6369d;

    public C2419x(int i, int i2, int i3, int i4) {
        this.f6366a = i;
        this.f6367b = i2;
        this.f6368c = i3;
        this.f6369d = i4;
    }

    /* renamed from: a */
    public final int mo8224a() {
        return this.f6369d;
    }

    /* renamed from: b */
    public final int mo8225b() {
        return this.f6366a;
    }

    /* renamed from: c */
    public final int mo8226c() {
        return this.f6368c;
    }

    /* renamed from: d */
    public final int mo8227d() {
        return this.f6367b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2419x)) {
            return false;
        }
        C2419x xVar = (C2419x) obj;
        if (this.f6366a == xVar.f6366a && this.f6367b == xVar.f6367b && this.f6368c == xVar.f6368c && this.f6369d == xVar.f6369d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f6366a * 31) + this.f6367b) * 31) + this.f6368c) * 31) + this.f6369d;
    }

    @C12579k
    public String toString() {
        return "InsetsValues(left=" + this.f6366a + ", top=" + this.f6367b + ", right=" + this.f6368c + ", bottom=" + this.f6369d + ')';
    }
}
