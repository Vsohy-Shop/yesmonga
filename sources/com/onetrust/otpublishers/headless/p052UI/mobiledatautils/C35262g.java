package com.onetrust.otpublishers.headless.p052UI.mobiledatautils;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35122v;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.mobiledatautils.g */
public class C35262g {

    /* renamed from: a */
    public C35122v f86632a;

    /* renamed from: b */
    public JSONObject f86633b;

    /* renamed from: d */
    public static void m145438d(@C0359n0 JSONArray jSONArray, JSONArray jSONArray2, int i, JSONObject jSONObject) {
        UIUtils uIUtils = new UIUtils();
        if (jSONArray.getJSONObject(i).getString("Type").equals("COOKIE") && jSONArray.getJSONObject(i).getJSONArray("FirstPartyCookies").length() > 0) {
            jSONObject.put("GroupName", uIUtils.mo104274j(jSONArray.getJSONObject(i)));
            jSONObject.put("CustomGroupId", jSONArray.getJSONObject(i).getString("CustomGroupId"));
            jSONArray2.put(jSONObject);
        }
        if (jSONArray.getJSONObject(i).has("SubGroups")) {
            JSONArray jSONArray3 = jSONArray.getJSONObject(i).getJSONArray("SubGroups");
            for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                JSONObject jSONObject2 = new JSONObject();
                if (jSONArray3.getJSONObject(i2).getString("Type").equals("COOKIE") && jSONArray3.getJSONObject(i2).getJSONArray("FirstPartyCookies").length() > 0) {
                    jSONObject2.put("GroupName", uIUtils.mo104274j(jSONArray3.getJSONObject(i2)));
                    jSONObject2.put("CustomGroupId", jSONArray3.getJSONObject(i2).getString("CustomGroupId"));
                    jSONArray2.put(jSONObject2);
                }
            }
        }
    }

    @C0363p0
    /* renamed from: a */
    public JSONArray mo105604a() {
        return this.f86633b.optJSONArray("Groups");
    }

    @C0359n0
    /* renamed from: b */
    public JSONArray mo105605b(@C0359n0 JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                m145438d(jSONArray, jSONArray2, i, new JSONObject());
                i++;
            } catch (JSONException e) {
                OTLogger.m143457l("OTSDKListFilter", "Error on parsing Categories list. Error msg = " + e.getMessage());
            }
        }
        return jSONArray2;
    }

    /* renamed from: c */
    public void mo105606c(@C0359n0 Context context, @C0359n0 int i, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        try {
            this.f86633b = oTPublishersHeadlessSDK.getPreferenceCenterData();
            C35122v f = new C35124x(context).mo105015f(i);
            this.f86632a = f;
            C35256b bVar = new C35256b(i);
            f.mo104975h(bVar.mo105526b(f.mo104976i(), this.f86633b.optString("PcBackgroundColor"), "#FFFFFF", "#2F2F2F"));
            C35122v vVar = this.f86632a;
            vVar.mo104978k(bVar.mo105526b(vVar.mo104987t(), this.f86633b.optString("PcButtonColor"), "#6CC04A", "#80BE5A"));
            this.f86632a.mo104985r().mo104666j(bVar.mo105526b(this.f86632a.mo104985r().mo104667k(), this.f86633b.optString("PcTextColor"), "#696969", "#FFFFFF"));
            C35105e l = this.f86632a.mo104979l();
            l.mo104716t(this.f86633b.optString("PCenterApplyFiltersText"));
            if (C35020d.m143605J(l.mo104296u())) {
                l.mo104718v(this.f86633b.optString("PcButtonTextColor"));
            }
            if (C35020d.m143605J(l.mo104699a())) {
                l.mo104701d(this.f86633b.optString("PcButtonColor"));
            }
            C35102b0 o = this.f86632a.mo104982o();
            if (C35020d.m143605J(o.mo104663g())) {
                o.mo104662f(this.f86633b.optString("PCenterCancelFiltersText"));
            }
            if (C35020d.m143605J(o.mo104667k())) {
                o.mo104666j(this.f86633b.optString("PcTextColor"));
            }
            C35102b0 r = this.f86632a.mo104985r();
            if (C35020d.m143605J(r.mo104667k())) {
                r.mo104666j(this.f86633b.optString("PcTextColor"));
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OTSDKListFilter", "failed to initialize SDK list filter data, e: " + e);
        }
    }

    /* renamed from: e */
    public C35122v mo105607e() {
        return this.f86632a;
    }
}
