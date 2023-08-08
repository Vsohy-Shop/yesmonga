package com.onetrust.otpublishers.headless.Public.DataModel;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import kotlinx.serialization.json.internal.C12361b;

public class OTProfileSyncParams {

    /* renamed from: a */
    public String f85184a;

    /* renamed from: b */
    public String f85185b;

    /* renamed from: c */
    public String f85186c;

    /* renamed from: d */
    public String f85187d;

    /* renamed from: e */
    public String f85188e;

    public static class OTProfileSyncParamsBuilder {

        /* renamed from: a */
        public String f85189a;

        /* renamed from: b */
        public String f85190b;

        /* renamed from: c */
        public String f85191c;

        /* renamed from: d */
        public String f85192d;

        /* renamed from: e */
        public String f85193e;

        @C0359n0
        public static OTProfileSyncParamsBuilder newInstance() {
            return new OTProfileSyncParamsBuilder();
        }

        @C0359n0
        public OTProfileSyncParams build() {
            return new OTProfileSyncParams(this);
        }

        public OTProfileSyncParamsBuilder setIdentifier(@C0359n0 String str) {
            this.f85190b = str;
            return this;
        }

        public OTProfileSyncParamsBuilder setSyncGroupId(@C0359n0 String str) {
            this.f85193e = str;
            return this;
        }

        public OTProfileSyncParamsBuilder setSyncProfile(@C0359n0 String str) {
            this.f85189a = str;
            return this;
        }

        public OTProfileSyncParamsBuilder setSyncProfileAuth(@C0359n0 String str) {
            this.f85191c = str;
            return this;
        }

        public OTProfileSyncParamsBuilder setTenantId(@C0359n0 String str) {
            this.f85192d = str;
            return this;
        }
    }

    public OTProfileSyncParams(@C0359n0 OTProfileSyncParamsBuilder oTProfileSyncParamsBuilder) {
        this.f85184a = oTProfileSyncParamsBuilder.f85189a;
        this.f85185b = oTProfileSyncParamsBuilder.f85190b;
        this.f85186c = oTProfileSyncParamsBuilder.f85191c;
        this.f85187d = oTProfileSyncParamsBuilder.f85192d;
        this.f85188e = oTProfileSyncParamsBuilder.f85193e;
    }

    @C0363p0
    public String getIdentifier() {
        return this.f85185b;
    }

    @C0363p0
    public String getSyncGroupId() {
        return this.f85188e;
    }

    @C0363p0
    public String getSyncProfile() {
        return this.f85184a;
    }

    @C0363p0
    public String getSyncProfileAuth() {
        return this.f85186c;
    }

    @C0363p0
    public String getTenantId() {
        return this.f85187d;
    }

    @C0359n0
    public String toString() {
        return "OTProfileSyncParams{syncProfile=" + this.f85184a + ", identifier='" + this.f85185b + '\'' + ", syncProfileAuth='" + this.f85186c + '\'' + ", tenantId='" + this.f85187d + '\'' + ", syncGroupId='" + this.f85188e + '\'' + C12361b.f30259j;
    }
}
