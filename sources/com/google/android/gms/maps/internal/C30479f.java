package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: com.google.android.gms.maps.internal.f */
public interface C30479f extends IInterface {
    @C0359n0
    /* renamed from: b2 */
    C41016d mo86132b2(@C0359n0 LatLng latLng) throws RemoteException;

    @C0359n0
    /* renamed from: n4 */
    LatLng mo86133n4(@C0359n0 C41016d dVar) throws RemoteException;

    @C0359n0
    /* renamed from: z2 */
    VisibleRegion mo86134z2() throws RemoteException;
}
