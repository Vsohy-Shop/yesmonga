package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.v3 */
public final class C14789v3 extends C14359g4<C14789v3, C14790a> implements C14748ta {

    /* renamed from: f */
    public static final int f36673f = 1;

    /* renamed from: g */
    public static final C14789v3 f36674g;

    /* renamed from: v */
    public static volatile C14311ee<C14789v3> f36675v;

    /* renamed from: e */
    public long f36676e;

    /* renamed from: com.contentsquare.android.sdk.v3$a */
    public static final class C14790a extends C14359g4.C14360a<C14789v3, C14790a> implements C14748ta {
        public C14790a() {
            super(C14789v3.f36674g);
        }
    }

    static {
        C14789v3 v3Var = new C14789v3();
        f36674g = v3Var;
        C14359g4.m61822w(C14789v3.class, v3Var);
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14789v3();
            case 2:
                return new C14790a();
            case 3:
                return C14359g4.m61820u(f36674g, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"unixTimestampMs_"});
            case 4:
                return f36674g;
            case 5:
                C14311ee<C14789v3> eeVar = f36675v;
                if (eeVar == null) {
                    synchronized (C14789v3.class) {
                        eeVar = f36675v;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f36674g);
                            f36675v = eeVar;
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
