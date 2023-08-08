package com.contentsquare.android.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.n7 */
public class C14546n7 {

    /* renamed from: a */
    public final C14453jf f36005a = new C14453jf("JsonStyleView");

    /* renamed from: b */
    public int f36006b;

    /* renamed from: c */
    public int f36007c;

    /* renamed from: d */
    public int f36008d;

    /* renamed from: e */
    public int f36009e;

    /* renamed from: f */
    public String f36010f;

    /* renamed from: g */
    public String f36011g;

    /* renamed from: h */
    public boolean f36012h;

    /* renamed from: i */
    public float f36013i;

    /* renamed from: a */
    public int mo35967a() {
        return this.f36007c;
    }

    /* renamed from: b */
    public void mo35968b(float f) {
        this.f36013i = f;
    }

    /* renamed from: c */
    public void mo35969c(int i) {
        this.f36007c = i;
    }

    /* renamed from: d */
    public void mo35970d(String str) {
        this.f36011g = str;
    }

    /* renamed from: e */
    public void mo35971e(boolean z) {
        this.f36012h = z;
    }

    /* renamed from: f */
    public int mo35972f() {
        return this.f36008d;
    }

    /* renamed from: g */
    public void mo35973g(int i) {
        this.f36008d = i;
    }

    /* renamed from: h */
    public void mo35974h(String str) {
        this.f36010f = str;
    }

    /* renamed from: i */
    public int mo35975i() {
        return this.f36009e;
    }

    /* renamed from: j */
    public void mo35976j(int i) {
        this.f36009e = i;
    }

    /* renamed from: k */
    public float mo35977k() {
        return this.f36013i;
    }

    /* renamed from: l */
    public void mo35978l(int i) {
        this.f36006b = i;
    }

    /* renamed from: m */
    public int mo35979m() {
        return this.f36006b;
    }

    /* renamed from: n */
    public boolean mo35980n() {
        return this.f36012h;
    }

    /* renamed from: o */
    public JSONObject mo35981o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("height", mo35967a());
            jSONObject.put("width", mo35979m());
            jSONObject.put("x", mo35972f());
            jSONObject.put("y", mo35975i());
            String str = this.f36010f;
            if (str != null) {
                jSONObject.put("bmp", str);
            }
            String str2 = this.f36011g;
            if (str2 != null) {
                jSONObject.put("bg", str2);
                jSONObject.put("alpha", (double) mo35977k());
            }
            jSONObject.put("visibility", mo35980n());
        } catch (JSONException e) {
            this.f36005a.mo35680j(e, "Failed to build style object.", new Object[0]);
        }
        return jSONObject;
    }
}
