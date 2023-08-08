package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14439j3;

/* renamed from: com.contentsquare.android.sdk.gb */
public class C14375gb extends C14439j3 {

    /* renamed from: m */
    public final Long f35551m;

    /* renamed from: n */
    public final String f35552n;

    /* renamed from: com.contentsquare.android.sdk.gb$a */
    public static class C14376a extends C14439j3.C14440a<C14375gb> {

        /* renamed from: k */
        public Long f35553k = 0L;

        /* renamed from: l */
        public String f35554l = "";

        public C14376a() {
            mo35603i(19);
        }

        /* renamed from: v */
        public C14376a mo35372v(Long l) {
            this.f35553k = l;
            return this;
        }

        /* renamed from: w */
        public C14376a mo35373w(String str) {
            this.f35554l = str;
            return this;
        }

        /* renamed from: x */
        public C14375gb mo34709e() {
            return new C14375gb(this);
        }

        /* renamed from: y */
        public String mo35375y() {
            return this.f35554l;
        }

        /* renamed from: z */
        public Long mo35376z() {
            return this.f35553k;
        }
    }

    public C14375gb(C14376a aVar) {
        super(aVar);
        this.f35551m = aVar.mo35376z();
        this.f35552n = aVar.mo35375y();
    }

    /* renamed from: l */
    public void mo34706l() {
        C14439j3.f35661l.mo35679i("Dynamic variable - Key: %s - Value: %d", this.f35552n, this.f35551m);
    }

    /* renamed from: m */
    public String mo35370m() {
        return this.f35552n;
    }

    /* renamed from: n */
    public Long mo35371n() {
        return this.f35551m;
    }
}
