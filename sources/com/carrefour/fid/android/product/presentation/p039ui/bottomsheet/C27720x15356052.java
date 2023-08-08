package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.product.presentation.analytics.C27631a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$WithAlternativesScreen$2 */
public final class C27720x15356052 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C27728a, C11079d2> $actioner;
    final /* synthetic */ C27631a $analytics;
    final /* synthetic */ List<C38114b> $antiInflationProductList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27720x15356052(C27631a aVar, List<C38114b> list, C11300l<? super C27728a, C11079d2> lVar, int i) {
        super(2);
        this.$analytics = aVar;
        this.$antiInflationProductList = list;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AlternativeProductsBottomSheetStatefulKt.m116507j(this.$analytics, this.$antiInflationProductList, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
