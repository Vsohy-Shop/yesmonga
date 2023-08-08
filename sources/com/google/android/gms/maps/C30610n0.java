package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.dynamic.C41012a;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.dynamic.C41020g;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.internal.C30519p1;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

@C40974d0
/* renamed from: com.google.android.gms.maps.n0 */
public final class C30610n0 extends C41012a<C30567m0> {

    /* renamed from: e */
    public final Fragment f73146e;

    /* renamed from: f */
    public C41020g<C30567m0> f73147f;

    /* renamed from: g */
    public Activity f73148g;

    /* renamed from: h */
    public final List<C30453h> f73149h = new ArrayList();

    @C40974d0
    public C30610n0(Fragment fragment) {
        this.f73146e = fragment;
    }

    /* renamed from: v */
    public static /* synthetic */ void m123333v(C30610n0 n0Var, Activity activity) {
        n0Var.f73148g = activity;
        n0Var.mo86704x();
    }

    /* renamed from: a */
    public final void mo85974a(C41020g<C30567m0> gVar) {
        this.f73147f = gVar;
        mo86704x();
    }

    /* renamed from: w */
    public final void mo86703w(C30453h hVar) {
        if (mo134796b() != null) {
            ((C30567m0) mo134796b()).mo85964d(hVar);
        } else {
            this.f73149h.add(hVar);
        }
    }

    /* renamed from: x */
    public final void mo86704x() {
        if (this.f73148g != null && this.f73147f != null && mo134796b() == null) {
            try {
                MapsInitializer.m122289a(this.f73148g);
                this.f73147f.mo134837a(new C30567m0(this.f73146e, C30519p1.m122785a(this.f73148g, (MapsInitializer.Renderer) null).mo86222g6(C41019f.m166811T6(this.f73148g))));
                for (C30453h d : this.f73149h) {
                    ((C30567m0) mo134796b()).mo85964d(d);
                }
                this.f73149h.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
