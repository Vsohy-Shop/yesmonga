package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.C30463b;
import com.google.android.gms.maps.internal.C30472d0;

/* renamed from: com.google.android.gms.maps.r */
public final class C30617r extends C30472d0 {

    /* renamed from: n */
    public final /* synthetic */ C30447f f73155n;

    public C30617r(C30619s sVar, C30447f fVar) {
        this.f73155n = fVar;
    }

    /* renamed from: L5 */
    public final void mo86009L5(C30463b bVar) throws RemoteException {
        this.f73155n.onMapReady(new C30412c(bVar));
    }
}
