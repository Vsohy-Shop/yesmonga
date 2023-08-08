package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.C26144b;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$5$1 */
public final class NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$5$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C8578k2<C26144b> $stateFlow;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$5$1(C8578k2<C26144b> k2Var) {
        super(0);
        this.$stateFlow = k2Var;
    }

    @C12579k
    public final Boolean invoke() {
        return Boolean.valueOf(this.$stateFlow.getValue().mo75964e() instanceof C28892e.C28895c);
    }
}
