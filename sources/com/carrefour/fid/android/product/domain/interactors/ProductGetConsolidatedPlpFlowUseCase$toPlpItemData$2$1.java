package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/plp/c;", "plpProduct", "Lcom/carrefour/fid/android/domain/models/product/plp/b;", "a", "(Lcom/carrefour/fid/android/domain/models/product/plp/c;)Lcom/carrefour/fid/android/domain/models/product/plp/b;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$2$1 extends Lambda implements C11300l<C38115c, C38114b> {
    final /* synthetic */ boolean $isAntiInflationEnabled;
    final /* synthetic */ boolean $isPageEligibleAntiInflation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$2$1(boolean z, boolean z2) {
        super(1);
        this.$isAntiInflationEnabled = z;
        this.$isPageEligibleAntiInflation = z2;
    }

    @C12579k
    /* renamed from: a */
    public final C38114b invoke(@C12579k C38115c cVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(cVar, "plpProduct");
        if (!this.$isAntiInflationEnabled || !this.$isPageEligibleAntiInflation || !C27662e.m116393m(cVar)) {
            z = false;
        } else {
            z = true;
        }
        return new C38114b(cVar, 0, false, false, false, false, z, 62, (DefaultConstructorMarker) null);
    }
}
