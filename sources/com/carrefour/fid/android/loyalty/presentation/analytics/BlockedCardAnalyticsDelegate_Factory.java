package com.carrefour.fid.android.loyalty.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class BlockedCardAnalyticsDelegate_Factory implements C10324h<BlockedCardAnalyticsDelegate> {
    private final Provider<C13783a> analyticManagerProvider;

    public BlockedCardAnalyticsDelegate_Factory(Provider<C13783a> provider) {
        this.analyticManagerProvider = provider;
    }

    public static BlockedCardAnalyticsDelegate_Factory create(Provider<C13783a> provider) {
        return new BlockedCardAnalyticsDelegate_Factory(provider);
    }

    public static BlockedCardAnalyticsDelegate newInstance(C13783a aVar) {
        return new BlockedCardAnalyticsDelegate(aVar);
    }

    public BlockedCardAnalyticsDelegate get() {
        return newInstance(this.analyticManagerProvider.get());
    }
}
