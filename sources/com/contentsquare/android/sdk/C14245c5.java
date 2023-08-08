package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;
import com.contentsquare.android.sdk.C14566o3;
import java.util.Collections;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.c5 */
public final class C14245c5 extends C14359g4<C14245c5, C14246a> implements C14748ta {

    /* renamed from: X */
    public static volatile C14311ee<C14245c5> f35184X = null;

    /* renamed from: w */
    public static final int f35185w = 1;

    /* renamed from: x */
    public static final int f35186x = 2;

    /* renamed from: y */
    public static final int f35187y = 3;

    /* renamed from: z */
    public static final C14245c5 f35188z;

    /* renamed from: e */
    public int f35189e;

    /* renamed from: f */
    public String f35190f = "";

    /* renamed from: g */
    public C14566o3.C14575i<C14518m4> f35191g = C14359g4.m61814C();

    /* renamed from: v */
    public int f35192v;

    /* renamed from: com.contentsquare.android.sdk.c5$a */
    public static final class C14246a extends C14359g4.C14360a<C14245c5, C14246a> implements C14748ta {
        public C14246a() {
            super(C14245c5.f35188z);
        }

        /* renamed from: A */
        public C14246a mo34834A(String str) {
            mo35329t();
            ((C14245c5) this.f35519b).mo34830J(str);
            return this;
        }

        /* renamed from: B */
        public List<C14518m4> mo34835B() {
            return Collections.unmodifiableList(((C14245c5) this.f35519b).mo34832L());
        }

        /* renamed from: x */
        public C14246a mo34836x(C14518m4 m4Var) {
            mo35329t();
            ((C14245c5) this.f35519b).mo34829I(m4Var);
            return this;
        }
    }

    static {
        C14245c5 c5Var = new C14245c5();
        f35188z = c5Var;
        C14359g4.m61822w(C14245c5.class, c5Var);
    }

    /* renamed from: M */
    public static C14246a m61282M() {
        return (C14246a) f35188z.mo35321z();
    }

    /* renamed from: I */
    public final void mo34829I(C14518m4 m4Var) {
        m4Var.getClass();
        mo34831K();
        this.f35191g.add(m4Var);
    }

    /* renamed from: J */
    public final void mo34830J(String str) {
        str.getClass();
        this.f35190f = str;
    }

    /* renamed from: K */
    public final void mo34831K() {
        C14566o3.C14575i<C14518m4> iVar = this.f35191g;
        if (!iVar.mo34822p()) {
            this.f35191g = C14359g4.m61819q(iVar);
        }
    }

    /* renamed from: L */
    public List<C14518m4> mo34832L() {
        return this.f35191g;
    }

    /* renamed from: t */
    public final Object mo34833t(C14359g4.C14365f fVar, Object obj, Object obj2) {
        switch (C14540n2.f35986a[fVar.ordinal()]) {
            case 1:
                return new C14245c5();
            case 2:
                return new C14246a();
            case 3:
                return C14359g4.m61820u(f35188z, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဌ\u0000", new Object[]{"bitField0_", "schemaVersion_", "events_", C14518m4.class, "position_"});
            case 4:
                return f35188z;
            case 5:
                C14311ee<C14245c5> eeVar = f35184X;
                if (eeVar == null) {
                    synchronized (C14245c5.class) {
                        eeVar = f35184X;
                        if (eeVar == null) {
                            eeVar = new C14359g4.C14361b<>(f35188z);
                            f35184X = eeVar;
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
