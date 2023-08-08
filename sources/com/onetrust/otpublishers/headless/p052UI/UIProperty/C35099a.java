package com.onetrust.otpublishers.headless.p052UI.UIProperty;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.Helper.C34964a;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35021a;
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35023b;
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35024c;
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35025d;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.UIProperty.a */
public class C35099a {
    /* renamed from: b */
    public static void m144213b(@C0359n0 C35021a aVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("customPreferenceOptions")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("customPreferenceOptions");
            for (int i = 0; i < jSONArray.length(); i++) {
                m144216i(arrayList, new C35024c(), jSONArray.getJSONObject(i));
            }
            aVar.mo104199c(arrayList);
        }
    }

    /* renamed from: d */
    public static void m144214d(@C0359n0 C35024c cVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("id")) {
            cVar.mo104236f(jSONObject.optString("id"));
        }
        if (jSONObject.has("name")) {
            cVar.mo104244n(jSONObject.optString("name"));
        }
        if (jSONObject.has("integrationKey")) {
            cVar.mo104238h(jSONObject.optString("integrationKey"));
        }
        if (jSONObject.has("customPreferenceId")) {
            cVar.mo104248r(jSONObject.optString("customPreferenceId"));
        }
        if (jSONObject.has("purposeId")) {
            cVar.mo104247q(jSONObject.optString("purposeId"));
        }
        if (jSONObject.has("userConsentStatus")) {
            cVar.mo104250t(jSONObject.optString("userConsentStatus"));
        }
        if (jSONObject.has("purposeTopicId")) {
            cVar.mo104249s(jSONObject.optString("purposeTopicId"));
        }
    }

    /* renamed from: e */
    public static void m144215e(@C0359n0 C35025d dVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("options")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("options");
            for (int i = 0; i < jSONArray.length(); i++) {
                C35024c cVar = new C35024c();
                m144214d(cVar, jSONArray.getJSONObject(i));
                arrayList.add(cVar);
            }
            dVar.mo104254c(arrayList);
        }
    }

    /* renamed from: i */
    public static void m144216i(@C0359n0 ArrayList<C35024c> arrayList, @C0359n0 C35024c cVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("id")) {
            cVar.mo104236f(jSONObject.optString("id"));
        }
        if (jSONObject.has("label")) {
            cVar.mo104242l(jSONObject.optString("label"));
        }
        if (jSONObject.has("order")) {
            cVar.mo104246p(jSONObject.optString("order"));
        }
        if (jSONObject.has("isDefault")) {
            cVar.mo104240j(jSONObject.optString("isDefault"));
        }
        if (jSONObject.has("canDelete")) {
            cVar.mo104232b(jSONObject.optString("canDelete"));
        }
        if (jSONObject.has("purposeOptionsId")) {
            cVar.mo104248r(jSONObject.optString("purposeOptionsId"));
        }
        if (jSONObject.has("purposeId")) {
            cVar.mo104247q(jSONObject.optString("purposeId"));
        }
        if (jSONObject.has("userConsentStatus")) {
            cVar.mo104250t(jSONObject.optString("userConsentStatus"));
        }
        if (jSONObject.has("customPreferenceId")) {
            cVar.mo104234d(jSONObject.optString("customPreferenceId"));
        }
        arrayList.add(cVar);
    }

    @C0363p0
    /* renamed from: a */
    public C35123w mo104629a(C34964a aVar) {
        JSONObject v = aVar.mo103624v();
        C35123w wVar = new C35123w();
        mo104632g(wVar, v);
        mo104636l(wVar, v);
        if (v.has("buttons")) {
            mo104637m(wVar, v.getJSONObject("buttons"));
        }
        if (v.has("purposes")) {
            mo104631f(wVar, v.getJSONArray("purposes"));
        }
        return wVar;
    }

    /* renamed from: c */
    public final void mo104630c(@C0359n0 C35023b bVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("customPreferences")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("customPreferences");
            for (int i = 0; i < jSONArray.length(); i++) {
                mo104633h(arrayList, new C35021a(), jSONArray.getJSONObject(i));
            }
            bVar.mo104216c(arrayList);
        }
    }

    /* renamed from: f */
    public void mo104631f(C35123w wVar, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        mo104634j(jSONArray, arrayList);
        wVar.mo104999e(arrayList);
        OTLogger.m143447b("OneTrust", "MOBILE_DATA_TITLE" + wVar.mo105000f());
    }

    /* renamed from: g */
    public void mo104632g(@C0359n0 C35123w wVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has(OTVendorListMode.GENERAL)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(OTVendorListMode.GENERAL);
            if (jSONObject2.has(C9874a.f27048E)) {
                wVar.mo105004j(jSONObject2.getString(C9874a.f27048E));
            }
            if (jSONObject2.has("options")) {
                wVar.mo104998d(jSONObject2.getString("options"));
            }
            if (jSONObject2.has("pageHeader")) {
                wVar.mo105002h(jSONObject2.getString("pageHeader"));
            }
        }
    }

    /* renamed from: h */
    public final void mo104633h(@C0359n0 ArrayList<C35021a> arrayList, @C0359n0 C35021a aVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("id")) {
            aVar.mo104204g(jSONObject.optString("id"));
        }
        if (jSONObject.has("name")) {
            aVar.mo104205h(jSONObject.optString("name"));
        }
        if (jSONObject.has("description")) {
            aVar.mo104198b(jSONObject.optString("description"));
        }
        if (jSONObject.has("selectionType")) {
            aVar.mo104207j(jSONObject.optString("selectionType"));
        }
        if (jSONObject.has("displayAs")) {
            aVar.mo104202e(jSONObject.optString("displayAs"));
        }
        if (jSONObject.has("purposeId")) {
            aVar.mo104206i(jSONObject.optString("purposeId"));
        }
        m144213b(aVar, jSONObject);
        arrayList.add(aVar);
    }

    /* renamed from: j */
    public final void mo104634j(JSONArray jSONArray, ArrayList<C35023b> arrayList) {
        for (int i = 0; i < jSONArray.length(); i++) {
            C35023b bVar = new C35023b();
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has("id")) {
                    bVar.mo104218e(jSONObject.optString("id"));
                }
                if (jSONObject.has("label")) {
                    bVar.mo104221h(jSONObject.optString("label"));
                }
                if (jSONObject.has("description")) {
                    bVar.mo104215b(jSONObject.optString("description"));
                }
                if (jSONObject.has("status")) {
                    bVar.mo104226m(jSONObject.optString("status"));
                }
                if (jSONObject.has("newVersionAvailable")) {
                    bVar.mo104225l(jSONObject.optString("newVersionAvailable"));
                }
                if (jSONObject.has("type")) {
                    bVar.mo104227n(jSONObject.optString("type"));
                }
                if (jSONObject.has("consentLifeSpan")) {
                    bVar.mo104223j(jSONObject.optString("consentLifeSpan"));
                }
                if (jSONObject.has("version")) {
                    bVar.mo104229p(jSONObject.optString("version"));
                }
                if (jSONObject.has("userConsentStatus")) {
                    bVar.mo104228o(jSONObject.optString("userConsentStatus"));
                }
                mo104635k(bVar, jSONObject);
                mo104630c(bVar, jSONObject);
                arrayList.add(bVar);
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "Error msg :" + e.getMessage());
            }
        }
    }

    /* renamed from: k */
    public final void mo104635k(@C0359n0 C35023b bVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("topics")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("topics");
            for (int i = 0; i < jSONArray.length(); i++) {
                C35025d dVar = new C35025d();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has("name")) {
                    dVar.mo104253b(jSONObject2.optString("name"));
                }
                m144215e(dVar, jSONObject2);
                arrayList.add(dVar);
            }
            bVar.mo104219f(arrayList);
        }
    }

    /* renamed from: l */
    public void mo104636l(@C0359n0 C35123w wVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has("title")) {
            wVar.mo105001g(new C35107g().mo104737f(jSONObject.getJSONObject("title")));
        }
        if (jSONObject.has("description")) {
            wVar.mo104997c(new C35107g().mo104737f(jSONObject.getJSONObject("description")));
        }
    }

    /* renamed from: m */
    public void mo104637m(@C0359n0 C35123w wVar, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.has(OTUXParamsKeys.OT_UX_SAVE_CONSENT_PREFERENCES)) {
            wVar.mo104996b(new C35107g().mo104733a(jSONObject.getJSONObject(OTUXParamsKeys.OT_UX_SAVE_CONSENT_PREFERENCES)));
        }
    }
}
