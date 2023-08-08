package com.usabilla.sdk.ubform.p008di;

import com.usabilla.sdk.ubform.sdk.campaign.CampaignManager;
import com.usabilla.sdk.ubform.sdk.campaign.CampaignService;
import com.usabilla.sdk.ubform.sdk.campaign.CampaignStore;
import com.usabilla.sdk.ubform.sdk.campaign.CampaignSubmissionManager;
import com.usabilla.sdk.ubform.utils.C10140g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/di/e;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.di.UsabillaDIKt$createCampaignFormModule$1 */
public final class UsabillaDIKt$createCampaignFormModule$1 extends Lambda implements C11300l<C9822e, C11079d2> {

    /* renamed from: f */
    public static final UsabillaDIKt$createCampaignFormModule$1 f26849f = new UsabillaDIKt$createCampaignFormModule$1();

    public UsabillaDIKt$createCampaignFormModule$1() {
        super(1);
    }

    /* renamed from: a */
    public final void mo20071a(@C12579k C9822e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$module");
        C97861 r0 = C97861.f26850f;
        eVar.mo20153b().put(C10140g.class, new C9824g(r0));
        C97872 r02 = C97872.f26851f;
        eVar.mo20153b().put(CampaignService.class, new C9824g(r02));
        C97883 r03 = C97883.f26852f;
        eVar.mo20153b().put(CampaignSubmissionManager.class, new C9824g(r03));
        C97894 r04 = C97894.f26853f;
        eVar.mo20153b().put(CampaignStore.class, new C9824g(r04));
        C97905 r05 = C97905.f26854f;
        eVar.mo20153b().put(CampaignManager.class, new C9824g(r05));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo20071a((C9822e) obj);
        return C11079d2.f28267a;
    }
}
