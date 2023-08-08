package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.installations.local.PersistedInstallation;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.b0 */
public class C34967b0 {

    /* renamed from: a */
    public SharedPreferences f85067a;

    /* renamed from: b */
    public C35015e f85068b;

    /* renamed from: c */
    public JSONObject f85069c = new JSONObject();

    /* renamed from: d */
    public Context f85070d;

    public C34967b0(@C0359n0 Context context) {
        this.f85070d = context;
        this.f85067a = new C35014d(context, "OTT_DEFAULT_USER").mo103965b();
        this.f85068b = new C35015e(this.f85070d);
    }

    /* renamed from: c */
    public static int m143050c(@C0359n0 String str, boolean z, @C0359n0 String str2, @C0359n0 JSONObject jSONObject) {
        if (!str2.contains(str)) {
            OTLogger.m143458m("SdkListHelper", "Invalid SDK_ID passed - " + str);
            return -1;
        } else if (jSONObject.getInt(str) == 2) {
            return z ? 2 : 1;
        } else {
            OTLogger.m143458m("SdkListHelper", "SDK_ID " + str + "  Status " + jSONObject.get(str));
            return jSONObject.getInt(str);
        }
    }

    /* renamed from: a */
    public int mo103634a(@C0359n0 String str, boolean z) {
        String string = this.f85067a.getString("OT_INTERNAL_SDK_STATUS_MAP", "");
        OTLogger.m143458m("SdkListHelper", "SDK Status Object - " + string);
        try {
            JSONObject jSONObject = this.f85069c;
            return (jSONObject == null || !jSONObject.has(str)) ? mo103635b(str, z, string) : this.f85069c.getInt(str);
        } catch (JSONException e) {
            OTLogger.m143457l("SdkListHelper", "Error while getting sdk status " + e.getMessage());
            return -1;
        }
    }

    /* renamed from: b */
    public final int mo103635b(@C0359n0 String str, boolean z, @C0359n0 String str2) {
        if (!C35020d.m143605J(str2)) {
            return m143050c(str, z, str2, new JSONObject(str2));
        }
        String d = mo103636d(str);
        if (d != null) {
            return this.f85068b.mo103996g(d);
        }
        return -1;
    }

    @C0363p0
    /* renamed from: d */
    public String mo103636d(@C0359n0 String str) {
        String str2 = "";
        try {
            JSONObject jSONObject = new JSONObject(this.f85067a.getString("OTT_INTERNAL_SDK_GROUP_MAP", str2));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (((String) jSONObject.get(next)).contains(str)) {
                    str2 = next;
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("SdkListHelper", "Error while fetching groupId by sdkId : " + e.getMessage());
        }
        return str2;
    }

    /* renamed from: e */
    public final void mo103637e(@C0359n0 JSONArray jSONArray, @C0359n0 JSONArray jSONArray2, @C0359n0 JSONObject jSONObject) {
        String string = this.f85067a.getString("OT_INTERNAL_SDK_STATUS_MAP", "");
        JSONObject jSONObject2 = !C35020d.m143605J(string) ? new JSONObject(string) : new JSONObject();
        for (int i = 0; i < jSONArray2.length(); i++) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray2.getJSONObject(i).getJSONArray("FirstPartyCookies").length() > 0) {
                mo103638f(jSONArray2, jSONObject, jSONObject2, arrayList, i);
                jSONArray.put(jSONObject);
            }
        }
    }

    /* renamed from: f */
    public final void mo103638f(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 List<String> list, int i) {
        for (int i2 = 0; i2 < jSONArray.getJSONObject(i).getJSONArray("FirstPartyCookies").length(); i2++) {
            String optString = jSONArray.getJSONObject(i).getJSONArray("FirstPartyCookies").getJSONObject(i2).optString("SdkId");
            list.add(optString);
            int i3 = 2;
            if (!jSONArray.getJSONObject(i).optString(PersistedInstallation.f80251i).contains("always")) {
                int a = mo103634a(optString, true);
                i3 = (-1 == a || 2 == a) ? !jSONArray.getJSONObject(i).optString(PersistedInstallation.f80251i).equals("inactive") : a;
            }
            jSONObject2.put(optString, i3);
            jSONObject.put(jSONArray.getJSONObject(i).optString("CustomGroupId"), list);
        }
        OTLogger.m143458m("SdkListHelper", "Saving SDK Status map = " + jSONObject2);
        this.f85067a.edit().putString("OT_INTERNAL_SDK_STATUS_MAP", jSONObject2.toString()).apply();
    }

    /* renamed from: g */
    public void mo103639g(@C0359n0 JSONArray jSONArray, boolean z) {
        String string = this.f85067a.getString("OT_INTERNAL_SDK_STATUS_MAP", "");
        if (!C35020d.m143605J(string)) {
            mo103640h(jSONArray, z, string);
        }
    }

    /* renamed from: h */
    public final void mo103640h(@C0359n0 JSONArray jSONArray, boolean z, @C0359n0 String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                String obj = jSONArray.get(i).toString();
                if (jSONObject.has(obj) && 2 != jSONObject.getInt(obj)) {
                    this.f85069c.put(obj, z ? 1 : 0);
                }
            }
            OTLogger.m143458m("SdkListHelper", "Updated All SDK status for  - " + this.f85069c);
        } catch (JSONException e) {
            OTLogger.m143457l("SdkListHelper", "Error while updating all sdk status " + e.getMessage());
        }
    }

    /* renamed from: i */
    public void mo103641i(@C0359n0 JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        if (jSONObject.getJSONObject("culture").getJSONObject("DomainData").has("Groups")) {
            JSONArray jSONArray2 = jSONObject.getJSONObject("culture").getJSONObject("DomainData").getJSONArray("Groups");
            if (jSONArray2.length() > 0) {
                String string = this.f85067a.getString("OTT_INTERNAL_SDK_GROUP_MAP", (String) null);
                JSONObject jSONObject2 = !C35020d.m143605J(string) ? new JSONObject(string) : new JSONObject();
                mo103637e(jSONArray, jSONArray2, jSONObject2);
                this.f85067a.edit().putString("OTT_INTERNAL_SDK_GROUP_MAP", jSONObject2.toString()).apply();
            }
        }
    }

    /* renamed from: j */
    public final void mo103642j(@C0359n0 JSONObject jSONObject, @C0359n0 String str, int i, int i2) {
        C34977i iVar;
        if (0 == new C35015e(this.f85070d).mo103980O()) {
            jSONObject.put(str, i2);
            iVar = new C34977i(this.f85070d);
        } else if (i != i2) {
            jSONObject.put(str, i2);
            iVar = new C34977i(this.f85070d);
        } else {
            return;
        }
        iVar.mo103752a(str, i2);
    }

    /* renamed from: k */
    public final void mo103643k(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            int i = jSONObject.getInt(next);
            if (jSONObject2.has(next)) {
                mo103642j(jSONObject2, next, jSONObject2.getInt(next), i);
            }
        }
    }

    @C0363p0
    /* renamed from: l */
    public JSONArray mo103644l(@C0359n0 String str) {
        String string = this.f85067a.getString("OTT_INTERNAL_SDK_GROUP_MAP", "");
        JSONArray jSONArray = new JSONArray();
        if (C35020d.m143605J(string)) {
            return jSONArray;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            return jSONObject.has(str) ? new JSONArray((String) jSONObject.get(str)) : jSONArray;
        } catch (JSONException e) {
            OTLogger.m143457l("SdkListHelper", "Error while fetching Sdks by group : " + e.getMessage());
            return jSONArray;
        }
    }

    /* renamed from: m */
    public void mo103645m(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject(this.f85067a.getString("OT_INTERNAL_SDK_STATUS_MAP", ""));
            if (jSONObject.has(str) && 2 != jSONObject.getInt(str)) {
                this.f85069c.put(str, z ? 1 : 0);
                OTLogger.m143458m("SdkListHelper", "Updated SDK status for  - " + str + " To " + this.f85069c.get(str));
            }
        } catch (JSONException e) {
            OTLogger.m143457l("SdkListHelper", "Error while updating sdk status " + e.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo103646n(@androidx.annotation.C0359n0 java.lang.String r4) {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x000d }
            r0.<init>(r4)     // Catch:{ JSONException -> 0x000d }
            org.json.JSONObject r4 = r3.f85069c     // Catch:{ JSONException -> 0x000b }
            r3.mo103643k(r4, r0)     // Catch:{ JSONException -> 0x000b }
            goto L_0x0029
        L_0x000b:
            r4 = move-exception
            goto L_0x000f
        L_0x000d:
            r4 = move-exception
            r0 = 0
        L_0x000f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error while Saving sdk status "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "SdkListHelper"
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143457l(r1, r4)
        L_0x0029:
            if (r0 == 0) goto L_0x003e
            android.content.SharedPreferences r4 = r3.f85067a
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "OT_INTERNAL_SDK_STATUS_MAP"
            android.content.SharedPreferences$Editor r4 = r4.putString(r1, r0)
            r4.apply()
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.Internal.Helper.C34967b0.mo103646n(java.lang.String):void");
    }
}
