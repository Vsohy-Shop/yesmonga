package com.onetrust.otpublishers.headless.p052UI.mobiledatautils;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import com.onetrust.otpublishers.headless.Internal.C35017a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34967b0;
import com.onetrust.otpublishers.headless.Internal.Helper.C34983o;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35111k;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35118r;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35119s;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import com.urbanairship.iam.banner.C9156c;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.mobiledatautils.e */
public class C35260e {

    /* renamed from: a */
    public JSONObject f86605a = new JSONObject();

    /* renamed from: b */
    public String f86606b;

    /* renamed from: c */
    public boolean f86607c;

    /* renamed from: d */
    public String f86608d;

    /* renamed from: e */
    public boolean f86609e;

    /* renamed from: f */
    public boolean f86610f;

    /* renamed from: g */
    public boolean f86611g;

    /* renamed from: h */
    public String f86612h;

    /* renamed from: i */
    public String f86613i;

    /* renamed from: j */
    public C35119s f86614j;

    /* renamed from: k */
    public C35118r f86615k;

    /* renamed from: l */
    public OTPublishersHeadlessSDK f86616l;

    /* renamed from: m */
    public Context f86617m;

    /* renamed from: d */
    public static void m145399d(C35102b0 b0Var, JSONObject jSONObject, String str) {
        if (C35020d.m143605J(b0Var.mo104667k())) {
            b0Var.mo104666j(jSONObject.optString("PcTextColor"));
        }
        b0Var.mo104662f(str);
    }

    /* renamed from: e */
    public static void m145400e(C35102b0 b0Var, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        b0Var.mo104662f(new UIUtils().mo104274j(jSONObject));
        if (C35020d.m143605J(b0Var.mo104667k())) {
            b0Var.mo104666j(jSONObject2.optString(str));
        }
    }

    /* renamed from: h */
    public static void m145401h(@C0359n0 JSONObject jSONObject, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 String str, @C0359n0 C34983o oVar) {
        if (jSONObject.getBoolean("IsIabPurpose") || !m145402j(jSONObject)) {
            return;
        }
        if (C9156c.f24820X.equalsIgnoreCase(str)) {
            textView2.setVisibility(0);
            textView2.setText(oVar.mo103834i());
            return;
        }
        textView.setVisibility(0);
        textView.setText(oVar.mo103834i());
    }

    /* renamed from: j */
    public static boolean m145402j(@C0359n0 JSONObject jSONObject) {
        boolean z;
        boolean z2 = !C35017a.m143592b(jSONObject.optJSONArray("GeneralVendorsIds"));
        if (!jSONObject.has("SubGroups") && z2) {
            return true;
        }
        if (!jSONObject.has("SubGroups") || jSONObject.getBoolean("IsIabPurpose")) {
            z = false;
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("SubGroups");
            z = false;
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.getBoolean("IsIabPurpose")) {
                    return false;
                }
                if (!C35017a.m143592b(jSONObject2.optJSONArray("GeneralVendorsIds"))) {
                    z = true;
                }
            }
        }
        return z2 || z;
    }

    /* renamed from: m */
    public static boolean m145403m(@C0359n0 JSONObject jSONObject) {
        if (!jSONObject.getBoolean("IsIabPurpose") && jSONObject.getJSONArray("FirstPartyCookies").length() > 0) {
            return true;
        }
        if (jSONObject.has("SubGroups")) {
            JSONArray jSONArray = jSONObject.getJSONArray("SubGroups");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!jSONArray.getJSONObject(i).getBoolean("IsIabPurpose")) {
                    return true;
                }
            }
        }
        return false;
    }

    @C0359n0
    /* renamed from: a */
    public Bundle mo105570a(@C0359n0 Map<String, String> map) {
        Bundle bundle = new Bundle();
        try {
            if (!this.f86605a.getBoolean("IsIabPurpose") && !C35017a.m143592b(this.f86605a.getJSONArray("GeneralVendorsIds"))) {
                map.put(mo105578n(), mo105580p());
            }
            mo105579o(map);
            bundle.putBoolean("IS_FILTERED_VENDOR_LIST", true);
            bundle.putString("PURPOSE_MAP", map.toString());
        } catch (JSONException e) {
            OTLogger.m143457l("PC Detail", "General vendor: error while setting filtered groups " + e.getMessage());
        }
        return bundle;
    }

    @C0359n0
    /* renamed from: b */
    public JSONObject mo105571b() {
        return this.f86605a;
    }

    /* renamed from: c */
    public final void mo105572c(C35111k kVar, String str, JSONObject jSONObject, String str2) {
        if (C35020d.m143605J(kVar.mo104763a().mo104667k())) {
            kVar.mo104763a().mo104666j(new UIUtils().mo104273h(this.f86615k, kVar.mo104763a(), jSONObject.optString(str2)));
        }
        if (C35020d.m143605J(kVar.mo104763a().mo104663g())) {
            kVar.mo104763a().mo104662f(str);
        }
    }

    /* renamed from: f */
    public void mo105573f(@C0359n0 String str, int i, @C0359n0 Context context, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        if (!C35020d.m143605J(str)) {
            try {
                C35256b bVar = new C35256b(i);
                JSONObject jSONObject = new JSONObject(str);
                this.f86605a = jSONObject;
                this.f86609e = jSONObject.getBoolean("ShowSubgroup");
                this.f86610f = this.f86605a.getBoolean("ShowSubgroupToggle");
                this.f86611g = this.f86605a.getBoolean("ShowSubGroupDescription");
                this.f86606b = this.f86605a.optString("Type", "");
                this.f86607c = this.f86605a.optString("Type").equalsIgnoreCase("IAB2_STACK");
                this.f86608d = this.f86605a.optString("CustomGroupId");
                C35124x xVar = new C35124x(context, i);
                this.f86614j = xVar.mo105016g();
                this.f86615k = xVar.mo105014e();
                JSONObject preferenceCenterData = oTPublishersHeadlessSDK.getPreferenceCenterData();
                this.f86612h = preferenceCenterData.optString("IabLegalTextUrl");
                this.f86616l = oTPublishersHeadlessSDK;
                this.f86617m = context;
                this.f86613i = preferenceCenterData.getString("PCGrpDescType");
                C35102b0 a = this.f86614j.mo104879a();
                if (C35020d.m143605J(a.mo104663g())) {
                    a.mo104662f(preferenceCenterData.getString("AlwaysActiveText"));
                }
                if (C35020d.m143605J(a.mo104667k())) {
                    a.mo104666j(bVar.mo105526b(a.mo104667k(), preferenceCenterData.optString("PcLinksTextColor"), "#3860BE", "#3860BE"));
                }
                this.f86614j.mo104881c(a);
                if (C35020d.m143605J(this.f86614j.mo104883e())) {
                    this.f86614j.mo104882d(preferenceCenterData.getString("PcTextColor"));
                }
                if (C35020d.m143605J(this.f86614j.mo104887i())) {
                    this.f86614j.mo104886h(preferenceCenterData.getString("PcBackgroundColor"));
                }
                if (C35020d.m143605J(this.f86614j.mo104877C())) {
                    this.f86614j.mo104900u("#d1d1d1");
                }
                if (C35020d.m143605J(this.f86614j.mo104876B())) {
                    this.f86614j.mo104896r("#67B54B");
                }
                if (C35020d.m143605J(this.f86614j.mo104875A())) {
                    this.f86614j.mo104893o("#788381");
                }
                m145400e(this.f86614j.mo104905z(), this.f86605a, preferenceCenterData, "PcTextColor");
                m145400e(this.f86614j.mo104903x(), this.f86605a, preferenceCenterData, "PcTextColor");
                m145399d(this.f86614j.mo104891m(), preferenceCenterData, preferenceCenterData.optString("BConsentText"));
                m145399d(this.f86614j.mo104897s(), preferenceCenterData, preferenceCenterData.optString("BLegitInterestText"));
                mo105572c(this.f86614j.mo104902w(), preferenceCenterData.optString("ThirdPartyCookieListText", "First Party Cookies"), preferenceCenterData, "PcLinksTextColor");
                mo105572c(this.f86614j.mo104878D(), preferenceCenterData.getString("VendorListText"), preferenceCenterData, "PcLinksTextColor");
                mo105572c(this.f86614j.mo104894p(), preferenceCenterData.getString("PCVendorFullLegalText"), preferenceCenterData, "PcLinksTextColor");
            } catch (JSONException e) {
                OTLogger.m143457l("PC Detail", "No Data found to initialize PC Detail Config, " + e);
            }
        }
    }

    /* renamed from: g */
    public void mo105574g(@C0359n0 JSONArray jSONArray, boolean z, boolean z2, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            boolean z3 = jSONObject.getBoolean("HasConsentOptOut");
            String string = jSONObject.getString("CustomGroupId");
            if (!z2) {
                if (z3) {
                    oTPublishersHeadlessSDK.updatePurposeConsent(string, z);
                    mo105575i(z, string);
                }
            } else if (oTPublishersHeadlessSDK.getPurposeLegitInterestLocal(string) >= 0) {
                oTPublishersHeadlessSDK.updatePurposeLegitInterest(string, z);
            }
        }
    }

    /* renamed from: i */
    public void mo105575i(boolean z, @C0359n0 String str) {
        JSONArray l = new C34967b0(this.f86617m).mo103644l(str);
        OTLogger.m143458m("PC Detail", "SDKs of group : " + str + " is " + l);
        if (l != null) {
            for (int i = 0; i < l.length(); i++) {
                try {
                    this.f86616l.updateSDKConsentStatus(l.get(i).toString(), z);
                } catch (JSONException e) {
                    OTLogger.m143457l("OneTrust", "Error in setting group sdk status " + e.getMessage());
                }
            }
        }
    }

    @C0359n0
    /* renamed from: k */
    public Bundle mo105576k(@C0359n0 Map<String, String> map) {
        Bundle bundle = new Bundle();
        try {
            if (!mo105585u() && this.f86605a.getBoolean("IsIabPurpose")) {
                map.put(mo105578n(), mo105580p());
            }
            mo105581q(map);
            bundle.putBoolean("IS_FILTERED_VENDOR_LIST", true);
            bundle.putString("PURPOSE_MAP", map.toString());
        } catch (JSONException e) {
            OTLogger.m143457l("PC Detail", "error in parsing vendorlist link on setCategoriesForVendorList: " + e.getMessage());
        }
        return bundle;
    }

    /* renamed from: l */
    public String mo105577l() {
        return this.f86613i;
    }

    @C0359n0
    /* renamed from: n */
    public String mo105578n() {
        return this.f86608d;
    }

    /* renamed from: o */
    public final void mo105579o(@C0359n0 Map<String, String> map) {
        if (this.f86605a.has("SubGroups")) {
            JSONArray jSONArray = this.f86605a.getJSONArray("SubGroups");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (!jSONObject.getBoolean("IsIabPurpose")) {
                    map.put(jSONObject.getString("CustomGroupId"), jSONObject.getString("Type"));
                }
            }
        }
    }

    @C0359n0
    /* renamed from: p */
    public String mo105580p() {
        return this.f86606b;
    }

    /* renamed from: q */
    public final void mo105581q(@C0359n0 Map<String, String> map) {
        if (this.f86605a.has("SubGroups")) {
            JSONArray jSONArray = this.f86605a.getJSONArray("SubGroups");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.getBoolean("IsIabPurpose")) {
                    map.put(jSONObject.getString("CustomGroupId"), jSONObject.getString("Type"));
                }
            }
        }
    }

    @C0359n0
    /* renamed from: r */
    public String mo105582r() {
        return this.f86612h;
    }

    /* renamed from: s */
    public C35118r mo105583s() {
        return this.f86615k;
    }

    /* renamed from: t */
    public C35119s mo105584t() {
        return this.f86614j;
    }

    /* renamed from: u */
    public boolean mo105585u() {
        return this.f86607c;
    }

    /* renamed from: v */
    public boolean mo105586v() {
        return this.f86611g;
    }

    /* renamed from: w */
    public boolean mo105587w() {
        return this.f86610f;
    }

    /* renamed from: x */
    public boolean mo105588x() {
        return this.f86609e;
    }
}
