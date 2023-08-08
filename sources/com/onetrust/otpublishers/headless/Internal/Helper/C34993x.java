package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Models.C35000d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABTCFKeys;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p073j$.util.DesugarTimeZone;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.x */
public class C34993x {

    /* renamed from: a */
    public final C35015e f85120a;

    /* renamed from: b */
    public final Context f85121b;

    public C34993x(@C0359n0 Context context) {
        this.f85121b = context;
        this.f85120a = new C35015e(context);
    }

    /* renamed from: g */
    public static void m143430g(@C0359n0 JSONObject jSONObject, @C0363p0 String str, boolean z) {
        if (str != null) {
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 1;
                String str2 = z ? "IABV2_" : "ISFV2_";
                jSONObject.put(str2 + i2, Integer.parseInt(str.substring(i, i2)));
                i = i2;
            }
        }
    }

    /* renamed from: l */
    public static void m143431l(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        JSONArray names = jSONObject2.names();
        if (names != null) {
            for (int i = 0; i < names.length(); i++) {
                jSONObject.put(names.getString(i), Integer.parseInt(jSONObject2.getString(names.getString(i))));
            }
        }
    }

    /* renamed from: a */
    public SharedPreferences mo103903a() {
        return this.f85121b.getSharedPreferences("com.onetrust.otpublisherssdk.Internal.preference", 0);
    }

    @C0344h1
    /* renamed from: b */
    public void mo103904b(int i) {
        C35020d dVar = new C35020d();
        if (dVar.mo104026a(this.f85121b) < 1 && i == 1) {
            dVar.mo104028i(this.f85121b, 1);
        }
    }

    /* renamed from: c */
    public final void mo103905c(long j) {
        if (j != -1) {
            this.f85120a.mo103972G(String.valueOf(j));
        }
    }

    @C0344h1
    /* renamed from: d */
    public void mo103906d(@C0363p0 String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C34985q qVar = new C34985q(this.f85121b);
                qVar.mo103844b(1, jSONObject.optString("country"), jSONObject.optString("state"));
                qVar.mo103844b(3, jSONObject.optString("country"), jSONObject.optString("state"));
                OTLogger.m143460o("OTSDKMigration", "Saving Consent given location from Web SDK, country : " + jSONObject.optString("country") + "state : " + jSONObject.optString("state"));
            } catch (Exception e) {
                OTLogger.m143447b("OTSDKMigration", "Error while migrating consent given location, err : " + e.getMessage());
            }
        }
    }

    /* renamed from: e */
    public void mo103907e(@C0359n0 JSONObject jSONObject) {
        this.f85120a.mo104003o(1);
        JSONObject jSONObject2 = new JSONObject();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f85121b);
        SharedPreferences a = mo103903a();
        String string = defaultSharedPreferences.getString("optanonCookieConsentGroups", "");
        String string2 = defaultSharedPreferences.getString("completeOptanonCookie", "");
        String string3 = defaultSharedPreferences.getString("OTuserConsentGivenLocation", "");
        int i = a.getInt("OT_BANNER_SHOWN_TO_USER", -1);
        String string4 = defaultSharedPreferences.getString(OTIABTCFKeys.IABTCF_SPECIALFEATURESOPTINS, "");
        String string5 = defaultSharedPreferences.getString(OTIABTCFKeys.IABTCF_PURPOSECONSENTS, "");
        String string6 = defaultSharedPreferences.getString(OTIABTCFKeys.IABTCF_PURPOSELEGITIMATEINTERESTS, "");
        String string7 = defaultSharedPreferences.getString(OTIABTCFKeys.IABTCF_VENDORCONSENTS, "");
        String string8 = defaultSharedPreferences.getString(OTIABTCFKeys.IABTCF_VENDORLEGITIMATEINTERESTS, "");
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (!C35020d.m143605J(string)) {
                jSONObject3 = new JSONObject(string);
            }
            JSONArray jSONArray = new JSONArray(new JSONTokener(string2).nextValue().toString());
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray.length()) {
                    break;
                } else if (jSONArray.getJSONObject(i2).optString("name", "").equals("OptanonAlertBoxClosed")) {
                    jSONObject2 = jSONArray.getJSONObject(i2);
                    break;
                } else {
                    i2++;
                }
            }
            mo103912k(jSONObject2);
            mo103906d(string3);
            mo103904b(i);
            m143431l(jSONObject, jSONObject3);
            mo103908f(jSONObject, string4, string5, string6, string7, string8, jSONObject2);
            if (this.f85120a.mo103981P() != 6) {
                this.f85120a.mo104003o(3);
            }
        } catch (JSONException e) {
            this.f85120a.mo104003o(2);
            OTLogger.m143457l("OneTrust", "error while syncing data from Web SDK, err: " + e.getMessage());
        }
    }

    /* renamed from: f */
    public final void mo103908f(@C0359n0 JSONObject jSONObject, @C0363p0 String str, @C0363p0 String str2, @C0363p0 String str3, @C0363p0 String str4, @C0363p0 String str5, @C0359n0 JSONObject jSONObject2) {
        JSONObject z = this.f85120a.mo104014z();
        C34991v vVar = new C34991v(this.f85121b);
        if (!new C35000d(this.f85121b).mo103932c(z)) {
            vVar.mo103892d(str2, str3, str);
            JSONObject b = this.f85120a.mo103991b();
            if (jSONObject2.has("value")) {
                if (b != null) {
                    vVar.mo103891c(str4, str5);
                } else if (this.f85120a.mo103987V().startsWith("IAB")) {
                    this.f85120a.mo104003o(6);
                }
            }
            m143430g(jSONObject, str, false);
            m143430g(jSONObject, str2, true);
            return;
        }
        mo103909h(jSONObject, z);
    }

    @C0344h1
    /* renamed from: h */
    public void mo103909h(@C0359n0 JSONObject jSONObject, @C0363p0 JSONObject jSONObject2) {
        JSONArray jSONArray = new JSONArray();
        C34970d dVar = new C34970d(this.f85121b);
        C35014d dVar2 = new C35014d(this.f85121b, "OTT_DEFAULT_USER");
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.getJSONArray("Groups");
        }
        if (this.f85120a.mo103979N() != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                dVar.mo103694m(jSONArray, jSONObject, i);
            }
            dVar2.mo103965b().edit().putString("OTT_CONSENT_STATUS", jSONObject.toString()).apply();
            String string = dVar2.mo103965b().getString("OT_IAB_DEFAULT_AVL", "");
            if (!C35020d.m143605J(string)) {
                dVar2.mo103965b().edit().putString("OT_IAB_ACTIVE_VENDORLIST", string).apply();
            }
        }
    }

    /* renamed from: i */
    public long mo103910i(@C0363p0 String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        if (str == null) {
            return -1;
        }
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return -1;
        } catch (ParseException e) {
            OTLogger.m143457l("OTSDKMigration", "Error while migrating consent given time, err : " + e.getMessage());
            return -1;
        }
    }

    @C0359n0
    /* renamed from: j */
    public String mo103911j() {
        return mo103903a().getString("APPLICATION_ID_TO_LOAD", "");
    }

    /* renamed from: k */
    public final void mo103912k(@C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("value")) {
            String string = jSONObject.getString("value");
            if (!C35020d.m143605J(string)) {
                mo103905c(mo103910i(string));
                OTLogger.m143460o("OTSDKMigration", "Saving Consent given time from WebSDK");
            }
        }
    }
}
