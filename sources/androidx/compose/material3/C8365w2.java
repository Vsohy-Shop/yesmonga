package androidx.compose.material3;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
@C8585m0
/* renamed from: androidx.compose.material3.w2 */
public final class C8365w2<T> {

    /* renamed from: a */
    public final T f22455a;

    /* renamed from: b */
    public final T f22456b;

    /* renamed from: c */
    public final float f22457c;

    public C8365w2(T t, T t2, float f) {
        this.f22455a = t;
        this.f22456b = t2;
        this.f22457c = f;
    }

    /* renamed from: a */
    public final float mo14757a() {
        return this.f22457c;
    }

    /* renamed from: b */
    public final T mo14758b() {
        return this.f22455a;
    }

    /* renamed from: c */
    public final T mo14759c() {
        return this.f22456b;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8365w2)) {
            return false;
        }
        C8365w2 w2Var = (C8365w2) obj;
        if (!Intrinsics.areEqual((Object) this.f22455a, (Object) w2Var.f22455a) || !Intrinsics.areEqual((Object) this.f22456b, (Object) w2Var.f22456b)) {
            return false;
        }
        if (this.f22457c == w2Var.f22457c) {
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
        T t = this.f22455a;
        int i2 = 0;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        T t2 = this.f22456b;
        if (t2 != null) {
            i2 = t2.hashCode();
        }
        return ((i3 + i2) * 31) + Float.hashCode(this.f22457c);
    }

    @C12579k
    public String toString() {
        return "SwipeProgress(from=" + this.f22455a + ", to=" + this.f22456b + ", fraction=" + this.f22457c + ')';
    }
}
