package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import androidx.core.util.C17994n;
import com.contentsquare.android.sdk.C14893yb;

/* renamed from: com.contentsquare.android.sdk.nc */
public final /* synthetic */ class C14551nc implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a */
    public final /* synthetic */ C14619pc f36024a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f36025b;

    /* renamed from: c */
    public final /* synthetic */ C17994n f36026c;

    /* renamed from: d */
    public final /* synthetic */ C14893yb.C14894a f36027d;

    public /* synthetic */ C14551nc(C14619pc pcVar, Bitmap bitmap, C17994n nVar, C14893yb.C14894a aVar) {
        this.f36024a = pcVar;
        this.f36025b = bitmap;
        this.f36026c = nVar;
        this.f36027d = aVar;
    }

    public final void onPixelCopyFinished(int i) {
        this.f36024a.m62961g(this.f36025b, this.f36026c, this.f36027d, i);
    }
}
