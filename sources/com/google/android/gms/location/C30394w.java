package com.google.android.gms.location;

import android.location.Location;
import com.google.android.gms.tasks.C31031c;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.location.w */
public final /* synthetic */ class C30394w implements C31031c {

    /* renamed from: a */
    public final C31049l f72860a;

    public C30394w(C31049l lVar) {
        this.f72860a = lVar;
    }

    /* renamed from: a */
    public final Object mo85756a(C31047k kVar) {
        C31049l lVar = this.f72860a;
        if (kVar.mo87738v()) {
            lVar.mo87745e((Location) kVar.mo87734r());
        } else {
            Exception q = kVar.mo87733q();
            if (q != null) {
                lVar.mo87742b(q);
            }
        }
        return lVar.mo87741a();
    }
}
