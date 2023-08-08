package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.cd */
public final class C14256cd extends C14359g4<C14256cd, C14257a> implements C14748ta {

    /* renamed from: v */
    public static final int f35211v = 1;

    /* renamed from: w */
    public static final int f35212w = 2;

    /* renamed from: x */
    public static final int f35213x = 3;

    /* renamed from: y */
    public static final C14256cd f35214y;

    /* renamed from: z */
    public static volatile C14311ee<C14256cd> f35215z;

    /* renamed from: e */
    public long f35216e;

    /* renamed from: f */
    public long f35217f;

    /* renamed from: g */
    public C14348fg f35218g;

    /* renamed from: com.contentsquare.android.sdk.cd$a */
    public static final class C14257a extends C14359g4.C14360a<C14256cd, C14257a> implements C14748ta {
        public C14257a() {
            super(C14256cd.f35214y);
        }

        /* renamed from: A */
        public C14257a mo34885A(C14348fg fgVar) {
            mo35329t();
            ((C14256cd) this.f35519b).mo34883J(fgVar);
            return this;
        }

        /* renamed from: B */
        public C14257a mo34886B(long j) {
            mo35329t();
            ((C14256cd) this.f35519b).mo34884K(j);
            return this;
        }

        /* renamed from: x */
        public C14257a mo34887x(long j) {
            mo35329t();
            ((C14256cd) this.f35519b).mo34882I(j);
            return this;
        }
    }

    static {
        C14256cd cdVar = new C14256cd();
        f35214y = cdVar;
        C14359g4.m61822w(C14256cd.class, cdVar);
    }

    /* renamed from: L */
    public static C14257a m61344L() {
        return (C14257a) f35214y.mo35321z();
    }

    /* renamed from: I */
    public final void mo34882I(long j) {
        this.f35216e = j;
    }

    /* renamed from: J */
    public final void mo34883J(C14348fg fgVar) {
        fgVar.getClass();
        this.f35218g = fgVar;
    }

    /* renamed from: K */
    public final void mo34884K(long j) {
        this.f35217f = j;
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14256cd();
            case 2:
                return new C14257a();
            case 3:
                return C14359g4.m61820u(f35214y, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002\u0010\u0003\t", new Object[]{"unixTimestampMs_", "viewId_", "styleChanges_"});
            case 4:
                return f35214y;
            case 5:
                C14311ee<C14256cd> eeVar = f35215z;
                if (eeVar == null) {
                    synchronized (C14256cd.class) {
                        eeVar = f35215z;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f35214y);
                            f35215z = eeVar;
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
