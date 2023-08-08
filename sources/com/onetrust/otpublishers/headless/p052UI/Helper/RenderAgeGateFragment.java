package com.onetrust.otpublishers.headless.p052UI.Helper;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.C19232h;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import com.carrefour.fid.android.airship.util.C13758b;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTConsentUICallback;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35115o;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35124x;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35209g;
import org.json.JSONException;

/* renamed from: com.onetrust.otpublishers.headless.UI.Helper.RenderAgeGateFragment */
public class RenderAgeGateFragment {
    /* renamed from: a */
    public static void m143732a(@C0359n0 C19232h hVar, @C0363p0 OTConfiguration oTConfiguration, @C0359n0 OTConsentUICallback oTConsentUICallback) {
        C35209g P0 = C35209g.m145145P0(OTFragmentTags.OT_AGE_GATE_FRAGMENT_TAG, oTConfiguration, oTConsentUICallback);
        try {
            P0.show(hVar.mo57175g0(), OTFragmentTags.OT_AGE_GATE_FRAGMENT_TAG);
        } catch (IllegalStateException e) {
            OTLogger.m143447b("OneTrust", "Activity in illegal state to add a AG fragment " + e.toString());
            m143733b(hVar, P0);
        }
    }

    /* renamed from: b */
    public static void m143733b(@C0359n0 final C19232h hVar, final C35209g gVar) {
        hVar.getLifecycle().mo57464a(new C19470t() {
            /* renamed from: i */
            public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
                if (event.compareTo(Lifecycle.C19372Event.ON_RESUME) == 0) {
                    C35209g.this.show(hVar.mo57175g0(), OTFragmentTags.OT_AGE_GATE_FRAGMENT_TAG);
                    hVar.getLifecycle().mo57467d(this);
                }
            }
        });
    }

    /* renamed from: c */
    public boolean mo104262c(@C0359n0 C19232h hVar, @C0363p0 OTConfiguration oTConfiguration, @C0359n0 OTConsentUICallback oTConsentUICallback) {
        C35115o oVar;
        try {
            oVar = new C35124x(hVar).mo105010a();
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error in getting age gate data :" + e.getMessage());
            oVar = null;
        }
        if (C35020d.m143624s(hVar, OTFragmentTags.OT_AGE_GATE_FRAGMENT_TAG)) {
            return false;
        }
        if (oVar == null || C35020d.m143605J(oVar.mo104827n()) || !C13758b.f33436b.equals(oVar.mo104827n())) {
            OTLogger.m143457l("OneTrust", "To display an Age Gate Prompt, you need to enable Age Gate Prompt from Admin UI and republish the SDK");
            return true;
        }
        m143732a(hVar, oTConfiguration, oTConsentUICallback);
        OTLogger.m143458m("OneTrust", "Showing Age-Gate Consent UI");
        return true;
    }
}
