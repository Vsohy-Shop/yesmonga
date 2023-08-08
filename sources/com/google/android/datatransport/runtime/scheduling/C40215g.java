package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.C40141g;
import com.google.android.datatransport.runtime.dagger.internal.C40153o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.C40309a;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.g */
public final class C40215g implements C40141g<SchedulerConfig> {

    /* renamed from: a */
    public final Provider<C40309a> f102477a;

    public C40215g(Provider<C40309a> provider) {
        this.f102477a = provider;
    }

    /* renamed from: a */
    public static SchedulerConfig m163542a(C40309a aVar) {
        return (SchedulerConfig) C40153o.m163384c(C40214f.m163541a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C40215g m163543b(Provider<C40309a> provider) {
        return new C40215g(provider);
    }

    /* renamed from: c */
    public SchedulerConfig get() {
        return m163542a(this.f102477a.get());
    }
}
