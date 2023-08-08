package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionFragment_MembersInjector */
public final class DeliveryServiceSelectionFragment_MembersInjector implements C10158g<DeliveryServiceSelectionFragment> {
    private final Provider<C28936j> fragmentUtilProvider;
    private final Provider<C28796c> navigatorProvider;

    public DeliveryServiceSelectionFragment_MembersInjector(Provider<C28796c> provider, Provider<C28936j> provider2) {
        this.navigatorProvider = provider;
        this.fragmentUtilProvider = provider2;
    }

    public static C10158g<DeliveryServiceSelectionFragment> create(Provider<C28796c> provider, Provider<C28936j> provider2) {
        return new DeliveryServiceSelectionFragment_MembersInjector(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionFragment.fragmentUtil")
    public static void injectFragmentUtil(DeliveryServiceSelectionFragment deliveryServiceSelectionFragment, C28936j jVar) {
        deliveryServiceSelectionFragment.fragmentUtil = jVar;
    }

    @C10326j("com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionFragment.navigator")
    public static void injectNavigator(DeliveryServiceSelectionFragment deliveryServiceSelectionFragment, C28796c cVar) {
        deliveryServiceSelectionFragment.navigator = cVar;
    }

    public void injectMembers(DeliveryServiceSelectionFragment deliveryServiceSelectionFragment) {
        injectNavigator(deliveryServiceSelectionFragment, this.navigatorProvider.get());
        injectFragmentUtil(deliveryServiceSelectionFragment, this.fragmentUtilProvider.get());
    }
}
