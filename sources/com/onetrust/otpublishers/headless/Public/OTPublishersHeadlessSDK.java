package com.onetrust.otpublishers.headless.Public;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.Keep;
import androidx.appcompat.app.C0475e;
import androidx.fragment.app.C19232h;
import com.google.android.gms.measurement.api.C30638a;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Helper.C34964a;
import com.onetrust.otpublishers.headless.Internal.Helper.C34965a0;
import com.onetrust.otpublishers.headless.Internal.Helper.C34966b;
import com.onetrust.otpublishers.headless.Internal.Helper.C34968c;
import com.onetrust.otpublishers.headless.Internal.Helper.C34970d;
import com.onetrust.otpublishers.headless.Internal.Helper.C34972e;
import com.onetrust.otpublishers.headless.Internal.Helper.C34975g;
import com.onetrust.otpublishers.headless.Internal.Helper.C34978j;
import com.onetrust.otpublishers.headless.Internal.Helper.C34981m;
import com.onetrust.otpublishers.headless.Internal.Helper.C34982n;
import com.onetrust.otpublishers.headless.Internal.Helper.C34985q;
import com.onetrust.otpublishers.headless.Internal.Helper.C34990u;
import com.onetrust.otpublishers.headless.Internal.Helper.C34992w;
import com.onetrust.otpublishers.headless.Internal.Helper.C34994y;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Models.C34999c;
import com.onetrust.otpublishers.headless.Internal.Models.C35000d;
import com.onetrust.otpublishers.headless.Internal.Network.C35006f;
import com.onetrust.otpublishers.headless.Internal.Network.C35010g;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35012b;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.DataModel.OTCache;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.DataModel.OTGeolocationModel;
import com.onetrust.otpublishers.headless.Public.DataModel.OTSdkParams;
import com.onetrust.otpublishers.headless.Public.DataModel.OTUXParams;
import com.onetrust.otpublishers.headless.Public.Response.OTResponse;
import com.onetrust.otpublishers.headless.Public.Response.OTResponseType;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35034c;
import com.onetrust.otpublishers.headless.p052UI.Helper.C35035d;
import com.onetrust.otpublishers.headless.p052UI.Helper.RenderAgeGateFragment;
import com.onetrust.otpublishers.headless.p052UI.Helper.RenderConsentPreferenceFragment;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OTPublishersHeadlessSDK {
    public static final String VENDOR_DETAILS_ERROR_MSG = "Error in getting vendorDetails , error = ";

    /* renamed from: a */
    public Context f85216a;

    /* renamed from: b */
    public C34982n f85217b;

    /* renamed from: c */
    public OTVendorUtils f85218c;

    /* renamed from: d */
    public C34964a f85219d = new C34964a(this.f85216a);

    /* renamed from: e */
    public String f85220e;
    @C0344h1

    /* renamed from: f */
    public String f85221f;

    /* renamed from: g */
    public C34962a f85222g = new C34962a();

    public OTPublishersHeadlessSDK(@C0359n0 Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f85216a = applicationContext;
        this.f85217b = new C34982n(applicationContext);
        JSONObject vendorListData = getVendorListData();
        this.f85218c = new OTVendorUtils(vendorListData, vendorListData, getVendorListData(OTVendorListMode.GOOGLE), getVendorListData(OTVendorListMode.GENERAL));
    }

    @Keep
    public static void enableOTSDKLog(int i) {
        OTLogger.m143449d(i);
    }

    /* renamed from: a */
    public final void mo104093a() {
        this.f85218c.saveVendorConsentStatus(new C35014d(this.f85216a, "OTT_DEFAULT_USER").mo103965b(), getVendorListUI(OTVendorListMode.IAB), getVendorListUI(OTVendorListMode.GOOGLE));
        this.f85218c.clearValues(getVendorListData(OTVendorListMode.IAB), getVendorListData(OTVendorListMode.GOOGLE), getVendorListData(OTVendorListMode.GENERAL));
        this.f85217b.mo103799G(false, false);
        new C34968c(this.f85216a).mo103649c(true);
        reInitiateLocalVariable();
    }

    @Keep
    public void addEventListener(@C0359n0 C19232h hVar, @C0359n0 OTEventListener oTEventListener) {
        addEventListener(oTEventListener);
        new UIUtils().mo104266D(hVar, this.f85222g);
    }

    @Keep
    public void appendCustomDataElements(@C0359n0 JSONObject jSONObject) {
        new C34999c(this.f85216a).mo103927c(jSONObject);
    }

    /* renamed from: b */
    public final void mo104098b(@C0359n0 C19232h hVar, @C0363p0 OTConfiguration oTConfiguration) {
        if (!C35020d.m143605J(new C35015e(this.f85216a).mo103973H())) {
            new C35035d().mo104301a(hVar, this.f85222g, oTConfiguration);
        } else {
            OTLogger.m143457l("OneTrust", this.f85216a.getString(C35265a.C35278m.str_ot_renderui_error_msg));
        }
    }

    @C0344h1
    public void callSetupUI(@C0359n0 C19232h hVar, int i, @C0363p0 OTConfiguration oTConfiguration) {
        if (shouldShowBanner() && i == 0) {
            new C35034c().mo104300d(hVar, this.f85222g, oTConfiguration);
        } else if (!shouldShowBanner() || i != 1) {
            OTLogger.m143461p("OneTrust", "Not Showing UI, this could be because the consent has been taken already or its configured not to show UI.");
        } else {
            new C35035d().mo104301a(hVar, this.f85222g, oTConfiguration);
        }
    }

    @C0344h1
    public void callShowConsentPreferencesUI(@C0359n0 C19232h hVar, @C0363p0 OTConfiguration oTConfiguration) {
        if (C35020d.m143605J(new C35015e(this.f85216a).mo103973H())) {
            OTLogger.m143457l("OneTrust", this.f85216a.getString(C35265a.C35278m.str_ot_renderui_error_msg));
        } else {
            new RenderConsentPreferenceFragment().mo104263c(hVar, this);
        }
    }

    @Keep
    public void clearOTSDKConfigurationData() {
        new C35020d().mo104029k(this.f85216a, "OT_SDK_APP_CONFIGURATION");
    }

    @Keep
    public void clearOTSDKData() {
        new C35020d().mo104025U(this.f85216a);
        reInitiateLocalVariable();
    }

    @Keep
    public void dismissUI(@C0359n0 C19232h hVar) {
        if (!isOTUIPresent(hVar)) {
            OTLogger.m143461p("OTPublishersHeadlessSDK", "No OneTrust UI is present.");
        } else {
            new UIUtils().mo104265B(hVar);
        }
    }

    @Keep
    public int getAgeGatePromptValue() {
        return new C34966b(this.f85216a).mo103631a();
    }

    @C0363p0
    @Keep
    public JSONObject getBannerData() {
        return new C34970d(this.f85216a).mo103681d();
    }

    @C0359n0
    @Keep
    public JSONObject getCommonData() {
        return new C35015e(this.f85216a).mo104006r();
    }

    @Keep
    public int getConsentStatusForGroupId(@C0359n0 String str) {
        return new C35015e(this.f85216a).mo103996g(str);
    }

    @Keep
    public int getConsentStatusForSDKId(@C0359n0 String str) {
        return this.f85217b.mo103804L(str);
    }

    @C0359n0
    @Keep
    public JSONObject getDomainGroupData() {
        return new C35015e(this.f85216a).mo104014z();
    }

    @C0359n0
    @Keep
    public JSONObject getDomainInfo() {
        return new C35015e(this.f85216a).mo103969D();
    }

    @C0363p0
    @Keep
    public OTGeolocationModel getLastDataDownloadedLocation() {
        return new C34985q(this.f85216a).mo103847e(2);
    }

    @C0363p0
    @Keep
    public OTGeolocationModel getLastUserConsentedLocation() {
        return new C34985q(this.f85216a).mo103847e(3);
    }

    @C0359n0
    @Keep
    public OTCache getOTCache() {
        return new C34994y().mo103913a(this.f85216a);
    }

    @C0363p0
    @Keep
    public String getOTConsentJSForWebView() {
        return new C34975g(this.f85216a).mo103738a();
    }

    @C0359n0
    @Keep
    public OTVendorUtils getOtVendorUtils() {
        return this.f85218c;
    }

    @C0363p0
    @Keep
    public JSONObject getPreferenceCenterData() {
        return new C35015e(this.f85216a).mo103995f();
    }

    @Keep
    public int getPurposeConsentLocal(@C0359n0 String str) {
        String str2;
        if (C35020d.m143605J(new C35015e(this.f85216a).mo103973H())) {
            str2 = "Purpose Consent Update for id " + str + " : -1, SDK not finished processing";
        } else if (C35020d.m143605J(str)) {
            str2 = "Empty purpose id passed to get Purpose Consent Update";
        } else {
            OTLogger.m143447b("OTPublishersHeadlessSDK", "Purpose Consent Update for id " + str + " : " + this.f85217b.mo103793A(str));
            return this.f85217b.mo103793A(str);
        }
        OTLogger.m143461p("OTPublishersHeadlessSDK", str2);
        return -1;
    }

    @Keep
    public int getPurposeLegitInterestLocal(@C0359n0 String str) {
        StringBuilder sb;
        String str2;
        String str3;
        if (C35020d.m143605J(new C35015e(this.f85216a).mo103973H())) {
            sb = new StringBuilder();
            sb.append("Purpose Legitimate Interest Update for id ");
            sb.append(str);
            str2 = " : -1, SDK not finished processing";
        } else if (C35020d.m143605J(str)) {
            str3 = "Empty purpose id passed to get Purpose LegitInterest update.";
            OTLogger.m143461p("OTPublishersHeadlessSDK", str3);
            return -1;
        } else if (!str.startsWith("IABV2")) {
            sb = new StringBuilder();
            sb.append("Purpose Legitimate Interest Update for id ");
            sb.append(str);
            str2 = " : -1, Invalid purposeId";
        } else {
            OTLogger.m143447b("OTPublishersHeadlessSDK", "Purpose Legit Interest Update for id " + str + " : " + this.f85217b.mo103800H(str));
            return this.f85217b.mo103800H(str);
        }
        sb.append(str2);
        str3 = sb.toString();
        OTLogger.m143461p("OTPublishersHeadlessSDK", str3);
        return -1;
    }

    @Keep
    public int getUCPurposeConsent(@C0359n0 String str) {
        if (!C35020d.m143605J(str)) {
            return this.f85219d.mo103596I(str);
        }
        OTLogger.m143461p("OTPublishersHeadlessSDK", "Invalid id passed to get Purposes Consent Status");
        return -1;
    }

    public C34964a getUcpHandler() {
        return this.f85219d;
    }

    @C0363p0
    @Deprecated
    @Keep
    public JSONObject getVendorDetails(int i) {
        try {
            return new C34972e().mo103717a(this.f85216a, i, this.f85218c.getVendorObjectById(OTVendorListMode.IAB, String.valueOf(i)));
        } catch (JSONException e) {
            OTLogger.m143457l("OTPublishersHeadlessSDK", VENDOR_DETAILS_ERROR_MSG + e.getMessage());
            return null;
        }
    }

    @C0363p0
    @Deprecated
    @Keep
    public final JSONObject getVendorListData() {
        String c = new C34990u(this.f85216a).mo103874c();
        if (!C35020d.m143605J(c)) {
            try {
                return new JSONObject(c);
            } catch (JSONException e) {
                OTLogger.m143457l("OTPublishersHeadlessSDK", "Error on Json object creation, error msg = " + e.getMessage());
            }
        }
        return null;
    }

    @C0363p0
    @Deprecated
    @Keep
    public JSONObject getVendorListUI() {
        JSONObject vendorListWithUserSelection = this.f85218c.getVendorListWithUserSelection(OTVendorListMode.IAB);
        if (vendorListWithUserSelection != null && vendorListWithUserSelection.length() > 0) {
            return vendorListWithUserSelection;
        }
        JSONObject vendorListData = getVendorListData(OTVendorListMode.IAB);
        return vendorListData == null ? new JSONObject() : vendorListData;
    }

    @Keep
    public int isBannerShown(@C0359n0 Context context) {
        int a = new C35020d().mo104026a(context);
        OTLogger.m143458m("OneTrust", "Banner shown status : " + a);
        return a;
    }

    @Keep
    public boolean isOTUIPresent(@C0359n0 C19232h hVar) {
        return C35020d.m143623r(hVar);
    }

    @Keep
    public void optIntoSaleOfData() {
        new C34992w(this.f85216a).mo103901b(OTConsentInteractionType.PC_CONFIRM);
        new C34978j(this.f85216a).mo103764g(true, true);
    }

    @Keep
    public void optOutOfSaleOfData() {
        new C34992w(this.f85216a).mo103901b(OTConsentInteractionType.PC_CONFIRM);
        new C34978j(this.f85216a).mo103764g(false, true);
    }

    @Keep
    public boolean overrideDataSubjectIdentifier(@C0359n0 String str) {
        if (new C35020d().mo104020L(str)) {
            OTLogger.m143458m("OTPublishersHeadlessSDK", "overrideDataSubjectIdentifier: Pass a valid identifier!!");
            return false;
        } else if (str.isEmpty()) {
            return new C35020d().mo104019I(this.f85216a, str);
        } else {
            try {
                C34981m mVar = new C34981m(this.f85216a);
                mVar.mo103783c(this.f85216a, str);
                mVar.mo103782b(2);
                return true;
            } catch (JSONException e) {
                OTLogger.m143457l("OTPublishersHeadlessSDK", "error in updating consent : " + e.getMessage());
                return false;
            }
        }
    }

    public void reInitVendorArray() {
        JSONObject vendorListData = getVendorListData(OTVendorListMode.IAB);
        this.f85218c = new OTVendorUtils(vendorListData, vendorListData, getVendorListData(OTVendorListMode.GOOGLE), getVendorListData(OTVendorListMode.GENERAL));
    }

    public void reInitiateLocalVariable() {
        this.f85217b = new C34982n(this.f85216a);
        this.f85219d = new C34964a(this.f85216a);
        reInitVendorArray();
    }

    @Keep
    public void resetUpdatedConsent() {
        OTLogger.m143458m("OTPublishersHeadlessSDK", "Clearing user selections/local variables.");
        reInitiateLocalVariable();
    }

    @Keep
    public void saveConsent(@C0359n0 String str) {
        new C34992w(this.f85216a).mo103901b(str);
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1459438256:
                if (str.equals(OTConsentInteractionType.BANNER_CONTINUE_WITHOUT_ACCEPTING)) {
                    c = 0;
                    break;
                }
                break;
            case -1400785255:
                if (str.equals(OTConsentInteractionType.PC_REJECT_ALL)) {
                    c = 1;
                    break;
                }
                break;
            case -1092776909:
                if (str.equals(OTConsentInteractionType.VENDOR_LIST_CONFIRM)) {
                    c = 2;
                    break;
                }
                break;
            case -1012041507:
                if (str.equals(OTConsentInteractionType.VENDOR_LIST_ALLOW_ALL)) {
                    c = 3;
                    break;
                }
                break;
            case -839096495:
                if (str.equals(OTConsentInteractionType.BANNER_CLOSE)) {
                    c = 4;
                    break;
                }
                break;
            case -558785747:
                if (str.equals(OTConsentInteractionType.VENDOR_LIST_REJECT_ALL)) {
                    c = 5;
                    break;
                }
                break;
            case 912162759:
                if (str.equals(OTConsentInteractionType.BANNER_REJECT_ALL)) {
                    c = 6;
                    break;
                }
                break;
            case 1242892359:
                if (str.equals(OTConsentInteractionType.PC_CONFIRM)) {
                    c = 7;
                    break;
                }
                break;
            case 1390713091:
                if (str.equals(OTConsentInteractionType.BANNER_ALLOW_ALL)) {
                    c = 8;
                    break;
                }
                break;
            case 1593196529:
                if (str.equals(OTConsentInteractionType.PC_ALLOW_ALL)) {
                    c = 9;
                    break;
                }
                break;
            case 1836301749:
                if (str.equals(OTConsentInteractionType.UC_PC_CONFIRM)) {
                    c = 10;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 4:
                this.f85217b.mo103802J(false, true);
                break;
            case 1:
            case 5:
            case 6:
                this.f85217b.mo103802J(false, false);
                break;
            case 2:
            case 7:
                mo104093a();
                return;
            case 3:
            case 8:
            case 9:
                this.f85217b.mo103802J(true, false);
                break;
            case 10:
                this.f85219d.mo103597J();
                break;
            default:
                return;
        }
        reInitiateLocalVariable();
    }

    @Keep
    public void setEnvironment(@C0359n0 String str) {
        this.f85220e = str;
    }

    @Keep
    public void setFetchDataURL(@C0359n0 String str) {
        this.f85221f = str;
    }

    @Keep
    public boolean setOTCache(@C0359n0 OTCache oTCache) {
        return new C34994y().mo103914b(this.f85216a, oTCache);
    }

    @Keep
    public boolean setOTUXParams(@C0359n0 OTUXParams oTUXParams) {
        return new C34965a0().mo103630b(this.f85216a, oTUXParams);
    }

    @Keep
    public void setupUI(@C0359n0 C0475e eVar, int i) {
        callSetupUI(eVar, i, (OTConfiguration) null);
    }

    @Keep
    public boolean shouldShowBanner() {
        try {
            if (C35020d.m143605J(new C35015e(this.f85216a).mo103973H())) {
                return false;
            }
            return new C35000d(this.f85216a).mo103936h(getBannerData());
        } catch (JSONException e) {
            OTLogger.m143457l("OTPublishersHeadlessSDK", "Error while computing show banner status,returning default value as false: " + e.getMessage());
            return false;
        }
    }

    @Keep
    public void showBannerUI(@C0359n0 C0475e eVar) {
        mo104094a(eVar, (OTConfiguration) null);
    }

    @Keep
    public void showConsentPurposesUI(@C0359n0 C19232h hVar) {
        callShowConsentPreferencesUI(hVar, (OTConfiguration) null);
    }

    @Keep
    public void showConsentUI(@C0359n0 C19232h hVar, int i, @C0363p0 OTConfiguration oTConfiguration, @C0359n0 OTConsentUICallback oTConsentUICallback) {
        if (C35020d.m143605J(new C35015e(this.f85216a).mo103973H()) || i != 0) {
            OTLogger.m143457l("OneTrust", "To display an Age Gate Prompt, You need to enable Age Gate Prompt from Admin UI and republish the SDK");
        } else {
            new RenderAgeGateFragment().mo104262c(hVar, oTConfiguration, oTConsentUICallback);
        }
    }

    @Keep
    public void showPreferenceCenterUI(@C0359n0 C0475e eVar) {
        mo104098b(eVar, (OTConfiguration) null);
    }

    @Keep
    public void startSDK(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0363p0 OTSdkParams oTSdkParams, @C0359n0 OTCallback oTCallback) {
        OTCallback oTCallback2 = oTCallback;
        if (C35020d.m143605J(str) || C35020d.m143605J(str2)) {
            OTLogger.m143461p("OTPublishersHeadlessSDK", "empty parameters passed");
            oTCallback2.onFailure(new OTResponse(OTResponseType.OT_ERROR, 4, this.f85216a.getResources().getString(C35265a.C35278m.err_ott_empty_parameters), ""));
        }
        C35020d.m143619l(this.f85216a, str, str2, str3, oTSdkParams, this);
        C35020d.m143611V(this.f85216a);
        if (new C35010g().mo103956a(this.f85216a)) {
            if (!C35020d.m143607N(str3)) {
                OTLogger.m143461p("OTPublishersHeadlessSDK", this.f85216a.getResources().getString(C35265a.C35278m.warn_invalid_lang));
            }
            new C35006f(this.f85216a).mo103951s(str, str2, str3, oTCallback, this.f85220e, this.f85221f, this);
            return;
        }
        OTLogger.m143457l("OTPublishersHeadlessSDK", "Server not reachable");
        oTCallback2.onFailure(new OTResponse(OTResponseType.OT_ERROR, 6, this.f85216a.getResources().getString(C35265a.C35278m.err_ott_callback_failure) + " as server was not reachable", ""));
    }

    public void updateAllSDKConsentStatus(@C0359n0 JSONArray jSONArray, boolean z) {
        this.f85217b.mo103816h(jSONArray, z);
    }

    @Keep
    public void updateAllVendorsConsentLocal(@C0359n0 String str, boolean z) {
        this.f85218c.updateAllVendorsConsentLocal(str, z);
    }

    @Keep
    public void updatePurposeConsent(@C0359n0 String str, boolean z) {
        this.f85217b.mo103803K(str, z);
    }

    @Keep
    public void updatePurposeLegitInterest(@C0359n0 String str, boolean z) {
        if (C35020d.m143605J(str)) {
            OTLogger.m143461p("OTPublishersHeadlessSDK", "Empty purpose id passed to update Purpose LegitInterest method.");
        } else if (!str.startsWith("IABV2")) {
            OTLogger.m143461p("OTPublishersHeadlessSDK", "Invalid ID " + str + " passed to update Purpose LegitInterest");
        } else {
            this.f85217b.mo103806N(str, z);
        }
    }

    public void updateSDKConsentStatus(@C0359n0 String str, boolean z) {
        this.f85217b.mo103808P(str, z);
    }

    @Keep
    public void updateUCPurposeConsent(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, boolean z) {
        if (C35020d.m143605J(str3) || C35020d.m143605J(str2) || C35020d.m143605J(str)) {
            OTLogger.m143461p("OTPublishersHeadlessSDK", "Invalid id passed to update Custom Preference Options");
        } else if (getUCPurposeConsent(str3) < 1) {
            OTLogger.m143461p("OTPublishersHeadlessSDK", "Purpose consent for " + str3 + " is disabled, thus Custom Preference cannot be enabled");
        } else {
            this.f85219d.mo103609f(str2, str.trim() + str3.trim() + str2.trim(), z, str);
        }
    }

    @Keep
    public void updateVendorConsent(@C0359n0 String str, @C0359n0 String str2, boolean z) {
        if (OTVendorListMode.GOOGLE.equalsIgnoreCase(str)) {
            if (C35020d.m143605J(str2)) {
                OTLogger.m143461p("OTPublishersHeadlessSDK", "Empty vendor id passed to updateVendorConsent method.");
                return;
            }
        } else if (OTVendorListMode.IAB.equalsIgnoreCase(str)) {
            updateVendorConsent(str2, z);
            return;
        } else if (!OTVendorListMode.GENERAL.equalsIgnoreCase(str)) {
            return;
        } else {
            if (C35020d.m143605J(str2)) {
                OTLogger.m143461p("GeneralVendors", "Empty vendor id passed to updateVendorConsent method.");
                return;
            }
            C35012b bVar = new C35015e(this.f85216a).f85172b;
            if (!bVar.mo103962g() || !bVar.mo103963h()) {
                OTLogger.m143461p("GeneralVendors", "Cannot update consent for the Vendor ID:General Vendor data with opt-out not found in template settings");
                return;
            }
        }
        this.f85218c.updateVendorConsentStatus(str, str2, z);
    }

    @Keep
    public void updateVendorLegitInterest(@C0359n0 String str, @C0359n0 String str2, boolean z) {
        if (OTVendorListMode.GOOGLE.equalsIgnoreCase(str)) {
            OTLogger.m143461p("OTPublishersHeadlessSDK", "Legitimate Interest not supported for Google vendors.");
        } else {
            updateVendorLegitInterest(str2, z);
        }
    }

    @Keep
    public void writeLogsToFile(boolean z, boolean z2) {
        if (z) {
            OTLogger.open(this.f85216a.getFilesDir() + "/OTPublisherHeadlessSDKLogs.log", 2, 1000000);
        } else if (z2 && !z) {
            OTLogger.m143458m("OTPublishersHeadlessSDK", "Write To File Should be Enabled!");
        }
        OTLogger.m143451f(z, z2);
    }

    /* renamed from: a */
    public final void mo104094a(@C0359n0 C19232h hVar, @C0363p0 OTConfiguration oTConfiguration) {
        if (!C35020d.m143605J(new C35015e(this.f85216a).mo103973H())) {
            new C35034c().mo104300d(hVar, this.f85222g, oTConfiguration);
        } else {
            OTLogger.m143457l("OneTrust", this.f85216a.getString(C35265a.C35278m.str_ot_renderui_error_msg));
        }
    }

    @Keep
    public void addEventListener(@C0359n0 OTEventListener oTEventListener) {
        this.f85222g.mo103576a();
        this.f85222g.mo103578e(oTEventListener);
    }

    @Keep
    public int getConsentStatusForGroupId(@C0359n0 String str, @C0359n0 String str2) {
        if (C35020d.m143605J(str)) {
            OTLogger.m143458m("OTPublishersHeadlessSDK", "Invalid custom group Id passed - " + str);
            return -1;
        }
        int g = new C35015e(this.f85216a).mo103996g(str);
        if (g == -1) {
            return C30638a.C30639a.f73205n.equalsIgnoreCase(str2) ? 1 : 0;
        }
        return g;
    }

    @Keep
    public int getUCPurposeConsent(@C0359n0 String str, @C0359n0 String str2) {
        if (!C35020d.m143605J(str2) && !C35020d.m143605J(str)) {
            return this.f85219d.mo103604a(str, str2);
        }
        OTLogger.m143461p("OTPublishersHeadlessSDK", "Invalid id passed to get UCP Topic Consent Status");
        return -1;
    }

    @C0363p0
    @Deprecated
    @Keep
    public JSONObject getVendorDetails(@C0359n0 String str, int i) {
        if (OTVendorListMode.GOOGLE.equalsIgnoreCase(str)) {
            try {
                return this.f85218c.getVendorObjectById(str, String.valueOf(i));
            } catch (JSONException e) {
                OTLogger.m143457l("OTPublishersHeadlessSDK", VENDOR_DETAILS_ERROR_MSG + e.getMessage());
                return null;
            }
        } else if (OTVendorListMode.IAB.equalsIgnoreCase(str)) {
            return getVendorDetails(i);
        } else {
            return null;
        }
    }

    @C0363p0
    @Keep
    public JSONObject getVendorListData(@C0359n0 String str) {
        C35015e eVar = new C35015e(this.f85216a);
        if (!OTVendorListMode.GENERAL.equalsIgnoreCase(str)) {
            return OTVendorListMode.GOOGLE.equalsIgnoreCase(str) ? eVar.mo103997h() : getVendorListData();
        }
        JSONObject a = eVar.f85172b.mo103958a();
        OTLogger.m143458m("OTPublishersHeadlessSDK", "Saved General Vendors : " + a);
        return a;
    }

    @C0363p0
    @Keep
    public JSONObject getVendorListUI(@C0359n0 String str) {
        if (!OTVendorListMode.GOOGLE.equalsIgnoreCase(str)) {
            return OTVendorListMode.IAB.equalsIgnoreCase(str) ? getVendorListUI() : this.f85218c.getVendorListWithUserSelection(OTVendorListMode.GENERAL);
        }
        JSONObject vendorListWithUserSelection = this.f85218c.getVendorListWithUserSelection(str);
        if (vendorListWithUserSelection != null && vendorListWithUserSelection.length() > 0) {
            return vendorListWithUserSelection;
        }
        JSONObject vendorListData = getVendorListData(str);
        return vendorListData == null ? new JSONObject() : vendorListData;
    }

    @Keep
    public void setupUI(@C0359n0 C19232h hVar, int i) {
        callSetupUI(hVar, i, (OTConfiguration) null);
    }

    @Keep
    public void showBannerUI(@C0359n0 C19232h hVar) {
        mo104094a(hVar, (OTConfiguration) null);
    }

    @Keep
    public void showPreferenceCenterUI(@C0359n0 C19232h hVar) {
        mo104098b(hVar, (OTConfiguration) null);
    }

    @Keep
    public void updateAllVendorsConsentLocal(boolean z) {
        this.f85218c.updateAllVendorsConsentLocal(OTVendorListMode.IAB, z);
    }

    @Keep
    public void updatePurposeConsent(@C0359n0 String str, boolean z, boolean z2) {
        if (z2) {
            this.f85217b.mo103796D(str, z);
        } else {
            updatePurposeConsent(str, z);
        }
    }

    @Keep
    public void updateUCPurposeConsent(@C0359n0 String str, @C0359n0 String str2, boolean z) {
        if (C35020d.m143605J(str2) || C35020d.m143605J(str)) {
            OTLogger.m143461p("OTPublishersHeadlessSDK", "Invalid id passed to update Topics");
        } else if (getUCPurposeConsent(str2) < 1) {
            OTLogger.m143461p("OTPublishersHeadlessSDK", "Purpose consent for " + str2 + " is disabled, thus topic cannot be enabled");
        } else {
            this.f85219d.mo103593F(str.trim() + str2.trim(), str, z);
        }
    }

    @Deprecated
    @Keep
    public void updateVendorConsent(@C0359n0 String str, boolean z) {
        if (C35020d.m143605J(str)) {
            OTLogger.m143461p("OTPublishersHeadlessSDK", "Empty vendor id passed to updateVendorConsent method.");
        } else {
            this.f85218c.updateVendorConsentStatus(OTVendorListMode.IAB, str, z);
        }
    }

    @Deprecated
    @Keep
    public void updateVendorLegitInterest(@C0359n0 String str, boolean z) {
        if (C35020d.m143605J(str)) {
            OTLogger.m143461p("OTPublishersHeadlessSDK", "Empty vendor id passed to updateVendorLegitInterest method.");
            return;
        }
        try {
            if (getDomainGroupData().isNull("LegIntSettings")) {
                return;
            }
            if (getDomainGroupData().getJSONObject("LegIntSettings").getBoolean("PAllowLI")) {
                this.f85218c.updateVendorLegitInterest(OTVendorListMode.IAB, str, z);
                return;
            }
            OTLogger.m143461p("OTPublishersHeadlessSDK", "Not updated LI value for vendor ID " + str + ", LI not configured for this vendor Id.");
        } catch (Exception e) {
            OTLogger.m143457l("OTPublishersHeadlessSDK", "Error while checking LI feature toggle" + e.getMessage());
        }
    }

    @Keep
    public int getUCPurposeConsent(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        if (!C35020d.m143605J(str3) && !C35020d.m143605J(str2) && !C35020d.m143605J(str)) {
            return this.f85219d.mo103605b(str, str3, str2);
        }
        OTLogger.m143461p("OTPublishersHeadlessSDK", "Invalid id passed to get UCP Custom Preference Option Consent Status");
        return -1;
    }

    @C0363p0
    @Keep
    public JSONObject getVendorDetails(@C0359n0 String str, @C0359n0 String str2) {
        try {
            if (OTVendorListMode.IAB.equalsIgnoreCase(str)) {
                return getVendorDetails(Integer.parseInt(str2));
            }
            JSONObject vendorObjectById = this.f85218c.getVendorObjectById(str, str2);
            OTLogger.m143458m("OTPublishersHeadlessSDK", "Vendor details for ID:" + str2 + " " + vendorObjectById);
            return vendorObjectById;
        } catch (JSONException e) {
            OTLogger.m143457l("OTPublishersHeadlessSDK", VENDOR_DETAILS_ERROR_MSG + e.getMessage());
            return null;
        }
    }

    @Keep
    public void setupUI(@C0359n0 C19232h hVar, int i, @C0359n0 OTConfiguration oTConfiguration) {
        callSetupUI(hVar, i, oTConfiguration);
    }

    public void showBannerUI(@C0359n0 C19232h hVar, @C0359n0 OTConfiguration oTConfiguration) {
        mo104094a(hVar, oTConfiguration);
    }

    @Keep
    public void showPreferenceCenterUI(@C0359n0 C19232h hVar, @C0359n0 OTConfiguration oTConfiguration) {
        mo104098b(hVar, oTConfiguration);
    }

    @Keep
    public void updateUCPurposeConsent(@C0359n0 String str, boolean z) {
        if (C35020d.m143605J(str)) {
            OTLogger.m143461p("OTPublishersHeadlessSDK", "Invalid id passed to update Purposes");
        } else {
            this.f85219d.mo103627y(str, z);
        }
    }
}
