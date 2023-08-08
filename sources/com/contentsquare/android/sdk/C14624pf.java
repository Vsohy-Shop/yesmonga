package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.pf */
public final class C14624pf extends C14359g4<C14624pf, C14625a> implements C14748ta {

    /* renamed from: X */
    public static final C14624pf f36208X;

    /* renamed from: Y */
    public static volatile C14311ee<C14624pf> f36209Y = null;

    /* renamed from: w */
    public static final int f36210w = 1;

    /* renamed from: x */
    public static final int f36211x = 2;

    /* renamed from: y */
    public static final int f36212y = 3;

    /* renamed from: z */
    public static final int f36213z = 4;

    /* renamed from: e */
    public float f36214e;

    /* renamed from: f */
    public float f36215f;

    /* renamed from: g */
    public float f36216g;

    /* renamed from: v */
    public float f36217v;

    /* renamed from: com.contentsquare.android.sdk.pf$a */
    public static final class C14625a extends C14359g4.C14360a<C14624pf, C14625a> implements C14748ta {
        public C14625a() {
            super(C14624pf.f36208X);
        }
    }

    static {
        C14624pf pfVar = new C14624pf();
        f36208X = pfVar;
        C14359g4.m61822w(C14624pf.class, pfVar);
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14624pf();
            case 2:
                return new C14625a();
            case 3:
                return C14359g4.m61820u(f36208X, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0001", new Object[]{"offsetX_", "offsetY_", "opacity_", "radius_"});
            case 4:
                return f36208X;
            case 5:
                C14311ee<C14624pf> eeVar = f36209Y;
                if (eeVar == null) {
                    synchronized (C14624pf.class) {
                        eeVar = f36209Y;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f36208X);
                            f36209Y = eeVar;
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
