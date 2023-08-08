package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.base.C41084u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.internal.r0 */
public final class C40806r0 implements Handler.Callback {
    @NotOnlyInitialized

    /* renamed from: c */
    public final C40803q0 f103918c;

    /* renamed from: d */
    public final ArrayList f103919d = new ArrayList();
    @C40974d0

    /* renamed from: e */
    public final ArrayList f103920e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f103921f = new ArrayList();

    /* renamed from: g */
    public volatile boolean f103922g = false;

    /* renamed from: h */
    public final AtomicInteger f103923h = new AtomicInteger(0);

    /* renamed from: i */
    public boolean f103924i = false;

    /* renamed from: j */
    public final Handler f103925j;

    /* renamed from: k */
    public final Object f103926k = new Object();

    public C40806r0(Looper looper, C40803q0 q0Var) {
        this.f103918c = q0Var;
        this.f103925j = new C41084u(looper, this);
    }

    /* renamed from: a */
    public final void mo134463a() {
        this.f103922g = false;
        this.f103923h.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo134464b() {
        this.f103922g = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    @com.google.android.gms.common.util.C40974d0
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo134465c(com.google.android.gms.common.ConnectionResult r6) {
        /*
            r5 = this;
            android.os.Handler r0 = r5.f103925j
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.C40843u.m166195e(r0, r1)
            android.os.Handler r0 = r5.f103925j
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.f103926k
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            java.util.ArrayList r2 = r5.f103921f     // Catch:{ all -> 0x004a }
            r1.<init>(r2)     // Catch:{ all -> 0x004a }
            java.util.concurrent.atomic.AtomicInteger r2 = r5.f103923h     // Catch:{ all -> 0x004a }
            int r2 = r2.get()     // Catch:{ all -> 0x004a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004a }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x004a }
            com.google.android.gms.common.api.i$c r3 = (com.google.android.gms.common.api.C40507i.C40510c) r3     // Catch:{ all -> 0x004a }
            boolean r4 = r5.f103922g     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicInteger r4 = r5.f103923h     // Catch:{ all -> 0x004a }
            int r4 = r4.get()     // Catch:{ all -> 0x004a }
            if (r4 == r2) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            java.util.ArrayList r4 = r5.f103921f     // Catch:{ all -> 0x004a }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0021
            r3.mo133896O0(r6)     // Catch:{ all -> 0x004a }
            goto L_0x0021
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C40806r0.mo134465c(com.google.android.gms.common.ConnectionResult):void");
    }

    @C40974d0
    /* renamed from: d */
    public final void mo134466d(@C0363p0 Bundle bundle) {
        C40843u.m166195e(this.f103925j, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f103926k) {
            C40843u.m166208r(!this.f103924i);
            this.f103925j.removeMessages(1);
            this.f103924i = true;
            C40843u.m166208r(this.f103920e.isEmpty());
            ArrayList arrayList = new ArrayList(this.f103919d);
            int i = this.f103923h.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C40507i.C40509b bVar = (C40507i.C40509b) it.next();
                if (!this.f103922g || !this.f103918c.mo133846a()) {
                    break;
                } else if (this.f103923h.get() != i) {
                    break;
                } else if (!this.f103920e.contains(bVar)) {
                    bVar.mo133866m0(bundle);
                }
            }
            this.f103920e.clear();
            this.f103924i = false;
        }
    }

    @C40974d0
    /* renamed from: e */
    public final void mo134467e(int i) {
        C40843u.m166195e(this.f103925j, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f103925j.removeMessages(1);
        synchronized (this.f103926k) {
            this.f103924i = true;
            ArrayList arrayList = new ArrayList(this.f103919d);
            int i2 = this.f103923h.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C40507i.C40509b bVar = (C40507i.C40509b) it.next();
                if (!this.f103922g) {
                    break;
                } else if (this.f103923h.get() != i2) {
                    break;
                } else if (this.f103919d.contains(bVar)) {
                    bVar.mo133865H0(i);
                }
            }
            this.f103920e.clear();
            this.f103924i = false;
        }
    }

    /* renamed from: f */
    public final void mo134468f(C40507i.C40509b bVar) {
        C40843u.m166202l(bVar);
        synchronized (this.f103926k) {
            if (this.f103919d.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
            } else {
                this.f103919d.add(bVar);
            }
        }
        if (this.f103918c.mo133846a()) {
            Handler handler = this.f103925j;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: g */
    public final void mo134469g(C40507i.C40510c cVar) {
        C40843u.m166202l(cVar);
        synchronized (this.f103926k) {
            if (this.f103921f.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder();
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
            } else {
                this.f103921f.add(cVar);
            }
        }
    }

    /* renamed from: h */
    public final void mo134470h(C40507i.C40509b bVar) {
        C40843u.m166202l(bVar);
        synchronized (this.f103926k) {
            if (!this.f103919d.remove(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append("unregisterConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
            } else if (this.f103924i) {
                this.f103920e.add(bVar);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C40507i.C40509b bVar = (C40507i.C40509b) message.obj;
            synchronized (this.f103926k) {
                if (this.f103922g && this.f103918c.mo133846a() && this.f103919d.contains(bVar)) {
                    bVar.mo133866m0((Bundle) null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i, new Exception());
        return false;
    }

    /* renamed from: i */
    public final void mo134472i(C40507i.C40510c cVar) {
        C40843u.m166202l(cVar);
        synchronized (this.f103926k) {
            if (!this.f103921f.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder();
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
            }
        }
    }

    /* renamed from: j */
    public final boolean mo134473j(C40507i.C40509b bVar) {
        boolean contains;
        C40843u.m166202l(bVar);
        synchronized (this.f103926k) {
            contains = this.f103919d.contains(bVar);
        }
        return contains;
    }

    /* renamed from: k */
    public final boolean mo134474k(C40507i.C40510c cVar) {
        boolean contains;
        C40843u.m166202l(cVar);
        synchronized (this.f103926k) {
            contains = this.f103921f.contains(cVar);
        }
        return contains;
    }
}
