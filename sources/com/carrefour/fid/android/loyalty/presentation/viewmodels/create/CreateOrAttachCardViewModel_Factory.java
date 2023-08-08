package com.carrefour.fid.android.loyalty.presentation.viewmodels.create;

import com.carrefour.fid.android.loyalty.presentation.analytics.CreateCardAnalyticsDelegate;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class CreateOrAttachCardViewModel_Factory implements C10324h<CreateOrAttachCardViewModel> {
    private final Provider<CreateCardAnalyticsDelegate> analyticsProvider;

    public CreateOrAttachCardViewModel_Factory(Provider<CreateCardAnalyticsDelegate> provider) {
        this.analyticsProvider = provider;
    }

    public static CreateOrAttachCardViewModel_Factory create(Provider<CreateCardAnalyticsDelegate> provider) {
        return new CreateOrAttachCardViewModel_Factory(provider);
    }

    public static CreateOrAttachCardViewModel newInstance(CreateCardAnalyticsDelegate createCardAnalyticsDelegate) {
        return new CreateOrAttachCardViewModel(createCardAnalyticsDelegate);
    }

    public CreateOrAttachCardViewModel get() {
        return newInstance(this.analyticsProvider.get());
    }
}
