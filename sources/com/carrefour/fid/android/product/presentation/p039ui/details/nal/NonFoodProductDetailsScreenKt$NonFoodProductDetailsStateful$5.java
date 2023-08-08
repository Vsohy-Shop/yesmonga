package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.models.product.detail.C38106a;
import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import com.carrefour.fid.android.product.presentation.analytics.C27633c;
import com.carrefour.fid.android.product.presentation.models.C27656e;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28120e;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28122f;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28123g;
import com.carrefour.fid.android.shared.type.C28897f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$5 */
public final class NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$5 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C28123g $analyticsViewModel;
    final /* synthetic */ C8700z0<OfferDetail> $currentOfferSelectedState;
    final /* synthetic */ C27656e $nonFoodProductDetailsModel;
    final /* synthetic */ C28120e $offerTypeAnalyticsMapper;
    final /* synthetic */ C28122f $priceAnalyticsMapper;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$5(C27656e eVar, C8700z0<OfferDetail> z0Var, C28123g gVar, C28122f fVar, C28120e eVar2) {
        super(0);
        this.$nonFoodProductDetailsModel = eVar;
        this.$currentOfferSelectedState = z0Var;
        this.$analyticsViewModel = gVar;
        this.$priceAnalyticsMapper = fVar;
        this.$offerTypeAnalyticsMapper = eVar2;
    }

    @C12579k
    public final Boolean invoke() {
        C38106a aVar = (C38106a) C28897f.m119478b(this.$nonFoodProductDetailsModel.mo80362i());
        if (aVar == null) {
            return Boolean.TRUE;
        }
        OfferDetail value = this.$currentOfferSelectedState.getValue();
        if (value == null) {
            value = aVar.mo118714f();
        }
        C28123g gVar = this.$analyticsViewModel;
        String name = aVar.mo118716h().getName();
        String f = value.mo118706x().mo118136f();
        String e = value.mo118706x().mo118134e();
        String a = this.$priceAnalyticsMapper.mo81735a(value);
        String category = aVar.mo118716h().getCategory();
        if (category == null) {
            category = "";
        }
        gVar.mo81737b(new C27633c(name, f, category, e, a, (Integer) null, 2, value.mo118703u(), value.mo118701t(), this.$offerTypeAnalyticsMapper.mo81734b(aVar.mo118716h(), value).mo32724a(), (String) null, 1056, (DefaultConstructorMarker) null));
        return Boolean.TRUE;
    }
}
