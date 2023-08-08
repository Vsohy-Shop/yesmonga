package com.android.volley;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.android.volley.C21751e;
import com.android.volley.Request;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.volley.t */
public class C21779t implements Request.C21711c {

    /* renamed from: a */
    public final Map<String, List<Request<?>>> f56338a;

    /* renamed from: b */
    public final C21774q f56339b;
    @C0363p0

    /* renamed from: c */
    public final C21764n f56340c;
    @C0363p0

    /* renamed from: d */
    public final C21753f f56341d;
    @C0363p0

    /* renamed from: e */
    public final BlockingQueue<Request<?>> f56342e;

    public C21779t(@C0359n0 C21764n nVar) {
        this.f56338a = new HashMap();
        this.f56340c = nVar;
        this.f56339b = nVar.mo64951i();
        this.f56341d = null;
        this.f56342e = null;
    }

    /* renamed from: a */
    public void mo64822a(Request<?> request, C21771p<?> pVar) {
        List<Request> remove;
        C21751e.C21752a aVar = pVar.f56325b;
        if (aVar == null || aVar.mo64916a()) {
            mo64823b(request);
            return;
        }
        String e0 = request.mo64799e0();
        synchronized (this) {
            remove = this.f56338a.remove(e0);
        }
        if (remove != null) {
            if (C21776s.f56329b) {
                C21776s.m100102f("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), e0);
            }
            for (Request a : remove) {
                this.f56339b.mo64929a(a, pVar);
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo64823b(Request<?> request) {
        BlockingQueue<Request<?>> blockingQueue;
        String e0 = request.mo64799e0();
        List remove = this.f56338a.remove(e0);
        if (remove != null && !remove.isEmpty()) {
            if (C21776s.f56329b) {
                C21776s.m100102f("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), e0);
            }
            Request request2 = (Request) remove.remove(0);
            this.f56338a.put(e0, remove);
            request2.mo64812q1(this);
            C21764n nVar = this.f56340c;
            if (nVar != null) {
                nVar.mo64847n(request2);
            } else if (!(this.f56341d == null || (blockingQueue = this.f56342e) == null)) {
                try {
                    blockingQueue.put(request2);
                } catch (InterruptedException e) {
                    C21776s.m100099c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.f56341d.mo64921e();
                }
            }
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo64965c(com.android.volley.Request<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.mo64799e0()     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r1 = r5.f56338a     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r1 = r5.f56338a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.mo64801g(r4)     // Catch:{ all -> 0x0052 }
            r1.add(r6)     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r6 = r5.f56338a     // Catch:{ all -> 0x0052 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.android.volley.C21776s.f56329b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0038
            java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.android.volley.C21776s.m100098b(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0038:
            monitor-exit(r5)
            return r2
        L_0x003a:
            java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r1 = r5.f56338a     // Catch:{ all -> 0x0052 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
            r6.mo64812q1(r5)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.android.volley.C21776s.f56329b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0050
            java.lang.String r6 = "new request, sending to network %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.android.volley.C21776s.m100098b(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r5)
            return r3
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.C21779t.mo64965c(com.android.volley.Request):boolean");
    }

    public C21779t(@C0359n0 C21753f fVar, @C0359n0 BlockingQueue<Request<?>> blockingQueue, C21774q qVar) {
        this.f56338a = new HashMap();
        this.f56340c = null;
        this.f56339b = qVar;
        this.f56341d = fVar;
        this.f56342e = blockingQueue;
    }
}
