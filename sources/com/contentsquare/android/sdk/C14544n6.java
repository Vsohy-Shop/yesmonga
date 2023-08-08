package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.n6 */
public final class C14544n6 extends C14359g4<C14544n6, C14545a> implements C14748ta {

    /* renamed from: X */
    public static final C14544n6 f35995X;

    /* renamed from: Y */
    public static volatile C14311ee<C14544n6> f35996Y = null;

    /* renamed from: w */
    public static final int f35997w = 1;

    /* renamed from: x */
    public static final int f35998x = 2;

    /* renamed from: y */
    public static final int f35999y = 3;

    /* renamed from: z */
    public static final int f36000z = 4;

    /* renamed from: e */
    public long f36001e;

    /* renamed from: f */
    public long f36002f;

    /* renamed from: g */
    public long f36003g;

    /* renamed from: v */
    public int f36004v;

    /* renamed from: com.contentsquare.android.sdk.n6$a */
    public static final class C14545a extends C14359g4.C14360a<C14544n6, C14545a> implements C14748ta {
        public C14545a() {
            super(C14544n6.f35995X);
        }
    }

    static {
        C14544n6 n6Var = new C14544n6();
        f35995X = n6Var;
        C14359g4.m61822w(C14544n6.class, n6Var);
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14544n6();
            case 2:
                return new C14545a();
            case 3:
                return C14359g4.m61820u(f35995X, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0003\u0002\u0010\u0003\u0010\u0004\u000b", new Object[]{"unixTimestampMs_", "viewId_", "newParentViewId_", "indexInParent_"});
            case 4:
                return f35995X;
            case 5:
                C14311ee<C14544n6> eeVar = f35996Y;
                if (eeVar == null) {
                    synchronized (C14544n6.class) {
                        eeVar = f35996Y;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f35995X);
                            f35996Y = eeVar;
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
