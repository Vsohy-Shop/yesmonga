package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.domain.models.basket.Basket;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCheckoutBasketsListStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutBasketsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/CheckoutBasketsListStatefulKt$CheckoutBasketsList$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,187:1\n136#2,12:188\n*S KotlinDebug\n*F\n+ 1 CheckoutBasketsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/CheckoutBasketsListStatefulKt$CheckoutBasketsList$1\n*L\n151#1:188,12\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsList$1 */
public final class CheckoutBasketsListStatefulKt$CheckoutBasketsList$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ C11300l<C23460b, C11079d2> $actioner;
    final /* synthetic */ List<Basket> $baskets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutBasketsListStatefulKt$CheckoutBasketsList$1(List<Basket> list, C11300l<? super C23460b, C11079d2> lVar) {
        super(1);
        this.$baskets = list;
        this.$actioner = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        List<Basket> list = this.$baskets;
        C11300l<C23460b, C11079d2> lVar = this.$actioner;
        lazyListScope.mo8310k(list.size(), (C11300l<? super Integer, ? extends Object>) null, new C23452x1345a0ff(C23450x1345a0fd.f59308f, list), C8553b.m31049c(-632812321, true, new C23453x1345a100(list, lVar)));
    }
}
