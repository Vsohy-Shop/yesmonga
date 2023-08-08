package androidx.compose.p004ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.graphics.C15256l0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(29)
/* renamed from: androidx.compose.ui.platform.j0 */
public final class C15905j0 implements C15885g0 {
    @C12579k

    /* renamed from: a */
    public final Matrix f39603a = new Matrix();
    @C12579k

    /* renamed from: b */
    public final int[] f39604b = new int[2];

    @C0373u
    /* renamed from: a */
    public void mo45728a(@C12579k View view, @C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(fArr, "matrix");
        this.f39603a.reset();
        view.transformMatrixToGlobal(this.f39603a);
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            view = (View) viewParent;
            viewParent = view.getParent();
        }
        view.getLocationOnScreen(this.f39604b);
        int[] iArr = this.f39604b;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f39604b;
        this.f39603a.postTranslate((float) (iArr2[0] - i), (float) (iArr2[1] - i2));
        C15256l0.m66174b(fArr, this.f39603a);
    }
}
