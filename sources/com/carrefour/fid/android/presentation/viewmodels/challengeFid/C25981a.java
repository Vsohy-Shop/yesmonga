package com.carrefour.fid.android.presentation.viewmodels.challengeFid;

import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.presentation.analytics.C38360b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.challengeFid.a */
public final class C25981a implements C10324h<ChallengeFidViewModel> {

    /* renamed from: a */
    public final Provider<LoyaltyPreferencesStorage> f63508a;

    /* renamed from: b */
    public final Provider<C38360b> f63509b;

    public C25981a(Provider<LoyaltyPreferencesStorage> provider, Provider<C38360b> provider2) {
        this.f63508a = provider;
        this.f63509b = provider2;
    }

    /* renamed from: a */
    public static C25981a m111180a(Provider<LoyaltyPreferencesStorage> provider, Provider<C38360b> provider2) {
        return new C25981a(provider, provider2);
    }

    /* renamed from: c */
    public static ChallengeFidViewModel m111181c(LoyaltyPreferencesStorage loyaltyPreferencesStorage, C38360b bVar) {
        return new ChallengeFidViewModel(loyaltyPreferencesStorage, bVar);
    }

    /* renamed from: b */
    public ChallengeFidViewModel get() {
        return m111181c(this.f63508a.get(), this.f63509b.get());
    }
}
