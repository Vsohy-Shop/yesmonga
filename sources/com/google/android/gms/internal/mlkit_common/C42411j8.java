package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import androidx.annotation.C0344h1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_common.j8 */
public final class C42411j8 implements C42466o8 {
    @C0344h1

    /* renamed from: a */
    public final List<C42466o8> f107142a;

    public C42411j8(Context context, C42400i8 i8Var) {
        ArrayList arrayList = new ArrayList();
        this.f107142a = arrayList;
        if (i8Var.mo137643c()) {
            arrayList.add(new C42563x8(context, i8Var));
        }
    }

    /* renamed from: a */
    public final void mo137721a(C42378g8 g8Var) {
        for (C42466o8 a : this.f107142a) {
            a.mo137721a(g8Var);
        }
    }
}
