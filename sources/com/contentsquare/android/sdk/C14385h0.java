package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.h0 */
public final class C14385h0 extends C14359g4<C14385h0, C14386a> implements C14748ta {

    /* renamed from: v */
    public static final int f35576v = 1;

    /* renamed from: w */
    public static final int f35577w = 2;

    /* renamed from: x */
    public static final int f35578x = 3;

    /* renamed from: y */
    public static final C14385h0 f35579y;

    /* renamed from: z */
    public static volatile C14311ee<C14385h0> f35580z;

    /* renamed from: e */
    public long f35581e;

    /* renamed from: f */
    public long f35582f;

    /* renamed from: g */
    public String f35583g = "";

    /* renamed from: com.contentsquare.android.sdk.h0$a */
    public static final class C14386a extends C14359g4.C14360a<C14385h0, C14386a> implements C14748ta {
        public C14386a() {
            super(C14385h0.f35579y);
        }

        /* renamed from: A */
        public C14386a mo35414A(String str) {
            mo35329t();
            ((C14385h0) this.f35519b).mo35413K(str);
            return this;
        }

        /* renamed from: B */
        public C14386a mo35415B(long j) {
            mo35329t();
            ((C14385h0) this.f35519b).mo35412J(j);
            return this;
        }

        /* renamed from: x */
        public C14386a mo35416x(long j) {
            mo35329t();
            ((C14385h0) this.f35519b).mo35411I(j);
            return this;
        }
    }

    static {
        C14385h0 h0Var = new C14385h0();
        f35579y = h0Var;
        C14359g4.m61822w(C14385h0.class, h0Var);
    }

    /* renamed from: L */
    public static C14386a m61950L() {
        return (C14386a) f35579y.mo35321z();
    }

    /* renamed from: I */
    public final void mo35411I(long j) {
        this.f35581e = j;
    }

    /* renamed from: J */
    public final void mo35412J(long j) {
        this.f35582f = j;
    }

    /* renamed from: K */
    public final void mo35413K(String str) {
        str.getClass();
        this.f35583g = str;
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14385h0();
            case 2:
                return new C14386a();
            case 3:
                return C14359g4.m61820u(f35579y, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002\u0010\u0003Ȉ", new Object[]{"unixTimestampMs_", "webviewId_", "event_"});
            case 4:
                return f35579y;
            case 5:
                C14311ee<C14385h0> eeVar = f35580z;
                if (eeVar == null) {
                    synchronized (C14385h0.class) {
                        eeVar = f35580z;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f35579y);
                            f35580z = eeVar;
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
