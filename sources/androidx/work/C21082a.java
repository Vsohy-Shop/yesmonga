package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17970d;
import androidx.work.impl.C21174d;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.work.a */
public final class C21082a {
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: n */
    public static final int f54389n = 20;
    @C0359n0

    /* renamed from: a */
    public final Executor f54390a;
    @C0359n0

    /* renamed from: b */
    public final Executor f54391b;
    @C0359n0

    /* renamed from: c */
    public final C21417x f54392c;
    @C0359n0

    /* renamed from: d */
    public final C21370j f54393d;
    @C0359n0

    /* renamed from: e */
    public final C21410t f54394e;
    @C0363p0

    /* renamed from: f */
    public final C17970d<Throwable> f54395f;
    @C0363p0

    /* renamed from: g */
    public final C17970d<Throwable> f54396g;
    @C0363p0

    /* renamed from: h */
    public final String f54397h;

    /* renamed from: i */
    public final int f54398i;

    /* renamed from: j */
    public final int f54399j;

    /* renamed from: k */
    public final int f54400k;

    /* renamed from: l */
    public final int f54401l;

    /* renamed from: m */
    public final boolean f54402m;

    /* renamed from: androidx.work.a$a */
    public class C21083a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f54403a = new AtomicInteger(0);

        /* renamed from: b */
        public final /* synthetic */ boolean f54404b;

        public C21083a(boolean z) {
            this.f54404b = z;
        }

        public Thread newThread(Runnable runnable) {
            String str;
            if (this.f54404b) {
                str = "WM.task-";
            } else {
                str = "androidx.work-";
            }
            return new Thread(runnable, str + this.f54403a.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.a$c */
    public interface C21085c {
        @C0359n0
        /* renamed from: a */
        C21082a mo63124a();
    }

    public C21082a(@C0359n0 C21084b bVar) {
        Executor executor = bVar.f54406a;
        if (executor == null) {
            this.f54390a = mo63095a(false);
        } else {
            this.f54390a = executor;
        }
        Executor executor2 = bVar.f54409d;
        if (executor2 == null) {
            this.f54402m = true;
            this.f54391b = mo63095a(true);
        } else {
            this.f54402m = false;
            this.f54391b = executor2;
        }
        C21417x xVar = bVar.f54407b;
        if (xVar == null) {
            this.f54392c = C21417x.m98758c();
        } else {
            this.f54392c = xVar;
        }
        C21370j jVar = bVar.f54408c;
        if (jVar == null) {
            this.f54393d = C21370j.m98549c();
        } else {
            this.f54393d = jVar;
        }
        C21410t tVar = bVar.f54410e;
        if (tVar == null) {
            this.f54394e = new C21174d();
        } else {
            this.f54394e = tVar;
        }
        this.f54398i = bVar.f54414i;
        this.f54399j = bVar.f54415j;
        this.f54400k = bVar.f54416k;
        this.f54401l = bVar.f54417l;
        this.f54395f = bVar.f54411f;
        this.f54396g = bVar.f54412g;
        this.f54397h = bVar.f54413h;
    }

    @C0359n0
    /* renamed from: a */
    public final Executor mo63095a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), mo63096b(z));
    }

    @C0359n0
    /* renamed from: b */
    public final ThreadFactory mo63096b(boolean z) {
        return new C21083a(z);
    }

    @C0363p0
    /* renamed from: c */
    public String mo63097c() {
        return this.f54397h;
    }

    @C0359n0
    /* renamed from: d */
    public Executor mo63098d() {
        return this.f54390a;
    }

    @C0363p0
    /* renamed from: e */
    public C17970d<Throwable> mo63099e() {
        return this.f54395f;
    }

    @C0359n0
    /* renamed from: f */
    public C21370j mo63100f() {
        return this.f54393d;
    }

    /* renamed from: g */
    public int mo63101g() {
        return this.f54400k;
    }

    @C0337f0(from = 20, mo995to = 50)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public int mo63102h() {
        return this.f54401l;
    }

    /* renamed from: i */
    public int mo63103i() {
        return this.f54399j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: j */
    public int mo63104j() {
        return this.f54398i;
    }

    @C0359n0
    /* renamed from: k */
    public C21410t mo63105k() {
        return this.f54394e;
    }

    @C0363p0
    /* renamed from: l */
    public C17970d<Throwable> mo63106l() {
        return this.f54396g;
    }

    @C0359n0
    /* renamed from: m */
    public Executor mo63107m() {
        return this.f54391b;
    }

    @C0359n0
    /* renamed from: n */
    public C21417x mo63108n() {
        return this.f54392c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: o */
    public boolean mo63109o() {
        return this.f54402m;
    }

    /* renamed from: androidx.work.a$b */
    public static final class C21084b {

        /* renamed from: a */
        public Executor f54406a;

        /* renamed from: b */
        public C21417x f54407b;

        /* renamed from: c */
        public C21370j f54408c;

        /* renamed from: d */
        public Executor f54409d;

        /* renamed from: e */
        public C21410t f54410e;
        @C0363p0

        /* renamed from: f */
        public C17970d<Throwable> f54411f;
        @C0363p0

        /* renamed from: g */
        public C17970d<Throwable> f54412g;
        @C0363p0

        /* renamed from: h */
        public String f54413h;

        /* renamed from: i */
        public int f54414i;

        /* renamed from: j */
        public int f54415j;

        /* renamed from: k */
        public int f54416k;

        /* renamed from: l */
        public int f54417l;

        public C21084b() {
            this.f54414i = 4;
            this.f54415j = 0;
            this.f54416k = Integer.MAX_VALUE;
            this.f54417l = 20;
        }

        @C0359n0
        /* renamed from: a */
        public C21082a mo63111a() {
            return new C21082a(this);
        }

        @C0359n0
        /* renamed from: b */
        public C21084b mo63112b(@C0359n0 String str) {
            this.f54413h = str;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C21084b mo63113c(@C0359n0 Executor executor) {
            this.f54406a = executor;
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C21084b mo63114d(@C0359n0 C17970d<Throwable> dVar) {
            this.f54411f = dVar;
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: e */
        public C21084b mo63115e(@C0359n0 C21096h hVar) {
            Objects.requireNonNull(hVar);
            this.f54411f = new C21086b(hVar);
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C21084b mo63116f(@C0359n0 C21370j jVar) {
            this.f54408c = jVar;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C21084b mo63117g(int i, int i2) {
            if (i2 - i >= 1000) {
                this.f54415j = i;
                this.f54416k = i2;
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
        }

        @C0359n0
        /* renamed from: h */
        public C21084b mo63118h(int i) {
            if (i >= 20) {
                this.f54417l = Math.min(i, 50);
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
        }

        @C0359n0
        /* renamed from: i */
        public C21084b mo63119i(int i) {
            this.f54414i = i;
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C21084b mo63120j(@C0359n0 C21410t tVar) {
            this.f54410e = tVar;
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C21084b mo63121k(@C0359n0 C17970d<Throwable> dVar) {
            this.f54412g = dVar;
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C21084b mo63122l(@C0359n0 Executor executor) {
            this.f54409d = executor;
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C21084b mo63123m(@C0359n0 C21417x xVar) {
            this.f54407b = xVar;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public C21084b(@C0359n0 C21082a aVar) {
            this.f54406a = aVar.f54390a;
            this.f54407b = aVar.f54392c;
            this.f54408c = aVar.f54393d;
            this.f54409d = aVar.f54391b;
            this.f54414i = aVar.f54398i;
            this.f54415j = aVar.f54399j;
            this.f54416k = aVar.f54400k;
            this.f54417l = aVar.f54401l;
            this.f54410e = aVar.f54394e;
            this.f54411f = aVar.f54395f;
            this.f54412g = aVar.f54396g;
            this.f54413h = aVar.f54397h;
        }
    }
}
