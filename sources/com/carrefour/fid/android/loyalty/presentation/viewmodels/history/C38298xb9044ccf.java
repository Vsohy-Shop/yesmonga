package com.carrefour.fid.android.loyalty.presentation.viewmodels.history;

import com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel_HiltModules;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;

@C10321e
@C10337q({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
@C10338r
/* renamed from: com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel_HiltModules_KeyModule_ProvideFactory */
public final class C38298xb9044ccf implements C10324h<String> {

    /* renamed from: com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel_HiltModules_KeyModule_ProvideFactory$InstanceHolder */
    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final C38298xb9044ccf INSTANCE = new C38298xb9044ccf();

        private InstanceHolder() {
        }
    }

    public static C38298xb9044ccf create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) C10335o.m38554f(LoyaltyAmountHistoryViewModel_HiltModules.KeyModule.provide());
    }

    public String get() {
        return provide();
    }
}
