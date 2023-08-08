package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.r4 */
public final class C38759r4 implements C33005d<C38658j7> {

    /* renamed from: a */
    public static final C38759r4 f98136a = new C38759r4();

    /* renamed from: b */
    public static final C33000c f98137b;

    /* renamed from: c */
    public static final C33000c f98138c;

    /* renamed from: d */
    public static final C33000c f98139d;

    /* renamed from: e */
    public static final C33000c f98140e;

    static {
        C33000c.C33002b a = C33000c.m133160a("imageFormat");
        C38717o1 o1Var = new C38717o1();
        o1Var.mo122449a(1);
        f98137b = a.mo95637b(o1Var.mo122450b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("originalImageSize");
        C38717o1 o1Var2 = new C38717o1();
        o1Var2.mo122449a(2);
        f98138c = a2.mo95637b(o1Var2.mo122450b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("compressedImageSize");
        C38717o1 o1Var3 = new C38717o1();
        o1Var3.mo122449a(3);
        f98139d = a3.mo95637b(o1Var3.mo122450b()).mo95636a();
        C33000c.C33002b a4 = C33000c.m133160a("isOdmlImage");
        C38717o1 o1Var4 = new C38717o1();
        o1Var4.mo122449a(4);
        f98140e = a4.mo95637b(o1Var4.mo122450b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C38658j7 j7Var = (C38658j7) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f98137b, j7Var.mo122387a());
        eVar.mo85169k(f98138c, j7Var.mo122388b());
        eVar.mo85169k(f98139d, (Object) null);
        eVar.mo85169k(f98140e, (Object) null);
    }
}
