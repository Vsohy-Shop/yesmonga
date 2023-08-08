package com.onetrust.otpublishers.headless.Public.uiutils;

import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34984p;
import com.onetrust.otpublishers.headless.Internal.Helper.C34990u;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OTVendorUtils {
    public static final String CONSENT_TYPE = "consent";
    public static final String LEGITIMATE_CONSENT_TYPE = "legIntStatus";

    /* renamed from: a */
    public ItemListener f85227a;

    /* renamed from: b */
    public JSONObject f85228b = new JSONObject();

    /* renamed from: c */
    public JSONObject f85229c = new JSONObject();

    /* renamed from: d */
    public JSONObject f85230d = new JSONObject();

    /* renamed from: e */
    public JSONObject f85231e = new JSONObject();

    /* renamed from: f */
    public JSONObject f85232f;
    public C34984p generalVendorStatus;

    public interface ItemListener {
        void onItemClick(@C0359n0 String str, boolean z);
    }

    public OTVendorUtils(@C0363p0 JSONObject jSONObject, @C0363p0 JSONObject jSONObject2, @C0363p0 JSONObject jSONObject3, @C0363p0 JSONObject jSONObject4) {
        if (jSONObject != null) {
            this.f85228b = jSONObject;
        }
        if (jSONObject2 != null) {
            this.f85229c = jSONObject2;
        }
        if (jSONObject3 != null) {
            this.f85230d = jSONObject3;
            this.f85231e = jSONObject3;
        }
        if (jSONObject4 != null) {
            this.f85232f = jSONObject4;
            this.generalVendorStatus = new C34984p(jSONObject4);
        }
    }

    /* renamed from: a */
    public final void mo104177a(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, boolean z) {
        JSONObject vendorsListObject = getVendorsListObject(str);
        if (vendorsListObject.has(str3)) {
            JSONObject jSONObject = vendorsListObject.getJSONObject(str3);
            jSONObject.putOpt(str2, z ? "1" : "0");
            vendorsListObject.put(str3, jSONObject);
        } else {
            OTLogger.m143461p("VendorArray", "update state called for non rendered vendorId.");
        }
        if (OTVendorListMode.GENERAL.equalsIgnoreCase(str)) {
            this.generalVendorStatus.mo103841d(str3, z);
        } else {
            m143672a(getVendorListWithUserSelection(str), str2, str3, z);
        }
    }

    public void clearValues(@C0363p0 JSONObject jSONObject, @C0363p0 JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject == null) {
            this.f85228b = new JSONObject();
            jSONObject = new JSONObject();
        } else {
            this.f85228b = jSONObject;
        }
        this.f85229c = jSONObject;
        if (jSONObject2 == null) {
            this.f85230d = new JSONObject();
            this.f85231e = new JSONObject();
        } else {
            this.f85230d = jSONObject2;
            this.f85231e = jSONObject2;
        }
        if (this.f85232f == null) {
            this.f85232f = new JSONObject();
            this.generalVendorStatus.mo103842e(new JSONObject());
            return;
        }
        this.f85232f = jSONObject3;
        this.generalVendorStatus.mo103842e(jSONObject3);
    }

    @C0359n0
    public JSONObject getVendorListWithUserSelection(@C0359n0 String str) {
        return OTVendorListMode.GOOGLE.equalsIgnoreCase(str) ? this.f85231e : OTVendorListMode.IAB.equalsIgnoreCase(str) ? this.f85229c : this.generalVendorStatus.mo103838a();
    }

    @C0359n0
    public final JSONObject getVendorObjectById(@C0359n0 String str, @C0359n0 String str2) {
        JSONObject a = OTVendorListMode.GOOGLE.equalsIgnoreCase(str) ? this.f85231e : OTVendorListMode.IAB.equalsIgnoreCase(str) ? this.f85229c : this.generalVendorStatus.mo103838a();
        return a.has(str2) ? a.getJSONObject(str2) : new JSONObject();
    }

    @C0359n0
    public JSONObject getVendorsByPurpose(@C0359n0 Map<String, String> map, @C0363p0 JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject2;
        }
        for (Map.Entry next : map.entrySet()) {
            try {
                m143673a(jSONObject, jSONObject2, C34990u.m143387y((String) next.getKey()), C35020d.m143630z((String) next.getValue()));
            } catch (Exception e) {
                OTLogger.m143457l("VendorArray", "Vendors purpose list data error " + e.getMessage());
            }
        }
        return jSONObject2;
    }

    @C0359n0
    public JSONObject getVendorsListObject(@C0359n0 String str) {
        return OTVendorListMode.GOOGLE.equalsIgnoreCase(str) ? this.f85230d : OTVendorListMode.IAB.equalsIgnoreCase(str) ? this.f85228b : this.f85232f;
    }

    public boolean isAllVendorEnabled(@C0359n0 JSONObject jSONObject) {
        JSONArray names = jSONObject.names();
        if (names == null) {
            return false;
        }
        for (int i = 0; i < names.length(); i++) {
            if (m143674a(jSONObject, names, i)) {
                return false;
            }
        }
        return true;
    }

    public void refreshList(@C0359n0 String str) {
        if (OTVendorListMode.GOOGLE.equalsIgnoreCase(str)) {
            this.f85230d = this.f85231e;
        } else {
            this.f85228b = OTVendorListMode.IAB.equalsIgnoreCase(str) ? this.f85229c : this.generalVendorStatus.mo103838a();
        }
    }

    public void saveVendorConsentStatus(@C0359n0 SharedPreferences sharedPreferences, @C0363p0 JSONObject jSONObject, @C0363p0 JSONObject jSONObject2) {
        if (jSONObject != null) {
            sharedPreferences.edit().putString("OT_IAB_ACTIVE_VENDORLIST", jSONObject.toString()).apply();
        }
        if (jSONObject2 != null) {
            sharedPreferences.edit().putString("OT_GOOGLE_ACTIVE_VENDOR_LIST", jSONObject2.toString()).apply();
        }
        this.generalVendorStatus.mo103840c(sharedPreferences);
    }

    public void setSelectAllButtonListener(@C0363p0 ItemListener itemListener) {
        this.f85227a = itemListener;
    }

    public void setVendorsListObject(@C0359n0 String str, @C0359n0 JSONObject jSONObject, boolean z) {
        if (OTVendorListMode.GOOGLE.equalsIgnoreCase(str)) {
            this.f85230d = jSONObject;
        } else if (OTVendorListMode.IAB.equalsIgnoreCase(str)) {
            this.f85228b = jSONObject;
        } else {
            this.f85232f = jSONObject;
        }
        if (z) {
            updateSelectAllButtonStatus(str);
        }
    }

    public void updateAllVendorState(boolean z, @C0359n0 String str, @C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2) {
        JSONArray names = jSONObject2.names();
        if (names != null) {
            mo104178a(z, str, jSONObject, names);
        }
    }

    public void updateAllVendorsConsentLocal(@C0359n0 String str, boolean z) {
        JSONObject a;
        JSONObject jSONObject;
        if (OTVendorListMode.GOOGLE.equalsIgnoreCase(str)) {
            a = this.f85231e;
            jSONObject = this.f85230d;
        } else if (OTVendorListMode.IAB.equalsIgnoreCase(str)) {
            a = this.f85229c;
            jSONObject = this.f85228b;
        } else {
            a = this.generalVendorStatus.mo103838a();
            jSONObject = this.f85232f;
        }
        updateAllVendorState(z, CONSENT_TYPE, a, jSONObject);
    }

    public void updateSelectAllButtonStatus(@C0359n0 String str) {
        JSONObject jSONObject = OTVendorListMode.GENERAL.equalsIgnoreCase(str) ? this.f85232f : OTVendorListMode.GOOGLE.equalsIgnoreCase(str) ? this.f85230d : this.f85228b;
        ItemListener itemListener = this.f85227a;
        if (itemListener != null) {
            itemListener.onItemClick(str, isAllVendorEnabled(jSONObject));
        }
    }

    public void updateVendorConsentStatus(@C0359n0 String str, @C0359n0 String str2, boolean z) {
        try {
            if (mo104179a(str, str2, false)) {
                OTLogger.m143458m("VendorArray", "Vendor (" + str2 + ") consent updated to " + z + ".");
                mo104177a(str, CONSENT_TYPE, str2, z);
                return;
            }
            OTLogger.m143457l("VendorArray", "Not updated consent for Vendor (" + str2 + "), Consent not configured for this vendor Id.");
        } catch (JSONException e) {
            OTLogger.m143457l("VendorArray", "JSON exception on category status map put call. Error msg = " + e.getMessage());
        }
    }

    public void updateVendorLegitInterest(@C0359n0 String str, @C0359n0 String str2, boolean z) {
        try {
            if (mo104179a(str, str2, true)) {
                mo104177a(str, LEGITIMATE_CONSENT_TYPE, str2, z);
                OTLogger.m143458m("VendorArray", "Vendor (" + str2 + ")  legit interest updated to " + z + ".");
                return;
            }
            OTLogger.m143457l("VendorArray", "Not updated LI for Vendor (" + str2 + "), LI not configured for this vendor Id.");
        } catch (JSONException e) {
            OTLogger.m143457l("VendorArray", "JSON exception on category status map put call. Error msg = " + e.getMessage());
        }
    }

    public void updateVendorsConsent(boolean z, @C0359n0 String str, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.getInt(str) > -1) {
            jSONObject.putOpt(str, z ? "1" : "0");
        }
    }

    /* renamed from: a */
    public static void m143670a(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0359n0 JSONObject jSONObject2) {
        m143671a(jSONObject, str, str2, str3, jSONObject2, jSONObject2.getJSONArray("purposes"));
        if (jSONObject2.getJSONArray("legIntPurposes").length() > 0 && jSONObject2.getInt(LEGITIMATE_CONSENT_TYPE) >= 0) {
            for (int i = 0; i < jSONObject2.getJSONArray("legIntPurposes").length(); i++) {
                if (jSONObject2.getJSONArray("legIntPurposes").getString(i).equals(str)) {
                    jSONObject.put(str3, jSONObject2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m143671a(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0359n0 JSONObject jSONObject2, @C0359n0 JSONArray jSONArray) {
        if (jSONObject2.getJSONArray(str2).length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (jSONArray.getString(i).equals(str)) {
                    jSONObject.put(str3, jSONObject2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m143672a(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 String str2, boolean z) {
        if (jSONObject.has(str2)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            jSONObject2.putOpt(str, z ? "1" : "0");
            jSONObject.put(str2, jSONObject2);
            return;
        }
        OTLogger.m143461p("VendorArray", "update state called for non rendered vendorId.");
    }

    /* renamed from: a */
    public static void m143673a(@C0359n0 JSONObject jSONObject, @C0359n0 JSONObject jSONObject2, @C0359n0 String str, @C0359n0 String str2) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject3 = jSONObject.getJSONObject(next);
            Objects.requireNonNull(str2);
            if (str2.equals("purposes")) {
                m143670a(jSONObject2, str, str2, next, jSONObject3);
            } else {
                m143671a(jSONObject2, str, str2, next, jSONObject3, jSONObject3.getJSONArray(str2));
            }
        }
    }

    /* renamed from: a */
    public final void mo104178a(boolean z, @C0359n0 String str, @C0359n0 JSONObject jSONObject, @C0359n0 JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.getString(i);
                if (jSONObject.has(string)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(string);
                    updateVendorsConsent(z, str, jSONObject2);
                    jSONObject.put(string, jSONObject2);
                }
            } catch (JSONException e) {
                OTLogger.m143457l("VendorArray", "error in reading string from JSONObject, error = " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final boolean mo104179a(@C0359n0 String str, @C0359n0 String str2, boolean z) {
        try {
            JSONObject vendorListWithUserSelection = getVendorListWithUserSelection(str);
            if (!vendorListWithUserSelection.has(str2) || !z) {
                if (!vendorListWithUserSelection.has(str2) || z || vendorListWithUserSelection.getJSONObject(str2).getInt(CONSENT_TYPE) <= -1) {
                    return false;
                }
            } else if (vendorListWithUserSelection.getJSONObject(str2).getInt(LEGITIMATE_CONSENT_TYPE) <= -1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            OTLogger.m143457l("VendorArray", "unable to get vendor status " + e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m143674a(@C0359n0 JSONObject jSONObject, @C0359n0 JSONArray jSONArray, int i) {
        try {
            String string = jSONArray.getString(i);
            if (!"0".equalsIgnoreCase(jSONObject.getJSONObject(string).getString(CONSENT_TYPE))) {
                return false;
            }
            OTLogger.m143458m("VendorArray", "consent status 0 for vendorID = " + string);
            return true;
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Vendor list data error " + e.getMessage());
            return false;
        }
    }
}
