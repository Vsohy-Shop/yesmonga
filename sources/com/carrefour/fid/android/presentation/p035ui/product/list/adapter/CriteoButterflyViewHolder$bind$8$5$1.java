package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import android.content.res.Resources;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent;
import com.carrefour.fid.android.presentation.models.CriteoButterFlyModel;
import com.carrefour.fid.android.presentation.models.CriteoProductModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.mapper.C38510j;
import com.carrefour.fid.android.presentation.p035ui.models.C24646a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "a", "(I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nOfferListViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferListViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/product/list/adapter/CriteoButterflyViewHolder$bind$8$5$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,619:1\n1#2:620\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.CriteoButterflyViewHolder$bind$8$5$1 */
public final class CriteoButterflyViewHolder$bind$8$5$1 extends Lambda implements C11300l<Integer, C11079d2> {
    final /* synthetic */ C24646a.C24647a $baseCallbacks;
    final /* synthetic */ CriteoButterFlyModel $butterfly;
    final /* synthetic */ C24646a.C24648b $mixingCallbacks;
    final /* synthetic */ int $position;
    final /* synthetic */ CriteoButterflyViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoButterflyViewHolder$bind$8$5$1(CriteoButterFlyModel criteoButterFlyModel, CriteoButterflyViewHolder criteoButterflyViewHolder, C24646a.C24648b bVar, C24646a.C24647a aVar, int i) {
        super(1);
        this.$butterfly = criteoButterFlyModel;
        this.this$0 = criteoButterflyViewHolder;
        this.$mixingCallbacks = bVar;
        this.$baseCallbacks = aVar;
        this.$position = i;
    }

    /* renamed from: a */
    public final void mo74153a(int i) {
        CriteoButterflyViewHolder$bind$8$5$1$1$5$1 criteoButterflyViewHolder$bind$8$5$1$1$5$1;
        CriteoButterflyViewHolder$bind$8$5$1$1$6$1 criteoButterflyViewHolder$bind$8$5$1$1$6$1;
        int i2 = i;
        this.$butterfly.mo121470i(i2);
        this.this$0.f62624e.invoke(this.$butterfly);
        CriteoProductModel criteoProductModel = this.$butterfly.mo121461a().get(i2);
        CriteoButterflyViewHolder criteoButterflyViewHolder = this.this$0;
        CriteoButterFlyModel criteoButterFlyModel = this.$butterfly;
        C24646a.C24648b bVar = this.$mixingCallbacks;
        C24646a.C24647a aVar = this.$baseCallbacks;
        int i3 = this.$position;
        CriteoProductModel criteoProductModel2 = criteoProductModel;
        ProductCardSComponent productCardSComponent = criteoButterflyViewHolder.f62621b.f90960d;
        OfferProductModel offerProductModel = criteoButterFlyModel.mo121461a().get(criteoButterFlyModel.mo121467f());
        Resources resources = criteoButterflyViewHolder.f62621b.getRoot().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "binding.root.resources");
        CriteoButterflyViewHolder$bind$8$5$1$1$1 criteoButterflyViewHolder$bind$8$5$1$1$1 = new CriteoButterflyViewHolder$bind$8$5$1$1$1(aVar, criteoProductModel2, i3);
        CriteoButterflyViewHolder$bind$8$5$1$1$2 criteoButterflyViewHolder$bind$8$5$1$1$2 = new CriteoButterflyViewHolder$bind$8$5$1$1$2(aVar, criteoProductModel2, i3);
        CriteoButterflyViewHolder$bind$8$5$1$1$3 criteoButterflyViewHolder$bind$8$5$1$1$3 = new CriteoButterflyViewHolder$bind$8$5$1$1$3(aVar, criteoProductModel2, i3);
        CriteoButterflyViewHolder$bind$8$5$1$1$4 criteoButterflyViewHolder$bind$8$5$1$1$4 = new CriteoButterflyViewHolder$bind$8$5$1$1$4(aVar, criteoProductModel2, i3);
        CriteoButterflyViewHolder$bind$8$5$1$1$7$1 criteoButterflyViewHolder$bind$8$5$1$1$7$1 = null;
        if (bVar != null) {
            criteoButterflyViewHolder$bind$8$5$1$1$5$1 = new CriteoButterflyViewHolder$bind$8$5$1$1$5$1(bVar, criteoProductModel2);
        } else {
            criteoButterflyViewHolder$bind$8$5$1$1$5$1 = null;
        }
        if (bVar != null) {
            criteoButterflyViewHolder$bind$8$5$1$1$6$1 = new CriteoButterflyViewHolder$bind$8$5$1$1$6$1(bVar, criteoProductModel2);
        } else {
            criteoButterflyViewHolder$bind$8$5$1$1$6$1 = null;
        }
        if (bVar != null) {
            criteoButterflyViewHolder$bind$8$5$1$1$7$1 = new CriteoButterflyViewHolder$bind$8$5$1$1$7$1(bVar, criteoProductModel2);
        }
        productCardSComponent.mo113691E(C38510j.m159764b(offerProductModel, resources, criteoButterflyViewHolder$bind$8$5$1$1$1, criteoButterflyViewHolder$bind$8$5$1$1$2, criteoButterflyViewHolder$bind$8$5$1$1$3, criteoButterflyViewHolder$bind$8$5$1$1$4, criteoButterflyViewHolder$bind$8$5$1$1$5$1, criteoButterflyViewHolder$bind$8$5$1$1$6$1, criteoButterflyViewHolder$bind$8$5$1$1$7$1, false, false, false, false, (C11289a) null, 7680, (Object) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74153a(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}
