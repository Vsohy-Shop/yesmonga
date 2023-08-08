package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_common.d3 */
public final class C42340d3 implements C33005d<C42354e6> {

    /* renamed from: a */
    public static final C42340d3 f106959a = new C42340d3();

    /* renamed from: b */
    public static final C33000c f106960b;

    /* renamed from: c */
    public static final C33000c f106961c;

    /* renamed from: d */
    public static final C33000c f106962d;

    /* renamed from: e */
    public static final C33000c f106963e;

    /* renamed from: f */
    public static final C33000c f106964f;

    /* renamed from: g */
    public static final C33000c f106965g;

    /* renamed from: h */
    public static final C33000c f106966h;

    static {
        C33000c.C33002b a = C33000c.m133160a("options");
        C42501s sVar = new C42501s();
        sVar.mo137789a(1);
        f106960b = a.mo95637b(sVar.mo137790b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("roughDownloadDurationMs");
        C42501s sVar2 = new C42501s();
        sVar2.mo137789a(2);
        f106961c = a2.mo95637b(sVar2.mo137790b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("errorCode");
        C42501s sVar3 = new C42501s();
        sVar3.mo137789a(3);
        f106962d = a3.mo95637b(sVar3.mo137790b()).mo95636a();
        C33000c.C33002b a4 = C33000c.m133160a("exactDownloadDurationMs");
        C42501s sVar4 = new C42501s();
        sVar4.mo137789a(4);
        f106963e = a4.mo95637b(sVar4.mo137790b()).mo95636a();
        C33000c.C33002b a5 = C33000c.m133160a("downloadStatus");
        C42501s sVar5 = new C42501s();
        sVar5.mo137789a(5);
        f106964f = a5.mo95637b(sVar5.mo137790b()).mo95636a();
        C33000c.C33002b a6 = C33000c.m133160a("downloadFailureStatus");
        C42501s sVar6 = new C42501s();
        sVar6.mo137789a(6);
        f106965g = a6.mo95637b(sVar6.mo137790b()).mo95636a();
        C33000c.C33002b a7 = C33000c.m133160a("mddDownloadErrorCodes");
        C42501s sVar7 = new C42501s();
        sVar7.mo137789a(7);
        f106966h = a7.mo95637b(sVar7.mo137790b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C42354e6 e6Var = (C42354e6) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f106960b, e6Var.mo137663c());
        eVar.mo85169k(f106961c, e6Var.mo137666f());
        eVar.mo85169k(f106962d, e6Var.mo137661a());
        eVar.mo85169k(f106963e, e6Var.mo137665e());
        eVar.mo85169k(f106964f, e6Var.mo137662b());
        eVar.mo85169k(f106965g, e6Var.mo137664d());
        eVar.mo85169k(f106966h, (Object) null);
    }
}
