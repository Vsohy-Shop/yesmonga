package androidx.compose.material;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C3044g0
@C8585m0
/* renamed from: androidx.compose.material.m1 */
public final class C7882m1<T> {

    /* renamed from: d */
    public static final int f18879d = 0;

    /* renamed from: a */
    public final T f18880a;

    /* renamed from: b */
    public final T f18881b;

    /* renamed from: c */
    public final float f18882c;

    public C7882m1(T t, T t2, float f) {
        this.f18880a = t;
        this.f18881b = t2;
        this.f18882c = f;
    }

    /* renamed from: a */
    public final float mo10882a() {
        return this.f18882c;
    }

    /* renamed from: b */
    public final T mo10883b() {
        return this.f18880a;
    }

    /* renamed from: c */
    public final T mo10884c() {
        return this.f18881b;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7882m1)) {
            return false;
        }
        C7882m1 m1Var = (C7882m1) obj;
        if (!Intrinsics.areEqual((Object) this.f18880a, (Object) m1Var.f18880a) || !Intrinsics.areEqual((Object) this.f18881b, (Object) m1Var.f18881b)) {
            return false;
        }
        if (this.f18882c == m1Var.f18882c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        T t = this.f18880a;
        int i2 = 0;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        T t2 = this.f18881b;
        if (t2 != null) {
            i2 = t2.hashCode();
        }
        return ((i3 + i2) * 31) + Float.hashCode(this.f18882c);
    }

    @C12579k
    public String toString() {
        return "SwipeProgress(from=" + this.f18880a + ", to=" + this.f18881b + ", fraction=" + this.f18882c + ')';
    }
}
