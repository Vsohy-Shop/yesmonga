package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.e3 */
public final class C14291e3 extends C14359g4<C14291e3, C14292a> implements C14748ta {

    /* renamed from: g */
    public static final int f35289g = 1;

    /* renamed from: v */
    public static final int f35290v = 2;

    /* renamed from: w */
    public static final C14291e3 f35291w;

    /* renamed from: x */
    public static volatile C14311ee<C14291e3> f35292x;

    /* renamed from: e */
    public long f35293e;

    /* renamed from: f */
    public int f35294f;

    /* renamed from: com.contentsquare.android.sdk.e3$a */
    public static final class C14292a extends C14359g4.C14360a<C14291e3, C14292a> implements C14748ta {
        public C14292a() {
            super(C14291e3.f35291w);
        }
    }

    static {
        C14291e3 e3Var = new C14291e3();
        f35291w = e3Var;
        C14359g4.m61822w(C14291e3.class, e3Var);
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14291e3();
            case 2:
                return new C14292a();
            case 3:
                return C14359g4.m61820u(f35291w, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\f", new Object[]{"unixTimestampMs_", "stateTransition_"});
            case 4:
                return f35291w;
            case 5:
                C14311ee<C14291e3> eeVar = f35292x;
                if (eeVar == null) {
                    synchronized (C14291e3.class) {
                        eeVar = f35292x;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f35291w);
                            f35292x = eeVar;
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
