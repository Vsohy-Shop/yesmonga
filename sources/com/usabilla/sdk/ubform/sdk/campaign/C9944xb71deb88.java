package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager$submitCampaignPost$1$invokeSuspend$$inlined$map$1 */
public final class C9944xb71deb88 implements C11907e<C11907e<? extends C11079d2>> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f27411a;

    /* renamed from: b */
    public final /* synthetic */ CampaignSubmissionManager f27412b;

    /* renamed from: c */
    public final /* synthetic */ FormModel f27413c;

    public C9944xb71deb88(C11907e eVar, CampaignSubmissionManager campaignSubmissionManager, FormModel formModel) {
        this.f27411a = eVar;
        this.f27412b = campaignSubmissionManager;
        this.f27413c = formModel;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f27411a.collect(new C11908f<String>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.usabilla.sdk.ubform.sdk.campaign.C9944xb71deb88.C99452.C99461
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager$submitCampaignPost$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.usabilla.sdk.ubform.sdk.campaign.C9944xb71deb88.C99452.C99461) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager$submitCampaignPost$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager$submitCampaignPost$1$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r6)
                    goto L_0x0075
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    kotlin.C11661u0.m45747n(r6)
                    kotlinx.coroutines.flow.f r6 = r3
                    java.lang.String r5 = (java.lang.String) r5
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager$submitCampaignPost$1$invokeSuspend$$inlined$map$1 r2 = r2
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager r2 = r2.f27412b
                    r2.f27408e = r5
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager$submitCampaignPost$1$invokeSuspend$$inlined$map$1 r5 = r2
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager r5 = r5.f27412b
                    boolean r5 = r5.mo20785g()
                    if (r5 == 0) goto L_0x0066
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager$submitCampaignPost$1$invokeSuspend$$inlined$map$1 r5 = r2
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager r5 = r5.f27412b
                    com.usabilla.sdk.ubform.utils.g r5 = r5.f27406c
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager$submitCampaignPost$1$invokeSuspend$$inlined$map$1 r2 = r2
                    com.usabilla.sdk.ubform.sdk.form.model.FormModel r2 = r2.f27413c
                    org.json.JSONObject r5 = r5.mo21585b(r2, r3)
                    if (r5 != 0) goto L_0x005d
                    r5 = 0
                    goto L_0x006c
                L_0x005d:
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager$submitCampaignPost$1$invokeSuspend$$inlined$map$1 r2 = r2
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager r2 = r2.f27412b
                    kotlinx.coroutines.flow.e r5 = r2.mo20788j(r5)
                    goto L_0x006c
                L_0x0066:
                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                    kotlinx.coroutines.flow.e r5 = kotlinx.coroutines.flow.C11909g.m47385M0(r5)
                L_0x006c:
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0075
                    return r1
                L_0x0075:
                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.campaign.C9944xb71deb88.C99452.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
