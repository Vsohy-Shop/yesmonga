package com.google.android.gms.location;

import com.google.android.gms.tasks.C31031c;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.location.u */
public final /* synthetic */ class C30388u implements C31031c {

    /* renamed from: a */
    public final C31049l f72854a;

    public C30388u(C31049l lVar) {
        this.f72854a = lVar;
    }

    /* renamed from: a */
    public final Object mo85756a(C31047k kVar) {
        C31049l lVar = this.f72854a;
        if (!kVar.mo87738v()) {
            if (kVar.mo87733q() != null) {
                Exception q = kVar.mo87733q();
                if (q != null) {
                    lVar.mo87742b(q);
                }
            } else {
                lVar.mo87745e(null);
            }
        }
        return lVar.mo87741a();
    }
}
