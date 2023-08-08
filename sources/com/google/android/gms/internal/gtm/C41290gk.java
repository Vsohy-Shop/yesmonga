package com.google.android.gms.internal.gtm;

import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.gk */
public final class C41290gk extends C41338ik {
    public /* synthetic */ C41290gk(C41266fk fkVar) {
        super((C41314hk) null);
    }

    /* renamed from: a */
    public final <L> List<L> mo135347a(Object obj, long j) {
        int i;
        C41626uj ujVar = (C41626uj) C41340im.m167753k(obj, j);
        if (ujVar.mo135928d()) {
            return ujVar;
        }
        int size = ujVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        C41626uj n = ujVar.mo135130n(i);
        C41340im.m167766x(obj, j, n);
        return n;
    }

    /* renamed from: b */
    public final void mo135348b(Object obj, long j) {
        ((C41626uj) C41340im.m167753k(obj, j)).zzb();
    }

    /* renamed from: c */
    public final <E> void mo135349c(Object obj, Object obj2, long j) {
        C41626uj ujVar = (C41626uj) C41340im.m167753k(obj, j);
        C41626uj ujVar2 = (C41626uj) C41340im.m167753k(obj2, j);
        int size = ujVar.size();
        int size2 = ujVar2.size();
        if (size > 0 && size2 > 0) {
            if (!ujVar.mo135928d()) {
                ujVar = ujVar.mo135130n(size2 + size);
            }
            ujVar.addAll(ujVar2);
        }
        if (size > 0) {
            ujVar2 = ujVar;
        }
        C41340im.m167766x(obj, j, ujVar2);
    }

    public C41290gk() {
        super((C41314hk) null);
    }
}
