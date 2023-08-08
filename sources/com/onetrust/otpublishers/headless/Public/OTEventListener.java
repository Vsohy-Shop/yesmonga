package com.onetrust.otpublishers.headless.Public;

import androidx.annotation.Keep;

@Keep
public abstract class OTEventListener {
    public abstract void allSDKViewsDismissed(String str);

    public abstract void onBannerClickedAcceptAll();

    public abstract void onBannerClickedRejectAll();

    public abstract void onHideBanner();

    public abstract void onHidePreferenceCenter();

    public abstract void onHideVendorList();

    public abstract void onPreferenceCenterAcceptAll();

    public abstract void onPreferenceCenterConfirmChoices();

    public abstract void onPreferenceCenterPurposeConsentChanged(String str, int i);

    public abstract void onPreferenceCenterPurposeLegitimateInterestChanged(String str, int i);

    public abstract void onPreferenceCenterRejectAll();

    public void onSDKNoAction(String str) {
    }

    public abstract void onShowBanner();

    public abstract void onShowPreferenceCenter();

    public abstract void onShowVendorList();

    public abstract void onVendorConfirmChoices();

    public void onVendorListAcceptAll() {
    }

    public void onVendorListRejectAll() {
    }

    public abstract void onVendorListVendorConsentChanged(String str, int i);

    public void onVendorListVendorConsentChanged(String str, String str2, int i) {
    }

    public abstract void onVendorListVendorLegitimateInterestChanged(String str, int i);
}
