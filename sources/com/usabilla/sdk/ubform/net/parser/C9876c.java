package com.usabilla.sdk.ubform.net.parser;

import com.usabilla.sdk.ubform.eventengine.C9834c;
import com.usabilla.sdk.ubform.eventengine.TargetingOptionsModel;
import com.usabilla.sdk.ubform.eventengine.rules.Rule;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.net.parser.c */
public final class C9876c implements C9875b<TargetingOptionsModel> {
    @C12579k

    /* renamed from: a */
    public static final C9876c f27082a = new C9876c();
    @C12579k

    /* renamed from: b */
    public static final String f27083b = "id";
    @C12579k

    /* renamed from: c */
    public static final String f27084c = "last_modified_at";
    @C12579k

    /* renamed from: d */
    public static final String f27085d = "options";
    @C12579k

    /* renamed from: e */
    public static final String f27086e = "rule";

    @C12579k
    /* renamed from: b */
    public TargetingOptionsModel mo20320a(@C12579k JSONObject jSONObject) {
        String str;
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        JSONObject jSONObject2 = jSONObject.getJSONObject("options").getJSONObject("rule");
        C9834c cVar = C9834c.f26896a;
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "ruleJson");
        Rule b = cVar.mo20225b(jSONObject2);
        String string = jSONObject.getString("id");
        if (jSONObject.has("last_modified_at")) {
            str = jSONObject.getString("last_modified_at");
        } else {
            str = null;
        }
        Intrinsics.checkNotNullExpressionValue(string, "id");
        return new TargetingOptionsModel(b, string, str);
    }

    @C12579k
    /* renamed from: c */
    public final JSONObject mo20341c(@C12579k TargetingOptionsModel targetingOptionsModel) {
        Intrinsics.checkNotNullParameter(targetingOptionsModel, "targetingOptionsModel");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("rule", C9834c.f26896a.mo20227d(targetingOptionsModel.mo20193h()));
        C11079d2 d2Var = C11079d2.f28267a;
        jSONObject.put("options", jSONObject2);
        jSONObject.put("id", targetingOptionsModel.mo20191f());
        String g = targetingOptionsModel.mo20192g();
        if (g != null) {
            jSONObject.put("last_modified_at", g);
        }
        return jSONObject;
    }
}
