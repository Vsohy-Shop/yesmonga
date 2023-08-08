package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.i6 */
public final class C38644i6 implements C33005d<C38673k9> {

    /* renamed from: a */
    public static final C38644i6 f97925a = new C38644i6();

    /* renamed from: b */
    public static final C33000c f97926b;

    /* renamed from: c */
    public static final C33000c f97927c;

    /* renamed from: d */
    public static final C33000c f97928d;

    /* renamed from: e */
    public static final C33000c f97929e;

    /* renamed from: f */
    public static final C33000c f97930f;

    /* renamed from: g */
    public static final C33000c f97931g;

    /* renamed from: h */
    public static final C33000c f97932h;

    /* renamed from: i */
    public static final C33000c f97933i;

    /* renamed from: j */
    public static final C33000c f97934j;

    /* renamed from: k */
    public static final C33000c f97935k;

    /* renamed from: l */
    public static final C33000c f97936l;

    /* renamed from: m */
    public static final C33000c f97937m;

    /* renamed from: n */
    public static final C33000c f97938n;

    static {
        C33000c.C33002b a = C33000c.m133160a("appId");
        C38717o1 o1Var = new C38717o1();
        o1Var.mo122449a(1);
        f97926b = a.mo95637b(o1Var.mo122450b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("appVersion");
        C38717o1 o1Var2 = new C38717o1();
        o1Var2.mo122449a(2);
        f97927c = a2.mo95637b(o1Var2.mo122450b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("firebaseProjectId");
        C38717o1 o1Var3 = new C38717o1();
        o1Var3.mo122449a(3);
        f97928d = a3.mo95637b(o1Var3.mo122450b()).mo95636a();
        C33000c.C33002b a4 = C33000c.m133160a("mlSdkVersion");
        C38717o1 o1Var4 = new C38717o1();
        o1Var4.mo122449a(4);
        f97929e = a4.mo95637b(o1Var4.mo122450b()).mo95636a();
        C33000c.C33002b a5 = C33000c.m133160a("tfliteSchemaVersion");
        C38717o1 o1Var5 = new C38717o1();
        o1Var5.mo122449a(5);
        f97930f = a5.mo95637b(o1Var5.mo122450b()).mo95636a();
        C33000c.C33002b a6 = C33000c.m133160a("gcmSenderId");
        C38717o1 o1Var6 = new C38717o1();
        o1Var6.mo122449a(6);
        f97931g = a6.mo95637b(o1Var6.mo122450b()).mo95636a();
        C33000c.C33002b a7 = C33000c.m133160a("apiKey");
        C38717o1 o1Var7 = new C38717o1();
        o1Var7.mo122449a(7);
        f97932h = a7.mo95637b(o1Var7.mo122450b()).mo95636a();
        C33000c.C33002b a8 = C33000c.m133160a("languages");
        C38717o1 o1Var8 = new C38717o1();
        o1Var8.mo122449a(8);
        f97933i = a8.mo95637b(o1Var8.mo122450b()).mo95636a();
        C33000c.C33002b a9 = C33000c.m133160a("mlSdkInstanceId");
        C38717o1 o1Var9 = new C38717o1();
        o1Var9.mo122449a(9);
        f97934j = a9.mo95637b(o1Var9.mo122450b()).mo95636a();
        C33000c.C33002b a10 = C33000c.m133160a("isClearcutClient");
        C38717o1 o1Var10 = new C38717o1();
        o1Var10.mo122449a(10);
        f97935k = a10.mo95637b(o1Var10.mo122450b()).mo95636a();
        C33000c.C33002b a11 = C33000c.m133160a("isStandaloneMlkit");
        C38717o1 o1Var11 = new C38717o1();
        o1Var11.mo122449a(11);
        f97936l = a11.mo95637b(o1Var11.mo122450b()).mo95636a();
        C33000c.C33002b a12 = C33000c.m133160a("isJsonLogging");
        C38717o1 o1Var12 = new C38717o1();
        o1Var12.mo122449a(12);
        f97937m = a12.mo95637b(o1Var12.mo122450b()).mo95636a();
        C33000c.C33002b a13 = C33000c.m133160a("buildLevel");
        C38717o1 o1Var13 = new C38717o1();
        o1Var13.mo122449a(13);
        f97938n = a13.mo95637b(o1Var13.mo122450b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C38673k9 k9Var = (C38673k9) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f97926b, k9Var.mo122406f());
        eVar.mo85169k(f97927c, k9Var.mo122407g());
        eVar.mo85169k(f97928d, (Object) null);
        eVar.mo85169k(f97929e, k9Var.mo122409i());
        eVar.mo85169k(f97930f, k9Var.mo122410j());
        eVar.mo85169k(f97931g, (Object) null);
        eVar.mo85169k(f97932h, (Object) null);
        eVar.mo85169k(f97933i, k9Var.mo122401a());
        eVar.mo85169k(f97934j, k9Var.mo122408h());
        eVar.mo85169k(f97935k, k9Var.mo122402b());
        eVar.mo85169k(f97936l, k9Var.mo122404d());
        eVar.mo85169k(f97937m, k9Var.mo122403c());
        eVar.mo85169k(f97938n, k9Var.mo122405e());
    }
}
