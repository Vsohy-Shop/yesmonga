package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.e7 */
public final class C14301e7 extends C14359g4<C14301e7, C14302a> implements C14748ta {

    /* renamed from: E0 */
    public static final int f35311E0 = 6;

    /* renamed from: F0 */
    public static final C14301e7 f35312F0;

    /* renamed from: G0 */
    public static volatile C14311ee<C14301e7> f35313G0 = null;

    /* renamed from: X */
    public static final int f35314X = 3;

    /* renamed from: Y */
    public static final int f35315Y = 4;

    /* renamed from: Z */
    public static final int f35316Z = 5;

    /* renamed from: y */
    public static final int f35317y = 1;

    /* renamed from: z */
    public static final int f35318z = 2;

    /* renamed from: e */
    public long f35319e;

    /* renamed from: f */
    public String f35320f = "";

    /* renamed from: g */
    public String f35321g = "";

    /* renamed from: v */
    public long f35322v;

    /* renamed from: w */
    public long f35323w;

    /* renamed from: x */
    public int f35324x;

    /* renamed from: com.contentsquare.android.sdk.e7$a */
    public static final class C14302a extends C14359g4.C14360a<C14301e7, C14302a> implements C14748ta {
        public C14302a() {
            super(C14301e7.f35312F0);
        }

        /* renamed from: A */
        public C14302a mo35066A(long j) {
            mo35329t();
            ((C14301e7) this.f35519b).mo35060I(j);
            return this;
        }

        /* renamed from: B */
        public C14302a mo35067B(String str) {
            mo35329t();
            ((C14301e7) this.f35519b).mo35063L(str);
            return this;
        }

        /* renamed from: C */
        public C14302a mo35068C(long j) {
            mo35329t();
            ((C14301e7) this.f35519b).mo35062K(j);
            return this;
        }

        /* renamed from: D */
        public C14302a mo35069D(String str) {
            mo35329t();
            ((C14301e7) this.f35519b).mo35065N(str);
            return this;
        }

        /* renamed from: E */
        public C14302a mo35070E(long j) {
            mo35329t();
            ((C14301e7) this.f35519b).mo35064M(j);
            return this;
        }

        /* renamed from: x */
        public C14302a mo35071x(int i) {
            mo35329t();
            ((C14301e7) this.f35519b).mo35061J(i);
            return this;
        }
    }

    static {
        C14301e7 e7Var = new C14301e7();
        f35312F0 = e7Var;
        C14359g4.m61822w(C14301e7.class, e7Var);
    }

    /* renamed from: O */
    public static C14302a m61489O() {
        return (C14302a) f35312F0.mo35321z();
    }

    /* renamed from: I */
    public final void mo35060I(long j) {
        this.f35322v = j;
    }

    /* renamed from: J */
    public final void mo35061J(int i) {
        this.f35324x = i;
    }

    /* renamed from: K */
    public final void mo35062K(long j) {
        this.f35323w = j;
    }

    /* renamed from: L */
    public final void mo35063L(String str) {
        str.getClass();
        this.f35321g = str;
    }

    /* renamed from: M */
    public final void mo35064M(long j) {
        this.f35319e = j;
    }

    /* renamed from: N */
    public final void mo35065N(String str) {
        str.getClass();
        this.f35320f = str;
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14301e7();
            case 2:
                return new C14302a();
            case 3:
                return C14359g4.m61820u(f35312F0, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0003\u0002Ȉ\u0003Ȉ\u0004\u0003\u0005\u0003\u0006\u000b", new Object[]{"unixTimestampMs_", "url_", "httpMethod_", "requestTime_", "responseTime_", "statusCode_"});
            case 4:
                return f35312F0;
            case 5:
                C14311ee<C14301e7> eeVar = f35313G0;
                if (eeVar == null) {
                    synchronized (C14301e7.class) {
                        eeVar = f35313G0;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f35312F0);
                            f35313G0 = eeVar;
                        }
                    }
                }
                return eeVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
