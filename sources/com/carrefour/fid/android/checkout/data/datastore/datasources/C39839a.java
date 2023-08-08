package com.carrefour.fid.android.checkout.data.datastore.datasources;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.checkout.data.datastore.datasources.a */
public final class C39839a implements C10324h<SlotDataStoreSource> {

    /* renamed from: a */
    public final Provider<Context> f101604a;

    public C39839a(Provider<Context> provider) {
        this.f101604a = provider;
    }

    /* renamed from: a */
    public static C39839a m162421a(Provider<Context> provider) {
        return new C39839a(provider);
    }

    /* renamed from: c */
    public static SlotDataStoreSource m162422c(Context context) {
        return new SlotDataStoreSource(context);
    }

    /* renamed from: b */
    public SlotDataStoreSource get() {
        return m162422c(this.f101604a.get());
    }
}
