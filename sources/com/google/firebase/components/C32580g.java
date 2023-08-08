package com.google.firebase.components;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.errorprone.annotations.C32488a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.g */
public final class C32580g<T> {

    /* renamed from: a */
    public final String f79050a;

    /* renamed from: b */
    public final Set<C32578f0<? super T>> f79051b;

    /* renamed from: c */
    public final Set<C32608v> f79052c;

    /* renamed from: d */
    public final int f79053d;

    /* renamed from: e */
    public final int f79054e;

    /* renamed from: f */
    public final C32592k<T> f79055f;

    /* renamed from: g */
    public final Set<Class<?>> f79056g;

    /* renamed from: A */
    public static /* synthetic */ Object m131625A(Object obj, C32584h hVar) {
        return obj;
    }

    @Deprecated
    /* renamed from: B */
    public static <T> C32580g<T> m131626B(Class<T> cls, T t) {
        return m131636h(cls).mo94697f(new C32577f(t)).mo94695d();
    }

    @SafeVarargs
    /* renamed from: C */
    public static <T> C32580g<T> m131627C(T t, C32578f0<T> f0Var, C32578f0<? super T>... f0VarArr) {
        return m131635g(f0Var, f0VarArr).mo94697f(new C32575e(t)).mo94695d();
    }

    @SafeVarargs
    /* renamed from: D */
    public static <T> C32580g<T> m131628D(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m131637i(cls, clsArr).mo94697f(new C32569b(t)).mo94695d();
    }

    /* renamed from: f */
    public static <T> C32582b<T> m131634f(C32578f0<T> f0Var) {
        return new C32582b<>((C32578f0) f0Var, new C32578f0[0]);
    }

    @SafeVarargs
    /* renamed from: g */
    public static <T> C32582b<T> m131635g(C32578f0<T> f0Var, C32578f0<? super T>... f0VarArr) {
        return new C32582b<>((C32578f0) f0Var, (C32578f0[]) f0VarArr);
    }

    /* renamed from: h */
    public static <T> C32582b<T> m131636h(Class<T> cls) {
        return new C32582b<>((Class) cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: i */
    public static <T> C32582b<T> m131637i(Class<T> cls, Class<? super T>... clsArr) {
        return new C32582b<>((Class) cls, (Class[]) clsArr);
    }

    /* renamed from: o */
    public static <T> C32580g<T> m131638o(T t, C32578f0<T> f0Var) {
        return m131640q(f0Var).mo94697f(new C32573d(t)).mo94695d();
    }

    /* renamed from: p */
    public static <T> C32580g<T> m131639p(T t, Class<T> cls) {
        return m131641r(cls).mo94697f(new C32571c(t)).mo94695d();
    }

    /* renamed from: q */
    public static <T> C32582b<T> m131640q(C32578f0<T> f0Var) {
        return m131634f(f0Var).mo94698g();
    }

    /* renamed from: r */
    public static <T> C32582b<T> m131641r(Class<T> cls) {
        return m131636h(cls).mo94698g();
    }

    /* renamed from: w */
    public static /* synthetic */ Object m131642w(Object obj, C32584h hVar) {
        return obj;
    }

    /* renamed from: x */
    public static /* synthetic */ Object m131643x(Object obj, C32584h hVar) {
        return obj;
    }

    /* renamed from: y */
    public static /* synthetic */ Object m131644y(Object obj, C32584h hVar) {
        return obj;
    }

    /* renamed from: z */
    public static /* synthetic */ Object m131645z(Object obj, C32584h hVar) {
        return obj;
    }

    /* renamed from: E */
    public C32580g<T> mo94682E(C32592k<T> kVar) {
        return new C32580g(this.f79050a, this.f79051b, this.f79052c, this.f79053d, this.f79054e, kVar, this.f79056g);
    }

    /* renamed from: j */
    public Set<C32608v> mo94683j() {
        return this.f79052c;
    }

    /* renamed from: k */
    public C32592k<T> mo94684k() {
        return this.f79055f;
    }

    @C0363p0
    /* renamed from: l */
    public String mo94685l() {
        return this.f79050a;
    }

    /* renamed from: m */
    public Set<C32578f0<? super T>> mo94686m() {
        return this.f79051b;
    }

    /* renamed from: n */
    public Set<Class<?>> mo94687n() {
        return this.f79056g;
    }

    /* renamed from: s */
    public boolean mo94688s() {
        return this.f79053d == 1;
    }

    /* renamed from: t */
    public boolean mo94689t() {
        return this.f79053d == 2;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f79051b.toArray()) + ">{" + this.f79053d + ", type=" + this.f79054e + ", deps=" + Arrays.toString(this.f79052c.toArray()) + "}";
    }

    /* renamed from: u */
    public boolean mo94691u() {
        return this.f79053d == 0;
    }

    /* renamed from: v */
    public boolean mo94692v() {
        return this.f79054e == 0;
    }

    /* renamed from: com.google.firebase.components.g$b */
    public static class C32582b<T> {

        /* renamed from: a */
        public String f79057a;

        /* renamed from: b */
        public final Set<C32578f0<? super T>> f79058b;

        /* renamed from: c */
        public final Set<C32608v> f79059c;

        /* renamed from: d */
        public int f79060d;

        /* renamed from: e */
        public int f79061e;

        /* renamed from: f */
        public C32592k<T> f79062f;

        /* renamed from: g */
        public final Set<Class<?>> f79063g;

        @C32488a
        /* renamed from: b */
        public C32582b<T> mo94693b(C32608v vVar) {
            C32576e0.m131620c(vVar, "Null dependency");
            mo94702k(vVar.mo94746d());
            this.f79059c.add(vVar);
            return this;
        }

        @C32488a
        /* renamed from: c */
        public C32582b<T> mo94694c() {
            return mo94701j(1);
        }

        /* renamed from: d */
        public C32580g<T> mo94695d() {
            boolean z;
            if (this.f79062f != null) {
                z = true;
            } else {
                z = false;
            }
            C32576e0.m131621d(z, "Missing required property: factory.");
            return new C32580g(this.f79057a, new HashSet(this.f79058b), new HashSet(this.f79059c), this.f79060d, this.f79061e, this.f79062f, this.f79063g);
        }

        @C32488a
        /* renamed from: e */
        public C32582b<T> mo94696e() {
            return mo94701j(2);
        }

        @C32488a
        /* renamed from: f */
        public C32582b<T> mo94697f(C32592k<T> kVar) {
            this.f79062f = (C32592k) C32576e0.m131620c(kVar, "Null factory");
            return this;
        }

        @C32488a
        /* renamed from: g */
        public final C32582b<T> mo94698g() {
            this.f79061e = 1;
            return this;
        }

        /* renamed from: h */
        public C32582b<T> mo94699h(@C0359n0 String str) {
            this.f79057a = str;
            return this;
        }

        @C32488a
        /* renamed from: i */
        public C32582b<T> mo94700i(Class<?> cls) {
            this.f79063g.add(cls);
            return this;
        }

        @C32488a
        /* renamed from: j */
        public final C32582b<T> mo94701j(int i) {
            boolean z;
            if (this.f79060d == 0) {
                z = true;
            } else {
                z = false;
            }
            C32576e0.m131621d(z, "Instantiation type has already been set.");
            this.f79060d = i;
            return this;
        }

        /* renamed from: k */
        public final void mo94702k(C32578f0<?> f0Var) {
            C32576e0.m131618a(!this.f79058b.contains(f0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @SafeVarargs
        public C32582b(Class<T> cls, Class<? super T>... clsArr) {
            this.f79057a = null;
            HashSet hashSet = new HashSet();
            this.f79058b = hashSet;
            this.f79059c = new HashSet();
            this.f79060d = 0;
            this.f79061e = 0;
            this.f79063g = new HashSet();
            C32576e0.m131620c(cls, "Null interface");
            hashSet.add(C32578f0.m131624b(cls));
            for (Class<? super T> cls2 : clsArr) {
                C32576e0.m131620c(cls2, "Null interface");
                this.f79058b.add(C32578f0.m131624b(cls2));
            }
        }

        @SafeVarargs
        public C32582b(C32578f0<T> f0Var, C32578f0<? super T>... f0VarArr) {
            this.f79057a = null;
            HashSet hashSet = new HashSet();
            this.f79058b = hashSet;
            this.f79059c = new HashSet();
            this.f79060d = 0;
            this.f79061e = 0;
            this.f79063g = new HashSet();
            C32576e0.m131620c(f0Var, "Null interface");
            hashSet.add(f0Var);
            for (C32578f0<? super T> c : f0VarArr) {
                C32576e0.m131620c(c, "Null interface");
            }
            Collections.addAll(this.f79058b, f0VarArr);
        }
    }

    public C32580g(@C0363p0 String str, Set<C32578f0<? super T>> set, Set<C32608v> set2, int i, int i2, C32592k<T> kVar, Set<Class<?>> set3) {
        this.f79050a = str;
        this.f79051b = Collections.unmodifiableSet(set);
        this.f79052c = Collections.unmodifiableSet(set2);
        this.f79053d = i;
        this.f79054e = i2;
        this.f79055f = kVar;
        this.f79056g = Collections.unmodifiableSet(set3);
    }
}
