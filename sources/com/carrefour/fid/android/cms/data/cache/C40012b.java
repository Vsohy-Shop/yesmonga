package com.carrefour.fid.android.cms.data.cache;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.cms.data.cache.b */
public final class C40012b implements C10324h<StorePetrolCache> {

    /* renamed from: a */
    public final Provider<Context> f102039a;

    public C40012b(Provider<Context> provider) {
        this.f102039a = provider;
    }

    /* renamed from: a */
    public static C40012b m162974a(Provider<Context> provider) {
        return new C40012b(provider);
    }

    /* renamed from: c */
    public static StorePetrolCache m162975c(Context context) {
        return new StorePetrolCache(context);
    }

    /* renamed from: b */
    public StorePetrolCache get() {
        return m162975c(this.f102039a.get());
    }
}
