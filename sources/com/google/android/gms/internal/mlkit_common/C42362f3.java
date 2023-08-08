package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33005d;
import com.google.firebase.encoders.C33006e;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_common.f3 */
public final class C42362f3 implements C33005d<C42431l6> {

    /* renamed from: a */
    public static final C42362f3 f107018a = new C42362f3();

    /* renamed from: b */
    public static final C33000c f107019b;

    /* renamed from: c */
    public static final C33000c f107020c;

    /* renamed from: d */
    public static final C33000c f107021d;

    /* renamed from: e */
    public static final C33000c f107022e;

    static {
        C33000c.C33002b a = C33000c.m133160a("modelInfo");
        C42501s sVar = new C42501s();
        sVar.mo137789a(1);
        f107019b = a.mo95637b(sVar.mo137790b()).mo95636a();
        C33000c.C33002b a2 = C33000c.m133160a("initialDownloadConditions");
        C42501s sVar2 = new C42501s();
        sVar2.mo137789a(2);
        f107020c = a2.mo95637b(sVar2.mo137790b()).mo95636a();
        C33000c.C33002b a3 = C33000c.m133160a("updateDownloadConditions");
        C42501s sVar3 = new C42501s();
        sVar3.mo137789a(3);
        f107021d = a3.mo95637b(sVar3.mo137790b()).mo95636a();
        C33000c.C33002b a4 = C33000c.m133160a("isModelUpdateEnabled");
        C42501s sVar4 = new C42501s();
        sVar4.mo137789a(4);
        f107022e = a4.mo95637b(sVar4.mo137790b()).mo95636a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85035a(Object obj, Object obj2) throws IOException {
        C33006e eVar = (C33006e) obj2;
        eVar.mo85169k(f107019b, ((C42431l6) obj).mo137729a());
        eVar.mo85169k(f107020c, (Object) null);
        eVar.mo85169k(f107021d, (Object) null);
        eVar.mo85169k(f107022e, (Object) null);
    }
}
