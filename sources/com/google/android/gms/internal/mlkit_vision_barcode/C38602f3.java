package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.f3 */
public final class C38602f3 implements C33005d<C38627h2> {

    /* renamed from: a */
    public static final C38602f3 f97831a = new C38602f3();

    /* renamed from: b */
    public static final C33000c f97832b;

    /* renamed from: c */
    public static final C33000c f97833c;

    /* renamed from: d */
    public static final C33000c f97834d;

    /* renamed from: e */
    public static final C33000c f97835e;

    /* renamed from: f */
    public static final C33000c f97836f;

    /* renamed from: g */
    public static final C33000c f97837g;

    /* renamed from: h */
    public static final C33000c f97838h;

    static {
        C33000c.C33002b a = C33000c.m133160a("errorCode");
        C38717o1 o1Var = new C38717o1();
        o1Var.mo122449a(1);
        f97832b = a.mo95637b(o1Var.mo122450b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("hasResult");
        C38717o1 o1Var2 = new C38717o1();
        o1Var2.mo122449a(2);
        f97833c = a2.mo95637b(o1Var2.mo122450b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("isColdCall");
        C38717o1 o1Var3 = new C38717o1();
        o1Var3.mo122449a(3);
        f97834d = a3.mo95637b(o1Var3.mo122450b()).mo95636a();
        C33000c.C33002b a4 = C33000c.m133160a("imageInfo");
        C38717o1 o1Var4 = new C38717o1();
        o1Var4.mo122449a(4);
        f97835e = a4.mo95637b(o1Var4.mo122450b()).mo95636a();
        C33000c.C33002b a5 = C33000c.m133160a("options");
        C38717o1 o1Var5 = new C38717o1();
        o1Var5.mo122449a(5);
        f97836f = a5.mo95637b(o1Var5.mo122450b()).mo95636a();
        C33000c.C33002b a6 = C33000c.m133160a("detectedBarcodeFormats");
        C38717o1 o1Var6 = new C38717o1();
        o1Var6.mo122449a(6);
        f97837g = a6.mo95637b(o1Var6.mo122450b()).mo95636a();
        C33000c.C33002b a7 = C33000c.m133160a("detectedBarcodeValueTypes");
        C38717o1 o1Var7 = new C38717o1();
        o1Var7.mo122449a(7);
        f97838h = a7.mo95637b(o1Var7.mo122450b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C38627h2 h2Var = (C38627h2) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f97832b, h2Var.mo122348c());
        eVar.mo85169k(f97833c, (Object) null);
        eVar.mo85169k(f97834d, h2Var.mo122350e());
        eVar.mo85169k(f97835e, (Object) null);
        eVar.mo85169k(f97836f, h2Var.mo122349d());
        eVar.mo85169k(f97837g, h2Var.mo122346a());
        eVar.mo85169k(f97838h, h2Var.mo122347b());
    }
}
