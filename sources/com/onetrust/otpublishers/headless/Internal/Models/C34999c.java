package com.onetrust.otpublishers.headless.Internal.Models;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Models.c */
public class C34999c {

    /* renamed from: a */
    public JSONObject f85135a = new JSONObject();

    /* renamed from: b */
    public C35014d f85136b;

    /* renamed from: c */
    public Context f85137c;

    public C34999c(@C0359n0 Context context) {
        this.f85136b = new C35014d(context, "OTT_DEFAULT_USER");
        this.f85137c = context;
    }

    /* renamed from: a */
    public static String m143473a(@C0359n0 Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    /* renamed from: b */
    public void mo103926b(@C0359n0 String str, @C0363p0 String str2) {
        if (!C35020d.m143605J(str2)) {
            this.f85135a.put(str, str2);
        }
    }

    /* renamed from: c */
    public void mo103927c(@C0359n0 JSONObject jSONObject) {
        this.f85136b.mo103965b().edit().putString("OT_DS_DATA_ELEMENT_OBJECT", jSONObject.toString()).apply();
    }

    /* renamed from: d */
    public void mo103928d(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0363p0 String str2, @C0363p0 String str3) {
        mo103926b("InteractionType", str);
        mo103926b("Country", str2);
        if (!C35020d.m143605J(str3)) {
            JSONObject jSONObject2 = new JSONObject(str3);
            if (jSONObject2.has("InteractionType") || jSONObject2.has("Country")) {
                jSONObject2.remove("InteractionType");
                jSONObject2.remove("Country");
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    this.f85135a.put(next, jSONObject2.get(next));
                } catch (JSONException e) {
                    OTLogger.m143457l("DsDataElementPayload", "Error on merging appendedCustomDSElements. Error msg = " + e.getMessage());
                }
            }
        }
        mo103926b("UserAgent", (m143473a(this.f85137c) + "/" + mo103929e(this.f85137c)) + " " + System.getProperty("http.agent"));
        jSONObject.put("dsDataElements", this.f85135a);
        OTLogger.m143458m("DsDataElementPayload", "DS DataElement Object : " + jSONObject.getJSONObject("dsDataElements"));
    }

    /* renamed from: e */
    public String mo103929e(@C0359n0 Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 1).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            OTLogger.m143457l("DsDataElementPayload", "Error on getting Application versionName. Error msg = " + e.getMessage());
            return "";
        }
    }
}
