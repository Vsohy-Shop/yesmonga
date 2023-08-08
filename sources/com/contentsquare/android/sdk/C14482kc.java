package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;

/* renamed from: com.contentsquare.android.sdk.kc */
public final class C14482kc extends C14359g4<C14482kc, C14483a> implements C14748ta {

    /* renamed from: g */
    public static final int f35818g = 1;

    /* renamed from: v */
    public static final int f35819v = 2;

    /* renamed from: w */
    public static final C14482kc f35820w;

    /* renamed from: x */
    public static volatile C14311ee<C14482kc> f35821x;

    /* renamed from: e */
    public long f35822e;

    /* renamed from: f */
    public String f35823f = "";

    /* renamed from: com.contentsquare.android.sdk.kc$a */
    public static final class C14483a extends C14359g4.C14360a<C14482kc, C14483a> implements C14748ta {
        public C14483a() {
            super(C14482kc.f35820w);
        }
    }

    static {
        C14482kc kcVar = new C14482kc();
        f35820w = kcVar;
        C14359g4.m61822w(C14482kc.class, kcVar);
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14482kc();
            case 2:
                return new C14483a();
            case 3:
                return C14359g4.m61820u(f35820w, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002Ȉ", new Object[]{"unixTimestampMs_", "title_"});
            case 4:
                return f35820w;
            case 5:
                C14311ee<C14482kc> eeVar = f35821x;
                if (eeVar == null) {
                    synchronized (C14482kc.class) {
                        eeVar = f35821x;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f35820w);
                            f35821x = eeVar;
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
