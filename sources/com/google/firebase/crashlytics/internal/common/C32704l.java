package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.C33033f;
import com.google.firebase.crashlytics.internal.C32655a;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.analytics.C32656a;
import com.google.firebase.crashlytics.internal.breadcrumbs.C32664b;
import com.google.firebase.crashlytics.internal.metadata.C32745c;
import com.google.firebase.crashlytics.internal.metadata.C32760i;
import com.google.firebase.crashlytics.internal.persistence.C32921f;
import com.google.firebase.crashlytics.internal.settings.C32940i;
import com.google.firebase.crashlytics.internal.stacktrace.C32944a;
import com.google.firebase.crashlytics.internal.stacktrace.C32946c;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.crashlytics.internal.common.l */
public class C32704l {

    /* renamed from: q */
    public static final String f79373q = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.";

    /* renamed from: r */
    public static final int f79374r = 1024;

    /* renamed from: s */
    public static final int f79375s = 10;

    /* renamed from: t */
    public static final String f79376t = "com.crashlytics.RequireBuildId";

    /* renamed from: u */
    public static final boolean f79377u = true;

    /* renamed from: v */
    public static final int f79378v = 4;

    /* renamed from: w */
    public static final String f79379w = "com.crashlytics.on-demand.recorded-exceptions";

    /* renamed from: x */
    public static final String f79380x = "com.crashlytics.on-demand.dropped-exceptions";

    /* renamed from: y */
    public static final String f79381y = "initialization_marker";

    /* renamed from: z */
    public static final String f79382z = "crash_marker";

    /* renamed from: a */
    public final Context f79383a;

    /* renamed from: b */
    public final C33033f f79384b;

    /* renamed from: c */
    public final C32724s f79385c;

    /* renamed from: d */
    public final C32668a0 f79386d = new C32668a0();

    /* renamed from: e */
    public final long f79387e = System.currentTimeMillis();

    /* renamed from: f */
    public C32710m f79388f;

    /* renamed from: g */
    public C32710m f79389g;

    /* renamed from: h */
    public boolean f79390h;

    /* renamed from: i */
    public C32689j f79391i;

    /* renamed from: j */
    public final C32730v f79392j;

    /* renamed from: k */
    public final C32921f f79393k;
    @C0344h1

    /* renamed from: l */
    public final C32664b f79394l;

    /* renamed from: m */
    public final C32656a f79395m;

    /* renamed from: n */
    public final ExecutorService f79396n;

    /* renamed from: o */
    public final C32681h f79397o;

    /* renamed from: p */
    public final C32655a f79398p;

    /* renamed from: com.google.firebase.crashlytics.internal.common.l$a */
    public class C32705a implements Callable<C31047k<Void>> {

        /* renamed from: a */
        public final /* synthetic */ C32940i f79399a;

        public C32705a(C32940i iVar) {
            this.f79399a = iVar;
        }

        /* renamed from: a */
        public C31047k<Void> call() throws Exception {
            return C32704l.this.mo94943i(this.f79399a);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.l$b */
    public class C32706b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C32940i f79401a;

        public C32706b(C32940i iVar) {
            this.f79401a = iVar;
        }

        public void run() {
            C31047k unused = C32704l.this.mo94943i(this.f79401a);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.l$c */
    public class C32707c implements Callable<Boolean> {
        public C32707c() {
        }

        /* renamed from: a */
        public Boolean call() throws Exception {
            try {
                boolean d = C32704l.this.f79388f.mo94988d();
                if (!d) {
                    C32741f.m132248f().mo95062m("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d);
            } catch (Exception e) {
                C32741f.m132248f().mo95055e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.l$d */
    public class C32708d implements Callable<Boolean> {
        public C32708d() {
        }

        /* renamed from: a */
        public Boolean call() throws Exception {
            return Boolean.valueOf(C32704l.this.f79391i.mo94915u());
        }
    }

    public C32704l(C33033f fVar, C32730v vVar, C32655a aVar, C32724s sVar, C32664b bVar, C32656a aVar2, C32921f fVar2, ExecutorService executorService) {
        this.f79384b = fVar;
        this.f79385c = sVar;
        this.f79383a = fVar.mo95721n();
        this.f79392j = vVar;
        this.f79398p = aVar;
        this.f79394l = bVar;
        this.f79395m = aVar2;
        this.f79396n = executorService;
        this.f79393k = fVar2;
        this.f79397o = new C32681h(executorService);
    }

    /* renamed from: m */
    public static String m132071m() {
        return "18.3.5";
    }

    /* renamed from: n */
    public static boolean m132072n(String str, boolean z) {
        if (!z) {
            C32741f.m132248f().mo95060k("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final void mo94938d() {
        try {
            this.f79390h = Boolean.TRUE.equals((Boolean) C32720q0.m132170d(this.f79397o.mo94883h(new C32708d())));
        } catch (Exception unused) {
            this.f79390h = false;
        }
    }

    @C0359n0
    /* renamed from: e */
    public C31047k<Boolean> mo94939e() {
        return this.f79391i.mo94913o();
    }

    /* renamed from: f */
    public C31047k<Void> mo94940f() {
        return this.f79391i.mo94914t();
    }

    /* renamed from: g */
    public boolean mo94941g() {
        return this.f79390h;
    }

    /* renamed from: h */
    public boolean mo94942h() {
        return this.f79388f.mo94987c();
    }

    /* renamed from: i */
    public final C31047k<Void> mo94943i(C32940i iVar) {
        mo94951s();
        try {
            this.f79394l.mo94807a(new C32702k(this));
            if (!iVar.mo95606b().f80003b.f80010a) {
                C32741f.m132248f().mo95052b("Collection of crash reports disabled in Crashlytics settings.");
                return C31053n.m124524f(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f79391i.mo94891B(iVar)) {
                C32741f.m132248f().mo95062m("Previous sessions could not be finalized.");
            }
            C31047k<Void> X = this.f79391i.mo94908X(iVar.mo95605a());
            mo94950r();
            return X;
        } catch (Exception e) {
            C32741f.m132248f().mo95055e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return C31053n.m124524f(e);
        } finally {
            mo94950r();
        }
    }

    /* renamed from: j */
    public C31047k<Void> mo94944j(C32940i iVar) {
        return C32720q0.m132172f(this.f79396n, new C32705a(iVar));
    }

    /* renamed from: k */
    public final void mo94945k(C32940i iVar) {
        Future<?> submit = this.f79396n.submit(new C32706b(iVar));
        C32741f.m132248f().mo95052b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C32741f.m132248f().mo95055e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            C32741f.m132248f().mo95055e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            C32741f.m132248f().mo95055e("Crashlytics timed out during initialization.", e3);
        }
    }

    /* renamed from: l */
    public C32689j mo94946l() {
        return this.f79391i;
    }

    /* renamed from: o */
    public void mo94947o(String str) {
        this.f79391i.mo94912b0(System.currentTimeMillis() - this.f79387e, str);
    }

    /* renamed from: p */
    public void mo94948p(@C0359n0 Throwable th) {
        this.f79391i.mo94911a0(Thread.currentThread(), th);
    }

    /* renamed from: q */
    public void mo94949q(Throwable th) {
        C32741f f = C32741f.m132248f();
        f.mo95052b("Recorded on-demand fatal events: " + this.f79386d.mo94850b());
        C32741f f2 = C32741f.m132248f();
        f2.mo95052b("Dropped on-demand fatal events: " + this.f79386d.mo94849a());
        this.f79391i.mo94906V(f79379w, Integer.toString(this.f79386d.mo94850b()));
        this.f79391i.mo94906V(f79380x, Integer.toString(this.f79386d.mo94849a()));
        this.f79391i.mo94901Q(Thread.currentThread(), th);
    }

    /* renamed from: r */
    public void mo94950r() {
        this.f79397o.mo94883h(new C32707c());
    }

    /* renamed from: s */
    public void mo94951s() {
        this.f79397o.mo94877b();
        this.f79388f.mo94985a();
        C32741f.m132248f().mo95060k("Initialization marker file was created.");
    }

    /* renamed from: t */
    public boolean mo94952t(C32667a aVar, C32940i iVar) {
        C32940i iVar2 = iVar;
        if (m132072n(aVar.f79280b, CommonUtils.m131929k(this.f79383a, f79376t, true))) {
            String gVar = new C32679g(this.f79392j).toString();
            try {
                this.f79389g = new C32710m(f79382z, this.f79393k);
                this.f79388f = new C32710m(f79381y, this.f79393k);
                C32760i iVar3 = new C32760i(gVar, this.f79393k, this.f79397o);
                C32745c cVar = new C32745c(this.f79393k);
                C32667a aVar2 = aVar;
                C32745c cVar2 = cVar;
                C32760i iVar4 = iVar3;
                C32709l0 k = C32709l0.m132101k(this.f79383a, this.f79392j, this.f79393k, aVar2, cVar2, iVar4, new C32944a(1024, new C32946c(10)), iVar, this.f79386d);
                Context context = this.f79383a;
                C32681h hVar = this.f79397o;
                C32730v vVar = this.f79392j;
                C32724s sVar = this.f79385c;
                C32921f fVar = this.f79393k;
                C32710m mVar = this.f79389g;
                C32760i iVar5 = iVar3;
                Context context2 = context;
                String str = gVar;
                C32681h hVar2 = hVar;
                C32730v vVar2 = vVar;
                C32724s sVar2 = sVar;
                C32921f fVar2 = fVar;
                C32710m mVar2 = mVar;
                C32667a aVar3 = aVar;
                this.f79391i = new C32689j(context2, hVar2, vVar2, sVar2, fVar2, mVar2, aVar3, iVar5, cVar, k, this.f79398p, this.f79395m);
                boolean h = mo94942h();
                mo94938d();
                this.f79391i.mo94920z(str, Thread.getDefaultUncaughtExceptionHandler(), iVar2);
                if (!h || !CommonUtils.m131921c(this.f79383a)) {
                    C32741f.m132248f().mo95052b("Successfully configured exception handler.");
                    return true;
                }
                C32741f.m132248f().mo95052b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                mo94945k(iVar2);
                return false;
            } catch (Exception e) {
                C32741f.m132248f().mo95055e("Crashlytics was not started due to an exception during initialization", e);
                this.f79391i = null;
                return false;
            }
        } else {
            throw new IllegalStateException(f79373q);
        }
    }

    /* renamed from: u */
    public C31047k<Void> mo94953u() {
        return this.f79391i.mo94903S();
    }

    /* renamed from: v */
    public void mo94954v(@C0363p0 Boolean bool) {
        this.f79385c.mo95024g(bool);
    }

    /* renamed from: w */
    public void mo94955w(String str, String str2) {
        this.f79391i.mo94904T(str, str2);
    }

    /* renamed from: x */
    public void mo94956x(Map<String, String> map) {
        this.f79391i.mo94905U(map);
    }

    /* renamed from: y */
    public void mo94957y(String str, String str2) {
        this.f79391i.mo94906V(str, str2);
    }

    /* renamed from: z */
    public void mo94958z(String str) {
        this.f79391i.mo94907W(str);
    }
}
