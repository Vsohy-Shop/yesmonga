package com.onetrust.otpublishers.headless.p052UI.mobiledatautils;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35126z;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.mobiledatautils.i */
public class C35264i {

    /* renamed from: a */
    public JSONObject f86652a;

    /* renamed from: b */
    public C35126z f86653b;

    @C0363p0
    /* renamed from: a */
    public JSONArray mo105631a() {
        return this.f86652a.optJSONArray("Groups");
    }

    /* renamed from: b */
    public void mo105632b(@C0359n0 Context context, int i, @C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        try {
            this.f86652a = oTPublishersHeadlessSDK.getPreferenceCenterData();
            C35126z h = new C35124x(context).mo105017h(i);
            this.f86653b = h;
            C35256b bVar = new C35256b(i);
            h.mo105065m(bVar.mo105526b(h.mo105066n(), this.f86652a.optString("PcBackgroundColor"), "#FFFFFF", "#2F2F2F"));
            C35126z zVar = this.f86653b;
            zVar.mo105072t(bVar.mo105526b(zVar.mo105041A(), this.f86652a.optString("PcButtonColor"), "#6CC04A", "#80BE5A"));
            this.f86653b.mo105071s().mo104666j(bVar.mo105526b(this.f86653b.mo105071s().mo104667k(), this.f86652a.optString("PcTextColor"), "#696969", "#FFFFFF"));
            C35105e g = this.f86653b.mo105059g();
            g.mo104716t(this.f86652a.optString("PCenterApplyFiltersText"));
            if (C35020d.m143605J(g.mo104296u())) {
                g.mo104716t(this.f86652a.optString("PcButtonTextColor"));
            }
            if (C35020d.m143605J(g.mo104699a())) {
                g.mo104716t(this.f86652a.optString("PcButtonColor"));
            }
            C35102b0 u = this.f86653b.mo105074u();
            if (C35020d.m143605J(u.mo104663g())) {
                u.mo104662f(this.f86652a.optString("PCenterCancelFiltersText"));
            }
            if (C35020d.m143605J(u.mo104667k())) {
                u.mo104662f(this.f86652a.optString("PcTextColor"));
            }
            C35102b0 s = this.f86653b.mo105071s();
            if (C35020d.m143605J(s.mo104667k())) {
                s.mo104662f(this.f86652a.optString("PcTextColor"));
            }
        } catch (JSONException e) {
            OTLogger.m143457l("VendorListFilter", "failed to initialize SDK list filter data, e: " + e);
        }
    }

    /* renamed from: c */
    public C35126z mo105633c() {
        return this.f86653b;
    }
}
