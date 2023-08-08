package com.google.firebase.remoteconfig.internal;

import androidx.annotation.C0323b0;
import androidx.annotation.C0328d;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.profileinstaller.C20006f;
import com.google.android.gms.tasks.C31033d;
import com.google.android.gms.tasks.C31037f;
import com.google.android.gms.tasks.C31039g;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C0328d
/* renamed from: com.google.firebase.remoteconfig.internal.e */
public class C33523e {

    /* renamed from: d */
    public static final long f81563d = 5;
    @C0323b0("ConfigCacheClient.class")

    /* renamed from: e */
    public static final Map<String, C33523e> f81564e = new HashMap();

    /* renamed from: f */
    public static final Executor f81565f = new C20006f();

    /* renamed from: a */
    public final Executor f81566a;

    /* renamed from: b */
    public final C33540o f81567b;
    @C0363p0
    @C0323b0("this")

    /* renamed from: c */
    public C31047k<C33526f> f81568c = null;

    /* renamed from: com.google.firebase.remoteconfig.internal.e$b */
    public static class C33525b<TResult> implements C31039g<TResult>, C31037f, C31033d {

        /* renamed from: a */
        public final CountDownLatch f81569a;

        public C33525b() {
            this.f81569a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public void mo82228a(TResult tresult) {
            this.f81569a.countDown();
        }

        /* renamed from: b */
        public void mo97299b() throws InterruptedException {
            this.f81569a.await();
        }

        /* renamed from: c */
        public boolean mo97300c(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f81569a.await(j, timeUnit);
        }

        public void onCanceled() {
            this.f81569a.countDown();
        }

        public void onFailure(@C0359n0 Exception exc) {
            this.f81569a.countDown();
        }
    }

    public C33523e(Executor executor, C33540o oVar) {
        this.f81566a = executor;
        this.f81567b = oVar;
    }

    /* renamed from: c */
    public static <TResult> TResult m135119c(C31047k<TResult> kVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C33525b bVar = new C33525b();
        Executor executor = f81565f;
        kVar.mo87728l(executor, bVar);
        kVar.mo87725i(executor, bVar);
        kVar.mo87719c(executor, bVar);
        if (!bVar.mo97300c(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (kVar.mo87738v()) {
            return kVar.mo87734r();
        } else {
            throw new ExecutionException(kVar.mo87733q());
        }
    }

    @C0344h1
    /* renamed from: e */
    public static synchronized void m135120e() {
        synchronized (C33523e.class) {
            f81564e.clear();
        }
    }

    /* renamed from: j */
    public static synchronized C33523e m135121j(Executor executor, C33540o oVar) {
        C33523e eVar;
        synchronized (C33523e.class) {
            String c = oVar.mo97366c();
            Map<String, C33523e> map = f81564e;
            if (!map.containsKey(c)) {
                map.put(c, new C33523e(executor, oVar));
            }
            eVar = map.get(c);
        }
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Void m135122k(C33526f fVar) throws Exception {
        return this.f81567b.mo97368f(fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ C31047k m135123l(boolean z, C33526f fVar, Void voidR) throws Exception {
        if (z) {
            mo97298o(fVar);
        }
        return C31053n.m124525g(fVar);
    }

    /* renamed from: d */
    public void mo97291d() {
        synchronized (this) {
            this.f81568c = C31053n.m124525g(null);
        }
        this.f81567b.mo97365a();
    }

    /* renamed from: f */
    public synchronized C31047k<C33526f> mo97292f() {
        C31047k<C33526f> kVar = this.f81568c;
        if (kVar == null || (kVar.mo87737u() && !this.f81568c.mo87738v())) {
            Executor executor = this.f81566a;
            C33540o oVar = this.f81567b;
            Objects.requireNonNull(oVar);
            this.f81568c = C31053n.m124522d(executor, new C33520b(oVar));
        }
        return this.f81568c;
    }

    @C0363p0
    /* renamed from: g */
    public C33526f mo97293g() {
        return mo97294h(5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return (com.google.firebase.remoteconfig.internal.C33526f) m135119c(mo97292f(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return null;
     */
    @androidx.annotation.C0363p0
    @androidx.annotation.C0344h1
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.C33526f mo97294h(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.tasks.k<com.google.firebase.remoteconfig.internal.f> r0 = r2.f81568c     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.mo87738v()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0015
            com.google.android.gms.tasks.k<com.google.firebase.remoteconfig.internal.f> r3 = r2.f81568c     // Catch:{ all -> 0x0025 }
            java.lang.Object r3 = r3.mo87734r()     // Catch:{ all -> 0x0025 }
            com.google.firebase.remoteconfig.internal.f r3 = (com.google.firebase.remoteconfig.internal.C33526f) r3     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return r3
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.tasks.k r0 = r2.mo97292f()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0023 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0023 }
            java.lang.Object r3 = m135119c(r0, r3, r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0023 }
            com.google.firebase.remoteconfig.internal.f r3 = (com.google.firebase.remoteconfig.internal.C33526f) r3     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0023 }
            return r3
        L_0x0023:
            r3 = 0
            return r3
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C33523e.mo97294h(long):com.google.firebase.remoteconfig.internal.f");
    }

    @C0363p0
    @C0344h1
    /* renamed from: i */
    public synchronized C31047k<C33526f> mo97295i() {
        return this.f81568c;
    }

    /* renamed from: m */
    public C31047k<C33526f> mo97296m(C33526f fVar) {
        return mo97297n(fVar, true);
    }

    /* renamed from: n */
    public C31047k<C33526f> mo97297n(C33526f fVar, boolean z) {
        return C31053n.m124522d(this.f81566a, new C33521c(this, fVar)).mo87740x(this.f81566a, new C33522d(this, z, fVar));
    }

    /* renamed from: o */
    public final synchronized void mo97298o(C33526f fVar) {
        this.f81568c = C31053n.m124525g(fVar);
    }
}
