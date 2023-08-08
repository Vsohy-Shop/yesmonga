package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.w5 */
public final class C14815w5 extends C14359g4<C14815w5, C14816a> implements C14748ta {

    /* renamed from: X */
    public static final int f36719X = 4;

    /* renamed from: Y */
    public static final C14815w5 f36720Y;

    /* renamed from: Z */
    public static volatile C14311ee<C14815w5> f36721Z = null;

    /* renamed from: x */
    public static final int f36722x = 1;

    /* renamed from: y */
    public static final int f36723y = 2;

    /* renamed from: z */
    public static final int f36724z = 3;

    /* renamed from: e */
    public int f36725e;

    /* renamed from: f */
    public long f36726f;

    /* renamed from: g */
    public long f36727g;

    /* renamed from: v */
    public int f36728v;

    /* renamed from: w */
    public C14833wb f36729w;

    /* renamed from: com.contentsquare.android.sdk.w5$a */
    public static final class C14816a extends C14359g4.C14360a<C14815w5, C14816a> implements C14748ta {
        public C14816a() {
            super(C14815w5.f36720Y);
        }

        /* renamed from: A */
        public C14816a mo36679A(long j) {
            mo35329t();
            ((C14815w5) this.f35519b).mo36675I(j);
            return this;
        }

        /* renamed from: B */
        public C14816a mo36680B(C14833wb wbVar) {
            mo35329t();
            ((C14815w5) this.f35519b).mo36676J(wbVar);
            return this;
        }

        /* renamed from: C */
        public C14816a mo36681C(long j) {
            mo35329t();
            ((C14815w5) this.f35519b).mo36678L(j);
            return this;
        }

        /* renamed from: x */
        public C14816a mo36682x(int i) {
            mo35329t();
            ((C14815w5) this.f35519b).mo36677K(i);
            return this;
        }
    }

    static {
        C14815w5 w5Var = new C14815w5();
        f36720Y = w5Var;
        C14359g4.m61822w(C14815w5.class, w5Var);
    }

    /* renamed from: M */
    public static C14816a m63836M() {
        return (C14816a) f36720Y.mo35321z();
    }

    /* renamed from: I */
    public final void mo36675I(long j) {
        this.f36725e |= 1;
        this.f36727g = j;
    }

    /* renamed from: J */
    public final void mo36676J(C14833wb wbVar) {
        wbVar.getClass();
        this.f36729w = wbVar;
    }

    /* renamed from: K */
    public final void mo36677K(int i) {
        this.f36725e |= 2;
        this.f36728v = i;
    }

    /* renamed from: L */
    public final void mo36678L(long j) {
        this.f36726f = j;
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14815w5();
            case 2:
                return new C14816a();
            case 3:
                return C14359g4.m61820u(f36720Y, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0003\u0002တ\u0000\u0003ဋ\u0001\u0004\t", new Object[]{"bitField0_", "unixTimestampMs_", "parentViewId_", "indexInParent_", "view_"});
            case 4:
                return f36720Y;
            case 5:
                C14311ee<C14815w5> eeVar = f36721Z;
                if (eeVar == null) {
                    synchronized (C14815w5.class) {
                        eeVar = f36721Z;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f36720Y);
                            f36721Z = eeVar;
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
