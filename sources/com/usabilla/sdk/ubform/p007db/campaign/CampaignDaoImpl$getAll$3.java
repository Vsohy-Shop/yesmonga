package com.usabilla.sdk.ubform.p007db.campaign;

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

@C11067d(mo22501c = "com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$getAll$3", mo22502f = "CampaignDaoImpl.kt", mo22503i = {}, mo22504l = {62, 62}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "", "Lcom/usabilla/sdk/ubform/eventengine/a;", "", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$getAll$3 */
public final class CampaignDaoImpl$getAll$3 extends SuspendLambda implements C11305q<C11908f<? super List<? extends C9831a>>, Throwable, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CampaignDaoImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignDaoImpl$getAll$3(CampaignDaoImpl campaignDaoImpl, C11045c<? super CampaignDaoImpl$getAll$3> cVar) {
        super(3, cVar);
        this.this$0 = campaignDaoImpl;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super List<C9831a>> fVar, @C12579k Throwable th, @C12580l C11045c<? super C11079d2> cVar) {
        CampaignDaoImpl$getAll$3 campaignDaoImpl$getAll$3 = new CampaignDaoImpl$getAll$3(this.this$0, cVar);
        campaignDaoImpl$getAll$3.L$0 = fVar;
        return campaignDaoImpl$getAll$3.invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004c
        L_0x0012:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001a:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0040
        L_0x0022:
            kotlin.C11661u0.m45747n(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl r6 = r5.this$0
            kotlinx.coroutines.flow.e r6 = r6.mo20019a()
            com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$getAll$3$invokeSuspend$$inlined$map$1 r4 = new com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$getAll$3$invokeSuspend$$inlined$map$1
            r4.<init>(r6)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.C11909g.m47374I1(r4, r5)
            if (r6 != r0) goto L_0x0040
            return r0
        L_0x0040:
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L_0x004c
            return r0
        L_0x004c:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.p007db.campaign.CampaignDaoImpl$getAll$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
