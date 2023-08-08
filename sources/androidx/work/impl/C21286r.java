package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.C17318d;
import androidx.work.C21082a;
import androidx.work.C21094f;
import androidx.work.C21377l;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.C21185a;
import androidx.work.impl.foreground.C21186b;
import androidx.work.impl.model.C21237m;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.utils.C21300c0;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.r */
public class C21286r implements C21176e, C21185a {

    /* renamed from: X */
    public static final String f54914X = C21377l.m98584i("Processor");

    /* renamed from: Y */
    public static final String f54915Y = "ProcessorForegroundLck";
    @C0363p0

    /* renamed from: a */
    public PowerManager.WakeLock f54916a;

    /* renamed from: b */
    public Context f54917b;

    /* renamed from: c */
    public C21082a f54918c;

    /* renamed from: d */
    public C21345b f54919d;

    /* renamed from: e */
    public WorkDatabase f54920e;

    /* renamed from: f */
    public Map<String, C21278n0> f54921f = new HashMap();

    /* renamed from: g */
    public Map<String, C21278n0> f54922g = new HashMap();

    /* renamed from: v */
    public Map<String, Set<C21361v>> f54923v;

    /* renamed from: w */
    public List<C21289t> f54924w;

    /* renamed from: x */
    public Set<String> f54925x;

    /* renamed from: y */
    public final List<C21176e> f54926y;

    /* renamed from: z */
    public final Object f54927z;

    /* renamed from: androidx.work.impl.r$a */
    public static class C21287a implements Runnable {
        @C0359n0

        /* renamed from: a */
        public C21176e f54928a;
        @C0359n0

        /* renamed from: b */
        public final C21237m f54929b;
        @C0359n0

        /* renamed from: c */
        public C32487a<Boolean> f54930c;

        public C21287a(@C0359n0 C21176e eVar, @C0359n0 C21237m mVar, @C0359n0 C32487a<Boolean> aVar) {
            this.f54928a = eVar;
            this.f54929b = mVar;
            this.f54930c = aVar;
        }

        public void run() {
            boolean z;
            try {
                z = this.f54930c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f54928a.mo63222d(this.f54929b, z);
        }
    }

    public C21286r(@C0359n0 Context context, @C0359n0 C21082a aVar, @C0359n0 C21345b bVar, @C0359n0 WorkDatabase workDatabase, @C0359n0 List<C21289t> list) {
        this.f54917b = context;
        this.f54918c = aVar;
        this.f54919d = bVar;
        this.f54920e = workDatabase;
        this.f54924w = list;
        this.f54925x = new HashSet();
        this.f54926y = new ArrayList();
        this.f54916a = null;
        this.f54927z = new Object();
        this.f54923v = new HashMap();
    }

    /* renamed from: j */
    public static boolean m98318j(@C0359n0 String str, @C0363p0 C21278n0 n0Var) {
        if (n0Var != null) {
            n0Var.mo63580g();
            C21377l e = C21377l.m98582e();
            String str2 = f54914X;
            e.mo63774a(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        C21377l e2 = C21377l.m98582e();
        String str3 = f54914X;
        e2.mo63774a(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ C21249u m98320n(ArrayList arrayList, String str) throws Exception {
        arrayList.addAll(this.f54920e.mo63208Y().mo63383a(str));
        return this.f54920e.mo63207X().mo63539l(str);
    }

    /* renamed from: a */
    public void mo63344a(@C0359n0 String str) {
        synchronized (this.f54927z) {
            this.f54921f.remove(str);
            mo63614t();
        }
    }

    /* renamed from: b */
    public boolean mo63345b(@C0359n0 String str) {
        boolean containsKey;
        synchronized (this.f54927z) {
            containsKey = this.f54921f.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: c */
    public void mo63346c(@C0359n0 String str, @C0359n0 C21094f fVar) {
        synchronized (this.f54927z) {
            C21377l e = C21377l.m98582e();
            String str2 = f54914X;
            e.mo63778f(str2, "Moving WorkSpec (" + str + ") to the foreground");
            C21278n0 remove = this.f54922g.remove(str);
            if (remove != null) {
                if (this.f54916a == null) {
                    PowerManager.WakeLock b = C21300c0.m98371b(this.f54917b, f54915Y);
                    this.f54916a = b;
                    b.acquire();
                }
                this.f54921f.put(str, remove);
                C17318d.m79741x(this.f54917b, C21186b.m97917g(this.f54917b, remove.mo63577d(), fVar));
            }
        }
    }

    /* renamed from: d */
    public void m98319m(@C0359n0 C21237m mVar, boolean z) {
        synchronized (this.f54927z) {
            C21278n0 n0Var = this.f54922g.get(mVar.mo63437f());
            if (n0Var != null && mVar.equals(n0Var.mo63577d())) {
                this.f54922g.remove(mVar.mo63437f());
            }
            C21377l e = C21377l.m98582e();
            String str = f54914X;
            e.mo63774a(str, getClass().getSimpleName() + " " + mVar.mo63437f() + " executed; reschedule = " + z);
            for (C21176e d : this.f54926y) {
                d.mo63222d(mVar, z);
            }
        }
    }

    /* renamed from: g */
    public void mo63604g(@C0359n0 C21176e eVar) {
        synchronized (this.f54927z) {
            this.f54926y.add(eVar);
        }
    }

    @C0363p0
    /* renamed from: h */
    public C21249u mo63605h(@C0359n0 String str) {
        synchronized (this.f54927z) {
            C21278n0 n0Var = this.f54921f.get(str);
            if (n0Var == null) {
                n0Var = this.f54922g.get(str);
            }
            if (n0Var == null) {
                return null;
            }
            C21249u e = n0Var.mo63578e();
            return e;
        }
    }

    /* renamed from: i */
    public boolean mo63606i() {
        boolean z;
        synchronized (this.f54927z) {
            if (this.f54922g.isEmpty()) {
                if (this.f54921f.isEmpty()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: k */
    public boolean mo63607k(@C0359n0 String str) {
        boolean contains;
        synchronized (this.f54927z) {
            contains = this.f54925x.contains(str);
        }
        return contains;
    }

    /* renamed from: l */
    public boolean mo63608l(@C0359n0 String str) {
        boolean z;
        synchronized (this.f54927z) {
            if (!this.f54922g.containsKey(str)) {
                if (!this.f54921f.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: o */
    public void mo63609o(@C0359n0 C21176e eVar) {
        synchronized (this.f54927z) {
            this.f54926y.remove(eVar);
        }
    }

    /* renamed from: p */
    public final void mo63610p(@C0359n0 C21237m mVar, boolean z) {
        this.f54919d.mo63698a().execute(new C21285q(this, mVar, z));
    }

    /* renamed from: q */
    public boolean mo63611q(@C0359n0 C21361v vVar) {
        return mo63612r(vVar, (WorkerParameters.C21081a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008c, code lost:
        return false;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo63612r(@androidx.annotation.C0359n0 androidx.work.impl.C21361v r13, @androidx.annotation.C0363p0 androidx.work.WorkerParameters.C21081a r14) {
        /*
            r12 = this;
            androidx.work.impl.model.m r0 = r13.mo63718a()
            java.lang.String r1 = r0.mo63437f()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            androidx.work.impl.WorkDatabase r2 = r12.f54920e
            androidx.work.impl.p r3 = new androidx.work.impl.p
            r3.<init>(r12, r9, r1)
            java.lang.Object r2 = r2.mo60898L(r3)
            r8 = r2
            androidx.work.impl.model.u r8 = (androidx.work.impl.model.C21249u) r8
            r2 = 0
            if (r8 != 0) goto L_0x003c
            androidx.work.l r13 = androidx.work.C21377l.m98582e()
            java.lang.String r14 = f54914X
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Didn't find WorkSpec for id "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r13.mo63782l(r14, r1)
            r12.mo63610p(r0, r2)
            return r2
        L_0x003c:
            java.lang.Object r10 = r12.f54927z
            monitor-enter(r10)
            boolean r3 = r12.mo63608l(r1)     // Catch:{ all -> 0x0112 }
            if (r3 == 0) goto L_0x008d
            java.util.Map<java.lang.String, java.util.Set<androidx.work.impl.v>> r14 = r12.f54923v     // Catch:{ all -> 0x0112 }
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0112 }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0112 }
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x0112 }
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x0112 }
            androidx.work.impl.v r1 = (androidx.work.impl.C21361v) r1     // Catch:{ all -> 0x0112 }
            androidx.work.impl.model.m r1 = r1.mo63718a()     // Catch:{ all -> 0x0112 }
            int r1 = r1.mo63435e()     // Catch:{ all -> 0x0112 }
            int r3 = r0.mo63435e()     // Catch:{ all -> 0x0112 }
            if (r1 != r3) goto L_0x0088
            r14.add(r13)     // Catch:{ all -> 0x0112 }
            androidx.work.l r13 = androidx.work.C21377l.m98582e()     // Catch:{ all -> 0x0112 }
            java.lang.String r14 = f54914X     // Catch:{ all -> 0x0112 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r1.<init>()     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = "Work "
            r1.append(r3)     // Catch:{ all -> 0x0112 }
            r1.append(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = " is already enqueued for processing"
            r1.append(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0112 }
            r13.mo63774a(r14, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x008b
        L_0x0088:
            r12.mo63610p(r0, r2)     // Catch:{ all -> 0x0112 }
        L_0x008b:
            monitor-exit(r10)     // Catch:{ all -> 0x0112 }
            return r2
        L_0x008d:
            int r3 = r8.mo63486z()     // Catch:{ all -> 0x0112 }
            int r4 = r0.mo63435e()     // Catch:{ all -> 0x0112 }
            if (r3 == r4) goto L_0x009c
            r12.mo63610p(r0, r2)     // Catch:{ all -> 0x0112 }
            monitor-exit(r10)     // Catch:{ all -> 0x0112 }
            return r2
        L_0x009c:
            androidx.work.impl.n0$c r11 = new androidx.work.impl.n0$c     // Catch:{ all -> 0x0112 }
            android.content.Context r3 = r12.f54917b     // Catch:{ all -> 0x0112 }
            androidx.work.a r4 = r12.f54918c     // Catch:{ all -> 0x0112 }
            androidx.work.impl.utils.taskexecutor.b r5 = r12.f54919d     // Catch:{ all -> 0x0112 }
            androidx.work.impl.WorkDatabase r7 = r12.f54920e     // Catch:{ all -> 0x0112 }
            r2 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0112 }
            java.util.List<androidx.work.impl.t> r2 = r12.f54924w     // Catch:{ all -> 0x0112 }
            androidx.work.impl.n0$c r2 = r11.mo63597d(r2)     // Catch:{ all -> 0x0112 }
            androidx.work.impl.n0$c r14 = r2.mo63596c(r14)     // Catch:{ all -> 0x0112 }
            androidx.work.impl.n0 r14 = r14.mo63595b()     // Catch:{ all -> 0x0112 }
            com.google.common.util.concurrent.a r2 = r14.mo63576c()     // Catch:{ all -> 0x0112 }
            androidx.work.impl.r$a r3 = new androidx.work.impl.r$a     // Catch:{ all -> 0x0112 }
            androidx.work.impl.model.m r4 = r13.mo63718a()     // Catch:{ all -> 0x0112 }
            r3.<init>(r12, r4, r2)     // Catch:{ all -> 0x0112 }
            androidx.work.impl.utils.taskexecutor.b r4 = r12.f54919d     // Catch:{ all -> 0x0112 }
            java.util.concurrent.Executor r4 = r4.mo63698a()     // Catch:{ all -> 0x0112 }
            r2.mo5489q(r3, r4)     // Catch:{ all -> 0x0112 }
            java.util.Map<java.lang.String, androidx.work.impl.n0> r2 = r12.f54922g     // Catch:{ all -> 0x0112 }
            r2.put(r1, r14)     // Catch:{ all -> 0x0112 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0112 }
            r2.<init>()     // Catch:{ all -> 0x0112 }
            r2.add(r13)     // Catch:{ all -> 0x0112 }
            java.util.Map<java.lang.String, java.util.Set<androidx.work.impl.v>> r13 = r12.f54923v     // Catch:{ all -> 0x0112 }
            r13.put(r1, r2)     // Catch:{ all -> 0x0112 }
            monitor-exit(r10)     // Catch:{ all -> 0x0112 }
            androidx.work.impl.utils.taskexecutor.b r13 = r12.f54919d
            androidx.work.impl.utils.taskexecutor.a r13 = r13.mo63699b()
            r13.execute(r14)
            androidx.work.l r13 = androidx.work.C21377l.m98582e()
            java.lang.String r14 = f54914X
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r12.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = ": processing "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.mo63774a(r14, r0)
            r13 = 1
            return r13
        L_0x0112:
            r13 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0112 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C21286r.mo63612r(androidx.work.impl.v, androidx.work.WorkerParameters$a):boolean");
    }

    /* renamed from: s */
    public boolean mo63613s(@C0359n0 String str) {
        C21278n0 remove;
        boolean z;
        synchronized (this.f54927z) {
            C21377l e = C21377l.m98582e();
            String str2 = f54914X;
            e.mo63774a(str2, "Processor cancelling " + str);
            this.f54925x.add(str);
            remove = this.f54921f.remove(str);
            if (remove != null) {
                z = true;
            } else {
                z = false;
            }
            if (remove == null) {
                remove = this.f54922g.remove(str);
            }
            if (remove != null) {
                this.f54923v.remove(str);
            }
        }
        boolean j = m98318j(str, remove);
        if (z) {
            mo63614t();
        }
        return j;
    }

    /* renamed from: t */
    public final void mo63614t() {
        synchronized (this.f54927z) {
            if (!(!this.f54921f.isEmpty())) {
                try {
                    this.f54917b.startService(C21186b.m97918h(this.f54917b));
                } catch (Throwable th) {
                    C21377l.m98582e().mo63777d(f54914X, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f54916a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f54916a = null;
                }
            }
        }
    }

    /* renamed from: u */
    public boolean mo63615u(@C0359n0 C21361v vVar) {
        C21278n0 remove;
        String f = vVar.mo63718a().mo63437f();
        synchronized (this.f54927z) {
            C21377l e = C21377l.m98582e();
            String str = f54914X;
            e.mo63774a(str, "Processor stopping foreground work " + f);
            remove = this.f54921f.remove(f);
            if (remove != null) {
                this.f54923v.remove(f);
            }
        }
        return m98318j(f, remove);
    }

    /* renamed from: v */
    public boolean mo63616v(@C0359n0 C21361v vVar) {
        String f = vVar.mo63718a().mo63437f();
        synchronized (this.f54927z) {
            C21278n0 remove = this.f54922g.remove(f);
            if (remove == null) {
                C21377l e = C21377l.m98582e();
                String str = f54914X;
                e.mo63774a(str, "WorkerWrapper could not be found for " + f);
                return false;
            }
            Set set = this.f54923v.get(f);
            if (set != null) {
                if (set.contains(vVar)) {
                    C21377l e2 = C21377l.m98582e();
                    String str2 = f54914X;
                    e2.mo63774a(str2, "Processor stopping background work " + f);
                    this.f54923v.remove(f);
                    return m98318j(f, remove);
                }
            }
            return false;
        }
    }
}
