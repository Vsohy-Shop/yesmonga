package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.CategoryModel;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.analytics.C23516a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel;
import java.util.HashMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$7 */
public final class NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$7 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C23516a $analytics;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11300l<String, C11079d2> $onDisplayError;
    final /* synthetic */ C11304p<String, HashMap<String, CategoryModel>, C11079d2> $onNavigateToCheckoutStep2;
    final /* synthetic */ C38326b $performance;
    final /* synthetic */ NonFoodCheckout1ViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$7(NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel, C23516a aVar, C38326b bVar, C11289a<C11079d2> aVar2, C11300l<? super String, C11079d2> lVar, C11304p<? super String, ? super HashMap<String, CategoryModel>, C11079d2> pVar, int i, int i2) {
        super(2);
        this.$viewModel = nonFoodCheckout1ViewModel;
        this.$analytics = aVar;
        this.$performance = bVar;
        this.$onBackPressed = aVar2;
        this.$onDisplayError = lVar;
        this.$onNavigateToCheckoutStep2 = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        NonFoodCheckoutStep1StatefulKt.m104667c(this.$viewModel, this.$analytics, this.$performance, this.$onBackPressed, this.$onDisplayError, this.$onNavigateToCheckoutStep2, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
