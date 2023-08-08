package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;

/* renamed from: com.contentsquare.android.sdk.s4 */
public class C14696s4 {
    /* renamed from: a */
    public static Bitmap m63369a(View view) {
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        boolean willNotCacheDrawing = view.willNotCacheDrawing();
        boolean willNotDraw = view.willNotDraw();
        view.setDrawingCacheEnabled(true);
        view.setWillNotCacheDrawing(false);
        view.setWillNotDraw(false);
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        Bitmap createBitmap = drawingCache == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : drawingCache.copy(Bitmap.Config.ARGB_8888, false);
        view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        view.setWillNotCacheDrawing(willNotCacheDrawing);
        view.setWillNotDraw(willNotDraw);
        return createBitmap;
    }

    /* renamed from: b */
    public static String m63370b(Bitmap bitmap) {
        return (bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0) ? "" : m63371c(m63372d(bitmap).toByteArray());
    }

    /* renamed from: c */
    public static String m63371c(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: d */
    public static ByteArrayOutputStream m63372d(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* renamed from: e */
    public static byte[] m63373e(View view) {
        return (view.getHeight() <= 0 || view.getWidth() <= 0) ? new byte[0] : m63372d(m63369a(view)).toByteArray();
    }
}
