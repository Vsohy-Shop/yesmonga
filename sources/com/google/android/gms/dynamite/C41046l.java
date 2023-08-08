package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.l */
public final class C41046l implements DynamiteModule.C41032a {
    /* renamed from: a */
    public final DynamiteModule.C41032a.C41034b mo134843a(Context context, String str, DynamiteModule.C41032a.C41033a aVar) throws DynamiteModule.LoadingException {
        int i;
        DynamiteModule.C41032a.C41034b bVar = new DynamiteModule.C41032a.C41034b();
        int b = aVar.mo134845b(context, str);
        bVar.f104337a = b;
        int i2 = 0;
        if (b != 0) {
            i = aVar.mo134844a(context, str, false);
            bVar.f104338b = i;
        } else {
            i = aVar.mo134844a(context, str, true);
            bVar.f104338b = i;
        }
        int i3 = bVar.f104337a;
        if (i3 != 0) {
            i2 = i3;
        } else if (i == 0) {
            bVar.f104339c = 0;
            return bVar;
        }
        if (i2 >= i) {
            bVar.f104339c = -1;
        } else {
            bVar.f104339c = 1;
        }
        return bVar;
    }
}
