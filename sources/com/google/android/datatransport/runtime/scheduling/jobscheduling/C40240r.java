package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.C0344h1;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.C40041c;
import com.google.android.datatransport.runtime.C40189i;
import com.google.android.datatransport.runtime.C40190j;
import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.C40106e;
import com.google.android.datatransport.runtime.backends.C40108g;
import com.google.android.datatransport.runtime.backends.C40116m;
import com.google.android.datatransport.runtime.firebase.transport.C40177a;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.C40195a;
import com.google.android.datatransport.runtime.scheduling.persistence.C40253c;
import com.google.android.datatransport.runtime.scheduling.persistence.C40255d;
import com.google.android.datatransport.runtime.scheduling.persistence.C40273k;
import com.google.android.datatransport.runtime.synchronization.C40306a;
import com.google.android.datatransport.runtime.time.C40309a;
import com.google.android.datatransport.runtime.time.C40310b;
import com.google.android.datatransport.runtime.time.C40318h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.r */
public class C40240r {

    /* renamed from: j */
    public static final String f102545j = "Uploader";

    /* renamed from: k */
    public static final String f102546k = "GDT_CLIENT_METRICS";

    /* renamed from: a */
    public final Context f102547a;

    /* renamed from: b */
    public final C40106e f102548b;

    /* renamed from: c */
    public final C40255d f102549c;

    /* renamed from: d */
    public final C40246x f102550d;

    /* renamed from: e */
    public final Executor f102551e;

    /* renamed from: f */
    public final C40306a f102552f;

    /* renamed from: g */
    public final C40309a f102553g;

    /* renamed from: h */
    public final C40309a f102554h;

    /* renamed from: i */
    public final C40253c f102555i;

    @Inject
    public C40240r(Context context, C40106e eVar, C40255d dVar, C40246x xVar, Executor executor, C40306a aVar, @C40318h C40309a aVar2, @C40310b C40309a aVar3, C40253c cVar) {
        this.f102547a = context;
        this.f102548b = eVar;
        this.f102549c = dVar;
        this.f102550d = xVar;
        this.f102551e = executor;
        this.f102552f = aVar;
        this.f102553g = aVar2;
        this.f102554h = aVar3;
        this.f102555i = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m163601l(C40203r rVar) {
        return Boolean.valueOf(this.f102549c.mo132931W1(rVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m163602m(C40203r rVar) {
        return this.f102549c.mo132927E2(rVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m163603n(Iterable iterable, C40203r rVar, long j) {
        this.f102549c.mo132932Z1(iterable);
        this.f102549c.mo132928I0(rVar, this.f102553g.getTime() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m163604o(Iterable iterable) {
        this.f102549c.mo132934l0(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m163605p() {
        this.f102555i.mo132923a();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m163606q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f102555i.mo132925d((long) ((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m163607r(C40203r rVar, long j) {
        this.f102549c.mo132928I0(rVar, this.f102553g.getTime() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m163608s(C40203r rVar, int i) {
        this.f102550d.mo132880a(rVar, i + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f102550d.mo132880a(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m163609t(com.google.android.datatransport.runtime.C40203r r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            com.google.android.datatransport.runtime.synchronization.a r0 = r3.f102552f     // Catch:{ SynchronizationException -> 0x0026 }
            com.google.android.datatransport.runtime.scheduling.persistence.d r1 = r3.f102549c     // Catch:{ SynchronizationException -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            com.google.android.datatransport.runtime.scheduling.jobscheduling.j r2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.j     // Catch:{ SynchronizationException -> 0x0026 }
            r2.<init>(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo132960b(r2)     // Catch:{ SynchronizationException -> 0x0026 }
            boolean r0 = r3.mo132895k()     // Catch:{ SynchronizationException -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            com.google.android.datatransport.runtime.synchronization.a r0 = r3.f102552f     // Catch:{ SynchronizationException -> 0x0026 }
            com.google.android.datatransport.runtime.scheduling.jobscheduling.k r1 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.k     // Catch:{ SynchronizationException -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo132960b(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.mo132896u(r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.x r0 = r3.f102550d     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.mo132880a(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.C40240r.m163609t(com.google.android.datatransport.runtime.r, int, java.lang.Runnable):void");
    }

    @C0344h1
    /* renamed from: j */
    public C40190j mo132894j(C40116m mVar) {
        C40306a aVar = this.f102552f;
        C40253c cVar = this.f102555i;
        Objects.requireNonNull(cVar);
        return mVar.mo132562a(C40190j.m163460a().mo132691i(this.f102553g.getTime()).mo132693k(this.f102554h.getTime()).mo132692j(f102546k).mo132690h(new C40189i(C40041c.m163048b("proto"), ((C40177a) aVar.mo132960b(new C40229g(cVar))).mo132801i())).mo132686d());
    }

    /* renamed from: k */
    public boolean mo132895k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f102547a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: u */
    public BackendResponse mo132896u(C40203r rVar, int i) {
        BackendResponse b;
        C40116m mVar = this.f102548b.get(rVar.mo132737b());
        long j = 0;
        BackendResponse e = BackendResponse.m163284e(0);
        while (true) {
            long j2 = j;
            while (((Boolean) this.f102552f.mo132960b(new C40234l(this, rVar))).booleanValue()) {
                Iterable<C40273k> iterable = (Iterable) this.f102552f.mo132960b(new C40235m(this, rVar));
                if (!iterable.iterator().hasNext()) {
                    return e;
                }
                if (mVar == null) {
                    C40195a.m163492c(f102545j, "Unknown backend for %s, deleting event batch for it...", rVar);
                    b = BackendResponse.m163282a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (C40273k b2 : iterable) {
                        arrayList.add(b2.mo132917b());
                    }
                    if (rVar.mo132850e()) {
                        arrayList.add(mo132894j(mVar));
                    }
                    b = mVar.mo132563b(C40108g.m163300a().mo132703b(arrayList).mo132704c(rVar.mo132738c()).mo132702a());
                }
                e = b;
                if (e.mo132695c() == BackendResponse.Status.TRANSIENT_ERROR) {
                    this.f102552f.mo132960b(new C40236n(this, iterable, rVar, j2));
                    this.f102550d.mo132881b(rVar, i + 1, true);
                    return e;
                }
                this.f102552f.mo132960b(new C40237o(this, iterable));
                if (e.mo132695c() == BackendResponse.Status.OK) {
                    j = Math.max(j2, e.mo132694b());
                    if (rVar.mo132850e()) {
                        this.f102552f.mo132960b(new C40238p(this));
                    }
                } else if (e.mo132695c() == BackendResponse.Status.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (C40273k b3 : iterable) {
                        String l = b3.mo132917b().mo132683l();
                        if (!hashMap.containsKey(l)) {
                            hashMap.put(l, 1);
                        } else {
                            hashMap.put(l, Integer.valueOf(((Integer) hashMap.get(l)).intValue() + 1));
                        }
                    }
                    this.f102552f.mo132960b(new C40239q(this, hashMap));
                }
            }
            this.f102552f.mo132960b(new C40230h(this, rVar, j2));
            return e;
        }
    }

    /* renamed from: v */
    public void mo132897v(C40203r rVar, int i, Runnable runnable) {
        this.f102551e.execute(new C40231i(this, rVar, i, runnable));
    }
}
