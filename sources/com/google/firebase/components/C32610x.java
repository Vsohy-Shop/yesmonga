package com.google.firebase.components;

import androidx.annotation.C0323b0;
import com.google.firebase.events.C33029a;
import com.google.firebase.events.C33030b;
import com.google.firebase.events.C33031c;
import com.google.firebase.events.C33032d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.x */
public class C32610x implements C33032d, C33031c {
    @C0323b0("this")

    /* renamed from: a */
    public final Map<Class<?>, ConcurrentHashMap<C33030b<Object>, Executor>> f79111a = new HashMap();
    @C0323b0("this")

    /* renamed from: b */
    public Queue<C33029a<?>> f79112b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f79113c;

    public C32610x(Executor executor) {
        this.f79113c = executor;
    }

    /* renamed from: a */
    public <T> void mo94755a(Class<T> cls, C33030b<? super T> bVar) {
        mo94756b(cls, this.f79113c, bVar);
    }

    /* renamed from: b */
    public synchronized <T> void mo94756b(Class<T> cls, Executor executor, C33030b<? super T> bVar) {
        C32576e0.m131619b(cls);
        C32576e0.m131619b(bVar);
        C32576e0.m131619b(executor);
        if (!this.f79111a.containsKey(cls)) {
            this.f79111a.put(cls, new ConcurrentHashMap());
        }
        this.f79111a.get(cls).put(bVar, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new com.google.firebase.components.C32609w(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = mo94759g(r5).iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94713c(com.google.firebase.events.C33029a<?> r5) {
        /*
            r4 = this;
            com.google.firebase.components.C32576e0.m131619b(r5)
            monitor-enter(r4)
            java.util.Queue<com.google.firebase.events.a<?>> r0 = r4.f79112b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.mo94759g(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.firebase.components.w r3 = new com.google.firebase.components.w
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C32610x.mo94713c(com.google.firebase.events.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> void mo94757d(java.lang.Class<T> r2, com.google.firebase.events.C33030b<? super T> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.firebase.components.C32576e0.m131619b(r2)     // Catch:{ all -> 0x0029 }
            com.google.firebase.components.C32576e0.m131619b(r3)     // Catch:{ all -> 0x0029 }
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f79111a     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r1)
            return
        L_0x0011:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f79111a     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0029 }
            r0.remove(r3)     // Catch:{ all -> 0x0029 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0027
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.events.b<java.lang.Object>, java.util.concurrent.Executor>> r3 = r1.f79111a     // Catch:{ all -> 0x0029 }
            r3.remove(r2)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C32610x.mo94757d(java.lang.Class, com.google.firebase.events.b):void");
    }

    /* renamed from: f */
    public void mo94758f() {
        Queue<C33029a<?>> queue;
        synchronized (this) {
            queue = this.f79112b;
            if (queue != null) {
                this.f79112b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C33029a<?> c : queue) {
                mo94713c(c);
            }
        }
    }

    /* renamed from: g */
    public final synchronized Set<Map.Entry<C33030b<Object>, Executor>> mo94759g(C33029a<?> aVar) {
        Set<Map.Entry<C33030b<Object>, Executor>> set;
        Map map = this.f79111a.get(aVar.mo95703b());
        if (map == null) {
            set = Collections.emptySet();
        } else {
            set = map.entrySet();
        }
        return set;
    }
}
