package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.m */
public final class C41047m implements DynamiteModule.C41032a {
    /* renamed from: a */
    public final DynamiteModule.C41032a.C41034b mo134843a(Context context, String str, DynamiteModule.C41032a.C41033a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.C41032a.C41034b bVar = new DynamiteModule.C41032a.C41034b();
        bVar.f104337a = aVar.mo134845b(context, str);
        int a = aVar.mo134844a(context, str, true);
        bVar.f104338b = a;
        int i = bVar.f104337a;
        if (i == 0) {
            i = 0;
            if (a == 0) {
                bVar.f104339c = 0;
                return bVar;
            }
        }
        if (a >= i) {
            bVar.f104339c = 1;
        } else {
            bVar.f104339c = -1;
        }
        return bVar;
    }
}
