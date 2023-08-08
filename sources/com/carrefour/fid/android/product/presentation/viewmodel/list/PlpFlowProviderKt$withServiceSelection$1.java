package com.carrefour.fid.android.product.presentation.viewmodel.list;

import com.carrefour.fid.android.domain.interactors.service.C37823k;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProviderKt", mo22502f = "PlpFlowProvider.kt", mo22503i = {0}, mo22504l = {71, 72}, mo22505m = "withServiceSelection", mo22506n = {"action"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PlpFlowProviderKt$withServiceSelection$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public PlpFlowProviderKt$withServiceSelection$1(C11045c<? super PlpFlowProviderKt$withServiceSelection$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PlpFlowProviderKt.m117913d((C37823k) null, (C11304p) null, this);
    }
}
