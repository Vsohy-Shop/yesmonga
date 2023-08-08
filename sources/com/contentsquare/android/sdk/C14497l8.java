package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14439j3;

/* renamed from: com.contentsquare.android.sdk.l8 */
public class C14497l8 extends C14439j3 {

    /* renamed from: m */
    public final String f35855m;

    /* renamed from: n */
    public final String f35856n;

    /* renamed from: o */
    public final String f35857o;

    /* renamed from: p */
    public final boolean f35858p;

    /* renamed from: com.contentsquare.android.sdk.l8$a */
    public static class C14498a extends C14439j3.C14440a<C14497l8> {

        /* renamed from: k */
        public String f35859k;

        /* renamed from: l */
        public String f35860l;

        /* renamed from: m */
        public String f35861m;

        /* renamed from: n */
        public boolean f35862n;

        public C14498a() {
            mo35603i(6);
        }

        /* renamed from: A */
        public String mo35819A() {
            return this.f35860l;
        }

        /* renamed from: B */
        public boolean mo35820B() {
            return this.f35862n;
        }

        /* renamed from: v */
        public C14498a mo35821v(boolean z) {
            this.f35862n = z;
            return this;
        }

        /* renamed from: w */
        public C14498a mo35822w(String str) {
            this.f35859k = str;
            return this;
        }

        /* renamed from: x */
        public C14497l8 mo34709e() {
            return new C14497l8(this);
        }

        /* renamed from: y */
        public String mo35824y() {
            return this.f35859k;
        }

        /* renamed from: z */
        public String mo35825z() {
            return this.f35861m;
        }
    }

    public C14497l8(C14498a aVar) {
        super(aVar);
        this.f35855m = aVar.mo35824y();
        this.f35856n = aVar.mo35819A();
        this.f35857o = aVar.mo35825z();
        this.f35858p = aVar.mo35820B();
    }

    /* renamed from: l */
    public void mo34706l() {
        C14439j3.f35661l.mo35679i("Tap - Target: {Last view info: %s} - Unresponsive: %s", C14170a4.m60812b(this.f35855m), Boolean.valueOf(this.f35858p));
    }

    /* renamed from: m */
    public String mo35815m() {
        return this.f35855m;
    }

    /* renamed from: n */
    public String mo35816n() {
        return this.f35857o;
    }

    /* renamed from: o */
    public String mo35817o() {
        return this.f35856n;
    }

    /* renamed from: p */
    public boolean mo35818p() {
        return this.f35858p;
    }
}
