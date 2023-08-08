package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s1 */
public final class C18859s1 implements C18914y2 {

    /* renamed from: b */
    public static final C18913y1 f48003b = new C18860a();

    /* renamed from: a */
    public final C18913y1 f48004a;

    /* renamed from: androidx.datastore.preferences.protobuf.s1$a */
    public static class C18860a implements C18913y1 {
        /* renamed from: a */
        public C18904x1 mo54429a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public boolean mo54430b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s1$b */
    public static class C18861b implements C18913y1 {

        /* renamed from: a */
        public C18913y1[] f48005a;

        public C18861b(C18913y1... y1VarArr) {
            this.f48005a = y1VarArr;
        }

        /* renamed from: a */
        public C18904x1 mo54429a(Class<?> cls) {
            for (C18913y1 y1Var : this.f48005a) {
                if (y1Var.mo54430b(cls)) {
                    return y1Var.mo54429a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        /* renamed from: b */
        public boolean mo54430b(Class<?> cls) {
            for (C18913y1 b : this.f48005a) {
                if (b.mo54430b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C18859s1() {
        this(m87409b());
    }

    /* renamed from: b */
    public static C18913y1 m87409b() {
        return new C18861b(C18699c1.m85644c(), m87410c());
    }

    /* renamed from: c */
    public static C18913y1 m87410c() {
        try {
            return (C18913y1) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f48003b;
        }
    }

    /* renamed from: d */
    public static boolean m87411d(C18904x1 x1Var) {
        return x1Var.getSyntax() == ProtoSyntax.PROTO2;
    }

    /* renamed from: e */
    public static <T> C18905x2<T> m87412e(Class<T> cls, C18904x1 x1Var) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (m87411d(x1Var)) {
                return C18700c2.m85653S(cls, x1Var, C18798l2.m86544b(), C18827o1.m87086b(), C18922z2.m88294S(), C18858s0.m87407b(), C18898w1.m87904b());
            }
            return C18700c2.m85653S(cls, x1Var, C18798l2.m86544b(), C18827o1.m87086b(), C18922z2.m88294S(), (C18844q0<?>) null, C18898w1.m87904b());
        } else if (m87411d(x1Var)) {
            return C18700c2.m85653S(cls, x1Var, C18798l2.m86543a(), C18827o1.m87085a(), C18922z2.m88286K(), C18858s0.m87406a(), C18898w1.m87903a());
        } else {
            return C18700c2.m85653S(cls, x1Var, C18798l2.m86543a(), C18827o1.m87085a(), C18922z2.m88287L(), (C18844q0<?>) null, C18898w1.m87903a());
        }
    }

    /* renamed from: a */
    public <T> C18905x2<T> mo55381a(Class<T> cls) {
        C18922z2.m88288M(cls);
        C18904x1 a = this.f48004a.mo54429a(cls);
        if (!a.mo54861a()) {
            return m87412e(cls, a);
        }
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return C18710d2.m85782m(C18922z2.m88294S(), C18858s0.m87407b(), a.mo54862b());
        }
        return C18710d2.m85782m(C18922z2.m88286K(), C18858s0.m87406a(), a.mo54862b());
    }

    public C18859s1(C18913y1 y1Var) {
        this.f48004a = (C18913y1) C18753i1.m86341e(y1Var, "messageInfoFactory");
    }
}
