package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel", mo22502f = "CatalogProductDetailsViewModel.kt", mo22503i = {0, 0, 2, 2}, mo22504l = {42, 43, 46, 47}, mo22505m = "toggleFavorite", mo22506n = {"this", "product", "this", "product"}, mo22507s = {"L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CatalogProductDetailsViewModel$toggleFavorite$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CatalogProductDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogProductDetailsViewModel$toggleFavorite$1(CatalogProductDetailsViewModel catalogProductDetailsViewModel, C11045c<? super CatalogProductDetailsViewModel$toggleFavorite$1> cVar) {
        super(cVar);
        this.this$0 = catalogProductDetailsViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo130842h0((CatalogProduct) null, false, this);
    }
}
