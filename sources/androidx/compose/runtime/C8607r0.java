package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.r0 */
public final class C8607r0 {
    @C12580l

    /* renamed from: a */
    public final Object f23043a;
    @C12580l

    /* renamed from: b */
    public final Object f23044b;

    public C8607r0(@C12580l Object obj, @C12580l Object obj2) {
        this.f23043a = obj;
        this.f23044b = obj2;
    }

    /* renamed from: d */
    public static /* synthetic */ C8607r0 m31232d(C8607r0 r0Var, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = r0Var.f23043a;
        }
        if ((i & 2) != 0) {
            obj2 = r0Var.f23044b;
        }
        return r0Var.mo16298c(obj, obj2);
    }

    @C12580l
    /* renamed from: a */
    public final Object mo16296a() {
        return this.f23043a;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo16297b() {
        return this.f23044b;
    }

    @C12579k
    /* renamed from: c */
    public final C8607r0 mo16298c(@C12580l Object obj, @C12580l Object obj2) {
        return new C8607r0(obj, obj2);
    }

    @C12580l
    /* renamed from: e */
    public final Object mo16299e() {
        return this.f23043a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8607r0)) {
            return false;
        }
        C8607r0 r0Var = (C8607r0) obj;
        return Intrinsics.areEqual(this.f23043a, r0Var.f23043a) && Intrinsics.areEqual(this.f23044b, r0Var.f23044b);
    }

    @C12580l
    /* renamed from: f */
    public final Object mo16301f() {
        return this.f23044b;
    }

    /* renamed from: g */
    public final int mo16302g(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public int hashCode() {
        return (mo16302g(this.f23043a) * 31) + mo16302g(this.f23044b);
    }

    @C12579k
    public String toString() {
        return "JoinedKey(left=" + this.f23043a + ", right=" + this.f23044b + ')';
    }
}
