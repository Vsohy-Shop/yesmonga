package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.h5 */
public final class C38630h5 implements C33005d<C38607f8> {

    /* renamed from: a */
    public static final C38630h5 f97899a = new C38630h5();

    /* renamed from: b */
    public static final C33000c f97900b;

    /* renamed from: c */
    public static final C33000c f97901c;

    /* renamed from: d */
    public static final C33000c f97902d;

    /* renamed from: e */
    public static final C33000c f97903e;

    /* renamed from: f */
    public static final C33000c f97904f;

    static {
        C33000c.C33002b a = C33000c.m133160a("inferenceCommonLogEvent");
        C38717o1 o1Var = new C38717o1();
        o1Var.mo122449a(1);
        f97900b = a.mo95637b(o1Var.mo122450b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("options");
        C38717o1 o1Var2 = new C38717o1();
        o1Var2.mo122449a(2);
        f97901c = a2.mo95637b(o1Var2.mo122450b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("detectedBarcodeFormats");
        C38717o1 o1Var3 = new C38717o1();
        o1Var3.mo122449a(3);
        f97902d = a3.mo95637b(o1Var3.mo122450b()).mo95636a();
        C33000c.C33002b a4 = C33000c.m133160a("detectedBarcodeValueTypes");
        C38717o1 o1Var4 = new C38717o1();
        o1Var4.mo122449a(4);
        f97903e = a4.mo95637b(o1Var4.mo122450b()).mo95636a();
        C33000c.C33002b a5 = C33000c.m133160a("imageInfo");
        C38717o1 o1Var5 = new C38717o1();
        o1Var5.mo122449a(5);
        f97904f = a5.mo95637b(o1Var5.mo122450b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C38607f8 f8Var = (C38607f8) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f97900b, f8Var.mo122333d());
        eVar.mo85169k(f97901c, f8Var.mo122334e());
        eVar.mo85169k(f97902d, f8Var.mo122330a());
        eVar.mo85169k(f97903e, f8Var.mo122331b());
        eVar.mo85169k(f97904f, f8Var.mo122332c());
    }
}
