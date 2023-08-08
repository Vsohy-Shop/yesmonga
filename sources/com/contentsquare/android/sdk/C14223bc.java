package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14439j3;

/* renamed from: com.contentsquare.android.sdk.bc */
public class C14223bc extends C14439j3 {

    /* renamed from: m */
    public final String f35128m;

    /* renamed from: n */
    public final String f35129n;

    /* renamed from: com.contentsquare.android.sdk.bc$a */
    public static class C14224a extends C14439j3.C14440a<C14223bc> {

        /* renamed from: k */
        public String f35130k;

        /* renamed from: l */
        public String f35131l;

        public C14224a() {
            mo35603i(18);
        }

        /* renamed from: v */
        public C14224a mo34710v(String str) {
            this.f35131l = str;
            return this;
        }

        /* renamed from: w */
        public C14224a mo34711w(String str) {
            this.f35130k = str;
            return this;
        }

        /* renamed from: x */
        public C14223bc mo34709e() {
            return new C14223bc(this);
        }

        /* renamed from: y */
        public String mo34713y() {
            return this.f35131l;
        }

        /* renamed from: z */
        public String mo34714z() {
            return this.f35130k;
        }
    }

    public C14223bc(C14224a aVar) {
        super(aVar);
        this.f35128m = aVar.mo34714z();
        this.f35129n = aVar.mo34713y();
    }

    /* renamed from: l */
    public void mo34706l() {
        C14439j3.f35661l.mo35679i("Dynamic variable - Key: %s - Value: %s", this.f35129n, this.f35128m);
    }

    /* renamed from: m */
    public String mo34707m() {
        return this.f35129n;
    }

    /* renamed from: n */
    public String mo34708n() {
        return this.f35128m;
    }
}
