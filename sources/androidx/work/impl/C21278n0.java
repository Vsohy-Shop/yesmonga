package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.work.C21082a;
import androidx.work.C21091d;
import androidx.work.C21097i;
import androidx.work.C21372k;
import androidx.work.C21377l;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.C21185a;
import androidx.work.impl.model.C21211b;
import androidx.work.impl.model.C21237m;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21253v;
import androidx.work.impl.model.C21273x;
import androidx.work.impl.utils.C21294b0;
import androidx.work.impl.utils.C21306f0;
import androidx.work.impl.utils.C21320g0;
import androidx.work.impl.utils.C21323h0;
import androidx.work.impl.utils.C21341s;
import androidx.work.impl.utils.futures.C21317a;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.n0 */
public class C21278n0 implements Runnable {

    /* renamed from: H0 */
    public static final String f54873H0 = C21377l.m98584i("WorkerWrapper");
    @C0359n0

    /* renamed from: E0 */
    public C21317a<Boolean> f54874E0 = C21317a.m98425v();
    @C0359n0

    /* renamed from: F0 */
    public final C21317a<C21372k.C21373a> f54875F0 = C21317a.m98425v();

    /* renamed from: G0 */
    public volatile boolean f54876G0;

    /* renamed from: X */
    public C21211b f54877X;

    /* renamed from: Y */
    public List<String> f54878Y;

    /* renamed from: Z */
    public String f54879Z;

    /* renamed from: a */
    public Context f54880a;

    /* renamed from: b */
    public final String f54881b;

    /* renamed from: c */
    public List<C21289t> f54882c;

    /* renamed from: d */
    public WorkerParameters.C21081a f54883d;

    /* renamed from: e */
    public C21249u f54884e;

    /* renamed from: f */
    public C21372k f54885f;

    /* renamed from: g */
    public C21345b f54886g;
    @C0359n0

    /* renamed from: v */
    public C21372k.C21373a f54887v = C21372k.C21373a.m98573a();

    /* renamed from: w */
    public C21082a f54888w;

    /* renamed from: x */
    public C21185a f54889x;

    /* renamed from: y */
    public WorkDatabase f54890y;

    /* renamed from: z */
    public C21253v f54891z;

    /* renamed from: androidx.work.impl.n0$a */
    public class C21279a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C32487a f54892a;

        public C21279a(C32487a aVar) {
            this.f54892a = aVar;
        }

        public void run() {
            if (!C21278n0.this.f54875F0.isCancelled()) {
                try {
                    this.f54892a.get();
                    C21377l e = C21377l.m98582e();
                    String str = C21278n0.f54873H0;
                    e.mo63774a(str, "Starting work for " + C21278n0.this.f54884e.f54806c);
                    C21278n0 n0Var = C21278n0.this;
                    n0Var.f54875F0.mo63661s(n0Var.f54885f.mo18696u());
                } catch (Throwable th) {
                    C21278n0.this.f54875F0.mo63660r(th);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.n0$b */
    public class C21280b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f54894a;

        public C21280b(String str) {
            this.f54894a = str;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                C21372k.C21373a aVar = C21278n0.this.f54875F0.get();
                if (aVar == null) {
                    C21377l e = C21377l.m98582e();
                    String str = C21278n0.f54873H0;
                    e.mo63776c(str, C21278n0.this.f54884e.f54806c + " returned a null result. Treating it as a failure.");
                } else {
                    C21377l e2 = C21377l.m98582e();
                    String str2 = C21278n0.f54873H0;
                    e2.mo63774a(str2, C21278n0.this.f54884e.f54806c + " returned a " + aVar + ".");
                    C21278n0.this.f54887v = aVar;
                }
            } catch (CancellationException e3) {
                C21377l e4 = C21377l.m98582e();
                String str3 = C21278n0.f54873H0;
                e4.mo63779g(str3, this.f54894a + " was cancelled", e3);
            } catch (InterruptedException | ExecutionException e5) {
                C21377l e6 = C21377l.m98582e();
                String str4 = C21278n0.f54873H0;
                e6.mo63777d(str4, this.f54894a + " failed because it threw an exception/error", e5);
            } catch (Throwable th) {
                C21278n0.this.mo63582j();
                throw th;
            }
            C21278n0.this.mo63582j();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.work.impl.n0$c */
    public static class C21281c {
        @C0359n0

        /* renamed from: a */
        public Context f54896a;
        @C0363p0

        /* renamed from: b */
        public C21372k f54897b;
        @C0359n0

        /* renamed from: c */
        public C21185a f54898c;
        @C0359n0

        /* renamed from: d */
        public C21345b f54899d;
        @C0359n0

        /* renamed from: e */
        public C21082a f54900e;
        @C0359n0

        /* renamed from: f */
        public WorkDatabase f54901f;
        @C0359n0

        /* renamed from: g */
        public C21249u f54902g;

        /* renamed from: h */
        public List<C21289t> f54903h;

        /* renamed from: i */
        public final List<String> f54904i;
        @C0359n0

        /* renamed from: j */
        public WorkerParameters.C21081a f54905j = new WorkerParameters.C21081a();

        public C21281c(@C0359n0 Context context, @C0359n0 C21082a aVar, @C0359n0 C21345b bVar, @C0359n0 C21185a aVar2, @C0359n0 WorkDatabase workDatabase, @C0359n0 C21249u uVar, @C0359n0 List<String> list) {
            this.f54896a = context.getApplicationContext();
            this.f54899d = bVar;
            this.f54898c = aVar2;
            this.f54900e = aVar;
            this.f54901f = workDatabase;
            this.f54902g = uVar;
            this.f54904i = list;
        }

        @C0359n0
        /* renamed from: b */
        public C21278n0 mo63595b() {
            return new C21278n0(this);
        }

        @C0359n0
        /* renamed from: c */
        public C21281c mo63596c(@C0363p0 WorkerParameters.C21081a aVar) {
            if (aVar != null) {
                this.f54905j = aVar;
            }
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C21281c mo63597d(@C0359n0 List<C21289t> list) {
            this.f54903h = list;
            return this;
        }

        @C0344h1
        @C0359n0
        /* renamed from: e */
        public C21281c mo63598e(@C0359n0 C21372k kVar) {
            this.f54897b = kVar;
            return this;
        }
    }

    public C21278n0(@C0359n0 C21281c cVar) {
        this.f54880a = cVar.f54896a;
        this.f54886g = cVar.f54899d;
        this.f54889x = cVar.f54898c;
        C21249u uVar = cVar.f54902g;
        this.f54884e = uVar;
        this.f54881b = uVar.f54804a;
        this.f54882c = cVar.f54903h;
        this.f54883d = cVar.f54905j;
        this.f54885f = cVar.f54897b;
        this.f54888w = cVar.f54900e;
        WorkDatabase workDatabase = cVar.f54901f;
        this.f54890y = workDatabase;
        this.f54891z = workDatabase.mo63207X();
        this.f54877X = this.f54890y.mo63201R();
        this.f54878Y = cVar.f54904i;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m98291i(C32487a aVar) {
        if (this.f54875F0.isCancelled()) {
            aVar.cancel(true);
        }
    }

    /* renamed from: b */
    public final String mo63575b(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f54881b);
        sb.append(", tags={ ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    @C0359n0
    /* renamed from: c */
    public C32487a<Boolean> mo63576c() {
        return this.f54874E0;
    }

    @C0359n0
    /* renamed from: d */
    public C21237m mo63577d() {
        return C21273x.m98280a(this.f54884e);
    }

    @C0359n0
    /* renamed from: e */
    public C21249u mo63578e() {
        return this.f54884e;
    }

    /* renamed from: f */
    public final void mo63579f(C21372k.C21373a aVar) {
        if (aVar instanceof C21372k.C21373a.C21376c) {
            C21377l e = C21377l.m98582e();
            String str = f54873H0;
            e.mo63778f(str, "Worker result SUCCESS for " + this.f54879Z);
            if (this.f54884e.mo63456D()) {
                mo63584l();
            } else {
                mo63589q();
            }
        } else if (aVar instanceof C21372k.C21373a.C21375b) {
            C21377l e2 = C21377l.m98582e();
            String str2 = f54873H0;
            e2.mo63778f(str2, "Worker result RETRY for " + this.f54879Z);
            mo63583k();
        } else {
            C21377l e3 = C21377l.m98582e();
            String str3 = f54873H0;
            e3.mo63778f(str3, "Worker result FAILURE for " + this.f54879Z);
            if (this.f54884e.mo63456D()) {
                mo63584l();
            } else {
                mo63588p();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public void mo63580g() {
        this.f54876G0 = true;
        mo63590r();
        this.f54875F0.cancel(true);
        if (this.f54885f == null || !this.f54875F0.isCancelled()) {
            C21377l.m98582e().mo63774a(f54873H0, "WorkSpec " + this.f54884e + " is already done. Not interrupting.");
            return;
        }
        this.f54885f.mo63763v();
    }

    /* renamed from: h */
    public final void mo63581h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f54891z.mo63538k(str2) != WorkInfo.State.CANCELLED) {
                this.f54891z.mo63550w(WorkInfo.State.FAILED, str2);
            }
            linkedList.addAll(this.f54877X.mo63390b(str2));
        }
    }

    /* renamed from: j */
    public void mo63582j() {
        if (!mo63590r()) {
            this.f54890y.mo60905e();
            try {
                WorkInfo.State k = this.f54891z.mo63538k(this.f54881b);
                this.f54890y.mo63206W().mo63449b(this.f54881b);
                if (k == null) {
                    mo63585m(false);
                } else if (k == WorkInfo.State.f54360b) {
                    mo63579f(this.f54887v);
                } else if (!k.mo63047q()) {
                    mo63583k();
                }
                this.f54890y.mo60901O();
            } finally {
                this.f54890y.mo60908k();
            }
        }
        List<C21289t> list = this.f54882c;
        if (list != null) {
            for (C21289t b : list) {
                b.mo63220b(this.f54881b);
            }
            C21290u.m98344b(this.f54888w, this.f54890y, this.f54882c);
        }
    }

    /* renamed from: k */
    public final void mo63583k() {
        this.f54890y.mo60905e();
        try {
            this.f54891z.mo63550w(WorkInfo.State.ENQUEUED, this.f54881b);
            this.f54891z.mo63540m(this.f54881b, System.currentTimeMillis());
            this.f54891z.mo63547t(this.f54881b, -1);
            this.f54890y.mo60901O();
        } finally {
            this.f54890y.mo60908k();
            mo63585m(true);
        }
    }

    /* renamed from: l */
    public final void mo63584l() {
        this.f54890y.mo60905e();
        try {
            this.f54891z.mo63540m(this.f54881b, System.currentTimeMillis());
            this.f54891z.mo63550w(WorkInfo.State.ENQUEUED, this.f54881b);
            this.f54891z.mo63522E(this.f54881b);
            this.f54891z.mo63531d(this.f54881b);
            this.f54891z.mo63547t(this.f54881b, -1);
            this.f54890y.mo60901O();
        } finally {
            this.f54890y.mo60908k();
            mo63585m(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    public final void mo63585m(boolean z) {
        this.f54890y.mo60905e();
        try {
            if (!this.f54890y.mo63207X().mo63521D()) {
                C21341s.m98460c(this.f54880a, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f54891z.mo63550w(WorkInfo.State.ENQUEUED, this.f54881b);
                this.f54891z.mo63547t(this.f54881b, -1);
            }
            if (!(this.f54884e == null || this.f54885f == null || !this.f54889x.mo63345b(this.f54881b))) {
                this.f54889x.mo63344a(this.f54881b);
            }
            this.f54890y.mo60901O();
            this.f54890y.mo60908k();
            this.f54874E0.mo63659p(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f54890y.mo60908k();
            throw th;
        }
    }

    /* renamed from: n */
    public final void mo63586n() {
        WorkInfo.State k = this.f54891z.mo63538k(this.f54881b);
        if (k == WorkInfo.State.f54360b) {
            C21377l e = C21377l.m98582e();
            String str = f54873H0;
            e.mo63774a(str, "Status for " + this.f54881b + " is RUNNING; not doing any work and rescheduling for later execution");
            mo63585m(true);
            return;
        }
        C21377l e2 = C21377l.m98582e();
        String str2 = f54873H0;
        e2.mo63774a(str2, "Status for " + this.f54881b + " is " + k + " ; not doing any work");
        mo63585m(false);
    }

    /* renamed from: o */
    public final void mo63587o() {
        C21091d b;
        if (!mo63590r()) {
            this.f54890y.mo60905e();
            try {
                C21249u uVar = this.f54884e;
                if (uVar.f54805b != WorkInfo.State.ENQUEUED) {
                    mo63586n();
                    this.f54890y.mo60901O();
                    C21377l e = C21377l.m98582e();
                    String str = f54873H0;
                    e.mo63774a(str, this.f54884e.f54806c + " is not in ENQUEUED state. Nothing more to do");
                } else if ((uVar.mo63456D() || this.f54884e.mo63455C()) && System.currentTimeMillis() < this.f54884e.mo63461c()) {
                    C21377l.m98582e().mo63774a(f54873H0, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f54884e.f54806c}));
                    mo63585m(true);
                    this.f54890y.mo60901O();
                    this.f54890y.mo60908k();
                } else {
                    this.f54890y.mo60901O();
                    this.f54890y.mo60908k();
                    if (this.f54884e.mo63456D()) {
                        b = this.f54884e.f54808e;
                    } else {
                        C21097i b2 = this.f54888w.mo63100f().mo63746b(this.f54884e.f54807d);
                        if (b2 == null) {
                            C21377l e2 = C21377l.m98582e();
                            String str2 = f54873H0;
                            e2.mo63776c(str2, "Could not create Input Merger " + this.f54884e.f54807d);
                            mo63588p();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f54884e.f54808e);
                        arrayList.addAll(this.f54891z.mo63543p(this.f54881b));
                        b = b2.mo63033b(arrayList);
                    }
                    C21091d dVar = b;
                    UUID fromString = UUID.fromString(this.f54881b);
                    List<String> list = this.f54878Y;
                    WorkerParameters.C21081a aVar = this.f54883d;
                    C21249u uVar2 = this.f54884e;
                    WorkerParameters workerParameters = new WorkerParameters(fromString, dVar, list, aVar, uVar2.f54814k, uVar2.mo63486z(), this.f54888w.mo63098d(), this.f54886g, this.f54888w.mo63108n(), new C21323h0(this.f54890y, this.f54886g), new C21320g0(this.f54890y, this.f54889x, this.f54886g));
                    if (this.f54885f == null) {
                        this.f54885f = this.f54888w.mo63108n().mo63885b(this.f54880a, this.f54884e.f54806c, workerParameters);
                    }
                    C21372k kVar = this.f54885f;
                    if (kVar == null) {
                        C21377l e3 = C21377l.m98582e();
                        String str3 = f54873H0;
                        e3.mo63776c(str3, "Could not create Worker " + this.f54884e.f54806c);
                        mo63588p();
                    } else if (kVar.mo63759p()) {
                        C21377l e4 = C21377l.m98582e();
                        String str4 = f54873H0;
                        e4.mo63776c(str4, "Received an already-used Worker " + this.f54884e.f54806c + "; Worker Factory should return new instances");
                        mo63588p();
                    } else {
                        this.f54885f.mo63762t();
                        if (!mo63592s()) {
                            mo63586n();
                        } else if (!mo63590r()) {
                            C21306f0 f0Var = new C21306f0(this.f54880a, this.f54884e, this.f54885f, workerParameters.mo63082b(), this.f54886g);
                            this.f54886g.mo63698a().execute(f0Var);
                            C32487a<Void> c = f0Var.mo63642c();
                            this.f54875F0.mo5489q(new C21206m0(this, c), new C21294b0());
                            c.mo5489q(new C21279a(c), this.f54886g.mo63698a());
                            this.f54875F0.mo5489q(new C21280b(this.f54879Z), this.f54886g.mo63699b());
                        }
                    }
                }
            } finally {
                this.f54890y.mo60908k();
            }
        }
    }

    @C0344h1
    /* renamed from: p */
    public void mo63588p() {
        this.f54890y.mo60905e();
        try {
            mo63581h(this.f54881b);
            this.f54891z.mo63551x(this.f54881b, ((C21372k.C21373a.C21374a) this.f54887v).mo63764c());
            this.f54890y.mo60901O();
        } finally {
            this.f54890y.mo60908k();
            mo63585m(false);
        }
    }

    /* renamed from: q */
    public final void mo63589q() {
        this.f54890y.mo60905e();
        try {
            this.f54891z.mo63550w(WorkInfo.State.SUCCEEDED, this.f54881b);
            this.f54891z.mo63551x(this.f54881b, ((C21372k.C21373a.C21376c) this.f54887v).mo63764c());
            long currentTimeMillis = System.currentTimeMillis();
            for (String next : this.f54877X.mo63390b(this.f54881b)) {
                if (this.f54891z.mo63538k(next) == WorkInfo.State.BLOCKED && this.f54877X.mo63391c(next)) {
                    C21377l e = C21377l.m98582e();
                    String str = f54873H0;
                    e.mo63778f(str, "Setting status to enqueued for " + next);
                    this.f54891z.mo63550w(WorkInfo.State.ENQUEUED, next);
                    this.f54891z.mo63540m(next, currentTimeMillis);
                }
            }
            this.f54890y.mo60901O();
        } finally {
            this.f54890y.mo60908k();
            mo63585m(false);
        }
    }

    /* renamed from: r */
    public final boolean mo63590r() {
        if (!this.f54876G0) {
            return false;
        }
        C21377l e = C21377l.m98582e();
        String str = f54873H0;
        e.mo63774a(str, "Work interrupted for " + this.f54879Z);
        WorkInfo.State k = this.f54891z.mo63538k(this.f54881b);
        if (k == null) {
            mo63585m(false);
        } else {
            mo63585m(!k.mo63047q());
        }
        return true;
    }

    @C0348i1
    public void run() {
        this.f54879Z = mo63575b(this.f54878Y);
        mo63587o();
    }

    /* renamed from: s */
    public final boolean mo63592s() {
        boolean z;
        this.f54890y.mo60905e();
        try {
            if (this.f54891z.mo63538k(this.f54881b) == WorkInfo.State.ENQUEUED) {
                this.f54891z.mo63550w(WorkInfo.State.f54360b, this.f54881b);
                this.f54891z.mo63525H(this.f54881b);
                z = true;
            } else {
                z = false;
            }
            this.f54890y.mo60901O();
            return z;
        } finally {
            this.f54890y.mo60908k();
        }
    }
}
