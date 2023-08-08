package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.C40666o;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.C40670s;
import com.google.android.gms.common.api.C40672u;
import com.google.android.gms.common.api.C40673v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C40790n;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.base.C41084u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
@C40473a
public abstract class BasePendingResult<R extends C40669r> extends C40663m<R> {

    /* renamed from: p */
    public static final ThreadLocal f103274p = new C40644w3();

    /* renamed from: q */
    public static final /* synthetic */ int f103275q = 0;

    /* renamed from: a */
    public final Object f103276a;
    @C0359n0

    /* renamed from: b */
    public final C40511a f103277b;
    @C0359n0

    /* renamed from: c */
    public final WeakReference f103278c;

    /* renamed from: d */
    public final CountDownLatch f103279d;

    /* renamed from: e */
    public final ArrayList f103280e;
    @C0363p0

    /* renamed from: f */
    public C40670s f103281f;

    /* renamed from: g */
    public final AtomicReference f103282g;
    @C0363p0

    /* renamed from: h */
    public C40669r f103283h;

    /* renamed from: i */
    public Status f103284i;

    /* renamed from: j */
    public volatile boolean f103285j;

    /* renamed from: k */
    public boolean f103286k;

    /* renamed from: l */
    public boolean f103287l;
    @C0363p0

    /* renamed from: m */
    public C40790n f103288m;
    @KeepName
    private C40654y3 mResultGuardian;

    /* renamed from: n */
    public volatile C40562h3 f103289n;

    /* renamed from: o */
    public boolean f103290o;

    @Deprecated
    public BasePendingResult() {
        this.f103276a = new Object();
        this.f103279d = new CountDownLatch(1);
        this.f103280e = new ArrayList();
        this.f103282g = new AtomicReference();
        this.f103290o = false;
        this.f103277b = new C40511a(Looper.getMainLooper());
        this.f103278c = new WeakReference((Object) null);
    }

    /* renamed from: t */
    public static void m164845t(@C0363p0 C40669r rVar) {
        if (rVar instanceof C40666o) {
            try {
                ((C40666o) rVar).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(rVar));
            }
        }
    }

    /* renamed from: c */
    public final void mo133783c(@C0359n0 C40663m.C40664a aVar) {
        boolean z;
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166192b(z, "Callback cannot be null.");
        synchronized (this.f103276a) {
            if (mo133791m()) {
                aVar.mo133895a(this.f103284i);
            } else {
                this.f103280e.add(aVar);
            }
        }
    }

    @C0359n0
    /* renamed from: d */
    public final R mo133784d() {
        C40843u.m166201k("await must not be called on the UI thread");
        boolean z = true;
        C40843u.m166209s(!this.f103285j, "Result has already been consumed");
        if (this.f103289n != null) {
            z = false;
        }
        C40843u.m166209s(z, "Cannot await if then() has been called.");
        try {
            this.f103279d.await();
        } catch (InterruptedException unused) {
            mo133790l(Status.f103185v);
        }
        C40843u.m166209s(mo133791m(), "Result is not ready.");
        return mo133794p();
    }

    @C0359n0
    /* renamed from: e */
    public final R mo133785e(long j, @C0359n0 TimeUnit timeUnit) {
        if (j > 0) {
            C40843u.m166201k("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        C40843u.m166209s(!this.f103285j, "Result has already been consumed.");
        if (this.f103289n != null) {
            z = false;
        }
        C40843u.m166209s(z, "Cannot await if then() has been called.");
        try {
            if (!this.f103279d.await(j, timeUnit)) {
                mo133790l(Status.f103187x);
            }
        } catch (InterruptedException unused) {
            mo133790l(Status.f103185v);
        }
        C40843u.m166209s(mo133791m(), "Result is not ready.");
        return mo133794p();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0013 */
    @com.google.android.gms.common.annotation.C40473a
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo133687f() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f103276a
            monitor-enter(r0)
            boolean r1 = r2.f103286k     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r2.f103285j     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0026
        L_0x000c:
            com.google.android.gms.common.internal.n r1 = r2.f103288m     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0013
            r1.cancel()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0013:
            com.google.android.gms.common.api.r r1 = r2.f103283h     // Catch:{ all -> 0x0028 }
            m164845t(r1)     // Catch:{ all -> 0x0028 }
            r1 = 1
            r2.f103286k = r1     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f103188y     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.r r1 = r2.mo133688k(r1)     // Catch:{ all -> 0x0028 }
            r2.mo133795q(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo133687f():void");
    }

    /* renamed from: g */
    public final boolean mo133786g() {
        boolean z;
        synchronized (this.f103276a) {
            z = this.f103286k;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return;
     */
    @com.google.android.gms.common.annotation.C40473a
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133787h(@androidx.annotation.C0363p0 com.google.android.gms.common.api.C40670s<? super R> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f103276a
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000a
            r5 = 0
            r4.f103281f = r5     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x000a:
            boolean r1 = r4.f103285j     // Catch:{ all -> 0x003a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.C40843u.m166209s(r1, r3)     // Catch:{ all -> 0x003a }
            com.google.android.gms.common.api.internal.h3 r1 = r4.f103289n     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C40843u.m166209s(r2, r1)     // Catch:{ all -> 0x003a }
            boolean r1 = r4.mo133786g()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x0026:
            boolean r1 = r4.mo133791m()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.common.api.internal.BasePendingResult$a r1 = r4.f103277b     // Catch:{ all -> 0x003a }
            com.google.android.gms.common.api.r r2 = r4.mo133794p()     // Catch:{ all -> 0x003a }
            r1.mo133799a(r5, r2)     // Catch:{ all -> 0x003a }
            goto L_0x0038
        L_0x0036:
            r4.f103281f = r5     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo133787h(com.google.android.gms.common.api.s):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        return;
     */
    @com.google.android.gms.common.annotation.C40473a
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133788i(@androidx.annotation.C0359n0 com.google.android.gms.common.api.C40670s<? super R> r5, long r6, @androidx.annotation.C0359n0 java.util.concurrent.TimeUnit r8) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f103276a
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000a
            r5 = 0
            r4.f103281f = r5     // Catch:{ all -> 0x0048 }
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000a:
            boolean r1 = r4.f103285j     // Catch:{ all -> 0x0048 }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.C40843u.m166209s(r1, r3)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.common.api.internal.h3 r1 = r4.f103289n     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C40843u.m166209s(r2, r1)     // Catch:{ all -> 0x0048 }
            boolean r1 = r4.mo133786g()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0026:
            boolean r1 = r4.mo133791m()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.common.api.internal.BasePendingResult$a r6 = r4.f103277b     // Catch:{ all -> 0x0048 }
            com.google.android.gms.common.api.r r7 = r4.mo133794p()     // Catch:{ all -> 0x0048 }
            r6.mo133799a(r5, r7)     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0036:
            r4.f103281f = r5     // Catch:{ all -> 0x0048 }
            com.google.android.gms.common.api.internal.BasePendingResult$a r5 = r4.f103277b     // Catch:{ all -> 0x0048 }
            long r6 = r8.toMillis(r6)     // Catch:{ all -> 0x0048 }
            r8 = 2
            android.os.Message r8 = r5.obtainMessage(r8, r4)     // Catch:{ all -> 0x0048 }
            r5.sendMessageDelayed(r8, r6)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo133788i(com.google.android.gms.common.api.s, long, java.util.concurrent.TimeUnit):void");
    }

    @C0359n0
    /* renamed from: j */
    public final <S extends C40669r> C40673v<S> mo133789j(@C0359n0 C40672u<? super R, ? extends S> uVar) {
        boolean z;
        C40673v<S> c;
        C40843u.m166209s(!this.f103285j, "Result has already been consumed.");
        synchronized (this.f103276a) {
            boolean z2 = false;
            if (this.f103289n == null) {
                z = true;
            } else {
                z = false;
            }
            C40843u.m166209s(z, "Cannot call then() twice.");
            if (this.f103281f == null) {
                z2 = true;
            }
            C40843u.m166209s(z2, "Cannot call then() if callbacks are set.");
            C40843u.m166209s(!this.f103286k, "Cannot call then() if result was canceled.");
            this.f103290o = true;
            this.f103289n = new C40562h3(this.f103278c);
            c = this.f103289n.mo133919c(uVar);
            if (mo133791m()) {
                this.f103277b.mo133799a(this.f103289n, mo133794p());
            } else {
                this.f103281f = this.f103289n;
            }
        }
        return c;
    }

    @C40473a
    @C0359n0
    /* renamed from: k */
    public abstract R mo133688k(@C0359n0 Status status);

    @C40473a
    @Deprecated
    /* renamed from: l */
    public final void mo133790l(@C0359n0 Status status) {
        synchronized (this.f103276a) {
            if (!mo133791m()) {
                mo133793o(mo133688k(status));
                this.f103287l = true;
            }
        }
    }

    @C40473a
    /* renamed from: m */
    public final boolean mo133791m() {
        return this.f103279d.getCount() == 0;
    }

    @C40473a
    /* renamed from: n */
    public final void mo133792n(@C0359n0 C40790n nVar) {
        synchronized (this.f103276a) {
            this.f103288m = nVar;
        }
    }

    @C40473a
    /* renamed from: o */
    public final void mo133793o(@C0359n0 R r) {
        synchronized (this.f103276a) {
            if (this.f103287l || this.f103286k) {
                m164845t(r);
                return;
            }
            mo133791m();
            C40843u.m166209s(!mo133791m(), "Results have already been set");
            C40843u.m166209s(!this.f103285j, "Result has already been consumed");
            mo133795q(r);
        }
    }

    /* renamed from: p */
    public final C40669r mo133794p() {
        C40669r rVar;
        synchronized (this.f103276a) {
            C40843u.m166209s(!this.f103285j, "Result has already been consumed.");
            C40843u.m166209s(mo133791m(), "Result is not ready.");
            rVar = this.f103283h;
            this.f103283h = null;
            this.f103281f = null;
            this.f103285j = true;
        }
        C40568i3 i3Var = (C40568i3) this.f103282g.getAndSet((Object) null);
        if (i3Var != null) {
            i3Var.f103423a.f103465a.remove(this);
        }
        return (C40669r) C40843u.m166202l(rVar);
    }

    /* renamed from: q */
    public final void mo133795q(C40669r rVar) {
        this.f103283h = rVar;
        this.f103284i = rVar.getStatus();
        this.f103288m = null;
        this.f103279d.countDown();
        if (this.f103286k) {
            this.f103281f = null;
        } else {
            C40670s sVar = this.f103281f;
            if (sVar != null) {
                this.f103277b.removeMessages(2);
                this.f103277b.mo133799a(sVar, mo133794p());
            } else if (this.f103283h instanceof C40666o) {
                this.mResultGuardian = new C40654y3(this, (C40649x3) null);
            }
        }
        ArrayList arrayList = this.f103280e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C40663m.C40664a) arrayList.get(i)).mo133895a(this.f103284i);
        }
        this.f103280e.clear();
    }

    /* renamed from: s */
    public final void mo133796s() {
        boolean z = true;
        if (!this.f103290o && !((Boolean) f103274p.get()).booleanValue()) {
            z = false;
        }
        this.f103290o = z;
    }

    /* renamed from: u */
    public final boolean mo133797u() {
        boolean g;
        synchronized (this.f103276a) {
            if (((C40507i) this.f103278c.get()) == null || !this.f103290o) {
                mo133687f();
            }
            g = mo133786g();
        }
        return g;
    }

    /* renamed from: v */
    public final void mo133798v(@C0363p0 C40568i3 i3Var) {
        this.f103282g.set(i3Var);
    }

    @C40974d0
    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C40511a<R extends C40669r> extends C41084u {
        public C40511a() {
            super(Looper.getMainLooper());
        }

        /* renamed from: a */
        public final void mo133799a(@C0359n0 C40670s sVar, @C0359n0 C40669r rVar) {
            int i = BasePendingResult.f103275q;
            sendMessage(obtainMessage(1, new Pair((C40670s) C40843u.m166202l(sVar), rVar)));
        }

        public final void handleMessage(@C0359n0 Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C40670s sVar = (C40670s) pair.first;
                C40669r rVar = (C40669r) pair.second;
                try {
                    sVar.mo133903a(rVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m164845t(rVar);
                    throw e;
                }
            } else if (i != 2) {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i, new Exception());
            } else {
                ((BasePendingResult) message.obj).mo133790l(Status.f103187x);
            }
        }

        public C40511a(@C0359n0 Looper looper) {
            super(looper);
        }
    }

    @C40473a
    @Deprecated
    public BasePendingResult(@C0359n0 Looper looper) {
        this.f103276a = new Object();
        this.f103279d = new CountDownLatch(1);
        this.f103280e = new ArrayList();
        this.f103282g = new AtomicReference();
        this.f103290o = false;
        this.f103277b = new C40511a(looper);
        this.f103278c = new WeakReference((Object) null);
    }

    @C40473a
    public BasePendingResult(@C0363p0 C40507i iVar) {
        this.f103276a = new Object();
        this.f103279d = new CountDownLatch(1);
        this.f103280e = new ArrayList();
        this.f103282g = new AtomicReference();
        this.f103290o = false;
        this.f103277b = new C40511a(iVar != null ? iVar.mo133757r() : Looper.getMainLooper());
        this.f103278c = new WeakReference(iVar);
    }

    @C40473a
    @C40974d0
    public BasePendingResult(@C0359n0 C40511a<R> aVar) {
        this.f103276a = new Object();
        this.f103279d = new CountDownLatch(1);
        this.f103280e = new ArrayList();
        this.f103282g = new AtomicReference();
        this.f103290o = false;
        this.f103277b = (C40511a) C40843u.m166203m(aVar, "CallbackHandler must not be null");
        this.f103278c = new WeakReference((Object) null);
    }
}
