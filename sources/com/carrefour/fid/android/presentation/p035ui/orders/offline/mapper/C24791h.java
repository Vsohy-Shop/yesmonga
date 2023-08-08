package com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.mapper.h */
public final class C24791h implements C10324h<C24790g> {

    /* renamed from: a */
    public final Provider<Context> f61483a;

    public C24791h(Provider<Context> provider) {
        this.f61483a = provider;
    }

    /* renamed from: a */
    public static C24791h m108012a(Provider<Context> provider) {
        return new C24791h(provider);
    }

    /* renamed from: c */
    public static C24790g m108013c(Context context) {
        return new C24790g(context);
    }

    /* renamed from: b */
    public C24790g get() {
        return m108013c(this.f61483a.get());
    }
}
