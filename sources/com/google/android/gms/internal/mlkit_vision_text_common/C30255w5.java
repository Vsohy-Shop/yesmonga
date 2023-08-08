package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import com.google.firebase.remoteconfig.C33585u;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.w5 */
public final class C30255w5 implements C33005d<C30294z8> {

    /* renamed from: a */
    public static final C30255w5 f72305a = new C30255w5();

    /* renamed from: b */
    public static final C33000c f72306b;

    /* renamed from: c */
    public static final C33000c f72307c;

    /* renamed from: d */
    public static final C33000c f72308d;

    static {
        C33000c.C33002b a = C33000c.m133160a("languageOption");
        C30035e1 e1Var = new C30035e1();
        e1Var.mo85083a(3);
        f72306b = a.mo95637b(e1Var.mo85084b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("isUsingLegacyApi");
        C30035e1 e1Var2 = new C30035e1();
        e1Var2.mo85083a(4);
        f72307c = a2.mo95637b(e1Var2.mo85084b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a(C33585u.C33587b.f81741w3);
        C30035e1 e1Var3 = new C30035e1();
        e1Var3.mo85083a(5);
        f72308d = a3.mo95637b(e1Var3.mo85084b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f72306b, ((C30294z8) obj).mo85413a());
        eVar.mo85169k(f72307c, (Object) null);
        eVar.mo85169k(f72308d, (Object) null);
    }
}
