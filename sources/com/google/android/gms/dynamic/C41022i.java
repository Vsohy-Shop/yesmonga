package com.google.android.gms.dynamic;

import java.util.Iterator;

/* renamed from: com.google.android.gms.dynamic.i */
public final class C41022i implements C41020g {

    /* renamed from: a */
    public final /* synthetic */ C41012a f104299a;

    public C41022i(C41012a aVar) {
        this.f104299a = aVar;
    }

    /* renamed from: a */
    public final void mo134837a(C41018e eVar) {
        this.f104299a.f104292a = eVar;
        Iterator it = this.f104299a.f104294c.iterator();
        while (it.hasNext()) {
            ((C41029p) it.next()).mo134838a(this.f104299a.f104292a);
        }
        this.f104299a.f104294c.clear();
        this.f104299a.f104293b = null;
    }
}
