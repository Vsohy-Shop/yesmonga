package com.onetrust.otpublishers.headless.p052UI.mobiledatautils;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.carrefour.fid.android.airship.util.C13758b;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35100a0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35122v;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35126z;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.mobiledatautils.f */
public class C35261f {

    /* renamed from: a */
    public C35102b0 f86618a;

    /* renamed from: b */
    public C35102b0 f86619b;

    /* renamed from: c */
    public C35100a0 f86620c;

    /* renamed from: d */
    public boolean f86621d;

    /* renamed from: e */
    public String f86622e;

    /* renamed from: f */
    public String f86623f;

    /* renamed from: g */
    public String f86624g;

    /* renamed from: h */
    public String f86625h;

    /* renamed from: i */
    public String f86626i;

    /* renamed from: j */
    public String f86627j;

    /* renamed from: k */
    public String f86628k;

    /* renamed from: l */
    public String f86629l;

    /* renamed from: m */
    public C35102b0 f86630m;

    /* renamed from: n */
    public String f86631n = "";

    @C0359n0
    /* renamed from: a */
    public C35102b0 mo105589a() {
        return this.f86630m;
    }

    @C0376v0(api = 17)
    /* renamed from: b */
    public void mo105590b(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK, @C0359n0 Context context, int i) {
        try {
            C35256b bVar = new C35256b(i);
            JSONObject preferenceCenterData = oTPublishersHeadlessSDK.getPreferenceCenterData();
            C35124x xVar = new C35124x(context);
            C35122v f = xVar.mo105015f(i);
            C35126z h = xVar.mo105017h(i);
            this.f86629l = h.mo105052L();
            this.f86627j = h.mo105051K();
            this.f86628k = h.mo105050J();
            this.f86621d = preferenceCenterData.optBoolean("PCShowCookieDescription");
            this.f86618a = new C35263h().mo105611d(preferenceCenterData, f.mo104994z(), C13758b.f33475u0, true);
            this.f86619b = new C35263h().mo105611d(preferenceCenterData, f.mo104993y(), "Description", true);
            this.f86630m = new C35263h().mo105611d(preferenceCenterData, f.mo104968a(), "PCenterAllowAllConsentText", false);
            this.f86620c = new C35263h().mo105609b(f.mo104992x(), f.mo104976i());
            if (!C35020d.m143605J(f.mo104973f())) {
                this.f86622e = bVar.mo105526b(f.mo104973f(), preferenceCenterData.optString("PcTextColor"), "#696969", "#FFFFFF");
            }
            if (!C35020d.m143605J(f.mo104976i())) {
                this.f86623f = bVar.mo105526b(f.mo104976i(), preferenceCenterData.optString("PcBackgroundColor"), "#696969", "#FFFFFF");
            }
            if (!C35020d.m143605J(f.mo104990v())) {
                this.f86624g = bVar.mo105526b(f.mo104990v(), preferenceCenterData.optString("PcButtonColor"), "#6CC04A", "#80BE5A");
            }
            if (!C35020d.m143605J(f.mo104989u())) {
                this.f86625h = bVar.mo105526b(f.mo104989u(), preferenceCenterData.optString("PcTextColor"), "#696969", "#FFFFFF");
            }
            this.f86626i = bVar.mo105527c(f.mo104991w(), "PcTextColor", (JSONObject) null);
            this.f86631n = preferenceCenterData.optString("BConsentText");
        } catch (JSONException e) {
            OTLogger.m143457l("SDKListDataConfig", "Error in ui property object, error message = " + e.getMessage());
        }
    }

    /* renamed from: c */
    public String mo105591c() {
        return this.f86622e;
    }

    /* renamed from: d */
    public String mo105592d() {
        return this.f86623f;
    }

    @C0359n0
    /* renamed from: e */
    public String mo105593e() {
        return this.f86631n;
    }

    /* renamed from: f */
    public String mo105594f() {
        return this.f86626i;
    }

    /* renamed from: g */
    public String mo105595g() {
        return this.f86625h;
    }

    /* renamed from: h */
    public String mo105596h() {
        return this.f86624g;
    }

    /* renamed from: i */
    public C35100a0 mo105597i() {
        return this.f86620c;
    }

    /* renamed from: j */
    public C35102b0 mo105598j() {
        return this.f86619b;
    }

    /* renamed from: k */
    public C35102b0 mo105599k() {
        return this.f86618a;
    }

    @C0363p0
    /* renamed from: l */
    public String mo105600l() {
        return this.f86628k;
    }

    @C0363p0
    /* renamed from: m */
    public String mo105601m() {
        return this.f86627j;
    }

    @C0363p0
    /* renamed from: n */
    public String mo105602n() {
        return this.f86629l;
    }

    /* renamed from: o */
    public boolean mo105603o() {
        return this.f86621d;
    }
}
