package com.carrefour.fid.android.loyalty.presentation.viewmodels.otp;

import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel", mo22502f = "ChannelsFidViewModel.kt", mo22503i = {}, mo22504l = {22, 23}, mo22505m = "processIntent", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ChannelsFidViewModel$processIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChannelsFidViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsFidViewModel$processIntent$1(ChannelsFidViewModel channelsFidViewModel, C11045c<? super ChannelsFidViewModel$processIntent$1> cVar) {
        super(cVar);
        this.this$0 = channelsFidViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processIntent((ChannelsFid.UserAction) null, (C11045c<? super C11079d2>) this);
    }
}
