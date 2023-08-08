package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import androidx.annotation.C0344h1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.v9 */
public final class C38812v9 implements C38544aa {
    @C0344h1

    /* renamed from: a */
    public final List<C38544aa> f98239a;

    public C38812v9(Context context, C38800u9 u9Var) {
        ArrayList arrayList = new ArrayList();
        this.f98239a = arrayList;
        if (u9Var.mo122505c()) {
            arrayList.add(new C38661ja(context, u9Var));
        }
    }

    /* renamed from: a */
    public final void mo122220a(C38596ea eaVar) {
        for (C38544aa a : this.f98239a) {
            a.mo122220a(eaVar);
        }
    }
}
