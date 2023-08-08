package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.C40106e;
import com.google.android.datatransport.runtime.dagger.internal.C40141g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40246x;
import com.google.android.datatransport.runtime.scheduling.persistence.C40255d;
import com.google.android.datatransport.runtime.synchronization.C40306a;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.d */
public final class C40212d implements C40141g<C40211c> {

    /* renamed from: a */
    public final Provider<Executor> f102472a;

    /* renamed from: b */
    public final Provider<C40106e> f102473b;

    /* renamed from: c */
    public final Provider<C40246x> f102474c;

    /* renamed from: d */
    public final Provider<C40255d> f102475d;

    /* renamed from: e */
    public final Provider<C40306a> f102476e;

    public C40212d(Provider<Executor> provider, Provider<C40106e> provider2, Provider<C40246x> provider3, Provider<C40255d> provider4, Provider<C40306a> provider5) {
        this.f102472a = provider;
        this.f102473b = provider2;
        this.f102474c = provider3;
        this.f102475d = provider4;
        this.f102476e = provider5;
    }

    /* renamed from: a */
    public static C40212d m163537a(Provider<Executor> provider, Provider<C40106e> provider2, Provider<C40246x> provider3, Provider<C40255d> provider4, Provider<C40306a> provider5) {
        return new C40212d(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C40211c m163538c(Executor executor, C40106e eVar, C40246x xVar, C40255d dVar, C40306a aVar) {
        return new C40211c(executor, eVar, xVar, dVar, aVar);
    }

    /* renamed from: b */
    public C40211c get() {
        return m163538c(this.f102472a.get(), this.f102473b.get(), this.f102474c.get(), this.f102475d.get(), this.f102476e.get());
    }
}
