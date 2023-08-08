package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.e1 */
public final class C32046e1<T> implements C32052g1, C32040c1 {

    /* renamed from: c */
    public static final Object f78254c = new Object();

    /* renamed from: a */
    public volatile C32052g1<T> f78255a;

    /* renamed from: b */
    public volatile Object f78256b = f78254c;

    public C32046e1(C32052g1<T> g1Var) {
        this.f78255a = g1Var;
    }

    /* renamed from: b */
    public static <P extends C32052g1<T>, T> C32052g1<T> m129795b(P p) {
        C32063k0.m129857j(p);
        return p instanceof C32046e1 ? p : new C32046e1(p);
    }

    /* renamed from: c */
    public static <P extends C32052g1<T>, T> C32040c1<T> m129796c(P p) {
        if (p instanceof C32040c1) {
            return (C32040c1) p;
        }
        C32063k0.m129857j(p);
        return new C32046e1(p);
    }

    /* renamed from: a */
    public final T mo92416a() {
        T t = this.f78256b;
        T t2 = f78254c;
        if (t == t2) {
            synchronized (this) {
                t = this.f78256b;
                if (t == t2) {
                    t = this.f78255a.mo92416a();
                    T t3 = this.f78256b;
                    if (t3 != t2 && !(t3 instanceof C32049f1)) {
                        if (t3 != t) {
                            String valueOf = String.valueOf(t3);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f78256b = t;
                    this.f78255a = null;
                }
            }
        }
        return t;
    }
}
