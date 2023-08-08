package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.C40141g;
import com.google.android.datatransport.runtime.scheduling.persistence.C40255d;
import com.google.android.datatransport.runtime.synchronization.C40306a;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.w */
public final class C40245w implements C40141g<C40244v> {

    /* renamed from: a */
    public final Provider<Executor> f102571a;

    /* renamed from: b */
    public final Provider<C40255d> f102572b;

    /* renamed from: c */
    public final Provider<C40246x> f102573c;

    /* renamed from: d */
    public final Provider<C40306a> f102574d;

    public C40245w(Provider<Executor> provider, Provider<C40255d> provider2, Provider<C40246x> provider3, Provider<C40306a> provider4) {
        this.f102571a = provider;
        this.f102572b = provider2;
        this.f102573c = provider3;
        this.f102574d = provider4;
    }

    /* renamed from: a */
    public static C40245w m163622a(Provider<Executor> provider, Provider<C40255d> provider2, Provider<C40246x> provider3, Provider<C40306a> provider4) {
        return new C40245w(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static C40244v m163623c(Executor executor, C40255d dVar, C40246x xVar, C40306a aVar) {
        return new C40244v(executor, dVar, xVar, aVar);
    }

    /* renamed from: b */
    public C40244v get() {
        return m163623c(this.f102571a.get(), this.f102572b.get(), this.f102573c.get(), this.f102574d.get());
    }
}
