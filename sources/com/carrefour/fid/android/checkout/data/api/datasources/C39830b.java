package com.carrefour.fid.android.checkout.data.api.datasources;

import com.carrefour.fid.android.checkout.data.api.services.C39838b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.checkout.data.api.datasources.b */
public final class C39830b implements C10324h<SlotDataSource> {

    /* renamed from: a */
    public final Provider<C39838b> f101599a;

    public C39830b(Provider<C39838b> provider) {
        this.f101599a = provider;
    }

    /* renamed from: a */
    public static C39830b m162394a(Provider<C39838b> provider) {
        return new C39830b(provider);
    }

    /* renamed from: c */
    public static SlotDataSource m162395c(C39838b bVar) {
        return new SlotDataSource(bVar);
    }

    /* renamed from: b */
    public SlotDataSource get() {
        return m162395c(this.f101599a.get());
    }
}
