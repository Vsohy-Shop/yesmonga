package com.urbanairship.analytics.data;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.C36071u;
import com.urbanairship.analytics.C35518b;
import com.urbanairship.analytics.C35554i;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36035g;
import com.urbanairship.config.C9061a;
import com.urbanairship.job.C9302e;
import com.urbanairship.job.C9304f;
import com.urbanairship.json.JsonException;
import java.util.concurrent.TimeUnit;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.analytics.data.f */
public class C35545f {
    @C0359n0

    /* renamed from: j */
    public static final String f87686j = "ACTION_SEND";

    /* renamed from: k */
    public static final String f87687k = "com.urbanairship.analytics.MAX_TOTAL_DB_SIZE";

    /* renamed from: l */
    public static final String f87688l = "com.urbanairship.analytics.MAX_BATCH_SIZE";

    /* renamed from: m */
    public static final String f87689m = "com.urbanairship.analytics.LAST_SEND";

    /* renamed from: n */
    public static final String f87690n = "com.urbanairship.analytics.SCHEDULED_SEND_TIME";

    /* renamed from: o */
    public static final String f87691o = "com.urbanairship.analytics.MIN_BATCH_INTERVAL";

    /* renamed from: p */
    public static final int f87692p = 500;

    /* renamed from: q */
    public static final long f87693q = 30000;

    /* renamed from: r */
    public static final long f87694r = 0;

    /* renamed from: s */
    public static final long f87695s = 10000;

    /* renamed from: t */
    public static final long f87696t = 1000;

    /* renamed from: a */
    public final C36071u f87697a;

    /* renamed from: b */
    public final C9302e f87698b;

    /* renamed from: c */
    public final C36030b f87699c;

    /* renamed from: d */
    public final C35536c f87700d;

    /* renamed from: e */
    public final C35534b f87701e;

    /* renamed from: f */
    public final C9061a f87702f;

    /* renamed from: g */
    public final Object f87703g;

    /* renamed from: h */
    public final Object f87704h;

    /* renamed from: i */
    public boolean f87705i;

    public C35545f(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar) {
        this(uVar, aVar, C9302e.m34896n(context), C36035g.m148341t(context), AnalyticsDatabase.m146584Q(context, aVar).mo106452T(), new C35534b(aVar));
    }

    @C0348i1
    /* renamed from: a */
    public void mo106473a(@C0359n0 C35554i iVar, @C0359n0 String str) {
        try {
            C35543e b = C35543e.m146658b(iVar, str);
            synchronized (this.f87703g) {
                this.f87700d.mo106464j(b);
                this.f87700d.mo106466l(this.f87697a.mo107844g(f87687k, 5242880));
            }
            int g = iVar.mo106520g();
            if (g == 1) {
                mo106476d(Math.max(mo106475c(), 10000), TimeUnit.MILLISECONDS);
            } else if (g == 2) {
                mo106476d(0, TimeUnit.MILLISECONDS);
            } else if (this.f87699c.mo18483d()) {
                mo106476d(Math.max(mo106475c(), 30000), TimeUnit.MILLISECONDS);
            } else {
                mo106476d(Math.max(Math.max(this.f87702f.mo17958a().f87143p - (System.currentTimeMillis() - this.f87697a.mo107846i(f87689m, 0)), mo106475c()), 30000), TimeUnit.MILLISECONDS);
            }
        } catch (JsonException e) {
            C36059m.m148411g(e, "Analytics - Invalid event: %s", iVar);
        }
    }

    @C0348i1
    /* renamed from: b */
    public void mo106474b() {
        synchronized (this.f87703g) {
            this.f87700d.mo106459e();
        }
    }

    /* renamed from: c */
    public final long mo106475c() {
        return Math.max((this.f87697a.mo107846i(f87689m, 0) + ((long) this.f87697a.mo107844g(f87691o, 60000))) - System.currentTimeMillis(), 0);
    }

    /* renamed from: d */
    public void mo106476d(long j, @C0359n0 TimeUnit timeUnit) {
        int i;
        long millis = timeUnit.toMillis(j);
        C36059m.m148419o("Requesting to schedule event upload with delay %s ms.", Long.valueOf(millis));
        synchronized (this.f87704h) {
            if (this.f87705i) {
                long max = Math.max(System.currentTimeMillis() - this.f87697a.mo107846i(f87690n, 0), 0);
                if (max < millis) {
                    C36059m.m148419o("Event upload already scheduled for an earlier time.", new Object[0]);
                    long j2 = max;
                    i = 2;
                    millis = j2;
                    C36059m.m148419o("Scheduling upload in %s ms.", Long.valueOf(millis));
                    this.f87698b.mo18704c(C9304f.m34907i().mo18725k(f87686j).mo18732r(true).mo18726l(C35518b.class).mo18731q(millis, TimeUnit.MILLISECONDS).mo18728n(i).mo18724j());
                    this.f87697a.mo107853r(f87690n, System.currentTimeMillis() + millis);
                    this.f87705i = true;
                }
            }
            i = 0;
            C36059m.m148419o("Scheduling upload in %s ms.", Long.valueOf(millis));
            this.f87698b.mo18704c(C9304f.m34907i().mo18725k(f87686j).mo18732r(true).mo18726l(C35518b.class).mo18731q(millis, TimeUnit.MILLISECONDS).mo18728n(i).mo18724j());
            this.f87697a.mo107853r(f87690n, System.currentTimeMillis() + millis);
            this.f87705i = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r4.isEmpty() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        com.urbanairship.C36059m.m148419o("No analytics events to send.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        r2 = new java.util.ArrayList(r4.size());
        r5 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (r5.hasNext() == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r2.add(r5.next().f87685c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r9 = r8.f87701e.mo106453a(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        if (r9.mo18150l() != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        com.urbanairship.C36059m.m148406b("Analytic upload failed.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        com.urbanairship.C36059m.m148406b("Analytic events uploaded.", new java.lang.Object[0]);
        r2 = r8.f87703g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r8.f87700d.mo106460f(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r8.f87697a.mo107852q(f87687k, r9.mo18144f().mo106479b());
        r8.f87697a.mo107852q(f87688l, r9.mo18144f().mo106478a());
        r8.f87697a.mo107852q(f87691o, r9.mo18144f().mo106480c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d4, code lost:
        if ((r0 - r4.size()) <= 0) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        mo106476d(1000, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dd, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e1, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e2, code lost:
        com.urbanairship.C36059m.m148411g(r9, "EventManager - Failed to upload events", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e9, code lost:
        return false;
     */
    @androidx.annotation.C0348i1
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo106477e(@androidx.annotation.C0359n0 java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f87704h
            monitor-enter(r0)
            r1 = 0
            r8.f87705i = r1     // Catch:{ all -> 0x00ed }
            com.urbanairship.u r2 = r8.f87697a     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = "com.urbanairship.analytics.LAST_SEND"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ed }
            r2.mo107853r(r3, r4)     // Catch:{ all -> 0x00ed }
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            java.lang.Object r2 = r8.f87703g
            monitor-enter(r2)
            com.urbanairship.analytics.data.c r0 = r8.f87700d     // Catch:{ all -> 0x00ea }
            int r0 = r0.mo106455a()     // Catch:{ all -> 0x00ea }
            r3 = 1
            if (r0 > 0) goto L_0x0027
            java.lang.String r9 = "No events to send."
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ea }
            com.urbanairship.C36059m.m148406b(r9, r0)     // Catch:{ all -> 0x00ea }
            monitor-exit(r2)     // Catch:{ all -> 0x00ea }
            return r3
        L_0x0027:
            com.urbanairship.analytics.data.c r4 = r8.f87700d     // Catch:{ all -> 0x00ea }
            int r4 = r4.mo106456b()     // Catch:{ all -> 0x00ea }
            int r4 = r4 / r0
            int r4 = java.lang.Math.max(r3, r4)     // Catch:{ all -> 0x00ea }
            com.urbanairship.u r5 = r8.f87697a     // Catch:{ all -> 0x00ea }
            java.lang.String r6 = "com.urbanairship.analytics.MAX_BATCH_SIZE"
            r7 = 512000(0x7d000, float:7.17465E-40)
            int r5 = r5.mo107844g(r6, r7)     // Catch:{ all -> 0x00ea }
            int r5 = r5 / r4
            r4 = 500(0x1f4, float:7.0E-43)
            int r4 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x00ea }
            com.urbanairship.analytics.data.c r5 = r8.f87700d     // Catch:{ all -> 0x00ea }
            java.util.List r4 = r5.mo106463i(r4)     // Catch:{ all -> 0x00ea }
            monitor-exit(r2)     // Catch:{ all -> 0x00ea }
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0059
            java.lang.String r9 = "No analytics events to send."
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.urbanairship.C36059m.m148419o(r9, r0)
            return r1
        L_0x0059:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = r4.size()
            r2.<init>(r5)
            java.util.Iterator r5 = r4.iterator()
        L_0x0066:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0078
            java.lang.Object r6 = r5.next()
            com.urbanairship.analytics.data.e$a r6 = (com.urbanairship.analytics.data.C35543e.C35544a) r6
            com.urbanairship.json.JsonValue r6 = r6.f87685c
            r2.add(r6)
            goto L_0x0066
        L_0x0078:
            com.urbanairship.analytics.data.b r5 = r8.f87701e     // Catch:{ RequestException -> 0x00e1 }
            com.urbanairship.http.c r9 = r5.mo106453a(r2, r9)     // Catch:{ RequestException -> 0x00e1 }
            boolean r2 = r9.mo18150l()     // Catch:{ RequestException -> 0x00e1 }
            if (r2 != 0) goto L_0x008c
            java.lang.String r9 = "Analytic upload failed."
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ RequestException -> 0x00e1 }
            com.urbanairship.C36059m.m148406b(r9, r0)     // Catch:{ RequestException -> 0x00e1 }
            return r1
        L_0x008c:
            java.lang.String r2 = "Analytic events uploaded."
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ RequestException -> 0x00e1 }
            com.urbanairship.C36059m.m148406b(r2, r5)     // Catch:{ RequestException -> 0x00e1 }
            java.lang.Object r2 = r8.f87703g     // Catch:{ RequestException -> 0x00e1 }
            monitor-enter(r2)     // Catch:{ RequestException -> 0x00e1 }
            com.urbanairship.analytics.data.c r5 = r8.f87700d     // Catch:{ all -> 0x00de }
            r5.mo106460f(r4)     // Catch:{ all -> 0x00de }
            monitor-exit(r2)     // Catch:{ all -> 0x00de }
            com.urbanairship.u r2 = r8.f87697a     // Catch:{ RequestException -> 0x00e1 }
            java.lang.String r5 = "com.urbanairship.analytics.MAX_TOTAL_DB_SIZE"
            java.lang.Object r6 = r9.mo18144f()     // Catch:{ RequestException -> 0x00e1 }
            com.urbanairship.analytics.data.g r6 = (com.urbanairship.analytics.data.C35546g) r6     // Catch:{ RequestException -> 0x00e1 }
            int r6 = r6.mo106479b()     // Catch:{ RequestException -> 0x00e1 }
            r2.mo107852q(r5, r6)     // Catch:{ RequestException -> 0x00e1 }
            com.urbanairship.u r2 = r8.f87697a     // Catch:{ RequestException -> 0x00e1 }
            java.lang.String r5 = "com.urbanairship.analytics.MAX_BATCH_SIZE"
            java.lang.Object r6 = r9.mo18144f()     // Catch:{ RequestException -> 0x00e1 }
            com.urbanairship.analytics.data.g r6 = (com.urbanairship.analytics.data.C35546g) r6     // Catch:{ RequestException -> 0x00e1 }
            int r6 = r6.mo106478a()     // Catch:{ RequestException -> 0x00e1 }
            r2.mo107852q(r5, r6)     // Catch:{ RequestException -> 0x00e1 }
            com.urbanairship.u r2 = r8.f87697a     // Catch:{ RequestException -> 0x00e1 }
            java.lang.String r5 = "com.urbanairship.analytics.MIN_BATCH_INTERVAL"
            java.lang.Object r9 = r9.mo18144f()     // Catch:{ RequestException -> 0x00e1 }
            com.urbanairship.analytics.data.g r9 = (com.urbanairship.analytics.data.C35546g) r9     // Catch:{ RequestException -> 0x00e1 }
            int r9 = r9.mo106480c()     // Catch:{ RequestException -> 0x00e1 }
            r2.mo107852q(r5, r9)     // Catch:{ RequestException -> 0x00e1 }
            int r9 = r4.size()     // Catch:{ RequestException -> 0x00e1 }
            int r0 = r0 - r9
            if (r0 <= 0) goto L_0x00dd
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RequestException -> 0x00e1 }
            r4 = 1000(0x3e8, double:4.94E-321)
            r8.mo106476d(r4, r9)     // Catch:{ RequestException -> 0x00e1 }
        L_0x00dd:
            return r3
        L_0x00de:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00de }
            throw r9     // Catch:{ RequestException -> 0x00e1 }
        L_0x00e1:
            r9 = move-exception
            java.lang.String r0 = "EventManager - Failed to upload events"
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.urbanairship.C36059m.m148411g(r9, r0, r2)
            return r1
        L_0x00ea:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ea }
            throw r9
        L_0x00ed:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ed }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.analytics.data.C35545f.mo106477e(java.util.Map):boolean");
    }

    @C0344h1
    public C35545f(@C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C9302e eVar, @C0359n0 C36030b bVar, @C0359n0 C35536c cVar, @C0359n0 C35534b bVar2) {
        this.f87703g = new Object();
        this.f87704h = new Object();
        this.f87697a = uVar;
        this.f87702f = aVar;
        this.f87698b = eVar;
        this.f87699c = bVar;
        this.f87700d = cVar;
        this.f87701e = bVar2;
    }
}
