package androidx.camera.core.impl.utils;

import androidx.annotation.C0363p0;
import androidx.core.util.C17983g0;
import androidx.core.util.C18001r;
import java.io.Serializable;

public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public static <T> Optional<T> m6347a() {
        return Absent.m6317j();
    }

    /* renamed from: b */
    public static <T> Optional<T> m6348b(@C0363p0 T t) {
        return t == null ? m6347a() : new Present(t);
    }

    /* renamed from: e */
    public static <T> Optional<T> m6349e(T t) {
        return new Present(C18001r.m81775l(t));
    }

    /* renamed from: c */
    public abstract T mo5326c();

    /* renamed from: d */
    public abstract boolean mo5327d();

    public abstract boolean equals(@C0363p0 Object obj);

    /* renamed from: f */
    public abstract Optional<T> mo5329f(Optional<? extends T> optional);

    /* renamed from: g */
    public abstract T mo5330g(C17983g0<? extends T> g0Var);

    /* renamed from: h */
    public abstract T mo5331h(T t);

    public abstract int hashCode();

    @C0363p0
    /* renamed from: i */
    public abstract T mo5333i();

    public abstract String toString();
}
