package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;
import com.contentsquare.android.sdk.C14566o3;

/* renamed from: com.contentsquare.android.sdk.qb */
public final class C14649qb extends C14359g4<C14649qb, C14650a> implements C14748ta {

    /* renamed from: v */
    public static final int f36287v = 1;

    /* renamed from: w */
    public static final int f36288w = 2;

    /* renamed from: x */
    public static final int f36289x = 3;

    /* renamed from: y */
    public static final C14649qb f36290y;

    /* renamed from: z */
    public static volatile C14311ee<C14649qb> f36291z;

    /* renamed from: e */
    public long f36292e;

    /* renamed from: f */
    public int f36293f;

    /* renamed from: g */
    public boolean f36294g;

    /* renamed from: com.contentsquare.android.sdk.qb$a */
    public static final class C14650a extends C14359g4.C14360a<C14649qb, C14650a> implements C14748ta {
        public C14650a() {
            super(C14649qb.f36290y);
        }

        /* renamed from: A */
        public C14650a mo36256A(C14651b bVar) {
            mo35329t();
            ((C14649qb) this.f35519b).mo36254J(bVar);
            return this;
        }

        /* renamed from: B */
        public C14650a mo36257B(boolean z) {
            mo35329t();
            ((C14649qb) this.f35519b).mo36255K(z);
            return this;
        }

        /* renamed from: x */
        public C14650a mo36258x(long j) {
            mo35329t();
            ((C14649qb) this.f35519b).mo36253I(j);
            return this;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.qb$b */
    public enum C14651b implements C14566o3.C14569c {
        START_REASON_UNSPECIFIED(0),
        START_REASON_REGULAR(1),
        START_REASON_FORCED(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: f */
        public static final C14566o3.C14570d<C14651b> f36299f = null;

        /* renamed from: a */
        public final int f36301a;

        /* renamed from: com.contentsquare.android.sdk.qb$b$a */
        public class C14652a implements C14566o3.C14570d<C14651b> {
            /* renamed from: a */
            public C14651b mo35920b(int i) {
                return C14651b.m63200b(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            f36299f = new C14652a();
        }

        /* access modifiers changed from: public */
        C14651b(int i) {
            this.f36301a = i;
        }

        /* renamed from: b */
        public static C14651b m63200b(int i) {
            if (i == 0) {
                return START_REASON_UNSPECIFIED;
            }
            if (i == 1) {
                return START_REASON_REGULAR;
            }
            if (i != 2) {
                return null;
            }
            return START_REASON_FORCED;
        }

        /* renamed from: a */
        public final int mo35918a() {
            if (this != UNRECOGNIZED) {
                return this.f36301a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C14649qb qbVar = new C14649qb();
        f36290y = qbVar;
        C14359g4.m61822w(C14649qb.class, qbVar);
    }

    /* renamed from: L */
    public static C14650a m63192L() {
        return (C14650a) f36290y.mo35321z();
    }

    /* renamed from: I */
    public final void mo36253I(long j) {
        this.f36292e = j;
    }

    /* renamed from: J */
    public final void mo36254J(C14651b bVar) {
        this.f36293f = bVar.mo35918a();
    }

    /* renamed from: K */
    public final void mo36255K(boolean z) {
        this.f36294g = z;
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14649qb();
            case 2:
                return new C14650a();
            case 3:
                return C14359g4.m61820u(f36290y, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002\f\u0003\u0007", new Object[]{"unixTimestampMs_", "startReason_", "isNewSession_"});
            case 4:
                return f36290y;
            case 5:
                C14311ee<C14649qb> eeVar = f36291z;
                if (eeVar == null) {
                    synchronized (C14649qb.class) {
                        eeVar = f36291z;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f36290y);
                            f36291z = eeVar;
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
