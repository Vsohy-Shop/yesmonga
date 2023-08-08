package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.d4 */
public final class C30026d4 implements C33005d<C30268x6> {

    /* renamed from: a */
    public static final C30026d4 f71787a = new C30026d4();

    /* renamed from: b */
    public static final C33000c f71788b;

    /* renamed from: c */
    public static final C33000c f71789c;

    /* renamed from: d */
    public static final C33000c f71790d;

    /* renamed from: e */
    public static final C33000c f71791e;

    /* renamed from: f */
    public static final C33000c f71792f;

    /* renamed from: g */
    public static final C33000c f71793g;

    static {
        C33000c.C33002b a = C33000c.m133160a("maxMs");
        C30035e1 e1Var = new C30035e1();
        e1Var.mo85083a(1);
        f71788b = a.mo95637b(e1Var.mo85084b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("minMs");
        C30035e1 e1Var2 = new C30035e1();
        e1Var2.mo85083a(2);
        f71789c = a2.mo95637b(e1Var2.mo85084b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("avgMs");
        C30035e1 e1Var3 = new C30035e1();
        e1Var3.mo85083a(3);
        f71790d = a3.mo95637b(e1Var3.mo85084b()).mo95636a();
        C33000c.C33002b a4 = C33000c.m133160a("firstQuartileMs");
        C30035e1 e1Var4 = new C30035e1();
        e1Var4.mo85083a(4);
        f71791e = a4.mo95637b(e1Var4.mo85084b()).mo95636a();
        C33000c.C33002b a5 = C33000c.m133160a("medianMs");
        C30035e1 e1Var5 = new C30035e1();
        e1Var5.mo85083a(5);
        f71792f = a5.mo95637b(e1Var5.mo85084b()).mo95636a();
        C33000c.C33002b a6 = C33000c.m133160a("thirdQuartileMs");
        C30035e1 e1Var6 = new C30035e1();
        e1Var6.mo85083a(6);
        f71793g = a6.mo95637b(e1Var6.mo85084b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C30268x6 x6Var = (C30268x6) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f71788b, x6Var.mo85391c());
        eVar.mo85169k(f71789c, x6Var.mo85393e());
        eVar.mo85169k(f71790d, x6Var.mo85389a());
        eVar.mo85169k(f71791e, x6Var.mo85390b());
        eVar.mo85169k(f71792f, x6Var.mo85392d());
        eVar.mo85169k(f71793g, x6Var.mo85394f());
    }
}
