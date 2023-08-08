package com.carrefour.fid.android.presentation.viewmodels.product.filter;

import android.content.Context;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.filter.b */
public final class C27178b implements C10324h<C27177a> {

    /* renamed from: a */
    public final Provider<Context> f66079a;

    /* renamed from: b */
    public final Provider<C13783a> f66080b;

    public C27178b(Provider<Context> provider, Provider<C13783a> provider2) {
        this.f66079a = provider;
        this.f66080b = provider2;
    }

    /* renamed from: a */
    public static C27178b m114783a(Provider<Context> provider, Provider<C13783a> provider2) {
        return new C27178b(provider, provider2);
    }

    /* renamed from: c */
    public static C27177a m114784c(Context context, C13783a aVar) {
        return new C27177a(context, aVar);
    }

    /* renamed from: b */
    public C27177a get() {
        return m114784c(this.f66079a.get(), this.f66080b.get());
    }
}
