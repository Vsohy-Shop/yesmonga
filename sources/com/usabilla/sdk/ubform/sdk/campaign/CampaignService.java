package com.usabilla.sdk.ubform.sdk.campaign;

import com.urbanairship.iam.C9259x;
import com.usabilla.sdk.ubform.eventengine.C9831a;
import com.usabilla.sdk.ubform.eventengine.TargetingOptionsModel;
import com.usabilla.sdk.ubform.net.C9853d;
import com.usabilla.sdk.ubform.net.http.C9870g;
import com.usabilla.sdk.ubform.net.http.C9872i;
import com.usabilla.sdk.ubform.sdk.banner.BannerPosition;
import com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.C11078d1;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10975r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;

public final class CampaignService {
    @C12579k

    /* renamed from: a */
    public final C9870g f27364a;
    @C12579k

    /* renamed from: b */
    public final C9853d f27365b;
    @C12579k

    /* renamed from: c */
    public final String f27366c = "id";
    @C12579k

    /* renamed from: d */
    public final String f27367d = "status";
    @C12579k

    /* renamed from: e */
    public final String f27368e = "created_at";
    @C12579k

    /* renamed from: f */
    public final String f27369f = "last_modified_at";
    @C12579k

    /* renamed from: g */
    public final String f27370g = "";
    @C12579k

    /* renamed from: h */
    public final String f27371h = "/";
    @C12579k

    /* renamed from: i */
    public final String f27372i = "Location";
    @C12579k

    /* renamed from: j */
    public final String f27373j = "form_id";
    @C12579k

    /* renamed from: k */
    public final String f27374k = C9259x.f25239v;
    @C12579k

    /* renamed from: l */
    public final String f27375l = "targeting_options_id";
    @C12579k

    /* renamed from: m */
    public final String f27376m = "views";

    public CampaignService(@C12579k C9870g gVar, @C12579k C9853d dVar) {
        Intrinsics.checkNotNullParameter(gVar, "client");
        Intrinsics.checkNotNullParameter(dVar, "requestBuilder");
        this.f27364a = gVar;
        this.f27365b = dVar;
    }

    /* renamed from: e */
    public final /* synthetic */ C11907e mo20749e(String str, ConcurrentMap concurrentMap) {
        Intrinsics.checkNotNullParameter(str, "campaignFormId");
        Intrinsics.checkNotNullParameter(concurrentMap, "customVariables");
        C9872i c = this.f27365b.mo20276c(str);
        return ExtensionFlowKt.m38302c(ExtensionFlowKt.m38301b(this.f27364a, c), new CampaignService$getCampaignForm$1(concurrentMap), new CampaignService$getCampaignForm$2(c));
    }

    /* renamed from: f */
    public final /* synthetic */ C11907e mo20750f(String str) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        C9872i e = this.f27365b.mo20278e(str);
        return ExtensionFlowKt.m38302c(ExtensionFlowKt.m38301b(this.f27364a, e), new CampaignService$getCampaignInfo$1(this), new CampaignService$getCampaignInfo$2(e));
    }

    /* renamed from: g */
    public final /* synthetic */ C11907e mo20751g(String str) {
        Intrinsics.checkNotNullParameter(str, "appId");
        C9872i g = this.f27365b.mo20280g(str);
        return ExtensionFlowKt.m38302c(ExtensionFlowKt.m38301b(this.f27364a, g), new CampaignService$getCampaigns$1(this), new CampaignService$getCampaigns$2(g));
    }

    /* renamed from: h */
    public final /* synthetic */ C11907e mo20752h(List list) {
        Intrinsics.checkNotNullParameter(list, "targetingIds");
        C9872i j = this.f27365b.mo20283j(list);
        return ExtensionFlowKt.m38302c(ExtensionFlowKt.m38301b(this.f27364a, j), CampaignService$getTargetingOptions$1.f27377f, new CampaignService$getTargetingOptions$2(j));
    }

    /* renamed from: i */
    public final List<C9831a> mo20753i(ArrayList<JSONObject> arrayList) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject : arrayList) {
            try {
                Result.C10852a aVar = Result.f28060a;
                String string = jSONObject.getString(this.f27366c);
                Intrinsics.checkNotNullExpressionValue(string, "item.getString(campaignId)");
                String string2 = jSONObject.getString(this.f27367d);
                Intrinsics.checkNotNullExpressionValue(string2, "item.getString(campaignStatus)");
                String string3 = jSONObject.getString(this.f27375l);
                Intrinsics.checkNotNullExpressionValue(string3, "item.getString(targetingId)");
                String string4 = jSONObject.getString(this.f27373j);
                Intrinsics.checkNotNullExpressionValue(string4, "item.getString(formId)");
                String string5 = jSONObject.getString(this.f27368e);
                Intrinsics.checkNotNullExpressionValue(string5, "item.getString(createdAt)");
                String optString = jSONObject.optString(this.f27369f);
                Intrinsics.checkNotNullExpressionValue(optString, "item.optString(lastModified)");
                obj = Result.m38702b(new C9831a(string, string2, 0, string3, string4, string5, optString, BannerPosition.f27325a.mo20708a(jSONObject.getString(this.f27374k)), (TargetingOptionsModel) null, 256, (DefaultConstructorMarker) null));
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj = Result.m38702b(C11661u0.m45734a(th));
            }
            if (Result.m38709i(obj)) {
                obj = null;
            }
            C9831a aVar3 = (C9831a) obj;
            if (aVar3 != null) {
                arrayList2.add(aVar3);
            }
        }
        return arrayList2;
    }

    /* renamed from: j */
    public final /* synthetic */ C11907e mo20754j(String str) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        C9872i a = this.f27365b.mo20274a(str, new JSONObject(C10975r0.m41401k(C11078d1.m42659a(this.f27376m, 1))));
        return ExtensionFlowKt.m38302c(ExtensionFlowKt.m38301b(this.f27364a, a), CampaignService$submitCampaignIsShownOnce$1.f27378f, new CampaignService$submitCampaignIsShownOnce$2(a));
    }

    /* renamed from: k */
    public final /* synthetic */ C11907e mo20755k(String str, String str2, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "feedbackId");
        Intrinsics.checkNotNullParameter(str2, "campaignId");
        Intrinsics.checkNotNullParameter(jSONObject, "payload");
        C9872i k = this.f27365b.mo20284k(str, str2, jSONObject);
        return ExtensionFlowKt.m38302c(ExtensionFlowKt.m38301b(this.f27364a, k), CampaignService$submitCampaignPatch$1.f27379f, new CampaignService$submitCampaignPatch$2(k));
    }

    /* renamed from: l */
    public final /* synthetic */ C11907e mo20756l(String str, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        Intrinsics.checkNotNullParameter(jSONObject, "payload");
        C9872i i = this.f27365b.mo20282i(str, jSONObject);
        return ExtensionFlowKt.m38302c(ExtensionFlowKt.m38301b(this.f27364a, i), new CampaignService$submitCampaignPost$1(this), new CampaignService$submitCampaignPost$2(i));
    }
}
