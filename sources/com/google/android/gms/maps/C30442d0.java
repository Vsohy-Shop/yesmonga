package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
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
/* renamed from: com.google.android.gms.maps.d0 */
public final class C30442d0 extends C41012a<C30438c0> {

    /* renamed from: e */
    public final Fragment f72949e;

    /* renamed from: f */
    public C41020g<C30438c0> f72950f;

    /* renamed from: g */
    public Activity f72951g;

    /* renamed from: h */
    public final List<C30453h> f72952h = new ArrayList();

    @C40974d0
    public C30442d0(Fragment fragment) {
        this.f72949e = fragment;
    }

    /* renamed from: v */
    public static /* synthetic */ void m122446v(C30442d0 d0Var, Activity activity) {
        d0Var.f72951g = activity;
        d0Var.mo85976x();
    }

    /* renamed from: a */
    public final void mo85974a(C41020g<C30438c0> gVar) {
        this.f72950f = gVar;
        mo85976x();
    }

    /* renamed from: w */
    public final void mo85975w(C30453h hVar) {
        if (mo134796b() != null) {
            ((C30438c0) mo134796b()).mo85964d(hVar);
        } else {
            this.f72952h.add(hVar);
        }
    }

    /* renamed from: x */
    public final void mo85976x() {
        if (this.f72951g != null && this.f72950f != null && mo134796b() == null) {
            try {
                MapsInitializer.m122289a(this.f72951g);
                this.f72950f.mo134837a(new C30438c0(this.f72949e, C30519p1.m122785a(this.f72951g, (MapsInitializer.Renderer) null).mo86222g6(C41019f.m166811T6(this.f72951g))));
                for (C30453h d : this.f72952h) {
                    ((C30438c0) mo134796b()).mo85964d(d);
                }
                this.f72952h.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
