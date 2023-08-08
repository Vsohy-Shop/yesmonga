package com.google.firebase.components;

import androidx.annotation.C0344h1;
import androidx.annotation.RestrictTo;
import androidx.camera.view.C1814q;
import com.google.errorprone.annotations.C32488a;
import com.google.firebase.dynamicloading.C32991a;
import com.google.firebase.events.C33031c;
import com.google.firebase.events.C33032d;
import com.google.firebase.inject.C33056a;
import com.google.firebase.inject.C33058b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.components.s */
public class C32600s implements C32584h, C32991a {

    /* renamed from: h */
    public static final C33058b<Set<Object>> f79088h = new C32599r();

    /* renamed from: a */
    public final Map<C32580g<?>, C33058b<?>> f79089a;

    /* renamed from: b */
    public final Map<C32578f0<?>, C33058b<?>> f79090b;

    /* renamed from: c */
    public final Map<C32578f0<?>, C32612z<?>> f79091c;

    /* renamed from: d */
    public final List<C33058b<ComponentRegistrar>> f79092d;

    /* renamed from: e */
    public final C32610x f79093e;

    /* renamed from: f */
    public final AtomicReference<Boolean> f79094f;

    /* renamed from: g */
    public final C32594m f79095g;

    /* renamed from: com.google.firebase.components.s$b */
    public static final class C32602b {

        /* renamed from: a */
        public final Executor f79096a;

        /* renamed from: b */
        public final List<C33058b<ComponentRegistrar>> f79097b = new ArrayList();

        /* renamed from: c */
        public final List<C32580g<?>> f79098c = new ArrayList();

        /* renamed from: d */
        public C32594m f79099d = C32594m.f79080a;

        public C32602b(Executor executor) {
            this.f79096a = executor;
        }

        /* renamed from: f */
        public static /* synthetic */ ComponentRegistrar m131723f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        @C32488a
        /* renamed from: b */
        public C32602b mo94732b(C32580g<?> gVar) {
            this.f79098c.add(gVar);
            return this;
        }

        @C32488a
        /* renamed from: c */
        public C32602b mo94733c(ComponentRegistrar componentRegistrar) {
            this.f79097b.add(new C32603t(componentRegistrar));
            return this;
        }

        @C32488a
        /* renamed from: d */
        public C32602b mo94734d(Collection<C33058b<ComponentRegistrar>> collection) {
            this.f79097b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C32600s mo94735e() {
            return new C32600s(this.f79096a, this.f79097b, this.f79098c, this.f79099d);
        }

        @C32488a
        /* renamed from: g */
        public C32602b mo94736g(C32594m mVar) {
            this.f79099d = mVar;
            return this;
        }
    }

    /* renamed from: D */
    public static Iterable<C33058b<ComponentRegistrar>> m131698D(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (ComponentRegistrar qVar : iterable) {
            arrayList.add(new C32598q(qVar));
        }
        return arrayList;
    }

    /* renamed from: o */
    public static C32602b m131703o(Executor executor) {
        return new C32602b(executor);
    }

    /* renamed from: u */
    public static <T> List<T> m131704u(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ Object m131705v(C32580g gVar) {
        return gVar.mo94684k().mo94629a(new C32585h0(gVar, this));
    }

    /* renamed from: y */
    public static /* synthetic */ ComponentRegistrar m131708y(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    /* renamed from: A */
    public final void mo94722A() {
        for (C32580g next : this.f79089a.keySet()) {
            Iterator<C32608v> it = next.mo94683j().iterator();
            while (true) {
                if (it.hasNext()) {
                    C32608v next2 = it.next();
                    if (next2.mo94751h() && !this.f79091c.containsKey(next2.mo94746d())) {
                        this.f79091c.put(next2.mo94746d(), C32612z.m131768b(Collections.emptySet()));
                    } else if (this.f79090b.containsKey(next2.mo94746d())) {
                        continue;
                    } else if (next2.mo94750g()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.mo94746d()}));
                    } else if (!next2.mo94751h()) {
                        this.f79090b.put(next2.mo94746d(), C32574d0.m131610e());
                    }
                }
            }
        }
    }

    /* renamed from: B */
    public final List<Runnable> mo94723B(List<C32580g<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C32580g next : list) {
            if (next.mo94692v()) {
                C33058b bVar = this.f79089a.get(next);
                for (C32578f0 f0Var : next.mo94686m()) {
                    if (!this.f79090b.containsKey(f0Var)) {
                        this.f79090b.put(f0Var, bVar);
                    } else {
                        arrayList.add(new C32595n((C32574d0) this.f79090b.get(f0Var), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: C */
    public final List<Runnable> mo94724C() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f79089a.entrySet()) {
            C32580g gVar = (C32580g) next.getKey();
            if (!gVar.mo94692v()) {
                C33058b bVar = (C33058b) next.getValue();
                for (C32578f0 f0Var : gVar.mo94686m()) {
                    if (!hashMap.containsKey(f0Var)) {
                        hashMap.put(f0Var, new HashSet());
                    }
                    ((Set) hashMap.get(f0Var)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f79091c.containsKey(entry.getKey())) {
                this.f79091c.put((C32578f0) entry.getKey(), C32612z.m131768b((Collection) entry.getValue()));
            } else {
                C32612z zVar = this.f79091c.get(entry.getKey());
                for (C33058b pVar : (Set) entry.getValue()) {
                    arrayList.add(new C32597p(zVar, pVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <T> C33058b<T> mo94703a(C32578f0<T> f0Var) {
        C32576e0.m131620c(f0Var, "Null interface requested.");
        return this.f79090b.get(f0Var);
    }

    /* renamed from: b */
    public void mo94725b() {
        synchronized (this) {
            if (!this.f79092d.isEmpty()) {
                mo94726p(new ArrayList());
            }
        }
    }

    /* renamed from: e */
    public synchronized <T> C33058b<Set<T>> mo94706e(C32578f0<T> f0Var) {
        C32612z zVar = this.f79091c.get(f0Var);
        if (zVar != null) {
            return zVar;
        }
        return f79088h;
    }

    /* renamed from: i */
    public <T> C33056a<T> mo94711i(C32578f0<T> f0Var) {
        C33058b<T> a = mo94703a(f0Var);
        if (a == null) {
            return C32574d0.m131610e();
        }
        if (a instanceof C32574d0) {
            return (C32574d0) a;
        }
        return C32574d0.m131614i(a);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.remove();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94726p(java.util.List<com.google.firebase.components.C32580g<?>> r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r5)
            java.util.List<com.google.firebase.inject.b<com.google.firebase.components.ComponentRegistrar>> r1 = r5.f79092d     // Catch:{ all -> 0x0098 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0098 }
        L_0x000c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0098 }
            com.google.firebase.inject.b r2 = (com.google.firebase.inject.C33058b) r2     // Catch:{ all -> 0x0098 }
            java.lang.Object r2 = r2.get()     // Catch:{ InvalidRegistrarException -> 0x002d }
            com.google.firebase.components.ComponentRegistrar r2 = (com.google.firebase.components.ComponentRegistrar) r2     // Catch:{ InvalidRegistrarException -> 0x002d }
            if (r2 == 0) goto L_0x000c
            com.google.firebase.components.m r3 = r5.f79095g     // Catch:{ InvalidRegistrarException -> 0x002d }
            java.util.List r2 = r3.mo94719a(r2)     // Catch:{ InvalidRegistrarException -> 0x002d }
            r6.addAll(r2)     // Catch:{ InvalidRegistrarException -> 0x002d }
            r1.remove()     // Catch:{ InvalidRegistrarException -> 0x002d }
            goto L_0x000c
        L_0x002d:
            r1.remove()     // Catch:{ all -> 0x0098 }
            goto L_0x000c
        L_0x0031:
            java.util.Map<com.google.firebase.components.g<?>, com.google.firebase.inject.b<?>> r1 = r5.f79089a     // Catch:{ all -> 0x0098 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x003d
            com.google.firebase.components.C32604u.m131729a(r6)     // Catch:{ all -> 0x0098 }
            goto L_0x004e
        L_0x003d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0098 }
            java.util.Map<com.google.firebase.components.g<?>, com.google.firebase.inject.b<?>> r2 = r5.f79089a     // Catch:{ all -> 0x0098 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0098 }
            r1.<init>(r2)     // Catch:{ all -> 0x0098 }
            r1.addAll(r6)     // Catch:{ all -> 0x0098 }
            com.google.firebase.components.C32604u.m131729a(r1)     // Catch:{ all -> 0x0098 }
        L_0x004e:
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0098 }
        L_0x0052:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x006e
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0098 }
            com.google.firebase.components.g r2 = (com.google.firebase.components.C32580g) r2     // Catch:{ all -> 0x0098 }
            com.google.firebase.components.y r3 = new com.google.firebase.components.y     // Catch:{ all -> 0x0098 }
            com.google.firebase.components.o r4 = new com.google.firebase.components.o     // Catch:{ all -> 0x0098 }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0098 }
            r3.<init>(r4)     // Catch:{ all -> 0x0098 }
            java.util.Map<com.google.firebase.components.g<?>, com.google.firebase.inject.b<?>> r4 = r5.f79089a     // Catch:{ all -> 0x0098 }
            r4.put(r2, r3)     // Catch:{ all -> 0x0098 }
            goto L_0x0052
        L_0x006e:
            java.util.List r6 = r5.mo94723B(r6)     // Catch:{ all -> 0x0098 }
            r0.addAll(r6)     // Catch:{ all -> 0x0098 }
            java.util.List r6 = r5.mo94724C()     // Catch:{ all -> 0x0098 }
            r0.addAll(r6)     // Catch:{ all -> 0x0098 }
            r5.mo94722A()     // Catch:{ all -> 0x0098 }
            monitor-exit(r5)     // Catch:{ all -> 0x0098 }
            java.util.Iterator r6 = r0.iterator()
        L_0x0084:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r6.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x0084
        L_0x0094:
            r5.mo94731z()
            return
        L_0x0098:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0098 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C32600s.mo94726p(java.util.List):void");
    }

    /* renamed from: q */
    public final void mo94727q(Map<C32580g<?>, C33058b<?>> map, boolean z) {
        for (Map.Entry next : map.entrySet()) {
            C32580g gVar = (C32580g) next.getKey();
            C33058b bVar = (C33058b) next.getValue();
            if (gVar.mo94688s() || (gVar.mo94689t() && z)) {
                bVar.get();
            }
        }
        this.f79093e.mo94758f();
    }

    @C0344h1
    /* renamed from: r */
    public Collection<C32580g<?>> mo94728r() {
        return this.f79089a.keySet();
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: s */
    public void mo94729s() {
        for (C33058b<?> bVar : this.f79089a.values()) {
            bVar.get();
        }
    }

    /* renamed from: t */
    public void mo94730t(boolean z) {
        HashMap hashMap;
        if (C1814q.m7242a(this.f79094f, (Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f79089a);
            }
            mo94727q(hashMap, z);
        }
    }

    /* renamed from: z */
    public final void mo94731z() {
        Boolean bool = this.f79094f.get();
        if (bool != null) {
            mo94727q(this.f79089a, bool.booleanValue());
        }
    }

    @Deprecated
    public C32600s(Executor executor, Iterable<ComponentRegistrar> iterable, C32580g<?>... gVarArr) {
        this(executor, m131698D(iterable), Arrays.asList(gVarArr), C32594m.f79080a);
    }

    public C32600s(Executor executor, Iterable<C33058b<ComponentRegistrar>> iterable, Collection<C32580g<?>> collection, C32594m mVar) {
        this.f79089a = new HashMap();
        this.f79090b = new HashMap();
        this.f79091c = new HashMap();
        this.f79094f = new AtomicReference<>();
        C32610x xVar = new C32610x(executor);
        this.f79093e = xVar;
        this.f79095g = mVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C32580g.m131628D(xVar, C32610x.class, C33032d.class, C33031c.class));
        arrayList.add(C32580g.m131628D(this, C32991a.class, new Class[0]));
        for (C32580g next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f79092d = m131704u(iterable);
        mo94726p(arrayList);
    }
}
