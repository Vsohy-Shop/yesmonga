package com.carrefour.fid.android.loyalty.core.interceptors;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
public final class MidFidErrorInterceptor_Factory implements C10324h<MidFidErrorInterceptor> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final MidFidErrorInterceptor_Factory INSTANCE = new MidFidErrorInterceptor_Factory();

        private InstanceHolder() {
        }
    }

    public static MidFidErrorInterceptor_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MidFidErrorInterceptor newInstance() {
        return new MidFidErrorInterceptor();
    }

    public MidFidErrorInterceptor get() {
        return newInstance();
    }
}
