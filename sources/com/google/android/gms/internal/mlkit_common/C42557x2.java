package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_common.x2 */
public final class C42557x2 implements C33005d<C42507s5> {

    /* renamed from: a */
    public static final C42557x2 f107431a = new C42557x2();

    /* renamed from: b */
    public static final C33000c f107432b;

    /* renamed from: c */
    public static final C33000c f107433c;

    /* renamed from: d */
    public static final C33000c f107434d;

    static {
        C33000c.C33002b a = C33000c.m133160a("modelType");
        C42501s sVar = new C42501s();
        sVar.mo137789a(1);
        f107432b = a.mo95637b(sVar.mo137790b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("isDownloaded");
        C42501s sVar2 = new C42501s();
        sVar2.mo137789a(2);
        f107433c = a2.mo95637b(sVar2.mo137790b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("modelName");
        C42501s sVar3 = new C42501s();
        sVar3.mo137789a(3);
        f107434d = a3.mo95637b(sVar3.mo137790b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C42507s5 s5Var = (C42507s5) obj;
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f107432b, s5Var.mo137793a());
        eVar.mo85169k(f107433c, s5Var.mo137794b());
        eVar.mo85169k(f107434d, (Object) null);
    }
}
