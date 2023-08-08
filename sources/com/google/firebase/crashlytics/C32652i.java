package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.tasks.C31031c;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.C33033f;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.crashlytics.internal.C32655a;
import com.google.firebase.crashlytics.internal.C32735d;
import com.google.firebase.crashlytics.internal.C32738e;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.common.C32667a;
import com.google.firebase.crashlytics.internal.common.C32675e;
import com.google.firebase.crashlytics.internal.common.C32704l;
import com.google.firebase.crashlytics.internal.common.C32724s;
import com.google.firebase.crashlytics.internal.common.C32725t;
import com.google.firebase.crashlytics.internal.common.C32730v;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.network.C32914b;
import com.google.firebase.crashlytics.internal.persistence.C32921f;
import com.google.firebase.crashlytics.internal.settings.C32935e;
import com.google.firebase.inject.C33056a;
import com.google.firebase.installations.C33088k;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.crashlytics.i */
public class C32652i {

    /* renamed from: b */
    public static final String f79213b = "clx";

    /* renamed from: c */
    public static final String f79214c = "crash";

    /* renamed from: d */
    public static final int f79215d = 500;
    @C0344h1

    /* renamed from: a */
    public final C32704l f79216a;

    /* renamed from: com.google.firebase.crashlytics.i$a */
    public class C32653a implements C31031c<Void, Object> {
        /* renamed from: a */
        public Object mo85756a(@C0359n0 C31047k<Void> kVar) throws Exception {
            if (kVar.mo87738v()) {
                return null;
            }
            C32741f.m132248f().mo95055e("Error fetching settings.", kVar.mo87733q());
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.i$b */
    public class C32654b implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ boolean f79217a;

        /* renamed from: b */
        public final /* synthetic */ C32704l f79218b;

        /* renamed from: c */
        public final /* synthetic */ C32935e f79219c;

        public C32654b(boolean z, C32704l lVar, C32935e eVar) {
            this.f79217a = z;
            this.f79218b = lVar;
            this.f79219c = eVar;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            if (!this.f79217a) {
                return null;
            }
            this.f79218b.mo94944j(this.f79219c);
            return null;
        }
    }

    public C32652i(@C0359n0 C32704l lVar) {
        this.f79216a = lVar;
    }

    @C0359n0
    /* renamed from: d */
    public static C32652i m131872d() {
        C32652i iVar = (C32652i) C33033f.m133333p().mo95720l(C32652i.class);
        if (iVar != null) {
            return iVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @C0363p0
    /* renamed from: e */
    public static C32652i m131873e(@C0359n0 C33033f fVar, @C0359n0 C33088k kVar, @C0359n0 C33056a<C32655a> aVar, @C0359n0 C33056a<C32537a> aVar2) {
        Context n = fVar.mo95721n();
        String packageName = n.getPackageName();
        C32741f f = C32741f.m132248f();
        f.mo95056g("Initializing Firebase Crashlytics " + C32704l.m132071m() + " for " + packageName);
        C32921f fVar2 = new C32921f(n);
        C32724s sVar = new C32724s(fVar);
        C32730v vVar = new C32730v(n, packageName, kVar, sVar);
        C32735d dVar = new C32735d(aVar);
        C32646d dVar2 = new C32646d(aVar2);
        C33033f fVar3 = fVar;
        C32730v vVar2 = vVar;
        C32724s sVar2 = sVar;
        C32704l lVar = new C32704l(fVar3, vVar2, dVar, sVar2, dVar2.mo94810e(), dVar2.mo94809d(), fVar2, C32725t.m132193c("Crashlytics Exception Handler"));
        String j = fVar.mo95723s().mo96248j();
        String p = CommonUtils.m131934p(n);
        List<C32675e> l = CommonUtils.m131930l(n);
        C32741f f2 = C32741f.m132248f();
        f2.mo95052b("Mapping file ID is: " + p);
        for (C32675e next : l) {
            C32741f.m132248f().mo95052b(String.format("Build id for %s on %s: %s", new Object[]{next.mo94867c(), next.mo94865a(), next.mo94866b()}));
        }
        C32704l lVar2 = lVar;
        try {
            C32667a a = C32667a.m131948a(n, vVar, j, p, l, new C32738e(n));
            C32741f f3 = C32741f.m132248f();
            f3.mo95060k("Installer package name is: " + a.f79282d);
            ExecutorService c = C32725t.m132193c("com.google.firebase.crashlytics.startup");
            C32935e l2 = C32935e.m133115l(n, j, vVar, new C32914b(), a.f79284f, a.f79285g, fVar2, sVar);
            l2.mo95611p(c).mo87730n(c, new C32653a());
            C31053n.m124522d(c, new C32654b(lVar2.mo94952t(a, l2), lVar2, l2));
            return new C32652i(lVar2);
        } catch (PackageManager.NameNotFoundException e) {
            C32741f.m132248f().mo95055e("Error retrieving app package info.", e);
            return null;
        }
    }

    @C0359n0
    /* renamed from: a */
    public C31047k<Boolean> mo94822a() {
        return this.f79216a.mo94939e();
    }

    /* renamed from: b */
    public void mo94823b() {
        this.f79216a.mo94940f();
    }

    /* renamed from: c */
    public boolean mo94824c() {
        return this.f79216a.mo94941g();
    }

    /* renamed from: f */
    public void mo94825f(@C0359n0 String str) {
        this.f79216a.mo94947o(str);
    }

    /* renamed from: g */
    public void mo94826g(@C0359n0 Throwable th) {
        if (th == null) {
            C32741f.m132248f().mo95062m("A null value was passed to recordException. Ignoring.");
        } else {
            this.f79216a.mo94948p(th);
        }
    }

    /* renamed from: h */
    public void mo94827h() {
        this.f79216a.mo94953u();
    }

    /* renamed from: i */
    public void mo94828i(@C0363p0 Boolean bool) {
        this.f79216a.mo94954v(bool);
    }

    /* renamed from: j */
    public void mo94829j(boolean z) {
        this.f79216a.mo94954v(Boolean.valueOf(z));
    }

    /* renamed from: k */
    public void mo94830k(@C0359n0 String str, double d) {
        this.f79216a.mo94955w(str, Double.toString(d));
    }

    /* renamed from: l */
    public void mo94831l(@C0359n0 String str, float f) {
        this.f79216a.mo94955w(str, Float.toString(f));
    }

    /* renamed from: m */
    public void mo94832m(@C0359n0 String str, int i) {
        this.f79216a.mo94955w(str, Integer.toString(i));
    }

    /* renamed from: n */
    public void mo94833n(@C0359n0 String str, long j) {
        this.f79216a.mo94955w(str, Long.toString(j));
    }

    /* renamed from: o */
    public void mo94834o(@C0359n0 String str, @C0359n0 String str2) {
        this.f79216a.mo94955w(str, str2);
    }

    /* renamed from: p */
    public void mo94835p(@C0359n0 String str, boolean z) {
        this.f79216a.mo94955w(str, Boolean.toString(z));
    }

    /* renamed from: q */
    public void mo94836q(@C0359n0 C32650h hVar) {
        this.f79216a.mo94956x(hVar.f79211a);
    }

    /* renamed from: r */
    public void mo94837r(@C0359n0 String str) {
        this.f79216a.mo94958z(str);
    }
}
