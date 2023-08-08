package androidx.work.impl;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.C0843a;
import androidx.compose.runtime.C8698y1;
import androidx.lifecycle.LiveData;
import androidx.work.C21082a;
import androidx.work.C21377l;
import androidx.work.C21379m;
import androidx.work.C21397o;
import androidx.work.C21403p;
import androidx.work.C21408s;
import androidx.work.C21411u;
import androidx.work.C21412v;
import androidx.work.C21414w;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.greedy.C21107b;
import androidx.work.impl.background.systemjob.C21132g;
import androidx.work.impl.constraints.trackers.C21172o;
import androidx.work.impl.foreground.C21186b;
import androidx.work.impl.model.C21237m;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.utils.C21292a0;
import androidx.work.impl.utils.C21295c;
import androidx.work.impl.utils.C21335o;
import androidx.work.impl.utils.C21342t;
import androidx.work.impl.utils.C21350v;
import androidx.work.impl.utils.C21351w;
import androidx.work.impl.utils.C21354y;
import androidx.work.impl.utils.C21355z;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.futures.C21317a;
import androidx.work.impl.utils.taskexecutor.C21345b;
import androidx.work.impl.utils.taskexecutor.C21346c;
import androidx.work.multiprocess.C21395e;
import com.google.common.util.concurrent.C32487a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.g0 */
public class C21191g0 extends WorkManager {

    /* renamed from: l */
    public static final String f54686l = C21377l.m98584i("WorkManagerImpl");

    /* renamed from: m */
    public static final int f54687m = 22;

    /* renamed from: n */
    public static final int f54688n = 23;

    /* renamed from: o */
    public static final String f54689o = "androidx.work.multiprocess.RemoteWorkManagerClient";

    /* renamed from: p */
    public static C21191g0 f54690p = null;

    /* renamed from: q */
    public static C21191g0 f54691q = null;

    /* renamed from: r */
    public static final Object f54692r = new Object();

    /* renamed from: a */
    public Context f54693a;

    /* renamed from: b */
    public C21082a f54694b;

    /* renamed from: c */
    public WorkDatabase f54695c;

    /* renamed from: d */
    public C21345b f54696d;

    /* renamed from: e */
    public List<C21289t> f54697e;

    /* renamed from: f */
    public C21286r f54698f;

    /* renamed from: g */
    public C21342t f54699g;

    /* renamed from: h */
    public boolean f54700h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f54701i;

    /* renamed from: j */
    public volatile C21395e f54702j;

    /* renamed from: k */
    public final C21172o f54703k;

    /* renamed from: androidx.work.impl.g0$a */
    public class C21192a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C21317a f54704a;

        /* renamed from: b */
        public final /* synthetic */ C21342t f54705b;

        public C21192a(C21317a aVar, C21342t tVar) {
            this.f54704a = aVar;
            this.f54705b = tVar;
        }

        public void run() {
            try {
                this.f54704a.mo63659p(Long.valueOf(this.f54705b.mo63689a()));
            } catch (Throwable th) {
                this.f54704a.mo63660r(th);
            }
        }
    }

    /* renamed from: androidx.work.impl.g0$b */
    public class C21193b implements C0843a<List<C21249u.C21252c>, WorkInfo> {
        public C21193b() {
        }

        /* renamed from: a */
        public WorkInfo apply(List<C21249u.C21252c> list) {
            if (list == null || list.size() <= 0) {
                return null;
            }
            return list.get(0).mo63517w();
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.work.impl.g0$c */
    public static class C21194c {
        @C0373u
        /* renamed from: a */
        public static boolean m97983a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C21191g0(@C0359n0 Context context, @C0359n0 C21082a aVar, @C0359n0 C21345b bVar) {
        this(context, aVar, bVar, context.getResources().getBoolean(C21408s.C21409a.workmanager_test_configuration));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: B */
    public static void m97934B(@C0359n0 Context context, @C0359n0 C21082a aVar) {
        synchronized (f54692r) {
            C21191g0 g0Var = f54690p;
            if (g0Var != null) {
                if (f54691q != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (g0Var == null) {
                Context applicationContext = context.getApplicationContext();
                if (f54691q == null) {
                    f54691q = new C21191g0(applicationContext, aVar, new C21346c(aVar.mo63107m()));
                }
                f54690p = f54691q;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: C */
    public static boolean m97935C() {
        return m97936I() != null;
    }

    @C0363p0
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: I */
    public static C21191g0 m97936I() {
        synchronized (f54692r) {
            C21191g0 g0Var = f54690p;
            if (g0Var != null) {
                return g0Var;
            }
            C21191g0 g0Var2 = f54691q;
            return g0Var2;
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: J */
    public static C21191g0 m97937J(@C0359n0 Context context) {
        C21191g0 I;
        synchronized (f54692r) {
            I = m97936I();
            if (I == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof C21082a.C21085c) {
                    m97934B(applicationContext, ((C21082a.C21085c) applicationContext).mo63124a());
                    I = m97937J(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return I;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: V */
    public static void m97938V(@C0363p0 C21191g0 g0Var) {
        synchronized (f54692r) {
            f54690p = g0Var;
        }
    }

    @C0359n0
    /* renamed from: A */
    public LiveData<List<WorkInfo>> mo63048A(@C0359n0 C21412v vVar) {
        return C21335o.m98451a(this.f54695c.mo63203T().mo63411b(C21351w.m98481b(vVar)), C21249u.f54803x, this.f54696d);
    }

    @C0359n0
    /* renamed from: D */
    public C21397o mo63049D() {
        C21350v vVar = new C21350v(this);
        this.f54696d.mo63700c(vVar);
        return vVar.mo63703a();
    }

    @C0359n0
    /* renamed from: E */
    public C32487a<WorkManager.UpdateResult> mo63050E(@C0359n0 C21414w wVar) {
        return WorkerUpdater.m97685h(this, wVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: F */
    public List<C21289t> mo63355F(@C0359n0 Context context, @C0359n0 C21082a aVar, @C0359n0 C21172o oVar) {
        return Arrays.asList(new C21289t[]{C21290u.m98343a(context, this), new C21107b(context, aVar, oVar, this)});
    }

    @C0359n0
    /* renamed from: G */
    public C21367x mo63356G(@C0359n0 String str, @C0359n0 ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @C0359n0 C21403p pVar) {
        ExistingWorkPolicy existingWorkPolicy;
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP) {
            existingWorkPolicy = ExistingWorkPolicy.KEEP;
        } else {
            existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        }
        return new C21367x(this, str, existingWorkPolicy, Collections.singletonList(pVar));
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: H */
    public Context mo63357H() {
        return this.f54693a;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: K */
    public C21342t mo63358K() {
        return this.f54699g;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: L */
    public C21286r mo63359L() {
        return this.f54698f;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: M */
    public C21395e mo63360M() {
        if (this.f54702j == null) {
            synchronized (f54692r) {
                if (this.f54702j == null) {
                    mo63374b0();
                    if (this.f54702j == null) {
                        if (!TextUtils.isEmpty(this.f54694b.mo63097c())) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                }
            }
        }
        return this.f54702j;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: N */
    public List<C21289t> mo63361N() {
        return this.f54697e;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: O */
    public C21172o mo63362O() {
        return this.f54703k;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: P */
    public WorkDatabase mo63363P() {
        return this.f54695c;
    }

    /* renamed from: Q */
    public LiveData<List<WorkInfo>> mo63364Q(@C0359n0 List<String> list) {
        return C21335o.m98451a(this.f54695c.mo63207X().mo63524G(list), C21249u.f54803x, this.f54696d);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: R */
    public C21345b mo63365R() {
        return this.f54696d;
    }

    /* renamed from: S */
    public final void mo63366S(@C0359n0 Context context, @C0359n0 C21082a aVar, @C0359n0 C21345b bVar, @C0359n0 WorkDatabase workDatabase, @C0359n0 List<C21289t> list, @C0359n0 C21286r rVar) {
        Context applicationContext = context.getApplicationContext();
        this.f54693a = applicationContext;
        this.f54694b = aVar;
        this.f54696d = bVar;
        this.f54695c = workDatabase;
        this.f54697e = list;
        this.f54698f = rVar;
        this.f54699g = new C21342t(workDatabase);
        this.f54700h = false;
        if (!C21194c.m97983a(applicationContext)) {
            this.f54696d.mo63700c(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: T */
    public void mo63367T() {
        synchronized (f54692r) {
            this.f54700h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f54701i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f54701i = null;
            }
        }
    }

    /* renamed from: U */
    public void mo63368U() {
        C21132g.m97778a(mo63357H());
        mo63363P().mo63207X().mo63546s();
        C21290u.m98344b(mo63065o(), mo63363P(), mo63361N());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: W */
    public void mo63369W(@C0359n0 BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f54692r) {
            this.f54701i = pendingResult;
            if (this.f54700h) {
                pendingResult.finish();
                this.f54701i = null;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: X */
    public void mo63370X(@C0359n0 C21361v vVar) {
        mo63371Y(vVar, (WorkerParameters.C21081a) null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: Y */
    public void mo63371Y(@C0359n0 C21361v vVar, @C0363p0 WorkerParameters.C21081a aVar) {
        this.f54696d.mo63700c(new C21354y(this, vVar, aVar));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: Z */
    public void mo63372Z(@C0359n0 C21237m mVar) {
        this.f54696d.mo63700c(new C21292a0(this, new C21361v(mVar), true));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a0 */
    public void mo63373a0(@C0359n0 C21361v vVar) {
        this.f54696d.mo63700c(new C21292a0(this, vVar, false));
    }

    @C0359n0
    /* renamed from: b */
    public C21411u mo63052b(@C0359n0 String str, @C0359n0 ExistingWorkPolicy existingWorkPolicy, @C0359n0 List<C21379m> list) {
        if (!list.isEmpty()) {
            return new C21367x(this, str, existingWorkPolicy, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    /* renamed from: b0 */
    public final void mo63374b0() {
        try {
            this.f54702j = (C21395e) Class.forName(f54689o).getConstructor(new Class[]{Context.class, C21191g0.class}).newInstance(new Object[]{this.f54693a, this});
        } catch (Throwable th) {
            C21377l.m98582e().mo63775b(f54686l, "Unable to initialize multi-process support", th);
        }
    }

    @C0359n0
    /* renamed from: d */
    public C21411u mo63054d(@C0359n0 List<C21379m> list) {
        if (!list.isEmpty()) {
            return new C21367x(this, list);
        }
        throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
    }

    @C0359n0
    /* renamed from: e */
    public C21397o mo63055e() {
        C21295c b = C21295c.m98357b(this);
        this.f54696d.mo63700c(b);
        return b.mo63631f();
    }

    @C0359n0
    /* renamed from: f */
    public C21397o mo63056f(@C0359n0 String str) {
        C21295c e = C21295c.m98360e(str, this);
        this.f54696d.mo63700c(e);
        return e.mo63631f();
    }

    @C0359n0
    /* renamed from: g */
    public C21397o mo63057g(@C0359n0 String str) {
        C21295c d = C21295c.m98359d(str, this, true);
        this.f54696d.mo63700c(d);
        return d.mo63631f();
    }

    @C0359n0
    /* renamed from: h */
    public C21397o mo63058h(@C0359n0 UUID uuid) {
        C21295c c = C21295c.m98358c(uuid, this);
        this.f54696d.mo63700c(c);
        return c.mo63631f();
    }

    @C0359n0
    /* renamed from: i */
    public PendingIntent mo63059i(@C0359n0 UUID uuid) {
        int i;
        Intent c = C21186b.m97915c(this.f54693a, uuid.toString());
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            i = C8698y1.f23301m;
        }
        return PendingIntent.getService(this.f54693a, 0, c, i);
    }

    @C0359n0
    /* renamed from: k */
    public C21397o mo63061k(@C0359n0 List<? extends C21414w> list) {
        if (!list.isEmpty()) {
            return new C21367x(this, list).mo63731c();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @C0359n0
    /* renamed from: l */
    public C21397o mo63062l(@C0359n0 String str, @C0359n0 ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @C0359n0 C21403p pVar) {
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.f54334c) {
            return WorkerUpdater.m97681d(this, str, pVar);
        }
        return mo63356G(str, existingPeriodicWorkPolicy, pVar).mo63731c();
    }

    @C0359n0
    /* renamed from: n */
    public C21397o mo63064n(@C0359n0 String str, @C0359n0 ExistingWorkPolicy existingWorkPolicy, @C0359n0 List<C21379m> list) {
        return new C21367x(this, str, existingWorkPolicy, list).mo63731c();
    }

    @C0359n0
    /* renamed from: o */
    public C21082a mo63065o() {
        return this.f54694b;
    }

    @C0359n0
    /* renamed from: r */
    public C32487a<Long> mo63066r() {
        C21317a v = C21317a.m98425v();
        this.f54696d.mo63700c(new C21192a(v, this.f54699g));
        return v;
    }

    @C0359n0
    /* renamed from: s */
    public LiveData<Long> mo63067s() {
        return this.f54699g.mo63690b();
    }

    @C0359n0
    /* renamed from: t */
    public C32487a<WorkInfo> mo63068t(@C0359n0 UUID uuid) {
        C21355z<WorkInfo> c = C21355z.m98487c(this, uuid);
        this.f54696d.mo63699b().execute(c);
        return c.mo63710f();
    }

    @C0359n0
    /* renamed from: u */
    public LiveData<WorkInfo> mo63069u(@C0359n0 UUID uuid) {
        return C21335o.m98451a(this.f54695c.mo63207X().mo63524G(Collections.singletonList(uuid.toString())), new C21193b(), this.f54696d);
    }

    @C0359n0
    /* renamed from: v */
    public C32487a<List<WorkInfo>> mo63070v(@C0359n0 C21412v vVar) {
        C21355z<List<WorkInfo>> e = C21355z.m98489e(this, vVar);
        this.f54696d.mo63699b().execute(e);
        return e.mo63710f();
    }

    @C0359n0
    /* renamed from: w */
    public C32487a<List<WorkInfo>> mo63071w(@C0359n0 String str) {
        C21355z<List<WorkInfo>> b = C21355z.m98486b(this, str);
        this.f54696d.mo63699b().execute(b);
        return b.mo63710f();
    }

    @C0359n0
    /* renamed from: x */
    public LiveData<List<WorkInfo>> mo63072x(@C0359n0 String str) {
        return C21335o.m98451a(this.f54695c.mo63207X().mo63519B(str), C21249u.f54803x, this.f54696d);
    }

    @C0359n0
    /* renamed from: y */
    public C32487a<List<WorkInfo>> mo63073y(@C0359n0 String str) {
        C21355z<List<WorkInfo>> d = C21355z.m98488d(this, str);
        this.f54696d.mo63699b().execute(d);
        return d.mo63710f();
    }

    @C0359n0
    /* renamed from: z */
    public LiveData<List<WorkInfo>> mo63074z(@C0359n0 String str) {
        return C21335o.m98451a(this.f54695c.mo63207X().mo63553z(str), C21249u.f54803x, this.f54696d);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C21191g0(@C0359n0 Context context, @C0359n0 C21082a aVar, @C0359n0 C21345b bVar, boolean z) {
        this(context, aVar, bVar, WorkDatabase.m97634Q(context.getApplicationContext(), bVar.mo63699b(), z));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C21191g0(@C0359n0 Context context, @C0359n0 C21082a aVar, @C0359n0 C21345b bVar, @C0359n0 WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        C21377l.m98583h(new C21377l.C21378a(aVar.mo63104j()));
        C21172o oVar = new C21172o(applicationContext, bVar);
        this.f54703k = oVar;
        Context context2 = context;
        C21082a aVar2 = aVar;
        C21345b bVar2 = bVar;
        WorkDatabase workDatabase2 = workDatabase;
        List<C21289t> F = mo63355F(applicationContext, aVar, oVar);
        mo63366S(context2, aVar2, bVar2, workDatabase2, F, new C21286r(context2, aVar2, bVar2, workDatabase2, F));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C21191g0(@C0359n0 Context context, @C0359n0 C21082a aVar, @C0359n0 C21345b bVar, @C0359n0 WorkDatabase workDatabase, @C0359n0 List<C21289t> list, @C0359n0 C21286r rVar) {
        this(context, aVar, bVar, workDatabase, list, rVar, new C21172o(context.getApplicationContext(), bVar));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C21191g0(@C0359n0 Context context, @C0359n0 C21082a aVar, @C0359n0 C21345b bVar, @C0359n0 WorkDatabase workDatabase, @C0359n0 List<C21289t> list, @C0359n0 C21286r rVar, @C0359n0 C21172o oVar) {
        this.f54703k = oVar;
        mo63366S(context, aVar, bVar, workDatabase, list, rVar);
    }
}
