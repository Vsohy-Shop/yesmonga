package com.carrefour.fid.android.presentation.p035ui.gazStation;

import android.hardware.Camera;

/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.h */
public final /* synthetic */ class C24029h implements Camera.PictureCallback {

    /* renamed from: a */
    public final /* synthetic */ ServiceStationsCameraFragment f60272a;

    public /* synthetic */ C24029h(ServiceStationsCameraFragment serviceStationsCameraFragment) {
        this.f60272a = serviceStationsCameraFragment;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        ServiceStationsCameraFragment.m105944d1(this.f60272a, bArr, camera);
    }
}
