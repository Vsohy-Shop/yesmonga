package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.eventengine.C9831a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaigns$4", mo22502f = "CampaignStore.kt", mo22503i = {}, mo22504l = {44, 44}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "", "Lcom/usabilla/sdk/ubform/eventengine/a;", "", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CampaignStore$getCampaigns$4 extends SuspendLambda implements C11305q<C11908f<? super List<? extends C9831a>>, Throwable, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CampaignStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignStore$getCampaigns$4(CampaignStore campaignStore, C11045c<? super CampaignStore$getCampaigns$4> cVar) {
        super(3, cVar);
        this.this$0 = campaignStore;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super List<C9831a>> fVar, @C12579k Throwable th, @C12580l C11045c<? super C11079d2> cVar) {
        CampaignStore$getCampaigns$4 campaignStore$getCampaigns$4 = new CampaignStore$getCampaigns$4(this.this$0, cVar);
        campaignStore$getCampaigns$4.L$0 = fVar;
        campaignStore$getCampaigns$4.L$1 = th;
        return campaignStore$getCampaigns$4.invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.C11661u0.m45747n(r7)
            goto L_0x005e
        L_0x0012:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001a:
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0052
        L_0x0022:
            kotlin.C11661u0.m45747n(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            java.lang.Object r7 = r6.L$1
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            com.usabilla.sdk.ubform.Logger$Companion r4 = com.usabilla.sdk.ubform.Logger.f26647a
            java.lang.String r5 = "Get campaigns failed. "
            java.lang.String r7 = r7.getLocalizedMessage()
            java.lang.String r7 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r7)
            r4.logError(r7)
            com.usabilla.sdk.ubform.sdk.campaign.CampaignStore r7 = r6.this$0
            com.usabilla.sdk.ubform.db.campaign.a r7 = r7.f27381b
            kotlinx.coroutines.flow.e r7 = r7.mo20020b()
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.C11909g.m47374I1(r7, r6)
            if (r7 != r0) goto L_0x0052
            return r0
        L_0x0052:
            r3 = 0
            r6.L$0 = r3
            r6.label = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L_0x005e
            return r0
        L_0x005e:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaigns$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
