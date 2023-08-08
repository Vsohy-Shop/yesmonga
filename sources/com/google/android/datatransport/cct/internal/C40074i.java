package com.google.android.datatransport.cct.internal;

import androidx.annotation.C0363p0;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* renamed from: com.google.android.datatransport.cct.internal.i */
public final class C40074i extends NetworkConnectionInfo {

    /* renamed from: a */
    public final NetworkConnectionInfo.NetworkType f102275a;

    /* renamed from: b */
    public final NetworkConnectionInfo.MobileSubtype f102276b;

    /* renamed from: com.google.android.datatransport.cct.internal.i$b */
    public static final class C40076b extends NetworkConnectionInfo.C40050a {

        /* renamed from: a */
        public NetworkConnectionInfo.NetworkType f102277a;

        /* renamed from: b */
        public NetworkConnectionInfo.MobileSubtype f102278b;

        /* renamed from: a */
        public NetworkConnectionInfo mo132576a() {
            return new C40074i(this.f102277a, this.f102278b);
        }

        /* renamed from: b */
        public NetworkConnectionInfo.C40050a mo132577b(@C0363p0 NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f102278b = mobileSubtype;
            return this;
        }

        /* renamed from: c */
        public NetworkConnectionInfo.C40050a mo132578c(@C0363p0 NetworkConnectionInfo.NetworkType networkType) {
            this.f102277a = networkType;
            return this;
        }
    }

    @C0363p0
    /* renamed from: b */
    public NetworkConnectionInfo.MobileSubtype mo132572b() {
        return this.f102276b;
    }

    @C0363p0
    /* renamed from: c */
    public NetworkConnectionInfo.NetworkType mo132573c() {
        return this.f102275a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f102275a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.mo132573c()) : networkConnectionInfo.mo132573c() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f102276b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.mo132572b() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.mo132572b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        NetworkConnectionInfo.NetworkType networkType = this.f102275a;
        int i2 = 0;
        if (networkType == null) {
            i = 0;
        } else {
            i = networkType.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f102276b;
        if (mobileSubtype != null) {
            i2 = mobileSubtype.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f102275a + ", mobileSubtype=" + this.f102276b + "}";
    }

    public C40074i(@C0363p0 NetworkConnectionInfo.NetworkType networkType, @C0363p0 NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f102275a = networkType;
        this.f102276b = mobileSubtype;
    }
}
