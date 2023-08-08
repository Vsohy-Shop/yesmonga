package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.x9 */
public final class C14855x9 extends C14792v5 {

    /* renamed from: i */
    public final Paint f36838i;

    /* renamed from: j */
    public final Paint f36839j;

    public C14855x9(int i, int i2) {
        this(i, i2, (C14442j5) null, (Canvas) null, 12, (DefaultConstructorMarker) null);
    }

    /* renamed from: k */
    public final void mo36818k(int i, int i2, int i3, int i4) {
        mo36625h().drawRect((float) i, (float) i2, (float) (i + i3), (float) (i2 + i4), this.f36838i);
    }

    /* renamed from: l */
    public final void mo36819l(Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmapSource");
        int i6 = i3 + i;
        int i7 = i4 + i2;
        mo36627j().set(i / i5, i2 / i5, i6 / i5, i7 / i5);
        mo36626i().set(i, i2, i6, i7);
        mo36625h().drawBitmap(bitmap, mo36627j(), mo36626i(), this.f36839j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14855x9(int i, int i2, C14442j5 j5Var, Canvas canvas) {
        super(i, i2, j5Var, canvas);
        Intrinsics.checkNotNullParameter(j5Var, "bitmapInstantiable");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        C11079d2 d2Var = C11079d2.f28267a;
        this.f36838i = paint;
        Paint paint2 = new Paint();
        paint2.setFilterBitmap(false);
        paint2.setAntiAlias(false);
        this.f36839j = paint2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14855x9(int i, int i2, C14442j5 j5Var, Canvas canvas, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? new C14442j5() : j5Var, (i3 & 8) != 0 ? new Canvas() : canvas);
    }
}
