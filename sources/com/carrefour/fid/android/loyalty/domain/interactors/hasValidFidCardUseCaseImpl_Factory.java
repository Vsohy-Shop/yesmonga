package com.carrefour.fid.android.loyalty.domain.interactors;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;

@C10321e
@C10337q
@C10338r
public final class hasValidFidCardUseCaseImpl_Factory implements C10324h<hasValidFidCardUseCaseImpl> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final hasValidFidCardUseCaseImpl_Factory INSTANCE = new hasValidFidCardUseCaseImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static hasValidFidCardUseCaseImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static hasValidFidCardUseCaseImpl newInstance() {
        return new hasValidFidCardUseCaseImpl();
    }

    public hasValidFidCardUseCaseImpl get() {
        return newInstance();
    }
}
