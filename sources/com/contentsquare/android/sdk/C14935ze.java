package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.ze */
public final class C14935ze extends C14359g4<C14935ze, C14936a> implements C14748ta {

    /* renamed from: g */
    public static final int f37019g = 1;

    /* renamed from: v */
    public static final int f37020v = 2;

    /* renamed from: w */
    public static final C14935ze f37021w;

    /* renamed from: x */
    public static volatile C14311ee<C14935ze> f37022x;

    /* renamed from: e */
    public String f37023e = "";

    /* renamed from: f */
    public int f37024f;

    /* renamed from: com.contentsquare.android.sdk.ze$a */
    public static final class C14936a extends C14359g4.C14360a<C14935ze, C14936a> implements C14748ta {
        public C14936a() {
            super(C14935ze.f37021w);
        }
    }

    static {
        C14935ze zeVar = new C14935ze();
        f37021w = zeVar;
        C14359g4.m61822w(C14935ze.class, zeVar);
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14935ze();
            case 2:
                return new C14936a();
            case 3:
                return C14359g4.m61820u(f37021w, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u000b", new Object[]{"content_", "numberOfLines_"});
            case 4:
                return f37021w;
            case 5:
                C14311ee<C14935ze> eeVar = f37022x;
                if (eeVar == null) {
                    synchronized (C14935ze.class) {
                        eeVar = f37022x;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f37021w);
                            f37022x = eeVar;
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
