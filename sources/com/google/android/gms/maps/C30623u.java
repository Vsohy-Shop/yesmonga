package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.C30463b;
import com.google.android.gms.maps.internal.C30472d0;

/* renamed from: com.google.android.gms.maps.u */
public final class C30623u extends C30472d0 {

    /* renamed from: n */
    public final /* synthetic */ C30447f f73165n;

    public C30623u(C30625v vVar, C30447f fVar) {
        this.f73165n = fVar;
    }

    /* renamed from: L5 */
    public final void mo86009L5(C30463b bVar) throws RemoteException {
        this.f73165n.onMapReady(new C30412c(bVar));
    }
}
