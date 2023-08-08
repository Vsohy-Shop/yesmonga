package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.pa */
public final class C42127pa implements C42005ib {

    /* renamed from: b */
    public static final C42212ua f106337b = new C42076ma();

    /* renamed from: a */
    public final C42212ua f106338a;

    public C42127pa() {
        C42212ua uaVar;
        C42212ua[] uaVarArr = new C42212ua[2];
        uaVarArr[0] = C42075m9.m170560c();
        try {
            uaVar = (C42212ua) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            uaVar = f106337b;
        }
        uaVarArr[1] = uaVar;
        C42093na naVar = new C42093na(uaVarArr);
        byte[] bArr = C41860aa.f105998d;
        this.f106338a = naVar;
    }

    /* renamed from: b */
    public static boolean m170718b(C42195ta taVar) {
        return taVar.mo136881d() == 1;
    }

    /* renamed from: a */
    public final C41987hb mo137036a(Class cls) {
        C42023jb.m170391d(cls);
        C42195ta a = this.f106338a.mo137154a(cls);
        Class<C42177s9> cls2 = C42177s9.class;
        if (a.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return C41861ab.m169670j(C42023jb.m170388a(), C41985h9.m170220b(), a.zza());
            }
            return C41861ab.m169670j(C42023jb.m170386W(), C41985h9.m170219a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m170718b(a)) {
                return C42297za.m171243H(cls, a, C41897cb.m169752b(), C42040ka.m170466d(), C42023jb.m170388a(), C41985h9.m170220b(), C42178sa.m170842b());
            }
            return C42297za.m171243H(cls, a, C41897cb.m169752b(), C42040ka.m170466d(), C42023jb.m170388a(), (C41949f9) null, C42178sa.m170842b());
        } else if (m170718b(a)) {
            return C42297za.m171243H(cls, a, C41897cb.m169751a(), C42040ka.m170465c(), C42023jb.m170386W(), C41985h9.m170219a(), C42178sa.m170841a());
        } else {
            return C42297za.m171243H(cls, a, C41897cb.m169751a(), C42040ka.m170465c(), C42023jb.m170387X(), (C41949f9) null, C42178sa.m170841a());
        }
    }
}
