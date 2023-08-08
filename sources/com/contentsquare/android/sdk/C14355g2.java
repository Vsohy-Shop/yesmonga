package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.g2 */
public final class C14355g2 implements C14178a9 {

    /* renamed from: b */
    public static final C14478k9 f35511b = new C14356a();

    /* renamed from: a */
    public final C14478k9 f35512a;

    /* renamed from: com.contentsquare.android.sdk.g2$a */
    public static class C14356a implements C14478k9 {
        /* renamed from: a */
        public boolean mo35307a(Class<?> cls) {
            return false;
        }

        /* renamed from: b */
        public C14700s8 mo35308b(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* renamed from: com.contentsquare.android.sdk.g2$b */
    public static class C14357b implements C14478k9 {

        /* renamed from: a */
        public C14478k9[] f35513a;

        public C14357b(C14478k9... k9VarArr) {
            this.f35513a = k9VarArr;
        }

        /* renamed from: a */
        public boolean mo35307a(Class<?> cls) {
            for (C14478k9 a : this.f35513a) {
                if (a.mo35307a(cls)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public C14700s8 mo35308b(Class<?> cls) {
            for (C14478k9 k9Var : this.f35513a) {
                if (k9Var.mo35307a(cls)) {
                    return k9Var.mo35308b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public C14355g2() {
        this(m61799c());
    }

    /* renamed from: b */
    public static <T> C14398h8<T> m61798b(Class<T> cls, C14700s8 s8Var) {
        if (C14359g4.class.isAssignableFrom(cls)) {
            if (m61800d(s8Var)) {
                return C14344fc.m61667o(cls, s8Var, C14741t8.m63555b(), C14503ld.m62497d(), C14646q9.m63127K(), C14791v4.m63757b(), C14610p5.m62925b());
            }
            return C14344fc.m61667o(cls, s8Var, C14741t8.m63555b(), C14503ld.m62497d(), C14646q9.m63127K(), (C14517m3<?>) null, C14610p5.m62925b());
        } else if (m61800d(s8Var)) {
            return C14344fc.m61667o(cls, s8Var, C14741t8.m63554a(), C14503ld.m62496a(), C14646q9.m63119C(), C14791v4.m63756a(), C14610p5.m62924a());
        } else {
            return C14344fc.m61667o(cls, s8Var, C14741t8.m63554a(), C14503ld.m62496a(), C14646q9.m63123G(), (C14517m3<?>) null, C14610p5.m62924a());
        }
    }

    /* renamed from: c */
    public static C14478k9 m61799c() {
        return new C14357b(C14812w2.m63830c(), m61801e());
    }

    /* renamed from: d */
    public static boolean m61800d(C14700s8 s8Var) {
        return s8Var.mo34491b() == C14773u8.PROTO2;
    }

    /* renamed from: e */
    public static C14478k9 m61801e() {
        try {
            return (C14478k9) Class.forName("com.contentsquare.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f35511b;
        }
    }

    /* renamed from: a */
    public <T> C14398h8<T> mo34525a(Class<T> cls) {
        C14436j0<?, ?> C;
        C14517m3<?> a;
        C14646q9.m63164q(cls);
        C14700s8 b = this.f35512a.mo35308b(cls);
        if (!b.mo34492c()) {
            return m61798b(cls, b);
        }
        if (C14359g4.class.isAssignableFrom(cls)) {
            C = C14646q9.m63127K();
            a = C14791v4.m63757b();
        } else {
            C = C14646q9.m63119C();
            a = C14791v4.m63756a();
        }
        return C14860xc.m64015k(C, a, b.mo34490a());
    }

    public C14355g2(C14478k9 k9Var) {
        this.f35512a = (C14478k9) C14566o3.m62806h(k9Var, "messageInfoFactory");
    }
}
