package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.ya */
public final class C14891ya extends C14359g4<C14891ya, C14892a> implements C14748ta {

    /* renamed from: g */
    public static final int f36941g = 1;

    /* renamed from: v */
    public static final int f36942v = 2;

    /* renamed from: w */
    public static final C14891ya f36943w;

    /* renamed from: x */
    public static volatile C14311ee<C14891ya> f36944x;

    /* renamed from: e */
    public long f36945e;

    /* renamed from: f */
    public int f36946f;

    /* renamed from: com.contentsquare.android.sdk.ya$a */
    public static final class C14892a extends C14359g4.C14360a<C14891ya, C14892a> implements C14748ta {
        public C14892a() {
            super(C14891ya.f36943w);
        }
    }

    static {
        C14891ya yaVar = new C14891ya();
        f36943w = yaVar;
        C14359g4.m61822w(C14891ya.class, yaVar);
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14891ya();
            case 2:
                return new C14892a();
            case 3:
                return C14359g4.m61820u(f36943w, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\f", new Object[]{"unixTimestampMs_", "stopReason_"});
            case 4:
                return f36943w;
            case 5:
                C14311ee<C14891ya> eeVar = f36944x;
                if (eeVar == null) {
                    synchronized (C14891ya.class) {
                        eeVar = f36944x;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f36943w);
                            f36944x = eeVar;
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
