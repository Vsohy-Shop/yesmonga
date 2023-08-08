package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;
import com.contentsquare.android.sdk.C14566o3;
import java.util.Collections;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.sd */
public final class C14707sd extends C14359g4<C14707sd, C14708a> implements C14748ta {

    /* renamed from: X */
    public static final int f36392X = 3;

    /* renamed from: Y */
    public static final C14707sd f36393Y;

    /* renamed from: Z */
    public static volatile C14311ee<C14707sd> f36394Z = null;

    /* renamed from: y */
    public static final int f36395y = 1;

    /* renamed from: z */
    public static final int f36396z = 2;

    /* renamed from: e */
    public C14566o3.C14574h f36397e = C14359g4.m61813B();

    /* renamed from: f */
    public int f36398f = -1;

    /* renamed from: g */
    public C14566o3.C14573g f36399g = C14359g4.m61812A();

    /* renamed from: v */
    public int f36400v = -1;

    /* renamed from: w */
    public C14566o3.C14573g f36401w = C14359g4.m61812A();

    /* renamed from: x */
    public int f36402x = -1;

    /* renamed from: com.contentsquare.android.sdk.sd$a */
    public static final class C14708a extends C14359g4.C14360a<C14707sd, C14708a> implements C14748ta {
        public C14708a() {
            super(C14707sd.f36393Y);
        }

        /* renamed from: A */
        public C14708a mo36409A(Iterable<? extends Integer> iterable) {
            mo35329t();
            ((C14707sd) this.f35519b).mo36402L(iterable);
            return this;
        }

        /* renamed from: B */
        public C14708a mo36410B(Iterable<? extends Integer> iterable) {
            mo35329t();
            ((C14707sd) this.f35519b).mo36403M(iterable);
            return this;
        }

        /* renamed from: C */
        public List<Long> mo36411C() {
            return Collections.unmodifiableList(((C14707sd) this.f35519b).mo36407Q());
        }

        /* renamed from: D */
        public List<Integer> mo36412D() {
            return Collections.unmodifiableList(((C14707sd) this.f35519b).mo36408R());
        }

        /* renamed from: E */
        public List<Integer> mo36413E() {
            return Collections.unmodifiableList(((C14707sd) this.f35519b).mo36400I());
        }

        /* renamed from: x */
        public C14708a mo36414x(Iterable<? extends Long> iterable) {
            mo35329t();
            ((C14707sd) this.f35519b).mo36401K(iterable);
            return this;
        }
    }

    static {
        C14707sd sdVar = new C14707sd();
        f36393Y = sdVar;
        C14359g4.m61822w(C14707sd.class, sdVar);
    }

    /* renamed from: J */
    public static C14708a m63406J() {
        return (C14708a) f36393Y.mo35321z();
    }

    /* renamed from: I */
    public List<Integer> mo36400I() {
        return this.f36401w;
    }

    /* renamed from: K */
    public final void mo36401K(Iterable<? extends Long> iterable) {
        mo36404N();
        C14288e1.m61432f(iterable, this.f36397e);
    }

    /* renamed from: L */
    public final void mo36402L(Iterable<? extends Integer> iterable) {
        mo36405O();
        C14288e1.m61432f(iterable, this.f36399g);
    }

    /* renamed from: M */
    public final void mo36403M(Iterable<? extends Integer> iterable) {
        mo36406P();
        C14288e1.m61432f(iterable, this.f36401w);
    }

    /* renamed from: N */
    public final void mo36404N() {
        C14566o3.C14574h hVar = this.f36397e;
        if (!hVar.mo34822p()) {
            this.f36397e = C14359g4.m61818o(hVar);
        }
    }

    /* renamed from: O */
    public final void mo36405O() {
        C14566o3.C14573g gVar = this.f36399g;
        if (!gVar.mo34822p()) {
            this.f36399g = C14359g4.m61817n(gVar);
        }
    }

    /* renamed from: P */
    public final void mo36406P() {
        C14566o3.C14573g gVar = this.f36401w;
        if (!gVar.mo34822p()) {
            this.f36401w = C14359g4.m61817n(gVar);
        }
    }

    /* renamed from: Q */
    public List<Long> mo36407Q() {
        return this.f36397e;
    }

    /* renamed from: R */
    public List<Integer> mo36408R() {
        return this.f36399g;
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14707sd();
            case 2:
                return new C14708a();
            case 3:
                return C14359g4.m61820u(f36393Y, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001&\u0002/\u0003/", new Object[]{"unixTimestampsMs_", "xPositions_", "yPositions_"});
            case 4:
                return f36393Y;
            case 5:
                C14311ee<C14707sd> eeVar = f36394Z;
                if (eeVar == null) {
                    synchronized (C14707sd.class) {
                        eeVar = f36394Z;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f36393Y);
                            f36394Z = eeVar;
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
