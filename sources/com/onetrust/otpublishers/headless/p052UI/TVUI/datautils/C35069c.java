package com.onetrust.otpublishers.headless.p052UI.TVUI.datautils;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.installations.local.PersistedInstallation;
import com.onetrust.otpublishers.headless.Internal.C35019c;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35036e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35112l;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35113m;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35114n;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35120t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.datautils.c */
public class C35069c {

    /* renamed from: j */
    public static C35069c f85396j;

    /* renamed from: a */
    public JSONObject f85397a;

    /* renamed from: b */
    public String f85398b;

    /* renamed from: c */
    public JSONObject f85399c;

    /* renamed from: d */
    public JSONObject f85400d;

    /* renamed from: e */
    public boolean f85401e;

    /* renamed from: f */
    public String f85402f;

    /* renamed from: g */
    public String f85403g;

    /* renamed from: h */
    public boolean f85404h;

    /* renamed from: i */
    public C35120t f85405i;

    /* renamed from: h */
    public static void m143923h(@C0359n0 C35105e eVar, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        if (C35020d.m143605J(eVar.mo104295s())) {
            eVar.mo104716t(str);
        }
        if (C35020d.m143605J(eVar.mo104699a())) {
            eVar.mo104701d(str2);
        }
        if (C35020d.m143605J(eVar.mo104296u())) {
            eVar.mo104718v(str3);
        }
        int i = 0;
        if (!C35019c.m143598c(eVar.mo104719x(), false) || C35020d.m143605J(eVar.mo104295s())) {
            i = 8;
        }
        eVar.mo104294b(i);
        eVar.mo104709l(C35068b.m143905i().mo104384j());
        eVar.mo104711n(C35068b.m143905i().mo104385k());
    }

    /* renamed from: i */
    public static void m143924i(@C0359n0 JSONArray jSONArray, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, int i) {
        try {
            if (jSONArray.getJSONObject(i).has("SubGroups")) {
                String optString = jSONArray.getJSONObject(i).optString("CustomGroupId");
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = jSONArray.getJSONObject(i).getJSONArray("SubGroups");
                jSONObject2.put(optString, jSONArray.getJSONObject(i).optBoolean("ShowSubgroupToggle"));
                for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                    jSONArray2.put(jSONArray3.getJSONObject(i2).optString("CustomGroupId"));
                    jSONObject.put(optString, jSONArray2);
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error in getting subgroups for a category on TV, err: " + e.getMessage());
        }
    }

    /* renamed from: y */
    public static synchronized C35069c m143925y() {
        C35069c cVar;
        synchronized (C35069c.class) {
            if (f85396j == null) {
                f85396j = new C35069c();
            }
            cVar = f85396j;
        }
        return cVar;
    }

    @C0359n0
    /* renamed from: A */
    public String mo104393A() {
        return this.f85405i.mo104937c0().mo104667k() != null ? this.f85405i.mo104937c0().mo104667k() : "#696969";
    }

    @C0363p0
    /* renamed from: B */
    public final JSONObject mo104394B() {
        return this.f85399c;
    }

    @C0363p0
    /* renamed from: C */
    public final JSONObject mo104395C() {
        return this.f85400d;
    }

    @C0359n0
    /* renamed from: D */
    public C35112l mo104396D() {
        return this.f85405i.mo104924S();
    }

    @C0359n0
    /* renamed from: E */
    public C35120t mo104397E() {
        return this.f85405i;
    }

    @C0359n0
    /* renamed from: F */
    public C35105e mo104398F() {
        return this.f85405i.mo104930Y();
    }

    @C0359n0
    /* renamed from: G */
    public String mo104399G() {
        return this.f85405i.mo104939d0().mo104663g() != null ? this.f85405i.mo104939d0().mo104663g() : "";
    }

    @C0359n0
    /* renamed from: H */
    public C35102b0 mo104400H() {
        return this.f85405i.mo104936c().mo104763a();
    }

    /* renamed from: I */
    public boolean mo104401I() {
        return this.f85401e;
    }

    @C0359n0
    /* renamed from: J */
    public C35113m mo104402J() {
        return this.f85405i.mo104925T();
    }

    /* renamed from: a */
    public int mo104403a(int i) {
        return i > -1 ? 0 : 8;
    }

    /* renamed from: b */
    public int mo104404b(boolean z) {
        return z ? 0 : 8;
    }

    @C0359n0
    /* renamed from: c */
    public C35105e mo104405c() {
        return this.f85405i.mo104938d();
    }

    @C0359n0
    /* renamed from: d */
    public String mo104406d(@C0359n0 JSONObject jSONObject) {
        String optString = jSONObject.optString("GroupDescription");
        return (!jSONObject.has("GroupDescriptionOTT") || C35020d.m143605J(jSONObject.optString("GroupDescriptionOTT")) || jSONObject.isNull("GroupDescriptionOTT")) ? optString : jSONObject.optString("GroupDescriptionOTT");
    }

    @C0363p0
    /* renamed from: e */
    public JSONObject mo104407e(@C0359n0 Context context) {
        JSONObject jSONObject = this.f85397a;
        return jSONObject != null ? jSONObject : new C35015e(context).mo103995f();
    }

    @C0359n0
    /* renamed from: f */
    public final JSONObject mo104408f(@C0363p0 JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                m143924i(jSONArray, jSONObject, jSONObject2, i);
            }
        }
        this.f85400d = jSONObject2;
        return jSONObject;
    }

    /* renamed from: g */
    public final void mo104409g(C35068b bVar) {
        C35113m T = this.f85405i.mo104925T();
        T.mo104787j(bVar.mo104388n());
        if (C35020d.m143605J(T.mo104786i())) {
            T.mo104787j(this.f85405i.mo104955q());
        }
        T.mo104789l(bVar.mo104391q());
        if (C35020d.m143605J(T.mo104788k())) {
            T.mo104787j(this.f85405i.mo104928W().mo104667k());
        }
        T.mo104783f(bVar.mo104389o());
        T.mo104785h(bVar.mo104390p());
        T.mo104779b(bVar.mo104386l());
        T.mo104781d(bVar.mo104387m());
    }

    /* renamed from: j */
    public boolean mo104410j(@C0359n0 String str) {
        JSONObject C = mo104395C();
        if (C == null || C35020d.m143605J(str)) {
            return true;
        }
        return C.optBoolean(str);
    }

    /* renamed from: k */
    public boolean mo104411k(@C0359n0 String str, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        JSONObject B = mo104394B();
        if (!B.names().toString().contains(str)) {
            return false;
        }
        JSONArray optJSONArray = B.optJSONArray(str);
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (oTPublishersHeadlessSDK.getPurposeLegitInterestLocal(optJSONArray.getString(i)) == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public int mo104412l(int i) {
        return (!this.f85404h || i <= -1) ? 8 : 0;
    }

    @C0359n0
    /* renamed from: m */
    public String mo104413m() {
        return this.f85405i.mo104950l().mo104663g() != null ? this.f85405i.mo104950l().mo104663g() : this.f85398b;
    }

    @C0359n0
    /* renamed from: n */
    public String mo104414n(@C0359n0 JSONObject jSONObject) {
        return new C35036e().mo104305g(jSONObject.optString("DescriptionLegal")).toString().replace("\n\n", "\n\n• ").concat("*").replace("\n\n• *", "");
    }

    /* renamed from: o */
    public void mo104415o(@C0359n0 Context context) {
        try {
            JSONObject e = mo104407e(context);
            this.f85397a = e;
            if (e != null) {
                String optString = e.optString("PcBackgroundColor");
                String optString2 = this.f85397a.optString("PcTextColor");
                String optString3 = this.f85397a.optString("PcButtonColor");
                String optString4 = this.f85397a.optString("MainText");
                String optString5 = this.f85397a.optString("MainInfoText");
                String optString6 = this.f85397a.optString("ConfirmText");
                String optString7 = this.f85397a.optString("PCenterRejectAllButtonText");
                String optString8 = this.f85397a.optString("PreferenceCenterConfirmText");
                String optString9 = this.f85397a.optString("PcButtonTextColor");
                this.f85398b = this.f85397a.optString("AlwaysActiveText").isEmpty() ? "Always On" : this.f85397a.optString("AlwaysActiveText");
                String optString10 = this.f85397a.optString("OptanonLogo");
                this.f85399c = mo104408f(this.f85397a.optJSONArray("Groups"));
                this.f85401e = this.f85397a.optBoolean("IsIabEnabled");
                this.f85402f = this.f85397a.optString("BConsentText");
                this.f85403g = this.f85397a.optString("BLegitInterestText");
                if (this.f85397a.has("LegIntSettings") && !C35020d.m143605J("LegIntSettings")) {
                    this.f85404h = this.f85397a.getJSONObject("LegIntSettings").getBoolean("PAllowLI");
                }
                String optString11 = this.f85397a.optString("VendorListText");
                C35068b i = C35068b.m143905i();
                C35120t b = new C35114n(context).mo104802b(22);
                this.f85405i = b;
                if (b != null) {
                    if (C35020d.m143605J(b.mo104939d0().mo104663g())) {
                        this.f85405i.mo104939d0().mo104662f(optString4);
                    }
                    if (C35020d.m143605J(this.f85405i.mo104937c0().mo104663g())) {
                        this.f85405i.mo104937c0().mo104662f(optString5);
                    }
                    m143923h(this.f85405i.mo104938d(), optString6, optString3, optString9);
                    m143923h(this.f85405i.mo104930Y(), optString7, optString3, optString9);
                    m143923h(this.f85405i.mo104963x(), optString8, optString3, optString9);
                    int i2 = 0;
                    this.f85405i.mo104963x().mo104294b(0);
                    if (C35020d.m143605J(this.f85405i.mo104924S().mo104774c())) {
                        this.f85405i.mo104924S().mo104775d(optString10);
                    }
                    if (C35020d.m143605J(this.f85405i.mo104955q())) {
                        this.f85405i.mo104954p(optString);
                    }
                    mo104409g(i);
                    C35102b0 c0 = this.f85405i.mo104937c0();
                    if (C35020d.m143605J(c0.mo104667k())) {
                        c0.mo104666j(optString2);
                    }
                    if (C35020d.m143605J(this.f85405i.mo104936c().mo104763a().mo104663g())) {
                        this.f85405i.mo104936c().mo104763a().mo104662f(optString11);
                    }
                    C35102b0 J = this.f85405i.mo104915J();
                    C35102b0 M = this.f85405i.mo104918M();
                    C35102b0 e0 = this.f85405i.mo104941e0();
                    C35102b0 f0 = this.f85405i.mo104943f0();
                    C35102b0 D = this.f85405i.mo104909D();
                    boolean b2 = C35019c.m143597b(this.f85405i.mo104912G());
                    boolean b3 = C35019c.m143597b(this.f85405i.mo104935b0());
                    boolean b4 = C35019c.m143597b(this.f85405i.mo104906A());
                    int i3 = b2 ? 0 : 8;
                    int i4 = b3 ? 0 : 8;
                    if (!b4 || C35020d.m143605J(this.f85405i.mo104909D().mo104663g())) {
                        i2 = 8;
                    }
                    J.mo104658b(i3);
                    M.mo104658b(i3);
                    e0.mo104658b(i4);
                    f0.mo104658b(i4);
                    D.mo104658b(i2);
                    if (0 == new C35015e(context).mo103980O()) {
                        e0.mo104662f(this.f85405i.mo104926U().mo104663g());
                    }
                }
            }
        } catch (JSONException e2) {
            OTLogger.m143457l("OneTrust", "Error while parsing preference center data, error: " + e2.getMessage());
        }
    }

    /* renamed from: p */
    public void mo104416p(@C0363p0 String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    this.f85397a = new JSONObject(str);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "PC Data not found, err = " + e.getMessage());
            }
        }
    }

    /* renamed from: q */
    public boolean mo104417q(@C0359n0 String str, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        JSONObject B = mo104394B();
        if (!B.names().toString().contains(str)) {
            return false;
        }
        JSONArray optJSONArray = B.optJSONArray(str);
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (oTPublishersHeadlessSDK.getPurposeConsentLocal(optJSONArray.getString(i)) == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public int mo104418r(@C0359n0 JSONObject jSONObject) {
        String n = mo104414n(jSONObject);
        return (C35020d.m143605J(n) || !mo104401I() || "*".equals(n)) ? 8 : 0;
    }

    @C0359n0
    /* renamed from: s */
    public String mo104419s() {
        return this.f85405i.mo104955q() != null ? this.f85405i.mo104955q() : "#FFFFFF";
    }

    /* renamed from: t */
    public int mo104420t(@C0359n0 JSONObject jSONObject) {
        return (jSONObject.optString(PersistedInstallation.f80251i).contains("always") || !mo104410j(jSONObject.optString("Parent"))) ? 8 : 0;
    }

    @C0359n0
    /* renamed from: u */
    public C35105e mo104421u() {
        return this.f85405i.mo104963x();
    }

    @C0359n0
    /* renamed from: v */
    public String mo104422v() {
        return this.f85402f;
    }

    /* renamed from: w */
    public boolean mo104423w(@C0359n0 JSONObject jSONObject) {
        return !jSONObject.has("SubGroups") || !jSONObject.optBoolean("ShowSubgroup");
    }

    @C0359n0
    /* renamed from: x */
    public String mo104424x() {
        return this.f85405i.mo104937c0().mo104663g() != null ? this.f85405i.mo104937c0().mo104663g() : "";
    }

    @C0359n0
    /* renamed from: z */
    public String mo104425z() {
        return this.f85403g;
    }
}
