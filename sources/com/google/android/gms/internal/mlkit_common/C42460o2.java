package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_common.o2 */
public final class C42460o2 implements C33005d<C42397i5> {

    /* renamed from: a */
    public static final C42460o2 f107249a = new C42460o2();

    /* renamed from: b */
    public static final C33000c f107250b;

    /* renamed from: c */
    public static final C33000c f107251c;

    /* renamed from: d */
    public static final C33000c f107252d;

    static {
        C33000c.C33002b a = C33000c.m133160a("modelType");
        C42501s sVar = new C42501s();
        sVar.mo137789a(1);
        f107250b = a.mo95637b(sVar.mo137790b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("isSuccessful");
        C42501s sVar2 = new C42501s();
        sVar2.mo137789a(2);
        f107251c = a2.mo95637b(sVar2.mo137790b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("modelName");
        C42501s sVar3 = new C42501s();
        sVar3.mo137789a(3);
        f107252d = a3.mo95637b(sVar3.mo137790b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C42397i5 i5Var = (C42397i5) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f107250b, i5Var.mo137713a());
        eVar.mo85169k(f107251c, i5Var.mo137714b());
        eVar.mo85169k(f107252d, (Object) null);
    }
}
