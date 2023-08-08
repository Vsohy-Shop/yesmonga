package com.google.firebase.installations;

import com.google.android.gms.tasks.C31049l;
import com.google.firebase.installations.local.C33094c;

/* renamed from: com.google.firebase.installations.n */
public class C33097n implements C33113r {

    /* renamed from: a */
    public final C31049l<String> f80288a;

    public C33097n(C31049l<String> lVar) {
        this.f80288a = lVar;
    }

    /* renamed from: a */
    public boolean mo95865a(Exception exc) {
        return false;
    }

    /* renamed from: b */
    public boolean mo95866b(C33094c cVar) {
        if (!cVar.mo95857l() && !cVar.mo95856k() && !cVar.mo95854i()) {
            return false;
        }
        this.f80288a.mo87745e(cVar.mo95830d());
        return true;
    }
}
