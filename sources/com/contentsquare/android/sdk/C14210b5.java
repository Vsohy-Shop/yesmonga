package com.contentsquare.android.sdk;

import java.util.Collections;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.b5 */
public final class C14210b5<T> {

    /* renamed from: d */
    public static final C14210b5<Object> f35099d;

    /* renamed from: e */
    public static final C14210b5<Object> f35100e;

    /* renamed from: f */
    public static final Throwable f35101f;

    /* renamed from: a */
    public final T f35102a;

    /* renamed from: b */
    public volatile transient List<T> f35103b;

    /* renamed from: c */
    public final Throwable f35104c;

    static {
        Throwable th = new Throwable("Attempt failed");
        th.setStackTrace(new StackTraceElement[0]);
        f35100e = new C14210b5<>((Object) null, th);
        NullPointerException nullPointerException = new NullPointerException("Value is absent");
        f35101f = nullPointerException;
        nullPointerException.setStackTrace(new StackTraceElement[0]);
        f35099d = new C14210b5<>((Object) null, nullPointerException);
    }

    public C14210b5(T t, Throwable th) {
        C14169a3.m60809b((th == null ? false : true) ^ (t != null), "Illegal Result arguments");
        this.f35102a = t;
        this.f35104c = th;
        this.f35103b = t != null ? null : Collections.emptyList();
    }

    /* renamed from: a */
    public static <T> C14210b5<T> m60986a() {
        return f35099d;
    }

    /* renamed from: b */
    public static <T> C14210b5<T> m60987b(T t) {
        return t == null ? m60986a() : m60989d(t);
    }

    /* renamed from: c */
    public static <T> C14210b5<T> m60988c(Throwable th) {
        return th == f35101f ? m60986a() : new C14210b5<>((Object) null, (Throwable) C14169a3.m60808a(th));
    }

    /* renamed from: d */
    public static <T> C14210b5<T> m60989d(T t) {
        return m60990f(t);
    }

    /* renamed from: f */
    public static <T> C14210b5<T> m60990f(T t) {
        return new C14210b5<>(C14169a3.m60808a(t), (Throwable) null);
    }

    /* renamed from: e */
    public List<T> mo34653e() {
        List<T> list = this.f35103b;
        if (list == null) {
            synchronized (this) {
                list = this.f35103b;
                if (list == null) {
                    list = Collections.singletonList(this.f35102a);
                    this.f35103b = list;
                }
            }
        }
        return list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14210b5.class != obj.getClass()) {
            return false;
        }
        C14210b5 b5Var = (C14210b5) obj;
        T t = this.f35102a;
        if (t == null ? b5Var.f35102a != null : !t.equals(b5Var.f35102a)) {
            return false;
        }
        Throwable th = this.f35104c;
        Throwable th2 = b5Var.f35104c;
        return th == null ? th2 == null : th.equals(th2);
    }

    /* renamed from: g */
    public T mo34655g() {
        T t = this.f35102a;
        if (t != null) {
            return t;
        }
        throw new C14541n3(this.f35104c);
    }

    /* renamed from: h */
    public Throwable mo34656h() {
        C14169a3.m60810c(this.f35104c != null, "Not a failure");
        return this.f35104c;
    }

    public int hashCode() {
        T t = this.f35102a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        Throwable th = this.f35104c;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public boolean mo34658i() {
        return this == f35099d;
    }

    /* renamed from: j */
    public boolean mo34659j() {
        return mo34660k();
    }

    /* renamed from: k */
    public boolean mo34660k() {
        return this.f35102a != null;
    }

    public String toString() {
        StringBuilder sb;
        T t;
        if (this == f35099d) {
            return "Result{Absent}";
        }
        if (this == f35100e) {
            return "Result{Failure}";
        }
        if (this.f35102a != null) {
            sb = new StringBuilder();
            sb.append("Result{Success; value=");
            t = this.f35102a;
        } else {
            sb = new StringBuilder();
            sb.append("Result{Failure; failure=");
            t = this.f35104c;
        }
        sb.append(t);
        sb.append("}");
        return sb.toString();
    }
}
