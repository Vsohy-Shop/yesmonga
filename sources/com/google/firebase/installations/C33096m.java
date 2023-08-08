package com.google.firebase.installations;

import com.google.android.gms.tasks.C31049l;
import com.google.firebase.installations.local.C33094c;

/* renamed from: com.google.firebase.installations.m */
public class C33096m implements C33113r {

    /* renamed from: a */
    public final C33124s f80286a;

    /* renamed from: b */
    public final C31049l<C33098o> f80287b;

    public C33096m(C33124s sVar, C31049l<C33098o> lVar) {
        this.f80286a = sVar;
        this.f80287b = lVar;
    }

    /* renamed from: a */
    public boolean mo95865a(Exception exc) {
        this.f80287b.mo87744d(exc);
        return true;
    }

    /* renamed from: b */
    public boolean mo95866b(C33094c cVar) {
        if (!cVar.mo95856k() || this.f80286a.mo95911f(cVar)) {
            return false;
        }
        this.f80287b.mo87743c(C33098o.m133535a().mo95783b(cVar.mo95828b()).mo95785d(cVar.mo95829c()).mo95784c(cVar.mo95835h()).mo95782a());
        return true;
    }
}
