package com.carrefour.fid.android.various.presentation.viewmodels.notification;

import com.carrefour.fid.android.various.domain.interactor.GetAppMessageUseCase;
import com.carrefour.fid.android.various.domain.interactor.MarkAppMessageAsReadUseCase;
import com.carrefour.fid.android.various.presentation.analytics.notification.C22799a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.various.presentation.viewmodels.notification.a */
public final class C22816a implements C10324h<AppMessageViewModel> {

    /* renamed from: a */
    public final Provider<C22799a> f58385a;

    /* renamed from: b */
    public final Provider<GetAppMessageUseCase> f58386b;

    /* renamed from: c */
    public final Provider<MarkAppMessageAsReadUseCase> f58387c;

    public C22816a(Provider<C22799a> provider, Provider<GetAppMessageUseCase> provider2, Provider<MarkAppMessageAsReadUseCase> provider3) {
        this.f58385a = provider;
        this.f58386b = provider2;
        this.f58387c = provider3;
    }

    /* renamed from: a */
    public static C22816a m103079a(Provider<C22799a> provider, Provider<GetAppMessageUseCase> provider2, Provider<MarkAppMessageAsReadUseCase> provider3) {
        return new C22816a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static AppMessageViewModel m103080c(C22799a aVar, GetAppMessageUseCase getAppMessageUseCase, MarkAppMessageAsReadUseCase markAppMessageAsReadUseCase) {
        return new AppMessageViewModel(aVar, getAppMessageUseCase, markAppMessageAsReadUseCase);
    }

    /* renamed from: b */
    public AppMessageViewModel get() {
        return m103080c(this.f58385a.get(), this.f58386b.get(), this.f58387c.get());
    }
}
