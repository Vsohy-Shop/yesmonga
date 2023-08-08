package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.C40141g;
import com.google.android.datatransport.runtime.scheduling.C40213e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40240r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40244v;
import com.google.android.datatransport.runtime.time.C40309a;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.y */
public final class C40326y implements C40141g<C40323w> {

    /* renamed from: a */
    public final Provider<C40309a> f102692a;

    /* renamed from: b */
    public final Provider<C40309a> f102693b;

    /* renamed from: c */
    public final Provider<C40213e> f102694c;

    /* renamed from: d */
    public final Provider<C40240r> f102695d;

    /* renamed from: e */
    public final Provider<C40244v> f102696e;

    public C40326y(Provider<C40309a> provider, Provider<C40309a> provider2, Provider<C40213e> provider3, Provider<C40240r> provider4, Provider<C40244v> provider5) {
        this.f102692a = provider;
        this.f102693b = provider2;
        this.f102694c = provider3;
        this.f102695d = provider4;
        this.f102696e = provider5;
    }

    /* renamed from: a */
    public static C40326y m163842a(Provider<C40309a> provider, Provider<C40309a> provider2, Provider<C40213e> provider3, Provider<C40240r> provider4, Provider<C40244v> provider5) {
        return new C40326y(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C40323w m163843c(C40309a aVar, C40309a aVar2, C40213e eVar, C40240r rVar, C40244v vVar) {
        return new C40323w(aVar, aVar2, eVar, rVar, vVar);
    }

    /* renamed from: b */
    public C40323w get() {
        return m163843c(this.f102692a.get(), this.f102693b.get(), this.f102694c.get(), this.f102695d.get(), this.f102696e.get());
    }
}
