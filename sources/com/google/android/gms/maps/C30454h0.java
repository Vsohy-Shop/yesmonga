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
import com.google.android.gms.maps.internal.C30519p1;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

@C40974d0
/* renamed from: com.google.android.gms.maps.h0 */
public final class C30454h0 extends C41012a<C30451g0> {

    /* renamed from: e */
    public final ViewGroup f72962e;

    /* renamed from: f */
    public final Context f72963f;

    /* renamed from: g */
    public C41020g<C30451g0> f72964g;
    @C0363p0

    /* renamed from: h */
    public final StreetViewPanoramaOptions f72965h;

    /* renamed from: i */
    public final List<C30453h> f72966i = new ArrayList();

    @C40974d0
    public C30454h0(ViewGroup viewGroup, Context context, @C0363p0 StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.f72962e = viewGroup;
        this.f72963f = context;
        this.f72965h = streetViewPanoramaOptions;
    }

    /* renamed from: a */
    public final void mo85974a(C41020g<C30451g0> gVar) {
        this.f72964g = gVar;
        mo86004w();
    }

    /* renamed from: v */
    public final void mo86003v(C30453h hVar) {
        if (mo134796b() != null) {
            ((C30451g0) mo134796b()).mo85964d(hVar);
        } else {
            this.f72966i.add(hVar);
        }
    }

    /* renamed from: w */
    public final void mo86004w() {
        if (this.f72964g != null && mo134796b() == null) {
            try {
                MapsInitializer.m122289a(this.f72963f);
                this.f72964g.mo134837a(new C30451g0(this.f72962e, C30519p1.m122785a(this.f72963f, (MapsInitializer.Renderer) null).mo86224s3(C41019f.m166811T6(this.f72963f), this.f72965h)));
                for (C30453h d : this.f72966i) {
                    ((C30451g0) mo134796b()).mo85964d(d);
                }
                this.f72966i.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
