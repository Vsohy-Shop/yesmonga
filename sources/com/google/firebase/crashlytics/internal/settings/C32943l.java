package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.C32723r;
import com.google.firebase.crashlytics.internal.settings.C32932d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.internal.settings.l */
public class C32943l implements C32939h {
    /* renamed from: b */
    public static C32932d.C32933a m133133b(JSONObject jSONObject) {
        return new C32932d.C32933a(jSONObject.optBoolean(C32937f.f80036j, true), jSONObject.optBoolean(C32937f.f80037k, false), jSONObject.optBoolean(C32937f.f80038l, false));
    }

    /* renamed from: c */
    public static C32932d.C32934b m133134c(JSONObject jSONObject) {
        return new C32932d.C32934b(jSONObject.optInt(C32937f.f80043q, 8), 4);
    }

    /* renamed from: d */
    public static long m133135d(C32723r rVar, long j, JSONObject jSONObject) {
        if (jSONObject.has(C32937f.f80027a)) {
            return jSONObject.optLong(C32937f.f80027a);
        }
        return rVar.mo94989a() + (j * 1000);
    }

    /* renamed from: a */
    public C32932d mo95595a(C32723r rVar, JSONObject jSONObject) throws JSONException {
        C32932d.C32934b bVar;
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt(C32937f.f80029c, 0);
        int optInt2 = jSONObject2.optInt(C32937f.f80031e, 3600);
        double optDouble = jSONObject2.optDouble(C32937f.f80032f, 10.0d);
        double optDouble2 = jSONObject2.optDouble(C32937f.f80033g, 1.2d);
        int optInt3 = jSONObject2.optInt(C32937f.f80034h, 60);
        if (jSONObject2.has(C32937f.f80028b)) {
            bVar = m133134c(jSONObject2.getJSONObject(C32937f.f80028b));
        } else {
            bVar = m133134c(new JSONObject());
        }
        return new C32932d(m133135d(rVar, (long) optInt2, jSONObject2), bVar, m133133b(jSONObject2.getJSONObject("features")), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
