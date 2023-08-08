package com.onetrust.otpublishers.headless.Public.DataModel;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import kotlinx.serialization.json.internal.C12361b;
import org.json.JSONObject;

public class OTUXParams {

    /* renamed from: a */
    public final JSONObject f85210a;

    /* renamed from: b */
    public final String f85211b;

    public static class OTUXParamsBuilder {

        /* renamed from: a */
        public String f85212a;

        /* renamed from: b */
        public JSONObject f85213b;

        @C0359n0
        public static OTUXParamsBuilder newInstance() {
            return new OTUXParamsBuilder();
        }

        @C0359n0
        public OTUXParams build() {
            return new OTUXParams(this);
        }

        @C0359n0
        public OTUXParamsBuilder setOTSDKTheme(String str) {
            this.f85212a = str;
            return this;
        }

        @C0359n0
        public OTUXParamsBuilder setUXParams(@C0359n0 JSONObject jSONObject) {
            this.f85213b = jSONObject;
            return this;
        }
    }

    public OTUXParams(@C0359n0 OTUXParamsBuilder oTUXParamsBuilder) {
        this.f85210a = oTUXParamsBuilder.f85213b;
        this.f85211b = oTUXParamsBuilder.f85212a;
    }

    @C0363p0
    public String getOTSDKTheme() {
        return this.f85211b;
    }

    @C0363p0
    public JSONObject getUxParam() {
        return this.f85210a;
    }

    @C0359n0
    public String toString() {
        return "OTUXParams{uxParam=" + this.f85210a + ", otSDKTheme='" + this.f85211b + '\'' + C12361b.f30259j;
    }
}
