package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(22)
/* renamed from: androidx.transition.k1 */
public class C20632k1 extends C20624i1 {

    /* renamed from: l */
    public static boolean f53220l = true;

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo61822f(@C0359n0 View view, int i, int i2, int i3, int i4) {
        if (f53220l) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f53220l = false;
            }
        }
    }
}
