package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.measurement.api.C30638a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Models.C35000d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABTCFKeys;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.n */
public class C34982n {

    /* renamed from: a */
    public Context f85096a;

    /* renamed from: b */
    public JSONObject f85097b = new JSONObject();

    /* renamed from: c */
    public JSONObject f85098c = new JSONObject();

    /* renamed from: d */
    public SharedPreferences f85099d;

    /* renamed from: e */
    public C35015e f85100e;

    /* renamed from: f */
    public String f85101f = null;

    /* renamed from: g */
    public C34967b0 f85102g;

    public C34982n(@C0359n0 Context context) {
        this.f85096a = context;
        this.f85099d = new C35014d(context, "OTT_DEFAULT_USER").mo103965b();
        this.f85100e = new C35015e(context);
        this.f85102g = new C34967b0(context);
    }

    @C0344h1
    /* renamed from: n */
    public static void m143282n(boolean z, @C0359n0 JSONObject jSONObject) {
        for (int i = 0; i < jSONObject.length(); i++) {
            JSONArray names = jSONObject.names();
            if (names != null) {
                if (jSONObject.getJSONObject(names.get(i).toString()).getInt(OTVendorUtils.CONSENT_TYPE) >= 0) {
                    jSONObject.getJSONObject(names.get(i).toString()).put(OTVendorUtils.CONSENT_TYPE, z);
                }
                if (jSONObject.getJSONObject(names.get(i).toString()).getInt(OTVendorUtils.LEGITIMATE_CONSENT_TYPE) >= 0) {
                    jSONObject.getJSONObject(names.get(i).toString()).put(OTVendorUtils.LEGITIMATE_CONSENT_TYPE, z ? 1 : 0);
                }
            }
        }
    }

    /* renamed from: o */
    public static void m143283o(boolean z, @C0359n0 JSONObject jSONObject, @C0363p0 JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (!"1".equals(jSONArray.getString(i))) {
                    jSONObject.getJSONObject("purposeLegitimateInterests").put(jSONArray.getString(i), z ? 1 : 0);
                }
            }
        }
    }

    /* renamed from: p */
    public static void m143284p(boolean z, @C0359n0 JSONObject jSONObject, @C0363p0 JSONArray jSONArray, @C0363p0 JSONArray jSONArray2, @C0363p0 JSONArray jSONArray3, @C0363p0 JSONArray jSONArray4, @C0359n0 JSONObject jSONObject2) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                jSONObject.getJSONObject("purposes").put(jSONArray.getString(i), z);
            }
        }
        if (jSONArray2 != null && jSONArray2.length() > 0) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                jSONObject.getJSONObject("special_feature_opt_ins").put(jSONArray2.getString(i2), z);
            }
        }
        if (jSONArray3 != null && jSONArray3.length() > 0) {
            for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                jSONObject.getJSONObject("stacks").put(jSONArray3.getString(i3), z ? 1 : 0);
            }
        }
        m143283o(z, jSONObject, jSONArray4);
        m143282n(z, jSONObject2);
    }

    /* renamed from: A */
    public int mo103793A(@C0359n0 String str) {
        try {
            return this.f85097b.has(str) ? this.f85097b.getInt(str) : this.f85100e.mo103996g(str);
        } catch (JSONException e) {
            OTLogger.m143457l("CustomGroupDetails", "Error while getting updated value of Purpose Consent " + e.getMessage());
            return -1;
        }
    }

    @C0359n0
    /* renamed from: B */
    public final String mo103794B() {
        JSONObject jSONObject;
        C34990u uVar = new C34990u(this.f85096a);
        String string = this.f85099d.getString("OTT_IAB_CONSENTABLE_PURPOSES", "");
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = new JSONObject(string);
            try {
                if (this.f85097b.length() > 0) {
                    mo103812d(uVar, jSONObject, this.f85097b);
                } else {
                    OTLogger.m143447b("CustomGroupDetails", "No IAB groups are updated");
                }
                if (this.f85098c.length() > 0) {
                    mo103811c(uVar, jSONObject);
                }
                OTLogger.m143447b("CustomGroupDetails", "Saved Purpose Legitimate Interests Changes: " + this.f85098c);
            } catch (JSONException e) {
                e = e;
                jSONObject2 = jSONObject;
                OTLogger.m143457l("CustomGroupDetails", "Error while updating IAB group consent object " + e.getMessage());
                jSONObject = jSONObject2;
                return jSONObject.toString();
            }
        } catch (JSONException e2) {
            e = e2;
            OTLogger.m143457l("CustomGroupDetails", "Error while updating IAB group consent object " + e.getMessage());
            jSONObject = jSONObject2;
            return jSONObject.toString();
        }
        return jSONObject.toString();
    }

    /* renamed from: C */
    public final void mo103795C(@C0359n0 String str, @C0363p0 JSONObject jSONObject, boolean z) {
        Context context;
        C34990u uVar;
        if (z) {
            OTLogger.m143458m("CustomGroupDetails", "updated IAB user choices" + str);
            this.f85099d.edit().putString("OTT_IAB_CONSENTABLE_PURPOSES", str).apply();
            if (jSONObject != null) {
                this.f85099d.edit().putString("OT_IAB_ACTIVE_VENDORLIST", jSONObject.toString()).apply();
            }
            OTLogger.m143458m("CustomGroupDetails", "is IAB enabled : " + new C35020d().mo104023S(this.f85096a));
            if (new C35020d().mo104023S(this.f85096a)) {
                context = this.f85096a;
                uVar = new C34990u(context);
            }
            new C34988t(this.f85096a).mo103862l(this.f85100e);
        }
        OTLogger.m143458m("CustomGroupDetails", "updated IAB user choices " + str);
        this.f85099d.edit().putString("OTT_IAB_CONSENTABLE_PURPOSES", str).apply();
        this.f85098c = new JSONObject();
        context = this.f85096a;
        uVar = new C34990u(context);
        uVar.mo103879i(context);
        new C34988t(this.f85096a).mo103862l(this.f85100e);
    }

    /* renamed from: D */
    public void mo103796D(@C0359n0 String str, boolean z) {
        if (mo103803K(str, z)) {
            if (C35020d.m143605J(this.f85101f)) {
                try {
                    this.f85101f = mo103801I();
                } catch (JSONException unused) {
                    OTLogger.m143457l("CustomGroupDetails", "Error on creating valid consent able parent child map.");
                }
            }
            mo103814f(str, z, this.f85101f);
        }
    }

    /* renamed from: E */
    public final void mo103797E(@C0359n0 JSONArray jSONArray, boolean z) {
        for (int i = 0; i < jSONArray.length(); i++) {
            mo103803K(jSONArray.get(i).toString(), z);
        }
    }

    /* renamed from: F */
    public final void mo103798F(@C0359n0 JSONObject jSONObject, @C0359n0 String str) {
        String b = mo103810b(str);
        if (b != null && !C35020d.m143605J(b)) {
            mo103803K(b, mo103829x(jSONObject.getJSONArray(b)));
        }
    }

    /* renamed from: G */
    public void mo103799G(boolean z, boolean z2) {
        String string = this.f85099d.getString("OTT_CONSENT_STATUS", "");
        String string2 = this.f85099d.getString("OT_INTERNAL_SDK_STATUS_MAP", "");
        C35000d dVar = new C35000d(this.f85096a);
        JSONObject E = C35020d.m143602E(string);
        boolean u = mo103826u(dVar);
        if (new C35020d().mo104023S(this.f85096a) && !z2) {
            mo103795C(mo103794B(), (JSONObject) null, false);
        }
        if (!z2 && !C35020d.m143605J(string2)) {
            this.f85102g.mo103646n(string2);
        }
        mo103818j(z, string, string2, E, u);
        new C34968c(this.f85096a).mo103649c(true);
        mo103807O();
        this.f85100e.mo103972G(String.valueOf(System.currentTimeMillis()));
        dVar.mo103934e(mo103809a());
        mo103805M();
        if (!new C35020d().mo104023S(this.f85096a)) {
            mo103817i(false);
        }
    }

    /* renamed from: H */
    public int mo103800H(@C0359n0 String str) {
        try {
            if (this.f85098c.has(str)) {
                return this.f85098c.getInt(str);
            }
            return new C34990u(this.f85096a).mo103873a(C34990u.m143387y(str), "purposeLegitimateInterests", C30638a.C30639a.f73205n, new C35014d(this.f85096a, "OTT_DEFAULT_USER"), false);
        } catch (JSONException e) {
            OTLogger.m143457l("CustomGroupDetails", "Error while getting updated value of Purpose Legit Interest " + e.getMessage());
            return -1;
        }
    }

    @C0359n0
    /* renamed from: I */
    public final String mo103801I() {
        String X = this.f85100e.mo103989X();
        String string = this.f85099d.getString("OTT_CONSENT_STATUS", "");
        String J = this.f85100e.mo103975J();
        JSONObject jSONObject = new JSONObject();
        if (!C35020d.m143605J(J)) {
            jSONObject = new JSONObject(J).getJSONObject("purposes");
        }
        JSONObject jSONObject2 = new JSONObject(X);
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string2 = jSONArray.getString(i);
                if (this.f85100e.mo104001m(string2, string) && mo103830y(jSONObject, string2)) {
                    jSONArray2.put(string2);
                }
            }
            jSONObject3.put(next, jSONArray2);
        }
        return jSONObject3.toString();
    }

    /* renamed from: J */
    public void mo103802J(boolean z, boolean z2) {
        String string = this.f85099d.getString("OTT_IAB_CONSENTABLE_PURPOSES", "");
        String string2 = this.f85099d.getString("OTT_ALWAYS_ACTIVE_GROUPS", "");
        String string3 = this.f85099d.getString("OT_INTERNAL_SDK_STATUS_MAP", "");
        if (!this.f85099d.contains("OT_GROUP_ID_OBJECT")) {
            C34995z.m143444a(this.f85100e.mo103983R(), this.f85099d);
        }
        String string4 = this.f85099d.getString("OT_GROUP_ID_OBJECT", "");
        try {
            JSONObject jSONObject = new JSONObject();
            if (!C35020d.m143605J(string4)) {
                jSONObject = new JSONObject(string4);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (!C35020d.m143605J(string)) {
                jSONObject2 = new JSONObject(string);
            }
            JSONObject jSONObject3 = jSONObject2;
            JSONArray names = jSONObject.names();
            JSONObject jSONObject4 = new JSONObject(string2);
            boolean z3 = mo103831z(z, z2, false, names, jSONObject3);
            mo103822q(z, z2);
            C34983o.m143329h(z, z2, this.f85100e);
            mo103823r(z, z2, jSONObject3);
            mo103825t(z, z2, z3, string3);
            if (z3 || jSONObject4.length() > 0) {
                mo103799G(z2, true);
            }
        } catch (JSONException e) {
            OTLogger.m143457l("CustomGroupDetails", "error while fetching all categories" + e.getMessage());
        }
    }

    /* renamed from: K */
    public boolean mo103803K(@C0359n0 String str, boolean z) {
        if (new C35015e(this.f85096a).mo104005q(str)) {
            return mo103828w(str, z);
        }
        OTLogger.m143458m("CustomGroupDetails", "Group ID doesn't exist/not allowed to update status for " + str + " groupId.");
        return false;
    }

    @C0359n0
    /* renamed from: L */
    public int mo103804L(@C0359n0 String str) {
        return this.f85102g.mo103634a(str, false);
    }

    @C0344h1
    /* renamed from: M */
    public void mo103805M() {
        try {
            if (!new C34985q(this.f85096a).mo103846d()) {
                OTLogger.m143447b("CustomGroupDetails", "Consented location update failed, data downloaded location is empty.");
            }
        } catch (Exception e) {
            OTLogger.m143457l("CustomGroupDetails", "Error on saving consented location. Error msg = " + e.getMessage());
        }
    }

    /* renamed from: N */
    public void mo103806N(@C0359n0 String str, boolean z) {
        try {
            if (new JSONObject(this.f85099d.getString("OTT_IAB_CONSENTABLE_PURPOSES", "")).getJSONObject("purposeLegitimateInterests").has(C34990u.m143387y(str))) {
                this.f85098c.put(str, z ? 1 : 0);
                OTLogger.m143458m("CustomGroupDetails", "Legitimate Interest value updated for Purpose " + str + " with value : " + z);
                return;
            }
            OTLogger.m143461p("CustomGroupDetails", "Legitimate Interest value not updated for Purpose " + str);
        } catch (Exception e) {
            OTLogger.m143457l("CustomGroupDetails", "error in updating purpose legitimate interest status. err = " + e.getMessage());
        }
    }

    @C0344h1
    /* renamed from: O */
    public void mo103807O() {
        if (!this.f85100e.mo103993d()) {
            this.f85099d.edit().putBoolean("isServiceSpecific", true).apply();
        }
    }

    /* renamed from: P */
    public void mo103808P(@C0359n0 String str, boolean z) {
        this.f85102g.mo103645m(str, z);
    }

    @C0359n0
    /* renamed from: a */
    public final String mo103809a() {
        return new C35000d(this.f85096a).mo103931b(this.f85100e.mo103973H());
    }

    @C0363p0
    /* renamed from: b */
    public String mo103810b(@C0359n0 String str) {
        JSONObject jSONObject = new JSONObject(this.f85100e.mo103988W());
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo103811c(@C0359n0 C34990u uVar, @C0359n0 JSONObject jSONObject) {
        for (int i = 0; i < this.f85098c.length(); i++) {
            String string = this.f85098c.names().getString(i);
            if (uVar.mo103872G(string)) {
                jSONObject.getJSONObject("purposeLegitimateInterests").put(C34990u.m143387y(string), this.f85098c.getInt(string));
            }
        }
    }

    @C0344h1
    /* renamed from: d */
    public void mo103812d(@C0359n0 C34990u uVar, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        for (int i = 0; i < jSONObject2.length(); i++) {
            String string = jSONObject2.names().getString(i);
            if (uVar.mo103872G(string)) {
                jSONObject.getJSONObject(uVar.mo103868B(string)).put(C34990u.m143387y(string), jSONObject2.getInt(string));
            }
        }
        OTLogger.m143447b("CustomGroupDetails", "IAB purposes updated : " + jSONObject);
    }

    /* renamed from: e */
    public void mo103813e(@C0359n0 String str, @C0359n0 JSONObject jSONObject, boolean z) {
        if (z || 0 == new C35015e(this.f85096a).mo103980O()) {
            new C34977i(this.f85096a).mo103756e(jSONObject);
            try {
                new C34977i(this.f85096a).mo103754c(new JSONObject(str));
            } catch (JSONException unused) {
                OTLogger.m143457l("CustomGroupDetails", "Error while broadcasting SDK without any modification");
            }
        }
    }

    /* renamed from: f */
    public final void mo103814f(@C0359n0 String str, boolean z, @C0363p0 String str2) {
        if (!C35020d.m143605J(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has(str)) {
                    mo103797E(jSONObject.getJSONArray(str), z);
                } else {
                    mo103798F(jSONObject, str);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("CustomGroupDetails", "Error on getting parent child JSON. Error message = " + e.getMessage());
            }
        }
    }

    /* renamed from: g */
    public void mo103815g(JSONArray jSONArray, String str, boolean z) {
        for (int i = 0; i < jSONArray.length(); i++) {
            mo103828w(jSONArray.get(i).toString(), z);
        }
        mo103828w(str, z);
        mo103799G(false, false);
    }

    /* renamed from: h */
    public void mo103816h(@C0359n0 JSONArray jSONArray, boolean z) {
        this.f85102g.mo103639g(jSONArray, z);
    }

    /* renamed from: i */
    public final void mo103817i(boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.f85096a).edit();
        OTLogger.m143458m("CustomGroupDetails", "Setting IABTCF_gdprApplies to 0.");
        edit.putInt(OTIABTCFKeys.IABTCF_GDPRAPPLIES, z ? 1 : 0);
        edit.apply();
    }

    /* renamed from: j */
    public final void mo103818j(boolean z, @C0363p0 String str, @C0359n0 String str2, @C0363p0 JSONObject jSONObject, boolean z2) {
        if (this.f85097b.length() > 0) {
            mo103819k(z, str, str2, z2);
        } else {
            mo103820l(z, str2, jSONObject, z2);
        }
    }

    /* renamed from: k */
    public final void mo103819k(boolean z, @C0363p0 String str, @C0359n0 String str2, boolean z2) {
        boolean z3;
        JSONObject jSONObject = this.f85097b;
        OTLogger.m143447b("CustomGroupDetails", "saved consent changes = " + this.f85097b.toString() + ". resetting keys.");
        this.f85097b = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            z3 = mo103827v(str, jSONObject, jSONObject2);
        } catch (JSONException e) {
            OTLogger.m143457l("CustomGroupDetails", "Error while updating consents, e: " + e.toString());
            z3 = false;
        }
        boolean z4 = z3;
        new C34980l(this.f85096a).mo103778e(jSONObject, z);
        try {
            mo103821m(z, str2, z2, jSONObject, jSONObject2, z4);
        } catch (Exception e2) {
            OTLogger.m143457l("CustomGroupDetails", "Error while getting domaindata, err : " + e2.getMessage());
        }
    }

    /* renamed from: l */
    public final void mo103820l(boolean z, @C0359n0 String str, @C0363p0 JSONObject jSONObject, boolean z2) {
        if (jSONObject != null) {
            new C34980l(this.f85096a).mo103778e(jSONObject, z);
            mo103813e(str, jSONObject, z2);
            OTLogger.m143461p("CustomGroupDetails", "save consent status called without modifying anything");
            return;
        }
        OTLogger.m143457l("CustomGroupDetails", "Empty consent object ");
    }

    /* renamed from: m */
    public void mo103821m(boolean z, @C0359n0 String str, boolean z2, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, boolean z3) {
        if (z2) {
            new C34977i(this.f85096a).mo103756e(jSONObject);
        } else if (z3) {
            new C34977i(this.f85096a).mo103756e(jSONObject2);
        }
    }

    /* renamed from: q */
    public final void mo103822q(boolean z, boolean z2) {
        if (this.f85100e.mo103992c() && !z2) {
            new C34988t(this.f85096a).mo103860j(this.f85099d, this.f85100e, z);
        }
    }

    /* renamed from: r */
    public final void mo103823r(boolean z, boolean z2, JSONObject jSONObject) {
        if (jSONObject.length() > 0) {
            JSONArray names = jSONObject.getJSONObject("purposes").names();
            JSONArray names2 = jSONObject.getJSONObject("special_feature_opt_ins").names();
            JSONArray names3 = jSONObject.getJSONObject("stacks").names();
            JSONArray names4 = jSONObject.getJSONObject("purposeLegitimateInterests").names();
            String c = new C34990u(this.f85096a).mo103874c();
            JSONObject jSONObject2 = C35020d.m143605J(c) ? new JSONObject() : new JSONObject(c);
            if (!z2 && new C35020d().mo104023S(this.f85096a)) {
                m143284p(z, jSONObject, names, names2, names3, names4, jSONObject2);
            }
            mo103795C(jSONObject.toString(), jSONObject2, true);
        }
        if (!new C35020d().mo104023S(this.f85096a)) {
            mo103817i(false);
        }
    }

    /* renamed from: s */
    public final void mo103824s(boolean z, boolean z2, @C0359n0 JSONObject jSONObject, @C0359n0 String str) {
        if (mo103830y(jSONObject, str)) {
            if (z2) {
                z = this.f85100e.mo103996g(str) == 1;
            }
            mo103803K(str, z);
        }
    }

    /* renamed from: t */
    public final void mo103825t(boolean z, boolean z2, boolean z3, @C0363p0 String str) {
        if (z3 && !C35020d.m143605J(str) && str != null) {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            boolean z4 = false;
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject.getInt(next) == 1) {
                    z4 = true;
                } else if (jSONObject.getInt(next) == 0) {
                    z4 = false;
                }
                if (z2) {
                    mo103808P(next, z4);
                } else {
                    mo103808P(next, z);
                }
            }
            this.f85102g.mo103646n(str);
        }
    }

    /* renamed from: u */
    public final boolean mo103826u(@C0359n0 C35000d dVar) {
        try {
            return dVar.mo103932c(this.f85100e.mo104014z());
        } catch (JSONException e) {
            OTLogger.m143457l("CustomGroupDetails", "error while getting old consent " + e.getMessage());
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r8 != r7) goto L_0x004b;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo103827v(@androidx.annotation.C0363p0 java.lang.String r12, @androidx.annotation.C0359n0 org.json.JSONObject r13, @androidx.annotation.C0359n0 org.json.JSONObject r14) {
        /*
            r11 = this;
            com.onetrust.otpublishers.headless.Internal.Helper.j r0 = new com.onetrust.otpublishers.headless.Internal.Helper.j
            android.content.Context r1 = r11.f85096a
            r0.<init>(r1)
            java.lang.String r1 = r0.mo103768l()
            boolean r2 = com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r12)
            if (r2 == 0) goto L_0x0017
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            goto L_0x001d
        L_0x0017:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r12)
            r12 = r2
        L_0x001d:
            java.util.Iterator r2 = r13.keys()
            r3 = 0
            r4 = r3
        L_0x0023:
            boolean r5 = r2.hasNext()
            java.lang.String r6 = "FIRST_TIME_CONSENT_LOG"
            if (r5 == 0) goto L_0x0060
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            int r7 = r13.getInt(r5)
            boolean r8 = r12.has(r5)
            r9 = 1
            if (r8 == 0) goto L_0x004b
            int r8 = r12.getInt(r5)
            android.content.SharedPreferences r10 = r11.f85099d
            boolean r6 = r10.getBoolean(r6, r9)
            if (r6 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            if (r8 == r7) goto L_0x0052
        L_0x004b:
            r12.put(r5, r7)
            r14.put(r5, r7)
            r4 = r9
        L_0x0052:
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0023
            if (r7 != r9) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r9 = r3
        L_0x005c:
            r0.mo103764g(r9, r3)
            goto L_0x0023
        L_0x0060:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "consent values saved as  "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "CustomGroupDetails"
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143458m(r14, r13)
            android.content.SharedPreferences r13 = r11.f85099d
            android.content.SharedPreferences$Editor r13 = r13.edit()
            android.content.SharedPreferences$Editor r13 = r13.putBoolean(r6, r3)
            r13.apply()
            android.content.SharedPreferences r13 = r11.f85099d
            android.content.SharedPreferences$Editor r13 = r13.edit()
            java.lang.String r12 = r12.toString()
            java.lang.String r14 = "OTT_CONSENT_STATUS"
            android.content.SharedPreferences$Editor r12 = r13.putString(r14, r12)
            r12.apply()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.Internal.Helper.C34982n.mo103827v(java.lang.String, org.json.JSONObject, org.json.JSONObject):boolean");
    }

    /* renamed from: w */
    public final boolean mo103828w(@C0359n0 String str, boolean z) {
        try {
            if (!this.f85100e.mo104008t(str)) {
                this.f85097b.put(str, z ? 1 : 0);
                OTLogger.m143447b("CustomGroupDetails", "Consent updated for group : " + str + " with value : " + z);
                return true;
            }
            OTLogger.m143458m("CustomGroupDetails", "Consent not updated for Always Active group : " + str);
            return false;
        } catch (JSONException e) {
            OTLogger.m143457l("CustomGroupDetails", "error in updating consent status. err = " + e.getMessage());
            return false;
        }
    }

    /* renamed from: x */
    public final boolean mo103829x(@C0359n0 JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (mo103793A(jSONArray.get(i).toString()) != 1) {
                return false;
            }
        }
        return true;
    }

    @C0344h1
    /* renamed from: y */
    public boolean mo103830y(@C0359n0 JSONObject jSONObject, @C0359n0 String str) {
        return (!str.startsWith("IAB") && !str.startsWith("ISF")) || jSONObject.has(C34990u.m143387y(str));
    }

    /* renamed from: z */
    public final boolean mo103831z(boolean z, boolean z2, boolean z3, @C0363p0 JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject.has("purposes")) {
            jSONObject2 = jSONObject.getJSONObject("purposes");
        }
        if (jSONArray == null || jSONArray.length() <= 0) {
            OTLogger.m143457l("CustomGroupDetails", "No categories found to update");
            return z3;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            mo103824s(z, z2, jSONObject2, jSONArray.getString(i));
        }
        return true;
    }
}
