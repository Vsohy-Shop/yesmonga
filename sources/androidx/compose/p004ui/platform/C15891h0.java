package androidx.compose.p004ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p004ui.graphics.C15112a3;
import androidx.compose.p004ui.graphics.C15256l0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.platform.h0 */
public final class C15891h0 implements C15885g0 {
    @C12579k

    /* renamed from: a */
    public final int[] f39586a = new int[2];
    @C12579k

    /* renamed from: b */
    public final float[] f39587b = C15112a3.m65154c((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public void mo45728a(@C12579k View view, @C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(fArr, "matrix");
        C15112a3.m65163m(fArr);
        mo45743d(view, fArr);
    }

    /* renamed from: b */
    public final void mo45741b(float[] fArr, Matrix matrix) {
        C15256l0.m66174b(this.f39587b, matrix);
        AndroidComposeView_androidKt.m70943h(fArr, this.f39587b);
    }

    /* renamed from: c */
    public final void mo45742c(float[] fArr, float f, float f2) {
        C15112a3.m65163m(this.f39587b);
        C15112a3.m65174x(this.f39587b, f, f2, 0.0f, 4, (Object) null);
        AndroidComposeView_androidKt.m70943h(fArr, this.f39587b);
    }

    /* renamed from: d */
    public final void mo45743d(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            mo45743d((View) parent, fArr);
            mo45742c(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            mo45742c(fArr, (float) view.getLeft(), (float) view.getTop());
        } else {
            int[] iArr = this.f39586a;
            view.getLocationInWindow(iArr);
            mo45742c(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            mo45742c(fArr, (float) iArr[0], (float) iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            Intrinsics.checkNotNullExpressionValue(matrix, "viewMatrix");
            mo45741b(fArr, matrix);
        }
    }
}
