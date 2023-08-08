package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.C40715h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40770i0;
import com.google.android.gms.common.internal.C40785m;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.C30979f;
import com.google.android.gms.signin.internal.zak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.a1 */
public final class C40515a1 implements C40579k1 {

    /* renamed from: a */
    public final C40596n1 f103299a;

    /* renamed from: b */
    public final Lock f103300b;

    /* renamed from: c */
    public final Context f103301c;

    /* renamed from: d */
    public final C40715h f103302d;
    @C0363p0

    /* renamed from: e */
    public ConnectionResult f103303e;

    /* renamed from: f */
    public int f103304f;

    /* renamed from: g */
    public int f103305g = 0;

    /* renamed from: h */
    public int f103306h;

    /* renamed from: i */
    public final Bundle f103307i = new Bundle();

    /* renamed from: j */
    public final Set f103308j = new HashSet();
    @C0363p0

    /* renamed from: k */
    public C30979f f103309k;

    /* renamed from: l */
    public boolean f103310l;

    /* renamed from: m */
    public boolean f103311m;

    /* renamed from: n */
    public boolean f103312n;
    @C0363p0

    /* renamed from: o */
    public C40785m f103313o;

    /* renamed from: p */
    public boolean f103314p;

    /* renamed from: q */
    public boolean f103315q;
    @C0363p0

    /* renamed from: r */
    public final C40756f f103316r;

    /* renamed from: s */
    public final Map f103317s;
    @C0363p0

    /* renamed from: t */
    public final C40477a.C40478a f103318t;

    /* renamed from: u */
    public final ArrayList f103319u = new ArrayList();

    public C40515a1(C40596n1 n1Var, @C0363p0 C40756f fVar, Map map, C40715h hVar, @C0363p0 C40477a.C40478a aVar, Lock lock, Context context) {
        this.f103299a = n1Var;
        this.f103316r = fVar;
        this.f103317s = map;
        this.f103302d = hVar;
        this.f103318t = aVar;
        this.f103300b = lock;
        this.f103301c = context;
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ void m164892B(C40515a1 a1Var, zak zak) {
        if (a1Var.mo133835o(0)) {
            ConnectionResult M = zak.mo87677M();
            if (M.mo133595e0()) {
                zav zav = (zav) C40843u.m166202l(zak.mo87678Q());
                ConnectionResult M2 = zav.mo134521M();
                if (!M2.mo133595e0()) {
                    String valueOf = String.valueOf(M2);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    a1Var.mo133832l(M2);
                    return;
                }
                a1Var.f103312n = true;
                a1Var.f103313o = (C40785m) C40843u.m166202l(zav.mo134522Q());
                a1Var.f103314p = zav.mo134523W();
                a1Var.f103315q = zav.mo134524X();
                a1Var.mo133834n();
            } else if (a1Var.mo133837q(M)) {
                a1Var.mo133829i();
                a1Var.mo133834n();
            } else {
                a1Var.mo133832l(M);
            }
        }
    }

    /* renamed from: r */
    public static final String m164900r(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ Set m164907y(C40515a1 a1Var) {
        C40756f fVar = a1Var.f103316r;
        if (fVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(fVar.mo134388i());
        Map n = a1Var.f103316r.mo134393n();
        for (C40477a aVar : n.keySet()) {
            if (!a1Var.f103299a.f103504t.containsKey(aVar.mo133661b())) {
                hashSet.addAll(((C40770i0) n.get(aVar)).f103881a);
            }
        }
        return hashSet;
    }

    /* renamed from: J */
    public final void mo133820J() {
        ArrayList arrayList = this.f103319u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.f103319u.clear();
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo133821a(@C0363p0 Bundle bundle) {
        if (mo133835o(1)) {
            if (bundle != null) {
                this.f103307i.putAll(bundle);
            }
            if (mo133836p()) {
                mo133831k();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.google.android.gms.common.api.a$f, com.google.android.gms.signin.f] */
    @GuardedBy("mLock")
    /* renamed from: b */
    public final void mo133822b() {
        boolean z;
        this.f103299a.f103504t.clear();
        this.f103311m = false;
        this.f103303e = null;
        this.f103305g = 0;
        this.f103310l = true;
        this.f103312n = false;
        this.f103314p = false;
        HashMap hashMap = new HashMap();
        boolean z2 = false;
        for (C40477a aVar : this.f103317s.keySet()) {
            C40477a.C40489f fVar = (C40477a.C40489f) C40843u.m166202l((C40477a.C40489f) this.f103299a.f103503s.get(aVar.mo133661b()));
            if (aVar.mo133662c().mo133668b() == 1) {
                z = true;
            } else {
                z = false;
            }
            z2 |= z;
            boolean booleanValue = ((Boolean) this.f103317s.get(aVar)).booleanValue();
            if (fVar.mo87660m()) {
                this.f103311m = true;
                if (booleanValue) {
                    this.f103308j.add(aVar.mo133661b());
                } else {
                    this.f103310l = false;
                }
            }
            hashMap.put(fVar, new C40605p0(this, aVar, booleanValue));
        }
        if (z2) {
            this.f103311m = false;
        }
        if (this.f103311m) {
            C40843u.m166202l(this.f103316r);
            C40843u.m166202l(this.f103318t);
            this.f103316r.mo134394o(Integer.valueOf(System.identityHashCode(this.f103299a.f103496A)));
            C40646x0 x0Var = new C40646x0(this, (C40641w0) null);
            C40477a.C40478a aVar2 = this.f103318t;
            Context context = this.f103301c;
            Looper r = this.f103299a.f103496A.mo133757r();
            C40756f fVar2 = this.f103316r;
            this.f103309k = aVar2.mo85653c(context, r, fVar2, fVar2.mo134390k(), x0Var, x0Var);
        }
        this.f103306h = this.f103299a.f103503s.size();
        this.f103319u.add(C40601o1.m165309a().submit(new C40620s0(this, hashMap)));
    }

    /* renamed from: c */
    public final void mo133823c() {
    }

    @GuardedBy("mLock")
    /* renamed from: d */
    public final void mo133824d(ConnectionResult connectionResult, C40477a aVar, boolean z) {
        if (mo133835o(1)) {
            mo133833m(connectionResult, aVar, z);
            if (mo133836p()) {
                mo133831k();
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: e */
    public final void mo133825e(int i) {
        mo133832l(new ConnectionResult(8, (PendingIntent) null));
    }

    /* renamed from: f */
    public final C40538e.C40539a mo133826f(C40538e.C40539a aVar) {
        this.f103299a.f103496A.f103443k.add(aVar);
        return aVar;
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    public final boolean mo133827g() {
        mo133820J();
        mo133830j(true);
        this.f103299a.mo133997e((ConnectionResult) null);
        return true;
    }

    /* renamed from: h */
    public final C40538e.C40539a mo133828h(C40538e.C40539a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @GuardedBy("mLock")
    /* renamed from: i */
    public final void mo133829i() {
        this.f103311m = false;
        this.f103299a.f103496A.f103451s = Collections.emptySet();
        for (C40477a.C40480c cVar : this.f103308j) {
            if (!this.f103299a.f103504t.containsKey(cVar)) {
                this.f103299a.f103504t.put(cVar, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: j */
    public final void mo133830j(boolean z) {
        C30979f fVar = this.f103309k;
        if (fVar != null) {
            if (fVar.mo133669a() && z) {
                fVar.mo87655i();
            }
            fVar.mo133674f();
            C40756f fVar2 = (C40756f) C40843u.m166202l(this.f103316r);
            this.f103313o = null;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: k */
    public final void mo133831k() {
        Bundle bundle;
        this.f103299a.mo133995c();
        C40601o1.m165309a().execute(new C40600o0(this));
        C30979f fVar = this.f103309k;
        if (fVar != null) {
            if (this.f103314p) {
                fVar.mo87658v((C40785m) C40843u.m166202l(this.f103313o), this.f103315q);
            }
            mo133830j(false);
        }
        for (C40477a.C40480c cVar : this.f103299a.f103504t.keySet()) {
            ((C40477a.C40489f) C40843u.m166202l((C40477a.C40489f) this.f103299a.f103503s.get(cVar))).mo133674f();
        }
        if (this.f103307i.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f103307i;
        }
        this.f103299a.f103497B.mo133867a(bundle);
    }

    @GuardedBy("mLock")
    /* renamed from: l */
    public final void mo133832l(ConnectionResult connectionResult) {
        mo133820J();
        mo133830j(!connectionResult.mo133594X());
        this.f103299a.mo133997e(connectionResult);
        this.f103299a.f103497B.mo133869c(connectionResult);
    }

    @GuardedBy("mLock")
    /* renamed from: m */
    public final void mo133833m(ConnectionResult connectionResult, C40477a aVar, boolean z) {
        int b = aVar.mo133662c().mo133668b();
        if ((!z || connectionResult.mo133594X() || this.f103302d.mo134222d(connectionResult.mo133591M()) != null) && (this.f103303e == null || b < this.f103304f)) {
            this.f103303e = connectionResult;
            this.f103304f = b;
        }
        this.f103299a.f103504t.put(aVar.mo133661b(), connectionResult);
    }

    @GuardedBy("mLock")
    /* renamed from: n */
    public final void mo133834n() {
        if (this.f103306h == 0) {
            if (!this.f103311m || this.f103312n) {
                ArrayList arrayList = new ArrayList();
                this.f103305g = 1;
                this.f103306h = this.f103299a.f103503s.size();
                for (C40477a.C40480c cVar : this.f103299a.f103503s.keySet()) {
                    if (!this.f103299a.f103504t.containsKey(cVar)) {
                        arrayList.add((C40477a.C40489f) this.f103299a.f103503s.get(cVar));
                    } else if (mo133836p()) {
                        mo133831k();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f103319u.add(C40601o1.m165309a().submit(new C40625t0(this, arrayList)));
                }
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: o */
    public final boolean mo133835o(int i) {
        if (this.f103305g == i) {
            return true;
        }
        this.f103299a.f103496A.mo133969M();
        "Unexpected callback in ".concat(toString());
        int i2 = this.f103306h;
        StringBuilder sb = new StringBuilder();
        sb.append("mRemainingConnections=");
        sb.append(i2);
        int i3 = this.f103305g;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(m164900r(i3));
        sb2.append(" but received callback for step ");
        sb2.append(m164900r(i));
        new Exception();
        mo133832l(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }

    @GuardedBy("mLock")
    /* renamed from: p */
    public final boolean mo133836p() {
        int i = this.f103306h - 1;
        this.f103306h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            this.f103299a.f103496A.mo133969M();
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            mo133832l(new ConnectionResult(8, (PendingIntent) null));
            return false;
        }
        ConnectionResult connectionResult = this.f103303e;
        if (connectionResult == null) {
            return true;
        }
        this.f103299a.f103510z = this.f103304f;
        mo133832l(connectionResult);
        return false;
    }

    @GuardedBy("mLock")
    /* renamed from: q */
    public final boolean mo133837q(ConnectionResult connectionResult) {
        return this.f103310l && !connectionResult.mo133594X();
    }
}
