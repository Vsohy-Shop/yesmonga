package com.onetrust.otpublishers.headless.p052UI.Helper;

import androidx.annotation.C0359n0;
import androidx.fragment.app.C19232h;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import com.onetrust.otpublishers.headless.Internal.C35019c;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35123w;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35231o0;
import org.json.JSONException;

/* renamed from: com.onetrust.otpublishers.headless.UI.Helper.RenderConsentPreferenceFragment */
public class RenderConsentPreferenceFragment {
    /* renamed from: a */
    public static void m143736a(@C0359n0 C19232h hVar, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        C35231o0 Q0 = C35231o0.m145261Q0(OTFragmentTags.OT_UC_PURPOSES_FRAGMENT_TAG, oTPublishersHeadlessSDK);
        try {
            Q0.show(hVar.mo57175g0(), OTFragmentTags.OT_UC_PURPOSES_FRAGMENT_TAG);
        } catch (IllegalStateException e) {
            OTLogger.m143447b("OneTrust", "Activity in illegal state to add a UCP fragment " + e.toString());
            m143737b(hVar, Q0);
        }
        OTLogger.m143458m("OneTrust", "Showing Consent Preferences");
    }

    /* renamed from: b */
    public static void m143737b(@C0359n0 final C19232h hVar, final C35231o0 o0Var) {
        hVar.getLifecycle().mo57464a(new C19470t() {
            /* renamed from: i */
            public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
                if (event.compareTo(Lifecycle.C19372Event.ON_RESUME) == 0) {
                    C35231o0.this.show(hVar.mo57175g0(), OTFragmentTags.OT_UC_PURPOSES_FRAGMENT_TAG);
                    hVar.getLifecycle().mo57467d(this);
                }
            }
        });
    }

    /* renamed from: c */
    public boolean mo104263c(@C0359n0 C19232h hVar, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        C35123w wVar;
        try {
            wVar = new C35124x(hVar).mo105013d(oTPublishersHeadlessSDK.getUcpHandler());
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error in getting consent preferences data :" + e.getMessage());
            wVar = null;
        }
        if (C35020d.m143624s(hVar, OTFragmentTags.OT_UC_PURPOSES_FRAGMENT_TAG)) {
            return false;
        }
        if (wVar != null && C35019c.m143598c(wVar.mo105007m(), false)) {
            if (wVar.mo105000f().size() > 0) {
                m143736a(hVar, oTPublishersHeadlessSDK);
                return true;
            }
            OTLogger.m143457l("OneTrust", "Please enable to Universal Consent Purposes from Template Configuration and add purposes to display the UC Purposes Preference Center.");
        }
        OTLogger.m143457l("OneTrust", "Consent Preferences UI is not configured to show for this app id.\n Please enable it from admin UI and try again");
        return true;
    }
}
