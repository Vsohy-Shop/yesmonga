package kotlin.collections;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.collections.h0 */
public final class C10942h0<T> {

    /* renamed from: a */
    public final int f28169a;

    /* renamed from: b */
    public final T f28170b;

    public C10942h0(int i, T t) {
        this.f28169a = i;
        this.f28170b = t;
    }

    /* renamed from: d */
    public static /* synthetic */ C10942h0 m40944d(C10942h0 h0Var, int i, T t, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = h0Var.f28169a;
        }
        if ((i2 & 2) != 0) {
            t = h0Var.f28170b;
        }
        return h0Var.mo22278c(i, t);
    }

    /* renamed from: a */
    public final int mo22276a() {
        return this.f28169a;
    }

    /* renamed from: b */
    public final T mo22277b() {
        return this.f28170b;
    }

    @C12579k
    /* renamed from: c */
    public final C10942h0<T> mo22278c(int i, T t) {
        return new C10942h0<>(i, t);
    }

    /* renamed from: e */
    public final int mo22279e() {
        return this.f28169a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10942h0)) {
            return false;
        }
        C10942h0 h0Var = (C10942h0) obj;
        return this.f28169a == h0Var.f28169a && Intrinsics.areEqual((Object) this.f28170b, (Object) h0Var.f28170b);
    }

    /* renamed from: f */
    public final T mo22281f() {
        return this.f28170b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f28169a) * 31;
        T t = this.f28170b;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    @C12579k
    public String toString() {
        return "IndexedValue(index=" + this.f28169a + ", value=" + this.f28170b + ')';
    }
}
