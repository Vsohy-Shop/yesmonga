package com.contentsquare.android.sdk;

import com.google.firebase.C33262n;
import com.urbanairship.channel.C9029l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.qa */
public class C14647qa {

    /* renamed from: a */
    public int f36268a;

    /* renamed from: b */
    public int f36269b;

    /* renamed from: c */
    public int f36270c;

    /* renamed from: d */
    public int f36271d;

    /* renamed from: e */
    public double f36272e = 1.0d;

    /* renamed from: f */
    public String f36273f;

    /* renamed from: g */
    public String f36274g;

    /* renamed from: h */
    public String f36275h;

    /* renamed from: i */
    public String f36276i;

    /* renamed from: j */
    public String f36277j;

    /* renamed from: k */
    public String f36278k;

    /* renamed from: l */
    public String f36279l;

    /* renamed from: m */
    public C14749tb f36280m;

    /* renamed from: n */
    public String f36281n = "";

    /* renamed from: o */
    public C14648a f36282o = C14648a.PerViews;

    /* renamed from: com.contentsquare.android.sdk.qa$a */
    public enum C14648a {
        PerViews("PerViews"),
        Fullscreen("Fullscreen");
        

        /* renamed from: a */
        public final String f36286a;

        /* access modifiers changed from: public */
        C14648a(String str) {
            this.f36286a = str;
        }

        public String toString() {
            return this.f36286a;
        }
    }

    /* renamed from: a */
    public String mo36235a() {
        C14749tb tbVar = this.f36280m;
        return tbVar == null ? "" : tbVar.mo36519a();
    }

    /* renamed from: b */
    public void mo36236b(double d) {
        this.f36272e = d;
    }

    /* renamed from: c */
    public void mo36237c(int i) {
        this.f36270c = i;
    }

    /* renamed from: d */
    public void mo36238d(C14648a aVar) {
        this.f36282o = aVar;
    }

    /* renamed from: e */
    public void mo36239e(C14749tb tbVar) {
        this.f36280m = tbVar;
    }

    /* renamed from: f */
    public void mo36240f(String str) {
        this.f36274g = str;
    }

    /* renamed from: g */
    public JSONObject mo36241g() {
        if (this.f36280m != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_height", this.f36269b);
            jSONObject.put("device_width", this.f36268a);
            jSONObject.put("device_ratio", this.f36272e);
            jSONObject.put(C9029l.f24302e1, this.f36273f);
            jSONObject.put("device_manufacturer", this.f36274g);
            jSONObject.put("version_sdk", this.f36275h);
            jSONObject.put("version_json", this.f36276i);
            jSONObject.put("device_id", this.f36270c);
            jSONObject.put(C33262n.f80891n, this.f36271d);
            jSONObject.put("version_app", this.f36277j);
            jSONObject.put("inapp_user_id", this.f36278k);
            jSONObject.put("url", this.f36279l);
            jSONObject.put("bmp_capture_type", this.f36282o.toString());
            jSONObject.put("screengraph", this.f36280m.mo36524f());
            jSONObject.put("screenshot", this.f36281n);
            return jSONObject;
        }
        throw new JSONException("Object is not valid. We are missing the ScreenGraph data.");
    }

    /* renamed from: h */
    public void mo36242h(int i) {
        this.f36269b = i;
    }

    /* renamed from: i */
    public void mo36243i(String str) {
        this.f36273f = str;
    }

    /* renamed from: j */
    public void mo36244j(int i) {
        this.f36271d = i;
    }

    /* renamed from: k */
    public void mo36245k(String str) {
        this.f36278k = str;
    }

    /* renamed from: l */
    public void mo36246l(int i) {
        this.f36268a = i;
    }

    /* renamed from: m */
    public void mo36247m(String str) {
        this.f36281n = str;
    }

    /* renamed from: n */
    public void mo36248n(String str) {
        this.f36279l = str;
    }

    /* renamed from: o */
    public void mo36249o(String str) {
        this.f36275h = str;
    }

    /* renamed from: p */
    public void mo36250p(String str) {
        this.f36277j = str;
    }

    /* renamed from: q */
    public void mo36251q(String str) {
        this.f36276i = str;
    }
}
