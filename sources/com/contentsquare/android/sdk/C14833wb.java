package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;
import com.contentsquare.android.sdk.C14566o3;
import java.util.Collections;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.wb */
public final class C14833wb extends C14359g4<C14833wb, C14834a> implements C14748ta {

    /* renamed from: X */
    public static final C14833wb f36785X;

    /* renamed from: Y */
    public static volatile C14311ee<C14833wb> f36786Y = null;

    /* renamed from: w */
    public static final int f36787w = 1;

    /* renamed from: x */
    public static final int f36788x = 2;

    /* renamed from: y */
    public static final int f36789y = 3;

    /* renamed from: z */
    public static final int f36790z = 4;

    /* renamed from: e */
    public int f36791e;

    /* renamed from: f */
    public long f36792f;

    /* renamed from: g */
    public C14348fg f36793g;

    /* renamed from: v */
    public C14566o3.C14575i<C14833wb> f36794v = C14359g4.m61814C();

    /* renamed from: com.contentsquare.android.sdk.wb$a */
    public static final class C14834a extends C14359g4.C14360a<C14833wb, C14834a> implements C14748ta {
        public C14834a() {
            super(C14833wb.f36785X);
        }

        /* renamed from: A */
        public C14834a mo36749A(C14835b bVar) {
            mo35329t();
            ((C14833wb) this.f35519b).mo36744J(bVar);
            return this;
        }

        /* renamed from: B */
        public C14834a mo36750B(C14833wb wbVar) {
            mo35329t();
            ((C14833wb) this.f35519b).mo36745K(wbVar);
            return this;
        }

        /* renamed from: C */
        public C14834a mo36751C(C14348fg fgVar) {
            mo35329t();
            ((C14833wb) this.f35519b).mo36746L(fgVar);
            return this;
        }

        /* renamed from: D */
        public List<C14833wb> mo36752D() {
            return Collections.unmodifiableList(((C14833wb) this.f35519b).mo36748N());
        }

        /* renamed from: x */
        public C14834a mo36753x(long j) {
            mo35329t();
            ((C14833wb) this.f35519b).mo36743I(j);
            return this;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.wb$b */
    public enum C14835b implements C14566o3.C14569c {
        FORMAT_UNSPECIFIED(0),
        FORMAT_WEB_ELEMENT(1),
        FORMAT_NATIVE_VIEW(2),
        FORMAT_WEB_VIEW_CONTAINER(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: g */
        public static final C14566o3.C14570d<C14835b> f36800g = null;

        /* renamed from: a */
        public final int f36802a;

        /* renamed from: com.contentsquare.android.sdk.wb$b$a */
        public class C14836a implements C14566o3.C14570d<C14835b> {
            /* renamed from: a */
            public C14835b mo35920b(int i) {
                return C14835b.m63929b(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            f36800g = new C14836a();
        }

        /* access modifiers changed from: public */
        C14835b(int i) {
            this.f36802a = i;
        }

        /* renamed from: b */
        public static C14835b m63929b(int i) {
            if (i == 0) {
                return FORMAT_UNSPECIFIED;
            }
            if (i == 1) {
                return FORMAT_WEB_ELEMENT;
            }
            if (i == 2) {
                return FORMAT_NATIVE_VIEW;
            }
            if (i != 3) {
                return null;
            }
            return FORMAT_WEB_VIEW_CONTAINER;
        }

        /* renamed from: a */
        public final int mo35918a() {
            if (this != UNRECOGNIZED) {
                return this.f36802a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C14833wb wbVar = new C14833wb();
        f36785X = wbVar;
        C14359g4.m61822w(C14833wb.class, wbVar);
    }

    /* renamed from: O */
    public static C14834a m63916O() {
        return (C14834a) f36785X.mo35321z();
    }

    /* renamed from: I */
    public final void mo36743I(long j) {
        this.f36792f = j;
    }

    /* renamed from: J */
    public final void mo36744J(C14835b bVar) {
        this.f36791e = bVar.mo35918a();
    }

    /* renamed from: K */
    public final void mo36745K(C14833wb wbVar) {
        wbVar.getClass();
        mo36747M();
        this.f36794v.add(wbVar);
    }

    /* renamed from: L */
    public final void mo36746L(C14348fg fgVar) {
        fgVar.getClass();
        this.f36793g = fgVar;
    }

    /* renamed from: M */
    public final void mo36747M() {
        C14566o3.C14575i<C14833wb> iVar = this.f36794v;
        if (!iVar.mo34822p()) {
            this.f36794v = C14359g4.m61819q(iVar);
        }
    }

    /* renamed from: N */
    public List<C14833wb> mo36748N() {
        return this.f36794v;
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14833wb();
            case 2:
                return new C14834a();
            case 3:
                return C14359g4.m61820u(f36785X, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002\u0010\u0003\t\u0004\u001b", new Object[]{"format_", "recordingId_", "style_", "children_", C14833wb.class});
            case 4:
                return f36785X;
            case 5:
                C14311ee<C14833wb> eeVar = f36786Y;
                if (eeVar == null) {
                    synchronized (C14833wb.class) {
                        eeVar = f36786Y;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f36785X);
                            f36786Y = eeVar;
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
