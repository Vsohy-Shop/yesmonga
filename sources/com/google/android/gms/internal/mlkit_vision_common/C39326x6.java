package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import androidx.annotation.C0344h1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.x6 */
public final class C39326x6 implements C39126b7 {
    @C0344h1

    /* renamed from: a */
    public final List<C39126b7> f100409a;

    public C39326x6(Context context, C39317w6 w6Var) {
        ArrayList arrayList = new ArrayList();
        this.f100409a = arrayList;
        if (w6Var.mo123343c()) {
            arrayList.add(new C39201j7(context, w6Var));
        }
    }

    /* renamed from: a */
    public final void mo123231a(C39146d7 d7Var) {
        for (C39126b7 a : this.f100409a) {
            a.mo123231a(d7Var);
        }
    }
}
