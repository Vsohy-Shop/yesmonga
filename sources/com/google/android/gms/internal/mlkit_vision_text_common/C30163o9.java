package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import androidx.annotation.C0344h1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.o9 */
public final class C30163o9 implements C30211s9 {
    @C0344h1

    /* renamed from: a */
    public final List<C30211s9> f72075a;

    public C30163o9(Context context, C30151n9 n9Var) {
        ArrayList arrayList = new ArrayList();
        this.f72075a = arrayList;
        if (n9Var.mo85217c()) {
            arrayList.add(new C30008ba(context, n9Var));
        }
    }

    /* renamed from: a */
    public final void mo85042a(C30259w9 w9Var) {
        for (C30211s9 a : this.f72075a) {
            a.mo85042a(w9Var);
        }
    }
}
