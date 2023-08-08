package com.google.firebase.components;

import com.google.firebase.events.C33029a;
import com.google.firebase.events.C33031c;
import com.google.firebase.inject.C33056a;
import com.google.firebase.inject.C33058b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.h0 */
public final class C32585h0 implements C32584h {

    /* renamed from: a */
    public final Set<C32578f0<?>> f79064a;

    /* renamed from: b */
    public final Set<C32578f0<?>> f79065b;

    /* renamed from: c */
    public final Set<C32578f0<?>> f79066c;

    /* renamed from: d */
    public final Set<C32578f0<?>> f79067d;

    /* renamed from: e */
    public final Set<C32578f0<?>> f79068e;

    /* renamed from: f */
    public final Set<Class<?>> f79069f;

    /* renamed from: g */
    public final C32584h f79070g;

    /* renamed from: com.google.firebase.components.h0$a */
    public static class C32586a implements C33031c {

        /* renamed from: a */
        public final Set<Class<?>> f79071a;

        /* renamed from: b */
        public final C33031c f79072b;

        public C32586a(Set<Class<?>> set, C33031c cVar) {
            this.f79071a = set;
            this.f79072b = cVar;
        }

        /* renamed from: c */
        public void mo94713c(C33029a<?> aVar) {
            if (this.f79071a.contains(aVar.mo95703b())) {
                this.f79072b.mo94713c(aVar);
            } else {
                throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", new Object[]{aVar}));
            }
        }
    }

    public C32585h0(C32580g<?> gVar, C32584h hVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C32608v next : gVar.mo94683j()) {
            if (next.mo94749f()) {
                if (next.mo94751h()) {
                    hashSet4.add(next.mo94746d());
                } else {
                    hashSet.add(next.mo94746d());
                }
            } else if (next.mo94747e()) {
                hashSet3.add(next.mo94746d());
            } else if (next.mo94751h()) {
                hashSet5.add(next.mo94746d());
            } else {
                hashSet2.add(next.mo94746d());
            }
        }
        if (!gVar.mo94687n().isEmpty()) {
            hashSet.add(C32578f0.m131624b(C33031c.class));
        }
        this.f79064a = Collections.unmodifiableSet(hashSet);
        this.f79065b = Collections.unmodifiableSet(hashSet2);
        this.f79066c = Collections.unmodifiableSet(hashSet3);
        this.f79067d = Collections.unmodifiableSet(hashSet4);
        this.f79068e = Collections.unmodifiableSet(hashSet5);
        this.f79069f = gVar.mo94687n();
        this.f79070g = hVar;
    }

    /* renamed from: a */
    public <T> C33058b<T> mo94703a(C32578f0<T> f0Var) {
        if (this.f79065b.contains(f0Var)) {
            return this.f79070g.mo94703a(f0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{f0Var}));
    }

    /* renamed from: c */
    public <T> C33058b<Set<T>> mo94704c(Class<T> cls) {
        return mo94706e(C32578f0.m131624b(cls));
    }

    /* renamed from: d */
    public <T> Set<T> mo94705d(C32578f0<T> f0Var) {
        if (this.f79067d.contains(f0Var)) {
            return this.f79070g.mo94705d(f0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{f0Var}));
    }

    /* renamed from: e */
    public <T> C33058b<Set<T>> mo94706e(C32578f0<T> f0Var) {
        if (this.f79068e.contains(f0Var)) {
            return this.f79070g.mo94706e(f0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{f0Var}));
    }

    /* renamed from: f */
    public <T> T mo94707f(C32578f0<T> f0Var) {
        if (this.f79064a.contains(f0Var)) {
            return this.f79070g.mo94707f(f0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{f0Var}));
    }

    public <T> T get(Class<T> cls) {
        if (this.f79064a.contains(C32578f0.m131624b(cls))) {
            T t = this.f79070g.get(cls);
            if (!cls.equals(C33031c.class)) {
                return t;
            }
            return new C32586a(this.f79069f, (C33031c) t);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: h */
    public <T> C33058b<T> mo94710h(Class<T> cls) {
        return mo94703a(C32578f0.m131624b(cls));
    }

    /* renamed from: i */
    public <T> C33056a<T> mo94711i(C32578f0<T> f0Var) {
        if (this.f79066c.contains(f0Var)) {
            return this.f79070g.mo94711i(f0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{f0Var}));
    }

    /* renamed from: j */
    public <T> C33056a<T> mo94712j(Class<T> cls) {
        return mo94711i(C32578f0.m131624b(cls));
    }
}
