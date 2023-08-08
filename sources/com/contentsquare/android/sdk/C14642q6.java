package com.contentsquare.android.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.q6 */
public class C14642q6 {

    /* renamed from: a */
    public final long f36259a = System.currentTimeMillis();

    /* renamed from: b */
    public final C14453jf f36260b = new C14453jf("ConfigurationHelper");

    /* renamed from: c */
    public final C14643q7 f36261c;

    /* renamed from: d */
    public final C14213b7 f36262d;

    public C14642q6(C14643q7 q7Var, C14213b7 b7Var) {
        this.f36261c = q7Var;
        this.f36262d = b7Var;
    }

    /* renamed from: a */
    public String mo36231a() {
        String d = this.f36261c.mo35997d("uid_config", (String) null);
        this.f36260b.mo35681l("retrieving last USER ID config from preferences", new Object[0]);
        if (C14358g3.m61811e(d)) {
            this.f36260b.mo35681l("last USER ID config is null", new Object[0]);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(d);
            if (this.f36259a - jSONObject.getLong("timestamp") > 33696000000L) {
                this.f36260b.mo35681l("last USER ID is outdated, returning null", new Object[0]);
                this.f36261c.mo36234m();
                return null;
            }
            this.f36260b.mo35681l("last USER ID is valid, returning USER ID from preferences %s", jSONObject.getString("uid"));
            return jSONObject.getString("uid");
        } catch (JSONException e) {
            this.f36260b.mo35678g(e, "failed to deserialize last USER ID config with an exception", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public void mo36232b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", str);
            jSONObject.put("timestamp", System.currentTimeMillis());
            this.f36261c.mo36002j("uid_config", jSONObject.toString());
            this.f36262d.mo34681m(C14477k8.USER_ID, jSONObject.toString());
            this.f36260b.mo35676e("Saving USER ID config to sharedPrefs.");
        } catch (JSONException e) {
            this.f36260b.mo35678g(e, "Failed to serialize and store the USER ID config.", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo36233c() {
        this.f36260b.mo35676e("Resetting all config in sharedPrefs.");
        this.f36261c.mo36234m();
    }
}
