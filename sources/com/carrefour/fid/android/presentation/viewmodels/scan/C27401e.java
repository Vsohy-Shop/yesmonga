package com.carrefour.fid.android.presentation.viewmodels.scan;

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
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.scan.e */
public final class C27401e implements C10324h<C27400d> {

    /* renamed from: a */
    public final Provider<Context> f66480a;

    /* renamed from: b */
    public final Provider<C13783a> f66481b;

    public C27401e(Provider<Context> provider, Provider<C13783a> provider2) {
        this.f66480a = provider;
        this.f66481b = provider2;
    }

    /* renamed from: a */
    public static C27401e m115418a(Provider<Context> provider, Provider<C13783a> provider2) {
        return new C27401e(provider, provider2);
    }

    /* renamed from: c */
    public static C27400d m115419c(Context context, C13783a aVar) {
        return new C27400d(context, aVar);
    }

    /* renamed from: b */
    public C27400d get() {
        return m115419c(this.f66480a.get(), this.f66481b.get());
    }
}
