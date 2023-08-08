package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.work.C21377l;
import androidx.work.impl.C21176e;
import androidx.work.impl.C21191g0;
import androidx.work.impl.C21286r;
import androidx.work.impl.C21362w;
import androidx.work.impl.model.C21237m;
import androidx.work.impl.utils.C21300c0;
import androidx.work.impl.utils.C21326i0;
import androidx.work.impl.utils.taskexecutor.C21344a;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.carrefour.fid.android.core.extension.C36306e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemalarm.g */
public class C21116g implements C21176e {

    /* renamed from: X */
    public static final String f54546X = "KEY_START_ID";

    /* renamed from: Y */
    public static final int f54547Y = 0;

    /* renamed from: y */
    public static final String f54548y = C21377l.m98584i("SystemAlarmDispatcher");

    /* renamed from: z */
    public static final String f54549z = "ProcessCommand";

    /* renamed from: a */
    public final Context f54550a;

    /* renamed from: b */
    public final C21345b f54551b;

    /* renamed from: c */
    public final C21326i0 f54552c;

    /* renamed from: d */
    public final C21286r f54553d;

    /* renamed from: e */
    public final C21191g0 f54554e;

    /* renamed from: f */
    public final C21111b f54555f;

    /* renamed from: g */
    public final List<Intent> f54556g;

    /* renamed from: v */
    public Intent f54557v;
    @C0363p0

    /* renamed from: w */
    public C21119c f54558w;

    /* renamed from: x */
    public C21362w f54559x;

    /* renamed from: androidx.work.impl.background.systemalarm.g$a */
    public class C21117a implements Runnable {
        public C21117a() {
        }

        public void run() {
            C21120d dVar;
            Executor executor;
            synchronized (C21116g.this.f54556g) {
                C21116g gVar = C21116g.this;
                gVar.f54557v = gVar.f54556g.get(0);
            }
            Intent intent = C21116g.this.f54557v;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C21116g.this.f54557v.getIntExtra(C21116g.f54546X, 0);
                C21377l e = C21377l.m98582e();
                String str = C21116g.f54548y;
                e.mo63774a(str, "Processing command " + C21116g.this.f54557v + ", " + intExtra);
                Context context = C21116g.this.f54550a;
                PowerManager.WakeLock b = C21300c0.m98371b(context, action + C36306e.f89637a + intExtra + ")");
                try {
                    C21377l e2 = C21377l.m98582e();
                    e2.mo63774a(str, "Acquiring operation wake lock (" + action + ") " + b);
                    b.acquire();
                    C21116g gVar2 = C21116g.this;
                    gVar2.f54555f.mo63242q(gVar2.f54557v, intExtra, gVar2);
                    C21377l e3 = C21377l.m98582e();
                    e3.mo63774a(str, "Releasing operation wake lock (" + action + ") " + b);
                    b.release();
                    executor = C21116g.this.f54551b.mo63698a();
                    dVar = new C21120d(C21116g.this);
                } catch (Throwable th) {
                    C21377l e4 = C21377l.m98582e();
                    String str2 = C21116g.f54548y;
                    e4.mo63774a(str2, "Releasing operation wake lock (" + action + ") " + b);
                    b.release();
                    C21116g.this.f54551b.mo63698a().execute(new C21120d(C21116g.this));
                    throw th;
                }
                executor.execute(dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.g$b */
    public static class C21118b implements Runnable {

        /* renamed from: a */
        public final C21116g f54561a;

        /* renamed from: b */
        public final Intent f54562b;

        /* renamed from: c */
        public final int f54563c;

        public C21118b(@C0359n0 C21116g gVar, @C0359n0 Intent intent, int i) {
            this.f54561a = gVar;
            this.f54562b = intent;
            this.f54563c = i;
        }

        public void run() {
            this.f54561a.mo63252a(this.f54562b, this.f54563c);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.g$c */
    public interface C21119c {
        /* renamed from: b */
        void mo63233b();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.g$d */
    public static class C21120d implements Runnable {

        /* renamed from: a */
        public final C21116g f54564a;

        public C21120d(@C0359n0 C21116g gVar) {
            this.f54564a = gVar;
        }

        public void run() {
            this.f54564a.mo63254c();
        }
    }

    public C21116g(@C0359n0 Context context) {
        this(context, (C21286r) null, (C21191g0) null);
    }

    @C0353k0
    /* renamed from: a */
    public boolean mo63252a(@C0359n0 Intent intent, int i) {
        C21377l e = C21377l.m98582e();
        String str = f54548y;
        e.mo63774a(str, "Adding command " + intent + C36306e.f89637a + i + ")");
        mo63253b();
        String action = intent.getAction();
        boolean z = false;
        if (TextUtils.isEmpty(action)) {
            C21377l.m98582e().mo63782l(str, "Unknown command. Ignoring");
            return false;
        } else if (C21111b.f54515w.equals(action) && mo63259i(C21111b.f54515w)) {
            return false;
        } else {
            intent.putExtra(f54546X, i);
            synchronized (this.f54556g) {
                if (!this.f54556g.isEmpty()) {
                    z = true;
                }
                this.f54556g.add(intent);
                if (!z) {
                    mo63261k();
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo63253b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @C0353k0
    /* renamed from: c */
    public void mo63254c() {
        C21377l e = C21377l.m98582e();
        String str = f54548y;
        e.mo63774a(str, "Checking if commands are complete.");
        mo63253b();
        synchronized (this.f54556g) {
            if (this.f54557v != null) {
                C21377l e2 = C21377l.m98582e();
                e2.mo63774a(str, "Removing command " + this.f54557v);
                if (this.f54556g.remove(0).equals(this.f54557v)) {
                    this.f54557v = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            C21344a b = this.f54551b.mo63699b();
            if (!this.f54555f.mo63241p() && this.f54556g.isEmpty() && !b.mo63697W()) {
                C21377l.m98582e().mo63774a(str, "No more commands & intents.");
                C21119c cVar = this.f54558w;
                if (cVar != null) {
                    cVar.mo63233b();
                }
            } else if (!this.f54556g.isEmpty()) {
                mo63261k();
            }
        }
    }

    /* renamed from: d */
    public void mo63222d(@C0359n0 C21237m mVar, boolean z) {
        this.f54551b.mo63698a().execute(new C21118b(this, C21111b.m97719c(this.f54550a, mVar, z), 0));
    }

    /* renamed from: e */
    public C21286r mo63255e() {
        return this.f54553d;
    }

    /* renamed from: f */
    public C21345b mo63256f() {
        return this.f54551b;
    }

    /* renamed from: g */
    public C21191g0 mo63257g() {
        return this.f54554e;
    }

    /* renamed from: h */
    public C21326i0 mo63258h() {
        return this.f54552c;
    }

    @C0353k0
    /* renamed from: i */
    public final boolean mo63259i(@C0359n0 String str) {
        mo63253b();
        synchronized (this.f54556g) {
            for (Intent action : this.f54556g) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: j */
    public void mo63260j() {
        C21377l.m98582e().mo63774a(f54548y, "Destroying SystemAlarmDispatcher");
        this.f54553d.mo63609o(this);
        this.f54558w = null;
    }

    @C0353k0
    /* renamed from: k */
    public final void mo63261k() {
        mo63253b();
        PowerManager.WakeLock b = C21300c0.m98371b(this.f54550a, f54549z);
        try {
            b.acquire();
            this.f54554e.mo63365R().mo63700c(new C21117a());
        } finally {
            b.release();
        }
    }

    /* renamed from: l */
    public void mo63262l(@C0359n0 C21119c cVar) {
        if (this.f54558w != null) {
            C21377l.m98582e().mo63776c(f54548y, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f54558w = cVar;
        }
    }

    @C0344h1
    public C21116g(@C0359n0 Context context, @C0363p0 C21286r rVar, @C0363p0 C21191g0 g0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f54550a = applicationContext;
        this.f54559x = new C21362w();
        this.f54555f = new C21111b(applicationContext, this.f54559x);
        g0Var = g0Var == null ? C21191g0.m97937J(context) : g0Var;
        this.f54554e = g0Var;
        this.f54552c = new C21326i0(g0Var.mo63065o().mo63105k());
        rVar = rVar == null ? g0Var.mo63359L() : rVar;
        this.f54553d = rVar;
        this.f54551b = g0Var.mo63365R();
        rVar.mo63604g(this);
        this.f54556g = new ArrayList();
        this.f54557v = null;
    }
}
