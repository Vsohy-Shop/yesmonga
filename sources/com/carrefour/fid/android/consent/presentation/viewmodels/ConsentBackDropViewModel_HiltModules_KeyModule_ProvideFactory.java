package com.carrefour.fid.android.consent.presentation.viewmodels;

import com.carrefour.fid.android.consent.presentation.viewmodels.ConsentBackDropViewModel_HiltModules;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;

@C10321e
@C10337q({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
@C10338r
public final class ConsentBackDropViewModel_HiltModules_KeyModule_ProvideFactory implements C10324h<String> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ConsentBackDropViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ConsentBackDropViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static ConsentBackDropViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) C10335o.m38554f(ConsentBackDropViewModel_HiltModules.KeyModule.provide());
    }

    public String get() {
        return provide();
    }
}
