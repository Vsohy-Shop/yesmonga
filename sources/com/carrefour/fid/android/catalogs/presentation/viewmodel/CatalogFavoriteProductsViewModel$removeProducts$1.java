package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel", mo22502f = "CatalogFavoriteProductsViewModel.kt", mo22503i = {0}, mo22504l = {57, 62}, mo22505m = "removeProducts", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CatalogFavoriteProductsViewModel$removeProducts$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CatalogFavoriteProductsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogFavoriteProductsViewModel$removeProducts$1(CatalogFavoriteProductsViewModel catalogFavoriteProductsViewModel, C11045c<? super CatalogFavoriteProductsViewModel$removeProducts$1> cVar) {
        super(cVar);
        this.this$0 = catalogFavoriteProductsViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo130838j0(false, this);
    }
}
