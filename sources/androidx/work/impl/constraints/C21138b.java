package androidx.work.impl.constraints;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.work.impl.constraints.b */
public final class C21138b {

    /* renamed from: a */
    public final boolean f54586a;

    /* renamed from: b */
    public final boolean f54587b;

    /* renamed from: c */
    public final boolean f54588c;

    /* renamed from: d */
    public final boolean f54589d;

    public C21138b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f54586a = z;
        this.f54587b = z2;
        this.f54588c = z3;
        this.f54589d = z4;
    }

    /* renamed from: f */
    public static /* synthetic */ C21138b m97795f(C21138b bVar, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bVar.f54586a;
        }
        if ((i & 2) != 0) {
            z2 = bVar.f54587b;
        }
        if ((i & 4) != 0) {
            z3 = bVar.f54588c;
        }
        if ((i & 8) != 0) {
            z4 = bVar.f54589d;
        }
        return bVar.mo63280e(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final boolean mo63276a() {
        return this.f54586a;
    }

    /* renamed from: b */
    public final boolean mo63277b() {
        return this.f54587b;
    }

    /* renamed from: c */
    public final boolean mo63278c() {
        return this.f54588c;
    }

    /* renamed from: d */
    public final boolean mo63279d() {
        return this.f54589d;
    }

    @C12579k
    /* renamed from: e */
    public final C21138b mo63280e(boolean z, boolean z2, boolean z3, boolean z4) {
        return new C21138b(z, z2, z3, z4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21138b)) {
            return false;
        }
        C21138b bVar = (C21138b) obj;
        return this.f54586a == bVar.f54586a && this.f54587b == bVar.f54587b && this.f54588c == bVar.f54588c && this.f54589d == bVar.f54589d;
    }

    /* renamed from: g */
    public final boolean mo63282g() {
        return this.f54586a;
    }

    /* renamed from: h */
    public final boolean mo63283h() {
        return this.f54588c;
    }

    public int hashCode() {
        boolean z = this.f54586a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f54587b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f54588c;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f54589d;
        if (!z5) {
            z2 = z5;
        }
        return i3 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo63285i() {
        return this.f54589d;
    }

    /* renamed from: j */
    public final boolean mo63286j() {
        return this.f54587b;
    }

    @C12579k
    public String toString() {
        return "NetworkState(isConnected=" + this.f54586a + ", isValidated=" + this.f54587b + ", isMetered=" + this.f54588c + ", isNotRoaming=" + this.f54589d + ')';
    }
}
