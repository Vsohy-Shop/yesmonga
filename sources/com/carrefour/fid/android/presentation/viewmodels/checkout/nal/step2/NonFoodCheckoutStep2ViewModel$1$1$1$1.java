package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/basket/Basket;", "b", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/state/b$c;", "a", "(Lcom/carrefour/fid/android/domain/models/basket/Basket;)Lcom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/state/b$c;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NonFoodCheckoutStep2ViewModel$1$1$1$1 extends Lambda implements C11300l<Basket, C26191b.C26194c> {

    /* renamed from: f */
    public static final NonFoodCheckoutStep2ViewModel$1$1$1$1 f63986f = new NonFoodCheckoutStep2ViewModel$1$1$1$1();

    public NonFoodCheckoutStep2ViewModel$1$1$1$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final C26191b.C26194c invoke(@C12579k Basket basket) {
        Intrinsics.checkNotNullParameter(basket, "b");
        return new C26191b.C26194c(basket.mo116855w(), basket.mo116820E(), basket.mo116819D());
    }
}
