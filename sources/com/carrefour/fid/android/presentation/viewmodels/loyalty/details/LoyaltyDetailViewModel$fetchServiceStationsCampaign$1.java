package com.carrefour.fid.android.presentation.viewmodels.loyalty.details;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchServiceStationsCampaign$1", mo22502f = "LoyaltyDetailViewModel.kt", mo22503i = {}, mo22504l = {209, 211}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LoyaltyDetailViewModel$fetchServiceStationsCampaign$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ LoyaltyDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyDetailViewModel$fetchServiceStationsCampaign$1(LoyaltyDetailViewModel loyaltyDetailViewModel, C11045c<? super LoyaltyDetailViewModel$fetchServiceStationsCampaign$1> cVar) {
        super(2, cVar);
        this.this$0 = loyaltyDetailViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LoyaltyDetailViewModel$fetchServiceStationsCampaign$1(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x004c
        L_0x0018:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0020:
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0032
        L_0x0024:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r5 = r4.this$0
            r4.label = r3
            java.lang.Object r5 = r5.mo77231M0(r4)
            if (r5 != r0) goto L_0x0032
            return r0
        L_0x0032:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x003d
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        L_0x003d:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r5 = r4.this$0
            com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase r5 = r5.f64875a
            r4.label = r2
            java.lang.Object r5 = r5.m172969invokeIoAF18A(r4)
            if (r5 != r0) goto L_0x004c
            return r0
        L_0x004c:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r0 = r4.this$0
            boolean r1 = kotlin.Result.m38709i(r5)
            if (r1 == 0) goto L_0x005f
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c r5 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$f r1 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26570h.C26576f.f64935a
            r5.<init>(r1)
            r0.emitEvent(r5)
            goto L_0x0077
        L_0x005f:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$a r1 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$a
            boolean r2 = kotlin.Result.m38709i(r5)
            r3 = 0
            if (r2 == 0) goto L_0x0069
            r5 = r3
        L_0x0069:
            com.carrefour.fid.android.domain.models.CurrentCampaignsDomain r5 = (com.carrefour.fid.android.domain.models.CurrentCampaignsDomain) r5
            if (r5 == 0) goto L_0x0071
            com.carrefour.fid.android.presentation.models.CurrentCampaignsModel r3 = com.carrefour.fid.android.presentation.models.extension.C38471g.m159630a(r5)
        L_0x0071:
            r1.<init>(r3)
            r0.publishState(r1)
        L_0x0077:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchServiceStationsCampaign$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((LoyaltyDetailViewModel$fetchServiceStationsCampaign$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
