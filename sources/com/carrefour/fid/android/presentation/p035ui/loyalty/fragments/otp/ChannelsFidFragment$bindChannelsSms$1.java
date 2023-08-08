package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel;
import com.carrefour.fid.android.presentation.components.loyalty.ChannelsCardView;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ChannelsFidFragment$bindChannelsSms$1", mo22502f = "ChannelsFidFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ChannelsFidFragment$bindChannelsSms$1 */
public final class ChannelsFidFragment$bindChannelsSms$1 extends SuspendLambda implements C11304p<C11079d2, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ ChannelsCardView $channelSms;
    final /* synthetic */ UserChannelsMediaModel $channelsSms;
    final /* synthetic */ String $loyaltyCardNumber;
    int label;
    final /* synthetic */ ChannelsFidFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsFidFragment$bindChannelsSms$1(ChannelsCardView channelsCardView, ChannelsFidFragment channelsFidFragment, UserChannelsMediaModel userChannelsMediaModel, String str, C11045c<? super ChannelsFidFragment$bindChannelsSms$1> cVar) {
        super(2, cVar);
        this.$channelSms = channelsCardView;
        this.this$0 = channelsFidFragment;
        this.$channelsSms = userChannelsMediaModel;
        this.$loyaltyCardNumber = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ChannelsFidFragment$bindChannelsSms$1(this.$channelSms, this.this$0, this.$channelsSms, this.$loyaltyCardNumber, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11079d2 d2Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ChannelsFidFragment$bindChannelsSms$1) create(d2Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            this.$channelSms.mo121243a(true);
            this.this$0.mo71747j1(this.$channelsSms.getMediaKey(), this.$loyaltyCardNumber);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
