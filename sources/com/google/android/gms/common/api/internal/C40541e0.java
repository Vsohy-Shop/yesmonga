package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import androidx.compose.runtime.C8698y1;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.gms.common.C40715h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.base.C41079p;
import com.google.android.gms.internal.base.C41084u;
import com.google.firebase.installations.C33124s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
public final class C40541e0 implements C40555g2 {
    @GuardedBy("mLock")

    /* renamed from: A */
    public int f103345A = 0;

    /* renamed from: n */
    public final Context f103346n;

    /* renamed from: o */
    public final C40572j1 f103347o;

    /* renamed from: p */
    public final Looper f103348p;

    /* renamed from: q */
    public final C40596n1 f103349q;

    /* renamed from: r */
    public final C40596n1 f103350r;

    /* renamed from: s */
    public final Map f103351s;

    /* renamed from: t */
    public final Set f103352t = Collections.newSetFromMap(new WeakHashMap());
    @C0363p0

    /* renamed from: u */
    public final C40477a.C40489f f103353u;
    @C0363p0

    /* renamed from: v */
    public Bundle f103354v;
    @C0363p0

    /* renamed from: w */
    public ConnectionResult f103355w = null;
    @C0363p0

    /* renamed from: x */
    public ConnectionResult f103356x = null;

    /* renamed from: y */
    public boolean f103357y = false;

    /* renamed from: z */
    public final Lock f103358z;

    public C40541e0(Context context, C40572j1 j1Var, Lock lock, Looper looper, C40715h hVar, Map map, Map map2, C40756f fVar, C40477a.C40478a aVar, @C0363p0 C40477a.C40489f fVar2, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f103346n = context;
        this.f103347o = j1Var;
        this.f103358z = lock;
        this.f103348p = looper;
        this.f103353u = fVar2;
        Context context2 = context;
        C40572j1 j1Var2 = j1Var;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C40715h hVar2 = hVar;
        C40596n1 n1Var = r3;
        C40596n1 n1Var2 = new C40596n1(context2, j1Var2, lock2, looper2, hVar2, map2, (C40756f) null, map4, (C40477a.C40478a) null, arrayList2, new C40537d4(this, (C40530c4) null));
        this.f103349q = n1Var;
        this.f103350r = new C40596n1(context2, j1Var2, lock2, looper2, hVar2, map, fVar, map3, aVar, arrayList, new C40551f4(this, (C40545e4) null));
        C1866a aVar2 = new C1866a();
        for (C40477a.C40480c put : map2.keySet()) {
            aVar2.put(put, this.f103349q);
        }
        for (C40477a.C40480c put2 : map.keySet()) {
            aVar2.put(put2, this.f103350r);
        }
        this.f103351s = Collections.unmodifiableMap(aVar2);
    }

    /* renamed from: A */
    public static /* bridge */ /* synthetic */ void m164985A(C40541e0 e0Var, int i, boolean z) {
        e0Var.f103347o.mo133868b(i, z);
        e0Var.f103356x = null;
        e0Var.f103355w = null;
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ void m164986B(C40541e0 e0Var, Bundle bundle) {
        Bundle bundle2 = e0Var.f103354v;
        if (bundle2 == null) {
            e0Var.f103354v = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: C */
    public static /* bridge */ /* synthetic */ void m164987C(C40541e0 e0Var) {
        ConnectionResult connectionResult;
        if (m164989e(e0Var.f103355w)) {
            if (m164989e(e0Var.f103356x) || e0Var.mo133879c()) {
                int i = e0Var.f103345A;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        e0Var.f103345A = 0;
                        return;
                    }
                    ((C40572j1) C40843u.m166202l(e0Var.f103347o)).mo133867a(e0Var.f103354v);
                }
                e0Var.mo133878b();
                e0Var.f103345A = 0;
                return;
            }
            ConnectionResult connectionResult2 = e0Var.f103356x;
            if (connectionResult2 == null) {
                return;
            }
            if (e0Var.f103345A == 1) {
                e0Var.mo133878b();
                return;
            }
            e0Var.mo133877a(connectionResult2);
            e0Var.f103349q.mo133885o();
        } else if (e0Var.f103355w == null || !m164989e(e0Var.f103356x)) {
            ConnectionResult connectionResult3 = e0Var.f103355w;
            if (connectionResult3 != null && (connectionResult = e0Var.f103356x) != null) {
                if (e0Var.f103350r.f103510z < e0Var.f103349q.f103510z) {
                    connectionResult3 = connectionResult;
                }
                e0Var.mo133877a(connectionResult3);
            }
        } else {
            e0Var.f103350r.mo133885o();
            e0Var.mo133877a((ConnectionResult) C40843u.m166202l(e0Var.f103355w));
        }
    }

    /* renamed from: e */
    public static boolean m164989e(@C0363p0 ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo133595e0();
    }

    /* renamed from: g */
    public static C40541e0 m164991g(Context context, C40572j1 j1Var, Lock lock, Looper looper, C40715h hVar, Map map, C40756f fVar, Map map2, C40477a.C40478a aVar, ArrayList arrayList) {
        Map map3 = map2;
        C1866a aVar2 = new C1866a();
        C1866a aVar3 = new C1866a();
        C40477a.C40489f fVar2 = null;
        for (Map.Entry entry : map.entrySet()) {
            C40477a.C40489f fVar3 = (C40477a.C40489f) entry.getValue();
            if (true == fVar3.mo133671c()) {
                fVar2 = fVar3;
            }
            if (fVar3.mo87660m()) {
                aVar2.put((C40477a.C40480c) entry.getKey(), fVar3);
            } else {
                aVar3.put((C40477a.C40480c) entry.getKey(), fVar3);
            }
        }
        C40843u.m166209s(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C1866a aVar4 = new C1866a();
        C1866a aVar5 = new C1866a();
        for (C40477a aVar6 : map2.keySet()) {
            C40477a.C40480c b = aVar6.mo133661b();
            if (aVar2.containsKey(b)) {
                aVar4.put(aVar6, (Boolean) map3.get(aVar6));
            } else if (aVar3.containsKey(b)) {
                aVar5.put(aVar6, (Boolean) map3.get(aVar6));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C40659z3 z3Var = (C40659z3) arrayList.get(i);
            if (aVar4.containsKey(z3Var.f103632n)) {
                arrayList2.add(z3Var);
            } else if (aVar5.containsKey(z3Var.f103632n)) {
                arrayList3.add(z3Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new C40541e0(context, j1Var, lock, looper, hVar, aVar2, aVar3, fVar, aVar, fVar2, arrayList2, arrayList3, aVar4, aVar5);
    }

    @C0363p0
    /* renamed from: E */
    public final PendingIntent mo133876E() {
        if (this.f103353u == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f103346n, System.identityHashCode(this.f103347o), this.f103353u.mo133686x(), C41079p.f104372a | C8698y1.f23301m);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo133877a(ConnectionResult connectionResult) {
        int i = this.f103345A;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f103345A = 0;
            }
            this.f103347o.mo133869c(connectionResult);
        }
        mo133878b();
        this.f103345A = 0;
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final void mo133878b() {
        for (C40640w a : this.f103352t) {
            a.mo134079a();
        }
        this.f103352t.clear();
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final boolean mo133879c() {
        ConnectionResult connectionResult = this.f103356x;
        return connectionResult != null && connectionResult.mo133591M() == 4;
    }

    /* renamed from: d */
    public final boolean mo133880d(C40538e.C40539a aVar) {
        C40596n1 n1Var = (C40596n1) this.f103351s.get(aVar.mo133874y());
        C40843u.m166203m(n1Var, "GoogleApiClient is not configured to use the API required for this call.");
        return n1Var.equals(this.f103350r);
    }

    @GuardedBy("mLock")
    /* renamed from: k */
    public final ConnectionResult mo133881k() {
        throw new UnsupportedOperationException();
    }

    @GuardedBy("mLock")
    /* renamed from: l */
    public final void mo133882l() {
        this.f103345A = 2;
        this.f103357y = false;
        this.f103356x = null;
        this.f103355w = null;
        this.f103349q.mo133882l();
        this.f103350r.mo133882l();
    }

    @GuardedBy("mLock")
    /* renamed from: m */
    public final void mo133883m() {
        this.f103349q.mo133883m();
        this.f103350r.mo133883m();
    }

    /* renamed from: n */
    public final void mo133884n() {
        this.f103358z.lock();
        try {
            boolean s = mo133889s();
            this.f103350r.mo133885o();
            this.f103356x = new ConnectionResult(4);
            if (s) {
                new C41084u(this.f103348p).post(new C40524b4(this));
            } else {
                mo133878b();
            }
        } finally {
            this.f103358z.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: o */
    public final void mo133885o() {
        this.f103356x = null;
        this.f103355w = null;
        this.f103345A = 0;
        this.f103349q.mo133885o();
        this.f103350r.mo133885o();
        mo133878b();
    }

    /* renamed from: p */
    public final boolean mo133886p(C40640w wVar) {
        this.f103358z.lock();
        try {
            if ((mo133889s() || mo133892v()) && !this.f103350r.mo133892v()) {
                this.f103352t.add(wVar);
                if (this.f103345A == 0) {
                    this.f103345A = 1;
                }
                this.f103356x = null;
                this.f103350r.mo133882l();
                return true;
            }
            this.f103358z.unlock();
            return false;
        } finally {
            this.f103358z.unlock();
        }
    }

    /* renamed from: q */
    public final void mo133887q(String str, @C0363p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @C0363p0 String[] strArr) {
        printWriter.append(str).append("authClient").println(C33124s.f80355c);
        this.f103350r.mo133887q(String.valueOf(str).concat(GlideException.C22148a.f56917d), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(C33124s.f80355c);
        this.f103349q.mo133887q(String.valueOf(str).concat(GlideException.C22148a.f56917d), fileDescriptor, printWriter, strArr);
    }

    @C0363p0
    @GuardedBy("mLock")
    /* renamed from: r */
    public final ConnectionResult mo133888r(@C0359n0 C40477a aVar) {
        if (!C40808s.m166010b(this.f103351s.get(aVar.mo133661b()), this.f103350r)) {
            return this.f103349q.mo133888r(aVar);
        }
        if (mo133879c()) {
            return new ConnectionResult(4, mo133876E());
        }
        return this.f103350r.mo133888r(aVar);
    }

    /* renamed from: s */
    public final boolean mo133889s() {
        boolean z;
        this.f103358z.lock();
        try {
            if (this.f103345A == 2) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.f103358z.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: t */
    public final ConnectionResult mo133890t(long j, @C0359n0 TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @GuardedBy("mLock")
    /* renamed from: u */
    public final C40538e.C40539a mo133891u(@C0359n0 C40538e.C40539a aVar) {
        if (!mo133880d(aVar)) {
            this.f103349q.mo133891u(aVar);
            return aVar;
        } else if (mo133879c()) {
            aVar.mo85730b(new Status(4, (String) null, mo133876E()));
            return aVar;
        } else {
            this.f103350r.mo133891u(aVar);
            return aVar;
        }
    }

    /* renamed from: v */
    public final boolean mo133892v() {
        this.f103358z.lock();
        try {
            boolean z = false;
            if (this.f103349q.mo133892v() && (this.f103350r.mo133892v() || mo133879c() || this.f103345A == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.f103358z.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: w */
    public final C40538e.C40539a mo133893w(@C0359n0 C40538e.C40539a aVar) {
        if (!mo133880d(aVar)) {
            return this.f103349q.mo133893w(aVar);
        }
        if (!mo133879c()) {
            return this.f103350r.mo133893w(aVar);
        }
        aVar.mo85730b(new Status(4, (String) null, mo133876E()));
        return aVar;
    }
}
