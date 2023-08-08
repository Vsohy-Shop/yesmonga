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
import com.google.android.gms.maps.internal.C30471d;
import com.google.android.gms.maps.internal.C30519p1;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

@C40974d0
/* renamed from: com.google.android.gms.maps.t */
public final class C30621t extends C41012a<C30619s> {

    /* renamed from: e */
    public final Fragment f73160e;

    /* renamed from: f */
    public C41020g<C30619s> f73161f;

    /* renamed from: g */
    public Activity f73162g;

    /* renamed from: h */
    public final List<C30447f> f73163h = new ArrayList();

    @C40974d0
    public C30621t(Fragment fragment) {
        this.f73160e = fragment;
    }

    /* renamed from: v */
    public static /* synthetic */ void m123361v(C30621t tVar, Activity activity) {
        tVar.f73162g = activity;
        tVar.mo86710x();
    }

    /* renamed from: a */
    public final void mo85974a(C41020g<C30619s> gVar) {
        this.f73161f = gVar;
        mo86710x();
    }

    /* renamed from: w */
    public final void mo86709w(C30447f fVar) {
        if (mo134796b() != null) {
            ((C30619s) mo134796b()).mo86207e(fVar);
        } else {
            this.f73163h.add(fVar);
        }
    }

    /* renamed from: x */
    public final void mo86710x() {
        if (this.f73162g != null && this.f73161f != null && mo134796b() == null) {
            try {
                MapsInitializer.m122289a(this.f73162g);
                C30471d c5 = C30519p1.m122785a(this.f73162g, (MapsInitializer.Renderer) null).mo86219c5(C41019f.m166811T6(this.f73162g));
                if (c5 != null) {
                    this.f73161f.mo134837a(new C30619s(this.f73160e, c5));
                    for (C30447f e : this.f73163h) {
                        ((C30619s) mo134796b()).mo86207e(e);
                    }
                    this.f73163h.clear();
                }
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
