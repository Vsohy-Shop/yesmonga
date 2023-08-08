package com.carrefour.fid.android.data.datasource;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.datasource.DepartmentListGateway", mo22502f = "DepartmentListGateway.kt", mo22503i = {0}, mo22504l = {22, 23}, mo22505m = "get-IoAF18A", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DepartmentListGateway$get$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DepartmentListGateway this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentListGateway$get$1(DepartmentListGateway departmentListGateway, C11045c<? super DepartmentListGateway$get$1> cVar) {
        super(cVar);
        this.this$0 = departmentListGateway;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.mo108659d(this);
        return d == C11063b.m42612h() ? d : Result.m38701a(d);
    }
}
