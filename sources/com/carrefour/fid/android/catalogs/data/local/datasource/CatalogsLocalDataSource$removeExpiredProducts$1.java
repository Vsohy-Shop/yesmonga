package com.carrefour.fid.android.catalogs.data.local.datasource;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.catalogs.data.local.datasource.CatalogsLocalDataSource", mo22502f = "CatalogsLocalDataSource.kt", mo22503i = {0, 1}, mo22504l = {55, 55, 57}, mo22505m = "removeExpiredProducts", mo22506n = {"this", "this"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CatalogsLocalDataSource$removeExpiredProducts$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CatalogsLocalDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogsLocalDataSource$removeExpiredProducts$1(CatalogsLocalDataSource catalogsLocalDataSource, C11045c<? super CatalogsLocalDataSource$removeExpiredProducts$1> cVar) {
        super(cVar);
        this.this$0 = catalogsLocalDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo130445h(this);
    }
}
