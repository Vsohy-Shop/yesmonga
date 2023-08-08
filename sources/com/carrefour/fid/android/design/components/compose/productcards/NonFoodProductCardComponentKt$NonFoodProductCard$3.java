package com.carrefour.fid.android.design.components.compose.productcards;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NonFoodProductCardComponentKt$NonFoodProductCard$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $currentQuantity;
    final /* synthetic */ boolean $isFrenchProduct;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ String $name;
    final /* synthetic */ C11289a<C11079d2> $onCardClick;
    final /* synthetic */ C11289a<C11079d2> $onQuantityClicked;
    final /* synthetic */ C11289a<C11079d2> $onRemoveClicked;
    final /* synthetic */ String $packaging;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $price;
    final /* synthetic */ String $productUrl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductCardComponentKt$NonFoodProductCard$3(C8767m mVar, String str, String str2, String str3, int i, boolean z, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, int i2, int i3, int i4) {
        super(2);
        this.$modifier = mVar;
        this.$productUrl = str;
        this.$name = str2;
        this.$packaging = str3;
        this.$currentQuantity = i;
        this.$isFrenchProduct = z;
        this.$price = pVar;
        this.$label = pVar2;
        this.$onRemoveClicked = aVar;
        this.$onCardClick = aVar2;
        this.$onQuantityClicked = aVar3;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        NonFoodProductCardComponentKt.m151922a(this.$modifier, this.$productUrl, this.$name, this.$packaging, this.$currentQuantity, this.$isFrenchProduct, this.$price, this.$label, this.$onRemoveClicked, this.$onCardClick, this.$onQuantityClicked, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
