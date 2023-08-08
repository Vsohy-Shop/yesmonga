package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.C0337f0;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.futures.C21317a;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.google.common.util.concurrent.C32487a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.work.k */
public abstract class C21372k {
    @C0359n0

    /* renamed from: a */
    public Context f55112a;
    @C0359n0

    /* renamed from: b */
    public WorkerParameters f55113b;

    /* renamed from: c */
    public volatile boolean f55114c;

    /* renamed from: d */
    public boolean f55115d;

    /* renamed from: androidx.work.k$a */
    public static abstract class C21373a {

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: androidx.work.k$a$a */
        public static final class C21374a extends C21373a {

            /* renamed from: a */
            public final C21091d f55116a;

            public C21374a() {
                this(C21091d.f54440c);
            }

            @C0359n0
            /* renamed from: c */
            public C21091d mo63764c() {
                return this.f55116a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C21374a.class != obj.getClass()) {
                    return false;
                }
                return this.f55116a.equals(((C21374a) obj).f55116a);
            }

            public int hashCode() {
                return (C21374a.class.getName().hashCode() * 31) + this.f55116a.hashCode();
            }

            @C0359n0
            public String toString() {
                return "Failure {mOutputData=" + this.f55116a + C12361b.f30259j;
            }

            public C21374a(@C0359n0 C21091d dVar) {
                this.f55116a = dVar;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: androidx.work.k$a$b */
        public static final class C21375b extends C21373a {
            @C0359n0
            /* renamed from: c */
            public C21091d mo63764c() {
                return C21091d.f54440c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C21375b.class == obj.getClass();
            }

            public int hashCode() {
                return C21375b.class.getName().hashCode();
            }

            @C0359n0
            public String toString() {
                return "Retry";
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: androidx.work.k$a$c */
        public static final class C21376c extends C21373a {

            /* renamed from: a */
            public final C21091d f55117a;

            public C21376c() {
                this(C21091d.f54440c);
            }

            @C0359n0
            /* renamed from: c */
            public C21091d mo63764c() {
                return this.f55117a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C21376c.class != obj.getClass()) {
                    return false;
                }
                return this.f55117a.equals(((C21376c) obj).f55117a);
            }

            public int hashCode() {
                return (C21376c.class.getName().hashCode() * 31) + this.f55117a.hashCode();
            }

            @C0359n0
            public String toString() {
                return "Success {mOutputData=" + this.f55117a + C12361b.f30259j;
            }

            public C21376c(@C0359n0 C21091d dVar) {
                this.f55117a = dVar;
            }
        }

        @C0359n0
        /* renamed from: a */
        public static C21373a m98573a() {
            return new C21374a();
        }

        @C0359n0
        /* renamed from: b */
        public static C21373a m98574b(@C0359n0 C21091d dVar) {
            return new C21374a(dVar);
        }

        @C0359n0
        /* renamed from: d */
        public static C21373a m98575d() {
            return new C21375b();
        }

        @C0359n0
        /* renamed from: e */
        public static C21373a m98576e() {
            return new C21376c();
        }

        @C0359n0
        /* renamed from: f */
        public static C21373a m98577f(@C0359n0 C21091d dVar) {
            return new C21376c(dVar);
        }

        @C0359n0
        /* renamed from: c */
        public abstract C21091d mo63764c();
    }

    public C21372k(@C0359n0 Context context, @C0359n0 WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f55112a = context;
            this.f55113b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    @C0359n0
    /* renamed from: b */
    public final Context mo63747b() {
        return this.f55112a;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public Executor mo63748c() {
        return this.f55113b.mo63081a();
    }

    @C0359n0
    /* renamed from: d */
    public C32487a<C21094f> mo63076d() {
        C21317a v = C21317a.m98425v();
        v.mo63660r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return v;
    }

    @C0359n0
    /* renamed from: e */
    public final UUID mo63749e() {
        return this.f55113b.mo63084d();
    }

    @C0359n0
    /* renamed from: g */
    public final C21091d mo63750g() {
        return this.f55113b.mo63085e();
    }

    @C0363p0
    @C0376v0(28)
    /* renamed from: h */
    public final Network mo63751h() {
        return this.f55113b.mo63086f();
    }

    @C0337f0(from = 0)
    /* renamed from: i */
    public final int mo63752i() {
        return this.f55113b.mo63088h();
    }

    @C0359n0
    /* renamed from: j */
    public final Set<String> mo63753j() {
        return this.f55113b.mo63090j();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: k */
    public C21345b mo63754k() {
        return this.f55113b.mo63091k();
    }

    @C0359n0
    @C0376v0(24)
    /* renamed from: l */
    public final List<String> mo63755l() {
        return this.f55113b.mo63092l();
    }

    @C0359n0
    @C0376v0(24)
    /* renamed from: m */
    public final List<Uri> mo63756m() {
        return this.f55113b.mo63093m();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public C21417x mo63757n() {
        return this.f55113b.mo63094n();
    }

    /* renamed from: o */
    public final boolean mo63758o() {
        return this.f55114c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: p */
    public final boolean mo63759p() {
        return this.f55115d;
    }

    /* renamed from: q */
    public void mo63725q() {
    }

    @C0359n0
    /* renamed from: r */
    public final C32487a<Void> mo63760r(@C0359n0 C21094f fVar) {
        return this.f55113b.mo63082b().mo63199a(mo63747b(), mo63749e(), fVar);
    }

    @C0359n0
    /* renamed from: s */
    public C32487a<Void> mo63761s(@C0359n0 C21091d dVar) {
        return this.f55113b.mo63087g().mo63677a(mo63747b(), mo63749e(), dVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: t */
    public final void mo63762t() {
        this.f55115d = true;
    }

    @C0353k0
    @C0359n0
    /* renamed from: u */
    public abstract C32487a<C21373a> mo18696u();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: v */
    public final void mo63763v() {
        this.f55114c = true;
        mo63725q();
    }
}
