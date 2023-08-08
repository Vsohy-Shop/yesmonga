package com.google.android.gms.internal.mlkit_vision_common;

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

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.j7 */
public final class C39201j7 implements C39126b7 {
    @C0363p0

    /* renamed from: a */
    public C33058b<C40086g<byte[]>> f100107a;

    /* renamed from: b */
    public final C33058b<C40086g<byte[]>> f100108b;

    /* renamed from: c */
    public final C39317w6 f100109c;

    public C39201j7(Context context, C39317w6 w6Var) {
        this.f100109c = w6Var;
        C40042a aVar = C40042a.f102080j;
        C40323w.m163831f(context);
        C40087h g = C40323w.m163829c().mo132985g(aVar);
        if (aVar.mo132554a().contains(C40041c.m163048b("json"))) {
            this.f100107a = new C32611y(new C39183h7(g));
        }
        this.f100108b = new C32611y(new C39192i7(g));
    }

    @C0344h1
    /* renamed from: b */
    public static C40083d<byte[]> m161235b(C39317w6 w6Var, C39146d7 d7Var) {
        return C40083d.m163242g(d7Var.mo123241b(w6Var.mo123341a(), false));
    }

    /* renamed from: a */
    public final void mo123231a(C39146d7 d7Var) {
        if (this.f100109c.mo123341a() == 0) {
            C33058b<C40086g<byte[]>> bVar = this.f100107a;
            if (bVar != null) {
                bVar.get().mo132667b(m161235b(this.f100109c, d7Var));
                return;
            }
            return;
        }
        this.f100108b.get().mo132667b(m161235b(this.f100109c, d7Var));
    }
}
