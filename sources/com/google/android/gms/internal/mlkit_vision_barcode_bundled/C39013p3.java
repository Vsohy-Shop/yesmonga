package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p3 */
public final class C39013p3 implements C39023q4 {

    /* renamed from: b */
    public static final C39058u3 f98916b = new C38995n3();

    /* renamed from: a */
    public final C39058u3 f98917a;

    public C39013p3() {
        C39058u3 u3Var;
        C39058u3[] u3VarArr = new C39058u3[2];
        u3VarArr[0] = C38925g2.m160511c();
        try {
            u3Var = (C39058u3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            u3Var = f98916b;
        }
        u3VarArr[1] = u3Var;
        C39004o3 o3Var = new C39004o3(u3VarArr);
        C39084x2.m160970f(o3Var, "messageInfoFactory");
        this.f98917a = o3Var;
    }

    /* renamed from: b */
    public static boolean m160675b(C39049t3 t3Var) {
        return t3Var.mo122846d() == 1;
    }

    /* renamed from: a */
    public final <T> C39014p4<T> mo123007a(Class<T> cls) {
        C39032r4.m160786g(cls);
        C39049t3 a = this.f98917a.mo122898a(cls);
        Class<C39003o2> cls2 = C39003o2.class;
        if (a.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return C38867a4.m160379j(C39032r4.m160780b(), C38885c2.m160406b(), a.zza());
            }
            return C38867a4.m160379j(C39032r4.m160781b0(), C38885c2.m160405a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m160675b(a)) {
                return C39103z3.m161003F(cls, a, C38897d4.m160457b(), C38976l3.m160588d(), C39032r4.m160780b(), C38885c2.m160406b(), C39040s3.m160834b());
            }
            return C39103z3.m161003F(cls, a, C38897d4.m160457b(), C38976l3.m160588d(), C39032r4.m160780b(), (C38865a2<?>) null, C39040s3.m160834b());
        } else if (m160675b(a)) {
            return C39103z3.m161003F(cls, a, C38897d4.m160456a(), C38976l3.m160587c(), C39032r4.m160781b0(), C38885c2.m160405a(), C39040s3.m160833a());
        } else {
            return C39103z3.m161003F(cls, a, C38897d4.m160456a(), C38976l3.m160587c(), C39032r4.m160778a(), (C38865a2<?>) null, C39040s3.m160833a());
        }
    }
}
