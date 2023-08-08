package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.n4 */
public final class C38707n4 implements C33005d<C38593e7> {

    /* renamed from: a */
    public static final C38707n4 f98054a = new C38707n4();

    /* renamed from: b */
    public static final C33000c f98055b;

    /* renamed from: c */
    public static final C33000c f98056c;

    /* renamed from: d */
    public static final C33000c f98057d;

    /* renamed from: e */
    public static final C33000c f98058e;

    /* renamed from: f */
    public static final C33000c f98059f;

    /* renamed from: g */
    public static final C33000c f98060g;

    static {
        C33000c.C33002b a = C33000c.m133160a("maxMs");
        C38717o1 o1Var = new C38717o1();
        o1Var.mo122449a(1);
        f98055b = a.mo95637b(o1Var.mo122450b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("minMs");
        C38717o1 o1Var2 = new C38717o1();
        o1Var2.mo122449a(2);
        f98056c = a2.mo95637b(o1Var2.mo122450b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("avgMs");
        C38717o1 o1Var3 = new C38717o1();
        o1Var3.mo122449a(3);
        f98057d = a3.mo95637b(o1Var3.mo122450b()).mo95636a();
        C33000c.C33002b a4 = C33000c.m133160a("firstQuartileMs");
        C38717o1 o1Var4 = new C38717o1();
        o1Var4.mo122449a(4);
        f98058e = a4.mo95637b(o1Var4.mo122450b()).mo95636a();
        C33000c.C33002b a5 = C33000c.m133160a("medianMs");
        C38717o1 o1Var5 = new C38717o1();
        o1Var5.mo122449a(5);
        f98059f = a5.mo95637b(o1Var5.mo122450b()).mo95636a();
        C33000c.C33002b a6 = C33000c.m133160a("thirdQuartileMs");
        C38717o1 o1Var6 = new C38717o1();
        o1Var6.mo122449a(6);
        f98060g = a6.mo95637b(o1Var6.mo122450b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C38593e7 e7Var = (C38593e7) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f98055b, e7Var.mo122306c());
        eVar.mo85169k(f98056c, e7Var.mo122308e());
        eVar.mo85169k(f98057d, e7Var.mo122304a());
        eVar.mo85169k(f98058e, e7Var.mo122305b());
        eVar.mo85169k(f98059f, e7Var.mo122307d());
        eVar.mo85169k(f98060g, e7Var.mo122309f());
    }
}
