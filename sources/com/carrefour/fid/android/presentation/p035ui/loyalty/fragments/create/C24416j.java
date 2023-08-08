package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.j */
public final class C24416j implements C10158g<CreateLoyaltyCardStepTwoFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f60893a;

    public C24416j(Provider<C28796c> provider) {
        this.f60893a = provider;
    }

    /* renamed from: a */
    public static C10158g<CreateLoyaltyCardStepTwoFragment> m107165a(Provider<C28796c> provider) {
        return new C24416j(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment.navigator")
    /* renamed from: c */
    public static void m107166c(CreateLoyaltyCardStepTwoFragment createLoyaltyCardStepTwoFragment, C28796c cVar) {
        createLoyaltyCardStepTwoFragment.f60779v = cVar;
    }

    /* renamed from: b */
    public void injectMembers(CreateLoyaltyCardStepTwoFragment createLoyaltyCardStepTwoFragment) {
        m107166c(createLoyaltyCardStepTwoFragment, this.f60893a.get());
    }
}
