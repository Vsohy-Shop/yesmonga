package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.e3 */
public final class C38589e3 implements C33005d<C38653j2> {

    /* renamed from: a */
    public static final C38589e3 f97801a = new C38589e3();

    /* renamed from: b */
    public static final C33000c f97802b;

    /* renamed from: c */
    public static final C33000c f97803c;

    /* renamed from: d */
    public static final C33000c f97804d;

    static {
        C33000c.C33002b a = C33000c.m133160a("logEventKey");
        C38717o1 o1Var = new C38717o1();
        o1Var.mo122449a(1);
        f97802b = a.mo95637b(o1Var.mo122450b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("eventCount");
        C38717o1 o1Var2 = new C38717o1();
        o1Var2.mo122449a(2);
        f97803c = a2.mo95637b(o1Var2.mo122450b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("inferenceDurationStats");
        C38717o1 o1Var3 = new C38717o1();
        o1Var3.mo122449a(3);
        f97804d = a3.mo95637b(o1Var3.mo122450b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C38653j2 j2Var = (C38653j2) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f97802b, j2Var.mo122384a());
        eVar.mo85169k(f97803c, j2Var.mo122386c());
        eVar.mo85169k(f97804d, j2Var.mo122385b());
    }
}
