package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.C30463b;
import com.google.android.gms.maps.internal.C30472d0;

/* renamed from: com.google.android.gms.maps.i0 */
public final class C30457i0 extends C30472d0 {

    /* renamed from: n */
    public final /* synthetic */ C30447f f72969n;

    public C30457i0(C30554j0 j0Var, C30447f fVar) {
        this.f72969n = fVar;
    }

    /* renamed from: L5 */
    public final void mo86009L5(C30463b bVar) throws RemoteException {
        this.f72969n.onMapReady(new C30412c(bVar));
    }
}
