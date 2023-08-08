package com.urbanairship.reactive;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.reactive.b */
public class C9549b extends C9596k {

    /* renamed from: c */
    public final List<C9596k> f26142c = new ArrayList();

    /* renamed from: a */
    public synchronized void mo19457a() {
        Iterator it = new ArrayList(this.f26142c).iterator();
        while (it.hasNext()) {
            C9596k kVar = (C9596k) it.next();
            kVar.mo19457a();
            this.f26142c.remove(kVar);
        }
        super.mo19457a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo19458e(@androidx.annotation.C0359n0 com.urbanairship.reactive.C9596k r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r2.mo19508d()     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            boolean r0 = r1.mo19508d()     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0013
            r2.mo19457a()     // Catch:{ all -> 0x001a }
            goto L_0x0018
        L_0x0013:
            java.util.List<com.urbanairship.reactive.k> r0 = r1.f26142c     // Catch:{ all -> 0x001a }
            r0.add(r2)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.reactive.C9549b.mo19458e(com.urbanairship.reactive.k):void");
    }

    /* renamed from: f */
    public synchronized void mo19459f(@C0359n0 C9596k kVar) {
        if (!mo19508d()) {
            this.f26142c.remove(kVar);
        }
    }
}
