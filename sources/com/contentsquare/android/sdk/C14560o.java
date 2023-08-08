package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.o */
public final class C14560o extends C14359g4<C14560o, C14561a> implements C14748ta {

    /* renamed from: E0 */
    public static final int f36030E0 = 5;

    /* renamed from: F0 */
    public static final int f36031F0 = 6;

    /* renamed from: G0 */
    public static final int f36032G0 = 7;

    /* renamed from: H0 */
    public static final C14560o f36033H0;

    /* renamed from: I0 */
    public static volatile C14311ee<C14560o> f36034I0 = null;

    /* renamed from: X */
    public static final int f36035X = 2;

    /* renamed from: Y */
    public static final int f36036Y = 3;

    /* renamed from: Z */
    public static final int f36037Z = 4;

    /* renamed from: z */
    public static final int f36038z = 1;

    /* renamed from: e */
    public String f36039e = "";

    /* renamed from: f */
    public String f36040f = "";

    /* renamed from: g */
    public float f36041g;

    /* renamed from: v */
    public String f36042v = "";

    /* renamed from: w */
    public int f36043w;

    /* renamed from: x */
    public int f36044x;

    /* renamed from: y */
    public String f36045y = "";

    /* renamed from: com.contentsquare.android.sdk.o$a */
    public static final class C14561a extends C14359g4.C14360a<C14560o, C14561a> implements C14748ta {
        public C14561a() {
            super(C14560o.f36033H0);
        }
    }

    static {
        C14560o oVar = new C14560o();
        f36033H0 = oVar;
        C14359g4.m61822w(C14560o.class, oVar);
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14560o();
            case 2:
                return new C14561a();
            case 3:
                return C14359g4.m61820u(f36033H0, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001\u0004Ȉ\u0005\f\u0006\u000b\u0007Ȉ", new Object[]{"fontFamily_", "font_", "size_", "colorHex_", "alignment_", "numberOfLines_", "text_"});
            case 4:
                return f36033H0;
            case 5:
                C14311ee<C14560o> eeVar = f36034I0;
                if (eeVar == null) {
                    synchronized (C14560o.class) {
                        eeVar = f36034I0;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f36033H0);
                            f36034I0 = eeVar;
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
