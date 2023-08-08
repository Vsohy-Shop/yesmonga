package com.carrefour.fid.android.checkout.domain.repositories;

import com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource;
import com.carrefour.fid.android.checkout.data.datastore.datasources.SlotDataStoreSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.checkout.domain.repositories.b */
public final class C39865b implements C10324h<SlotRepository> {

    /* renamed from: a */
    public final Provider<SlotDataSource> f101692a;

    /* renamed from: b */
    public final Provider<SlotDataStoreSource> f101693b;

    public C39865b(Provider<SlotDataSource> provider, Provider<SlotDataStoreSource> provider2) {
        this.f101692a = provider;
        this.f101693b = provider2;
    }

    /* renamed from: a */
    public static C39865b m162519a(Provider<SlotDataSource> provider, Provider<SlotDataStoreSource> provider2) {
        return new C39865b(provider, provider2);
    }

    /* renamed from: c */
    public static SlotRepository m162520c(SlotDataSource slotDataSource, SlotDataStoreSource slotDataStoreSource) {
        return new SlotRepository(slotDataSource, slotDataStoreSource);
    }

    /* renamed from: b */
    public SlotRepository get() {
        return m162520c(this.f101692a.get(), this.f101693b.get());
    }
}
