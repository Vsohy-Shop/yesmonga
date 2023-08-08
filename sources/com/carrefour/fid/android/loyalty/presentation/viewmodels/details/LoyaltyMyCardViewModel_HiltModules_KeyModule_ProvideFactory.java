package com.carrefour.fid.android.loyalty.presentation.viewmodels.details;

import com.carrefour.fid.android.loyalty.presentation.viewmodels.details.LoyaltyMyCardViewModel_HiltModules;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;

@C10321e
@C10337q({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
@C10338r
public final class LoyaltyMyCardViewModel_HiltModules_KeyModule_ProvideFactory implements C10324h<String> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final LoyaltyMyCardViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LoyaltyMyCardViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static LoyaltyMyCardViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) C10335o.m38554f(LoyaltyMyCardViewModel_HiltModules.KeyModule.provide());
    }

    public String get() {
        return provide();
    }
}
