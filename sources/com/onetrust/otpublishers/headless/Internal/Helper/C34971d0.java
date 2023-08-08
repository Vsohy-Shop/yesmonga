package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import androidx.annotation.C0359n0;
import com.carrefour.fid.android.shared.network.interceptors.C28819e;
import com.onetrust.otpublishers.headless.Internal.C35017a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.d0 */
public class C34971d0 {

    /* renamed from: a */
    public Context f85083a;

    /* renamed from: b */
    public C35014d f85084b;

    /* renamed from: c */
    public C34964a f85085c;

    public C34971d0(@C0359n0 Context context) {
        this.f85083a = context;
        this.f85084b = new C35014d(context, "OTT_DEFAULT_USER");
        this.f85085c = new C34964a(context);
    }

    /* renamed from: d */
    public static void m143160d(@C0359n0 JSONObject jSONObject, @C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject2) {
        jSONObject.put("TransactionType", "CONFIRMED");
        jSONArray.put(jSONObject2.optString("id"));
    }

    /* renamed from: e */
    public static void m143161e(@C0359n0 JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2, JSONObject jSONObject3, String str) {
        if (!jSONObject3.optString("userConsentStatus").equals(jSONObject3.optString("transactionType"))) {
            jSONObject2.put("OptionId", jSONObject3.optString("id"));
            jSONObject2.put("TransactionType", str);
            jSONObject.put("TransactionType", "CHANGE_PREFERENCES");
            jSONArray.put(jSONObject2);
        }
    }

    /* renamed from: g */
    public static void m143162g(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str) {
        jSONObject2.put("TopicId", str);
        jSONObject.put("TransactionType", "CONFIRMED");
    }

    /* renamed from: h */
    public static void m143163h(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONArray jSONArray, @C0359n0 JSONArray jSONArray2, @C0359n0 JSONObject jSONObject3, @C0359n0 JSONObject jSONObject4) {
        if ((jSONObject.optString("userConsentStatus").equals("ACTIVE") && jSONObject.optString("transactionType").equals("OPT_OUT") && jSONObject4.optString("transactionType").equals("OPT_IN")) || (jSONObject.optString("userConsentStatus").equals("ACTIVE") && jSONObject.optString("transactionType").equals("OPT_OUT") && jSONObject4.optString("userConsentStatus").equals("OPT_IN"))) {
            m143160d(jSONObject2, jSONArray2, jSONObject4);
        } else if (jSONObject.optString("userConsentStatus").equals("ACTIVE") && jSONObject4.optString("userConsentStatus").equals("OPT_IN")) {
            m143161e(jSONObject2, jSONArray, jSONObject3, jSONObject4, "OPT_IN");
        } else if (jSONObject.optString("userConsentStatus").equals("ACTIVE") && jSONObject4.optString("userConsentStatus").equals("OPT_OUT")) {
            m143161e(jSONObject2, jSONArray, jSONObject3, jSONObject4, "OPT_OUT");
        }
    }

    /* renamed from: a */
    public JSONArray mo103706a() {
        String string = this.f85084b.mo103965b().getString("OT_UC_PURPOSES_PURPOSE_SERVER_DATA", "");
        String string2 = this.f85084b.mo103965b().getString("OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA", "");
        String string3 = this.f85084b.mo103965b().getString("OT_UC_PURPOSES_TOPIC_SERVER_DATA", "");
        JSONArray jSONArray = new JSONArray();
        try {
            mo103714m(new JSONObject(string), new JSONObject(string2), new JSONObject(string3), jSONArray);
        } catch (JSONException e) {
            OTLogger.m143457l("UCPConsentLoggingDataHandler", "Error in fetching saved ucp data :" + e.getMessage());
        }
        OTLogger.m143447b("UCPConsentLoggingDataHandler", "UCP consent payload :" + jSONArray);
        return jSONArray;
    }

    /* renamed from: b */
    public void mo103707b(@C0359n0 String str, int i) {
        C34977i iVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray names = jSONObject.names();
            if (!C35017a.m143592b(names)) {
                JSONObject jSONObject2 = new JSONObject();
                boolean z = false;
                for (int i2 = 0; i2 < names.length(); i2++) {
                    String string = names.getString(i2);
                    boolean n = mo103715n(string, jSONObject.getJSONObject(string), jSONObject2);
                    if (n && !z) {
                        z = n;
                    }
                }
                if (z) {
                    iVar = new C34977i(this.f85083a);
                } else {
                    if (i != 1) {
                        iVar = new C34977i(this.f85083a);
                        jSONObject2 = jSONObject;
                    }
                    this.f85084b.mo103965b().edit().putString("OT_UCP_PURPOSE_RELATION_DATA", jSONObject.toString()).apply();
                }
                iVar.mo103757f(jSONObject2);
                this.f85084b.mo103965b().edit().putString("OT_UCP_PURPOSE_RELATION_DATA", jSONObject.toString()).apply();
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "failed to trigger broadcast for UC Purposes," + e.toString());
        }
    }

    /* renamed from: c */
    public void mo103708c(@C0359n0 JSONObject jSONObject) {
        String str;
        String str2;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject.has("ConsentIntegration")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("ConsentIntegration");
            if (optJSONObject != null) {
                str2 = optJSONObject.optString("RequestInformation");
                str = optJSONObject.optString("ConsentApi");
            } else {
                str2 = null;
                str = null;
            }
            try {
                jSONObject2.put("identifier", new C34981m(this.f85083a).mo103790j());
                jSONObject2.put("purposes", mo103706a());
                jSONObject2.put("requestInformation", str2);
                jSONObject3.put("consentApi", str);
                jSONObject3.put("consentPayload", jSONObject2);
            } catch (JSONException e) {
                OTLogger.m143457l("UCPConsentLoggingDataHandler", "Error in creating UCP CL payload :" + e.getMessage());
            }
        }
        new C34980l(this.f85083a).mo103780g(jSONObject3);
    }

    /* renamed from: f */
    public void mo103709f(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        jSONObject.put("TransactionType", jSONObject2.optString("userConsentStatus").equals("ACTIVE") ? "CONFIRMED" : "OPT_OUT");
    }

    /* renamed from: i */
    public void mo103710i(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject3, @C0359n0 JSONArray jSONArray2) {
        JSONArray jSONArray3 = jSONArray2;
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String optString = jSONArray.getJSONObject(i).optString("id");
                try {
                    JSONArray t = this.f85085c.mo103622t(optString);
                    JSONArray jSONArray4 = new JSONArray();
                    JSONArray jSONArray5 = new JSONArray();
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    int i2 = 0;
                    while (i2 < t.length()) {
                        JSONObject jSONObject6 = t.getJSONObject(i2);
                        m143163h(jSONObject2, jSONObject3, jSONArray4, jSONArray5, new JSONObject(), jSONObject.optJSONObject(jSONObject6.optString("purposeOptionsId")));
                        i2++;
                        jSONObject5 = jSONObject5;
                    }
                    JSONObject jSONObject7 = jSONObject5;
                    if (jSONArray4.length() > 0) {
                        jSONObject4.put("Id", optString);
                        jSONObject4.put("Choices", jSONArray4);
                    } else {
                        if (jSONArray5.length() > 0) {
                            jSONObject7.put("Id", optString);
                            jSONObject7.put("Options", jSONArray5);
                            jSONObject4 = jSONObject7;
                        }
                        jSONObject3.put("CustomPreferences", jSONArray3);
                    }
                    jSONArray3.put(jSONObject4);
                    try {
                        jSONObject3.put("CustomPreferences", jSONArray3);
                    } catch (JSONException e) {
                        e = e;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    JSONObject jSONObject8 = jSONObject3;
                    OTLogger.m143457l("UCPConsentLoggingDataHandler", "Error in constructing UCP consent payload :" + e.getMessage());
                }
            } catch (JSONException e3) {
                e = e3;
                JSONObject jSONObject82 = jSONObject3;
                OTLogger.m143457l("UCPConsentLoggingDataHandler", "Error in constructing UCP consent payload :" + e.getMessage());
            }
        }
    }

    /* renamed from: j */
    public void mo103711j(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject3, @C0359n0 JSONObject jSONObject4, @C0359n0 String str) {
        String str2;
        JSONObject jSONObject5 = jSONObject2;
        JSONObject jSONObject6 = jSONObject4;
        if ((!jSONObject2.optString("userConsentStatus").equals("ACTIVE") || !jSONObject2.optString("transactionType").equals("OPT_OUT") || !jSONObject6.optString("transactionType").equals("OPT_IN")) && (!jSONObject2.optString("userConsentStatus").equals("ACTIVE") || !jSONObject2.optString("transactionType").equals("OPT_OUT") || !jSONObject6.optString("userConsentStatus").equals("OPT_IN"))) {
            JSONObject jSONObject7 = jSONObject;
            JSONObject jSONObject8 = jSONObject3;
            String str3 = str;
            if (jSONObject2.optString("userConsentStatus").equals("ACTIVE") && jSONObject2.optString("transactionType").equals("ACTIVE") && jSONObject6.optString("userConsentStatus").equals("OPT_IN")) {
                str2 = "OPT_IN";
            } else if (jSONObject2.optString("userConsentStatus").equals("ACTIVE") && jSONObject2.optString("transactionType").equals("ACTIVE") && jSONObject6.optString("userConsentStatus").equals("OPT_OUT")) {
                str2 = "OPT_OUT";
            }
            mo103712k(jSONObject, jSONObject3, jSONObject4, str, str2, "CHANGE_PREFERENCES");
        } else {
            JSONObject jSONObject9 = jSONObject;
            JSONObject jSONObject10 = jSONObject3;
            m143162g(jSONObject, jSONObject3, str);
        }
        if (!jSONObject3.toString().equals(C28819e.f70617a)) {
            jSONArray.put(jSONObject3);
        }
    }

    /* renamed from: k */
    public void mo103712k(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        if (!jSONObject3.optString("userConsentStatus").equals(jSONObject3.optString("transactionType"))) {
            jSONObject2.put("TopicId", str);
            jSONObject2.put("TransactionType", str2);
            jSONObject.put("TransactionType", str3);
        }
    }

    /* renamed from: l */
    public void mo103713l(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONObject jSONObject3, @C0359n0 String str, @C0359n0 JSONArray jSONArray) {
        for (int i = 0; i < jSONObject.length(); i++) {
            JSONObject jSONObject4 = new JSONObject();
            JSONObject optJSONObject = jSONObject.optJSONObject(jSONObject.getJSONObject(jSONObject.names().get(i).toString()).optString("purposeTopicId"));
            String optString = optJSONObject.optString("id");
            if (optJSONObject.optString("purposeId").equals(str)) {
                mo103711j(jSONObject2, jSONObject3, jSONArray, jSONObject4, optJSONObject, optString);
            }
        }
        jSONObject2.put("Preferences", jSONArray);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d A[SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo103714m(@androidx.annotation.C0359n0 org.json.JSONObject r15, @androidx.annotation.C0359n0 org.json.JSONObject r16, @androidx.annotation.C0359n0 org.json.JSONObject r17, @androidx.annotation.C0359n0 org.json.JSONArray r18) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            java.lang.String r9 = "id"
            r0 = 0
            r1 = 0
            r10 = r0
            r11 = r1
            r1 = r10
        L_0x0009:
            int r0 = r15.length()
            if (r11 >= r0) goto L_0x0086
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            org.json.JSONArray r0 = r15.names()     // Catch:{ JSONException -> 0x0051 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0051 }
            org.json.JSONObject r0 = r15.getJSONObject(r0)     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r0 = r0.optString(r9)     // Catch:{ JSONException -> 0x0051 }
            org.json.JSONObject r13 = r15.optJSONObject(r0)     // Catch:{ JSONException -> 0x0051 }
            java.util.Objects.requireNonNull(r13)     // Catch:{ JSONException -> 0x004e }
            java.lang.String r5 = r13.optString(r9)     // Catch:{ JSONException -> 0x004e }
            r12.put(r9, r5)     // Catch:{ JSONException -> 0x004e }
            r14.mo103709f(r12, r13)     // Catch:{ JSONException -> 0x004e }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x004e }
            r6.<init>()     // Catch:{ JSONException -> 0x004e }
            r1 = r14
            r2 = r17
            r3 = r12
            r4 = r13
            r1.mo103713l(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x004e }
            com.onetrust.otpublishers.headless.Internal.Helper.a r1 = r7.f85085c     // Catch:{ JSONException -> 0x004e }
            org.json.JSONArray r0 = r1.mo103606c(r0)     // Catch:{ JSONException -> 0x004e }
            r10 = r0
            goto L_0x006d
        L_0x004e:
            r0 = move-exception
            r1 = r13
            goto L_0x0052
        L_0x0051:
            r0 = move-exception
        L_0x0052:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error in constructing UCP purpose object :"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "UCPConsentLoggingDataHandler"
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143457l(r2, r0)
            r13 = r1
        L_0x006d:
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            if (r10 == 0) goto L_0x007d
            r1 = r14
            r2 = r16
            r3 = r13
            r4 = r10
            r5 = r12
            r1.mo103710i(r2, r3, r4, r5, r6)
        L_0x007d:
            r1 = r18
            r1.put(r12)
            int r11 = r11 + 1
            r1 = r13
            goto L_0x0009
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.Internal.Helper.C34971d0.mo103714m(org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONArray):void");
    }

    /* renamed from: n */
    public final boolean mo103715n(@C0359n0 String str, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        boolean z;
        int i = jSONObject.getInt("status");
        int I = this.f85085c.mo103596I(str);
        if (i != I) {
            jSONObject.put("status", I);
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("topics");
        if (!C35017a.m143593c(jSONObject3)) {
            JSONArray names = jSONObject3.names();
            for (int i2 = 0; i2 < jSONObject3.length(); i2++) {
                String string = names.getString(i2);
                int i3 = jSONObject3.getInt(string);
                int a = this.f85085c.mo103604a(string, str);
                if (i3 != a) {
                    jSONObject3.put(string, a);
                    z = true;
                }
            }
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("custom_preferences");
        if (!C35017a.m143593c(jSONObject4)) {
            for (int i4 = 0; i4 < jSONObject4.length(); i4++) {
                String string2 = jSONObject4.names().getString(i4);
                z = mo103716o(str, z, string2, jSONObject4.getJSONObject(string2));
            }
        }
        if (z) {
            jSONObject2.put(str, jSONObject);
        }
        return z;
    }

    /* renamed from: o */
    public final boolean mo103716o(@C0359n0 String str, boolean z, @C0359n0 String str2, @C0359n0 JSONObject jSONObject) {
        for (int i = 0; i < jSONObject.length(); i++) {
            String string = jSONObject.names().getString(i);
            int i2 = jSONObject.getInt(string);
            int b = this.f85085c.mo103605b(string, str, str2);
            if (i2 != b) {
                jSONObject.put(string, b);
                z = true;
            }
        }
        return z;
    }
}
