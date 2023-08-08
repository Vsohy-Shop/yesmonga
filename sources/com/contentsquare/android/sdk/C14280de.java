package com.contentsquare.android.sdk;

import java.util.WeakHashMap;

/* renamed from: com.contentsquare.android.sdk.de */
public class C14280de<T> implements C14533md<T>, C14325f5 {

    /* renamed from: a */
    public final WeakHashMap<C14325f5, Object> f35249a = new WeakHashMap<>();

    /* renamed from: b */
    public final WeakHashMap<C14441j4<T>, Object> f35250b = new WeakHashMap<>();

    /* renamed from: c */
    public T f35251c;

    public C14280de(T t) {
        this.f35251c = t;
    }

    /* renamed from: a */
    public void mo34402a() {
        for (C14325f5 next : this.f35249a.keySet()) {
            if (next != null) {
                next.mo34402a();
            }
        }
    }

    /* renamed from: b */
    public void mo34827b(T t) {
        for (C14441j4<T> d : this.f35250b.keySet()) {
            if (!d.mo34476d(t)) {
                return;
            }
        }
        this.f35251c = t;
        mo34402a();
    }

    /* renamed from: c */
    public void mo34978c(C14325f5 f5Var) {
        this.f35249a.remove(f5Var);
    }

    /* renamed from: d */
    public void mo34979d(C14325f5 f5Var) {
        this.f35249a.put(f5Var, (Object) null);
    }

    /* renamed from: e */
    public C14280de<T> mo34980e(C14441j4<T> j4Var) {
        this.f35250b.put(j4Var, (Object) null);
        return this;
    }

    /* renamed from: c */
    public T mo34977c() {
        return this.f35251c;
    }
}
