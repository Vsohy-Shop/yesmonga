package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C40141g;
import com.google.android.datatransport.runtime.dagger.internal.C40153o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40246x;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.C40255d;
import com.google.android.datatransport.runtime.time.C40309a;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.i */
public final class C40217i implements C40141g<C40246x> {

    /* renamed from: a */
    public final Provider<Context> f102478a;

    /* renamed from: b */
    public final Provider<C40255d> f102479b;

    /* renamed from: c */
    public final Provider<SchedulerConfig> f102480c;

    /* renamed from: d */
    public final Provider<C40309a> f102481d;

    public C40217i(Provider<Context> provider, Provider<C40255d> provider2, Provider<SchedulerConfig> provider3, Provider<C40309a> provider4) {
        this.f102478a = provider;
        this.f102479b = provider2;
        this.f102480c = provider3;
        this.f102481d = provider4;
    }

    /* renamed from: a */
    public static C40217i m163547a(Provider<Context> provider, Provider<C40255d> provider2, Provider<SchedulerConfig> provider3, Provider<C40309a> provider4) {
        return new C40217i(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static C40246x m163548c(Context context, C40255d dVar, SchedulerConfig schedulerConfig, C40309a aVar) {
        return (C40246x) C40153o.m163384c(C40216h.m163545b(context, dVar, schedulerConfig, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C40246x get() {
        return m163548c(this.f102478a.get(), this.f102479b.get(), this.f102480c.get(), this.f102481d.get());
    }
}
