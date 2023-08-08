package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.internal.f */
public class C33526f {

    /* renamed from: f */
    public static final String f81570f = "configs_key";

    /* renamed from: g */
    public static final String f81571g = "fetch_time_key";

    /* renamed from: h */
    public static final String f81572h = "abt_experiments_key";

    /* renamed from: i */
    public static final String f81573i = "personalization_metadata_key";

    /* renamed from: j */
    public static final Date f81574j = new Date(0);

    /* renamed from: a */
    public JSONObject f81575a;

    /* renamed from: b */
    public JSONObject f81576b;

    /* renamed from: c */
    public Date f81577c;

    /* renamed from: d */
    public JSONArray f81578d;

    /* renamed from: e */
    public JSONObject f81579e;

    /* renamed from: com.google.firebase.remoteconfig.internal.f$b */
    public static class C33528b {

        /* renamed from: a */
        public JSONObject f81580a;

        /* renamed from: b */
        public Date f81581b;

        /* renamed from: c */
        public JSONArray f81582c;

        /* renamed from: d */
        public JSONObject f81583d;

        /* renamed from: a */
        public C33526f mo97308a() throws JSONException {
            return new C33526f(this.f81580a, this.f81581b, this.f81582c, this.f81583d);
        }

        /* renamed from: b */
        public C33528b mo97309b(Map<String, String> map) {
            this.f81580a = new JSONObject(map);
            return this;
        }

        /* renamed from: c */
        public C33528b mo97310c(JSONObject jSONObject) {
            try {
                this.f81580a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: d */
        public C33528b mo97311d(JSONArray jSONArray) {
            try {
                this.f81582c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: e */
        public C33528b mo97312e(Date date) {
            this.f81581b = date;
            return this;
        }

        /* renamed from: f */
        public C33528b mo97313f(JSONObject jSONObject) {
            try {
                this.f81583d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public C33528b() {
            this.f81580a = new JSONObject();
            this.f81581b = C33526f.f81574j;
            this.f81582c = new JSONArray();
            this.f81583d = new JSONObject();
        }

        public C33528b(C33526f fVar) {
            this.f81580a = fVar.mo97302d();
            this.f81581b = fVar.mo97303e();
            this.f81582c = fVar.mo97301c();
            this.f81583d = fVar.mo97305f();
        }
    }

    /* renamed from: b */
    public static C33526f m135136b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(f81573i);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new C33526f(jSONObject.getJSONObject(f81570f), new Date(jSONObject.getLong(f81571g)), jSONObject.getJSONArray(f81572h), optJSONObject);
    }

    /* renamed from: g */
    public static C33528b m135137g() {
        return new C33528b();
    }

    /* renamed from: h */
    public static C33528b m135138h(C33526f fVar) {
        return new C33528b(fVar);
    }

    /* renamed from: c */
    public JSONArray mo97301c() {
        return this.f81578d;
    }

    /* renamed from: d */
    public JSONObject mo97302d() {
        return this.f81576b;
    }

    /* renamed from: e */
    public Date mo97303e() {
        return this.f81577c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33526f)) {
            return false;
        }
        return this.f81575a.toString().equals(((C33526f) obj).toString());
    }

    /* renamed from: f */
    public JSONObject mo97305f() {
        return this.f81579e;
    }

    public int hashCode() {
        return this.f81575a.hashCode();
    }

    public String toString() {
        return this.f81575a.toString();
    }

    public C33526f(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f81570f, jSONObject);
        jSONObject3.put(f81571g, date.getTime());
        jSONObject3.put(f81572h, jSONArray);
        jSONObject3.put(f81573i, jSONObject2);
        this.f81576b = jSONObject;
        this.f81577c = date;
        this.f81578d = jSONArray;
        this.f81579e = jSONObject2;
        this.f81575a = jSONObject3;
    }
}
