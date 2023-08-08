package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import android.view.SurfaceView;
import com.contentsquare.android.sdk.C14893yb;

/* renamed from: com.contentsquare.android.sdk.oc */
public final /* synthetic */ class C14598oc implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a */
    public final /* synthetic */ C14619pc f36111a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceView f36112b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f36113c;

    /* renamed from: d */
    public final /* synthetic */ C14893yb.C14894a f36114d;

    public /* synthetic */ C14598oc(C14619pc pcVar, SurfaceView surfaceView, Bitmap bitmap, C14893yb.C14894a aVar) {
        this.f36111a = pcVar;
        this.f36112b = surfaceView;
        this.f36113c = bitmap;
        this.f36114d = aVar;
    }

    public final void onPixelCopyFinished(int i) {
        this.f36111a.m62962h(this.f36112b, this.f36113c, this.f36114d, i);
    }
}
