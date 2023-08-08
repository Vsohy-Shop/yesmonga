package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14439j3;

/* renamed from: com.contentsquare.android.sdk.fb */
public class C14342fb extends C14439j3 {

    /* renamed from: m */
    public final String f35413m;

    /* renamed from: n */
    public final int f35414n;

    /* renamed from: o */
    public final boolean f35415o;

    /* renamed from: com.contentsquare.android.sdk.fb$a */
    public static class C14343a extends C14439j3.C14440a<C14342fb> {

        /* renamed from: k */
        public String f35416k;

        /* renamed from: l */
        public int f35417l;

        /* renamed from: m */
        public boolean f35418m;

        public C14343a() {
            mo35603i(17);
        }

        /* renamed from: A */
        public String mo35184A() {
            return this.f35416k;
        }

        /* renamed from: B */
        public boolean mo35185B() {
            return this.f35418m;
        }

        /* renamed from: v */
        public C14343a mo35186v(boolean z) {
            this.f35418m = z;
            return this;
        }

        /* renamed from: w */
        public C14343a mo35187w(String str) {
            this.f35416k = str;
            return this;
        }

        /* renamed from: x */
        public C14343a mo35188x(int i) {
            this.f35417l = i;
            return this;
        }

        /* renamed from: y */
        public C14342fb mo34709e() {
            return new C14342fb(this);
        }

        /* renamed from: z */
        public int mo35190z() {
            return this.f35417l;
        }
    }

    public C14342fb(C14343a aVar) {
        super(aVar);
        this.f35413m = aVar.mo35184A();
        this.f35414n = aVar.mo35190z();
        this.f35415o = aVar.mo35185B();
    }

    /* renamed from: l */
    public void mo34706l() {
        C14439j3.f35661l.mo35679i("Crash - %s", this.f35413m);
    }

    /* renamed from: m */
    public int mo35181m() {
        return this.f35414n;
    }

    /* renamed from: n */
    public String mo35182n() {
        return this.f35413m;
    }

    /* renamed from: o */
    public boolean mo35183o() {
        return this.f35415o;
    }
}
