package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.eventengine.C9831a;
import com.usabilla.sdk.ubform.net.http.C9873j;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/net/http/j;", "response", "Lcom/usabilla/sdk/ubform/eventengine/a;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CampaignService$getCampaignInfo$1 extends Lambda implements C11300l<C9873j, C9831a> {
    final /* synthetic */ CampaignService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignService$getCampaignInfo$1(CampaignService campaignService) {
        super(1);
        this.this$0 = campaignService;
    }

    @C12579k
    /* renamed from: a */
    public final C9831a invoke(@C12579k C9873j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "response");
        return (C9831a) CollectionsKt___CollectionsKt.m40706w2(this.this$0.mo20753i(CollectionsKt__CollectionsKt.m40463r(new JSONObject(jVar.getBody()))));
    }
}
