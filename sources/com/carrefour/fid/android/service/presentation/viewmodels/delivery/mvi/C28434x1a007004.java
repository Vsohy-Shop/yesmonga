package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi;

import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel_HiltModules;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;

@C10321e
@C10337q({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
@C10338r
/* renamed from: com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel_HiltModules_KeyModule_ProvideFactory */
public final class C28434x1a007004 implements C10324h<String> {

    /* renamed from: com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel_HiltModules_KeyModule_ProvideFactory$InstanceHolder */
    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final C28434x1a007004 INSTANCE = new C28434x1a007004();

        private InstanceHolder() {
        }
    }

    public static C28434x1a007004 create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) C10335o.m38554f(DeliveryServiceSelectionViewModel_HiltModules.KeyModule.provide());
    }

    public String get() {
        return provide();
    }
}
