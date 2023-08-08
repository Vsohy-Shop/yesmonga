package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.vr */
public final class C29827vr {

    /* renamed from: a */
    public final C29383jr f71509a;

    /* renamed from: b */
    public final C29753tr f71510b;

    public C29827vr(C29753tr trVar, byte[] bArr) {
        C29347ir irVar = C29347ir.f71297b;
        this.f71510b = trVar;
        this.f71509a = irVar;
    }

    /* renamed from: b */
    public static C29827vr m121259b(String str) {
        return new C29827vr(new C29753tr("#vk "), (byte[]) null);
    }

    /* renamed from: c */
    public final List<String> mo84900c(CharSequence charSequence) {
        charSequence.getClass();
        C29716sr srVar = new C29716sr(this.f71510b, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (srVar.hasNext()) {
            arrayList.add((String) srVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
