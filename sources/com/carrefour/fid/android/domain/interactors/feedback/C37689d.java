package com.carrefour.fid.android.domain.interactors.feedback;

import com.carrefour.fid.android.data.repositories.OrderFeedbackRepository;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.feedback.d */
public final class C37689d implements C10324h<OrderFeedbackUseCase> {

    /* renamed from: a */
    public final Provider<OrderFeedbackRepository> f94547a;

    /* renamed from: b */
    public final Provider<C37823k> f94548b;

    public C37689d(Provider<OrderFeedbackRepository> provider, Provider<C37823k> provider2) {
        this.f94547a = provider;
        this.f94548b = provider2;
    }

    /* renamed from: a */
    public static C37689d m154462a(Provider<OrderFeedbackRepository> provider, Provider<C37823k> provider2) {
        return new C37689d(provider, provider2);
    }

    /* renamed from: c */
    public static OrderFeedbackUseCase m154463c(OrderFeedbackRepository orderFeedbackRepository, C37823k kVar) {
        return new OrderFeedbackUseCase(orderFeedbackRepository, kVar);
    }

    /* renamed from: b */
    public OrderFeedbackUseCase get() {
        return m154463c(this.f94547a.get(), this.f94548b.get());
    }
}
