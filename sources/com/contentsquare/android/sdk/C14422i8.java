package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;
import com.contentsquare.android.sdk.C14566o3;

/* renamed from: com.contentsquare.android.sdk.i8 */
public final class C14422i8 extends C14359g4<C14422i8, C14423a> implements C14748ta {

    /* renamed from: f */
    public static final int f35646f = 1;

    /* renamed from: g */
    public static final C14422i8 f35647g;

    /* renamed from: v */
    public static volatile C14311ee<C14422i8> f35648v;

    /* renamed from: e */
    public C14566o3.C14575i<String> f35649e = C14359g4.m61814C();

    /* renamed from: com.contentsquare.android.sdk.i8$a */
    public static final class C14423a extends C14359g4.C14360a<C14422i8, C14423a> implements C14748ta {
        public C14423a() {
            super(C14422i8.f35647g);
        }
    }

    static {
        C14422i8 i8Var = new C14422i8();
        f35647g = i8Var;
        C14359g4.m61822w(C14422i8.class, i8Var);
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14422i8();
            case 2:
                return new C14423a();
            case 3:
                return C14359g4.m61820u(f35647g, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"urls_"});
            case 4:
                return f35647g;
            case 5:
                C14311ee<C14422i8> eeVar = f35648v;
                if (eeVar == null) {
                    synchronized (C14422i8.class) {
                        eeVar = f35648v;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f35647g);
                            f35648v = eeVar;
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
