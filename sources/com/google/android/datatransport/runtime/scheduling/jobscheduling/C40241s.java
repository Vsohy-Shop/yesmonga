package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C40106e;
import com.google.android.datatransport.runtime.dagger.internal.C40141g;
import com.google.android.datatransport.runtime.scheduling.persistence.C40253c;
import com.google.android.datatransport.runtime.scheduling.persistence.C40255d;
import com.google.android.datatransport.runtime.synchronization.C40306a;
import com.google.android.datatransport.runtime.time.C40309a;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.s */
public final class C40241s implements C40141g<C40240r> {

    /* renamed from: a */
    public final Provider<Context> f102556a;

    /* renamed from: b */
    public final Provider<C40106e> f102557b;

    /* renamed from: c */
    public final Provider<C40255d> f102558c;

    /* renamed from: d */
    public final Provider<C40246x> f102559d;

    /* renamed from: e */
    public final Provider<Executor> f102560e;

    /* renamed from: f */
    public final Provider<C40306a> f102561f;

    /* renamed from: g */
    public final Provider<C40309a> f102562g;

    /* renamed from: h */
    public final Provider<C40309a> f102563h;

    /* renamed from: i */
    public final Provider<C40253c> f102564i;

    public C40241s(Provider<Context> provider, Provider<C40106e> provider2, Provider<C40255d> provider3, Provider<C40246x> provider4, Provider<Executor> provider5, Provider<C40306a> provider6, Provider<C40309a> provider7, Provider<C40309a> provider8, Provider<C40253c> provider9) {
        this.f102556a = provider;
        this.f102557b = provider2;
        this.f102558c = provider3;
        this.f102559d = provider4;
        this.f102560e = provider5;
        this.f102561f = provider6;
        this.f102562g = provider7;
        this.f102563h = provider8;
        this.f102564i = provider9;
    }

    /* renamed from: a */
    public static C40241s m163614a(Provider<Context> provider, Provider<C40106e> provider2, Provider<C40255d> provider3, Provider<C40246x> provider4, Provider<Executor> provider5, Provider<C40306a> provider6, Provider<C40309a> provider7, Provider<C40309a> provider8, Provider<C40253c> provider9) {
        return new C40241s(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    /* renamed from: c */
    public static C40240r m163615c(Context context, C40106e eVar, C40255d dVar, C40246x xVar, Executor executor, C40306a aVar, C40309a aVar2, C40309a aVar3, C40253c cVar) {
        return new C40240r(context, eVar, dVar, xVar, executor, aVar, aVar2, aVar3, cVar);
    }

    /* renamed from: b */
    public C40240r get() {
        return m163615c(this.f102556a.get(), this.f102557b.get(), this.f102558c.get(), this.f102559d.get(), this.f102560e.get(), this.f102561f.get(), this.f102562g.get(), this.f102563h.get(), this.f102564i.get());
    }
}
