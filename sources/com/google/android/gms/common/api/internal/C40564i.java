package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1869c;
import com.google.android.gms.common.C40713g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40504h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.common.internal.C40730a0;
import com.google.android.gms.common.internal.C40734b0;
import com.google.android.gms.common.internal.C40773j;
import com.google.android.gms.common.internal.C40810s0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40849w;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.util.C40986l;
import com.google.android.gms.internal.base.C41084u;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.urbanairship.util.RetryingExecutor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

@C40473a
@C40858y
/* renamed from: com.google.android.gms.common.api.internal.i */
public class C40564i implements Handler.Callback {
    @C0359n0

    /* renamed from: t */
    public static final Status f103398t = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: u */
    public static final Status f103399u = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: v */
    public static final Object f103400v = new Object();
    @C0363p0
    @GuardedBy("lock")

    /* renamed from: w */
    public static C40564i f103401w;

    /* renamed from: c */
    public long f103402c = 5000;

    /* renamed from: d */
    public long f103403d = RetryingExecutor.f26394v;

    /* renamed from: e */
    public long f103404e = 10000;

    /* renamed from: f */
    public boolean f103405f = false;
    @C0363p0

    /* renamed from: g */
    public TelemetryData f103406g;
    @C0363p0

    /* renamed from: h */
    public C40734b0 f103407h;

    /* renamed from: i */
    public final Context f103408i;

    /* renamed from: j */
    public final C40713g f103409j;

    /* renamed from: k */
    public final C40810s0 f103410k;

    /* renamed from: l */
    public final AtomicInteger f103411l = new AtomicInteger(1);

    /* renamed from: m */
    public final AtomicInteger f103412m = new AtomicInteger(0);

    /* renamed from: n */
    public final Map f103413n = new ConcurrentHashMap(5, 0.75f, 1);
    @C0363p0
    @GuardedBy("lock")

    /* renamed from: o */
    public C40565i0 f103414o = null;
    @GuardedBy("lock")

    /* renamed from: p */
    public final Set f103415p = new C1869c();

    /* renamed from: q */
    public final Set f103416q = new C1869c();
    @NotOnlyInitialized

    /* renamed from: r */
    public final Handler f103417r;

    /* renamed from: s */
    public volatile boolean f103418s = true;

    @C40473a
    public C40564i(Context context, Looper looper, C40713g gVar) {
        this.f103408i = context;
        C41084u uVar = new C41084u(looper, this);
        this.f103417r = uVar;
        this.f103409j = gVar;
        this.f103410k = new C40810s0(gVar);
        if (C40986l.m166640a(context)) {
            this.f103418s = false;
        }
        uVar.sendMessage(uVar.obtainMessage(6));
    }

    @C40473a
    /* renamed from: a */
    public static void m165089a() {
        synchronized (f103400v) {
            C40564i iVar = f103401w;
            if (iVar != null) {
                iVar.f103412m.incrementAndGet();
                Handler handler = iVar.f103417r;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* renamed from: i */
    public static Status m165091i(C40525c cVar, ConnectionResult connectionResult) {
        String b = cVar.mo133841b();
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, "API: " + b + " is not available on this device. Connection failed with: " + valueOf);
    }

    @C0359n0
    /* renamed from: y */
    public static C40564i m165101y() {
        C40564i iVar;
        synchronized (f103400v) {
            C40843u.m166203m(f103401w, "Must guarantee manager is non-null before using getInstance");
            iVar = f103401w;
        }
        return iVar;
    }

    @C0359n0
    /* renamed from: z */
    public static C40564i m165102z(@C0359n0 Context context) {
        C40564i iVar;
        synchronized (f103400v) {
            if (f103401w == null) {
                f103401w = new C40564i(context.getApplicationContext(), C40773j.m165915e().getLooper(), C40713g.m165640x());
            }
            iVar = f103401w;
        }
        return iVar;
    }

    @C0359n0
    /* renamed from: B */
    public final C31047k mo133939B(@C0359n0 Iterable iterable) {
        C40618r3 r3Var = new C40618r3(iterable);
        Handler handler = this.f103417r;
        handler.sendMessage(handler.obtainMessage(2, r3Var));
        return r3Var.mo134020a();
    }

    @C0359n0
    /* renamed from: C */
    public final C31047k mo133940C(@C0359n0 C40504h hVar) {
        C40571j0 j0Var = new C40571j0(hVar.mo133714h());
        Handler handler = this.f103417r;
        handler.sendMessage(handler.obtainMessage(14, j0Var));
        return j0Var.mo133968b().mo87741a();
    }

    @C0359n0
    /* renamed from: D */
    public final C31047k mo133941D(@C0359n0 C40504h hVar, @C0359n0 C40624t tVar, @C0359n0 C40526c0 c0Var, @C0359n0 Runnable runnable) {
        C31049l lVar = new C31049l();
        mo133957m(lVar, tVar.mo134030e(), hVar);
        C40586l3 l3Var = new C40586l3(new C40602o2(tVar, c0Var, runnable), lVar);
        Handler handler = this.f103417r;
        handler.sendMessage(handler.obtainMessage(8, new C40597n2(l3Var, this.f103412m.get(), hVar)));
        return lVar.mo87741a();
    }

    @C0359n0
    /* renamed from: E */
    public final C31047k mo133942E(@C0359n0 C40504h hVar, @C0359n0 C40592n.C40593a aVar, int i) {
        C31049l lVar = new C31049l();
        mo133957m(lVar, i, hVar);
        C40598n3 n3Var = new C40598n3(aVar, lVar);
        Handler handler = this.f103417r;
        handler.sendMessage(handler.obtainMessage(13, new C40597n2(n3Var, this.f103412m.get(), hVar)));
        return lVar.mo87741a();
    }

    /* renamed from: J */
    public final void mo133943J(@C0359n0 C40504h hVar, int i, @C0359n0 C40538e.C40539a aVar) {
        C40581k3 k3Var = new C40581k3(i, aVar);
        Handler handler = this.f103417r;
        handler.sendMessage(handler.obtainMessage(4, new C40597n2(k3Var, this.f103412m.get(), hVar)));
    }

    /* renamed from: K */
    public final void mo133944K(@C0359n0 C40504h hVar, int i, @C0359n0 C40513a0 a0Var, @C0359n0 C31049l lVar, @C0359n0 C40650y yVar) {
        mo133957m(lVar, a0Var.mo133812d(), hVar);
        C40591m3 m3Var = new C40591m3(i, a0Var, lVar, yVar);
        Handler handler = this.f103417r;
        handler.sendMessage(handler.obtainMessage(4, new C40597n2(m3Var, this.f103412m.get(), hVar)));
    }

    /* renamed from: L */
    public final void mo133945L(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.f103417r;
        handler.sendMessage(handler.obtainMessage(18, new C40580k2(methodInvocation, i, j, i2)));
    }

    /* renamed from: M */
    public final void mo133946M(@C0359n0 ConnectionResult connectionResult, int i) {
        if (!mo133952h(connectionResult, i)) {
            Handler handler = this.f103417r;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: b */
    public final void mo133947b() {
        Handler handler = this.f103417r;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void mo133948c(@C0359n0 C40504h hVar) {
        Handler handler = this.f103417r;
        handler.sendMessage(handler.obtainMessage(7, hVar));
    }

    /* renamed from: d */
    public final void mo133949d(@C0359n0 C40565i0 i0Var) {
        synchronized (f103400v) {
            if (this.f103414o != i0Var) {
                this.f103414o = i0Var;
                this.f103415p.clear();
            }
            this.f103415p.addAll(i0Var.mo133962u());
        }
    }

    /* renamed from: e */
    public final void mo133950e(@C0359n0 C40565i0 i0Var) {
        synchronized (f103400v) {
            if (this.f103414o == i0Var) {
                this.f103414o = null;
                this.f103415p.clear();
            }
        }
    }

    @C0348i1
    /* renamed from: g */
    public final boolean mo133951g() {
        if (this.f103405f) {
            return false;
        }
        RootTelemetryConfiguration a = C40849w.m166213b().mo134510a();
        if (a != null && !a.mo134288W()) {
            return false;
        }
        int a2 = this.f103410k.mo134477a(this.f103408i, 203400000);
        if (a2 == -1 || a2 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo133952h(ConnectionResult connectionResult, int i) {
        return this.f103409j.mo134203L(this.f103408i, connectionResult, i);
    }

    @C0348i1
    public final boolean handleMessage(@C0359n0 Message message) {
        int i = message.what;
        long j = 300000;
        C40637v1 v1Var = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f103404e = j;
                this.f103417r.removeMessages(12);
                for (C40525c obtainMessage : this.f103413n.keySet()) {
                    Handler handler = this.f103417r;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f103404e);
                }
                break;
            case 2:
                C40618r3 r3Var = (C40618r3) message.obj;
                Iterator it = r3Var.mo134021b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C40525c cVar = (C40525c) it.next();
                        C40637v1 v1Var2 = (C40637v1) this.f103413n.get(cVar);
                        if (v1Var2 == null) {
                            r3Var.mo134022c(cVar, new ConnectionResult(13), (String) null);
                            break;
                        } else if (v1Var2.mo134053L()) {
                            r3Var.mo134022c(cVar, ConnectionResult.f103129S0, v1Var2.mo134072s().mo133675g());
                        } else {
                            ConnectionResult q = v1Var2.mo134071q();
                            if (q != null) {
                                r3Var.mo134022c(cVar, q, (String) null);
                            } else {
                                v1Var2.mo134049G(r3Var);
                                v1Var2.mo134044B();
                            }
                        }
                    }
                }
            case 3:
                for (C40637v1 v1Var3 : this.f103413n.values()) {
                    v1Var3.mo134043A();
                    v1Var3.mo134044B();
                }
                break;
            case 4:
            case 8:
            case 13:
                C40597n2 n2Var = (C40597n2) message.obj;
                C40637v1 v1Var4 = (C40637v1) this.f103413n.get(n2Var.f103513c.mo133714h());
                if (v1Var4 == null) {
                    v1Var4 = mo133954j(n2Var.f103513c);
                }
                if (v1Var4.mo134054M() && this.f103412m.get() != n2Var.f103512b) {
                    n2Var.f103511a.mo133904a(f103398t);
                    v1Var4.mo134051I();
                    break;
                } else {
                    v1Var4.mo134045C(n2Var.f103511a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f103413n.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C40637v1 v1Var5 = (C40637v1) it2.next();
                        if (v1Var5.mo134069o() == i2) {
                            v1Var = v1Var5;
                        }
                    }
                }
                if (v1Var != null) {
                    if (connectionResult.mo133591M() != 13) {
                        v1Var.mo134058d(m165091i(v1Var.f103591p, connectionResult));
                        break;
                    } else {
                        String h = this.f103409j.mo134207h(connectionResult.mo133591M());
                        String Q = connectionResult.mo133592Q();
                        v1Var.mo134058d(new Status(17, "Error resolution was canceled by the user, original error message: " + h + ": " + Q));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i2 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.f103408i.getApplicationContext() instanceof Application) {
                    C40531d.m164958c((Application) this.f103408i.getApplicationContext());
                    C40531d.m164957b().mo133850a(new C40611q1(this));
                    if (!C40531d.m164957b().mo133852e(true)) {
                        this.f103404e = 300000;
                        break;
                    }
                }
                break;
            case 7:
                mo133954j((C40504h) message.obj);
                break;
            case 9:
                if (this.f103413n.containsKey(message.obj)) {
                    ((C40637v1) this.f103413n.get(message.obj)).mo134050H();
                    break;
                }
                break;
            case 10:
                for (C40525c remove : this.f103416q) {
                    C40637v1 v1Var6 = (C40637v1) this.f103413n.remove(remove);
                    if (v1Var6 != null) {
                        v1Var6.mo134051I();
                    }
                }
                this.f103416q.clear();
                break;
            case 11:
                if (this.f103413n.containsKey(message.obj)) {
                    ((C40637v1) this.f103413n.get(message.obj)).mo134052J();
                    break;
                }
                break;
            case 12:
                if (this.f103413n.containsKey(message.obj)) {
                    ((C40637v1) this.f103413n.get(message.obj)).mo134055a();
                    break;
                }
                break;
            case 14:
                C40571j0 j0Var = (C40571j0) message.obj;
                C40525c a = j0Var.mo133967a();
                if (this.f103413n.containsKey(a)) {
                    j0Var.mo133968b().mo87743c(Boolean.valueOf(((C40637v1) this.f103413n.get(a)).mo134068n(false)));
                    break;
                } else {
                    j0Var.mo133968b().mo87743c(Boolean.FALSE);
                    break;
                }
            case 15:
                C40647x1 x1Var = (C40647x1) message.obj;
                if (this.f103413n.containsKey(x1Var.f103610a)) {
                    C40637v1.m165412y((C40637v1) this.f103413n.get(x1Var.f103610a), x1Var);
                    break;
                }
                break;
            case 16:
                C40647x1 x1Var2 = (C40647x1) message.obj;
                if (this.f103413n.containsKey(x1Var2.f103610a)) {
                    C40637v1.m165413z((C40637v1) this.f103413n.get(x1Var2.f103610a), x1Var2);
                    break;
                }
                break;
            case 17:
                mo133956l();
                break;
            case 18:
                C40580k2 k2Var = (C40580k2) message.obj;
                if (k2Var.f103474c != 0) {
                    TelemetryData telemetryData = this.f103406g;
                    if (telemetryData != null) {
                        List M = telemetryData.mo134292M();
                        if (telemetryData.mo134294i() != k2Var.f103473b || (M != null && M.size() >= k2Var.f103475d)) {
                            this.f103417r.removeMessages(17);
                            mo133956l();
                        } else {
                            this.f103406g.mo134293Q(k2Var.f103472a);
                        }
                    }
                    if (this.f103406g == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(k2Var.f103472a);
                        this.f103406g = new TelemetryData(k2Var.f103473b, arrayList);
                        Handler handler2 = this.f103417r;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), k2Var.f103474c);
                        break;
                    }
                } else {
                    mo133955k().mo134307a(new TelemetryData(k2Var.f103473b, Arrays.asList(new MethodInvocation[]{k2Var.f103472a})));
                    break;
                }
                break;
            case 19:
                this.f103405f = false;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown message id: ");
                sb.append(i);
                return false;
        }
        return true;
    }

    @C0348i1
    /* renamed from: j */
    public final C40637v1 mo133954j(C40504h hVar) {
        C40525c h = hVar.mo133714h();
        C40637v1 v1Var = (C40637v1) this.f103413n.get(h);
        if (v1Var == null) {
            v1Var = new C40637v1(this, hVar);
            this.f103413n.put(h, v1Var);
        }
        if (v1Var.mo134054M()) {
            this.f103416q.add(h);
        }
        v1Var.mo134044B();
        return v1Var;
    }

    @C0348i1
    /* renamed from: k */
    public final C40734b0 mo133955k() {
        if (this.f103407h == null) {
            this.f103407h = C40730a0.m165754a(this.f103408i);
        }
        return this.f103407h;
    }

    @C0348i1
    /* renamed from: l */
    public final void mo133956l() {
        TelemetryData telemetryData = this.f103406g;
        if (telemetryData != null) {
            if (telemetryData.mo134294i() > 0 || mo133951g()) {
                mo133955k().mo134307a(telemetryData);
            }
            this.f103406g = null;
        }
    }

    /* renamed from: m */
    public final void mo133957m(C31049l lVar, int i, C40504h hVar) {
        C40573j2 a;
        if (i != 0 && (a = C40573j2.m165191a(this, i, hVar.mo133714h())) != null) {
            C31047k a2 = lVar.mo87741a();
            Handler handler = this.f103417r;
            handler.getClass();
            a2.mo87722f(new C40606p1(handler), a);
        }
    }

    /* renamed from: n */
    public final int mo133958n() {
        return this.f103411l.getAndIncrement();
    }

    @C0363p0
    /* renamed from: x */
    public final C40637v1 mo133959x(C40525c cVar) {
        return (C40637v1) this.f103413n.get(cVar);
    }
}
