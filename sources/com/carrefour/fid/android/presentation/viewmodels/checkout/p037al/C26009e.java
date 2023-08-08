package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

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
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.e */
public final class C26009e implements C10324h<C26007d> {

    /* renamed from: a */
    public final Provider<Context> f63576a;

    /* renamed from: b */
    public final Provider<C13783a> f63577b;

    /* renamed from: c */
    public final Provider<C13814a> f63578c;

    public C26009e(Provider<Context> provider, Provider<C13783a> provider2, Provider<C13814a> provider3) {
        this.f63576a = provider;
        this.f63577b = provider2;
        this.f63578c = provider3;
    }

    /* renamed from: a */
    public static C26009e m111339a(Provider<Context> provider, Provider<C13783a> provider2, Provider<C13814a> provider3) {
        return new C26009e(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C26007d m111340c(Context context, C13783a aVar, C13814a aVar2) {
        return new C26007d(context, aVar, aVar2);
    }

    /* renamed from: b */
    public C26007d get() {
        return m111340c(this.f63576a.get(), this.f63577b.get(), this.f63578c.get());
    }
}
