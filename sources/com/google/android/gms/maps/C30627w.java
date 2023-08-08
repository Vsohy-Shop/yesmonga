package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.dynamic.C41012a;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.dynamic.C41020g;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.internal.C30475e;
import com.google.android.gms.maps.internal.C30519p1;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

@C40974d0
/* renamed from: com.google.android.gms.maps.w */
public final class C30627w extends C41012a<C30625v> {

    /* renamed from: e */
    public final ViewGroup f73171e;

    /* renamed from: f */
    public final Context f73172f;

    /* renamed from: g */
    public C41020g<C30625v> f73173g;
    @C0363p0

    /* renamed from: h */
    public final GoogleMapOptions f73174h;

    /* renamed from: i */
    public final List<C30447f> f73175i = new ArrayList();

    @C40974d0
    public C30627w(ViewGroup viewGroup, Context context, @C0363p0 GoogleMapOptions googleMapOptions) {
        this.f73171e = viewGroup;
        this.f73172f = context;
        this.f73174h = googleMapOptions;
    }

    /* renamed from: a */
    public final void mo85974a(C41020g<C30625v> gVar) {
        this.f73173g = gVar;
        mo86714w();
    }

    /* renamed from: v */
    public final void mo86713v(C30447f fVar) {
        if (mo134796b() != null) {
            ((C30625v) mo134796b()).mo86207e(fVar);
        } else {
            this.f73175i.add(fVar);
        }
    }

    /* renamed from: w */
    public final void mo86714w() {
        if (this.f73173g != null && mo134796b() == null) {
            try {
                MapsInitializer.m122289a(this.f73172f);
                C30475e F7 = C30519p1.m122785a(this.f73172f, (MapsInitializer.Renderer) null).mo86217F7(C41019f.m166811T6(this.f73172f), this.f73174h);
                if (F7 != null) {
                    this.f73173g.mo134837a(new C30625v(this.f73171e, F7));
                    for (C30447f e : this.f73175i) {
                        ((C30625v) mo134796b()).mo86207e(e);
                    }
                    this.f73175i.clear();
                }
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
