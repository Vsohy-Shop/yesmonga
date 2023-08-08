package com.urbanairship;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.p026pm.C17372c;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22925d;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.actions.C35492e;
import com.urbanairship.actions.C35505k;
import com.urbanairship.analytics.C35518b;
import com.urbanairship.app.C36035g;
import com.urbanairship.base.C9002b;
import com.urbanairship.channel.C9008d;
import com.urbanairship.channel.C9033m;
import com.urbanairship.config.C9061a;
import com.urbanairship.config.C9062b;
import com.urbanairship.config.C9068e;
import com.urbanairship.contacts.C9074e;
import com.urbanairship.images.C9270a;
import com.urbanairship.images.C9275c;
import com.urbanairship.locale.C9342b;
import com.urbanairship.modules.Module;
import com.urbanairship.modules.Modules;
import com.urbanairship.modules.accengage.AccengageModule;
import com.urbanairship.modules.accengage.AccengageNotificationHandler;
import com.urbanairship.modules.location.AirshipLocationClient;
import com.urbanairship.modules.location.LocationModule;
import com.urbanairship.p006js.C9315a;
import com.urbanairship.permission.C9439p;
import com.urbanairship.push.C9537t;
import com.urbanairship.remoteconfig.C9605f;
import com.urbanairship.remotedata.C9619j;
import com.urbanairship.util.C9646e;
import com.urbanairship.util.C9653h0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class UAirship {
    @C0359n0

    /* renamed from: A */
    public static final String f87256A = "app_key";
    @C0359n0

    /* renamed from: B */
    public static final String f87257B = "uairship";
    @C0359n0

    /* renamed from: C */
    public static final String f87258C = "app_settings";
    @C0359n0

    /* renamed from: D */
    public static final String f87259D = "app_store";

    /* renamed from: E */
    public static final int f87260E = 1;

    /* renamed from: F */
    public static final int f87261F = 2;

    /* renamed from: G */
    public static final int f87262G = -1;

    /* renamed from: H */
    public static final Object f87263H = new Object();

    /* renamed from: I */
    public static volatile boolean f87264I = false;

    /* renamed from: J */
    public static volatile boolean f87265J = false;

    /* renamed from: K */
    public static volatile boolean f87266K = false;

    /* renamed from: L */
    public static Application f87267L = null;

    /* renamed from: M */
    public static UAirship f87268M = null;

    /* renamed from: N */
    public static boolean f87269N = false;

    /* renamed from: O */
    public static final List<C36051i> f87270O = new ArrayList();

    /* renamed from: P */
    public static boolean f87271P = true;
    @C0359n0

    /* renamed from: x */
    public static final String f87272x = "com.urbanairship.AIRSHIP_READY";
    @C0359n0

    /* renamed from: y */
    public static final String f87273y = "channel_id";
    @C0359n0

    /* renamed from: z */
    public static final String f87274z = "payload_version";

    /* renamed from: a */
    public C35505k f87275a;

    /* renamed from: b */
    public final Map<Class, C36040b> f87276b = new HashMap();

    /* renamed from: c */
    public List<C36040b> f87277c = new ArrayList();

    /* renamed from: d */
    public C35492e f87278d;

    /* renamed from: e */
    public AirshipConfigOptions f87279e;

    /* renamed from: f */
    public C35518b f87280f;

    /* renamed from: g */
    public C36046f f87281g;

    /* renamed from: h */
    public C36071u f87282h;

    /* renamed from: i */
    public C9537t f87283i;

    /* renamed from: j */
    public C9008d f87284j;

    /* renamed from: k */
    public AirshipLocationClient f87285k;

    /* renamed from: l */
    public C9315a f87286l;

    /* renamed from: m */
    public C9619j f87287m;

    /* renamed from: n */
    public C9605f f87288n;

    /* renamed from: o */
    public C36054j f87289o;

    /* renamed from: p */
    public C9033m f87290p;

    /* renamed from: q */
    public C9275c f87291q;

    /* renamed from: r */
    public AccengageNotificationHandler f87292r;

    /* renamed from: s */
    public C9061a f87293s;

    /* renamed from: t */
    public C9342b f87294t;

    /* renamed from: u */
    public C36075v f87295u;

    /* renamed from: v */
    public C9074e f87296v;

    /* renamed from: w */
    public C9439p f87297w;

    /* renamed from: com.urbanairship.UAirship$a */
    public class C35441a extends C36051i {

        /* renamed from: v */
        public final /* synthetic */ C35444d f87298v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35441a(Looper looper, C35444d dVar) {
            super(looper);
            this.f87298v = dVar;
        }

        /* renamed from: h */
        public void mo17473h() {
            C35444d dVar = this.f87298v;
            if (dVar != null) {
                dVar.mo19438a(UAirship.m146188Y());
            }
        }
    }

    /* renamed from: com.urbanairship.UAirship$b */
    public class C35442b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Application f87299a;

        /* renamed from: b */
        public final /* synthetic */ AirshipConfigOptions f87300b;

        /* renamed from: c */
        public final /* synthetic */ C35444d f87301c;

        public C35442b(Application application, AirshipConfigOptions airshipConfigOptions, C35444d dVar) {
            this.f87299a = application;
            this.f87300b = airshipConfigOptions;
            this.f87301c = dVar;
        }

        public void run() {
            UAirship.m146193c(this.f87299a, this.f87300b, this.f87301c);
        }
    }

    /* renamed from: com.urbanairship.UAirship$c */
    public class C35443c implements C9062b.C9065c {
        public C35443c() {
        }

        /* renamed from: a */
        public void mo17979a() {
            for (C36040b y : UAirship.this.f87277c) {
                y.mo17816y();
            }
        }
    }

    /* renamed from: com.urbanairship.UAirship$d */
    public interface C35444d {
        /* renamed from: a */
        void mo19438a(@C0359n0 UAirship uAirship);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.UAirship$e */
    public @interface C35445e {
    }

    public UAirship(@C0359n0 AirshipConfigOptions airshipConfigOptions) {
        this.f87279e = airshipConfigOptions;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: A */
    public static String m146180A() {
        return m146200l().getPackageName();
    }

    @C0359n0
    /* renamed from: I */
    public static String m146181I() {
        return "16.9.2";
    }

    /* renamed from: M */
    public static boolean m146182M() {
        return f87264I;
    }

    /* renamed from: N */
    public static boolean m146183N() {
        return f87266K;
    }

    /* renamed from: O */
    public static boolean m146184O() {
        return f87265J;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: P */
    public static void m146185P() {
        synchronized (f87263H) {
            if (f87265J || f87264I) {
                m146188Y().mo106218d0();
                f87264I = false;
                f87265J = false;
                f87268M = null;
                f87267L = null;
                f87271P = true;
            }
        }
    }

    @C0359n0
    /* renamed from: W */
    public static C36050h m146186W(@C0363p0 Looper looper, @C0359n0 C35444d dVar) {
        C35441a aVar = new C35441a(looper, dVar);
        List<C36051i> list = f87270O;
        synchronized (list) {
            if (f87271P) {
                list.add(aVar);
            } else {
                aVar.run();
            }
        }
        return aVar;
    }

    @C0359n0
    /* renamed from: X */
    public static C36050h m146187X(@C0359n0 C35444d dVar) {
        return m146186W((Looper) null, dVar);
    }

    @C0359n0
    /* renamed from: Y */
    public static UAirship m146188Y() {
        UAirship e0;
        synchronized (f87263H) {
            if (!f87265J) {
                if (!f87264I) {
                    throw new IllegalStateException("Take off must be called before shared()");
                }
            }
            e0 = m146195e0(0);
        }
        return e0;
    }

    @C0353k0
    /* renamed from: Z */
    public static void m146189Z(@C0359n0 Application application) {
        m146192b0(application, (AirshipConfigOptions) null, (C35444d) null);
    }

    @C0353k0
    /* renamed from: a0 */
    public static void m146191a0(@C0359n0 Application application, @C0363p0 AirshipConfigOptions airshipConfigOptions) {
        m146192b0(application, airshipConfigOptions, (C35444d) null);
    }

    @C0353k0
    /* renamed from: b0 */
    public static void m146192b0(@C0359n0 Application application, @C0363p0 AirshipConfigOptions airshipConfigOptions, @C0363p0 C35444d dVar) {
        if (application != null) {
            if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
                C36059m.m148409e("takeOff() must be called on the main thread!", new Object[0]);
            }
            f87266K = C9653h0.m36164b(application);
            C35446a.m146240a(application);
            if (f87269N) {
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : new Exception().getStackTrace()) {
                    sb.append("\n\tat ");
                    sb.append(stackTraceElement.toString());
                }
                C36059m.m148406b("Takeoff stack trace: %s", sb.toString());
            }
            synchronized (f87263H) {
                if (!f87264I) {
                    if (!f87265J) {
                        C36059m.m148413i("Airship taking off!", new Object[0]);
                        f87265J = true;
                        f87267L = application;
                        C36044d.m148370b().execute(new C35442b(application, airshipConfigOptions, dVar));
                        return;
                    }
                }
                C36059m.m148409e("You can only call takeOff() once.", new Object[0]);
                return;
            }
        }
        throw new IllegalArgumentException("Application argument must not be null");
    }

    /* renamed from: c */
    public static void m146193c(@C0359n0 Application application, @C0363p0 AirshipConfigOptions airshipConfigOptions, @C0363p0 C35444d dVar) {
        if (airshipConfigOptions == null) {
            airshipConfigOptions = new AirshipConfigOptions.C35437b().mo106156O(application.getApplicationContext()).mo106159R();
        }
        airshipConfigOptions.mo106141g();
        C36059m.m148417m(airshipConfigOptions.f87144q);
        C36059m.m148418n(m146198j() + " - " + C36059m.f89102a);
        C36059m.m148413i("Airship taking off!", new Object[0]);
        C36059m.m148413i("Airship log level: %s", Integer.valueOf(airshipConfigOptions.f87144q));
        C36059m.m148413i("UA Version: %s / App key = %s Production = %s", m146181I(), airshipConfigOptions.f87128a, Boolean.valueOf(airshipConfigOptions.f87123B));
        C36059m.m148419o(C36049g.f89066e, new Object[0]);
        f87268M = new UAirship(airshipConfigOptions);
        synchronized (f87263H) {
            f87264I = true;
            f87265J = false;
            f87268M.mo106208K();
            C36059m.m148413i("Airship ready!", new Object[0]);
            if (dVar != null) {
                dVar.mo19438a(f87268M);
            }
            for (C36040b u : f87268M.mo106226q()) {
                u.mo17628u(f87268M);
            }
            List<C36051i> list = f87270O;
            synchronized (list) {
                f87271P = false;
                for (C36051i run : list) {
                    run.run();
                }
                f87270O.clear();
            }
            Intent addCategory = new Intent(f87272x).setPackage(m146180A()).addCategory(m146180A());
            if (f87268M.f87293s.mo17958a().f87150w) {
                addCategory.putExtra("channel_id", f87268M.f87284j.mo17793Z());
                addCategory.putExtra(f87256A, f87268M.f87293s.mo17958a().f87128a);
                addCategory.putExtra(f87274z, 1);
            }
            application.sendBroadcast(addCategory);
            f87263H.notifyAll();
        }
    }

    @C0353k0
    /* renamed from: c0 */
    public static void m146194c0(@C0359n0 Application application, @C0363p0 C35444d dVar) {
        m146192b0(application, (AirshipConfigOptions) null, dVar);
    }

    @C0363p0
    /* renamed from: e0 */
    public static UAirship m146195e0(long j) {
        synchronized (f87263H) {
            if (f87264I) {
                UAirship uAirship = f87268M;
                return uAirship;
            }
            if (j > 0) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = j;
                    while (!f87264I && j2 > 0) {
                        f87263H.wait(j2);
                        j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return null;
                }
            } else {
                while (!f87264I) {
                    f87263H.wait();
                }
            }
            if (f87264I) {
                UAirship uAirship2 = f87268M;
                return uAirship2;
            }
        }
    }

    /* renamed from: h */
    public static int m146196h() {
        ApplicationInfo i = m146197i();
        if (i != null) {
            return i.icon;
        }
        return -1;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: i */
    public static ApplicationInfo m146197i() {
        return m146200l().getApplicationInfo();
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: j */
    public static String m146198j() {
        if (m146197i() != null) {
            return m146202z().getApplicationLabel(m146197i()).toString();
        }
        return "";
    }

    /* renamed from: k */
    public static long m146199k() {
        PackageInfo y = m146201y();
        if (y != null) {
            return C17372c.m79910c(y);
        }
        return -1;
    }

    @C0359n0
    /* renamed from: l */
    public static Context m146200l() {
        Application application = f87267L;
        if (application != null) {
            return application.getApplicationContext();
        }
        throw new IllegalStateException("TakeOff must be called first.");
    }

    @C0363p0
    /* renamed from: y */
    public static PackageInfo m146201y() {
        try {
            return m146202z().getPackageInfo(m146180A(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            C36059m.m148423s(e, "UAirship - Unable to get package info.", new Object[0]);
            return null;
        }
    }

    @C0359n0
    /* renamed from: z */
    public static PackageManager m146202z() {
        return m146200l().getPackageManager();
    }

    @C0359n0
    /* renamed from: B */
    public C9439p mo106200B() {
        return this.f87297w;
    }

    /* renamed from: C */
    public int mo106201C() {
        return this.f87293s.mo17959b();
    }

    @C0359n0
    /* renamed from: D */
    public C36075v mo106202D() {
        return this.f87295u;
    }

    @C0359n0
    /* renamed from: E */
    public C9537t mo106203E() {
        return this.f87283i;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: F */
    public C9619j mo106204F() {
        return this.f87287m;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: G */
    public C9061a mo106205G() {
        return this.f87293s;
    }

    @C0359n0
    /* renamed from: H */
    public C9315a mo106206H() {
        return this.f87286l;
    }

    /* renamed from: J */
    public final boolean mo106207J(@C0359n0 Uri uri, @C0359n0 Context context) {
        String encodedAuthority = uri.getEncodedAuthority();
        encodedAuthority.hashCode();
        if (encodedAuthority.equals(f87258C)) {
            context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts(C22925d.f58520a, m146180A(), (String) null)).addFlags(268435456));
            return true;
        } else if (!encodedAuthority.equals(f87259D)) {
            return false;
        } else {
            context.startActivity(C9646e.m36140a(context, mo106201C(), mo106220f()).addFlags(268435456));
            return true;
        }
    }

    /* renamed from: K */
    public final void mo106208K() {
        AccengageNotificationHandler accengageNotificationHandler;
        C36071u n = C36071u.m148465n(m146200l(), this.f87279e);
        this.f87282h = n;
        C36075v vVar = new C36075v(n, this.f87279e.f87149v);
        this.f87295u = vVar;
        vVar.mo107875i();
        this.f87297w = C9439p.m35457x(f87267L);
        this.f87294t = new C9342b(f87267L, this.f87282h);
        C9002b<C36078w> i = C36078w.m148509i(f87267L, this.f87279e);
        C36057k kVar = new C36057k(m146200l(), this.f87282h, this.f87295u, i);
        C9068e eVar = new C9068e(this.f87279e, this.f87282h);
        this.f87293s = new C9061a(kVar, this.f87279e, eVar);
        eVar.mo17983c(new C35443c());
        C9008d dVar = new C9008d(f87267L, this.f87282h, this.f87293s, this.f87295u, this.f87294t);
        this.f87284j = dVar;
        if (dVar.mo17793Z() == null && "huawei".equalsIgnoreCase(Build.MANUFACTURER)) {
            eVar.mo17984d();
        }
        this.f87277c.add(this.f87284j);
        this.f87286l = C9315a.m34948d(this.f87279e);
        C35492e eVar2 = new C35492e();
        this.f87278d = eVar2;
        eVar2.mo106356f(m146200l());
        C35518b bVar = new C35518b(f87267L, this.f87282h, this.f87293s, this.f87295u, this.f87284j, this.f87294t, this.f87297w);
        this.f87280f = bVar;
        this.f87277c.add(bVar);
        C36046f fVar = new C36046f(f87267L, this.f87282h, this.f87295u);
        this.f87281g = fVar;
        this.f87277c.add(fVar);
        C9537t tVar = new C9537t(f87267L, this.f87282h, this.f87293s, this.f87295u, i, this.f87284j, this.f87280f, this.f87297w);
        this.f87283i = tVar;
        this.f87277c.add(tVar);
        Application application = f87267L;
        C36054j jVar = new C36054j(application, this.f87279e, this.f87284j, this.f87282h, C36035g.m148341t(application));
        this.f87289o = jVar;
        this.f87277c.add(jVar);
        C9619j jVar2 = new C9619j(f87267L, this.f87282h, this.f87293s, this.f87295u, this.f87283i, this.f87294t, i);
        this.f87287m = jVar2;
        this.f87277c.add(jVar2);
        C9605f fVar2 = new C9605f(f87267L, this.f87282h, this.f87293s, this.f87295u, this.f87287m);
        this.f87288n = fVar2;
        fVar2.mo19529E(eVar);
        this.f87277c.add(this.f87288n);
        C9074e eVar3 = new C9074e(f87267L, this.f87282h, this.f87293s, this.f87295u, this.f87284j);
        this.f87296v = eVar3;
        this.f87277c.add(eVar3);
        C9033m mVar = new C9033m(f87267L, this.f87282h, this.f87296v);
        this.f87290p = mVar;
        this.f87277c.add(mVar);
        mo106210Q(Modules.m35404f(f87267L, this.f87282h));
        AccengageModule a = Modules.m35399a(f87267L, this.f87279e, this.f87282h, this.f87295u, this.f87284j, this.f87283i);
        mo106210Q(a);
        AirshipLocationClient airshipLocationClient = null;
        if (a == null) {
            accengageNotificationHandler = null;
        } else {
            accengageNotificationHandler = a.getAccengageNotificationHandler();
        }
        this.f87292r = accengageNotificationHandler;
        mo106210Q(Modules.m35406h(f87267L, this.f87282h, this.f87295u, this.f87284j, this.f87283i, mo106220f()));
        LocationModule g = Modules.m35405g(f87267L, this.f87282h, this.f87295u, this.f87284j, this.f87297w);
        mo106210Q(g);
        if (g != null) {
            airshipLocationClient = g.getLocationClient();
        }
        this.f87285k = airshipLocationClient;
        mo106210Q(Modules.m35401c(f87267L, this.f87282h, this.f87293s, this.f87295u, this.f87284j, this.f87283i, this.f87280f, this.f87287m, this.f87296v));
        mo106210Q(Modules.m35400b(f87267L, this.f87282h, this.f87293s, this.f87295u, this.f87280f));
        mo106210Q(Modules.m35402d(f87267L, this.f87282h, this.f87293s, this.f87295u, this.f87284j, this.f87283i));
        mo106210Q(Modules.m35407i(f87267L, this.f87282h, this.f87295u, this.f87287m));
        for (C36040b r : this.f87277c) {
            r.mo17625r();
        }
    }

    @Deprecated
    /* renamed from: L */
    public boolean mo106209L() {
        return this.f87295u.mo107873g();
    }

    /* renamed from: Q */
    public final void mo106210Q(@C0363p0 Module module) {
        if (module != null) {
            this.f87277c.addAll(module.getComponents());
            module.registerActions(f87267L, mo106219e());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: R */
    public <T extends C36040b> T mo106211R(@C0359n0 Class<T> cls) {
        T p = mo106225p(cls);
        if (p != null) {
            return p;
        }
        throw new IllegalArgumentException("Unable to find component " + cls);
    }

    /* renamed from: S */
    public void mo106212S(boolean z) {
        if (z) {
            this.f87295u.mo107877k(255);
            return;
        }
        this.f87295u.mo107877k(0);
    }

    /* renamed from: T */
    public void mo106213T(@C0363p0 C35505k kVar) {
        this.f87275a = kVar;
    }

    /* renamed from: U */
    public void mo106214U(@C0359n0 C9275c cVar) {
        this.f87291q = cVar;
    }

    /* renamed from: V */
    public void mo106215V(@C0363p0 Locale locale) {
        this.f87294t.mo18871g(locale);
    }

    @C0353k0
    /* renamed from: b */
    public boolean mo106216b(@C0359n0 String str) {
        Uri parse = Uri.parse(str);
        if (!"uairship".equals(parse.getScheme())) {
            C35505k s = mo106228s();
            if (s == null || !s.mo106389a(str)) {
                return false;
            }
            return true;
        } else if (mo106207J(parse, m146200l())) {
            return true;
        } else {
            for (C36040b t : mo106226q()) {
                if (t.mo19007t(parse)) {
                    return true;
                }
            }
            C36059m.m148406b("Airship deep link not handled: %s", str);
            return true;
        }
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public AccengageNotificationHandler mo106217d() {
        return this.f87292r;
    }

    /* renamed from: d0 */
    public final void mo106218d0() {
        for (C36040b A : mo106226q()) {
            A.mo17591A();
        }
        this.f87282h.mo107861z();
    }

    @C0359n0
    /* renamed from: e */
    public C35492e mo106219e() {
        return this.f87278d;
    }

    @C0359n0
    /* renamed from: f */
    public AirshipConfigOptions mo106220f() {
        return this.f87279e;
    }

    @C0359n0
    /* renamed from: g */
    public C35518b mo106221g() {
        return this.f87280f;
    }

    @C0359n0
    /* renamed from: m */
    public C36046f mo106222m() {
        return this.f87281g;
    }

    @C0359n0
    /* renamed from: n */
    public C9008d mo106223n() {
        return this.f87284j;
    }

    @C0359n0
    /* renamed from: o */
    public C36054j mo106224o() {
        return this.f87289o;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: p */
    public <T extends C36040b> T mo106225p(@C0359n0 Class<T> cls) {
        T t = (C36040b) this.f87276b.get(cls);
        if (t == null) {
            Iterator it = this.f87277c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                T t2 = (C36040b) it.next();
                if (t2.getClass().equals(cls)) {
                    this.f87276b.put(cls, t2);
                    t = t2;
                    break;
                }
            }
        }
        if (t != null) {
            return t;
        }
        return null;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: q */
    public List<C36040b> mo106226q() {
        return this.f87277c;
    }

    @C0359n0
    /* renamed from: r */
    public C9074e mo106227r() {
        return this.f87296v;
    }

    @C0363p0
    /* renamed from: s */
    public C35505k mo106228s() {
        return this.f87275a;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: t */
    public C9275c mo106229t() {
        if (this.f87291q == null) {
            this.f87291q = new C9270a(m146200l());
        }
        return this.f87291q;
    }

    /* renamed from: u */
    public Locale mo106230u() {
        return this.f87294t.mo18866b();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: v */
    public C9342b mo106231v() {
        return this.f87294t;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: w */
    public AirshipLocationClient mo106232w() {
        return this.f87285k;
    }

    @C0359n0
    @Deprecated
    /* renamed from: x */
    public C9033m mo106233x() {
        return this.f87290p;
    }
}
