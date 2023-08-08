package com.carrefour.fid.android.data.repositories;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.DepartmentListRepository", mo22502f = "DepartmentListRepository.kt", mo22503i = {}, mo22504l = {27}, mo22505m = "fetchDepartmentsList-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DepartmentListRepository$fetchDepartmentsList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DepartmentListRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentListRepository$fetchDepartmentsList$1(DepartmentListRepository departmentListRepository, C11045c<? super DepartmentListRepository$fetchDepartmentsList$1> cVar) {
        super(cVar);
        this.this$0 = departmentListRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object g = this.this$0.mo111499g((String) null, this);
        return g == C11063b.m42612h() ? g : Result.m38701a(g);
    }
}
