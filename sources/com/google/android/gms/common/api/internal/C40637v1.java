package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40504h;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.service.C40838q;
import com.google.android.gms.common.util.C40965b;
import com.google.android.gms.tasks.C31049l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.v1 */
public final class C40637v1 implements C40507i.C40509b, C40507i.C40510c, C40518a4 {

    /* renamed from: n */
    public final Queue f103589n = new LinkedList();
    @NotOnlyInitialized

    /* renamed from: o */
    public final C40477a.C40489f f103590o;

    /* renamed from: p */
    public final C40525c f103591p;

    /* renamed from: q */
    public final C40559h0 f103592q;

    /* renamed from: r */
    public final Set f103593r = new HashSet();

    /* renamed from: s */
    public final Map f103594s = new HashMap();

    /* renamed from: t */
    public final int f103595t;
    @C0363p0

    /* renamed from: u */
    public final C40658z2 f103596u;

    /* renamed from: v */
    public boolean f103597v;

    /* renamed from: w */
    public final List f103598w = new ArrayList();
    @C0363p0

    /* renamed from: x */
    public ConnectionResult f103599x = null;

    /* renamed from: y */
    public int f103600y = 0;

    /* renamed from: z */
    public final /* synthetic */ C40564i f103601z;

    @C0348i1
    public C40637v1(C40564i iVar, C40504h hVar) {
        this.f103601z = iVar;
        C40477a.C40489f C = hVar.mo133710C(iVar.f103417r.getLooper(), this);
        this.f103590o = C;
        this.f103591p = hVar.mo133714h();
        this.f103592q = new C40559h0();
        this.f103595t = hVar.mo133709B();
        if (C.mo87660m()) {
            this.f103596u = hVar.mo133711D(iVar.f103408i, iVar.f103417r);
        } else {
            this.f103596u = null;
        }
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ void m165412y(C40637v1 v1Var, C40647x1 x1Var) {
        if (!v1Var.f103598w.contains(x1Var) || v1Var.f103597v) {
            return;
        }
        if (!v1Var.f103590o.mo133669a()) {
            v1Var.mo134044B();
        } else {
            v1Var.mo134060f();
        }
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ void m165413z(C40637v1 v1Var, C40647x1 x1Var) {
        Feature[] g;
        if (v1Var.f103598w.remove(x1Var)) {
            v1Var.f103601z.f103417r.removeMessages(15, x1Var);
            v1Var.f103601z.f103417r.removeMessages(16, x1Var);
            Feature a = x1Var.f103611b;
            ArrayList arrayList = new ArrayList(v1Var.f103589n.size());
            for (C40603o3 o3Var : v1Var.f103589n) {
                if ((o3Var instanceof C40549f2) && (g = ((C40549f2) o3Var).mo133898g(v1Var)) != null && C40965b.m166578d(g, a)) {
                    arrayList.add(o3Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C40603o3 o3Var2 = (C40603o3) arrayList.get(i);
                v1Var.f103589n.remove(o3Var2);
                o3Var2.mo133905b(new UnsupportedApiCallException(a));
            }
        }
    }

    @C0348i1
    /* renamed from: A */
    public final void mo134043A() {
        C40843u.m166194d(this.f103601z.f103417r);
        this.f103599x = null;
    }

    @C0348i1
    /* renamed from: B */
    public final void mo134044B() {
        C40843u.m166194d(this.f103601z.f103417r);
        if (!this.f103590o.mo133669a() && !this.f103590o.mo133673e()) {
            try {
                C40564i iVar = this.f103601z;
                int b = iVar.f103410k.mo134478b(iVar.f103408i, this.f103590o);
                if (b != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(b, (PendingIntent) null);
                    String name = this.f103590o.getClass().getName();
                    String obj = connectionResult.toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    mo134047E(connectionResult, (Exception) null);
                    return;
                }
                C40564i iVar2 = this.f103601z;
                C40477a.C40489f fVar = this.f103590o;
                C40657z1 z1Var = new C40657z1(iVar2, fVar, this.f103591p);
                if (fVar.mo87660m()) {
                    ((C40658z2) C40843u.m166202l(this.f103596u)).mo134092H8(z1Var);
                }
                try {
                    this.f103590o.mo133676h(z1Var);
                } catch (SecurityException e) {
                    mo134047E(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                mo134047E(new ConnectionResult(10), e2);
            }
        }
    }

    @C0348i1
    /* renamed from: C */
    public final void mo134045C(C40603o3 o3Var) {
        C40843u.m166194d(this.f103601z.f103417r);
        if (!this.f103590o.mo133669a()) {
            this.f103589n.add(o3Var);
            ConnectionResult connectionResult = this.f103599x;
            if (connectionResult == null || !connectionResult.mo133594X()) {
                mo134044B();
            } else {
                mo134047E(this.f103599x, (Exception) null);
            }
        } else if (mo134066l(o3Var)) {
            mo134063i();
        } else {
            this.f103589n.add(o3Var);
        }
    }

    @C0348i1
    /* renamed from: D */
    public final void mo134046D() {
        this.f103600y++;
    }

    @C0348i1
    /* renamed from: E */
    public final void mo134047E(@C0359n0 ConnectionResult connectionResult, @C0363p0 Exception exc) {
        C40843u.m166194d(this.f103601z.f103417r);
        C40658z2 z2Var = this.f103596u;
        if (z2Var != null) {
            z2Var.mo134093I8();
        }
        mo134043A();
        this.f103601z.f103410k.mo134479c();
        mo134057c(connectionResult);
        if ((this.f103590o instanceof C40838q) && connectionResult.mo133591M() != 24) {
            this.f103601z.f103405f = true;
            C40564i iVar = this.f103601z;
            iVar.f103417r.sendMessageDelayed(iVar.f103417r.obtainMessage(19), 300000);
        }
        if (connectionResult.mo133591M() == 4) {
            mo134058d(C40564i.f103399u);
        } else if (this.f103589n.isEmpty()) {
            this.f103599x = connectionResult;
        } else if (exc != null) {
            C40843u.m166194d(this.f103601z.f103417r);
            mo134059e((Status) null, exc, false);
        } else if (this.f103601z.f103418s) {
            mo134059e(C40564i.m165091i(this.f103591p, connectionResult), (Exception) null, true);
            if (!this.f103589n.isEmpty() && !mo134067m(connectionResult) && !this.f103601z.mo133952h(connectionResult, this.f103595t)) {
                if (connectionResult.mo133591M() == 18) {
                    this.f103597v = true;
                }
                if (this.f103597v) {
                    C40564i iVar2 = this.f103601z;
                    iVar2.f103417r.sendMessageDelayed(Message.obtain(iVar2.f103417r, 9, this.f103591p), this.f103601z.f103402c);
                    return;
                }
                mo134058d(C40564i.m165091i(this.f103591p, connectionResult));
            }
        } else {
            mo134058d(C40564i.m165091i(this.f103591p, connectionResult));
        }
    }

    @C0348i1
    /* renamed from: F */
    public final void mo134048F(@C0359n0 ConnectionResult connectionResult) {
        C40843u.m166194d(this.f103601z.f103417r);
        C40477a.C40489f fVar = this.f103590o;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        fVar.mo133672d("onSignInFailed for " + name + " with " + valueOf);
        mo134047E(connectionResult, (Exception) null);
    }

    @C0348i1
    /* renamed from: G */
    public final void mo134049G(C40618r3 r3Var) {
        C40843u.m166194d(this.f103601z.f103417r);
        this.f103593r.add(r3Var);
    }

    @C0348i1
    /* renamed from: H */
    public final void mo134050H() {
        C40843u.m166194d(this.f103601z.f103417r);
        if (this.f103597v) {
            mo134044B();
        }
    }

    /* renamed from: H0 */
    public final void mo133865H0(int i) {
        if (Looper.myLooper() == this.f103601z.f103417r.getLooper()) {
            mo134062h(i);
        } else {
            this.f103601z.f103417r.post(new C40621s1(this, i));
        }
    }

    @C0348i1
    /* renamed from: I */
    public final void mo134051I() {
        C40843u.m166194d(this.f103601z.f103417r);
        mo134058d(C40564i.f103398t);
        this.f103592q.mo133913f();
        for (C40592n.C40593a n3Var : (C40592n.C40593a[]) this.f103594s.keySet().toArray(new C40592n.C40593a[0])) {
            mo134045C(new C40598n3(n3Var, new C31049l()));
        }
        mo134057c(new ConnectionResult(4));
        if (this.f103590o.mo133669a()) {
            this.f103590o.mo133682q(new C40632u1(this));
        }
    }

    @C0348i1
    /* renamed from: J */
    public final void mo134052J() {
        Status status;
        C40843u.m166194d(this.f103601z.f103417r);
        if (this.f103597v) {
            mo134065k();
            C40564i iVar = this.f103601z;
            if (iVar.f103409j.mo134208j(iVar.f103408i) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            mo134058d(status);
            this.f103590o.mo133672d("Timing out connection while resuming.");
        }
    }

    /* renamed from: L */
    public final boolean mo134053L() {
        return this.f103590o.mo133669a();
    }

    /* renamed from: M */
    public final boolean mo134054M() {
        return this.f103590o.mo87660m();
    }

    @C0348i1
    /* renamed from: O0 */
    public final void mo133896O0(@C0359n0 ConnectionResult connectionResult) {
        mo134047E(connectionResult, (Exception) null);
    }

    /* renamed from: T6 */
    public final void mo133838T6(ConnectionResult connectionResult, C40477a aVar, boolean z) {
        throw null;
    }

    @C0348i1
    /* renamed from: a */
    public final boolean mo134055a() {
        return mo134068n(true);
    }

    @C0348i1
    @C0363p0
    /* renamed from: b */
    public final Feature mo134056b(@C0363p0 Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] u = this.f103590o.mo133684u();
            if (u == null) {
                u = new Feature[0];
            }
            C1866a aVar = new C1866a(r3);
            for (Feature feature : u) {
                aVar.put(feature.mo133601M(), Long.valueOf(feature.mo133602Q()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) aVar.get(feature2.mo133601M());
                if (l == null || l.longValue() < feature2.mo133602Q()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    @C0348i1
    /* renamed from: c */
    public final void mo134057c(ConnectionResult connectionResult) {
        String str;
        for (C40618r3 r3Var : this.f103593r) {
            if (C40808s.m166010b(connectionResult, ConnectionResult.f103129S0)) {
                str = this.f103590o.mo133675g();
            } else {
                str = null;
            }
            r3Var.mo134022c(this.f103591p, connectionResult, str);
        }
        this.f103593r.clear();
    }

    @C0348i1
    /* renamed from: d */
    public final void mo134058d(Status status) {
        C40843u.m166194d(this.f103601z.f103417r);
        mo134059e(status, (Exception) null, false);
    }

    @C0348i1
    /* renamed from: e */
    public final void mo134059e(@C0363p0 Status status, @C0363p0 Exception exc, boolean z) {
        boolean z2;
        C40843u.m166194d(this.f103601z.f103417r);
        boolean z3 = false;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc == null) {
            z3 = true;
        }
        if (z2 != z3) {
            Iterator it = this.f103589n.iterator();
            while (it.hasNext()) {
                C40603o3 o3Var = (C40603o3) it.next();
                if (!z || o3Var.f103521a == 2) {
                    if (status != null) {
                        o3Var.mo133904a(status);
                    } else {
                        o3Var.mo133905b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    @C0348i1
    /* renamed from: f */
    public final void mo134060f() {
        ArrayList arrayList = new ArrayList(this.f103589n);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C40603o3 o3Var = (C40603o3) arrayList.get(i);
            if (this.f103590o.mo133669a()) {
                if (mo134066l(o3Var)) {
                    this.f103589n.remove(o3Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @C0348i1
    /* renamed from: g */
    public final void mo134061g() {
        mo134043A();
        mo134057c(ConnectionResult.f103129S0);
        mo134065k();
        Iterator it = this.f103594s.values().iterator();
        while (it.hasNext()) {
            C40602o2 o2Var = (C40602o2) it.next();
            if (mo134056b(o2Var.f103518a.mo134029c()) != null) {
                it.remove();
            } else {
                try {
                    o2Var.f103518a.mo134013d(this.f103590o, new C31049l());
                } catch (DeadObjectException unused) {
                    mo133865H0(3);
                    this.f103590o.mo133672d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        mo134060f();
        mo134063i();
    }

    @C0348i1
    /* renamed from: h */
    public final void mo134062h(int i) {
        mo134043A();
        this.f103597v = true;
        this.f103592q.mo133912e(i, this.f103590o.mo133685w());
        C40564i iVar = this.f103601z;
        iVar.f103417r.sendMessageDelayed(Message.obtain(iVar.f103417r, 9, this.f103591p), this.f103601z.f103402c);
        C40564i iVar2 = this.f103601z;
        iVar2.f103417r.sendMessageDelayed(Message.obtain(iVar2.f103417r, 11, this.f103591p), this.f103601z.f103403d);
        this.f103601z.f103410k.mo134479c();
        for (C40602o2 o2Var : this.f103594s.values()) {
            o2Var.f103520c.run();
        }
    }

    /* renamed from: i */
    public final void mo134063i() {
        this.f103601z.f103417r.removeMessages(12, this.f103591p);
        C40564i iVar = this.f103601z;
        iVar.f103417r.sendMessageDelayed(iVar.f103417r.obtainMessage(12, this.f103591p), this.f103601z.f103404e);
    }

    @C0348i1
    /* renamed from: j */
    public final void mo134064j(C40603o3 o3Var) {
        o3Var.mo133907d(this.f103592q, mo134054M());
        try {
            o3Var.mo133906c(this);
        } catch (DeadObjectException unused) {
            mo133865H0(1);
            this.f103590o.mo133672d("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    @C0348i1
    /* renamed from: k */
    public final void mo134065k() {
        if (this.f103597v) {
            this.f103601z.f103417r.removeMessages(11, this.f103591p);
            this.f103601z.f103417r.removeMessages(9, this.f103591p);
            this.f103597v = false;
        }
    }

    @C0348i1
    /* renamed from: l */
    public final boolean mo134066l(C40603o3 o3Var) {
        if (!(o3Var instanceof C40549f2)) {
            mo134064j(o3Var);
            return true;
        }
        C40549f2 f2Var = (C40549f2) o3Var;
        Feature b = mo134056b(f2Var.mo133898g(this));
        if (b == null) {
            mo134064j(o3Var);
            return true;
        }
        String name = this.f103590o.getClass().getName();
        String M = b.mo133601M();
        long Q = b.mo133602Q();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(M);
        sb.append(", ");
        sb.append(Q);
        sb.append(").");
        if (!this.f103601z.f103418s || !f2Var.mo133897f(this)) {
            f2Var.mo133905b(new UnsupportedApiCallException(b));
            return true;
        }
        C40647x1 x1Var = new C40647x1(this.f103591p, b, (C40642w1) null);
        int indexOf = this.f103598w.indexOf(x1Var);
        if (indexOf >= 0) {
            C40647x1 x1Var2 = (C40647x1) this.f103598w.get(indexOf);
            this.f103601z.f103417r.removeMessages(15, x1Var2);
            C40564i iVar = this.f103601z;
            iVar.f103417r.sendMessageDelayed(Message.obtain(iVar.f103417r, 15, x1Var2), this.f103601z.f103402c);
            return false;
        }
        this.f103598w.add(x1Var);
        C40564i iVar2 = this.f103601z;
        iVar2.f103417r.sendMessageDelayed(Message.obtain(iVar2.f103417r, 15, x1Var), this.f103601z.f103402c);
        C40564i iVar3 = this.f103601z;
        iVar3.f103417r.sendMessageDelayed(Message.obtain(iVar3.f103417r, 16, x1Var), this.f103601z.f103403d);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (mo134067m(connectionResult)) {
            return false;
        }
        this.f103601z.mo133952h(connectionResult, this.f103595t);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    @androidx.annotation.C0348i1
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo134067m(@androidx.annotation.C0359n0 com.google.android.gms.common.ConnectionResult r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C40564i.f103400v
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.i r1 = r3.f103601z     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.i0 r2 = r1.f103414o     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f103415p     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.c r2 = r3.f103591p     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.i r1 = r3.f103601z     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.i0 r1 = r1.f103414o     // Catch:{ all -> 0x002a }
            int r2 = r3.f103595t     // Catch:{ all -> 0x002a }
            r1.mo134078t(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C40637v1.mo134067m(com.google.android.gms.common.ConnectionResult):boolean");
    }

    /* renamed from: m0 */
    public final void mo133866m0(@C0363p0 Bundle bundle) {
        if (Looper.myLooper() == this.f103601z.f103417r.getLooper()) {
            mo134061g();
        } else {
            this.f103601z.f103417r.post(new C40616r1(this));
        }
    }

    @C0348i1
    /* renamed from: n */
    public final boolean mo134068n(boolean z) {
        C40843u.m166194d(this.f103601z.f103417r);
        if (!this.f103590o.mo133669a() || this.f103594s.size() != 0) {
            return false;
        }
        if (this.f103592q.mo133914g()) {
            if (z) {
                mo134063i();
            }
            return false;
        }
        this.f103590o.mo133672d("Timing out service connection.");
        return true;
    }

    /* renamed from: o */
    public final int mo134069o() {
        return this.f103595t;
    }

    @C0348i1
    /* renamed from: p */
    public final int mo134070p() {
        return this.f103600y;
    }

    @C0348i1
    @C0363p0
    /* renamed from: q */
    public final ConnectionResult mo134071q() {
        C40843u.m166194d(this.f103601z.f103417r);
        return this.f103599x;
    }

    /* renamed from: s */
    public final C40477a.C40489f mo134072s() {
        return this.f103590o;
    }

    /* renamed from: u */
    public final Map mo134073u() {
        return this.f103594s;
    }
}
