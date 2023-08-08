package com.carrefour.fid.android.various.domain.interactor;

import android.content.Context;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.various.domain.interactor.e */
public final class C22783e implements C10324h<ThirdPartyCheckUsabillaConsentUseCase> {

    /* renamed from: a */
    public final Provider<Context> f58342a;

    /* renamed from: b */
    public final Provider<BaseAppPreferencesStorage> f58343b;

    public C22783e(Provider<Context> provider, Provider<BaseAppPreferencesStorage> provider2) {
        this.f58342a = provider;
        this.f58343b = provider2;
    }

    /* renamed from: a */
    public static C22783e m103018a(Provider<Context> provider, Provider<BaseAppPreferencesStorage> provider2) {
        return new C22783e(provider, provider2);
    }

    /* renamed from: c */
    public static ThirdPartyCheckUsabillaConsentUseCase m103019c(Context context, BaseAppPreferencesStorage baseAppPreferencesStorage) {
        return new ThirdPartyCheckUsabillaConsentUseCase(context, baseAppPreferencesStorage);
    }

    /* renamed from: b */
    public ThirdPartyCheckUsabillaConsentUseCase get() {
        return m103019c(this.f58342a.get(), this.f58343b.get());
    }
}
