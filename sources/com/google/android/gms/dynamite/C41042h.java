package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.h */
public final class C41042h implements DynamiteModule.C41032a {
    /* renamed from: a */
    public final DynamiteModule.C41032a.C41034b mo134843a(Context context, String str, DynamiteModule.C41032a.C41033a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.C41032a.C41034b bVar = new DynamiteModule.C41032a.C41034b();
        int a = aVar.mo134844a(context, str, true);
        bVar.f104338b = a;
        if (a != 0) {
            bVar.f104339c = 1;
        } else {
            int b = aVar.mo134845b(context, str);
            bVar.f104337a = b;
            if (b != 0) {
                bVar.f104339c = -1;
            }
        }
        return bVar;
    }
}
