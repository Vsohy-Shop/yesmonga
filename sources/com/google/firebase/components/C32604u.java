package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.components.u */
public class C32604u {

    /* renamed from: com.google.firebase.components.u$b */
    public static class C32606b {

        /* renamed from: a */
        public final C32580g<?> f79101a;

        /* renamed from: b */
        public final Set<C32606b> f79102b = new HashSet();

        /* renamed from: c */
        public final Set<C32606b> f79103c = new HashSet();

        public C32606b(C32580g<?> gVar) {
            this.f79101a = gVar;
        }

        /* renamed from: a */
        public void mo94737a(C32606b bVar) {
            this.f79102b.add(bVar);
        }

        /* renamed from: b */
        public void mo94738b(C32606b bVar) {
            this.f79103c.add(bVar);
        }

        /* renamed from: c */
        public C32580g<?> mo94739c() {
            return this.f79101a;
        }

        /* renamed from: d */
        public Set<C32606b> mo94740d() {
            return this.f79102b;
        }

        /* renamed from: e */
        public boolean mo94741e() {
            return this.f79102b.isEmpty();
        }

        /* renamed from: f */
        public boolean mo94742f() {
            return this.f79103c.isEmpty();
        }

        /* renamed from: g */
        public void mo94743g(C32606b bVar) {
            this.f79103c.remove(bVar);
        }
    }

    /* renamed from: com.google.firebase.components.u$c */
    public static class C32607c {

        /* renamed from: a */
        public final C32578f0<?> f79104a;

        /* renamed from: b */
        public final boolean f79105b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C32607c)) {
                return false;
            }
            C32607c cVar = (C32607c) obj;
            if (!cVar.f79104a.equals(this.f79104a) || cVar.f79105b != this.f79105b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f79104a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f79105b).hashCode();
        }

        public C32607c(C32578f0<?> f0Var, boolean z) {
            this.f79104a = f0Var;
            this.f79105b = z;
        }
    }

    /* renamed from: a */
    public static void m131729a(List<C32580g<?>> list) {
        Set<C32606b> c = m131731c(list);
        Set<C32606b> b = m131730b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C32606b next = b.iterator().next();
            b.remove(next);
            i++;
            for (C32606b next2 : next.mo94740d()) {
                next2.mo94743g(next);
                if (next2.mo94742f()) {
                    b.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C32606b next3 : c) {
                if (!next3.mo94742f() && !next3.mo94741e()) {
                    arrayList.add(next3.mo94739c());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    /* renamed from: b */
    public static Set<C32606b> m131730b(Set<C32606b> set) {
        HashSet hashSet = new HashSet();
        for (C32606b next : set) {
            if (next.mo94742f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public static Set<C32606b> m131731c(List<C32580g<?>> list) {
        Set<C32606b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C32580g next : list) {
            C32606b bVar = new C32606b(next);
            Iterator it = next.mo94686m().iterator();
            while (true) {
                if (it.hasNext()) {
                    C32578f0 f0Var = (C32578f0) it.next();
                    C32607c cVar = new C32607c(f0Var, !next.mo94692v());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f79105b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{f0Var}));
                    }
                }
            }
        }
        for (Set<C32606b> it2 : hashMap.values()) {
            for (C32606b bVar2 : it2) {
                for (C32608v next2 : bVar2.mo94739c().mo94683j()) {
                    if (next2.mo94749f() && (set = (Set) hashMap.get(new C32607c(next2.mo94746d(), next2.mo94751h()))) != null) {
                        for (C32606b bVar3 : set) {
                            bVar2.mo94737a(bVar3);
                            bVar3.mo94738b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
