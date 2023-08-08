package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.google.android.datatransport.C40041c;
import com.google.android.datatransport.C40083d;
import com.google.android.datatransport.C40086g;
import com.google.android.datatransport.C40087h;
import com.google.android.datatransport.cct.C40042a;
import com.google.android.datatransport.runtime.C40323w;
import com.google.firebase.components.C32611y;
import com.google.firebase.inject.C33058b;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.ja */
public final class C38661ja implements C38544aa {
    @C0363p0

    /* renamed from: a */
    public C33058b<C40086g<byte[]>> f97976a;

    /* renamed from: b */
    public final C33058b<C40086g<byte[]>> f97977b;

    /* renamed from: c */
    public final C38800u9 f97978c;

    public C38661ja(Context context, C38800u9 u9Var) {
        this.f97978c = u9Var;
        C40042a aVar = C40042a.f102080j;
        C40323w.m163831f(context);
        C40087h g = C40323w.m163829c().mo132985g(aVar);
        if (aVar.mo132554a().contains(C40041c.m163048b("json"))) {
            this.f97976a = new C32611y(new C38635ha(g));
        }
        this.f97977b = new C32611y(new C38648ia(g));
    }

    @C0344h1
    /* renamed from: b */
    public static C40083d<byte[]> m160029b(C38800u9 u9Var, C38596ea eaVar) {
        int a = u9Var.mo122503a();
        if (eaVar.mo122312a() != 0) {
            return C40083d.m163240e(eaVar.mo122314c(a, false));
        }
        return C40083d.m163242g(eaVar.mo122314c(a, false));
    }

    /* renamed from: a */
    public final void mo122220a(C38596ea eaVar) {
        if (this.f97978c.mo122503a() == 0) {
            C33058b<C40086g<byte[]>> bVar = this.f97976a;
            if (bVar != null) {
                bVar.get().mo132667b(m160029b(this.f97978c, eaVar));
                return;
            }
            return;
        }
        this.f97977b.get().mo132667b(m160029b(this.f97978c, eaVar));
    }
}
