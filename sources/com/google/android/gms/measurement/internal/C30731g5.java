package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.C0348i1;
import com.bumptech.glide.manager.C22509f;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.common.util.C40985k;
import com.google.android.gms.common.wrappers.C41008d;
import com.google.android.gms.internal.measurement.C41935ed;
import com.google.android.gms.internal.measurement.C41983h7;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.firebase.messaging.C33180f;
import com.google.firebase.messaging.C33188f0;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.g5 */
public final class C30731g5 implements C30667b6 {

    /* renamed from: H */
    public static volatile C30731g5 f73424H;

    /* renamed from: A */
    public volatile Boolean f73425A;
    @C40974d0

    /* renamed from: B */
    public Boolean f73426B;
    @C40974d0

    /* renamed from: C */
    public Boolean f73427C;

    /* renamed from: D */
    public volatile boolean f73428D;

    /* renamed from: E */
    public int f73429E;

    /* renamed from: F */
    public final AtomicInteger f73430F = new AtomicInteger(0);
    @C40974d0

    /* renamed from: G */
    public final long f73431G;

    /* renamed from: a */
    public final Context f73432a;

    /* renamed from: b */
    public final String f73433b;

    /* renamed from: c */
    public final String f73434c;

    /* renamed from: d */
    public final String f73435d;

    /* renamed from: e */
    public final boolean f73436e;

    /* renamed from: f */
    public final C30673c f73437f;

    /* renamed from: g */
    public final C30725g f73438g;

    /* renamed from: h */
    public final C30780k4 f73439h;

    /* renamed from: i */
    public final C30899u3 f73440i;

    /* renamed from: j */
    public final C30692d5 f73441j;

    /* renamed from: k */
    public final C30905u9 f73442k;

    /* renamed from: l */
    public final C30906ua f73443l;

    /* renamed from: m */
    public final C30839p3 f73444m;

    /* renamed from: n */
    public final C40979g f73445n;

    /* renamed from: o */
    public final C30682c8 f73446o;

    /* renamed from: p */
    public final C30819n7 f73447p;

    /* renamed from: q */
    public final C30957z1 f73448q;

    /* renamed from: r */
    public final C30867r7 f73449r;

    /* renamed from: s */
    public final String f73450s;

    /* renamed from: t */
    public C30815n3 f73451t;

    /* renamed from: u */
    public C30696d9 f73452u;

    /* renamed from: v */
    public C30835p f73453v;

    /* renamed from: w */
    public C30791l3 f73454w;

    /* renamed from: x */
    public boolean f73455x = false;

    /* renamed from: y */
    public Boolean f73456y;

    /* renamed from: z */
    public long f73457z;

    public C30731g5(C30782k6 k6Var) {
        long j;
        Bundle bundle;
        boolean z = false;
        C40843u.m166202l(k6Var);
        Context context = k6Var.f73673a;
        C30673c cVar = new C30673c(context);
        this.f73437f = cVar;
        C30703e3.f73351a = cVar;
        this.f73432a = context;
        this.f73433b = k6Var.f73674b;
        this.f73434c = k6Var.f73675c;
        this.f73435d = k6Var.f73676d;
        this.f73436e = k6Var.f73680h;
        this.f73425A = k6Var.f73677e;
        this.f73450s = k6Var.f73682j;
        this.f73428D = true;
        zzcl zzcl = k6Var.f73679g;
        if (!(zzcl == null || (bundle = zzcl.f106686g) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f73426B = (Boolean) obj;
            }
            Object obj2 = zzcl.f106686g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f73427C = (Boolean) obj2;
            }
        }
        C41983h7.m170216d(context);
        C40979g d = C40985k.m166636d();
        this.f73445n = d;
        Long l = k6Var.f73681i;
        if (l != null) {
            j = l.longValue();
        } else {
            j = d.mo134768a();
        }
        this.f73431G = j;
        this.f73438g = new C30725g(this);
        C30780k4 k4Var = new C30780k4(this);
        k4Var.mo86874l();
        this.f73439h = k4Var;
        C30899u3 u3Var = new C30899u3(this);
        u3Var.mo86874l();
        this.f73440i = u3Var;
        C30906ua uaVar = new C30906ua(this);
        uaVar.mo86874l();
        this.f73443l = uaVar;
        this.f73444m = new C30839p3(new C30770j6(k6Var, this));
        this.f73448q = new C30957z1(this);
        C30682c8 c8Var = new C30682c8(this);
        c8Var.mo86891j();
        this.f73446o = c8Var;
        C30819n7 n7Var = new C30819n7(this);
        n7Var.mo86891j();
        this.f73447p = n7Var;
        C30905u9 u9Var = new C30905u9(this);
        u9Var.mo86891j();
        this.f73442k = u9Var;
        C30867r7 r7Var = new C30867r7(this);
        r7Var.mo86874l();
        this.f73449r = r7Var;
        C30692d5 d5Var = new C30692d5(this);
        d5Var.mo86874l();
        this.f73441j = d5Var;
        zzcl zzcl2 = k6Var.f73679g;
        z = (zzcl2 == null || zzcl2.f106681b == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            C30819n7 I = mo87105I();
            if (I.f74136a.f73432a.getApplicationContext() instanceof Application) {
                Application application = (Application) I.f74136a.f73432a.getApplicationContext();
                if (I.f73772c == null) {
                    I.f73772c = new C30807m7(I);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(I.f73772c);
                    application.registerActivityLifecycleCallbacks(I.f73772c);
                    I.f74136a.mo86903d().mo87493v().mo87463a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo86903d().mo87494w().mo87463a("Application context is not an Application");
        }
        d5Var.mo86950z(new C30718f5(this, k6Var));
    }

    /* renamed from: H */
    public static C30731g5 m123740H(Context context, zzcl zzcl, Long l) {
        Bundle bundle;
        if (zzcl != null && (zzcl.f106684e == null || zzcl.f106685f == null)) {
            zzcl = new zzcl(zzcl.f106680a, zzcl.f106681b, zzcl.f106682c, zzcl.f106683d, (String) null, (String) null, zzcl.f106686g, (String) null);
        }
        C40843u.m166202l(context);
        C40843u.m166202l(context.getApplicationContext());
        if (f73424H == null) {
            synchronized (C30731g5.class) {
                if (f73424H == null) {
                    f73424H = new C30731g5(new C30782k6(context, zzcl, l));
                }
            }
        } else if (!(zzcl == null || (bundle = zzcl.f106686g) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            C40843u.m166202l(f73424H);
            f73424H.f73425A = Boolean.valueOf(zzcl.f106686g.getBoolean("dataCollectionDefaultEnabled"));
        }
        C40843u.m166202l(f73424H);
        return f73424H;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ void m123741e(C30731g5 g5Var, C30782k6 k6Var) {
        g5Var.mo86904f().mo86866h();
        g5Var.f73438g.mo87090w();
        C30835p pVar = new C30835p(g5Var);
        pVar.mo86874l();
        g5Var.f73453v = pVar;
        C30791l3 l3Var = new C30791l3(g5Var, k6Var.f73678f);
        l3Var.mo86891j();
        g5Var.f73454w = l3Var;
        C30815n3 n3Var = new C30815n3(g5Var);
        n3Var.mo86891j();
        g5Var.f73451t = n3Var;
        C30696d9 d9Var = new C30696d9(g5Var);
        d9Var.mo86891j();
        g5Var.f73452u = d9Var;
        g5Var.f73443l.mo86875m();
        g5Var.f73439h.mo86875m();
        g5Var.f73454w.mo86892k();
        C30875s3 u = g5Var.mo86903d().mo87492u();
        g5Var.f73438g.mo87084q();
        u.mo87464b("App measurement initialized, version", 76003L);
        g5Var.mo86903d().mo87492u().mo87463a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s = l3Var.mo87246s();
        if (TextUtils.isEmpty(g5Var.f73433b)) {
            if (g5Var.mo87110N().mo87521U(s)) {
                g5Var.mo86903d().mo87492u().mo87463a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                g5Var.mo86903d().mo87492u().mo87463a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(s)));
            }
        }
        g5Var.mo86903d().mo87488q().mo87463a("Debug-level message logging enabled");
        if (g5Var.f73429E != g5Var.f73430F.get()) {
            g5Var.mo86903d().mo87489r().mo87465c("Not all components initialized", Integer.valueOf(g5Var.f73429E), Integer.valueOf(g5Var.f73430F.get()));
        }
        g5Var.f73455x = true;
    }

    /* renamed from: t */
    public static final void m123742t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    public static final void m123743u(C30961z5 z5Var) {
        if (z5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    public static final void m123744v(C30665b4 b4Var) {
        if (b4Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!b4Var.mo86894m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(b4Var.getClass())));
        }
    }

    /* renamed from: w */
    public static final void m123745w(C30654a6 a6Var) {
        if (a6Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!a6Var.mo86876n()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(a6Var.getClass())));
        }
    }

    @Pure
    /* renamed from: A */
    public final C30835p mo87098A() {
        m123745w(this.f73453v);
        return this.f73453v;
    }

    @Pure
    /* renamed from: B */
    public final C30791l3 mo87099B() {
        m123744v(this.f73454w);
        return this.f73454w;
    }

    @Pure
    /* renamed from: C */
    public final C30815n3 mo87100C() {
        m123744v(this.f73451t);
        return this.f73451t;
    }

    @Pure
    /* renamed from: D */
    public final C30839p3 mo87101D() {
        return this.f73444m;
    }

    /* renamed from: E */
    public final C30899u3 mo87102E() {
        C30899u3 u3Var = this.f73440i;
        if (u3Var == null || !u3Var.mo86876n()) {
            return null;
        }
        return u3Var;
    }

    @Pure
    /* renamed from: F */
    public final C30780k4 mo87103F() {
        m123743u(this.f73439h);
        return this.f73439h;
    }

    @SideEffectFree
    /* renamed from: G */
    public final C30692d5 mo87104G() {
        return this.f73441j;
    }

    @Pure
    /* renamed from: I */
    public final C30819n7 mo87105I() {
        m123744v(this.f73447p);
        return this.f73447p;
    }

    @Pure
    /* renamed from: J */
    public final C30867r7 mo87106J() {
        m123745w(this.f73449r);
        return this.f73449r;
    }

    @Pure
    /* renamed from: K */
    public final C30682c8 mo87107K() {
        m123744v(this.f73446o);
        return this.f73446o;
    }

    @Pure
    /* renamed from: L */
    public final C30696d9 mo87108L() {
        m123744v(this.f73452u);
        return this.f73452u;
    }

    @Pure
    /* renamed from: M */
    public final C30905u9 mo87109M() {
        m123744v(this.f73442k);
        return this.f73442k;
    }

    @Pure
    /* renamed from: N */
    public final C30906ua mo87110N() {
        m123743u(this.f73443l);
        return this.f73443l;
    }

    @Pure
    /* renamed from: O */
    public final String mo87111O() {
        return this.f73433b;
    }

    @Pure
    /* renamed from: P */
    public final String mo87112P() {
        return this.f73434c;
    }

    @Pure
    /* renamed from: Q */
    public final String mo87113Q() {
        return this.f73435d;
    }

    @Pure
    /* renamed from: R */
    public final String mo87114R() {
        return this.f73450s;
    }

    @Pure
    /* renamed from: a */
    public final C40979g mo86900a() {
        return this.f73445n;
    }

    @Pure
    /* renamed from: b */
    public final C30673c mo86901b() {
        return this.f73437f;
    }

    @Pure
    /* renamed from: c */
    public final Context mo86902c() {
        return this.f73432a;
    }

    @Pure
    /* renamed from: d */
    public final C30899u3 mo86903d() {
        m123745w(this.f73440i);
        return this.f73440i;
    }

    @Pure
    /* renamed from: f */
    public final C30692d5 mo86904f() {
        m123745w(this.f73441j);
        return this.f73441j;
    }

    /* renamed from: g */
    public final void mo87115g() {
        this.f73430F.incrementAndGet();
    }

    /* renamed from: h */
    public final /* synthetic */ void mo87116h(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            mo86903d().mo87494w().mo87465c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            mo87103F().f73663s.mo87051a(true);
            if (bArr == null || bArr.length == 0) {
                mo86903d().mo87488q().mo87463a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    mo86903d().mo87488q().mo87463a("Deferred Deep Link is empty.");
                    return;
                }
                C30906ua N = mo87110N();
                C30731g5 g5Var = N.f74136a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = N.f74136a.f73432a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f73447p.mo87334u("auto", C33180f.C33186f.f80639l, bundle);
                        C30906ua N2 = mo87110N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = N2.f74136a.f73432a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    N2.f74136a.f73432a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                N2.f74136a.mo86903d().mo87489r().mo87464b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                mo86903d().mo87494w().mo87465c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                mo86903d().mo87489r().mo87464b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        mo86903d().mo87494w().mo87465c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* renamed from: i */
    public final void mo87117i() {
        this.f73429E++;
    }

    @C0348i1
    /* renamed from: j */
    public final void mo87118j() {
        mo86904f().mo86866h();
        m123745w(mo87106J());
        String s = mo87099B().mo87246s();
        Pair p = mo87103F().mo87192p(s);
        if (!this.f73438g.mo87069A() || ((Boolean) p.second).booleanValue() || TextUtils.isEmpty((CharSequence) p.first)) {
            mo86903d().mo87488q().mo87463a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        C30867r7 J = mo87106J();
        J.mo86873k();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.f74136a.f73432a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            mo86903d().mo87494w().mo87463a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        C30906ua N = mo87110N();
        mo87099B().f74136a.f73438g.mo87084q();
        URL s2 = N.mo87540s(76003, s, (String) p.first, mo87103F().f73664t.mo87096a() - 1);
        if (s2 != null) {
            C30867r7 J2 = mo87106J();
            C30705e5 e5Var = new C30705e5(this);
            J2.mo86866h();
            J2.mo86873k();
            C40843u.m166202l(s2);
            C40843u.m166202l(e5Var);
            J2.f74136a.mo86904f().mo86949y(new C30855q7(J2, s, s2, (byte[]) null, (Map) null, e5Var));
        }
    }

    @C0348i1
    /* renamed from: k */
    public final void mo87119k(boolean z) {
        this.f73425A = Boolean.valueOf(z);
    }

    @C0348i1
    /* renamed from: l */
    public final void mo87120l(boolean z) {
        mo86904f().mo86866h();
        this.f73428D = z;
    }

    @C0348i1
    /* renamed from: m */
    public final void mo87121m(zzcl zzcl) {
        C30738h hVar;
        mo86904f().mo86866h();
        C30738h q = mo87103F().mo87193q();
        C30780k4 F = mo87103F();
        C30731g5 g5Var = F.f74136a;
        F.mo86866h();
        int i = 100;
        int i2 = F.mo87191o().getInt("consent_source", 100);
        C30725g gVar = this.f73438g;
        C30731g5 g5Var2 = gVar.f74136a;
        Boolean t = gVar.mo87087t("google_analytics_default_allow_ad_storage");
        C30725g gVar2 = this.f73438g;
        C30731g5 g5Var3 = gVar2.f74136a;
        Boolean t2 = gVar2.mo87087t("google_analytics_default_allow_analytics_storage");
        if (!(t == null && t2 == null) && mo87103F().mo87199w(-10)) {
            hVar = new C30738h(t, t2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(mo87099B().mo87247t()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                mo87105I().mo87305G(C30738h.f73481b, -10, this.f73431G);
            } else if (TextUtils.isEmpty(mo87099B().mo87247t()) && zzcl != null && zzcl.f106686g != null && mo87103F().mo87199w(30)) {
                hVar = C30738h.m123794a(zzcl.f106686g);
                if (!hVar.equals(C30738h.f73481b)) {
                    i = 30;
                }
            }
            hVar = null;
        }
        if (hVar != null) {
            mo87105I().mo87305G(hVar, i, this.f73431G);
            q = hVar;
        }
        mo87105I().mo87308J(q);
        if (mo87103F().f73649e.mo87096a() == 0) {
            mo86903d().mo87493v().mo87464b("Persisting first open", Long.valueOf(this.f73431G));
            mo87103F().f73649e.mo87097b(this.f73431G);
        }
        mo87105I().f73783n.mo86884c();
        if (mo87126r()) {
            if (!TextUtils.isEmpty(mo87099B().mo87247t()) || !TextUtils.isEmpty(mo87099B().mo87245r())) {
                C30906ua N = mo87110N();
                String t3 = mo87099B().mo87247t();
                C30780k4 F2 = mo87103F();
                F2.mo86866h();
                String string = F2.mo87191o().getString(C33188f0.f80648A, (String) null);
                String r = mo87099B().mo87245r();
                C30780k4 F3 = mo87103F();
                F3.mo86866h();
                if (N.mo87525d0(t3, string, r, F3.mo87191o().getString("admob_app_id", (String) null))) {
                    mo86903d().mo87492u().mo87463a("Rechecking which service to use due to a GMP App Id change");
                    C30780k4 F4 = mo87103F();
                    F4.mo86866h();
                    Boolean r2 = F4.mo87194r();
                    SharedPreferences.Editor edit = F4.mo87191o().edit();
                    edit.clear();
                    edit.apply();
                    if (r2 != null) {
                        F4.mo87195s(r2);
                    }
                    mo87100C().mo87288q();
                    this.f73452u.mo87029Q();
                    this.f73452u.mo87028P();
                    mo87103F().f73649e.mo87097b(this.f73431G);
                    mo87103F().f73651g.mo87180b((String) null);
                }
                C30780k4 F5 = mo87103F();
                String t4 = mo87099B().mo87247t();
                F5.mo86866h();
                SharedPreferences.Editor edit2 = F5.mo87191o().edit();
                edit2.putString(C33188f0.f80648A, t4);
                edit2.apply();
                C30780k4 F6 = mo87103F();
                String r3 = mo87099B().mo87245r();
                F6.mo86866h();
                SharedPreferences.Editor edit3 = F6.mo87191o().edit();
                edit3.putString("admob_app_id", r3);
                edit3.apply();
            }
            if (!mo87103F().mo87193q().mo87142i(zzah.ANALYTICS_STORAGE)) {
                mo87103F().f73651g.mo87180b((String) null);
            }
            mo87105I().mo87301C(mo87103F().f73651g.mo87179a());
            C41935ed.m169830b();
            if (this.f73438g.mo87070B((String) null, C30742h3.f73534g0)) {
                try {
                    mo87110N().f74136a.f73432a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(mo87103F().f73665u.mo87179a())) {
                        mo86903d().mo87494w().mo87463a("Remote config removed with active feature rollouts");
                        mo87103F().f73665u.mo87180b((String) null);
                    }
                }
            }
            if (!TextUtils.isEmpty(mo87099B().mo87247t()) || !TextUtils.isEmpty(mo87099B().mo87245r())) {
                boolean o = mo87123o();
                if (!mo87103F().mo87197u() && !this.f73438g.mo87073E()) {
                    mo87103F().mo87196t(!o);
                }
                if (o) {
                    mo87105I().mo87327g0();
                }
                mo87109M().f74005d.mo87481a();
                mo87108L().mo87031S(new AtomicReference());
                mo87108L().mo87044v(mo87103F().f73668x.mo87056a());
            }
        } else if (mo87123o()) {
            if (!mo87110N().mo87520T("android.permission.INTERNET")) {
                mo86903d().mo87489r().mo87463a("App is missing INTERNET permission");
            }
            if (!mo87110N().mo87520T(C22509f.f57696b)) {
                mo86903d().mo87489r().mo87463a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C41008d.m166715a(this.f73432a).mo134785g() && !this.f73438g.mo87075G()) {
                if (!C30906ua.m124208a0(this.f73432a)) {
                    mo86903d().mo87489r().mo87463a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C30906ua.m124209b0(this.f73432a, false)) {
                    mo86903d().mo87489r().mo87463a("AppMeasurementService not registered/enabled");
                }
            }
            mo86903d().mo87489r().mo87463a("Uploading is not possible. App measurement disabled");
        }
        mo87103F().f73658n.mo87051a(true);
    }

    @C0348i1
    /* renamed from: n */
    public final boolean mo87122n() {
        return this.f73425A != null && this.f73425A.booleanValue();
    }

    @C0348i1
    /* renamed from: o */
    public final boolean mo87123o() {
        return mo87128x() == 0;
    }

    @C0348i1
    /* renamed from: p */
    public final boolean mo87124p() {
        mo86904f().mo86866h();
        return this.f73428D;
    }

    @Pure
    /* renamed from: q */
    public final boolean mo87125q() {
        return TextUtils.isEmpty(this.f73433b);
    }

    @C0348i1
    /* renamed from: r */
    public final boolean mo87126r() {
        boolean z;
        if (this.f73455x) {
            mo86904f().mo86866h();
            Boolean bool = this.f73456y;
            if (bool == null || this.f73457z == 0 || (!bool.booleanValue() && Math.abs(this.f73445n.mo134770c() - this.f73457z) > 1000)) {
                this.f73457z = this.f73445n.mo134770c();
                boolean z2 = true;
                if (!mo87110N().mo87520T("android.permission.INTERNET") || !mo87110N().mo87520T(C22509f.f57696b) || (!C41008d.m166715a(this.f73432a).mo134785g() && !this.f73438g.mo87075G() && (!C30906ua.m124208a0(this.f73432a) || !C30906ua.m124209b0(this.f73432a, false)))) {
                    z = false;
                } else {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                this.f73456y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo87110N().mo87513M(mo87099B().mo87247t(), mo87099B().mo87245r()) && TextUtils.isEmpty(mo87099B().mo87245r())) {
                        z2 = false;
                    }
                    this.f73456y = Boolean.valueOf(z2);
                }
            }
            return this.f73456y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    /* renamed from: s */
    public final boolean mo87127s() {
        return this.f73436e;
    }

    @C0348i1
    /* renamed from: x */
    public final int mo87128x() {
        mo86904f().mo86866h();
        if (this.f73438g.mo87073E()) {
            return 1;
        }
        Boolean bool = this.f73427C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo86904f().mo86866h();
        if (!this.f73428D) {
            return 8;
        }
        Boolean r = mo87103F().mo87194r();
        if (r == null) {
            C30725g gVar = this.f73438g;
            C30673c cVar = gVar.f74136a.f73437f;
            Boolean t = gVar.mo87087t("firebase_analytics_collection_enabled");
            if (t == null) {
                Boolean bool2 = this.f73426B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (this.f73425A == null || this.f73425A.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (t.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (r.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    @Pure
    /* renamed from: y */
    public final C30957z1 mo87129y() {
        C30957z1 z1Var = this.f73448q;
        if (z1Var != null) {
            return z1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    /* renamed from: z */
    public final C30725g mo87130z() {
        return this.f73438g;
    }
}
