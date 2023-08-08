package com.carrefour.fid.android.product.p038di;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import com.carrefour.fid.android.domain.interactors.product.C37750b;
import com.carrefour.fid.android.domain.interactors.product.C37753d;
import com.carrefour.fid.android.domain.interactors.product.C37755e;
import com.carrefour.fid.android.domain.interactors.product.C37756f;
import com.carrefour.fid.android.domain.interactors.product.C37758g;
import com.carrefour.fid.android.domain.interactors.product.C37760h;
import com.carrefour.fid.android.domain.interactors.product.C37761i;
import com.carrefour.fid.android.domain.interactors.product.C37773m;
import com.carrefour.fid.android.domain.interactors.product.C37776o;
import com.carrefour.fid.android.domain.interactors.product.C37778p;
import com.carrefour.fid.android.domain.interactors.product.C37779q;
import com.carrefour.fid.android.domain.interactors.product.C37780r;
import com.carrefour.fid.android.domain.interactors.product.C37786s;
import com.carrefour.fid.android.domain.interactors.product.C37802t;
import com.carrefour.fid.android.domain.interactors.product.GetMixedProductsDetailUseCase;
import com.carrefour.fid.android.domain.interactors.product.GetMixedProductsFlowUseCase;
import com.carrefour.fid.android.domain.interactors.product.GetOldProductFlowUseCase;
import com.carrefour.fid.android.domain.interactors.product.GetProductDetailUseCase;
import com.carrefour.fid.android.domain.interactors.product.GetProductDetailsNalUseCase;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.product.domain.interactors.C27550a0;
import com.carrefour.fid.android.product.domain.interactors.C27551b;
import com.carrefour.fid.android.product.domain.interactors.C27580y;
import com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetComplementaryProductsUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedProductFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetFacetsFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetFrequentlyPurchasedProductsUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetMixedProductsDetailUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetMixedProductsFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetOldProductFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetProductChannelTypesUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetProductFlowUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27951b;
import com.carrefour.fid.android.shared.p045di.annotation.C28663g;
import com.carrefour.fid.android.shared.p045di.annotation.C28664h;
import dagger.C10147a;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13092x;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.product.di.b */
public interface C27515b {
    @C12579k

    /* renamed from: a */
    public static final C27516a f66796a = C27516a.f66797a;

    /* renamed from: com.carrefour.fid.android.product.di.b$a */
    public static final class C27516a {

        /* renamed from: a */
        public static final /* synthetic */ C27516a f66797a = new C27516a();

        @C28663g
        @C10315i
        @C12579k
        /* renamed from: a */
        public final BffProductsManagementApi mo79908a(@C28663g @C12579k C13092x xVar) {
            Intrinsics.checkNotNullParameter(xVar, "retrofit");
            Object g = xVar.mo30586g(BffProductsManagementApi.class);
            Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(BffProdu…anagementApi::class.java)");
            return (BffProductsManagementApi) g;
        }

        @C28664h
        @C10315i
        @C12579k
        /* renamed from: b */
        public final BffProductsManagementApi mo79909b(@C28664h @C12579k C13092x xVar) {
            Intrinsics.checkNotNullParameter(xVar, "retrofit");
            Object g = xVar.mo30586g(BffProductsManagementApi.class);
            Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(BffProdu…anagementApi::class.java)");
            return (BffProductsManagementApi) g;
        }
    }

    @C10147a
    @C12579k
    /* renamed from: a */
    C37755e mo79887a(@C12579k ProductGetComplementaryProductsUseCase productGetComplementaryProductsUseCase);

    @C10147a
    @C12579k
    /* renamed from: b */
    C37802t mo79888b(@C12579k C27550a0 a0Var);

    @C10147a
    @C12579k
    /* renamed from: c */
    C37786s mo79889c(@C12579k C27580y yVar);

    @C10147a
    @C12579k
    /* renamed from: d */
    C37778p mo79890d(@C12579k ProductGetPlpFlowUseCase productGetPlpFlowUseCase);

    @C10147a
    @C12579k
    /* renamed from: e */
    C37779q mo79891e(@C12579k ProductGetProductChannelTypesUseCase productGetProductChannelTypesUseCase);

    @C10147a
    @C12579k
    /* renamed from: f */
    GetMixedProductsDetailUseCase mo79892f(@C12579k ProductGetMixedProductsDetailUseCase productGetMixedProductsDetailUseCase);

    @C10147a
    @C12579k
    /* renamed from: g */
    GetProductDetailUseCase mo79893g(@C12579k ProductGetProductDetailUseCase productGetProductDetailUseCase);

    @C10147a
    @C12579k
    /* renamed from: h */
    C37776o mo79894h(@C12579k ProductGetFrequentlyPurchasedProductsUseCase productGetFrequentlyPurchasedProductsUseCase);

    @C10147a
    @C12579k
    /* renamed from: i */
    C37773m mo79895i(@C12579k ProductGetFacetsFlowUseCase productGetFacetsFlowUseCase);

    @C10147a
    @C12579k
    /* renamed from: j */
    C37761i mo79896j(@C12579k ProductGetConsolidatedProductFlowUseCase productGetConsolidatedProductFlowUseCase);

    @C10147a
    @C12579k
    /* renamed from: k */
    C37756f mo79897k(@C12579k ProductGetConsolidatedAlternativeProductsFlowUseCase productGetConsolidatedAlternativeProductsFlowUseCase);

    @C10147a
    @C12579k
    /* renamed from: l */
    C37758g mo79898l(@C12579k ProductGetConsolidatedCriteoProductsFlowUseCase productGetConsolidatedCriteoProductsFlowUseCase);

    @C10147a
    @C12579k
    /* renamed from: m */
    GetProductDetailsNalUseCase mo79899m(@C12579k ProductGetProductDetailsNalUseCase productGetProductDetailsNalUseCase);

    @C10147a
    @C12579k
    /* renamed from: n */
    C27950a mo79900n(@C12579k C27951b bVar);

    @C10147a
    @C12579k
    /* renamed from: o */
    C37780r mo79901o(@C12579k ProductGetProductFlowUseCase productGetProductFlowUseCase);

    @C10147a
    @C12579k
    /* renamed from: p */
    C37760h mo79902p(@C12579k ProductGetConsolidatedPlpFlowUseCase productGetConsolidatedPlpFlowUseCase);

    @C10147a
    @C12579k
    /* renamed from: q */
    C37753d mo79903q(@C12579k ProductGetAntiInflationProductsFlowUseCase productGetAntiInflationProductsFlowUseCase);

    @C10147a
    @C12579k
    /* renamed from: r */
    C37750b mo79904r(@C12579k C27551b bVar);

    @C10147a
    @C12579k
    /* renamed from: s */
    GetOldProductFlowUseCase mo79905s(@C12579k ProductGetOldProductFlowUseCase productGetOldProductFlowUseCase);

    @C10147a
    @C12579k
    /* renamed from: t */
    C37857d mo79906t(@C12579k ProductGetSlotSliceUseCase productGetSlotSliceUseCase);

    @C10147a
    @C12579k
    /* renamed from: u */
    GetMixedProductsFlowUseCase mo79907u(@C12579k ProductGetMixedProductsFlowUseCase productGetMixedProductsFlowUseCase);
}
