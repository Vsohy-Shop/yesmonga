package com.carrefour.fid.android.presentation.viewmodels.confirmation;

import android.content.Context;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.confirmation.b */
public final class C26197b implements C10324h<C26196a> {

    /* renamed from: a */
    public final Provider<Context> f64089a;

    /* renamed from: b */
    public final Provider<C13783a> f64090b;

    /* renamed from: c */
    public final Provider<C13814a> f64091c;

    /* renamed from: d */
    public final Provider<C28994a> f64092d;

    public C26197b(Provider<Context> provider, Provider<C13783a> provider2, Provider<C13814a> provider3, Provider<C28994a> provider4) {
        this.f64089a = provider;
        this.f64090b = provider2;
        this.f64091c = provider3;
        this.f64092d = provider4;
    }

    /* renamed from: a */
    public static C26197b m112018a(Provider<Context> provider, Provider<C13783a> provider2, Provider<C13814a> provider3, Provider<C28994a> provider4) {
        return new C26197b(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static C26196a m112019c(Context context, C13783a aVar, C13814a aVar2, C28994a aVar3) {
        return new C26196a(context, aVar, aVar2, aVar3);
    }

    /* renamed from: b */
    public C26196a get() {
        return m112019c(this.f64089a.get(), this.f64090b.get(), this.f64091c.get(), this.f64092d.get());
    }
}
