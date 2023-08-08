package com.onetrust.otpublishers.headless.Public.DataModel;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import kotlinx.serialization.json.internal.C12361b;

public class OTCache {

    /* renamed from: a */
    public final String f85174a;

    public static class OTCacheBuilder {

        /* renamed from: a */
        public String f85175a;

        @C0359n0
        public static OTCacheBuilder newInstance() {
            return new OTCacheBuilder();
        }

        @C0359n0
        public OTCache build() {
            return new OTCache(this);
        }

        @C0359n0
        public OTCacheBuilder setDataSubjectIdentifier(@C0359n0 String str) {
            this.f85175a = str;
            return this;
        }
    }

    public OTCache(@C0359n0 OTCacheBuilder oTCacheBuilder) {
        this.f85174a = oTCacheBuilder.f85175a;
    }

    @C0363p0
    public String getDataSubjectIdentifier() {
        return this.f85174a;
    }

    @C0359n0
    public String toString() {
        return "OTCache{dataSubjectIdentifier='" + this.f85174a + '\'' + C12361b.f30259j;
    }
}
