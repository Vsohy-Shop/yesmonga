package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.C40324x;
import com.google.android.datatransport.runtime.backends.C40112j;
import com.google.android.datatransport.runtime.backends.C40115l;
import com.google.android.datatransport.runtime.dagger.internal.C40140f;
import com.google.android.datatransport.runtime.dagger.internal.C40141g;
import com.google.android.datatransport.runtime.dagger.internal.C40144j;
import com.google.android.datatransport.runtime.dagger.internal.C40153o;
import com.google.android.datatransport.runtime.scheduling.C40211c;
import com.google.android.datatransport.runtime.scheduling.C40212d;
import com.google.android.datatransport.runtime.scheduling.C40215g;
import com.google.android.datatransport.runtime.scheduling.C40217i;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40240r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40241s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40244v;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40245w;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40246x;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.C40255d;
import com.google.android.datatransport.runtime.scheduling.persistence.C40262g;
import com.google.android.datatransport.runtime.scheduling.persistence.C40265h;
import com.google.android.datatransport.runtime.scheduling.persistence.C40267i;
import com.google.android.datatransport.runtime.scheduling.persistence.C40270j;
import com.google.android.datatransport.runtime.scheduling.persistence.C40280n0;
import com.google.android.datatransport.runtime.scheduling.persistence.C40286o0;
import com.google.android.datatransport.runtime.scheduling.persistence.C40301v0;
import com.google.android.datatransport.runtime.time.C40313e;
import com.google.android.datatransport.runtime.time.C40315f;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.f */
public final class C40173f extends C40324x {

    /* renamed from: X */
    public Provider<C40323w> f102394X;

    /* renamed from: a */
    public Provider<Executor> f102395a;

    /* renamed from: b */
    public Provider<Context> f102396b;

    /* renamed from: c */
    public Provider f102397c;

    /* renamed from: d */
    public Provider f102398d;

    /* renamed from: e */
    public Provider f102399e;

    /* renamed from: f */
    public Provider<String> f102400f;

    /* renamed from: g */
    public Provider<C40280n0> f102401g;

    /* renamed from: v */
    public Provider<SchedulerConfig> f102402v;

    /* renamed from: w */
    public Provider<C40246x> f102403w;

    /* renamed from: x */
    public Provider<C40211c> f102404x;

    /* renamed from: y */
    public Provider<C40240r> f102405y;

    /* renamed from: z */
    public Provider<C40244v> f102406z;

    /* renamed from: com.google.android.datatransport.runtime.f$b */
    public static final class C40175b implements C40324x.C40325a {

        /* renamed from: a */
        public Context f102407a;

        public C40175b() {
        }

        /* renamed from: b */
        public C40175b mo132787a(Context context) {
            this.f102407a = (Context) C40153o.m163383b(context);
            return this;
        }

        /* renamed from: g */
        public C40324x mo132789g() {
            C40153o.m163382a(this.f102407a, Context.class);
            return new C40173f(this.f102407a);
        }
    }

    /* renamed from: c */
    public static C40324x.C40325a m163399c() {
        return new C40175b();
    }

    /* renamed from: a */
    public C40255d mo132784a() {
        return this.f102401g.get();
    }

    /* renamed from: b */
    public C40323w mo132785b() {
        return this.f102394X.get();
    }

    /* renamed from: d */
    public final void mo132786d(Context context) {
        this.f102395a = C40140f.m163358b(C40193l.m163486a());
        C40141g a = C40144j.m163360a(context);
        this.f102396b = a;
        C40112j a2 = C40112j.m163314a(a, C40313e.m163813a(), C40315f.m163817a());
        this.f102397c = a2;
        this.f102398d = C40140f.m163358b(C40115l.m163321a(this.f102396b, a2));
        this.f102399e = C40301v0.m163804a(this.f102396b, C40262g.m163673a(), C40267i.m163680a());
        this.f102400f = C40140f.m163358b(C40265h.m163677a(this.f102396b));
        this.f102401g = C40140f.m163358b(C40286o0.m163781a(C40313e.m163813a(), C40315f.m163817a(), C40270j.m163684a(), this.f102399e, this.f102400f));
        C40215g b = C40215g.m163543b(C40313e.m163813a());
        this.f102402v = b;
        C40217i a3 = C40217i.m163547a(this.f102396b, this.f102401g, b, C40315f.m163817a());
        this.f102403w = a3;
        Provider<Executor> provider = this.f102395a;
        Provider provider2 = this.f102398d;
        Provider<C40280n0> provider3 = this.f102401g;
        this.f102404x = C40212d.m163537a(provider, provider2, a3, provider3, provider3);
        Provider<Context> provider4 = this.f102396b;
        Provider provider5 = this.f102398d;
        Provider<C40280n0> provider6 = this.f102401g;
        this.f102405y = C40241s.m163614a(provider4, provider5, provider6, this.f102403w, this.f102395a, provider6, C40313e.m163813a(), C40315f.m163817a(), this.f102401g);
        Provider<Executor> provider7 = this.f102395a;
        Provider<C40280n0> provider8 = this.f102401g;
        this.f102406z = C40245w.m163622a(provider7, provider8, this.f102403w, provider8);
        this.f102394X = C40140f.m163358b(C40326y.m163842a(C40313e.m163813a(), C40315f.m163817a(), this.f102404x, this.f102405y, this.f102406z));
    }

    public C40173f(Context context) {
        mo132786d(context);
    }
}
