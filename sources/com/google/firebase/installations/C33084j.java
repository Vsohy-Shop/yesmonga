package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.C33033f;
import com.google.firebase.components.C32611y;
import com.google.firebase.heartbeatinfo.C33050j;
import com.google.firebase.inject.C33058b;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.internal.C33070a;
import com.google.firebase.installations.internal.C33071b;
import com.google.firebase.installations.local.C33093b;
import com.google.firebase.installations.local.C33094c;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.C33122c;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.installations.j */
public class C33084j implements C33088k {

    /* renamed from: m */
    public static final Object f80217m = new Object();

    /* renamed from: n */
    public static final String f80218n = "generatefid.lock";

    /* renamed from: o */
    public static final String f80219o = "CHIME_ANDROID_SDK";

    /* renamed from: p */
    public static final int f80220p = 0;

    /* renamed from: q */
    public static final int f80221q = 1;

    /* renamed from: r */
    public static final long f80222r = 30;

    /* renamed from: s */
    public static final ThreadFactory f80223s = new C33085a();

    /* renamed from: t */
    public static final String f80224t = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* renamed from: u */
    public static final String f80225u = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* renamed from: v */
    public static final String f80226v = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* renamed from: w */
    public static final String f80227w = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";

    /* renamed from: a */
    public final C33033f f80228a;

    /* renamed from: b */
    public final C33122c f80229b;

    /* renamed from: c */
    public final PersistedInstallation f80230c;

    /* renamed from: d */
    public final C33124s f80231d;

    /* renamed from: e */
    public final C32611y<C33093b> f80232e;

    /* renamed from: f */
    public final C33112q f80233f;

    /* renamed from: g */
    public final Object f80234g;

    /* renamed from: h */
    public final ExecutorService f80235h;

    /* renamed from: i */
    public final Executor f80236i;
    @C0323b0("this")

    /* renamed from: j */
    public String f80237j;
    @C0323b0("FirebaseInstallations.this")

    /* renamed from: k */
    public Set<C33070a> f80238k;
    @C0323b0("lock")

    /* renamed from: l */
    public final List<C33113r> f80239l;

    /* renamed from: com.google.firebase.installations.j$a */
    public class C33085a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f80240a = new AtomicInteger(1);

        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f80240a.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.j$b */
    public class C33086b implements C33071b {

        /* renamed from: a */
        public final /* synthetic */ C33070a f80241a;

        public C33086b(C33070a aVar) {
            this.f80241a = aVar;
        }

        /* renamed from: a */
        public void mo95794a() {
            synchronized (C33084j.this) {
                C33084j.this.f80238k.remove(this.f80241a);
            }
        }
    }

    /* renamed from: com.google.firebase.installations.j$c */
    public static /* synthetic */ class C33087c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f80243a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f80244b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = com.google.firebase.installations.remote.TokenResult.ResponseCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f80244b = r0
                r1 = 1
                com.google.firebase.installations.remote.TokenResult$ResponseCode r2 = com.google.firebase.installations.remote.TokenResult.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f80244b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f80244b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f80243a = r2
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r3 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f80243a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C33084j.C33087c.<clinit>():void");
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C33084j(C33033f fVar, @C0359n0 C33058b<C33050j> bVar, @C0359n0 ExecutorService executorService, @C0359n0 Executor executor) {
        this(executorService, executor, fVar, new C33122c(fVar.mo95721n(), bVar), new PersistedInstallation(fVar), C33124s.m133617c(), new C32611y(new C33069i(fVar)), new C33112q());
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m133431C() {
        m133432D(false);
    }

    /* renamed from: E */
    public static /* synthetic */ C33093b m133433E(C33033f fVar) {
        return new C33093b(fVar);
    }

    @C0359n0
    /* renamed from: u */
    public static C33084j m133440u() {
        return m133441v(C33033f.m133333p());
    }

    @C0359n0
    /* renamed from: v */
    public static C33084j m133441v(@C0359n0 C33033f fVar) {
        boolean z;
        if (fVar != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166192b(z, "Null is not a valid value of FirebaseApp.");
        return (C33084j) fVar.mo95720l(C33088k.class);
    }

    /* renamed from: A */
    public final void mo95795A(C33094c cVar) {
        synchronized (f80217m) {
            C33064d a = C33064d.m133426a(this.f80228a.mo95721n(), f80218n);
            try {
                this.f80230c.mo95825c(cVar);
                if (a != null) {
                    a.mo95788b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo95788b();
                }
                throw th;
            }
        }
    }

    /* renamed from: F */
    public final void mo95796F() {
        C40843u.m166199i(mo95815r(), f80225u);
        C40843u.m166199i(mo95821z(), f80226v);
        C40843u.m166199i(mo95814q(), f80224t);
        C40843u.m166192b(C33124s.m133620h(mo95815r()), f80225u);
        C40843u.m166192b(C33124s.m133619g(mo95814q()), f80224t);
    }

    /* renamed from: G */
    public final String mo95797G(C33094c cVar) {
        if ((!this.f80228a.mo95722r().equals(f80219o) && !this.f80228a.mo95706B()) || !cVar.mo95858m()) {
            return this.f80233f.mo95867a();
        }
        String f = mo95817t().mo95850f();
        if (TextUtils.isEmpty(f)) {
            return this.f80233f.mo95867a();
        }
        return f;
    }

    /* renamed from: H */
    public final C33094c mo95798H(C33094c cVar) throws FirebaseInstallationsException {
        String str;
        if (cVar.mo95830d() == null || cVar.mo95830d().length() != 11) {
            str = null;
        } else {
            str = mo95817t().mo95853i();
        }
        InstallationResponse d = this.f80229b.mo95894d(mo95814q(), cVar.mo95830d(), mo95821z(), mo95815r(), str);
        int i = C33087c.f80243a[d.mo95871e().ordinal()];
        if (i == 1) {
            return cVar.mo95863s(d.mo95869c(), d.mo95870d(), this.f80231d.mo95909b(), d.mo95868b().mo95881c(), d.mo95868b().mo95882d());
        } else if (i == 2) {
            return cVar.mo95861q("BAD CONFIG");
        } else {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* renamed from: I */
    public final void mo95799I(Exception exc) {
        synchronized (this.f80234g) {
            Iterator<C33113r> it = this.f80239l.iterator();
            while (it.hasNext()) {
                if (it.next().mo95865a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: J */
    public final void mo95800J(C33094c cVar) {
        synchronized (this.f80234g) {
            Iterator<C33113r> it = this.f80239l.iterator();
            while (it.hasNext()) {
                if (it.next().mo95866b(cVar)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: K */
    public final synchronized void mo95801K(String str) {
        this.f80237j = str;
    }

    /* renamed from: L */
    public final synchronized void mo95802L(C33094c cVar, C33094c cVar2) {
        if (this.f80238k.size() != 0 && !TextUtils.equals(cVar.mo95830d(), cVar2.mo95830d())) {
            for (C33070a a : this.f80238k) {
                a.mo95793a(cVar2.mo95830d());
            }
        }
    }

    @C0359n0
    /* renamed from: a */
    public synchronized C33071b mo95803a(@C0359n0 C33070a aVar) {
        this.f80238k.add(aVar);
        return new C33086b(aVar);
    }

    @C0359n0
    /* renamed from: b */
    public C31047k<C33098o> mo95804b(boolean z) {
        mo95796F();
        C31047k<C33098o> j = mo95807j();
        this.f80235h.execute(new C33067g(this, z));
        return j;
    }

    @C0359n0
    /* renamed from: c */
    public C31047k<Void> mo95805c() {
        return C31053n.m124522d(this.f80235h, new C33066f(this));
    }

    @C0359n0
    public C31047k<String> getId() {
        mo95796F();
        String s = mo95816s();
        if (s != null) {
            return C31053n.m124525g(s);
        }
        C31047k<String> k = mo95808k();
        this.f80235h.execute(new C33068h(this));
        return k;
    }

    /* renamed from: j */
    public final C31047k<C33098o> mo95807j() {
        C31049l lVar = new C31049l();
        mo95809l(new C33096m(this.f80231d, lVar));
        return lVar.mo87741a();
    }

    /* renamed from: k */
    public final C31047k<String> mo95808k() {
        C31049l lVar = new C31049l();
        mo95809l(new C33097n(lVar));
        return lVar.mo87741a();
    }

    /* renamed from: l */
    public final void mo95809l(C33113r rVar) {
        synchronized (this.f80234g) {
            this.f80239l.add(rVar);
        }
    }

    /* renamed from: m */
    public final Void mo95810m() throws FirebaseInstallationsException {
        mo95801K((String) null);
        C33094c w = mo95818w();
        if (w.mo95856k()) {
            this.f80229b.mo95895e(mo95814q(), w.mo95830d(), mo95821z(), w.mo95833f());
        }
        mo95795A(w.mo95862r());
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m133430B(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.local.c r0 = r2.mo95818w()
            boolean r1 = r0.mo95854i()     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo95857l()     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.s r3 = r2.f80231d     // Catch:{ FirebaseInstallationsException -> 0x005f }
            boolean r3 = r3.mo95911f(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.google.firebase.installations.local.c r3 = r2.mo95813p(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
            goto L_0x0026
        L_0x0022:
            com.google.firebase.installations.local.c r3 = r2.mo95798H(r0)     // Catch:{ FirebaseInstallationsException -> 0x005f }
        L_0x0026:
            r2.mo95795A(r3)
            r2.mo95802L(r0, r3)
            boolean r0 = r3.mo95856k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.mo95830d()
            r2.mo95801K(r0)
        L_0x0039:
            boolean r0 = r3.mo95854i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r3.<init>(r0)
            r2.mo95799I(r3)
            goto L_0x005e
        L_0x004a:
            boolean r0 = r3.mo95855j()
            if (r0 == 0) goto L_0x005b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.mo95799I(r3)
            goto L_0x005e
        L_0x005b:
            r2.mo95800J(r3)
        L_0x005e:
            return
        L_0x005f:
            r3 = move-exception
            r2.mo95799I(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C33084j.m133430B(boolean):void");
    }

    /* renamed from: o */
    public final void m133432D(boolean z) {
        C33094c y = mo95820y();
        if (z) {
            y = y.mo95860p();
        }
        mo95800J(y);
        this.f80236i.execute(new C33065e(this, z));
    }

    /* renamed from: p */
    public final C33094c mo95813p(@C0359n0 C33094c cVar) throws FirebaseInstallationsException {
        TokenResult f = this.f80229b.mo95896f(mo95814q(), cVar.mo95830d(), mo95821z(), cVar.mo95833f());
        int i = C33087c.f80244b[f.mo95880b().ordinal()];
        if (i == 1) {
            return cVar.mo95859o(f.mo95881c(), f.mo95882d(), this.f80231d.mo95909b());
        } else if (i == 2) {
            return cVar.mo95861q("BAD CONFIG");
        } else {
            if (i == 3) {
                mo95801K((String) null);
                return cVar.mo95862r();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    @C0363p0
    /* renamed from: q */
    public String mo95814q() {
        return this.f80228a.mo95723s().mo96247i();
    }

    @C0344h1
    /* renamed from: r */
    public String mo95815r() {
        return this.f80228a.mo95723s().mo96248j();
    }

    /* renamed from: s */
    public final synchronized String mo95816s() {
        return this.f80237j;
    }

    /* renamed from: t */
    public final C33093b mo95817t() {
        return this.f80232e.get();
    }

    /* renamed from: w */
    public final C33094c mo95818w() {
        C33094c e;
        synchronized (f80217m) {
            C33064d a = C33064d.m133426a(this.f80228a.mo95721n(), f80218n);
            try {
                e = this.f80230c.mo95827e();
                if (a != null) {
                    a.mo95788b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo95788b();
                }
                throw th;
            }
        }
        return e;
    }

    @C0344h1
    /* renamed from: x */
    public String mo95819x() {
        return this.f80228a.mo95722r();
    }

    /* renamed from: y */
    public final C33094c mo95820y() {
        C33094c e;
        synchronized (f80217m) {
            C33064d a = C33064d.m133426a(this.f80228a.mo95721n(), f80218n);
            try {
                e = this.f80230c.mo95827e();
                if (e.mo95855j()) {
                    e = this.f80230c.mo95825c(e.mo95864t(mo95797G(e)));
                }
                if (a != null) {
                    a.mo95788b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo95788b();
                }
                throw th;
            }
        }
        return e;
    }

    @C0363p0
    /* renamed from: z */
    public String mo95821z() {
        return this.f80228a.mo95723s().mo96252n();
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C33084j(ExecutorService executorService, Executor executor, C33033f fVar, C33122c cVar, PersistedInstallation persistedInstallation, C33124s sVar, C32611y<C33093b> yVar, C33112q qVar) {
        this.f80234g = new Object();
        this.f80238k = new HashSet();
        this.f80239l = new ArrayList();
        this.f80228a = fVar;
        this.f80229b = cVar;
        this.f80230c = persistedInstallation;
        this.f80231d = sVar;
        this.f80232e = yVar;
        this.f80233f = qVar;
        this.f80235h = executorService;
        this.f80236i = executor;
    }
}
