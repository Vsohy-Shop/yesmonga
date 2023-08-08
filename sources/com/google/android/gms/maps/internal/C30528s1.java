package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.internal.maps.C41841s;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.maps.internal.s1 */
public interface C30528s1 extends IInterface {
    /* renamed from: F7 */
    C30475e mo86217F7(C41016d dVar, @Nullable GoogleMapOptions googleMapOptions) throws RemoteException;

    /* renamed from: Q5 */
    void mo86218Q5(C41016d dVar, int i) throws RemoteException;

    /* renamed from: c5 */
    C30471d mo86219c5(C41016d dVar) throws RemoteException;

    /* renamed from: e */
    int mo86220e() throws RemoteException;

    /* renamed from: f */
    C30459a mo86221f() throws RemoteException;

    /* renamed from: g6 */
    C30487h mo86222g6(C41016d dVar) throws RemoteException;

    /* renamed from: p */
    C41841s mo86223p() throws RemoteException;

    /* renamed from: s3 */
    C30491i mo86224s3(C41016d dVar, @Nullable StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException;

    /* renamed from: w5 */
    void mo86225w5(C41016d dVar, int i) throws RemoteException;
}
