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
import com.google.android.gms.maps.internal.C30471d;
import com.google.android.gms.maps.internal.C30519p1;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

@C40974d0
/* renamed from: com.google.android.gms.maps.k0 */
public final class C30561k0 extends C41012a<C30554j0> {

    /* renamed from: e */
    public final Fragment f72978e;

    /* renamed from: f */
    public C41020g<C30554j0> f72979f;

    /* renamed from: g */
    public Activity f72980g;

    /* renamed from: h */
    public final List<C30447f> f72981h = new ArrayList();

    @C40974d0
    public C30561k0(Fragment fragment) {
        this.f72978e = fragment;
    }

    /* renamed from: v */
    public static /* synthetic */ void m122971v(C30561k0 k0Var, Activity activity) {
        k0Var.f72980g = activity;
        k0Var.mo86263x();
    }

    /* renamed from: a */
    public final void mo85974a(C41020g<C30554j0> gVar) {
        this.f72979f = gVar;
        mo86263x();
    }

    /* renamed from: w */
    public final void mo86262w(C30447f fVar) {
        if (mo134796b() != null) {
            ((C30554j0) mo134796b()).mo86207e(fVar);
        } else {
            this.f72981h.add(fVar);
        }
    }

    /* renamed from: x */
    public final void mo86263x() {
        if (this.f72980g != null && this.f72979f != null && mo134796b() == null) {
            try {
                MapsInitializer.m122289a(this.f72980g);
                C30471d c5 = C30519p1.m122785a(this.f72980g, (MapsInitializer.Renderer) null).mo86219c5(C41019f.m166811T6(this.f72980g));
                if (c5 != null) {
                    this.f72979f.mo134837a(new C30554j0(this.f72978e, c5));
                    for (C30447f e : this.f72981h) {
                        ((C30554j0) mo134796b()).mo86207e(e);
                    }
                    this.f72981h.clear();
                }
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
