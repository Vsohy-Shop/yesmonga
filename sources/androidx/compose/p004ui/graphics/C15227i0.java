package androidx.compose.p004ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.p004ui.graphics.colorspace.C15138c;
import androidx.compose.p004ui.graphics.colorspace.C15144g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.i0 */
public final class C15227i0 implements C15403w2 {
    @C12579k

    /* renamed from: b */
    public final Bitmap f37535b;

    public C15227i0(@C12579k Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f37535b = bitmap;
    }

    /* renamed from: b */
    public void mo42785b(@C12579k int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr2 = iArr;
        Intrinsics.checkNotNullParameter(iArr, "buffer");
        Bitmap b = C15247k0.m66138b(this);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26 && b.getConfig() == Bitmap.Config.HARDWARE) {
            b = b.copy(Bitmap.Config.ARGB_8888, false);
            z = true;
        }
        boolean z2 = z;
        b.getPixels(iArr, i5, i6, i, i2, i3, i4);
        if (z2) {
            b.recycle();
        }
    }

    /* renamed from: c */
    public void mo42786c() {
        this.f37535b.prepareToDraw();
    }

    /* renamed from: d */
    public boolean mo42787d() {
        return this.f37535b.hasAlpha();
    }

    @C12579k
    /* renamed from: e */
    public C15138c mo42788e() {
        if (Build.VERSION.SDK_INT < 26) {
            return C15144g.f37408a.mo42612x();
        }
        C15319t1 t1Var = C15319t1.f37700a;
        return C15319t1.m66553a(this.f37535b);
    }

    /* renamed from: f */
    public int mo42789f() {
        Bitmap.Config config = this.f37535b.getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "bitmap.config");
        return C15247k0.m66141e(config);
    }

    @C12579k
    /* renamed from: g */
    public final Bitmap mo42790g() {
        return this.f37535b;
    }

    public int getHeight() {
        return this.f37535b.getHeight();
    }

    public int getWidth() {
        return this.f37535b.getWidth();
    }
}
