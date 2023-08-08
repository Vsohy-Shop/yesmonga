package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.eventengine.TargetingOptionsModel;
import com.usabilla.sdk.ubform.net.http.C9873j;
import com.usabilla.sdk.ubform.utils.C10139f;
import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/net/http/j;", "response", "Ljava/util/ArrayList;", "Lcom/usabilla/sdk/ubform/eventengine/TargetingOptionsModel;", "Lkotlin/collections/ArrayList;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class CampaignService$getTargetingOptions$1 extends Lambda implements C11300l<C9873j, ArrayList<TargetingOptionsModel>> {

    /* renamed from: f */
    public static final CampaignService$getTargetingOptions$1 f27377f = new CampaignService$getTargetingOptions$1();

    public CampaignService$getTargetingOptions$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final ArrayList<TargetingOptionsModel> invoke(@C12579k C9873j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "response");
        ArrayList<TargetingOptionsModel> arrayList = new ArrayList<>();
        JSONArray jSONArray = new JSONArray(jVar.getBody());
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                try {
                    C10139f fVar = C10139f.f27869a;
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "item");
                    arrayList.add(fVar.mo21583d(jSONObject));
                } catch (JSONException unused) {
                    String string = jSONObject.getString("id");
                    Logger.Companion companion = Logger.f26647a;
                    companion.logError("Parsing event in campaign with id " + string + " failed.");
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }
}
