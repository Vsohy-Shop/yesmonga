package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.google.android.gms.ads.identifier.C40365a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.s */
public class C34987s {
    @C0359n0
    /* renamed from: c */
    public static JSONArray m143347c(@C0359n0 JSONObject jSONObject, @C0359n0 String str) {
        JSONArray jSONArray = new JSONArray();
        if (jSONObject.has("purposeID")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("id", jSONObject.getString("purposeID"));
                jSONObject2.put("TransactionType", str);
                jSONArray.put(jSONObject2);
            } catch (JSONException e) {
                OTLogger.m143457l("GoogleAdInfo", "Error on getting Google Ad purposeID. Error = " + e.getMessage());
            }
        }
        return jSONArray;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m143348d(Context context, JSONObject jSONObject) {
        OTLogger.m143458m("GoogleAdInfo", "Getting AdvertisingIdClient info in BG thread");
        try {
            boolean b = C40365a.m164196a(context).mo133251b();
            if (new C35015e(context).mo104009u(b)) {
                mo103850f(context, jSONObject, b);
            }
        } catch (Exception e) {
            OTLogger.m143457l("GoogleAdInfo", "Error on saveAndConsentLogGooglePermissionState. Error = " + e.getMessage());
        }
    }

    /* renamed from: e */
    public static void m143349e(@C0359n0 Context context, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str) {
        String str2;
        String str3;
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        if (jSONObject.has("ConsentIntegration")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("ConsentIntegration");
            if (optJSONObject != null) {
                str3 = optJSONObject.optString("RequestInformation");
                str2 = optJSONObject.optString("ConsentApi");
            } else {
                str3 = null;
                str2 = null;
            }
            try {
                jSONObject3.put("identifier", new C34981m(context).mo103790j());
                jSONObject3.put("purposes", m143347c(jSONObject2, str));
                jSONObject3.put("requestInformation", str3);
                jSONObject4.put("consentApi", str2);
                jSONObject4.put("consentPayload", jSONObject3);
            } catch (JSONException e) {
                OTLogger.m143457l("GoogleAdInfo", "Error in creating Google Ad CL payload :" + e.getMessage());
            }
        }
        new C34980l(context).mo103775b(jSONObject4);
    }

    @C0344h1
    @C0359n0
    /* renamed from: b */
    public String mo103849b(boolean z) {
        return z ? "OPT_OUT" : "CONFIRMED";
    }

    @C0344h1
    /* renamed from: f */
    public void mo103850f(@C0359n0 Context context, @C0359n0 JSONObject jSONObject, boolean z) {
        mo103852h(context, jSONObject, z);
    }

    /* renamed from: g */
    public void mo103851g(@C0359n0 Context context, @C0359n0 JSONObject jSONObject) {
        new Thread(new C34986r(this, context, jSONObject)).start();
    }

    /* renamed from: h */
    public final void mo103852h(@C0359n0 Context context, @C0359n0 JSONObject jSONObject, boolean z) {
        m143349e(context, new C35015e(context).mo104006r(), jSONObject, mo103849b(z));
    }
}
