package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import android.content.Intent;
import android.net.Uri;
import com.carrefour.fid.android.databinding.C36660c1;
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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ChannelsFidFragment$initListeners$1$1", mo22502f = "ChannelsFidFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ChannelsFidFragment$initListeners$1$1 */
public final class ChannelsFidFragment$initListeners$1$1 extends SuspendLambda implements C11304p<C11079d2, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C36660c1 $this_with;
    int label;
    final /* synthetic */ ChannelsFidFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsFidFragment$initListeners$1$1(C36660c1 c1Var, ChannelsFidFragment channelsFidFragment, C11045c<? super ChannelsFidFragment$initListeners$1$1> cVar) {
        super(2, cVar);
        this.$this_with = c1Var;
        this.this$0 = channelsFidFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ChannelsFidFragment$initListeners$1$1(this.$this_with, this.this$0, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11079d2 d2Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ChannelsFidFragment$initListeners$1$1) create(d2Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            Intent intent = new Intent("android.intent.action.DIAL");
            C36660c1 c1Var = this.$this_with;
            ChannelsFidFragment channelsFidFragment = this.this$0;
            Object tag = c1Var.f90632g.getTag();
            intent.setData(Uri.parse("tel:" + tag));
            channelsFidFragment.startActivity(intent);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
