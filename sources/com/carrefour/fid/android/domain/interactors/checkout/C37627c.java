package com.carrefour.fid.android.domain.interactors.checkout;

import com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway;
import com.carrefour.fid.android.data.entities.mapper.C36459a1;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.checkout.c */
public final class C37627c implements C10324h<NonFoodValidatePaymentUseCase> {

    /* renamed from: a */
    public final Provider<NonFoodPaymentGateway> f94410a;

    /* renamed from: b */
    public final Provider<C36459a1> f94411b;

    public C37627c(Provider<NonFoodPaymentGateway> provider, Provider<C36459a1> provider2) {
        this.f94410a = provider;
        this.f94411b = provider2;
    }

    /* renamed from: a */
    public static C37627c m154249a(Provider<NonFoodPaymentGateway> provider, Provider<C36459a1> provider2) {
        return new C37627c(provider, provider2);
    }

    /* renamed from: c */
    public static NonFoodValidatePaymentUseCase m154250c(NonFoodPaymentGateway nonFoodPaymentGateway, C36459a1 a1Var) {
        return new NonFoodValidatePaymentUseCase(nonFoodPaymentGateway, a1Var);
    }

    /* renamed from: b */
    public NonFoodValidatePaymentUseCase get() {
        return m154250c(this.f94410a.get(), this.f94411b.get());
    }
}
