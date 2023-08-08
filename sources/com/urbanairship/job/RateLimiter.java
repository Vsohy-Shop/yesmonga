package com.urbanairship.job;

import androidx.annotation.C0337f0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.util.C9656j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RateLimiter {

    /* renamed from: a */
    public final C9656j f25354a;

    /* renamed from: b */
    public final Map<String, List<Long>> f25355b;

    /* renamed from: c */
    public final Map<String, C9296a> f25356c;

    /* renamed from: d */
    public final Object f25357d;

    public enum LimitStatus {
        OVER,
        UNDER
    }

    /* renamed from: com.urbanairship.job.RateLimiter$a */
    public static final class C9296a {

        /* renamed from: a */
        public final long f25361a;

        /* renamed from: b */
        public final int f25362b;

        public C9296a(int i, long j) {
            this.f25362b = i;
            this.f25361a = j;
        }
    }

    /* renamed from: com.urbanairship.job.RateLimiter$b */
    public static final class C9297b {

        /* renamed from: a */
        public final LimitStatus f25363a;

        /* renamed from: b */
        public final long f25364b;

        @C0344h1
        public C9297b(@C0359n0 LimitStatus limitStatus, long j) {
            this.f25363a = limitStatus;
            this.f25364b = j;
        }

        /* renamed from: a */
        public LimitStatus mo18701a() {
            return this.f25363a;
        }

        /* renamed from: b */
        public long mo18702b(@C0359n0 TimeUnit timeUnit) {
            return timeUnit.convert(this.f25364b, TimeUnit.MILLISECONDS);
        }
    }

    public RateLimiter() {
        this(C9656j.f26468a);
    }

    /* renamed from: a */
    public final void mo18697a(@C0359n0 List<Long> list, @C0359n0 C9296a aVar, long j) {
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (j >= aVar.f25361a + longValue) {
                list.remove(Long.valueOf(longValue));
            }
        }
    }

    /* renamed from: b */
    public void mo18698b(@C0359n0 String str, @C0337f0(from = 1) int i, long j, @C0359n0 TimeUnit timeUnit) {
        synchronized (this.f25357d) {
            this.f25356c.put(str, new C9296a(i, timeUnit.toMillis(j)));
            this.f25355b.put(str, new ArrayList());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        return null;
     */
    @androidx.annotation.C0363p0
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.urbanairship.job.RateLimiter.C9297b mo18699c(@androidx.annotation.C0359n0 java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f25357d
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.List<java.lang.Long>> r1 = r8.f25355b     // Catch:{ all -> 0x0055 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0055 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0055 }
            java.util.Map<java.lang.String, com.urbanairship.job.RateLimiter$a> r2 = r8.f25356c     // Catch:{ all -> 0x0055 }
            java.lang.Object r9 = r2.get(r9)     // Catch:{ all -> 0x0055 }
            com.urbanairship.job.RateLimiter$a r9 = (com.urbanairship.job.RateLimiter.C9296a) r9     // Catch:{ all -> 0x0055 }
            com.urbanairship.util.j r2 = r8.f25354a     // Catch:{ all -> 0x0055 }
            long r2 = r2.mo19623a()     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0052
            if (r9 != 0) goto L_0x001e
            goto L_0x0052
        L_0x001e:
            r8.mo18697a(r1, r9, r2)     // Catch:{ all -> 0x0055 }
            int r4 = r1.size()     // Catch:{ all -> 0x0055 }
            int r5 = r9.f25362b     // Catch:{ all -> 0x0055 }
            if (r4 < r5) goto L_0x0047
            long r4 = r9.f25361a     // Catch:{ all -> 0x0055 }
            int r6 = r1.size()     // Catch:{ all -> 0x0055 }
            int r9 = r9.f25362b     // Catch:{ all -> 0x0055 }
            int r6 = r6 - r9
            java.lang.Object r9 = r1.get(r6)     // Catch:{ all -> 0x0055 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0055 }
            long r6 = r9.longValue()     // Catch:{ all -> 0x0055 }
            long r2 = r2 - r6
            long r4 = r4 - r2
            com.urbanairship.job.RateLimiter$b r9 = new com.urbanairship.job.RateLimiter$b     // Catch:{ all -> 0x0055 }
            com.urbanairship.job.RateLimiter$LimitStatus r1 = com.urbanairship.job.RateLimiter.LimitStatus.OVER     // Catch:{ all -> 0x0055 }
            r9.<init>(r1, r4)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r9
        L_0x0047:
            com.urbanairship.job.RateLimiter$b r9 = new com.urbanairship.job.RateLimiter$b     // Catch:{ all -> 0x0055 }
            com.urbanairship.job.RateLimiter$LimitStatus r1 = com.urbanairship.job.RateLimiter.LimitStatus.UNDER     // Catch:{ all -> 0x0055 }
            r2 = 0
            r9.<init>(r1, r2)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return r9
        L_0x0052:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            r9 = 0
            return r9
        L_0x0055:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.job.RateLimiter.mo18699c(java.lang.String):com.urbanairship.job.RateLimiter$b");
    }

    /* renamed from: d */
    public void mo18700d(@C0359n0 String str) {
        synchronized (this.f25357d) {
            List list = this.f25355b.get(str);
            C9296a aVar = this.f25356c.get(str);
            long a = this.f25354a.mo19623a();
            if (!(list == null || aVar == null)) {
                list.add(Long.valueOf(a));
                mo18697a(list, aVar, a);
            }
        }
    }

    @C0344h1
    public RateLimiter(C9656j jVar) {
        this.f25355b = new HashMap();
        this.f25356c = new HashMap();
        this.f25357d = new Object();
        this.f25354a = jVar;
    }
}
