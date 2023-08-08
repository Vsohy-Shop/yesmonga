package com.carrefour.fid.android.domain.interactors.criteo;

import com.carrefour.fid.android.domain.interactors.criteo.C37666g;
import com.carrefour.fid.android.domain.models.criteo.C38002d;
import com.carrefour.fid.android.domain.models.criteo.C38014p;
import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase", mo22502f = "CriteoGetCriteoProductsUseCase.kt", mo22503i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, mo22504l = {90, 95}, mo22505m = "consolidate-4YPTY9w", mo22506n = {"this", "productsEan", "criteoResult", "sponsoredProductsIds", "flagshipProductsIds", "flagship", "param", "offers", "shoppingList", "isFlagshipEnabled", "productsEan", "criteoResult", "sponsoredProductsIds", "flagshipProductsIds", "flagship", "param", "offers", "shoppingList", "basketList", "isFlagshipEnabled"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CriteoGetCriteoProductsUseCase$consolidate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CriteoGetCriteoProductsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoGetCriteoProductsUseCase$consolidate$1(CriteoGetCriteoProductsUseCase criteoGetCriteoProductsUseCase, C11045c<? super CriteoGetCriteoProductsUseCase$consolidate$1> cVar) {
        super(cVar);
        this.this$0 = criteoGetCriteoProductsUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo114642c((Object) null, (List<String>) null, (C38014p) null, (List<String>) null, (List<String>) null, false, (C38002d) null, (C37666g.C37667a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
