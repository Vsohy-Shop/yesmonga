package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import android.content.res.Resources;
import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.product.presentation.analytics.C27631a;
import com.carrefour.fid.android.product.presentation.mapper.PlpItemDataToProductCardSMapperKt;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.C27728a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$ProductCardSAndroidView$2 */
public final class C27716x4ab45fa2 extends Lambda implements C11300l<ProductCardSComponent, C11079d2> {
    final /* synthetic */ C11300l<C27728a, C11079d2> $actioner;
    final /* synthetic */ C27631a $analytics;
    final /* synthetic */ C38114b $initialProduct;
    final /* synthetic */ C38114b $plpItemData;
    final /* synthetic */ int $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27716x4ab45fa2(C38114b bVar, C27631a aVar, C38114b bVar2, int i, C11300l<? super C27728a, C11079d2> lVar) {
        super(1);
        this.$plpItemData = bVar;
        this.$analytics = aVar;
        this.$initialProduct = bVar2;
        this.$position = i;
        this.$actioner = lVar;
    }

    /* renamed from: a */
    public final void mo80481a(@C12579k ProductCardSComponent productCardSComponent) {
        ProductCardSComponent productCardSComponent2 = productCardSComponent;
        Intrinsics.checkNotNullParameter(productCardSComponent2, "productCardSComponent");
        Resources resources = productCardSComponent.getResources();
        C38114b bVar = this.$plpItemData;
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        final C27631a aVar = this.$analytics;
        final C38114b bVar2 = this.$initialProduct;
        final C38114b bVar3 = this.$plpItemData;
        final int i = this.$position;
        final C11300l<C27728a, C11079d2> lVar = this.$actioner;
        C277171 r5 = new C11300l<C37133a, C11079d2>() {
            /* renamed from: a */
            public final void mo80482a(@C12579k C37133a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "it");
                AlternativeProductsBottomSheetStatefulKt.m116519v(aVar, bVar2, bVar3, i, lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo80482a((C37133a) obj);
                return C11079d2.f28267a;
            }
        };
        final C11300l<C27728a, C11079d2> lVar2 = this.$actioner;
        final C38114b bVar4 = this.$plpItemData;
        productCardSComponent2.mo113691E(PlpItemDataToProductCardSMapperKt.m116272c(bVar, resources, r5, (C11300l) null, new C11300l<C37133a, C11079d2>() {
            /* renamed from: a */
            public final void mo80483a(@C12579k C37133a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "it");
                lVar2.invoke(new C27728a.C27730b(bVar4.mo118842j(), bVar4.mo118846n()));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo80483a((C37133a) obj);
                return C11079d2.f28267a;
            }
        }, (C11289a) null, (C11289a) null, (C11289a) null, (C11289a) null, false, false, false, true, (C11289a) null, 6132, (Object) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo80481a((ProductCardSComponent) obj);
        return C11079d2.f28267a;
    }
}
