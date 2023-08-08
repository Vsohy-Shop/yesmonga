package com.carrefour.fid.android.presentation.viewmodels.privacy;

import com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.rgpd.airship.AirshipSettings;
import com.carrefour.fid.android.various.core.C22752a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.privacy.b */
public final class C27170b implements C10324h<C27169a> {

    /* renamed from: a */
    public final Provider<C22752a> f66061a;

    /* renamed from: b */
    public final Provider<FirebaseAnalyticsDispatcher> f66062b;

    /* renamed from: c */
    public final Provider<C13814a> f66063c;

    /* renamed from: d */
    public final Provider<AirshipSettings> f66064d;

    public C27170b(Provider<C22752a> provider, Provider<FirebaseAnalyticsDispatcher> provider2, Provider<C13814a> provider3, Provider<AirshipSettings> provider4) {
        this.f66061a = provider;
        this.f66062b = provider2;
        this.f66063c = provider3;
        this.f66064d = provider4;
    }

    /* renamed from: a */
    public static C27170b m114759a(Provider<C22752a> provider, Provider<FirebaseAnalyticsDispatcher> provider2, Provider<C13814a> provider3, Provider<AirshipSettings> provider4) {
        return new C27170b(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static C27169a m114760c(C22752a aVar, FirebaseAnalyticsDispatcher firebaseAnalyticsDispatcher, C13814a aVar2, AirshipSettings airshipSettings) {
        return new C27169a(aVar, firebaseAnalyticsDispatcher, aVar2, airshipSettings);
    }

    /* renamed from: b */
    public C27169a get() {
        return m114760c(this.f66061a.get(), this.f66062b.get(), this.f66063c.get(), this.f66064d.get());
    }
}
