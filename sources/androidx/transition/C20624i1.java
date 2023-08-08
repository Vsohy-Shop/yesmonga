package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;

@C0376v0(21)
/* renamed from: androidx.transition.i1 */
public class C20624i1 extends C20587f1 {

    /* renamed from: i */
    public static boolean f53202i = true;

    /* renamed from: j */
    public static boolean f53203j = true;

    /* renamed from: k */
    public static boolean f53204k = true;

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo61809e(@C0359n0 View view, @C0363p0 Matrix matrix) {
        if (f53202i) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f53202i = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo61810i(@C0359n0 View view, @C0359n0 Matrix matrix) {
        if (f53203j) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f53203j = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: j */
    public void mo61811j(@C0359n0 View view, @C0359n0 Matrix matrix) {
        if (f53204k) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f53204k = false;
            }
        }
    }
}
