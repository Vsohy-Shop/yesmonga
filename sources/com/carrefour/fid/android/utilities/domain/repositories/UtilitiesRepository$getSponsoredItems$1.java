package com.carrefour.fid.android.utilities.domain.repositories;

import com.carrefour.fid.android.domain.models.criteo.C38006h;
import com.carrefour.fid.android.domain.models.luckycart.C38048b;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository", mo22502f = "UtilitiesRepository.kt", mo22503i = {}, mo22504l = {29}, mo22505m = "getSponsoredItems-hUnOzRk", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UtilitiesRepository$getSponsoredItems$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UtilitiesRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UtilitiesRepository$getSponsoredItems$1(UtilitiesRepository utilitiesRepository, C11045c<? super UtilitiesRepository$getSponsoredItems$1> cVar) {
        super(cVar);
        this.this$0 = utilitiesRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo67049a((C38006h) null, (C38048b) null, (String) null, (String) null, (String) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
