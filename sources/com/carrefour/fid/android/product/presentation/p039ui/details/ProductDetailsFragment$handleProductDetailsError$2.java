package com.carrefour.fid.android.product.presentation.p039ui.details;

import android.os.Bundle;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28135b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/os/Bundle;", "it", "Lkotlin/d2;", "a", "(Landroid/os/Bundle;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsFragment$handleProductDetailsError$2 */
public final class ProductDetailsFragment$handleProductDetailsError$2 extends Lambda implements C11300l<Bundle, C11079d2> {
    final /* synthetic */ ProductDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDetailsFragment$handleProductDetailsError$2(ProductDetailsFragment productDetailsFragment) {
        super(1);
        this.this$0 = productDetailsFragment;
    }

    /* renamed from: a */
    public final void mo80607a(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "it");
        OfferIdentifier g = this.this$0.mo80571g1().mo80763g();
        if (g != null) {
            this.this$0.mo80579m1().sendIntent(new C28135b.C28151c.C28155d(g, true));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo80607a((Bundle) obj);
        return C11079d2.f28267a;
    }
}
