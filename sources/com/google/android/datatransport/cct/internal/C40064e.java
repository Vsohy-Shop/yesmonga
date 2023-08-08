package com.google.android.datatransport.cct.internal;

import androidx.annotation.C0363p0;
import com.google.android.datatransport.cct.internal.ClientInfo;

/* renamed from: com.google.android.datatransport.cct.internal.e */
public final class C40064e extends ClientInfo {

    /* renamed from: a */
    public final ClientInfo.ClientType f102242a;

    /* renamed from: b */
    public final C40051a f102243b;

    /* renamed from: com.google.android.datatransport.cct.internal.e$b */
    public static final class C40066b extends ClientInfo.C40049a {

        /* renamed from: a */
        public ClientInfo.ClientType f102244a;

        /* renamed from: b */
        public C40051a f102245b;

        /* renamed from: a */
        public ClientInfo mo132569a() {
            return new C40064e(this.f102244a, this.f102245b);
        }

        /* renamed from: b */
        public ClientInfo.C40049a mo132570b(@C0363p0 C40051a aVar) {
            this.f102245b = aVar;
            return this;
        }

        /* renamed from: c */
        public ClientInfo.C40049a mo132571c(@C0363p0 ClientInfo.ClientType clientType) {
            this.f102244a = clientType;
            return this;
        }
    }

    @C0363p0
    /* renamed from: b */
    public C40051a mo132567b() {
        return this.f102243b;
    }

    @C0363p0
    /* renamed from: c */
    public ClientInfo.ClientType mo132568c() {
        return this.f102242a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f102242a;
        if (clientType != null ? clientType.equals(clientInfo.mo132568c()) : clientInfo.mo132568c() == null) {
            C40051a aVar = this.f102243b;
            if (aVar == null) {
                if (clientInfo.mo132567b() == null) {
                    return true;
                }
            } else if (aVar.equals(clientInfo.mo132567b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        ClientInfo.ClientType clientType = this.f102242a;
        int i2 = 0;
        if (clientType == null) {
            i = 0;
        } else {
            i = clientType.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        C40051a aVar = this.f102243b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f102242a + ", androidClientInfo=" + this.f102243b + "}";
    }

    public C40064e(@C0363p0 ClientInfo.ClientType clientType, @C0363p0 C40051a aVar) {
        this.f102242a = clientType;
        this.f102243b = aVar;
    }
}
