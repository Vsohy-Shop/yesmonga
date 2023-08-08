package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.g3 */
public final class C30061g3 implements C33005d<C30108k2> {

    /* renamed from: a */
    public static final C30061g3 f71873a = new C30061g3();

    /* renamed from: b */
    public static final C33000c f71874b;

    /* renamed from: c */
    public static final C33000c f71875c;

    /* renamed from: d */
    public static final C33000c f71876d;

    static {
        C33000c.C33002b a = C33000c.m133160a("logEventKey");
        C30035e1 e1Var = new C30035e1();
        e1Var.mo85083a(1);
        f71874b = a.mo95637b(e1Var.mo85084b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("eventCount");
        C30035e1 e1Var2 = new C30035e1();
        e1Var2.mo85083a(2);
        f71875c = a2.mo95637b(e1Var2.mo85084b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("inferenceDurationStats");
        C30035e1 e1Var3 = new C30035e1();
        e1Var3.mo85083a(3);
        f71876d = a3.mo95637b(e1Var3.mo85084b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C30108k2 k2Var = (C30108k2) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f71874b, k2Var.mo85191a());
        eVar.mo85169k(f71875c, k2Var.mo85193c());
        eVar.mo85169k(f71876d, k2Var.mo85192b());
    }
}
