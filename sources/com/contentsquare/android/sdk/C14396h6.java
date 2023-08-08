package com.contentsquare.android.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.h6 */
public class C14396h6 {

    /* renamed from: a */
    public String f35595a;

    /* renamed from: b */
    public String f35596b;

    /* renamed from: c */
    public int f35597c;

    /* renamed from: a */
    public int mo35493a() {
        return this.f35597c;
    }

    /* renamed from: b */
    public void mo35494b(int i) {
        this.f35597c = i;
    }

    /* renamed from: c */
    public void mo35495c(String str) {
        this.f35595a = str;
    }

    /* renamed from: d */
    public String mo35496d() {
        return this.f35595a;
    }

    /* renamed from: e */
    public void mo35497e(String str) {
        this.f35596b = str;
    }

    /* renamed from: f */
    public String mo35498f() {
        return this.f35596b;
    }

    /* renamed from: g */
    public JSONObject mo35499g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class_name", mo35496d());
            jSONObject.put("fullpath", mo35498f());
            jSONObject.put("child_order", mo35493a());
        } catch (JSONException e) {
            new C14453jf("JsonMetadataView").mo35681l("Failed to build metadata object %s", e.getMessage());
        }
        return jSONObject;
    }
}
