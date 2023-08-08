package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.v5 */
public final class C30243v5 implements C33005d<C30258w8> {

    /* renamed from: a */
    public static final C30243v5 f72281a = new C30243v5();

    /* renamed from: b */
    public static final C33000c f72282b;

    /* renamed from: c */
    public static final C33000c f72283c;

    /* renamed from: d */
    public static final C33000c f72284d;

    static {
        C33000c.C33002b a = C33000c.m133160a("inferenceCommonLogEvent");
        C30035e1 e1Var = new C30035e1();
        e1Var.mo85083a(1);
        f72282b = a.mo95637b(e1Var.mo85084b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("imageInfo");
        C30035e1 e1Var2 = new C30035e1();
        e1Var2.mo85083a(2);
        f72283c = a2.mo95637b(e1Var2.mo85084b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("recognizerOptions");
        C30035e1 e1Var3 = new C30035e1();
        e1Var3.mo85083a(3);
        f72284d = a3.mo95637b(e1Var3.mo85084b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C30258w8 w8Var = (C30258w8) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f72282b, w8Var.mo85374b());
        eVar.mo85169k(f72283c, w8Var.mo85373a());
        eVar.mo85169k(f72284d, w8Var.mo85375c());
    }
}
