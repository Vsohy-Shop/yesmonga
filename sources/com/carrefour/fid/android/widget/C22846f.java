package com.carrefour.fid.android.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.pdf.PdfRenderer;
import com.ortiz.touchview.TouchImageView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.carrefour.fid.android.widget.f */
public final class C22846f {
    /* renamed from: d */
    public static final Bitmap m103127d(PdfRenderer.Page page, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(i, (int) ((((float) i) / ((float) page.getWidth())) * ((float) page.getHeight())), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "bitmap");
        return createBitmap;
    }

    /* renamed from: e */
    public static final void m103128e(TouchImageView touchImageView) {
        touchImageView.setOnTouchListener(new C22845e(touchImageView));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r5 != 2) goto L_0x0036;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m103129f(com.ortiz.touchview.TouchImageView r3, android.view.View r4, android.view.MotionEvent r5) {
        /*
            java.lang.String r0 = "$this_initTouchListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r5.getPointerCount()
            r1 = 1
            r2 = 2
            if (r0 >= r2) goto L_0x001a
            boolean r0 = r3.canScrollVertically(r1)
            if (r0 == 0) goto L_0x0036
            r0 = -1
            boolean r0 = r3.canScrollVertically(r0)
            if (r0 == 0) goto L_0x0036
        L_0x001a:
            int r5 = r5.getAction()
            r0 = 0
            if (r5 == 0) goto L_0x002e
            if (r5 == r1) goto L_0x0026
            if (r5 == r2) goto L_0x002e
            goto L_0x0036
        L_0x0026:
            android.view.ViewParent r3 = r3.getParent()
            r3.requestDisallowInterceptTouchEvent(r0)
            goto L_0x0036
        L_0x002e:
            android.view.ViewParent r3 = r3.getParent()
            r3.requestDisallowInterceptTouchEvent(r1)
            r1 = r0
        L_0x0036:
            r4.performClick()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.widget.C22846f.m103129f(com.ortiz.touchview.TouchImageView, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        kotlin.jdk7.C11281a.m43403a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        throw r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap m103130g(android.graphics.pdf.PdfRenderer.Page r2, int r3) {
        /*
            android.graphics.Bitmap r3 = m103127d(r2, r3)     // Catch:{ all -> 0x000d }
            r0 = 1
            r1 = 0
            r2.render(r3, r1, r1, r0)     // Catch:{ all -> 0x000d }
            kotlin.jdk7.C11281a.m43403a(r2, r1)
            return r3
        L_0x000d:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x000f }
        L_0x000f:
            r0 = move-exception
            kotlin.jdk7.C11281a.m43403a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.widget.C22846f.m103130g(android.graphics.pdf.PdfRenderer$Page, int):android.graphics.Bitmap");
    }
}
