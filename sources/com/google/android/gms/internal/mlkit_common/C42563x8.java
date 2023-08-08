package com.google.android.gms.internal.mlkit_common;

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

/* renamed from: com.google.android.gms.internal.mlkit_common.x8 */
public final class C42563x8 implements C42466o8 {
    @C0363p0

    /* renamed from: a */
    public C33058b<C40086g<byte[]>> f107444a;

    /* renamed from: b */
    public final C33058b<C40086g<byte[]>> f107445b;

    /* renamed from: c */
    public final C42400i8 f107446c;

    public C42563x8(Context context, C42400i8 i8Var) {
        this.f107446c = i8Var;
        C40042a aVar = C40042a.f102080j;
        C40323w.m163831f(context);
        C40087h g = C40323w.m163829c().mo132985g(aVar);
        if (aVar.mo132554a().contains(C40041c.m163048b("json"))) {
            this.f107444a = new C32611y(new C42543v8(g));
        }
        this.f107445b = new C32611y(new C42553w8(g));
    }

    @C0344h1
    /* renamed from: b */
    public static C40083d<byte[]> m171693b(C42400i8 i8Var, C42378g8 g8Var) {
        return C40083d.m163242g(g8Var.mo137695b(i8Var.mo137641a(), false));
    }

    /* renamed from: a */
    public final void mo137721a(C42378g8 g8Var) {
        if (this.f107446c.mo137641a() == 0) {
            C33058b<C40086g<byte[]>> bVar = this.f107444a;
            if (bVar != null) {
                bVar.get().mo132667b(m171693b(this.f107446c, g8Var));
                return;
            }
            return;
        }
        this.f107445b.get().mo132667b(m171693b(this.f107446c, g8Var));
    }
}
