package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(23)
/* renamed from: androidx.transition.m1 */
public class C20642m1 extends C20632k1 {

    /* renamed from: m */
    public static boolean f53244m = true;

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo61851h(@C0359n0 View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo61851h(view, i);
        } else if (f53244m) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f53244m = false;
            }
        }
    }
}
