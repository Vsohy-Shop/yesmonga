package com.carrefour.fid.android.presentation.viewmodels.product.list;

import android.content.Context;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.b */
public final class C27181b implements C10324h<C27180a> {

    /* renamed from: a */
    public final Provider<Context> f66091a;

    /* renamed from: b */
    public final Provider<C13783a> f66092b;

    /* renamed from: c */
    public final Provider<C13814a> f66093c;

    public C27181b(Provider<Context> provider, Provider<C13783a> provider2, Provider<C13814a> provider3) {
        this.f66091a = provider;
        this.f66092b = provider2;
        this.f66093c = provider3;
    }

    /* renamed from: a */
    public static C27181b m114809a(Provider<Context> provider, Provider<C13783a> provider2, Provider<C13814a> provider3) {
        return new C27181b(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C27180a m114810c(Context context, C13783a aVar, C13814a aVar2) {
        return new C27180a(context, aVar, aVar2);
    }

    /* renamed from: b */
    public C27180a get() {
        return m114810c(this.f66091a.get(), this.f66092b.get(), this.f66093c.get());
    }
}
