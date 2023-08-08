package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.gms.common.C40715h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40843u;
import com.google.firebase.installations.C33124s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.n1 */
public final class C40596n1 implements C40555g2, C40518a4 {

    /* renamed from: A */
    public final C40572j1 f103496A;

    /* renamed from: B */
    public final C40543e2 f103497B;

    /* renamed from: n */
    public final Lock f103498n;

    /* renamed from: o */
    public final Condition f103499o;

    /* renamed from: p */
    public final Context f103500p;

    /* renamed from: q */
    public final C40715h f103501q;

    /* renamed from: r */
    public final C40589m1 f103502r;

    /* renamed from: s */
    public final Map f103503s;

    /* renamed from: t */
    public final Map f103504t = new HashMap();
    @C0363p0

    /* renamed from: u */
    public final C40756f f103505u;

    /* renamed from: v */
    public final Map f103506v;
    @C0363p0

    /* renamed from: w */
    public final C40477a.C40478a f103507w;
    @NotOnlyInitialized

    /* renamed from: x */
    public volatile C40579k1 f103508x;
    @C0363p0

    /* renamed from: y */
    public ConnectionResult f103509y = null;

    /* renamed from: z */
    public int f103510z;

    public C40596n1(Context context, C40572j1 j1Var, Lock lock, Looper looper, C40715h hVar, Map map, @C0363p0 C40756f fVar, Map map2, @C0363p0 C40477a.C40478a aVar, ArrayList arrayList, C40543e2 e2Var) {
        this.f103500p = context;
        this.f103498n = lock;
        this.f103501q = hVar;
        this.f103503s = map;
        this.f103505u = fVar;
        this.f103506v = map2;
        this.f103507w = aVar;
        this.f103496A = j1Var;
        this.f103497B = e2Var;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C40659z3) arrayList.get(i)).mo134094a(this);
        }
        this.f103502r = new C40589m1(this, looper);
        this.f103499o = lock.newCondition();
        this.f103508x = new C40521b1(this);
    }

    /* renamed from: H0 */
    public final void mo133865H0(int i) {
        this.f103498n.lock();
        try {
            this.f103508x.mo133825e(i);
        } finally {
            this.f103498n.unlock();
        }
    }

    /* renamed from: T6 */
    public final void mo133838T6(@C0359n0 ConnectionResult connectionResult, @C0359n0 C40477a aVar, boolean z) {
        this.f103498n.lock();
        try {
            this.f103508x.mo133824d(connectionResult, aVar, z);
        } finally {
            this.f103498n.unlock();
        }
    }

    /* renamed from: c */
    public final void mo133995c() {
        this.f103498n.lock();
        try {
            this.f103496A.mo133970R();
            this.f103508x = new C40595n0(this);
            this.f103508x.mo133822b();
            this.f103499o.signalAll();
        } finally {
            this.f103498n.unlock();
        }
    }

    /* renamed from: d */
    public final void mo133996d() {
        this.f103498n.lock();
        try {
            this.f103508x = new C40515a1(this, this.f103505u, this.f103506v, this.f103501q, this.f103507w, this.f103498n, this.f103500p);
            this.f103508x.mo133822b();
            this.f103499o.signalAll();
        } finally {
            this.f103498n.unlock();
        }
    }

    /* renamed from: e */
    public final void mo133997e(@C0363p0 ConnectionResult connectionResult) {
        this.f103498n.lock();
        try {
            this.f103509y = connectionResult;
            this.f103508x = new C40521b1(this);
            this.f103508x.mo133822b();
            this.f103499o.signalAll();
        } finally {
            this.f103498n.unlock();
        }
    }

    /* renamed from: f */
    public final void mo133998f(C40584l1 l1Var) {
        this.f103502r.sendMessage(this.f103502r.obtainMessage(1, l1Var));
    }

    /* renamed from: g */
    public final void mo133999g(RuntimeException runtimeException) {
        this.f103502r.sendMessage(this.f103502r.obtainMessage(2, runtimeException));
    }

    @GuardedBy("mLock")
    /* renamed from: k */
    public final ConnectionResult mo133881k() {
        mo133882l();
        while (this.f103508x instanceof C40515a1) {
            try {
                this.f103499o.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            }
        }
        if (this.f103508x instanceof C40595n0) {
            return ConnectionResult.f103129S0;
        }
        ConnectionResult connectionResult = this.f103509y;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, (PendingIntent) null);
    }

    @GuardedBy("mLock")
    /* renamed from: l */
    public final void mo133882l() {
        this.f103508x.mo133823c();
    }

    @GuardedBy("mLock")
    /* renamed from: m */
    public final void mo133883m() {
        if (this.f103508x instanceof C40595n0) {
            ((C40595n0) this.f103508x).mo133994j();
        }
    }

    /* renamed from: m0 */
    public final void mo133866m0(@C0363p0 Bundle bundle) {
        this.f103498n.lock();
        try {
            this.f103508x.mo133821a(bundle);
        } finally {
            this.f103498n.unlock();
        }
    }

    /* renamed from: n */
    public final void mo133884n() {
    }

    @GuardedBy("mLock")
    /* renamed from: o */
    public final void mo133885o() {
        if (this.f103508x.mo133827g()) {
            this.f103504t.clear();
        }
    }

    /* renamed from: p */
    public final boolean mo133886p(C40640w wVar) {
        return false;
    }

    /* renamed from: q */
    public final void mo133887q(String str, @C0363p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @C0363p0 String[] strArr) {
        String concat = String.valueOf(str).concat(GlideException.C22148a.f56917d);
        printWriter.append(str).append("mState=").println(this.f103508x);
        for (C40477a aVar : this.f103506v.keySet()) {
            printWriter.append(str).append(aVar.mo133663d()).println(C33124s.f80355c);
            ((C40477a.C40489f) C40843u.m166202l((C40477a.C40489f) this.f103503s.get(aVar.mo133661b()))).mo133683r(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @C0363p0
    @GuardedBy("mLock")
    /* renamed from: r */
    public final ConnectionResult mo133888r(@C0359n0 C40477a aVar) {
        C40477a.C40480c b = aVar.mo133661b();
        if (!this.f103503s.containsKey(b)) {
            return null;
        }
        if (((C40477a.C40489f) this.f103503s.get(b)).mo133669a()) {
            return ConnectionResult.f103129S0;
        }
        if (this.f103504t.containsKey(b)) {
            return (ConnectionResult) this.f103504t.get(b);
        }
        return null;
    }

    /* renamed from: s */
    public final boolean mo133889s() {
        return this.f103508x instanceof C40515a1;
    }

    @GuardedBy("mLock")
    /* renamed from: t */
    public final ConnectionResult mo133890t(long j, TimeUnit timeUnit) {
        mo133882l();
        long nanos = timeUnit.toNanos(j);
        while (this.f103508x instanceof C40515a1) {
            if (nanos <= 0) {
                try {
                    mo133885o();
                    return new ConnectionResult(14, (PendingIntent) null);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, (PendingIntent) null);
                }
            } else {
                nanos = this.f103499o.awaitNanos(nanos);
            }
        }
        if (this.f103508x instanceof C40595n0) {
            return ConnectionResult.f103129S0;
        }
        ConnectionResult connectionResult = this.f103509y;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, (PendingIntent) null);
    }

    @GuardedBy("mLock")
    /* renamed from: u */
    public final C40538e.C40539a mo133891u(@C0359n0 C40538e.C40539a aVar) {
        aVar.mo133796s();
        this.f103508x.mo133826f(aVar);
        return aVar;
    }

    /* renamed from: v */
    public final boolean mo133892v() {
        return this.f103508x instanceof C40595n0;
    }

    @GuardedBy("mLock")
    /* renamed from: w */
    public final C40538e.C40539a mo133893w(@C0359n0 C40538e.C40539a aVar) {
        aVar.mo133796s();
        return this.f103508x.mo133828h(aVar);
    }
}
