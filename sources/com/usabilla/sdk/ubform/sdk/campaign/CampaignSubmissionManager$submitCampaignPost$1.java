package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONObject;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager$submitCampaignPost$1", mo22502f = "CampaignSubmissionManager.kt", mo22503i = {}, mo22504l = {45}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CampaignSubmissionManager$submitCampaignPost$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ FormModel $formModel;
    final /* synthetic */ JSONObject $payload;
    int label;
    final /* synthetic */ CampaignSubmissionManager this$0;

    @C11067d(mo22501c = "com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager$submitCampaignPost$1$1", mo22502f = "CampaignSubmissionManager.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "", "", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
    /* renamed from: com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager$submitCampaignPost$1$1 */
    public static final class C99471 extends SuspendLambda implements C11305q<C11908f<? super String>, Throwable, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C11908f<? super String> fVar, @C12579k Throwable th, @C12580l C11045c<? super C11079d2> cVar) {
            C99471 r1 = new C99471(cVar);
            r1.L$0 = th;
            return r1.invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                Logger.Companion companion = Logger.f26647a;
                String localizedMessage = ((Throwable) this.L$0).getLocalizedMessage();
                Intrinsics.checkNotNullExpressionValue(localizedMessage, "it.localizedMessage");
                companion.logInfo(localizedMessage);
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignSubmissionManager$submitCampaignPost$1(CampaignSubmissionManager campaignSubmissionManager, JSONObject jSONObject, FormModel formModel, C11045c<? super CampaignSubmissionManager$submitCampaignPost$1> cVar) {
        super(2, cVar);
        this.this$0 = campaignSubmissionManager;
        this.$payload = jSONObject;
        this.$formModel = formModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CampaignSubmissionManager$submitCampaignPost$1(this.this$0, this.$payload, this.$formModel, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C9944xb71deb88 campaignSubmissionManager$submitCampaignPost$1$invokeSuspend$$inlined$map$1 = new C9944xb71deb88(C11909g.m47494u(this.this$0.f27405b.mo20756l(this.this$0.mo20784f(), this.$payload), new C99471((C11045c<? super C99471>) null)), this.this$0, this.$formModel);
            this.label = 1;
            if (C11909g.m47503x(campaignSubmissionManager$submitCampaignPost$1$invokeSuspend$$inlined$map$1, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CampaignSubmissionManager$submitCampaignPost$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
