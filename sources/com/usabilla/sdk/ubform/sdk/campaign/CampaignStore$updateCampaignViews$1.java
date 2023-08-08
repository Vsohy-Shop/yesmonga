package com.usabilla.sdk.ubform.sdk.campaign;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$updateCampaignViews$1", mo22502f = "CampaignStore.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "it", "Lkotlinx/coroutines/flow/e;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CampaignStore$updateCampaignViews$1 extends SuspendLambda implements C11304p<Integer, C11045c<? super C11907e<? extends C11079d2>>, Object> {
    final /* synthetic */ String $campaignId;
    int label;
    final /* synthetic */ CampaignStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignStore$updateCampaignViews$1(CampaignStore campaignStore, String str, C11045c<? super CampaignStore$updateCampaignViews$1> cVar) {
        super(2, cVar);
        this.this$0 = campaignStore;
        this.$campaignId = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CampaignStore$updateCampaignViews$1(this.this$0, this.$campaignId, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object mo20783g(int i, @C12580l C11045c<? super C11907e<C11079d2>> cVar) {
        return ((CampaignStore$updateCampaignViews$1) create(Integer.valueOf(i), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo20783g(((Number) obj).intValue(), (C11045c) obj2);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return this.this$0.f27380a.mo20754j(this.$campaignId);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
