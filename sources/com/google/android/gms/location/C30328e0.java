package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.internal.location.C41811z;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.location.e0 */
public final class C30328e0 extends C30351j0 {

    /* renamed from: b */
    public final /* synthetic */ C40592n f72778b;

    /* renamed from: c */
    public final /* synthetic */ C30327e f72779c;

    public C30328e0(C30327e eVar, C40592n nVar) {
        this.f72779c = eVar;
        this.f72778b = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85637a(Object obj, Object obj2) throws RemoteException {
        C41811z zVar = (C41811z) obj;
        C31049l lVar = (C31049l) obj2;
        if (mo85725b()) {
            C30335f0 f0Var = new C30335f0(this.f72779c, lVar);
            try {
                C40592n.C40593a b = this.f72778b.mo133987b();
                if (b != null) {
                    zVar.mo136250C0(b, f0Var);
                }
            } catch (RuntimeException e) {
                lVar.mo87744d(e);
            }
        }
    }
}
