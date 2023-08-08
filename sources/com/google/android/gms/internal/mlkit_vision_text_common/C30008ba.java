package com.google.android.gms.internal.mlkit_vision_text_common;

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

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.ba */
public final class C30008ba implements C30211s9 {
    @C0363p0

    /* renamed from: a */
    public C33058b<C40086g<byte[]>> f71756a;

    /* renamed from: b */
    public final C33058b<C40086g<byte[]>> f71757b;

    /* renamed from: c */
    public final C30151n9 f71758c;

    public C30008ba(Context context, C30151n9 n9Var) {
        this.f71758c = n9Var;
        C40042a aVar = C40042a.f102080j;
        C40323w.m163831f(context);
        C40087h g = C40323w.m163829c().mo132985g(aVar);
        if (aVar.mo132554a().contains(C40041c.m163048b("json"))) {
            this.f71756a = new C32611y(new C30295z9(g));
        }
        this.f71757b = new C32611y(new C29995aa(g));
    }

    @C0344h1
    /* renamed from: b */
    public static C40083d<byte[]> m121598b(C30151n9 n9Var, C30259w9 w9Var) {
        int a = n9Var.mo85215a();
        if (w9Var.mo85376a() != 0) {
            return C40083d.m163240e(w9Var.mo85378c(a, false));
        }
        return C40083d.m163242g(w9Var.mo85378c(a, false));
    }

    /* renamed from: a */
    public final void mo85042a(C30259w9 w9Var) {
        if (this.f71758c.mo85215a() == 0) {
            C33058b<C40086g<byte[]>> bVar = this.f71756a;
            if (bVar != null) {
                bVar.get().mo132667b(m121598b(this.f71758c, w9Var));
                return;
            }
            return;
        }
        this.f71757b.get().mo132667b(m121598b(this.f71758c, w9Var));
    }
}
