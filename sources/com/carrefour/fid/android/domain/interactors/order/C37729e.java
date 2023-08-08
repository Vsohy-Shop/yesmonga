package com.carrefour.fid.android.domain.interactors.order;

import android.content.Context;
import com.carrefour.fid.android.data.repositories.OrderOfflineDownloadRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.order.e */
public final class C37729e implements C10324h<DownloadOrderBillAndBankReceiptOfflineUseCase> {

    /* renamed from: a */
    public final Provider<OrderOfflineDownloadRepository> f94711a;

    /* renamed from: b */
    public final Provider<Context> f94712b;

    public C37729e(Provider<OrderOfflineDownloadRepository> provider, Provider<Context> provider2) {
        this.f94711a = provider;
        this.f94712b = provider2;
    }

    /* renamed from: a */
    public static C37729e m154661a(Provider<OrderOfflineDownloadRepository> provider, Provider<Context> provider2) {
        return new C37729e(provider, provider2);
    }

    /* renamed from: c */
    public static DownloadOrderBillAndBankReceiptOfflineUseCase m154662c(OrderOfflineDownloadRepository orderOfflineDownloadRepository, Context context) {
        return new DownloadOrderBillAndBankReceiptOfflineUseCase(orderOfflineDownloadRepository, context);
    }

    /* renamed from: b */
    public DownloadOrderBillAndBankReceiptOfflineUseCase get() {
        return m154662c(this.f94711a.get(), this.f94712b.get());
    }
}
