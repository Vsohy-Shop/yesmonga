package com.usabilla.sdk.ubform.telemetry;

import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.C12579k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.telemetry.f */
public final class C10111f implements C10109d {
    @C12579k
    /* renamed from: a */
    public JSONArray mo21553a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C10108c.f27798a);
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object obj = jSONObject.get("i");
            JSONArray jSONArray2 = (JSONArray) jSONObject.remove(C10108c.f27798a);
            if (jSONArray2 != null) {
                int length = jSONArray2.length();
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                        jSONObject2.put("i", obj);
                        jSONArray.put(jSONObject2);
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    @C12579k
    /* renamed from: b */
    public String mo21554b(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, C10108c.f27798a);
        JSONArray jSONArray = new JSONArray(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        JSONObject jSONObject = null;
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            try {
                JSONObject jSONObject2 = new JSONObject((String) next);
                Object remove = jSONObject2.remove("i");
                if (i == 0) {
                    jSONObject = (JSONObject) remove;
                }
                jSONArray.put(jSONObject2);
            } catch (JSONException unused) {
            }
            i = i2;
        }
        C11079d2 d2Var = C11079d2.f28267a;
        if (jSONObject == null) {
            return "";
        }
        String jSONObject3 = new JSONObject().put("i", jSONObject).put(C10108c.f27798a, jSONArray).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "JSONObject()\n                    .put(TELEMETRY_EXTRA_NON_CHANGING_METADATA, it)\n                    .put(TELEMETRY_KEY_WIRE_FORMAT_LOGS_ARRAY, wireFormatLogs)\n                    .toString()");
        return jSONObject3;
    }
}
