package com.carrefour.fid.android.cms.domain.repositories;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository", mo22502f = "StorePetrolRepository.kt", mo22503i = {0, 0, 1, 2}, mo22504l = {17, 22, 24}, mo22505m = "fetchPetrolInfo", mo22506n = {"this", "minifiCode", "this", "data"}, mo22507s = {"L$0", "I$0", "L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StorePetrolRepository$fetchPetrolInfo$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StorePetrolRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StorePetrolRepository$fetchPetrolInfo$1(StorePetrolRepository storePetrolRepository, C11045c<? super StorePetrolRepository$fetchPetrolInfo$1> cVar) {
        super(cVar);
        this.this$0 = storePetrolRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchPetrolInfo(0, this);
    }
}
