package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.Window;

/* renamed from: com.contentsquare.android.sdk.j2 */
public class C14438j2 {
    /* renamed from: a */
    public void mo35583a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
        PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
    }

    /* renamed from: b */
    public void mo35584b(Window window, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
        PixelCopy.request(window, (Rect) null, bitmap, onPixelCopyFinishedListener, handler);
    }
}
