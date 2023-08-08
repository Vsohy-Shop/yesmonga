package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.nk */
public final class C41459nk implements C41339il {

    /* renamed from: b */
    public static final C41579sk f104822b = new C41411lk();

    /* renamed from: a */
    public final C41579sk f104823a;

    public C41459nk() {
        C41579sk skVar;
        C41579sk[] skVarArr = new C41579sk[2];
        skVarArr[0] = C41241ej.m167462c();
        try {
            skVar = (C41579sk) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            skVar = f104822b;
        }
        skVarArr[1] = skVar;
        C41435mk mkVar = new C41435mk(skVarArr);
        C41650vj.m168604f(mkVar, "messageInfoFactory");
        this.f104823a = mkVar;
    }

    /* renamed from: b */
    public static boolean m168090b(C41555rk rkVar) {
        return rkVar.mo135378d() == 1;
    }

    /* renamed from: a */
    public final <T> C41315hl<T> mo135501a(Class<T> cls) {
        C41363jl.m167832g(cls);
        C41555rk a = this.f104823a.mo135345a(cls);
        Class<C41410lj> cls2 = C41410lj.class;
        if (a.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return C41723yk.m168898k(C41363jl.m167826b(), C41745zi.m168945b(), a.zza());
            }
            return C41723yk.m168898k(C41363jl.m167827b0(), C41745zi.m168944a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m168090b(a)) {
                return C41699xk.m168785K(cls, a, C41171bl.m167223b(), C41338ik.m167733e(), C41363jl.m167826b(), C41745zi.m168945b(), C41531qk.m168271b());
            }
            return C41699xk.m168785K(cls, a, C41171bl.m167223b(), C41338ik.m167733e(), C41363jl.m167826b(), (C41697xi<?>) null, C41531qk.m168271b());
        } else if (m168090b(a)) {
            return C41699xk.m168785K(cls, a, C41171bl.m167222a(), C41338ik.m167732d(), C41363jl.m167827b0(), C41745zi.m168944a(), C41531qk.m168270a());
        } else {
            return C41699xk.m168785K(cls, a, C41171bl.m167222a(), C41338ik.m167732d(), C41363jl.m167824a(), (C41697xi<?>) null, C41531qk.m168270a());
        }
    }
}
