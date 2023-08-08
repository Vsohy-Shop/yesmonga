package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.C0696c;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.google.android.gms.tasks.C31045j;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.crashlytics.internal.C32655a;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.C32742g;
import com.google.firebase.crashlytics.internal.analytics.C32656a;
import com.google.firebase.crashlytics.internal.common.C32718q;
import com.google.firebase.crashlytics.internal.metadata.C32745c;
import com.google.firebase.crashlytics.internal.metadata.C32760i;
import com.google.firebase.crashlytics.internal.model.C32837c0;
import com.google.firebase.crashlytics.internal.persistence.C32921f;
import com.google.firebase.crashlytics.internal.settings.C32932d;
import com.google.firebase.crashlytics.internal.settings.C32937f;
import com.google.firebase.crashlytics.internal.settings.C32940i;
import com.google.firebase.messaging.FirebaseMessaging;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.crashlytics.internal.common.j */
public class C32689j {

    /* renamed from: s */
    public static final String f79317s = "fatal";

    /* renamed from: t */
    public static final String f79318t = "timestamp";

    /* renamed from: u */
    public static final String f79319u = "_ae";

    /* renamed from: v */
    public static final String f79320v = ".ae";

    /* renamed from: w */
    public static final FilenameFilter f79321w = new C32687i();

    /* renamed from: x */
    public static final String f79322x = "native-sessions";

    /* renamed from: y */
    public static final int f79323y = 1;

    /* renamed from: z */
    public static final String f79324z = "Crashlytics Android SDK/%s";

    /* renamed from: a */
    public final Context f79325a;

    /* renamed from: b */
    public final C32724s f79326b;

    /* renamed from: c */
    public final C32710m f79327c;

    /* renamed from: d */
    public final C32760i f79328d;

    /* renamed from: e */
    public final C32681h f79329e;

    /* renamed from: f */
    public final C32730v f79330f;

    /* renamed from: g */
    public final C32921f f79331g;

    /* renamed from: h */
    public final C32667a f79332h;

    /* renamed from: i */
    public final C32745c f79333i;

    /* renamed from: j */
    public final C32655a f79334j;

    /* renamed from: k */
    public final C32656a f79335k;

    /* renamed from: l */
    public final C32709l0 f79336l;

    /* renamed from: m */
    public C32718q f79337m;

    /* renamed from: n */
    public C32940i f79338n = null;

    /* renamed from: o */
    public final C31049l<Boolean> f79339o = new C31049l<>();

    /* renamed from: p */
    public final C31049l<Boolean> f79340p = new C31049l<>();

    /* renamed from: q */
    public final C31049l<Void> f79341q = new C31049l<>();

    /* renamed from: r */
    public final AtomicBoolean f79342r = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.internal.common.j$a */
    public class C32690a implements C32718q.C32719a {
        public C32690a() {
        }

        /* renamed from: a */
        public void mo94921a(@C0359n0 C32940i iVar, @C0359n0 Thread thread, @C0359n0 Throwable th) {
            C32689j.this.mo94895J(iVar, thread, th);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.j$b */
    public class C32691b implements Callable<C31047k<Void>> {

        /* renamed from: a */
        public final /* synthetic */ long f79344a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f79345b;

        /* renamed from: c */
        public final /* synthetic */ Thread f79346c;

        /* renamed from: d */
        public final /* synthetic */ C32940i f79347d;

        /* renamed from: e */
        public final /* synthetic */ boolean f79348e;

        /* renamed from: com.google.firebase.crashlytics.internal.common.j$b$a */
        public class C32692a implements C31045j<C32932d, Void> {

            /* renamed from: a */
            public final /* synthetic */ Executor f79350a;

            /* renamed from: b */
            public final /* synthetic */ String f79351b;

            public C32692a(Executor executor, String str) {
                this.f79350a = executor;
                this.f79351b = str;
            }

            @C0359n0
            /* renamed from: b */
            public C31047k<Void> mo87716a(@C0363p0 C32932d dVar) throws Exception {
                String str = null;
                if (dVar == null) {
                    C32741f.m132248f().mo95062m("Received null app settings, cannot send reports at crash time.");
                    return C31053n.m124525g(null);
                }
                C31047k[] kVarArr = new C31047k[2];
                kVarArr[0] = C32689j.this.mo94900P();
                C32709l0 h = C32689j.this.f79336l;
                Executor executor = this.f79350a;
                if (C32691b.this.f79348e) {
                    str = this.f79351b;
                }
                kVarArr[1] = h.mo94984z(executor, str);
                return C31053n.m124527i(kVarArr);
            }
        }

        public C32691b(long j, Throwable th, Thread thread, C32940i iVar, boolean z) {
            this.f79344a = j;
            this.f79345b = th;
            this.f79346c = thread;
            this.f79347d = iVar;
            this.f79348e = z;
        }

        /* renamed from: a */
        public C31047k<Void> call() throws Exception {
            long b = C32689j.m132001H(this.f79344a);
            String c = C32689j.this.mo94893E();
            if (c == null) {
                C32741f.m132248f().mo95054d("Tried to write a fatal exception while no session was open.");
                return C31053n.m124525g(null);
            }
            C32689j.this.f79327c.mo94985a();
            C32689j.this.f79336l.mo94979u(this.f79345b, this.f79346c, c, b);
            C32689j.this.mo94919y(this.f79344a);
            C32689j.this.mo94916v(this.f79347d);
            C32689j.this.mo94918x(new C32679g(C32689j.this.f79330f).toString());
            if (!C32689j.this.f79326b.mo95022d()) {
                return C31053n.m124525g(null);
            }
            Executor c2 = C32689j.this.f79329e.mo94878c();
            return this.f79347d.mo95605a().mo87740x(c2, new C32692a(c2, c));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.j$c */
    public class C32693c implements C31045j<Void, Boolean> {
        public C32693c() {
        }

        @C0359n0
        /* renamed from: b */
        public C31047k<Boolean> mo87716a(@C0363p0 Void voidR) throws Exception {
            return C31053n.m124525g(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.j$d */
    public class C32694d implements C31045j<Boolean, Void> {

        /* renamed from: a */
        public final /* synthetic */ C31047k f79354a;

        /* renamed from: com.google.firebase.crashlytics.internal.common.j$d$a */
        public class C32695a implements Callable<C31047k<Void>> {

            /* renamed from: a */
            public final /* synthetic */ Boolean f79356a;

            /* renamed from: com.google.firebase.crashlytics.internal.common.j$d$a$a */
            public class C32696a implements C31045j<C32932d, Void> {

                /* renamed from: a */
                public final /* synthetic */ Executor f79358a;

                public C32696a(Executor executor) {
                    this.f79358a = executor;
                }

                @C0359n0
                /* renamed from: b */
                public C31047k<Void> mo87716a(@C0363p0 C32932d dVar) throws Exception {
                    if (dVar == null) {
                        C32741f.m132248f().mo95062m("Received null app settings at app startup. Cannot send cached reports");
                        return C31053n.m124525g(null);
                    }
                    C31047k unused = C32689j.this.mo94900P();
                    C32689j.this.f79336l.mo94983y(this.f79358a);
                    C32689j.this.f79341q.mo87745e(null);
                    return C31053n.m124525g(null);
                }
            }

            public C32695a(Boolean bool) {
                this.f79356a = bool;
            }

            /* renamed from: a */
            public C31047k<Void> call() throws Exception {
                if (!this.f79356a.booleanValue()) {
                    C32741f.m132248f().mo95060k("Deleting cached crash reports...");
                    C32689j.m132020s(C32689j.this.mo94898N());
                    C32689j.this.f79336l.mo94982x();
                    C32689j.this.f79341q.mo87745e(null);
                    return C31053n.m124525g(null);
                }
                C32741f.m132248f().mo95052b("Sending cached crash reports...");
                C32689j.this.f79326b.mo95021c(this.f79356a.booleanValue());
                Executor c = C32689j.this.f79329e.mo94878c();
                return C32694d.this.f79354a.mo87740x(c, new C32696a(c));
            }
        }

        public C32694d(C31047k kVar) {
            this.f79354a = kVar;
        }

        @C0359n0
        /* renamed from: b */
        public C31047k<Void> mo87716a(@C0363p0 Boolean bool) throws Exception {
            return C32689j.this.f79329e.mo94884i(new C32695a(bool));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.j$e */
    public class C32697e implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ long f79360a;

        /* renamed from: b */
        public final /* synthetic */ String f79361b;

        public C32697e(long j, String str) {
            this.f79360a = j;
            this.f79361b = str;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            if (C32689j.this.mo94897L()) {
                return null;
            }
            C32689j.this.f79333i.mo95079g(this.f79360a, this.f79361b);
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.j$f */
    public class C32698f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ long f79363a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f79364b;

        /* renamed from: c */
        public final /* synthetic */ Thread f79365c;

        public C32698f(long j, Throwable th, Thread thread) {
            this.f79363a = j;
            this.f79364b = th;
            this.f79365c = thread;
        }

        public void run() {
            if (!C32689j.this.mo94897L()) {
                long b = C32689j.m132001H(this.f79363a);
                String c = C32689j.this.mo94893E();
                if (c == null) {
                    C32741f.m132248f().mo95062m("Tried to write a non-fatal exception while no session was open.");
                } else {
                    C32689j.this.f79336l.mo94980v(this.f79364b, this.f79365c, c, b);
                }
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.j$g */
    public class C32699g implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ String f79367a;

        public C32699g(String str) {
            this.f79367a = str;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            C32689j.this.mo94918x(this.f79367a);
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.j$h */
    public class C32700h implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ long f79369a;

        public C32700h(long j) {
            this.f79369a = j;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt(C32689j.f79317s, 1);
            bundle.putLong("timestamp", this.f79369a);
            C32689j.this.f79335k.mo94808a("_ae", bundle);
            return null;
        }
    }

    public C32689j(Context context, C32681h hVar, C32730v vVar, C32724s sVar, C32921f fVar, C32710m mVar, C32667a aVar, C32760i iVar, C32745c cVar, C32709l0 l0Var, C32655a aVar2, C32656a aVar3) {
        this.f79325a = context;
        this.f79329e = hVar;
        this.f79330f = vVar;
        this.f79326b = sVar;
        this.f79331g = fVar;
        this.f79327c = mVar;
        this.f79332h = aVar;
        this.f79328d = iVar;
        this.f79333i = cVar;
        this.f79334j = aVar2;
        this.f79335k = aVar3;
        this.f79336l = l0Var;
    }

    /* renamed from: C */
    public static boolean m131998C() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: F */
    public static long m131999F() {
        return m132001H(System.currentTimeMillis());
    }

    @C0359n0
    /* renamed from: G */
    public static List<C32733y> m132000G(C32742g gVar, String str, C32921f fVar, byte[] bArr) {
        File p = fVar.mo95578p(str, C32760i.f79535g);
        File p2 = fVar.mo95578p(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C32677f("logs_file", C10108c.f27798a, bArr));
        arrayList.add(new C32729u("crash_meta_file", "metadata", gVar.mo95043d()));
        arrayList.add(new C32729u("session_meta_file", C32937f.f80028b, gVar.mo95046g()));
        arrayList.add(new C32729u("app_meta_file", FirebaseMessaging.f80405r, gVar.mo95044e()));
        arrayList.add(new C32729u("device_meta_file", "device", gVar.mo95040a()));
        arrayList.add(new C32729u("os_meta_file", "os", gVar.mo95045f()));
        arrayList.add(new C32729u("minidump_file", "minidump", gVar.mo95042c()));
        arrayList.add(new C32729u("user_meta_file", C38212b.f96784D, p));
        arrayList.add(new C32729u("keys_file", "keys", p2));
        return arrayList;
    }

    /* renamed from: H */
    public static long m132001H(long j) {
        return j / 1000;
    }

    /* renamed from: p */
    public static C32837c0.C32838a m132017p(C32730v vVar, C32667a aVar) {
        return C32837c0.C32838a.m132727b(vVar.mo95032f(), aVar.f79284f, aVar.f79285g, vVar.mo95029a(), DeliveryMechanism.m131946b(aVar.f79282d).mo94847g(), aVar.f79286h);
    }

    /* renamed from: q */
    public static C32837c0.C32839b m132018q() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return C32837c0.C32839b.m132734c(CommonUtils.m131931m(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.m131940v(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), CommonUtils.m131912B(), CommonUtils.m131932n(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: r */
    public static C32837c0.C32840c m132019r() {
        return C32837c0.C32840c.m132744a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.m131914D());
    }

    /* renamed from: s */
    public static void m132020s(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    /* renamed from: A */
    public final void mo94890A(String str) {
        C32741f f = C32741f.m132248f();
        f.mo95060k("Finalizing native report for session " + str);
        C32742g a = this.f79334j.mo94840a(str);
        File c = a.mo95042c();
        if (c == null || !c.exists()) {
            C32741f f2 = C32741f.m132248f();
            f2.mo95062m("No minidump data found for session " + str);
            return;
        }
        long lastModified = c.lastModified();
        C32745c cVar = new C32745c(this.f79331g, str);
        File j = this.f79331g.mo95572j(str);
        if (!j.isDirectory()) {
            C32741f.m132248f().mo95062m("Couldn't create directory to store native session files, aborting.");
            return;
        }
        mo94919y(lastModified);
        List<C32733y> G = m132000G(a, str, this.f79331g, cVar.mo95074b());
        C32734z.m132223b(j, G);
        C32741f.m132248f().mo95052b("CrashlyticsController#finalizePreviousNativeSession");
        this.f79336l.mo94972l(str, G);
        cVar.mo95073a();
    }

    /* renamed from: B */
    public boolean mo94891B(C32940i iVar) {
        this.f79329e.mo94877b();
        if (mo94897L()) {
            C32741f.m132248f().mo95062m("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C32741f.m132248f().mo95060k("Finalizing previously open sessions.");
        try {
            mo94917w(true, iVar);
            C32741f.m132248f().mo95060k("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            C32741f.m132248f().mo95055e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* renamed from: D */
    public final Context mo94892D() {
        return this.f79325a;
    }

    @C0363p0
    /* renamed from: E */
    public final String mo94893E() {
        SortedSet<String> r = this.f79336l.mo94976r();
        if (!r.isEmpty()) {
            return r.first();
        }
        return null;
    }

    /* renamed from: I */
    public C32760i mo94894I() {
        return this.f79328d;
    }

    /* renamed from: J */
    public void mo94895J(@C0359n0 C32940i iVar, @C0359n0 Thread thread, @C0359n0 Throwable th) {
        mo94896K(iVar, thread, th, false);
    }

    /* renamed from: K */
    public synchronized void mo94896K(@C0359n0 C32940i iVar, @C0359n0 Thread thread, @C0359n0 Throwable th, boolean z) {
        C32741f f = C32741f.m132248f();
        f.mo95052b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            C32720q0.m132170d(this.f79329e.mo94884i(new C32691b(System.currentTimeMillis(), th, thread, iVar, z)));
        } catch (TimeoutException unused) {
            C32741f.m132248f().mo95054d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e) {
            C32741f.m132248f().mo95055e("Error handling uncaught exception", e);
        }
    }

    /* renamed from: L */
    public boolean mo94897L() {
        C32718q qVar = this.f79337m;
        return qVar != null && qVar.mo95014a();
    }

    /* renamed from: N */
    public List<File> mo94898N() {
        return this.f79331g.mo95569g(f79321w);
    }

    /* renamed from: O */
    public final C31047k<Void> mo94899O(long j) {
        if (m131998C()) {
            C32741f.m132248f().mo95062m("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return C31053n.m124525g(null);
        }
        C32741f.m132248f().mo95052b("Logging app exception event to Firebase Analytics");
        return C31053n.m124522d(new ScheduledThreadPoolExecutor(1), new C32700h(j));
    }

    /* renamed from: P */
    public final C31047k<Void> mo94900P() {
        ArrayList arrayList = new ArrayList();
        for (File next : mo94898N()) {
            try {
                arrayList.add(mo94899O(Long.parseLong(next.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C32741f f = C32741f.m132248f();
                f.mo95062m("Could not parse app exception timestamp from file " + next.getName());
            }
            next.delete();
        }
        return C31053n.m124526h(arrayList);
    }

    /* renamed from: Q */
    public void mo94901Q(Thread thread, Throwable th) {
        C32940i iVar = this.f79338n;
        if (iVar == null) {
            C32741f.m132248f().mo95062m("settingsProvider not set");
        } else {
            mo94896K(iVar, thread, th, true);
        }
    }

    /* renamed from: R */
    public void mo94902R(String str) {
        this.f79329e.mo94883h(new C32699g(str));
    }

    /* renamed from: S */
    public C31047k<Void> mo94903S() {
        this.f79340p.mo87745e(Boolean.TRUE);
        return this.f79341q.mo87741a();
    }

    /* renamed from: T */
    public void mo94904T(String str, String str2) {
        try {
            this.f79328d.mo95125l(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f79325a;
            if (context == null || !CommonUtils.m131944z(context)) {
                C32741f.m132248f().mo95054d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e;
        }
    }

    /* renamed from: U */
    public void mo94905U(Map<String, String> map) {
        this.f79328d.mo95126m(map);
    }

    /* renamed from: V */
    public void mo94906V(String str, String str2) {
        try {
            this.f79328d.mo95127n(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f79325a;
            if (context == null || !CommonUtils.m131944z(context)) {
                C32741f.m132248f().mo95054d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e;
        }
    }

    /* renamed from: W */
    public void mo94907W(String str) {
        this.f79328d.mo95128o(str);
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: X */
    public C31047k<Void> mo94908X(C31047k<C32932d> kVar) {
        if (!this.f79336l.mo94975p()) {
            C32741f.m132248f().mo95060k("No crash reports are available to be sent.");
            this.f79339o.mo87745e(Boolean.FALSE);
            return C31053n.m124525g(null);
        }
        C32741f.m132248f().mo95060k("Crash reports are available to be sent.");
        return mo94909Y().mo87739w(new C32694d(kVar));
    }

    /* renamed from: Y */
    public final C31047k<Boolean> mo94909Y() {
        if (this.f79326b.mo95022d()) {
            C32741f.m132248f().mo95052b("Automatic data collection is enabled. Allowing upload.");
            this.f79339o.mo87745e(Boolean.FALSE);
            return C31053n.m124525g(Boolean.TRUE);
        }
        C32741f.m132248f().mo95052b("Automatic data collection is disabled.");
        C32741f.m132248f().mo95060k("Notifying that unsent reports are available.");
        this.f79339o.mo87745e(Boolean.TRUE);
        C31047k<TContinuationResult> w = this.f79326b.mo95025i().mo87739w(new C32693c());
        C32741f.m132248f().mo95052b("Waiting for send/deleteUnsentReports to be called.");
        return C32720q0.m132176j(w, this.f79340p.mo87741a());
    }

    /* renamed from: Z */
    public final void mo94910Z(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            List a = ((ActivityManager) this.f79325a.getSystemService(C0696c.f2306r)).getHistoricalProcessExitReasons((String) null, 0, 0);
            if (a.size() != 0) {
                this.f79336l.mo94981w(str, a, new C32745c(this.f79331g, str), C32760i.m132352i(str, this.f79331g, this.f79329e));
                return;
            }
            C32741f f = C32741f.m132248f();
            f.mo95060k("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        C32741f f2 = C32741f.m132248f();
        f2.mo95060k("ANR feature enabled, but device is API " + i);
    }

    /* renamed from: a0 */
    public void mo94911a0(@C0359n0 Thread thread, @C0359n0 Throwable th) {
        this.f79329e.mo94882g(new C32698f(System.currentTimeMillis(), th, thread));
    }

    /* renamed from: b0 */
    public void mo94912b0(long j, String str) {
        this.f79329e.mo94883h(new C32697e(j, str));
    }

    @C0359n0
    /* renamed from: o */
    public C31047k<Boolean> mo94913o() {
        if (this.f79342r.compareAndSet(false, true)) {
            return this.f79339o.mo87741a();
        }
        C32741f.m132248f().mo95062m("checkForUnsentReports should only be called once per execution.");
        return C31053n.m124525g(Boolean.FALSE);
    }

    /* renamed from: t */
    public C31047k<Void> mo94914t() {
        this.f79340p.mo87745e(Boolean.FALSE);
        return this.f79341q.mo87741a();
    }

    /* renamed from: u */
    public boolean mo94915u() {
        if (!this.f79327c.mo94987c()) {
            String E = mo94893E();
            if (E == null || !this.f79334j.mo94843d(E)) {
                return false;
            }
            return true;
        }
        C32741f.m132248f().mo95060k("Found previous crash marker.");
        this.f79327c.mo94988d();
        return true;
    }

    /* renamed from: v */
    public void mo94916v(C32940i iVar) {
        mo94917w(false, iVar);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94917w(boolean r4, com.google.firebase.crashlytics.internal.settings.C32940i r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.firebase.crashlytics.internal.common.l0 r1 = r3.f79336l
            java.util.SortedSet r1 = r1.mo94976r()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r4) goto L_0x001b
            com.google.firebase.crashlytics.internal.f r4 = com.google.firebase.crashlytics.internal.C32741f.m132248f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.mo95060k(r5)
            return
        L_0x001b:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            com.google.firebase.crashlytics.internal.settings.d r5 = r5.mo95606b()
            com.google.firebase.crashlytics.internal.settings.d$a r5 = r5.f80003b
            boolean r5 = r5.f80011b
            if (r5 == 0) goto L_0x002f
            r3.mo94910Z(r1)
            goto L_0x0038
        L_0x002f:
            com.google.firebase.crashlytics.internal.f r5 = com.google.firebase.crashlytics.internal.C32741f.m132248f()
            java.lang.String r2 = "ANR feature disabled."
            r5.mo95060k(r2)
        L_0x0038:
            com.google.firebase.crashlytics.internal.a r5 = r3.f79334j
            boolean r5 = r5.mo94843d(r1)
            if (r5 == 0) goto L_0x0043
            r3.mo94890A(r1)
        L_0x0043:
            if (r4 == 0) goto L_0x004d
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            com.google.firebase.crashlytics.internal.common.l0 r5 = r3.f79336l
            long r0 = m131999F()
            r5.mo94973m(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.C32689j.mo94917w(boolean, com.google.firebase.crashlytics.internal.settings.i):void");
    }

    /* renamed from: x */
    public final void mo94918x(String str) {
        long F = m131999F();
        C32741f f = C32741f.m132248f();
        f.mo95052b("Opening a new session with ID " + str);
        String format = String.format(Locale.US, f79324z, new Object[]{C32704l.m132071m()});
        C32837c0.C32838a p = m132017p(this.f79330f, this.f79332h);
        C32837c0.C32840c r = m132019r();
        C32837c0.C32839b q = m132018q();
        this.f79334j.mo94842c(str, format, F, C32837c0.m132723b(p, r, q));
        this.f79333i.mo95077e(str);
        this.f79336l.mo94966a(str, F);
    }

    /* renamed from: y */
    public final void mo94919y(long j) {
        try {
            C32921f fVar = this.f79331g;
            if (!fVar.mo95568f(f79320v + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            C32741f.m132248f().mo95063n("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: z */
    public void mo94920z(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C32940i iVar) {
        this.f79338n = iVar;
        mo94902R(str);
        C32718q qVar = new C32718q(new C32690a(), iVar, uncaughtExceptionHandler, this.f79334j);
        this.f79337m = qVar;
        Thread.setDefaultUncaughtExceptionHandler(qVar);
    }
}
