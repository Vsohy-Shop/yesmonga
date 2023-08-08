package com.carrefour.fid.android.domain.repositories;

import com.carrefour.fid.android.domain.models.delivery.C38020e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.repositories.DlvRepository", mo22502f = "DlvRepository.kt", mo22503i = {}, mo22504l = {17}, mo22505m = "fetchDlvOptions-0E7RQCE", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DlvRepository$fetchDlvOptions$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DlvRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DlvRepository$fetchDlvOptions$1(DlvRepository dlvRepository, C11045c<? super DlvRepository$fetchDlvOptions$1> cVar) {
        super(cVar);
        this.this$0 = dlvRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo119610a((String) null, (List<C38020e>) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
