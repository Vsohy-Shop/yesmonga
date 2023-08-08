package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;

@C0376v0(29)
/* renamed from: androidx.transition.n1 */
public class C20651n1 extends C20642m1 {
    /* renamed from: c */
    public float mo61686c(@C0359n0 View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: e */
    public void mo61809e(@C0359n0 View view, @C0363p0 Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: f */
    public void mo61822f(@C0359n0 View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: g */
    public void mo61688g(@C0359n0 View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: h */
    public void mo61851h(@C0359n0 View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: i */
    public void mo61810i(@C0359n0 View view, @C0359n0 Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: j */
    public void mo61811j(@C0359n0 View view, @C0359n0 Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
