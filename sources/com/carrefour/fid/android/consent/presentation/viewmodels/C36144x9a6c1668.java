package com.carrefour.fid.android.consent.presentation.viewmodels;

import com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel_HiltModules;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;

@C10321e
@C10337q({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
@C10338r
/* renamed from: com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel_HiltModules_KeyModule_ProvideFactory */
public final class C36144x9a6c1668 implements C10324h<String> {

    /* renamed from: com.carrefour.fid.android.consent.presentation.viewmodels.ConfigureConsentOptinsViewModel_HiltModules_KeyModule_ProvideFactory$InstanceHolder */
    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final C36144x9a6c1668 INSTANCE = new C36144x9a6c1668();

        private InstanceHolder() {
        }
    }

    public static C36144x9a6c1668 create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) C10335o.m38554f(ConfigureConsentOptinsViewModel_HiltModules.KeyModule.provide());
    }

    public String get() {
        return provide();
    }
}
