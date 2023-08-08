package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.response.UbError;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$incrementCampaignViews$1", mo22502f = "CampaignManager.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lkotlin/d2;", "", "e", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CampaignManager$incrementCampaignViews$1 extends SuspendLambda implements C11305q<C11908f<? super C11079d2>, Throwable, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public CampaignManager$incrementCampaignViews$1(C11045c<? super CampaignManager$incrementCampaignViews$1> cVar) {
        super(3, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super C11079d2> fVar, @C12579k Throwable th, @C12580l C11045c<? super C11079d2> cVar) {
        CampaignManager$incrementCampaignViews$1 campaignManager$incrementCampaignViews$1 = new CampaignManager$incrementCampaignViews$1(cVar);
        campaignManager$incrementCampaignViews$1.L$0 = th;
        return campaignManager$incrementCampaignViews$1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        UbError ubError;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            Throwable th = (Throwable) this.L$0;
            Logger.Companion companion = Logger.f26647a;
            String str = null;
            if (th instanceof UbError) {
                ubError = (UbError) th;
            } else {
                ubError = null;
            }
            if (ubError != null) {
                str = ubError.mo20342a();
            }
            if (str == null) {
                str = th.getLocalizedMessage();
            }
            if (str == null) {
                str = "Error updating campaign views";
            }
            companion.logError(str);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
