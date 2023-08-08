package androidx.camera.core.impl.utils;

import androidx.annotation.C0363p0;
import androidx.core.util.C17983g0;
import androidx.core.util.C18001r;

final class Absent<T> extends Optional<T> {

    /* renamed from: a */
    public static final Absent<Object> f4286a = new Absent<>();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    /* renamed from: j */
    public static <T> Optional<T> m6317j() {
        return f4286a;
    }

    private Object readResolve() {
        return f4286a;
    }

    /* renamed from: c */
    public T mo5326c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: d */
    public boolean mo5327d() {
        return false;
    }

    public boolean equals(@C0363p0 Object obj) {
        return obj == this;
    }

    /* renamed from: f */
    public Optional<T> mo5329f(Optional<? extends T> optional) {
        return (Optional) C18001r.m81775l(optional);
    }

    /* renamed from: g */
    public T mo5330g(C17983g0<? extends T> g0Var) {
        return C18001r.m81776m(g0Var.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    /* renamed from: h */
    public T mo5331h(T t) {
        return C18001r.m81776m(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    public int hashCode() {
        return 2040732332;
    }

    @C0363p0
    /* renamed from: i */
    public T mo5333i() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
