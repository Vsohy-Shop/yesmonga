package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.net.http.C9873j;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/net/http/j;", "response", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CampaignService$submitCampaignPost$1 extends Lambda implements C11300l<C9873j, String> {
    final /* synthetic */ CampaignService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignService$submitCampaignPost$1(CampaignService campaignService) {
        super(1);
        this.this$0 = campaignService;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String invoke(@org.jetbrains.annotations.C12579k com.usabilla.sdk.ubform.net.http.C9873j r8) {
        /*
            r7 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.Map r8 = r8.getHeaders()
            r0 = 0
            if (r8 != 0) goto L_0x000d
            goto L_0x006f
        L_0x000d:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r2 = r8.size()
            int r2 = kotlin.collections.C10975r0.m41400j(r2)
            r1.<init>(r2)
            java.util.Set r8 = r8.entrySet()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0024:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r8.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = kotlin.text.C11622t.capitalize(r3)
            java.lang.Object r2 = r2.getValue()
            r1.put(r3, r2)
            goto L_0x0024
        L_0x0042:
            com.usabilla.sdk.ubform.sdk.campaign.CampaignService r8 = r7.this$0
            java.lang.String r8 = r8.f27372i
            java.lang.Object r8 = r1.get(r8)
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0052
            goto L_0x006f
        L_0x0052:
            r8 = 1
            java.lang.String[] r2 = new java.lang.String[r8]
            com.usabilla.sdk.ubform.sdk.campaign.CampaignService r8 = r7.this$0
            java.lang.String r8 = r8.f27371h
            r3 = 0
            r2[r3] = r8
            r4 = 0
            r5 = 6
            r6 = 0
            java.util.List r8 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r1, (java.lang.String[]) r2, (boolean) r3, (int) r4, (int) r5, (java.lang.Object) r6)
            if (r8 != 0) goto L_0x0068
            goto L_0x006f
        L_0x0068:
            java.lang.Object r8 = kotlin.collections.CollectionsKt___CollectionsKt.m40653k3(r8)
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
        L_0x006f:
            if (r0 != 0) goto L_0x0077
            com.usabilla.sdk.ubform.sdk.campaign.CampaignService r8 = r7.this$0
            java.lang.String r0 = r8.f27370g
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.campaign.CampaignService$submitCampaignPost$1.invoke(com.usabilla.sdk.ubform.net.http.j):java.lang.String");
    }
}
