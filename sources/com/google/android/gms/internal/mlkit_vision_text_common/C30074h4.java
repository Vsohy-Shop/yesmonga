package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.h4 */
public final class C30074h4 implements C33005d<C30017c7> {

    /* renamed from: a */
    public static final C30074h4 f71903a = new C30074h4();

    /* renamed from: b */
    public static final C33000c f71904b;

    /* renamed from: c */
    public static final C33000c f71905c;

    /* renamed from: d */
    public static final C33000c f71906d;

    /* renamed from: e */
    public static final C33000c f71907e;

    static {
        C33000c.C33002b a = C33000c.m133160a("imageFormat");
        C30035e1 e1Var = new C30035e1();
        e1Var.mo85083a(1);
        f71904b = a.mo95637b(e1Var.mo85084b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("originalImageSize");
        C30035e1 e1Var2 = new C30035e1();
        e1Var2.mo85083a(2);
        f71905c = a2.mo95637b(e1Var2.mo85084b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("compressedImageSize");
        C30035e1 e1Var3 = new C30035e1();
        e1Var3.mo85083a(3);
        f71906d = a3.mo95637b(e1Var3.mo85084b()).mo95636a();
        C33000c.C33002b a4 = C33000c.m133160a("isOdmlImage");
        C30035e1 e1Var4 = new C30035e1();
        e1Var4.mo85083a(4);
        f71907e = a4.mo95637b(e1Var4.mo85084b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C30017c7 c7Var = (C30017c7) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f71904b, c7Var.mo85046a());
        eVar.mo85169k(f71905c, c7Var.mo85047b());
        eVar.mo85169k(f71906d, (Object) null);
        eVar.mo85169k(f71907e, (Object) null);
    }
}
