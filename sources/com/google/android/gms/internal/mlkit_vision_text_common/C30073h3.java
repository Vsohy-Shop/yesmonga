package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.h3 */
public final class C30073h3 implements C33005d<C30084i2> {

    /* renamed from: a */
    public static final C30073h3 f71897a = new C30073h3();

    /* renamed from: b */
    public static final C33000c f71898b;

    /* renamed from: c */
    public static final C33000c f71899c;

    /* renamed from: d */
    public static final C33000c f71900d;

    /* renamed from: e */
    public static final C33000c f71901e;

    /* renamed from: f */
    public static final C33000c f71902f;

    static {
        C33000c.C33002b a = C33000c.m133160a("errorCode");
        C30035e1 e1Var = new C30035e1();
        e1Var.mo85083a(1);
        f71898b = a.mo95637b(e1Var.mo85084b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("hasResult");
        C30035e1 e1Var2 = new C30035e1();
        e1Var2.mo85083a(2);
        f71899c = a2.mo95637b(e1Var2.mo85084b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("isColdCall");
        C30035e1 e1Var3 = new C30035e1();
        e1Var3.mo85083a(3);
        f71900d = a3.mo95637b(e1Var3.mo85084b()).mo95636a();
        C33000c.C33002b a4 = C33000c.m133160a("imageInfo");
        C30035e1 e1Var4 = new C30035e1();
        e1Var4.mo85083a(4);
        f71901e = a4.mo95637b(e1Var4.mo85084b()).mo95636a();
        C33000c.C33002b a5 = C33000c.m133160a("recognizerOptions");
        C30035e1 e1Var5 = new C30035e1();
        e1Var5.mo85083a(5);
        f71902f = a5.mo95637b(e1Var5.mo85084b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C30084i2 i2Var = (C30084i2) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f71898b, i2Var.mo85149a());
        eVar.mo85169k(f71899c, (Object) null);
        eVar.mo85169k(f71900d, i2Var.mo85151c());
        eVar.mo85169k(f71901e, (Object) null);
        eVar.mo85169k(f71902f, i2Var.mo85150b());
    }
}
