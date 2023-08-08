package androidx.camera.core.impl.utils;

import androidx.annotation.C0363p0;
import androidx.core.util.C17983g0;
import androidx.core.util.C18001r;

final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T mReference;

    public Present(T t) {
        this.mReference = t;
    }

    /* renamed from: c */
    public T mo5326c() {
        return this.mReference;
    }

    /* renamed from: d */
    public boolean mo5327d() {
        return true;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj instanceof Present) {
            return this.mReference.equals(((Present) obj).mReference);
        }
        return false;
    }

    /* renamed from: f */
    public Optional<T> mo5329f(Optional<? extends T> optional) {
        C18001r.m81775l(optional);
        return this;
    }

    /* renamed from: g */
    public T mo5330g(C17983g0<? extends T> g0Var) {
        C18001r.m81775l(g0Var);
        return this.mReference;
    }

    /* renamed from: h */
    public T mo5331h(T t) {
        C18001r.m81776m(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.mReference;
    }

    public int hashCode() {
        return this.mReference.hashCode() + 1502476572;
    }

    /* renamed from: i */
    public T mo5333i() {
        return this.mReference;
    }

    public String toString() {
        return "Optional.of(" + this.mReference + ")";
    }
}
