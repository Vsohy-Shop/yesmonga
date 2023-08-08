package com.carrefour.fid.android.presentation.viewmodels.order.offline;

import com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper.C24782a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.c */
public final class C26683c implements C10324h<OrderOfflineDetailViewModel> {

    /* renamed from: a */
    public final Provider<GetOrderOfflineDetailUseCase> f65137a;

    /* renamed from: b */
    public final Provider<C37807b> f65138b;

    /* renamed from: c */
    public final Provider<DownloadOrderBillAndBankReceiptOfflineUseCase> f65139c;

    /* renamed from: d */
    public final Provider<C24782a> f65140d;

    public C26683c(Provider<GetOrderOfflineDetailUseCase> provider, Provider<C37807b> provider2, Provider<DownloadOrderBillAndBankReceiptOfflineUseCase> provider3, Provider<C24782a> provider4) {
        this.f65137a = provider;
        this.f65138b = provider2;
        this.f65139c = provider3;
        this.f65140d = provider4;
    }

    /* renamed from: a */
    public static C26683c m113375a(Provider<GetOrderOfflineDetailUseCase> provider, Provider<C37807b> provider2, Provider<DownloadOrderBillAndBankReceiptOfflineUseCase> provider3, Provider<C24782a> provider4) {
        return new C26683c(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static OrderOfflineDetailViewModel m113376c(GetOrderOfflineDetailUseCase getOrderOfflineDetailUseCase, C37807b bVar, DownloadOrderBillAndBankReceiptOfflineUseCase downloadOrderBillAndBankReceiptOfflineUseCase, C24782a aVar) {
        return new OrderOfflineDetailViewModel(getOrderOfflineDetailUseCase, bVar, downloadOrderBillAndBankReceiptOfflineUseCase, aVar);
    }

    /* renamed from: b */
    public OrderOfflineDetailViewModel get() {
        return m113376c(this.f65137a.get(), this.f65138b.get(), this.f65139c.get(), this.f65140d.get());
    }
}
