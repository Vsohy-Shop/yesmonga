package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.z0 */
public final class C14913z0 extends C14359g4<C14913z0, C14914a> implements C14748ta {

    /* renamed from: v */
    public static final int f36975v = 1;

    /* renamed from: w */
    public static final int f36976w = 2;

    /* renamed from: x */
    public static final int f36977x = 3;

    /* renamed from: y */
    public static final C14913z0 f36978y;

    /* renamed from: z */
    public static volatile C14311ee<C14913z0> f36979z;

    /* renamed from: e */
    public long f36980e;

    /* renamed from: f */
    public int f36981f;

    /* renamed from: g */
    public int f36982g;

    /* renamed from: com.contentsquare.android.sdk.z0$a */
    public static final class C14914a extends C14359g4.C14360a<C14913z0, C14914a> implements C14748ta {
        public C14914a() {
            super(C14913z0.f36978y);
        }
    }

    static {
        C14913z0 z0Var = new C14913z0();
        f36978y = z0Var;
        C14359g4.m61822w(C14913z0.class, z0Var);
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14913z0();
            case 2:
                return new C14914a();
            case 3:
                return C14359g4.m61820u(f36978y, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002\u000b\u0003\u000b", new Object[]{"unixTimestampMs_", "width_", "height_"});
            case 4:
                return f36978y;
            case 5:
                C14311ee<C14913z0> eeVar = f36979z;
                if (eeVar == null) {
                    synchronized (C14913z0.class) {
                        eeVar = f36979z;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f36978y);
                            f36979z = eeVar;
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
