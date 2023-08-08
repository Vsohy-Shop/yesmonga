package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.eventengine.C9831a;
import com.usabilla.sdk.ubform.net.http.C9873j;
import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.json.JSONArray;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/net/http/j;", "response", "Ljava/util/ArrayList;", "Lcom/usabilla/sdk/ubform/eventengine/a;", "Lkotlin/collections/ArrayList;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CampaignService$getCampaigns$1 extends Lambda implements C11300l<C9873j, ArrayList<C9831a>> {
    final /* synthetic */ CampaignService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignService$getCampaigns$1(CampaignService campaignService) {
        super(1);
        this.this$0 = campaignService;
    }

    @C12579k
    /* renamed from: a */
    public final ArrayList<C9831a> invoke(@C12579k C9873j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "response");
        ArrayList<C9831a> arrayList = new ArrayList<>();
        JSONArray jSONArray = new JSONArray(jVar.getBody());
        if (jSONArray.length() != 0) {
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    arrayList2.add(jSONArray.getJSONObject(i));
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            arrayList.addAll(this.this$0.mo20753i(arrayList2));
        }
        return arrayList;
    }
}
