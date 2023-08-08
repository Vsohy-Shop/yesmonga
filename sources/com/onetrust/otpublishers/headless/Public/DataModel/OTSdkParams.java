package com.onetrust.otpublishers.headless.Public.DataModel;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;

public class OTSdkParams {

    /* renamed from: a */
    public final String f85194a;

    /* renamed from: b */
    public final String f85195b;

    /* renamed from: c */
    public final String f85196c;

    /* renamed from: d */
    public final OTProfileSyncParams f85197d;

    /* renamed from: e */
    public final OTUXParams f85198e;

    /* renamed from: f */
    public final String f85199f;

    /* renamed from: g */
    public final String f85200g;

    /* renamed from: h */
    public final boolean f85201h;

    public static class SdkParamsBuilder {

        /* renamed from: a */
        public String f85202a;

        /* renamed from: b */
        public String f85203b;

        /* renamed from: c */
        public String f85204c;

        /* renamed from: d */
        public OTProfileSyncParams f85205d;

        /* renamed from: e */
        public String f85206e;

        /* renamed from: f */
        public String f85207f;

        /* renamed from: g */
        public OTUXParams f85208g;

        /* renamed from: h */
        public boolean f85209h;

        @C0359n0
        public static SdkParamsBuilder newInstance() {
            return new SdkParamsBuilder();
        }

        @C0359n0
        public OTSdkParams build() {
            return new OTSdkParams(this);
        }

        @C0359n0
        public SdkParamsBuilder setAPIVersion(@C0359n0 String str) {
            this.f85204c = str;
            return this;
        }

        @C0359n0
        public SdkParamsBuilder setOTCountryCode(@C0359n0 String str) {
            this.f85202a = str;
            return this;
        }

        @C0359n0
        public SdkParamsBuilder setOTRegionCode(@C0359n0 String str) {
            this.f85203b = str;
            return this;
        }

        @C0359n0
        public SdkParamsBuilder setOTUXParams(@C0359n0 OTUXParams oTUXParams) {
            this.f85208g = oTUXParams;
            return this;
        }

        @C0359n0
        @Deprecated
        public SdkParamsBuilder setOtBannerHeightRatio(@C0359n0 String str) {
            OTLogger.m143461p("OneTrust", "setOtBannerHeightRatio() method is deprecated and eventually will get removed from SDK. Please configure the banner height from OT admin UI template settings");
            this.f85207f = str;
            return this;
        }

        @C0359n0
        public SdkParamsBuilder setProfileSyncParams(@C0359n0 OTProfileSyncParams oTProfileSyncParams) {
            this.f85205d = oTProfileSyncParams;
            return this;
        }

        @C0359n0
        public SdkParamsBuilder setSyncWebSDKConsent(boolean z) {
            this.f85209h = z;
            return this;
        }

        @C0359n0
        public SdkParamsBuilder shouldCreateProfile(@C0359n0 String str) {
            this.f85206e = str;
            return this;
        }
    }

    public OTSdkParams(@C0359n0 SdkParamsBuilder sdkParamsBuilder) {
        this.f85194a = sdkParamsBuilder.f85202a;
        this.f85195b = sdkParamsBuilder.f85203b;
        this.f85196c = sdkParamsBuilder.f85204c;
        this.f85197d = sdkParamsBuilder.f85205d;
        this.f85199f = sdkParamsBuilder.f85206e;
        this.f85200g = sdkParamsBuilder.f85207f;
        this.f85198e = sdkParamsBuilder.f85208g;
        this.f85201h = sdkParamsBuilder.f85209h;
    }

    @C0363p0
    public String getCreateProfile() {
        return this.f85199f;
    }

    @C0363p0
    public String getOTCountryCode() {
        return this.f85194a;
    }

    @C0363p0
    public String getOTRegionCode() {
        return this.f85195b;
    }

    @C0363p0
    public String getOTSdkAPIVersion() {
        return this.f85196c;
    }

    @C0363p0
    public OTUXParams getOTUXParams() {
        return this.f85198e;
    }

    @C0363p0
    public String getOtBannerHeight() {
        return this.f85200g;
    }

    @C0363p0
    public OTProfileSyncParams getOtProfileSyncParams() {
        return this.f85197d;
    }

    public boolean getSyncWebSDKConsent() {
        return this.f85201h;
    }
}
