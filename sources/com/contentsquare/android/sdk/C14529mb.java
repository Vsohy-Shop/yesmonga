package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14566o3;

/* renamed from: com.contentsquare.android.sdk.mb */
public enum C14529mb implements C14566o3.C14569c {
    NETWORK_STATUS_UNSPECIFIED(0),
    NETWORK_STATUS_OFFLINE(1),
    NETWORK_STATUS_WIFI(2),
    NETWORK_STATUS_CELLULAR(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    public static final C14566o3.C14570d<C14529mb> f35945g = null;

    /* renamed from: a */
    public final int f35947a;

    /* renamed from: com.contentsquare.android.sdk.mb$a */
    public class C14530a implements C14566o3.C14570d<C14529mb> {
        /* renamed from: a */
        public C14529mb mo35920b(int i) {
            return C14529mb.m62626b(i);
        }
    }

    /* access modifiers changed from: public */
    static {
        f35945g = new C14530a();
    }

    /* access modifiers changed from: public */
    C14529mb(int i) {
        this.f35947a = i;
    }

    /* renamed from: b */
    public static C14529mb m62626b(int i) {
        if (i == 0) {
            return NETWORK_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return NETWORK_STATUS_OFFLINE;
        }
        if (i == 2) {
            return NETWORK_STATUS_WIFI;
        }
        if (i != 3) {
            return null;
        }
        return NETWORK_STATUS_CELLULAR;
    }

    /* renamed from: a */
    public final int mo35918a() {
        if (this != UNRECOGNIZED) {
            return this.f35947a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
