package com.carrefour.fid.android.catalogs.domain.interactors;

import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.catalogs.domain.interactors.CatalogsAddCatalogFavoriteProductUseCase", mo22502f = "CatalogsAddCatalogFavoriteProductUseCase.kt", mo22503i = {}, mo22504l = {12}, mo22505m = "invoke-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CatalogsAddCatalogFavoriteProductUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CatalogsAddCatalogFavoriteProductUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogsAddCatalogFavoriteProductUseCase$invoke$1(CatalogsAddCatalogFavoriteProductUseCase catalogsAddCatalogFavoriteProductUseCase, C11045c<? super CatalogsAddCatalogFavoriteProductUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = catalogsAddCatalogFavoriteProductUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m173095invokegIAlus((CatalogProduct) null, (C11045c<? super Result<Boolean>>) this);
        return r2 == C11063b.m42612h() ? r2 : Result.m38701a(r2);
    }
}
