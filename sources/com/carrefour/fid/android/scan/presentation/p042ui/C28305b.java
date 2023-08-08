package com.carrefour.fid.android.scan.presentation.p042ui;

import android.view.View;
import androidx.camera.core.C1641m;
import androidx.camera.core.CameraControl;

/* renamed from: com.carrefour.fid.android.scan.presentation.ui.b */
public final /* synthetic */ class C28305b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C1641m f68468a;

    /* renamed from: b */
    public final /* synthetic */ CameraControl f68469b;

    public /* synthetic */ C28305b(C1641m mVar, CameraControl cameraControl) {
        this.f68468a = mVar;
        this.f68469b = cameraControl;
    }

    public final void onClick(View view) {
        CouponsBarcodeScannerFragment.m118244Z0(this.f68468a, this.f68469b, view);
    }
}
