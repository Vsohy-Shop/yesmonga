package com.carrefour.fid.android.consent.presentation.p055ui;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.consent.presentation.ui.ConfigureConsentOptinsFragment_MembersInjector */
public final class ConfigureConsentOptinsFragment_MembersInjector implements C10158g<ConfigureConsentOptinsFragment> {
    private final Provider<C28936j> fragmentUtilProvider;

    public ConfigureConsentOptinsFragment_MembersInjector(Provider<C28936j> provider) {
        this.fragmentUtilProvider = provider;
    }

    public static C10158g<ConfigureConsentOptinsFragment> create(Provider<C28936j> provider) {
        return new ConfigureConsentOptinsFragment_MembersInjector(provider);
    }

    @C10326j("com.carrefour.fid.android.consent.presentation.ui.ConfigureConsentOptinsFragment.fragmentUtil")
    public static void injectFragmentUtil(ConfigureConsentOptinsFragment configureConsentOptinsFragment, C28936j jVar) {
        configureConsentOptinsFragment.fragmentUtil = jVar;
    }

    public void injectMembers(ConfigureConsentOptinsFragment configureConsentOptinsFragment) {
        injectFragmentUtil(configureConsentOptinsFragment, this.fragmentUtilProvider.get());
    }
}
