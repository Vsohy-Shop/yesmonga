package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel", mo22502f = "CatalogDetailsViewModel.kt", mo22503i = {0, 0, 0, 1, 1, 1}, mo22504l = {153, 155}, mo22505m = "toggleFavorite", mo22506n = {"this", "product", "isFavorite", "this", "product", "isFavorite"}, mo22507s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CatalogDetailsViewModel$toggleFavorite$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CatalogDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogDetailsViewModel$toggleFavorite$1(CatalogDetailsViewModel catalogDetailsViewModel, C11045c<? super CatalogDetailsViewModel$toggleFavorite$1> cVar) {
        super(cVar);
        this.this$0 = catalogDetailsViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo130833m0((CatalogProduct) null, false, (String) null, this);
    }
}
