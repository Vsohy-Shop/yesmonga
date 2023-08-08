package androidx.work.impl.utils;

import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21397o;
import androidx.work.WorkInfo;
import androidx.work.impl.C21191g0;
import androidx.work.impl.C21282o;
import androidx.work.impl.C21289t;
import androidx.work.impl.C21290u;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C21211b;
import androidx.work.impl.model.C21253v;
import java.util.LinkedList;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.c */
public abstract class C21295c implements Runnable {

    /* renamed from: a */
    public final C21282o f54952a = new C21282o();

    /* renamed from: androidx.work.impl.utils.c$a */
    public class C21296a extends C21295c {

        /* renamed from: b */
        public final /* synthetic */ C21191g0 f54953b;

        /* renamed from: c */
        public final /* synthetic */ UUID f54954c;

        public C21296a(C21191g0 g0Var, UUID uuid) {
            this.f54953b = g0Var;
            this.f54954c = uuid;
        }

        /* JADX INFO: finally extract failed */
        @C0348i1
        /* renamed from: i */
        public void mo63634i() {
            WorkDatabase P = this.f54953b.mo63363P();
            P.mo60905e();
            try {
                mo63630a(this.f54953b, this.f54954c.toString());
                P.mo60901O();
                P.mo60908k();
                mo63633h(this.f54953b);
            } catch (Throwable th) {
                P.mo60908k();
                throw th;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.c$b */
    public class C21297b extends C21295c {

        /* renamed from: b */
        public final /* synthetic */ C21191g0 f54955b;

        /* renamed from: c */
        public final /* synthetic */ String f54956c;

        public C21297b(C21191g0 g0Var, String str) {
            this.f54955b = g0Var;
            this.f54956c = str;
        }

        /* JADX INFO: finally extract failed */
        @C0348i1
        /* renamed from: i */
        public void mo63634i() {
            WorkDatabase P = this.f54955b.mo63363P();
            P.mo60905e();
            try {
                for (String a : P.mo63207X().mo63542o(this.f54956c)) {
                    mo63630a(this.f54955b, a);
                }
                P.mo60901O();
                P.mo60908k();
                mo63633h(this.f54955b);
            } catch (Throwable th) {
                P.mo60908k();
                throw th;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.c$c */
    public class C21298c extends C21295c {

        /* renamed from: b */
        public final /* synthetic */ C21191g0 f54957b;

        /* renamed from: c */
        public final /* synthetic */ String f54958c;

        /* renamed from: d */
        public final /* synthetic */ boolean f54959d;

        public C21298c(C21191g0 g0Var, String str, boolean z) {
            this.f54957b = g0Var;
            this.f54958c = str;
            this.f54959d = z;
        }

        /* JADX INFO: finally extract failed */
        @C0348i1
        /* renamed from: i */
        public void mo63634i() {
            WorkDatabase P = this.f54957b.mo63363P();
            P.mo60905e();
            try {
                for (String a : P.mo63207X().mo63536i(this.f54958c)) {
                    mo63630a(this.f54957b, a);
                }
                P.mo60901O();
                P.mo60908k();
                if (this.f54959d) {
                    mo63633h(this.f54957b);
                }
            } catch (Throwable th) {
                P.mo60908k();
                throw th;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.c$d */
    public class C21299d extends C21295c {

        /* renamed from: b */
        public final /* synthetic */ C21191g0 f54960b;

        public C21299d(C21191g0 g0Var) {
            this.f54960b = g0Var;
        }

        @C0348i1
        /* renamed from: i */
        public void mo63634i() {
            WorkDatabase P = this.f54960b.mo63363P();
            P.mo60905e();
            try {
                for (String a : P.mo63207X().mo63520C()) {
                    mo63630a(this.f54960b, a);
                }
                new C21342t(this.f54960b.mo63363P()).mo63693f(System.currentTimeMillis());
                P.mo60901O();
            } finally {
                P.mo60908k();
            }
        }
    }

    @C0359n0
    /* renamed from: b */
    public static C21295c m98357b(@C0359n0 C21191g0 g0Var) {
        return new C21299d(g0Var);
    }

    @C0359n0
    /* renamed from: c */
    public static C21295c m98358c(@C0359n0 UUID uuid, @C0359n0 C21191g0 g0Var) {
        return new C21296a(g0Var, uuid);
    }

    @C0359n0
    /* renamed from: d */
    public static C21295c m98359d(@C0359n0 String str, @C0359n0 C21191g0 g0Var, boolean z) {
        return new C21298c(g0Var, str, z);
    }

    @C0359n0
    /* renamed from: e */
    public static C21295c m98360e(@C0359n0 String str, @C0359n0 C21191g0 g0Var) {
        return new C21297b(g0Var, str);
    }

    /* renamed from: a */
    public void mo63630a(C21191g0 g0Var, String str) {
        mo63632g(g0Var.mo63363P(), str);
        g0Var.mo63359L().mo63613s(str);
        for (C21289t b : g0Var.mo63361N()) {
            b.mo63220b(str);
        }
    }

    @C0359n0
    /* renamed from: f */
    public C21397o mo63631f() {
        return this.f54952a;
    }

    /* renamed from: g */
    public final void mo63632g(WorkDatabase workDatabase, String str) {
        C21253v X = workDatabase.mo63207X();
        C21211b R = workDatabase.mo63201R();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State k = X.mo63538k(str2);
            if (!(k == WorkInfo.State.SUCCEEDED || k == WorkInfo.State.FAILED)) {
                X.mo63550w(WorkInfo.State.CANCELLED, str2);
            }
            linkedList.addAll(R.mo63390b(str2));
        }
    }

    /* renamed from: h */
    public void mo63633h(C21191g0 g0Var) {
        C21290u.m98344b(g0Var.mo63065o(), g0Var.mo63363P(), g0Var.mo63361N());
    }

    /* renamed from: i */
    public abstract void mo63634i();

    public void run() {
        try {
            mo63634i();
            this.f54952a.mo63600b(C21397o.f55145a);
        } catch (Throwable th) {
            this.f54952a.mo63600b(new C21397o.C21399b.C21400a(th));
        }
    }
}
