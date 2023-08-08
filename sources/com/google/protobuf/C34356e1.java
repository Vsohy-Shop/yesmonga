package com.google.protobuf;

/* renamed from: com.google.protobuf.e1 */
public final class C34356e1 implements C34376h2 {

    /* renamed from: b */
    public static final C34403k1 f83253b = new C34357a();

    /* renamed from: a */
    public final C34403k1 f83254a;

    /* renamed from: com.google.protobuf.e1$a */
    public static class C34357a implements C34403k1 {
        /* renamed from: a */
        public C34386j1 mo101039a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public boolean mo101040b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.e1$b */
    public static class C34358b implements C34403k1 {

        /* renamed from: a */
        public C34403k1[] f83255a;

        public C34358b(C34403k1... k1VarArr) {
            this.f83255a = k1VarArr;
        }

        /* renamed from: a */
        public C34386j1 mo101039a(Class<?> cls) {
            for (C34403k1 k1Var : this.f83255a) {
                if (k1Var.mo101040b(cls)) {
                    return k1Var.mo101039a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        /* renamed from: b */
        public boolean mo101040b(Class<?> cls) {
            for (C34403k1 b : this.f83255a) {
                if (b.mo101040b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C34356e1() {
        this(m139165b());
    }

    /* renamed from: b */
    public static C34403k1 m139165b() {
        return new C34358b(C34445r0.m140141c(), m139166c());
    }

    /* renamed from: c */
    public static C34403k1 m139166c() {
        try {
            return (C34403k1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f83253b;
        }
    }

    /* renamed from: d */
    public static boolean m139167d(C34386j1 j1Var) {
        return j1Var.getSyntax() == ProtoSyntax.PROTO2;
    }

    /* renamed from: e */
    public static <T> C34372g2<T> m139168e(Class<T> cls, C34386j1 j1Var) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (m139167d(j1Var)) {
                return C34429o1.m140005S(cls, j1Var, C34489v1.m140627b(), C34331b1.m138913b(), C34381i2.m139330S(), C34385j0.m139431b(), C34380i1.m139304b());
            }
            return C34429o1.m140005S(cls, j1Var, C34489v1.m140627b(), C34331b1.m138913b(), C34381i2.m139330S(), (C34374h0<?>) null, C34380i1.m139304b());
        } else if (m139167d(j1Var)) {
            return C34429o1.m140005S(cls, j1Var, C34489v1.m140626a(), C34331b1.m138912a(), C34381i2.m139322K(), C34385j0.m139430a(), C34380i1.m139303a());
        } else {
            return C34429o1.m140005S(cls, j1Var, C34489v1.m140626a(), C34331b1.m138912a(), C34381i2.m139323L(), (C34374h0<?>) null, C34380i1.m139303a());
        }
    }

    /* renamed from: a */
    public <T> C34372g2<T> mo101038a(Class<T> cls) {
        C34381i2.m139324M(cls);
        C34386j1 a = this.f83254a.mo101039a(cls);
        if (!a.mo101041a()) {
            return m139168e(cls, a);
        }
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return C34434p1.m140101m(C34381i2.m139330S(), C34385j0.m139431b(), a.mo101042b());
        }
        return C34434p1.m140101m(C34381i2.m139322K(), C34385j0.m139430a(), a.mo101042b());
    }

    public C34356e1(C34403k1 k1Var) {
        this.f83254a = (C34403k1) C34471v0.m140574e(k1Var, "messageInfoFactory");
    }
}
