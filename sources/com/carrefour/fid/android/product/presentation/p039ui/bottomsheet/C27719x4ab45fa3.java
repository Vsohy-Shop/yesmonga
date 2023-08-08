package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.product.presentation.analytics.C27631a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$ProductCardSAndroidView$3 */
public final class C27719x4ab45fa3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C27728a, C11079d2> $actioner;
    final /* synthetic */ C27631a $analytics;
    final /* synthetic */ C38114b $initialProduct;
    final /* synthetic */ C38114b $plpItemData;
    final /* synthetic */ int $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27719x4ab45fa3(C27631a aVar, C38114b bVar, C38114b bVar2, int i, C11300l<? super C27728a, C11079d2> lVar, int i2) {
        super(2);
        this.$analytics = aVar;
        this.$initialProduct = bVar;
        this.$plpItemData = bVar2;
        this.$position = i;
        this.$actioner = lVar;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AlternativeProductsBottomSheetStatefulKt.m116505h(this.$analytics, this.$initialProduct, this.$plpItemData, this.$position, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
