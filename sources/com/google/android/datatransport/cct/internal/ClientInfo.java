package com.google.android.datatransport.cct.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.datatransport.cct.internal.C40064e;
import com.google.auto.value.C32455c;

@C32455c
public abstract class ClientInfo {

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        /* access modifiers changed from: public */
        ClientType(int i) {
            this.value = i;
        }
    }

    @C32455c.C32456a
    /* renamed from: com.google.android.datatransport.cct.internal.ClientInfo$a */
    public static abstract class C40049a {
        @C0359n0
        /* renamed from: a */
        public abstract ClientInfo mo132569a();

        @C0359n0
        /* renamed from: b */
        public abstract C40049a mo132570b(@C0363p0 C40051a aVar);

        @C0359n0
        /* renamed from: c */
        public abstract C40049a mo132571c(@C0363p0 ClientType clientType);
    }

    @C0359n0
    /* renamed from: a */
    public static C40049a m163074a() {
        return new C40064e.C40066b();
    }

    @C0363p0
    /* renamed from: b */
    public abstract C40051a mo132567b();

    @C0363p0
    /* renamed from: c */
    public abstract ClientType mo132568c();
}
