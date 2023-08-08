package com.carrefour.fid.android.catalogs.data.local.datasource;

import com.carrefour.fid.android.CatalogProduct;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource", mo22502f = "CatalogsLocalDataSource.kt", mo22503i = {0, 0, 0, 1, 1, 1}, mo22504l = {33, 33, 38}, mo22505m = "addFavoriteProduct", mo22506n = {"this", "product", "existingFavProducts", "this", "product", "existingFavProducts"}, mo22507s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CatalogsLocalDataSource$addFavoriteProduct$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CatalogsLocalDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogsLocalDataSource$addFavoriteProduct$1(CatalogsLocalDataSource catalogsLocalDataSource, C11045c<? super CatalogsLocalDataSource$addFavoriteProduct$1> cVar) {
        super(cVar);
        this.this$0 = catalogsLocalDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo130442e((CatalogProduct) null, this);
    }
}
