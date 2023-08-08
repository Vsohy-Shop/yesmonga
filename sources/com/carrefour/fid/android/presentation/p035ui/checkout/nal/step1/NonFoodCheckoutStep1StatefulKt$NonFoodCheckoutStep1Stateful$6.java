package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.domain.interactors.basket.C37562d;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.analytics.C23516a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.C26144b;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel;
import com.carrefour.fid.android.shared.type.C28897f;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$6 */
public final class NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$6 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C23516a $analytics;
    final /* synthetic */ C8578k2<C26144b> $stateFlow;
    final /* synthetic */ NonFoodCheckout1ViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$6(C8578k2<C26144b> k2Var, NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel, C23516a aVar) {
        super(0);
        this.$stateFlow = k2Var;
        this.$viewModel = nonFoodCheckout1ViewModel;
        this.$analytics = aVar;
    }

    @C12579k
    public final Boolean invoke() {
        boolean z;
        C37562d dVar = (C37562d) C28897f.m119478b(this.$stateFlow.getValue().mo75964e());
        if (dVar != null) {
            BasketType N = dVar.mo114366g().mo116829N();
            if (N == null) {
                N = BasketType.NONE;
            }
            boolean q0 = this.$viewModel.mo75943q0();
            this.$analytics.mo68899b(q0, N, this.$viewModel.mo75946t0(), dVar.mo114366g().mo116830O(), C10978t.m41497a0(dVar.mo114370j().values()), dVar.mo114366g().mo116855w().mo116892u());
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
