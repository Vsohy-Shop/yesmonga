package com.google.android.gms.internal.gtm;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.gtm.lh */
public final class C41408lh implements Comparator<zztd> {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zztd zztd = (zztd) obj;
        zztd zztd2 = (zztd) obj2;
        C41359jh jhVar = new C41359jh(zztd);
        C41359jh jhVar2 = new C41359jh(zztd2);
        while (jhVar.hasNext() && jhVar2.hasNext()) {
            int a = C41384kh.m167960a(jhVar.zza() & 255, jhVar2.zza() & 255);
            if (a != 0) {
                return a;
            }
        }
        return C41384kh.m167960a(zztd.mo136144i(), zztd2.mo136144i());
    }
}
