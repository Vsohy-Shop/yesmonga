package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.v5 */
public class C14792v5 {

    /* renamed from: g */
    public static final Bitmap f36679g = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);

    /* renamed from: h */
    public static final C14793a f36680h = new C14793a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public Bitmap f36681a;

    /* renamed from: b */
    public final Paint f36682b;

    /* renamed from: c */
    public final Rect f36683c;

    /* renamed from: d */
    public final Rect f36684d;

    /* renamed from: e */
    public final C14442j5 f36685e;

    /* renamed from: f */
    public final Canvas f36686f;

    /* renamed from: com.contentsquare.android.sdk.v5$a */
    public static final class C14793a {
        public C14793a() {
        }

        public /* synthetic */ C14793a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14792v5(int i, int i2) {
        this(i, i2, (C14442j5) null, (Canvas) null, 12, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final Bitmap mo36618a() {
        return this.f36681a;
    }

    /* renamed from: b */
    public final void mo36619b(int i, int i2) {
        String str;
        Bitmap bitmap;
        if (!(i == this.f36681a.getWidth() && i2 == this.f36681a.getHeight())) {
            if (i < 1 || i2 < 1) {
                bitmap = f36679g;
                str = "DEFAULT_BITMAP";
            } else {
                try {
                    this.f36681a.reconfigure(i, i2, Bitmap.Config.ARGB_8888);
                } catch (IllegalArgumentException unused) {
                    bitmap = this.f36685e.mo35616a(i, i2, Bitmap.Config.ARGB_8888);
                    str = "bitmapInstantiable.creat… Bitmap.Config.ARGB_8888)";
                }
                this.f36686f.setBitmap(this.f36681a);
            }
            Intrinsics.checkNotNullExpressionValue(bitmap, str);
            this.f36681a = bitmap;
            this.f36686f.setBitmap(this.f36681a);
        }
        this.f36681a.eraseColor(0);
    }

    /* renamed from: c */
    public final void mo36620c(Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmapSource");
        mo36623f(bitmap, i, i2, this.f36682b);
    }

    /* renamed from: d */
    public final void mo36621d(Bitmap bitmap, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmapSource");
        mo36619b(i, i2);
        this.f36681a.eraseColor(i3);
        this.f36684d.set(0, 0, i, i2);
        this.f36686f.drawBitmap(bitmap, (Rect) null, this.f36684d, this.f36682b);
    }

    /* renamed from: e */
    public final void mo36622e(Bitmap bitmap, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmapSource");
        mo36619b(i3, i4);
        this.f36683c.set(i, i2, i + i3, i2 + i4);
        this.f36684d.set(0, 0, i3, i4);
        this.f36686f.drawBitmap(bitmap, this.f36683c, this.f36684d, this.f36682b);
    }

    /* renamed from: f */
    public final void mo36623f(Bitmap bitmap, int i, int i2, Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmapSource");
        Intrinsics.checkNotNullParameter(paint, "paint");
        mo36619b(i, i2);
        this.f36684d.set(0, 0, i, i2);
        this.f36686f.drawBitmap(bitmap, (Rect) null, this.f36684d, paint);
    }

    /* renamed from: g */
    public final void mo36624g(View view, float f) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        float f2 = 1.0f / f;
        Canvas canvas = this.f36686f;
        canvas.save();
        canvas.translate((float) view.getScrollX(), (float) view.getScrollY());
        canvas.scale(f2, f2);
        view.draw(canvas);
        canvas.restore();
    }

    /* renamed from: h */
    public final Canvas mo36625h() {
        return this.f36686f;
    }

    /* renamed from: i */
    public final Rect mo36626i() {
        return this.f36684d;
    }

    /* renamed from: j */
    public final Rect mo36627j() {
        return this.f36683c;
    }

    public C14792v5(int i, int i2, C14442j5 j5Var, Canvas canvas) {
        Intrinsics.checkNotNullParameter(j5Var, "bitmapInstantiable");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f36685e = j5Var;
        this.f36686f = canvas;
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        C11079d2 d2Var = C11079d2.f28267a;
        this.f36682b = paint;
        this.f36683c = new Rect();
        this.f36684d = new Rect();
        Bitmap a = j5Var.mo35616a(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(a, "bitmapInstantiable.creat… Bitmap.Config.ARGB_8888)");
        this.f36681a = a;
        canvas.setBitmap(a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14792v5(int i, int i2, C14442j5 j5Var, Canvas canvas, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? new C14442j5() : j5Var, (i3 & 8) != 0 ? new Canvas() : canvas);
    }
}
