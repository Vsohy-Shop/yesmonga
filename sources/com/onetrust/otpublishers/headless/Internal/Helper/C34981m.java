package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Models.C34997a;
import com.onetrust.otpublishers.headless.Internal.Network.C35006f;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.m */
public class C34981m {

    /* renamed from: a */
    public C35014d f85094a;

    /* renamed from: b */
    public C35015e f85095b;

    public C34981m(@C0359n0 Context context) {
        C35014d dVar = new C35014d(context, "OTT_DEFAULT_USER");
        this.f85094a = dVar;
        this.f85095b = new C35015e(dVar);
    }

    /* renamed from: a */
    public void mo103781a() {
        this.f85094a.mo103965b().edit().putString("consentPayload", "").apply();
    }

    /* renamed from: b */
    public void mo103782b(int i) {
        this.f85095b.mo103998i(i);
    }

    /* renamed from: c */
    public void mo103783c(@C0359n0 Context context, @C0359n0 String str) {
        OTLogger.m143458m("consentLoggingDH", "override data subject identifier : " + str);
        JSONObject jSONObject = new JSONObject();
        if (!mo103790j().equals(str)) {
            mo103788h(str);
            mo103791k();
            if (!C35020d.m143605J(mo103789i())) {
                jSONObject = new JSONObject(mo103789i());
            }
            if (jSONObject.length() > 0 && new C34968c(context).mo103650d()) {
                OTLogger.m143458m("consentLoggingDH", "Consent logging with overridden data subject identifier");
                if (jSONObject.getJSONObject("consentPayload").getJSONArray("purposes").length() > 0) {
                    new C35006f(context).mo103950r("https://cookies2-ds.dev.otdev.org/request/v1/", jSONObject.getString("consentApi"), jSONObject.getJSONObject("consentPayload").toString(), 1);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo103784d(@C0359n0 C34997a aVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("identifier", aVar.mo103919d().mo103920a());
        jSONObject.put("purposes", aVar.mo103919d().mo103923d());
        jSONObject.put("requestInformation", aVar.mo103919d().mo103925f());
        jSONObject2.put("consentApi", aVar.mo103916a());
        jSONObject2.put("consentPayload", jSONObject);
        OTLogger.m143447b("consent data", "data" + jSONObject2);
        mo103785e(jSONObject2.toString());
        this.f85094a.mo103965b().edit().putString("OT_CL_DEFAULT_PAYLOAD", jSONObject2.toString()).apply();
        mo103792l();
    }

    /* renamed from: e */
    public void mo103785e(@C0359n0 String str) {
        this.f85094a.mo103965b().edit().putString("OTT_CONSENT_LOG_DATA", str).apply();
    }

    /* renamed from: f */
    public void mo103786f(@C0359n0 JSONObject jSONObject) {
        this.f85094a.mo103965b().edit().putString("OTT_CONSENT_LOG_DATA", jSONObject.toString()).apply();
    }

    /* renamed from: g */
    public void mo103787g() {
        this.f85094a.mo103965b().edit().putString("OT_CL_DEFAULT_PAYLOAD", "").apply();
    }

    /* renamed from: h */
    public void mo103788h(@C0359n0 String str) {
        this.f85095b.mo103968C(str);
    }

    @C0359n0
    /* renamed from: i */
    public String mo103789i() {
        return this.f85094a.mo103965b().getString("OTT_CONSENT_LOG_DATA", "");
    }

    @C0363p0
    /* renamed from: j */
    public String mo103790j() {
        return this.f85095b.mo103967B();
    }

    /* renamed from: k */
    public void mo103791k() {
        try {
            if (!C35020d.m143605J(mo103789i())) {
                OTLogger.m143458m("consentLoggingDH", "setting DSID to Consent payload");
                JSONObject jSONObject = new JSONObject(mo103789i());
                String j = mo103790j();
                jSONObject.getJSONObject("consentPayload").put("identifier", j);
                mo103785e(jSONObject.toString());
                if (!this.f85094a.mo103965b().getString("OT_CL_DEFAULT_PAYLOAD", "").isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject(this.f85094a.mo103965b().getString("OT_CL_DEFAULT_PAYLOAD", ""));
                    jSONObject2.getJSONObject("consentPayload").put("identifier", j);
                    this.f85094a.mo103965b().edit().putString("OT_CL_DEFAULT_PAYLOAD", jSONObject2.toString()).apply();
                }
            }
        } catch (Exception e) {
            OTLogger.m143457l("consentLoggingDH", "error while setting DSID to consent payload" + e.getMessage());
        }
    }

    /* renamed from: l */
    public final void mo103792l() {
        if (!this.f85094a.mo103965b().getString("OT_CL_DEFAULT_PAYLOAD", "").isEmpty()) {
            String string = this.f85094a.mo103965b().getString("OT_CL_DEFAULT_PAYLOAD", "");
            String string2 = this.f85094a.mo103965b().getString("OT_CL_DEFAULT_TRANSACTION_VALUES", "");
            JSONObject jSONObject = new JSONObject(string);
            jSONObject.getJSONObject("consentPayload").put("purposes", new JSONArray(string2));
            OTLogger.m143447b("consentLoggingDH", "default payload " + jSONObject);
            this.f85094a.mo103965b().edit().putString("OT_CL_DEFAULT_PAYLOAD", jSONObject.toString()).apply();
        }
    }
}
