package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$4$1 */
public final class NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$4$1 extends Lambda implements C11304p<Product, Integer, C11079d2> {
    final /* synthetic */ C11300l<C23520c, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$CheckoutBasketDetailsScreen$4$1(C11300l<? super C23520c, C11079d2> lVar) {
        super(2);
        this.$actioner = lVar;
    }

    /* renamed from: a */
    public final void mo68871a(@C12579k Product product, int i) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.$actioner.invoke(new C23520c.C23533f.C23536c(product, i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo68871a((Product) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }
}
