package com.carrefour.fid.android.various.presentation.viewmodels.notification;

import com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel", mo22502f = "AppMessageViewModel.kt", mo22503i = {0, 2}, mo22504l = {42, 45, 47}, mo22505m = "processIntent", mo22506n = {"this", "this"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AppMessageViewModel$processIntent$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppMessageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppMessageViewModel$processIntent$1(AppMessageViewModel appMessageViewModel, C11045c<? super AppMessageViewModel$processIntent$1> cVar) {
        super(cVar);
        this.this$0 = appMessageViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processIntent((C22822a.C22833c) null, this);
    }
}
