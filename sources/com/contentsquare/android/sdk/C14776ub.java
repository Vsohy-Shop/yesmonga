package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.ub */
public final class C14776ub extends C14359g4<C14776ub, C14777a> implements C14748ta {

    /* renamed from: g */
    public static final int f36625g = 1;

    /* renamed from: v */
    public static final int f36626v = 2;

    /* renamed from: w */
    public static final C14776ub f36627w;

    /* renamed from: x */
    public static volatile C14311ee<C14776ub> f36628x;

    /* renamed from: e */
    public long f36629e;

    /* renamed from: f */
    public long f36630f;

    /* renamed from: com.contentsquare.android.sdk.ub$a */
    public static final class C14777a extends C14359g4.C14360a<C14776ub, C14777a> implements C14748ta {
        public C14777a() {
            super(C14776ub.f36627w);
        }

        /* renamed from: A */
        public C14777a mo36569A(long j) {
            mo35329t();
            ((C14776ub) this.f35519b).mo36568J(j);
            return this;
        }

        /* renamed from: x */
        public C14777a mo36570x(long j) {
            mo35329t();
            ((C14776ub) this.f35519b).mo36567I(j);
            return this;
        }
    }

    static {
        C14776ub ubVar = new C14776ub();
        f36627w = ubVar;
        C14359g4.m61822w(C14776ub.class, ubVar);
    }

    /* renamed from: K */
    public static C14777a m63636K() {
        return (C14777a) f36627w.mo35321z();
    }

    /* renamed from: I */
    public final void mo36567I(long j) {
        this.f36629e = j;
    }

    /* renamed from: J */
    public final void mo36568J(long j) {
        this.f36630f = j;
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14776ub();
            case 2:
                return new C14777a();
            case 3:
                return C14359g4.m61820u(f36627w, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\u0010", new Object[]{"unixTimestampMs_", "viewId_"});
            case 4:
                return f36627w;
            case 5:
                C14311ee<C14776ub> eeVar = f36628x;
                if (eeVar == null) {
                    synchronized (C14776ub.class) {
                        eeVar = f36628x;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f36627w);
                            f36628x = eeVar;
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
