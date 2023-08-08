package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.net.http.C9872i;
import com.usabilla.sdk.ubform.net.http.C9873j;
import com.usabilla.sdk.ubform.response.UbError;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/net/http/j;", "response", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CampaignService$getCampaignForm$2 extends Lambda implements C11300l<C9873j, C11079d2> {
    final /* synthetic */ C9872i $request;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignService$getCampaignForm$2(C9872i iVar) {
        super(1);
        this.$request = iVar;
    }

    /* renamed from: a */
    public final void mo20758a(@C12579k C9873j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "response");
        throw new UbError.UbServerError(this.$request, jVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo20758a((C9873j) obj);
        return C11079d2.f28267a;
    }
}
