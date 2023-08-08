package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.catalogs.presentation.viewmodel.StoreCatalogListViewModel", mo22502f = "StoreCatalogListViewModel.kt", mo22503i = {0}, mo22504l = {47}, mo22505m = "fetchData", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StoreCatalogListViewModel$fetchData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StoreCatalogListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreCatalogListViewModel$fetchData$1(StoreCatalogListViewModel storeCatalogListViewModel, C11045c<? super StoreCatalogListViewModel$fetchData$1> cVar) {
        super(cVar);
        this.this$0 = storeCatalogListViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo130854e0((String) null, this);
    }
}
