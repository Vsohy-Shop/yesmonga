package androidx.compose.p004ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.p004ui.graphics.C15410x2;
import androidx.compose.p004ui.graphics.colorspace.C15138c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.k0 */
public final class C15247k0 {
    @C12579k
    /* renamed from: a */
    public static final C15403w2 m66137a(int i, int i2, int i3, boolean z, @C12579k C15138c cVar) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(cVar, "colorSpace");
        Bitmap.Config d = m66140d(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmap = C15319t1.m66555c(i, i2, i3, z, cVar);
        } else {
            bitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, d);
            Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            bitmap.setHasAlpha(z);
        }
        return new C15227i0(bitmap);
    }

    @C12579k
    /* renamed from: b */
    public static final Bitmap m66138b(@C12579k C15403w2 w2Var) {
        Intrinsics.checkNotNullParameter(w2Var, "<this>");
        if (w2Var instanceof C15227i0) {
            return ((C15227i0) w2Var).mo42790g();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @C12579k
    /* renamed from: c */
    public static final C15403w2 m66139c(@C12579k Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return new C15227i0(bitmap);
    }

    @C12579k
    /* renamed from: d */
    public static final Bitmap.Config m66140d(int i) {
        C15410x2.C15411a aVar = C15410x2.f38097b;
        if (C15410x2.m67287i(i, aVar.mo43577b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (C15410x2.m67287i(i, aVar.mo43576a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (C15410x2.m67287i(i, aVar.mo43580e())) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && C15410x2.m67287i(i, aVar.mo43578c())) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i2 < 26 || !C15410x2.m67287i(i, aVar.mo43579d())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.HARDWARE;
    }

    /* renamed from: e */
    public static final int m66141e(@C12579k Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "<this>");
        if (config == Bitmap.Config.ALPHA_8) {
            return C15410x2.f38097b.mo43576a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return C15410x2.f38097b.mo43580e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return C15410x2.f38097b.mo43577b();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && config == Bitmap.Config.RGBA_F16) {
            return C15410x2.f38097b.mo43578c();
        }
        if (i < 26 || config != Bitmap.Config.HARDWARE) {
            return C15410x2.f38097b.mo43577b();
        }
        return C15410x2.f38097b.mo43579d();
    }
}
