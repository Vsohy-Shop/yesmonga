package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.component;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.C8553b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nItemBasket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemBasket.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/component/ItemBasketKt$OffersRow$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,220:1\n136#2,12:221\n*S KotlinDebug\n*F\n+ 1 ItemBasket.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/component/ItemBasketKt$OffersRow$1\n*L\n165#1:221,12\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasketKt$OffersRow$1 */
public final class ItemBasketKt$OffersRow$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ List<String> $picturePaths;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemBasketKt$OffersRow$1(List<String> list) {
        super(1);
        this.$picturePaths = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        List<String> list = this.$picturePaths;
        C234681 r1 = C234681.f59337f;
        lazyListScope.mo8310k(list.size(), r1 != null ? new ItemBasketKt$OffersRow$1$invoke$$inlined$items$default$2(r1, list) : null, new ItemBasketKt$OffersRow$1$invoke$$inlined$items$default$3(ItemBasketKt$OffersRow$1$invoke$$inlined$items$default$1.f59336f, list), C8553b.m31049c(-632812321, true, new ItemBasketKt$OffersRow$1$invoke$$inlined$items$default$4(list)));
    }
}
