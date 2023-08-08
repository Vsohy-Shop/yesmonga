package com.contentsquare.android.sdk;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.c8 */
public class C14249c8 {

    /* renamed from: a */
    public String f35195a;

    /* renamed from: b */
    public JSONObject f35196b;

    /* renamed from: c */
    public List<C14249c8> f35197c;

    /* renamed from: d */
    public JSONObject f35198d;

    /* renamed from: e */
    public JSONArray f35199e;

    /* renamed from: f */
    public JSONObject f35200f;

    /* renamed from: g */
    public int f35201g = 1;

    /* renamed from: a */
    public List<C14249c8> mo34838a() {
        return this.f35197c;
    }

    /* renamed from: b */
    public void mo34839b(int i) {
        this.f35201g = i;
    }

    /* renamed from: c */
    public void mo34840c(String str) {
        this.f35195a = str;
    }

    /* renamed from: d */
    public void mo34841d(List<C14249c8> list) {
        this.f35197c = list;
    }

    /* renamed from: e */
    public void mo34842e(JSONArray jSONArray) {
        this.f35199e = jSONArray;
    }

    /* renamed from: f */
    public void mo34843f(JSONObject jSONObject) {
        this.f35196b = jSONObject;
    }

    /* renamed from: g */
    public JSONArray mo34844g() {
        return this.f35199e;
    }

    /* renamed from: h */
    public void mo34845h(JSONObject jSONObject) {
        this.f35200f = jSONObject;
    }

    /* renamed from: i */
    public int mo34846i() {
        return this.f35201g;
    }

    /* renamed from: j */
    public void mo34847j(JSONObject jSONObject) {
        this.f35198d = jSONObject;
    }

    /* renamed from: k */
    public String mo34848k() {
        return this.f35195a;
    }

    /* renamed from: l */
    public JSONObject mo34849l() {
        return this.f35196b;
    }

    /* renamed from: m */
    public JSONObject mo34850m() {
        return this.f35200f;
    }

    /* renamed from: n */
    public JSONObject mo34851n() {
        return this.f35198d;
    }

    /* renamed from: o */
    public JSONObject mo34852o() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObject.put("id", mo34848k());
        jSONObject.put("style", mo34850m());
        jSONObject.put("format", mo34846i());
        jSONObject.put("metadata", mo34849l());
        if (mo34838a() != null) {
            for (C14249c8 o : mo34838a()) {
                jSONArray.put(o.mo34852o());
            }
            jSONObject.put("children", jSONArray);
        }
        if (mo34844g() != null) {
            jSONObject.put("children", mo34844g());
        }
        if (mo34851n() != null) {
            jSONObject.put("children", mo34851n());
        }
        return jSONObject;
    }
}
