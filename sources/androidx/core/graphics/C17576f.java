package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.annotation.C0354l;
import androidx.annotation.C0376v0;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.graphics.f */
public final class C17576f {
    @C12579k
    /* renamed from: a */
    public static final Bitmap m80535a(@C12579k Bitmap bitmap, @C12579k C11300l<? super Canvas, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        lVar.invoke(new Canvas(bitmap));
        return bitmap;
    }

    /* renamed from: b */
    public static final boolean m80536b(@C12579k Bitmap bitmap, @C12579k Point point) {
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(point, "p");
        int width = bitmap.getWidth();
        int i2 = point.x;
        if (i2 < 0 || i2 >= width) {
            z = false;
        } else {
            z = true;
        }
        if (!z || (i = point.y) < 0 || i >= bitmap.getHeight()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m80537c(@C12579k Bitmap bitmap, @C12579k PointF pointF) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(pointF, "p");
        float f = pointF.x;
        if (f >= 0.0f && f < ((float) bitmap.getWidth())) {
            float f2 = pointF.y;
            if (f2 < 0.0f || f2 >= ((float) bitmap.getHeight())) {
                return false;
            }
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: d */
    public static final Bitmap m80538d(int i, int i2, @C12579k Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    @C12579k
    /* renamed from: e */
    public static final Bitmap m80539e(int i, int i2, @C12579k Bitmap.Config config, boolean z, @C12579k ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Bitmap a = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        Intrinsics.checkNotNullExpressionValue(a, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return a;
    }

    /* renamed from: f */
    public static /* synthetic */ Bitmap m80540f(int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    /* renamed from: g */
    public static /* synthetic */ Bitmap m80541g(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace, "get(ColorSpace.Named.SRGB)");
        }
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Bitmap a = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        Intrinsics.checkNotNullExpressionValue(a, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return a;
    }

    /* renamed from: h */
    public static final int m80542h(@C12579k Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return bitmap.getPixel(i, i2);
    }

    @C12579k
    /* renamed from: i */
    public static final Bitmap m80543i(@C12579k Bitmap bitmap, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    /* renamed from: j */
    public static /* synthetic */ Bitmap m80544j(Bitmap bitmap, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    /* renamed from: k */
    public static final void m80545k(@C12579k Bitmap bitmap, int i, int i2, @C0354l int i3) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        bitmap.setPixel(i, i2, i3);
    }
}
