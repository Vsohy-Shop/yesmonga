package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import android.os.Bundle;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderDepartmentViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/os/Bundle;", "it", "Lkotlin/d2;", "a", "(Landroid/os/Bundle;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderDepartmentFragment$handleAtcPressed$1 */
public final class BasketBuilderDepartmentFragment$handleAtcPressed$1 extends Lambda implements C11300l<Bundle, C11079d2> {
    final /* synthetic */ int $initialQuantity;
    final /* synthetic */ OfferProductModel $offer;
    final /* synthetic */ int $productPosition;
    final /* synthetic */ BasketBuilderDepartmentFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketBuilderDepartmentFragment$handleAtcPressed$1(BasketBuilderDepartmentFragment basketBuilderDepartmentFragment, OfferProductModel offerProductModel, int i, int i2) {
        super(1);
        this.this$0 = basketBuilderDepartmentFragment;
        this.$offer = offerProductModel;
        this.$initialQuantity = i;
        this.$productPosition = i2;
    }

    /* renamed from: a */
    public final void mo67943a(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "it");
        this.this$0.mo67919e1().sendIntent(BasketBuilderDepartmentViewModel.C25904b.C25911g.f63402b);
        int p0 = this.$offer.mo121519p0();
        int i = this.$initialQuantity;
        if (p0 > i) {
            this.this$0.mo67917c1().mo75365b(this.this$0.mo67915a1().mo121689Q(), this.$offer, p0 - this.$initialQuantity, this.$productPosition);
        } else if (p0 < i) {
            this.this$0.mo67917c1().mo75366c(this.this$0.mo67915a1().mo121689Q(), this.$offer, this.$initialQuantity - p0, this.$productPosition);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo67943a((Bundle) obj);
        return C11079d2.f28267a;
    }
}
