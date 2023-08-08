package com.onetrust.otpublishers.headless.Public.DataModel;

import android.graphics.Typeface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Public.OTBackButtonMode;
import com.onetrust.otpublishers.headless.Public.OTVendorListDismissMode;
import java.util.HashMap;
import kotlinx.serialization.json.internal.C12361b;

public class OTConfiguration {

    /* renamed from: a */
    public final HashMap<String, Typeface> f85176a;

    /* renamed from: b */
    public final String f85177b;

    /* renamed from: c */
    public final String f85178c;

    /* renamed from: d */
    public final String f85179d;

    public static class OTConfigurationBuilder {

        /* renamed from: a */
        public final HashMap<String, Typeface> f85180a = new HashMap<>();

        /* renamed from: b */
        public String f85181b;

        /* renamed from: c */
        public String f85182c;

        /* renamed from: d */
        public String f85183d;

        @C0359n0
        public static OTConfigurationBuilder newInstance() {
            return new OTConfigurationBuilder();
        }

        @C0359n0
        public OTConfigurationBuilder addOTTypeFace(@C0359n0 String str, @C0359n0 Typeface typeface) {
            this.f85180a.put(str, typeface);
            return this;
        }

        @C0359n0
        public OTConfiguration build() {
            return new OTConfiguration(this);
        }

        @C0359n0
        public OTConfigurationBuilder setBackButton(@C0359n0 String str) {
            this.f85181b = str;
            return this;
        }

        @C0359n0
        public OTConfigurationBuilder setVendorListJourney(@C0359n0 String str) {
            this.f85182c = str;
            return this;
        }

        @C0359n0
        public OTConfigurationBuilder shouldEnableDarkMode(@C0359n0 String str) {
            this.f85183d = str;
            return this;
        }
    }

    public OTConfiguration(@C0359n0 OTConfigurationBuilder oTConfigurationBuilder) {
        this.f85176a = oTConfigurationBuilder.f85180a;
        this.f85177b = oTConfigurationBuilder.f85181b;
        this.f85178c = oTConfigurationBuilder.f85182c;
        this.f85179d = oTConfigurationBuilder.f85183d;
    }

    @C0363p0
    public String getDarkModeThemeValue() {
        return this.f85179d;
    }

    @C0363p0
    public Typeface getOtTypeFaceMap(@C0359n0 String str) {
        if (this.f85176a.containsKey(str)) {
            return this.f85176a.get(str);
        }
        return null;
    }

    public boolean isBannerBackButtonCloseBanner() {
        if (C35020d.m143605J(this.f85177b)) {
            return false;
        }
        return OTBackButtonMode.DEFAULT_CONSENT_AND_CLOSE_BANNER.equalsIgnoreCase(this.f85177b);
    }

    public boolean isBannerBackButtonDisMissUI() {
        if (C35020d.m143605J(this.f85177b)) {
            return false;
        }
        return OTBackButtonMode.DISMISS_BANNER.equalsIgnoreCase(this.f85177b);
    }

    public boolean isBannerBackButtonDisabled() {
        return !isBannerBackButtonDisMissUI() && !isBannerBackButtonCloseBanner();
    }

    public boolean isShowConfirmMyChoice() {
        if (C35020d.m143605J(this.f85178c)) {
            return false;
        }
        return OTVendorListDismissMode.SHOW_CONFIRM_MY_CHOICE.equalsIgnoreCase(this.f85178c);
    }

    @C0359n0
    public String toString() {
        return "OTConfig{otTypeFaceMap=" + this.f85176a + "bannerBackButton=" + this.f85177b + "vendorListMode=" + this.f85178c + "darkMode=" + this.f85179d + C12361b.f30259j;
    }

    @C0359n0
    public HashMap<String, Typeface> getOtTypeFaceMap() {
        return this.f85176a;
    }
}
