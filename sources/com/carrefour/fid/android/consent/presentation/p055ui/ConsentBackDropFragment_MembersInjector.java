package com.carrefour.fid.android.consent.presentation.p055ui;

import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.consent.presentation.ui.ConsentBackDropFragment_MembersInjector */
public final class ConsentBackDropFragment_MembersInjector implements C10158g<ConsentBackDropFragment> {
    private final Provider<C28796c> navigatorProvider;

    public ConsentBackDropFragment_MembersInjector(Provider<C28796c> provider) {
        this.navigatorProvider = provider;
    }

    public static C10158g<ConsentBackDropFragment> create(Provider<C28796c> provider) {
        return new ConsentBackDropFragment_MembersInjector(provider);
    }

    @C10326j("com.carrefour.fid.android.consent.presentation.ui.ConsentBackDropFragment.navigator")
    public static void injectNavigator(ConsentBackDropFragment consentBackDropFragment, C28796c cVar) {
        consentBackDropFragment.navigator = cVar;
    }

    public void injectMembers(ConsentBackDropFragment consentBackDropFragment) {
        injectNavigator(consentBackDropFragment, this.navigatorProvider.get());
    }
}
