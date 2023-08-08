package com.onetrust.otpublishers.headless.Internal.Event;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.OTEventListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Event.a */
public class C34962a {

    /* renamed from: a */
    public HashSet<OTEventListener> f85054a = new HashSet<>();

    /* renamed from: c */
    public static void m142989c(@C0359n0 OTEventListener oTEventListener, @C0359n0 C34963b bVar) {
        if (C35020d.m143605J(bVar.mo103587i())) {
            oTEventListener.onVendorListVendorConsentChanged(bVar.mo103582d(), bVar.mo103586h());
        } else {
            oTEventListener.onVendorListVendorConsentChanged(bVar.mo103587i(), bVar.mo103582d(), bVar.mo103586h());
        }
    }

    /* renamed from: d */
    public static void m142990d(@C0359n0 OTEventListener oTEventListener, @C0359n0 C34963b bVar, @C0359n0 String str) {
        switch (bVar.mo103579a()) {
            case 1:
                oTEventListener.onShowBanner();
                return;
            case 2:
                oTEventListener.onHideBanner();
                return;
            case 3:
                oTEventListener.onBannerClickedAcceptAll();
                return;
            case 4:
                oTEventListener.onBannerClickedRejectAll();
                return;
            case 5:
                oTEventListener.onShowPreferenceCenter();
                return;
            case 6:
                oTEventListener.onHidePreferenceCenter();
                return;
            case 7:
                oTEventListener.onPreferenceCenterPurposeConsentChanged(bVar.mo103582d(), bVar.mo103586h());
                return;
            case 8:
                oTEventListener.onPreferenceCenterAcceptAll();
                return;
            case 9:
                oTEventListener.onPreferenceCenterRejectAll();
                return;
            case 10:
                oTEventListener.onPreferenceCenterConfirmChoices();
                return;
            case 11:
                oTEventListener.onPreferenceCenterPurposeLegitimateInterestChanged(bVar.mo103582d(), bVar.mo103586h());
                return;
            case 12:
                oTEventListener.onShowVendorList();
                return;
            case 13:
                oTEventListener.onHideVendorList();
                return;
            case 14:
                oTEventListener.onVendorConfirmChoices();
                return;
            case 15:
                m142989c(oTEventListener, bVar);
                return;
            case 16:
                oTEventListener.onVendorListVendorLegitimateInterestChanged(bVar.mo103582d(), bVar.mo103586h());
                return;
            case 17:
                oTEventListener.allSDKViewsDismissed(str);
                return;
            case 18:
                oTEventListener.onSDKNoAction(str);
                return;
            case 19:
                oTEventListener.onVendorListAcceptAll();
                return;
            case 20:
                oTEventListener.onVendorListRejectAll();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo103576a() {
        OTLogger.m143447b("EventListenerSetter", "clear OTEventListener.");
        this.f85054a.clear();
    }

    /* renamed from: b */
    public void mo103577b(@C0359n0 C34963b bVar) {
        int size = this.f85054a.size();
        if (size > 0) {
            OTLogger.m143458m("EventListenerSetter", "Sending oneTrustDataEventListener callback. oneTrustEventListener size = " + size);
            Iterator<OTEventListener> it = this.f85054a.iterator();
            while (it.hasNext()) {
                m142990d(it.next(), bVar, bVar.mo103584f());
            }
            return;
        }
        OTLogger.m143447b("EventListenerSetter", "Empty callback set. No oneTrustEventListener callback.");
    }

    /* renamed from: e */
    public boolean mo103578e(@C0363p0 OTEventListener oTEventListener) {
        if (oTEventListener == null) {
            OTLogger.m143447b("EventListenerSetter", "OtEventListener set with null called.");
            return false;
        }
        OTLogger.m143447b("EventListenerSetter", "Add OtEventListener, value = " + oTEventListener);
        return this.f85054a.add(oTEventListener);
    }
}
