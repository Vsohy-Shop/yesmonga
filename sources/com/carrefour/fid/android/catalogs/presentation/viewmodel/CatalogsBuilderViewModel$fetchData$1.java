package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel", mo22502f = "CatalogsBuilderViewModel.kt", mo22503i = {0, 0, 1, 1, 3, 3, 3}, mo22504l = {75, 78, 81, 88, 91}, mo22505m = "fetchData", mo22506n = {"this", "forceStoreDisplayIfAvailable", "this", "forceStoreDisplayIfAvailable", "this", "store", "forceStoreDisplayIfAvailable"}, mo22507s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "L$1", "Z$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CatalogsBuilderViewModel$fetchData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CatalogsBuilderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogsBuilderViewModel$fetchData$1(CatalogsBuilderViewModel catalogsBuilderViewModel, C11045c<? super CatalogsBuilderViewModel$fetchData$1> cVar) {
        super(cVar);
        this.this$0 = catalogsBuilderViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo130845m0(false, this);
    }
}
