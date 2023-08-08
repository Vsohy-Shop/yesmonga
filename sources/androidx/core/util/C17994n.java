package androidx.core.util;

import androidx.annotation.C0359n0;

/* renamed from: androidx.core.util.n */
public class C17994n<F, S> {

    /* renamed from: a */
    public final F f46482a;

    /* renamed from: b */
    public final S f46483b;

    public C17994n(F f, S s) {
        this.f46482a = f;
        this.f46483b = s;
    }

    @C0359n0
    /* renamed from: a */
    public static <A, B> C17994n<A, B> m81748a(A a, B b) {
        return new C17994n<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C17994n)) {
            return false;
        }
        C17994n nVar = (C17994n) obj;
        if (!C17992m.m81740a(nVar.f46482a, this.f46482a) || !C17992m.m81740a(nVar.f46483b, this.f46483b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.f46482a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f46483b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    @C0359n0
    public String toString() {
        return "Pair{" + this.f46482a + " " + this.f46483b + "}";
    }
}
