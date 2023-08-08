package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.maps.internal.C30479f;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: com.google.android.gms.maps.i */
public final class C30456i {

    /* renamed from: a */
    public final C30479f f72968a;

    public C30456i(C30479f fVar) {
        this.f72968a = fVar;
    }

    @C0359n0
    /* renamed from: a */
    public LatLng mo86006a(@C0359n0 Point point) {
        C40843u.m166202l(point);
        try {
            return this.f72968a.mo86133n4(C41019f.m166811T6(point));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: b */
    public VisibleRegion mo86007b() {
        try {
            return this.f72968a.mo86134z2();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: c */
    public Point mo86008c(@C0359n0 LatLng latLng) {
        C40843u.m166202l(latLng);
        try {
            return (Point) C41019f.m166810O0(this.f72968a.mo86132b2(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
