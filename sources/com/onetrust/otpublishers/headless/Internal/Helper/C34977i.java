package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Internal.C35017a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Public.Keys.OTBroadcastServiceKeys;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.i */
public class C34977i {

    /* renamed from: a */
    public Context f85088a;

    public C34977i(Context context) {
        this.f85088a = context;
    }

    /* renamed from: a */
    public void mo103752a(@C0359n0 String str, int i) {
        OTLogger.m143458m("OTConsentChanges", "Sending " + str + " broadcast, value = " + i);
        Intent intent = new Intent(str);
        intent.putExtra(OTBroadcastServiceKeys.EVENT_STATUS, i);
        intent.setPackage(this.f85088a.getApplicationContext().getPackageName());
        this.f85088a.sendBroadcast(intent);
    }

    /* renamed from: b */
    public final void mo103753b(@C0359n0 String str, @C0359n0 JSONObject jSONObject) {
        OTLogger.m143458m("OTConsentChanges", "UCP: Sending " + str + " broadcast, value = " + jSONObject);
        Intent intent = new Intent(str);
        intent.putExtra(OTBroadcastServiceKeys.UCP_EVENT_STATUS, jSONObject.toString());
        intent.setPackage(this.f85088a.getApplicationContext().getPackageName());
        this.f85088a.sendBroadcast(intent);
    }

    /* renamed from: c */
    public void mo103754c(@C0359n0 JSONObject jSONObject) {
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                int i = jSONObject.getInt(next);
                if (2 == i) {
                    i = 1;
                }
                mo103752a(next, i);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OTConsentChanges", "error in broadcasting SDK status. err = " + e.getMessage() + " changedConsents = " + jSONObject.toString());
        }
    }

    /* renamed from: d */
    public boolean mo103755d(@C0359n0 String str, @C0359n0 String str2) {
        return new JSONObject(str2).has(str);
    }

    /* renamed from: e */
    public void mo103756e(@C0359n0 JSONObject jSONObject) {
        String string = new C35014d(this.f85088a, "OTT_DEFAULT_USER").mo103965b().getString("OT_GROUP_ID_OBJECT", "");
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                int i = jSONObject.getInt(next);
                if (mo103755d(next, string)) {
                    mo103752a(next, i);
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OTConsentChanges", "error in broadcasting status. err = " + e.getMessage() + " changedConsents = " + jSONObject.toString());
        }
    }

    /* renamed from: f */
    public void mo103757f(@C0359n0 JSONObject jSONObject) {
        JSONArray names;
        if (!C35017a.m143593c(jSONObject) && (names = jSONObject.names()) != null) {
            int i = 0;
            while (i < names.length()) {
                try {
                    String string = names.getString(i);
                    mo103753b(string, jSONObject.getJSONObject(string));
                    i++;
                } catch (JSONException e) {
                    OTLogger.m143457l("OTConsentChanges", "UCP: Failed to broadcast UCP consent changes," + e.toString());
                    return;
                }
            }
        }
    }
}
