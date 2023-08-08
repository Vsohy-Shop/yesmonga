package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14566o3;

/* renamed from: com.contentsquare.android.sdk.pb */
public enum C14617pb implements C14566o3.C14569c {
    RECORDING_QUALITY_UNSPECIFIED(0),
    RECORDING_QUALITY_LOW(1),
    RECORDING_QUALITY_MEDIUM(2),
    RECORDING_QUALITY_HIGH(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    public static final C14566o3.C14570d<C14617pb> f36190g = null;

    /* renamed from: a */
    public final int f36192a;

    /* renamed from: com.contentsquare.android.sdk.pb$a */
    public class C14618a implements C14566o3.C14570d<C14617pb> {
        /* renamed from: a */
        public C14617pb mo35920b(int i) {
            return C14617pb.m62953b(i);
        }
    }

    /* access modifiers changed from: public */
    static {
        f36190g = new C14618a();
    }

    /* access modifiers changed from: public */
    C14617pb(int i) {
        this.f36192a = i;
    }

    /* renamed from: b */
    public static C14617pb m62953b(int i) {
        if (i == 0) {
            return RECORDING_QUALITY_UNSPECIFIED;
        }
        if (i == 1) {
            return RECORDING_QUALITY_LOW;
        }
        if (i == 2) {
            return RECORDING_QUALITY_MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return RECORDING_QUALITY_HIGH;
    }

    /* renamed from: a */
    public final int mo35918a() {
        if (this != UNRECOGNIZED) {
            return this.f36192a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
